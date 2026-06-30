package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class q5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.r5 f87733d;

    public q5(com.tencent.mm.plugin.appbrand.r5 r5Var) {
        this.f87733d = r5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.r5 r5Var = this.f87733d;
        r5Var.f87752d.run();
        if (r5Var.f87755g.getActiveRuntime() == null || com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.isGame(r5Var.f87755g.getActiveRuntime())) {
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = r5Var.f87755g;
        android.util.SparseIntArray sparseIntArray = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C;
        if (appBrandRuntimeContainerWC.f87645d instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI) {
            db5.f.c(appBrandRuntimeContainerWC.w(), null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "reset convertActivityToTranslucent");
        }
    }
}
