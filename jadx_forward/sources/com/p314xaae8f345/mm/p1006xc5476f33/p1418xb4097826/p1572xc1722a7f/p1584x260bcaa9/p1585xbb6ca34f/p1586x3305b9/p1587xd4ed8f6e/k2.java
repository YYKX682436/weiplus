package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f203286a;

    /* renamed from: b, reason: collision with root package name */
    public final int f203287b;

    /* renamed from: c, reason: collision with root package name */
    public final int f203288c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f203289d;

    public k2(boolean z17, int i17, int i18, boolean z18) {
        this.f203286a = z17;
        this.f203287b = i17;
        this.f203288c = i18;
        this.f203289d = z18;
    }

    /* renamed from: equals */
    public boolean m58422xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.k2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.k2) obj;
        return this.f203286a == k2Var.f203286a && this.f203287b == k2Var.f203287b && this.f203288c == k2Var.f203288c && this.f203289d == k2Var.f203289d;
    }

    /* renamed from: hashCode */
    public int m58423x8cdac1b() {
        return (((((java.lang.Boolean.hashCode(this.f203286a) * 31) + java.lang.Integer.hashCode(this.f203287b)) * 31) + java.lang.Integer.hashCode(this.f203288c)) * 31) + java.lang.Boolean.hashCode(this.f203289d);
    }

    /* renamed from: toString */
    public java.lang.String m58424x9616526c() {
        return "RequestAndRefreshLiveInfo(isSuccess=" + this.f203286a + ", interval=" + this.f203287b + ", participantCount=" + this.f203288c + ", isLiving=" + this.f203289d + ')';
    }
}
