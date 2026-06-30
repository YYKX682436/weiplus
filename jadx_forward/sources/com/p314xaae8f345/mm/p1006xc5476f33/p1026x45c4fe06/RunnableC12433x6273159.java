package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* renamed from: com.tencent.mm.plugin.appbrand.n6$$a */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC12433x6273159 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n6 f167564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f167565e;

    public /* synthetic */ RunnableC12433x6273159(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n6 n6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f167564d = n6Var;
        this.f167565e = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n6 n6Var = this.f167564d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f167565e;
        n6Var.getClass();
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_wxaapp_restart_on_notify_lowest_version, 1) == 1;
        boolean z18 = o6Var.u0().f128801a2 != null && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n6.f167559e.equals(o6Var.u0().f128801a2.f166661e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeUpdateRunnerForAttrAsyncUpdated", "notify exptOpen:%b, isRestartedBySameReason:%b, appId:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), o6Var.f156336n);
        if (z17 && !z18 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(o6Var.f156338p.f158814g)) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.n6$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n6.this.f167562c;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForAttrAsyncUpdated appId:%s, isSplashing:%b", o6Var2.f156336n, java.lang.Boolean.valueOf(o6Var2.f156345u));
                    ((fl1.c0) o6Var2.m48800x14ed3266()).c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.df(o6Var2.f156328d, o6Var2));
                }
            });
        }
    }
}
