package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class q8 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.r8 f87736d;

    public q8(com.tencent.mm.plugin.appbrand.r8 r8Var) {
        this.f87736d = r8Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.SUSPEND == bVar) {
            com.tencent.mm.plugin.appbrand.r8 r8Var = this.f87736d;
            r8Var.f87759b.f86176k2.f435563b.f435560a.clear();
            i81.e a17 = i81.a0.a(r8Var.f87759b.A2.f289525b);
            if (a17 != null && a17.f289579w) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                a17.f289578v = currentTimeMillis;
                a17.f289581y = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "resetAdHotStartBaseTime when onSuspend, reset time: %s", java.lang.Long.valueOf(currentTimeMillis));
            }
            com.tencent.mm.plugin.appbrand.report.quality.t0.c(str, 4);
        }
    }
}
