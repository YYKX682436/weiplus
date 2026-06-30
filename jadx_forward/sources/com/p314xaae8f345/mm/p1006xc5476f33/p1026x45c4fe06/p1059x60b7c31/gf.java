package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes5.dex */
public final class gf {

    /* renamed from: a, reason: collision with root package name */
    public int f162795a;

    /* renamed from: b, reason: collision with root package name */
    public long f162796b;

    public gf(int i17, long j17) {
        this.f162795a = i17;
        this.f162796b = j17;
    }

    /* renamed from: equals */
    public boolean m50999xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gf)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gf gfVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gf) obj;
        return this.f162795a == gfVar.f162795a && this.f162796b == gfVar.f162796b;
    }

    /* renamed from: hashCode */
    public int m51000x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f162795a) * 31) + java.lang.Long.hashCode(this.f162796b);
    }

    /* renamed from: toString */
    public java.lang.String m51001x9616526c() {
        return "InvokeData(count=" + this.f162795a + ", totalCost=" + this.f162796b + ')';
    }
}
