package com.example.lab04;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab04.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}