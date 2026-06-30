package com.tencent.mm.plugin.appbrand.task.preload;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.plugin.appbrand.task.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89125a;

    public b(com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController appBrandBatchPreloadController, int i17) {
        this.f89125a = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.task.d0
    public void onReady() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.appbrand.service.w6 w6Var = com.tencent.mm.plugin.appbrand.service.x6.f88818f;
        g0Var.A(this.f89125a, 50);
        com.tencent.mars.xlog.Log.i("MicroMsg.Predownload.AppBrandBatchPreloadController", "preloadMiniProgramEnv success");
    }
}
