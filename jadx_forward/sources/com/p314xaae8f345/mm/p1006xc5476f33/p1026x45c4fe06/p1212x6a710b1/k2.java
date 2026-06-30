package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes13.dex */
public class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f172025a;

    /* renamed from: b, reason: collision with root package name */
    public long f172026b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j2 f172027c;

    public k2(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j2 j2Var) {
        this.f172025a = j17;
        this.f172027c = j2Var;
    }

    public boolean a(java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j2 j2Var;
        if ((java.lang.System.currentTimeMillis() - this.f172026b < this.f172025a) || (j2Var = this.f172027c) == null) {
            return false;
        }
        boolean mo51264x3a2454f5 = j2Var.mo51264x3a2454f5(objArr);
        if (mo51264x3a2454f5) {
            this.f172026b = java.lang.System.currentTimeMillis();
        }
        return mo51264x3a2454f5;
    }
}
