package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f198744a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f198745b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f198746c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f198747d;

    public l2(int i17, java.lang.String title, java.lang.String desc, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f198744a = i17;
        this.f198745b = title;
        this.f198746c = desc;
        this.f198747d = z17;
    }

    /* renamed from: equals */
    public boolean m57859xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l2) obj;
        return this.f198744a == l2Var.f198744a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198745b, l2Var.f198745b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198746c, l2Var.f198746c) && this.f198747d == l2Var.f198747d;
    }

    /* renamed from: hashCode */
    public int m57860x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f198744a) * 31) + this.f198745b.hashCode()) * 31) + this.f198746c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f198747d);
    }

    /* renamed from: toString */
    public java.lang.String m57861x9616526c() {
        return "SubVisibleInfo(subType=" + this.f198744a + ", title=" + this.f198745b + ", desc=" + this.f198746c + ", isOpen=" + this.f198747d + ')';
    }
}
