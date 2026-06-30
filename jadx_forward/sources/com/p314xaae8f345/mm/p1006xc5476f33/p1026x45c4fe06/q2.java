package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f169260d;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f169260d = c11510xdd90c2f2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        xi1.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f169260d;
        xi1.g mo48803xee5260a9 = c11510xdd90c2f2.mo48803xee5260a9();
        if (mo48803xee5260a9 == null) {
            return;
        }
        k91.r m07 = c11510xdd90c2f2.m0();
        if (m07 == null) {
            dVar = new xi1.d(c11510xdd90c2f2.u0().f158812e, null, 0);
        } else {
            try {
                i17 = ik1.w.l(m07.a().f387248d);
            } catch (java.lang.Exception unused) {
                i17 = -16777216;
            }
            dVar = new xi1.d(c11510xdd90c2f2.u0().f158812e, null, i17);
        }
        mo48803xee5260a9.mo48810x4820daa(dVar);
        l01.d0.f396294a.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p2(this, mo48803xee5260a9, dVar), c11510xdd90c2f2.u0().f158813f, l01.q0.f396320d);
    }
}
