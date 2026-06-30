package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f187135a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f187136b;

    public j1(int i17, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f187135a = i17;
        this.f187136b = msg;
    }

    /* renamed from: equals */
    public boolean m55848xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j1) obj;
        return this.f187135a == j1Var.f187135a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187136b, j1Var.f187136b);
    }

    /* renamed from: hashCode */
    public int m55849x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f187135a) * 31) + this.f187136b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m55850x9616526c() {
        return "{code=" + this.f187135a + " msg=" + this.f187136b + '}';
    }
}
