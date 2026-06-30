package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class q8 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r8 f169269d;

    public q8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r8 r8Var) {
        this.f169269d = r8Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.SUSPEND == bVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r8 r8Var = this.f169269d;
            r8Var.f169292b.f167709k2.f517096b.f517093a.clear();
            i81.e a17 = i81.a0.a(r8Var.f169292b.A2.f371058b);
            if (a17 != null && a17.f371112w) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                a17.f371111v = currentTimeMillis;
                a17.f371114y = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "resetAdHotStartBaseTime when onSuspend, reset time: %s", java.lang.Long.valueOf(currentTimeMillis));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t0.c(str, 4);
        }
    }
}
