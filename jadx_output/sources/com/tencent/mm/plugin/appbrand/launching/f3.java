package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class f3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.QualitySession f84607e;

    public f3(java.lang.String str, com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession) {
        this.f84606d = str;
        this.f84607e = qualitySession;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.appbrand.task.e eVar;
        af.d dVar = af.d.f4444a;
        java.lang.String instanceId = this.f84606d;
        af.c b17 = dVar.b(instanceId, false);
        if (b17 instanceof ug1.c) {
            ((ug1.c) b17).b(this.f84607e);
        }
        dVar.a(instanceId);
        com.tencent.mm.plugin.appbrand.launching.u uVar = com.tencent.mm.plugin.appbrand.launching.u.f85203a;
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        com.tencent.mm.plugin.appbrand.launching.s sVar = new com.tencent.mm.plugin.appbrand.launching.s(instanceId);
        ik1.j jVar = com.tencent.mm.plugin.appbrand.launching.u.f85204b;
        jVar.d(sVar);
        com.tencent.mm.plugin.appbrand.launching.t tVar = new com.tencent.mm.plugin.appbrand.launching.t(instanceId);
        ik1.j jVar2 = com.tencent.mm.plugin.appbrand.launching.u.f85205c;
        jVar2.d(tVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCgiPrefetchBeforeLaunch", "releaseByInstanceId: single tasks remaining size = " + jVar.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCgiPrefetchBeforeLaunch", "releaseByInstanceId: batch tasks remaining size = " + jVar2.size());
        com.tencent.mm.plugin.appbrand.launching.x2 k17 = com.tencent.mm.plugin.appbrand.launching.x2.k(instanceId, true);
        java.util.concurrent.CountDownLatch countDownLatch = (java.util.concurrent.CountDownLatch) ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.appbrand.launching.tb.F).get(instanceId);
        if (countDownLatch != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "killByInstanceId instance:" + instanceId);
            countDownLatch.countDown();
        }
        if (k17 != null) {
            java.lang.String str = k17.f85375r;
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = k17.C;
            com.tencent.mm.plugin.appbrand.c6.b(23, str, wxaAttributes$WxaVersionInfo == null ? 0 : wxaAttributes$WxaVersionInfo.f77444d, k17.f85376s, k17.D);
        }
        if (com.tencent.mm.plugin.appbrand.task.u0.C().d(instanceId) == null && (eVar = (com.tencent.mm.plugin.appbrand.task.e) i95.n0.c(com.tencent.mm.plugin.appbrand.task.e.class)) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "AutoReleaseTimer timeout, remove LaunchParcel in AppBrandLaunchParcelStoreService for instanceId:%s", instanceId);
            eVar.getClass();
            com.tencent.mm.plugin.appbrand.task.e.Bi(eVar, instanceId, null, 2, null);
        }
        return false;
    }
}
