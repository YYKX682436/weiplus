package com.google.gson;

/* loaded from: classes16.dex */
public enum a extends com.google.gson.g {
    public a(java.lang.String str, int i17) {
        super(str, i17, null);
    }

    @Override // com.google.gson.h
    public java.lang.String a(java.lang.reflect.Field field) {
        return field.getName();
    }
}
