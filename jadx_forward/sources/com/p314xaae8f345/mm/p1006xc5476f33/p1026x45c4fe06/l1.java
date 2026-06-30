package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes5.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f165747a;

    /* renamed from: b, reason: collision with root package name */
    public final long f165748b;

    /* renamed from: c, reason: collision with root package name */
    public final int f165749c;

    public l1(long j17, long j18, int i17) {
        this.f165747a = j17;
        this.f165748b = j18;
        this.f165749c = i17;
    }

    /* renamed from: equals */
    public boolean m51606xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l1 l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l1) obj;
        return this.f165747a == l1Var.f165747a && this.f165748b == l1Var.f165748b && this.f165749c == l1Var.f165749c;
    }

    /* renamed from: hashCode */
    public int m51607x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f165747a) * 31) + java.lang.Long.hashCode(this.f165748b)) * 31) + java.lang.Integer.hashCode(this.f165749c);
    }

    /* renamed from: toString */
    public java.lang.String m51608x9616526c() {
        return "Result(responseTick=" + this.f165747a + ", cacheMilliseconds=" + this.f165748b + ", code=" + this.f165749c + ')';
    }
}
