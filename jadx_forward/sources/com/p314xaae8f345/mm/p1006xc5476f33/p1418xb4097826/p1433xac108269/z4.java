package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f184281a;

    /* renamed from: b, reason: collision with root package name */
    public final long f184282b;

    public z4(long j17, long j18) {
        this.f184281a = j17;
        this.f184282b = j18;
    }

    /* renamed from: equals */
    public boolean m55581xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z4 z4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z4) obj;
        return this.f184281a == z4Var.f184281a && this.f184282b == z4Var.f184282b;
    }

    /* renamed from: hashCode */
    public int m55582x8cdac1b() {
        return (java.lang.Long.hashCode(this.f184281a) * 31) + java.lang.Long.hashCode(this.f184282b);
    }

    /* renamed from: toString */
    public java.lang.String m55583x9616526c() {
        return "ObjectStatusReqState(lastReqTime=" + this.f184281a + ", waitTime=" + this.f184282b + ')';
    }
}
