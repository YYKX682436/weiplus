package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f183424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f183425b;

    public i1(java.lang.String title, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f183424a = title;
        this.f183425b = i17;
    }

    /* renamed from: equals */
    public boolean m55432xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.i1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.i1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183424a, i1Var.f183424a) && this.f183425b == i1Var.f183425b;
    }

    /* renamed from: hashCode */
    public int m55433x8cdac1b() {
        return (this.f183424a.hashCode() * 31) + java.lang.Integer.hashCode(this.f183425b);
    }

    /* renamed from: toString */
    public java.lang.String m55434x9616526c() {
        return "MediaTabInfo(title=" + this.f183424a + ", mediaType=" + this.f183425b + ')';
    }
}
