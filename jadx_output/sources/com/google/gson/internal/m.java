package com.google.gson.internal;

/* loaded from: classes16.dex */
public class m implements com.google.gson.internal.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Type f44820a;

    public m(com.google.gson.internal.r rVar, java.lang.reflect.Type type) {
        this.f44820a = type;
    }

    @Override // com.google.gson.internal.d0
    public java.lang.Object a() {
        java.lang.reflect.Type type = this.f44820a;
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            throw new com.google.gson.m("Invalid EnumSet type: " + type.toString());
        }
        java.lang.reflect.Type type2 = ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof java.lang.Class) {
            return java.util.EnumSet.noneOf((java.lang.Class) type2);
        }
        throw new com.google.gson.m("Invalid EnumSet type: " + type.toString());
    }
}
