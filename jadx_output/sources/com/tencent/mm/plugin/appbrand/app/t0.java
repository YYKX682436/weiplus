package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$RebootProcessAndTask f75280d;

    public t0(com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$RebootProcessAndTask appBrandProcessSuicideLogic$RebootProcessAndTask) {
        this.f75280d = appBrandProcessSuicideLogic$RebootProcessAndTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$RebootProcessAndTask appBrandProcessSuicideLogic$RebootProcessAndTask = this.f75280d;
        java.lang.String str = appBrandProcessSuicideLogic$RebootProcessAndTask.f74996i;
        if (str != null) {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, str, 1).show();
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC cfg = appBrandProcessSuicideLogic$RebootProcessAndTask.f74994g;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject stat = appBrandProcessSuicideLogic$RebootProcessAndTask.f74995h;
        kotlin.jvm.internal.o.g(cfg, "cfg");
        kotlin.jvm.internal.o.g(stat, "stat");
        com.tencent.mm.plugin.appbrand.task.a1 a1Var = new com.tencent.mm.plugin.appbrand.task.a1(cfg, stat, null);
        com.tencent.mm.plugin.appbrand.task.u0 C = com.tencent.mm.plugin.appbrand.task.u0.C();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.luggage.sdk.processes.r.y(C, context, a1Var, null, null, 12, null);
    }
}
