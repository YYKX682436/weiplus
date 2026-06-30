package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f165590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f165591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f165592f;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.Runnable runnable, java.lang.Object obj) {
        this.f165592f = c11510xdd90c2f2;
        this.f165590d = runnable;
        this.f165591e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f165592f;
        nf.o.a(c11510xdd90c2f2.r0());
        boolean J0 = c11510xdd90c2f2.J0();
        java.lang.Runnable runnable = this.f165590d;
        if (!J0 || c11510xdd90c2f2.L0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = c11510xdd90c2f2.f156329e;
            if (hcVar == null) {
                c11510xdd90c2f2.d0();
            } else {
                hcVar.r(c11510xdd90c2f2);
            }
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar2 = c11510xdd90c2f2.f156329e;
        if (hcVar2 != null && hcVar2.n(c11510xdd90c2f2)) {
            c11510xdd90c2f2.f156329e.t(c11510xdd90c2f2, this.f165591e, runnable);
            return;
        }
        c11510xdd90c2f2.f0();
        if (runnable != null) {
            runnable.run();
        }
    }
}
