package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class za {

    /* renamed from: a, reason: collision with root package name */
    public final int f196848a;

    /* renamed from: b, reason: collision with root package name */
    public final int f196849b;

    /* renamed from: c, reason: collision with root package name */
    public final int f196850c;

    /* renamed from: d, reason: collision with root package name */
    public final int f196851d;

    public za(int i17, int i18, int i19, int i27) {
        this.f196848a = i17;
        this.f196849b = i18;
        this.f196850c = i19;
        this.f196851d = i27;
    }

    /* renamed from: equals */
    public boolean m57129xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.za)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.za zaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.za) obj;
        return this.f196848a == zaVar.f196848a && this.f196849b == zaVar.f196849b && this.f196850c == zaVar.f196850c && this.f196851d == zaVar.f196851d;
    }

    /* renamed from: hashCode */
    public int m57130x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f196848a) * 31) + java.lang.Integer.hashCode(this.f196849b)) * 31) + java.lang.Integer.hashCode(this.f196850c)) * 31) + java.lang.Integer.hashCode(this.f196851d);
    }

    /* renamed from: toString */
    public java.lang.String m57131x9616526c() {
        return "AnchorLocationSize(posX=" + this.f196848a + ", posY=" + this.f196849b + ", width=" + this.f196850c + ", height=" + this.f196851d + ')';
    }
}
