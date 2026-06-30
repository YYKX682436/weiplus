package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final /* synthetic */ class n6$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.n6 f86031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f86032e;

    public /* synthetic */ n6$$a(com.tencent.mm.plugin.appbrand.n6 n6Var, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f86031d = n6Var;
        this.f86032e = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final com.tencent.mm.plugin.appbrand.n6 n6Var = this.f86031d;
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f86032e;
        n6Var.getClass();
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_wxaapp_restart_on_notify_lowest_version, 1) == 1;
        boolean z18 = o6Var.u0().f47268a2 != null && com.tencent.mm.plugin.appbrand.n6.f86026e.equals(o6Var.u0().f47268a2.f85128e);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeUpdateRunnerForAttrAsyncUpdated", "notify exptOpen:%b, isRestartedBySameReason:%b, appId:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), o6Var.f74803n);
        if (z17 && !z18 && com.tencent.mm.plugin.appbrand.appcache.g0.b(o6Var.f74805p.f77281g)) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.n6$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.o6 o6Var2 = com.tencent.mm.plugin.appbrand.n6.this.f86029c;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForAttrAsyncUpdated appId:%s, isSplashing:%b", o6Var2.f74803n, java.lang.Boolean.valueOf(o6Var2.f74812u));
                    ((fl1.c0) o6Var2.getAuthorizeDialogContainer()).c(new com.tencent.mm.plugin.appbrand.df(o6Var2.f74795d, o6Var2));
                }
            });
        }
    }
}
