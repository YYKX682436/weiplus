package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f173871a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f173872b;

    public x0(int i17, java.lang.String apiName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        this.f173871a = i17;
        this.f173872b = apiName;
    }

    /* renamed from: equals */
    public boolean m53785xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x0) obj;
        return this.f173871a == x0Var.f173871a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f173872b, x0Var.f173872b);
    }

    /* renamed from: hashCode */
    public int m53786x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f173871a) * 31) + this.f173872b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m53787x9616526c() {
        return this.f173872b;
    }
}
