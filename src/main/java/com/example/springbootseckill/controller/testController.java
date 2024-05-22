package com.example.springbootseckill.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class testController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "Welcome to Spring Boot Seckill";
    }
}
