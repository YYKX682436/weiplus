package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public long f257311a;

    /* renamed from: b, reason: collision with root package name */
    public long f257312b;

    public w0(long j17, long j18) {
        this.f257311a = j17;
        this.f257312b = j18;
    }

    /* renamed from: equals */
    public boolean m72513xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w0 w0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w0) obj;
        return this.f257311a == w0Var.f257311a && this.f257312b == w0Var.f257312b;
    }

    /* renamed from: hashCode */
    public int m72514x8cdac1b() {
        return (java.lang.Long.hashCode(this.f257311a) * 31) + java.lang.Long.hashCode(this.f257312b);
    }

    /* renamed from: toString */
    public java.lang.String m72515x9616526c() {
        return "PlayRange(start=" + this.f257311a + ", end=" + this.f257312b + ')';
    }
}
