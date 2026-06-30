package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class l0 implements com.tencent.mm.plugin.appbrand.launching.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f84732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f84733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f84734c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f84735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f84736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84737f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask f84738g;

    public l0(com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask appBrandPreInitTask, boolean[] zArr, long j17, int i17, java.lang.String[] strArr, java.lang.Runnable runnable, java.lang.String str) {
        this.f84738g = appBrandPreInitTask;
        this.f84732a = zArr;
        this.f84733b = j17;
        this.f84734c = i17;
        this.f84735d = strArr;
        this.f84736e = runnable;
        this.f84737f = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.a1
    public boolean a(java.lang.String[] strArr) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            iz5.a.a(2, this.f84734c);
        }
        boolean[] zArr = this.f84732a;
        boolean z17 = zArr[0];
        java.lang.String[] strArr2 = this.f84735d;
        if (z17) {
            strArr[0] = strArr2[0];
        } else {
            java.lang.String str2 = strArr2[0];
            zArr[0] = true;
            this.f84736e.run();
            strArr[0] = strArr2[0];
            this.f84738g.f84368m.Z = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreInitTask", "runInAccountScope for %s, resetInstance %s -> %s", this.f84737f, str2, strArr2[0]);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.p0
    /* renamed from: c */
    public void b(final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, int i17) {
        com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask appBrandPreInitTask = this.f84738g;
        appBrandPreInitTask.f84372q = appBrandInitConfigWC;
        appBrandPreInitTask.f84368m.f84910o = appBrandStatObject;
        if (appBrandInitConfigWC == null) {
            appBrandPreInitTask.c();
            return;
        }
        final boolean[] zArr = this.f84732a;
        boolean z17 = false;
        if (zArr[0]) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            appBrandInitConfigWC.T1 = this.f84733b;
            appBrandInitConfigWC.U1 = currentTimeMillis;
        }
        appBrandPreInitTask.f84368m.b(appBrandInitConfigWC);
        com.tencent.mm.plugin.appbrand.launching.od.c(appBrandInitConfigWC, appBrandPreInitTask.f84368m);
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = appBrandPreInitTask.f84368m;
        appBrandInitConfigWC.S = launchParcel.f84918u;
        appBrandInitConfigWC.V = launchParcel.f84920w;
        com.tencent.mm.plugin.appbrand.launching.g0.a(appBrandInitConfigWC, appBrandStatObject);
        if (!com.tencent.mm.plugin.appbrand.launching.teenmode.m.a(appBrandInitConfigWC, java.lang.Integer.valueOf(appBrandStatObject != null ? appBrandStatObject.f87790f : -1), appBrandInitConfigWC.f47278x, appBrandInitConfigWC.f77281g)) {
            java.lang.String appId = appBrandInitConfigWC.f77278d;
            kotlin.jvm.internal.o.g(appId, "appId");
            if (!((uh4.c0) i95.n0.c(uh4.c0.class)).kf(1, "weapp_" + appId)) {
                z17 = true;
            }
        }
        appBrandPreInitTask.f84373r = z17;
        if (appBrandPreInitTask.f84373r) {
            com.tencent.mm.plugin.appbrand.launching.teenmode.k.d(appBrandInitConfigWC.f47278x);
            appBrandPreInitTask.c();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.l0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.launching.l0 l0Var = com.tencent.mm.plugin.appbrand.launching.l0.this;
                l0Var.getClass();
                boolean z19 = zArr[0];
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC2 = appBrandInitConfigWC;
                appBrandInitConfigWC2.f77296i2 = !z19;
                com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask appBrandPreInitTask2 = l0Var.f84738g;
                if (z19 && com.tencent.mm.plugin.appbrand.launching.x2.j(appBrandInitConfigWC2.f47277w) == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreInitTask", "[applaunch] init AppLaunchPrepareProcess boost instance, appId:%s, versionType:%d", appBrandInitConfigWC2.f77278d, java.lang.Integer.valueOf(appBrandInitConfigWC2.f77281g));
                    java.lang.String str = appBrandPreInitTask2.f84367i;
                    com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject2 = appBrandStatObject;
                    java.util.Objects.requireNonNull(appBrandStatObject2);
                    new com.tencent.mm.plugin.appbrand.launching.x2(str, appBrandInitConfigWC2, appBrandStatObject2).m();
                    com.tencent.mm.plugin.appbrand.c6.c(21, appBrandInitConfigWC2.f77278d, appBrandInitConfigWC2.L, appBrandInitConfigWC2.f77281g, appBrandInitConfigWC2.k());
                }
                appBrandPreInitTask2.c();
            }
        };
        if (com.tencent.mm.plugin.appbrand.launching.precondition.p.f85017a.a(appBrandInitConfigWC.f77278d, appBrandInitConfigWC.L1.c(), appBrandInitConfigWC.f77292e2)) {
            com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.V6(com.tencent.mm.sdk.platformtools.x2.f193071a, appBrandPreInitTask.f84366h, new com.tencent.mm.plugin.appbrand.launching.m0(this, runnable));
        } else {
            runnable.run();
        }
    }
}
