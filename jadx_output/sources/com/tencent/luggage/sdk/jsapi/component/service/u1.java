package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47552a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47553b;

    public u1(java.lang.String libName, int i17) {
        kotlin.jvm.internal.o.g(libName, "libName");
        this.f47552a = libName;
        this.f47553b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.luggage.sdk.jsapi.component.service.u1)) {
            return false;
        }
        com.tencent.luggage.sdk.jsapi.component.service.u1 u1Var = (com.tencent.luggage.sdk.jsapi.component.service.u1) obj;
        return kotlin.jvm.internal.o.b(this.f47552a, u1Var.f47552a) && this.f47553b == u1Var.f47553b;
    }

    public int hashCode() {
        return (this.f47552a.hashCode() * 31) + java.lang.Integer.hashCode(this.f47553b);
    }

    public java.lang.String toString() {
        return "NativeLibMeta(libName=" + this.f47552a + ", minimumVersion=" + this.f47553b + ')';
    }
}
