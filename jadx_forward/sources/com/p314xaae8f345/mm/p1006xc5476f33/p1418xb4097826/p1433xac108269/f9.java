package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class f9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f183706a;

    /* renamed from: b, reason: collision with root package name */
    public int f183707b;

    /* renamed from: c, reason: collision with root package name */
    public int f183708c;

    public f9(long j17, int i17, int i18) {
        this.f183706a = j17;
        this.f183707b = i17;
        this.f183708c = i18;
    }

    /* renamed from: equals */
    public boolean m55477xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f9)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f9 f9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f9) obj;
        return this.f183706a == f9Var.f183706a && this.f183707b == f9Var.f183707b && this.f183708c == f9Var.f183708c;
    }

    /* renamed from: hashCode */
    public int m55478x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f183706a) * 31) + java.lang.Integer.hashCode(this.f183707b)) * 31) + java.lang.Integer.hashCode(this.f183708c);
    }

    /* renamed from: toString */
    public java.lang.String m55479x9616526c() {
        return "PlayTimeCostRecord(clickTime=" + this.f183706a + ", clickToPlayTimeCost=" + this.f183707b + ", selectToPlayTimeCost=" + this.f183708c + ')';
    }
}
