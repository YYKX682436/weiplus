package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class r5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f169285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f169286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f169287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb f169288g;

    public r5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb, java.lang.Runnable runnable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22) {
        this.f169288g = c11529x5d7a34bb;
        this.f169285d = runnable;
        this.f169286e = c11510xdd90c2f2;
        this.f169287f = c11510xdd90c2f22;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.q5 q5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.q5(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb = this.f169288g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f169286e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = this.f169287f;
        android.util.SparseIntArray sparseIntArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb.C;
        c11529x5d7a34bb.getClass();
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = c11510xdd90c2f2 == null ? "null" : c11510xdd90c2f2.f156336n;
        objArr[1] = c11510xdd90c2f22.f156336n;
        objArr[2] = java.lang.Boolean.valueOf(c11510xdd90c2f22.S);
        objArr[3] = java.lang.Boolean.valueOf(c11510xdd90c2f22.R());
        objArr[4] = java.lang.Boolean.valueOf(c11529x5d7a34bb.f156377w);
        objArr[5] = java.lang.Integer.valueOf(c11529x5d7a34bb.mo48806x666b03f3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "onRuntimeClose entered, in.appId[%s], out.appId[%s], out.isFinishing[%b], out.canDoCloseAnimation[%b], mIsActivityPaused[%b], stackSize[%d]", objArr);
        ze.k kVar = new ze.k(c11529x5d7a34bb, c11510xdd90c2f2, c11510xdd90c2f22, q5Var);
        if (c11529x5d7a34bb.f156377w) {
            c11510xdd90c2f22.f156350x1 = false;
        }
        if (!c11510xdd90c2f22.S) {
            if (c11529x5d7a34bb.mo48806x666b03f3() <= 1) {
                if (!(c11529x5d7a34bb.A > 0)) {
                    c11529x5d7a34bb.c0(true);
                    return;
                }
            }
            if (c11510xdd90c2f22.R()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd.class))).l(c11510xdd90c2f2, null, c11510xdd90c2f22, kVar);
                return;
            } else {
                kVar.run();
                return;
            }
        }
        if (!c11529x5d7a34bb.n(c11510xdd90c2f22)) {
            kVar.run();
            return;
        }
        if (c11529x5d7a34bb.mo48806x666b03f3() <= 1) {
            if (!(c11529x5d7a34bb.A > 0)) {
                c11529x5d7a34bb.c0(false);
                return;
            }
        }
        if (c11510xdd90c2f22.R()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd.class))).l(c11510xdd90c2f2, null, c11510xdd90c2f22, kVar);
        } else {
            kVar.run();
        }
    }
}
