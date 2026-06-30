package com.google.gson.internal;

/* loaded from: classes15.dex */
public final class b implements java.lang.reflect.GenericArrayType, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Type f44701d;

    public b(java.lang.reflect.Type type) {
        this.f44701d = com.google.gson.internal.e.a(type);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof java.lang.reflect.GenericArrayType) && com.google.gson.internal.e.c(this, (java.lang.reflect.GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public java.lang.reflect.Type getGenericComponentType() {
        return this.f44701d;
    }

    public int hashCode() {
        return this.f44701d.hashCode();
    }

    public java.lang.String toString() {
        return com.google.gson.internal.e.h(this.f44701d) + "[]";
    }
}
