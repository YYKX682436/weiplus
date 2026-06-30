package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f197180a;

    /* renamed from: b, reason: collision with root package name */
    public final int f197181b;

    public p2(java.lang.String comboId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comboId, "comboId");
        this.f197180a = comboId;
        this.f197181b = i17;
    }

    /* renamed from: equals */
    public boolean m57207xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.p2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.p2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f197180a, p2Var.f197180a) && this.f197181b == p2Var.f197181b;
    }

    /* renamed from: hashCode */
    public int m57208x8cdac1b() {
        return (this.f197180a.hashCode() * 31) + java.lang.Integer.hashCode(this.f197181b);
    }

    /* renamed from: toString */
    public java.lang.String m57209x9616526c() {
        return "ClickObject(comboId=" + this.f197180a + ", cnt=" + this.f197181b + ')';
    }
}
