package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes3.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47382a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47383b;

    public a2(java.lang.String libName, int i17) {
        kotlin.jvm.internal.o.g(libName, "libName");
        this.f47382a = libName;
        this.f47383b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.luggage.sdk.jsapi.component.service.a2)) {
            return false;
        }
        com.tencent.luggage.sdk.jsapi.component.service.a2 a2Var = (com.tencent.luggage.sdk.jsapi.component.service.a2) obj;
        return kotlin.jvm.internal.o.b(this.f47382a, a2Var.f47382a) && this.f47383b == a2Var.f47383b;
    }

    public int hashCode() {
        return (this.f47382a.hashCode() * 31) + java.lang.Integer.hashCode(this.f47383b);
    }

    public java.lang.String toString() {
        return "WAUDRLibInfoMeta(libName=" + this.f47382a + ", minimumVersion=" + this.f47383b + ')';
    }
}
