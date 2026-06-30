package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes5.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f172035a;

    /* renamed from: b, reason: collision with root package name */
    public final int f172036b;

    public l3(int i17, int i18) {
        this.f172035a = i17;
        this.f172036b = i18;
    }

    /* renamed from: equals */
    public boolean m53126xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.l3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.l3 l3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.l3) obj;
        return this.f172035a == l3Var.f172035a && this.f172036b == l3Var.f172036b;
    }

    /* renamed from: hashCode */
    public int m53127x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f172035a) * 31) + java.lang.Integer.hashCode(this.f172036b);
    }

    /* renamed from: toString */
    public java.lang.String m53128x9616526c() {
        return "Size(width=" + this.f172035a + ", height=" + this.f172036b + ')';
    }
}
