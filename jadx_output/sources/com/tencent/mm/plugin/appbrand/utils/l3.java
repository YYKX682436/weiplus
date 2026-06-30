package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes5.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f90502a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90503b;

    public l3(int i17, int i18) {
        this.f90502a = i17;
        this.f90503b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.utils.l3)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.utils.l3 l3Var = (com.tencent.mm.plugin.appbrand.utils.l3) obj;
        return this.f90502a == l3Var.f90502a && this.f90503b == l3Var.f90503b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f90502a) * 31) + java.lang.Integer.hashCode(this.f90503b);
    }

    public java.lang.String toString() {
        return "Size(width=" + this.f90502a + ", height=" + this.f90503b + ')';
    }
}
