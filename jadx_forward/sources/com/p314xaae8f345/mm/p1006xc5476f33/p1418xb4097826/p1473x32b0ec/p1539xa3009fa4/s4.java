package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class s4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f198925a;

    /* renamed from: b, reason: collision with root package name */
    public final int f198926b;

    public s4(boolean z17, int i17) {
        this.f198925a = z17;
        this.f198926b = i17;
    }

    /* renamed from: equals */
    public boolean m57870xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s4 s4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s4) obj;
        return this.f198925a == s4Var.f198925a && this.f198926b == s4Var.f198926b;
    }

    /* renamed from: hashCode */
    public int m57871x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f198925a) * 31) + java.lang.Integer.hashCode(this.f198926b);
    }

    /* renamed from: toString */
    public java.lang.String m57872x9616526c() {
        return "KeyboardChangedInfo(show=" + this.f198925a + ", height=" + this.f198926b + ')';
    }
}
