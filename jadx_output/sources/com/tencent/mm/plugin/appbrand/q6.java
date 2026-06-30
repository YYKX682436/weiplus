package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f87734d;

    public q6(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f87734d = o6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean z17;
        rh1.j jVar = this.f87734d.f86194z2;
        com.tencent.mm.plugin.appbrand.w0 w0Var = com.tencent.mm.plugin.appbrand.w0.CLOSE;
        com.tencent.mm.plugin.appbrand.w0 w0Var2 = com.tencent.mm.plugin.appbrand.w0.BACK;
        boolean z18 = true;
        boolean z19 = false;
        if (jVar != null) {
            if (jVar.f395635b == null) {
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiTaskLogic", "close, runtime:%s", jVar.f395635b.f74803n);
                com.tencent.mm.plugin.appbrand.page.d5 x07 = jVar.f395635b.x0();
                if (!rh1.b.f395624a || x07 == null || x07.getCurrentPage() == null || !x07.getCurrentPage().R) {
                    com.tencent.mm.plugin.appbrand.w0 d17 = com.tencent.mm.plugin.appbrand.x0.d(jVar.f395635b.f74803n);
                    i17 = d17 == w0Var2 ? 2 : d17 == w0Var ? 1 : 0;
                } else {
                    i17 = 3;
                }
                z17 = jVar.f395636c != null && jVar.f395636c.U(i17, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiTaskLogic", "close, result:%s", java.lang.Boolean.valueOf(z17));
            }
            if (z17) {
                return;
            }
        }
        com.tencent.mm.plugin.appbrand.floatball.u uVar = this.f87734d.f86193y2;
        if (uVar != null) {
            uVar.c(null);
            com.tencent.mm.plugin.appbrand.o6 o6Var = uVar.f78147a;
            if (uVar.f78158l) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "close, runtime:%s", o6Var.f74803n);
                com.tencent.mm.plugin.appbrand.w0 d18 = com.tencent.mm.plugin.appbrand.x0.d(o6Var.f74803n);
                int i18 = d18 != w0Var2 ? d18 == w0Var ? 1 : 0 : 2;
                boolean z27 = uVar.f78152f != null && uVar.f78152f.w0();
                if (uVar.f78153g != null) {
                    com.tencent.mm.plugin.appbrand.floatball.t1 t1Var = uVar.f78153g;
                    t1Var.getClass();
                    if (t1Var.u() && !com.tencent.mm.sdk.platformtools.o4.L().i("has_shown_appbrand_voip_1v1_tip", false)) {
                        z19 = true;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "close, voip:%s, voip1v1:%s", java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z19));
                if (z27) {
                    uVar.f78152f.x0(o6Var.r0(), new com.tencent.mm.plugin.appbrand.floatball.c0(uVar, i18));
                } else if (z19) {
                    uVar.f78153g.w0(o6Var.r0(), new com.tencent.mm.plugin.appbrand.floatball.d0(uVar, i18));
                } else {
                    z18 = uVar.a(i18);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "close, result:%s", java.lang.Boolean.valueOf(z18));
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandFloatBallLogic", "close, not init, runtime:%s, stack:%s", o6Var.f74803n, android.util.Log.getStackTraceString(new java.lang.Throwable()));
                z18 = false;
            }
            if (z18) {
                return;
            }
        }
        this.f87734d.G2();
    }
}
