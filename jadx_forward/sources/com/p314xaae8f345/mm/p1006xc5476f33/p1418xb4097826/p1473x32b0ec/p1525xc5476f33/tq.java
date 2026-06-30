package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class tq {

    /* renamed from: a, reason: collision with root package name */
    public final r45.xn1 f196002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f196003b;

    /* renamed from: c, reason: collision with root package name */
    public final int f196004c;

    public tq(r45.xn1 contact, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        this.f196002a = contact;
        this.f196003b = i17;
        this.f196004c = i18;
    }

    /* renamed from: equals */
    public boolean m57049xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tq)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tq tqVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tq) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f196002a, tqVar.f196002a) && this.f196003b == tqVar.f196003b && this.f196004c == tqVar.f196004c;
    }

    /* renamed from: hashCode */
    public int m57050x8cdac1b() {
        return (((this.f196002a.hashCode() * 31) + java.lang.Integer.hashCode(this.f196003b)) * 31) + java.lang.Integer.hashCode(this.f196004c);
    }

    /* renamed from: toString */
    public java.lang.String m57051x9616526c() {
        return "AtWxContact(contact=" + this.f196002a + ", preIndex=" + this.f196003b + ", suffixIndex=" + this.f196004c + ')';
    }
}
