package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f184072a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f184073b;

    public s8(int i17, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f184072a = i17;
        this.f184073b = name;
    }

    public final java.lang.String a() {
        return this.f184073b;
    }

    /* renamed from: equals */
    public boolean m55552xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s8)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s8 s8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s8) obj;
        return this.f184072a == s8Var.f184072a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f184073b, s8Var.f184073b);
    }

    /* renamed from: hashCode */
    public int m55553x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f184072a) * 31) + this.f184073b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m55554x9616526c() {
        return "LiveStage(id=" + this.f184072a + ", name=" + this.f184073b + ')';
    }
}
