package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public class f implements com.tencent.mm.plugin.appbrand.launching.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f84978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f84979b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.e f84980c;

    public f(com.tencent.mm.plugin.appbrand.launching.precondition.e eVar, long j17, long j18) {
        this.f84980c = eVar;
        this.f84978a = j17;
        this.f84979b = j18;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.a1
    public boolean a(java.lang.String[] strArr) {
        com.tencent.mm.plugin.appbrand.task.u0 C = com.tencent.mm.plugin.appbrand.task.u0.C();
        com.tencent.mm.plugin.appbrand.launching.precondition.e eVar = this.f84980c;
        com.tencent.luggage.sdk.processes.s d17 = C.d(eVar.f84956e);
        if (d17 == null) {
            strArr[0] = eVar.f84956e;
            return true;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            iz5.a.a(2, d17.f47685b);
        }
        strArr[0] = com.tencent.mm.plugin.appbrand.report.quality.u.f(eVar.f84955d, d17.f47684a, true);
        com.tencent.mm.plugin.appbrand.task.u0.C().s(d17.f47684a, d17.f47685b);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.p0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Boolean.valueOf(appBrandInitConfigWC != null);
        com.tencent.mm.plugin.appbrand.launching.precondition.e eVar = this.f84980c;
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = eVar.f84955d;
        objArr[1] = launchParcel.f84901d;
        objArr[2] = launchParcel.f84902e;
        objArr[3] = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[4] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f84978a);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "AppBrandPreLaunchProcessWC.onResult, config?:%b, username:%s, appId:%s, result:%d, cost:%d", objArr);
        com.tencent.mm.plugin.appbrand.launching.precondition.a aVar = eVar.f84957f;
        if (aVar.g()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel2 = eVar.f84955d;
        if (appBrandInitConfigWC == null) {
            java.lang.String str = launchParcel2.f84902e;
            java.lang.String str2 = launchParcel2.f84906i;
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject2 = launchParcel2.f84910o;
            if (appBrandStatObject2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandStatObject2.f87794m)) {
                com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.k0.b(4, str, str2, appBrandStatObject2.f87794m, 0L);
            }
            aVar.e(null, null);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        appBrandInitConfigWC.T1 = this.f84979b;
        appBrandInitConfigWC.U1 = currentTimeMillis;
        launchParcel2.b(appBrandInitConfigWC);
        com.tencent.mm.plugin.appbrand.launching.od.c(appBrandInitConfigWC, launchParcel2);
        appBrandInitConfigWC.S = launchParcel2.f84918u;
        appBrandInitConfigWC.V = launchParcel2.f84920w;
        appBrandInitConfigWC.f77303p2 = launchParcel2.G;
        appBrandInitConfigWC.f77311x2 = launchParcel2.N;
        com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional = launchParcel2.f84914q;
        appBrandInitConfigWC.N1 = launchParamsOptional != null ? launchParamsOptional.f70419h : 0;
        appBrandInitConfigWC.H = launchParamsOptional == null ? "" : launchParamsOptional.f70421m;
        com.tencent.mm.plugin.appbrand.launching.precondition.g gVar = new com.tencent.mm.plugin.appbrand.launching.precondition.g(this, appBrandInitConfigWC);
        if (com.tencent.mm.sdk.platformtools.f9.GlobalAppbrand.l(aVar.f(), new com.tencent.mm.plugin.appbrand.launching.precondition.h(this))) {
            final com.tencent.mm.plugin.appbrand.launching.precondition.i iVar = new com.tencent.mm.plugin.appbrand.launching.precondition.i(this, appBrandInitConfigWC, gVar);
            if (com.tencent.mm.plugin.appbrand.launching.precondition.p.f85017a.a(appBrandInitConfigWC.f77278d, appBrandInitConfigWC.L1.c(), appBrandInitConfigWC.f77292e2)) {
                aVar.j(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.f$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.appbrand.launching.precondition.f fVar = com.tencent.mm.plugin.appbrand.launching.precondition.f.this;
                        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.V6(fVar.f84980c.f84957f.getBaseContext(), null, new com.tencent.mm.plugin.appbrand.launching.precondition.j(fVar, iVar));
                    }
                }, true);
                return;
            }
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject3 = launchParcel2.f84910o;
            if (!com.tencent.mm.plugin.appbrand.launching.teenmode.m.a(appBrandInitConfigWC, java.lang.Integer.valueOf(appBrandStatObject3 != null ? appBrandStatObject3.f87790f : -1), launchParcel2.f84901d, launchParcel2.f84904g)) {
                java.lang.String appId = appBrandInitConfigWC.f77278d;
                kotlin.jvm.internal.o.g(appId, "appId");
                if (!((uh4.c0) i95.n0.c(uh4.c0.class)).kf(1, "weapp_".concat(appId))) {
                    aVar.j(new com.tencent.mm.plugin.appbrand.launching.precondition.m(this, appBrandInitConfigWC, iVar), true);
                    return;
                }
            }
            iVar.run();
        }
    }
}
