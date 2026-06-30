package com.p314xaae8f345.mm.p955xcb5d41be;

@j95.b
/* loaded from: classes12.dex */
public class a extends i95.w {
    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        final km0.b a17 = gm0.j1.p().a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            final android.app.Application application = ((km0.c) gm0.j1.p().a()).f390522c;
            gm0.j1.i().c(new hm0.x(this) { // from class: com.tencent.mm.modelrecovery.PluginRecovery$1
                @Override // hm0.t
                public void b() {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.PluginRecovery", "Check app profile: ");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.PluginRecovery", "UserId = " + com.p314xaae8f345.mm.sdk.p2603x2137b148.c7.b());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.PluginRecovery", "UserInfo = " + com.p314xaae8f345.mm.sdk.p2603x2137b148.c7.c(application));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.PluginRecovery", "UserProfile = ".concat(com.p314xaae8f345.mm.sdk.p2603x2137b148.c7.a(application)));
                    boolean d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c7.d(application);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.PluginRecovery", "RunningInDualApp = " + d17);
                    if (d17) {
                        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.modelrecovery.PluginRecovery$1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                                    dp.a.m125854x26a183b(application, "微信正运行在分身应用, 部分功能可能存在兼容性问题", 0).show();
                                }
                            }
                        });
                    }
                    synchronized (com.p314xaae8f345.mm.p2499xd05e7f95.C19819x7bfc77ed.class) {
                    }
                }
            });
        }
        ((ku5.t0) ku5.t0.f394148d).g(new h21.RunnableC28433x2e755c());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable(this) { // from class: com.tencent.mm.modelrecovery.PluginRecovery$2
                @Override // java.lang.Runnable
                public void run() {
                    km0.b bVar = a17;
                    try {
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        h21.j.b(bVar.f390522c);
                        h21.j.a(bVar.f390522c);
                        android.app.Application application2 = bVar.f390522c;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.recovery.PluginRecovery", e17, "post recovery fail", new java.lang.Object[0]);
                    }
                }
            });
            gm0.j1.i().c(new hm0.x(this) { // from class: com.tencent.mm.modelrecovery.PluginRecovery$3
                @Override // hm0.t
                public void b() {
                    ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.modelrecovery.PluginRecovery$3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            java.lang.String str;
                            e42.e0 e0Var;
                            if (gm0.j1.i().f354741a.f354832d) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.PluginRecovery", "pull recovery online config");
                                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                try {
                                    e0Var = (e42.e0) i95.n0.c(e42.e0.class);
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    str = "MicroMsg.recovery.PluginRecovery";
                                }
                                if (e0Var != null) {
                                    d55.w wVar = new d55.w(context2, "recovery_enable");
                                    wVar.e();
                                    boolean z17 = true;
                                    wVar.mo123524x41a8a7f2("enable", true);
                                    h62.d dVar = (h62.d) e0Var;
                                    int Ni = dVar.Ni(e42.d0.clicfg_recovery_r_enable, 1);
                                    if (Ni <= 0) {
                                        z17 = false;
                                    }
                                    wVar.mo123528x1c849219("enable", z17);
                                    wVar.c();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.reporter", "online config, enabled = " + Ni);
                                    d55.a0 a0Var = new d55.a0(context2);
                                    int Ni2 = dVar.Ni(e42.d0.clicfg_recovery_r_threshold_1, 5);
                                    int Ni3 = dVar.Ni(e42.d0.clicfg_recovery_r_threshold_2, 6);
                                    str = "MicroMsg.recovery.PluginRecovery";
                                    try {
                                        long Ui = dVar.Ui(e42.d0.clicfg_recovery_r_auto_reset, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                                        long Ui2 = dVar.Ui(e42.d0.clicfg_recovery_r_interval, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                                        long Ui3 = dVar.Ui(e42.d0.clicfg_recovery_r_interval_sub, 30000L);
                                        long Ui4 = dVar.Ui(e42.d0.clicfg_recovery_r_app_exit_info, 1800000L);
                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c || z65.c.a()) {
                                            Ui4 = 0;
                                        }
                                        if (Ni2 >= 2) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.reporter", "setThresholdLevel1, value = " + Ni2);
                                            a0Var.f308088a = Ni2;
                                        }
                                        if (Ni3 >= a0Var.f308088a) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.reporter", "setThresholdLevel2, value = " + Ni3);
                                            a0Var.f308089b = Ni3;
                                        }
                                        if (Ui >= 5000) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.reporter", "setAutoResetDelay, value = " + Ui);
                                            a0Var.f308093f = Ui;
                                        }
                                        if (Ui2 >= 5000) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.reporter", "setCrashInterval, value = " + Ui2);
                                            a0Var.f308090c = Ui2;
                                        }
                                        if (Ui3 >= 5000) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.reporter", "setCrashSubInterval, value = " + Ui3);
                                            a0Var.f308091d = Ui3;
                                        }
                                        if (Ui4 >= 0) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.reporter", "setAppExitInfoInterval, value = " + Ui4);
                                            a0Var.f308094g = Ui4;
                                        }
                                        a0Var.a();
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.recovery.reporter", th, "pull abtest config for recovery fail", new java.lang.Object[0]);
                                        long j17 = new d55.a0(a17.f390522c).f308093f;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "unregister recovery after millis: " + j17);
                                        ku5.u0 u0Var = ku5.t0.f394148d;
                                        h21.RunnableC28434x2ee9bb runnableC28434x2ee9bb = new h21.RunnableC28434x2ee9bb();
                                        ku5.t0 t0Var = (ku5.t0) u0Var;
                                        t0Var.getClass();
                                        t0Var.z(runnableC28434x2ee9bb, j17, false);
                                    }
                                    long j172 = new d55.a0(a17.f390522c).f308093f;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "unregister recovery after millis: " + j172);
                                    ku5.u0 u0Var2 = ku5.t0.f394148d;
                                    h21.RunnableC28434x2ee9bb runnableC28434x2ee9bb2 = new h21.RunnableC28434x2ee9bb();
                                    ku5.t0 t0Var2 = (ku5.t0) u0Var2;
                                    t0Var2.getClass();
                                    t0Var2.z(runnableC28434x2ee9bb2, j172, false);
                                }
                            }
                            str = "MicroMsg.recovery.PluginRecovery";
                            long j1722 = new d55.a0(a17.f390522c).f308093f;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "unregister recovery after millis: " + j1722);
                            ku5.u0 u0Var22 = ku5.t0.f394148d;
                            h21.RunnableC28434x2ee9bb runnableC28434x2ee9bb22 = new h21.RunnableC28434x2ee9bb();
                            ku5.t0 t0Var22 = (ku5.t0) u0Var22;
                            t0Var22.getClass();
                            t0Var22.z(runnableC28434x2ee9bb22, j1722, false);
                        }
                    });
                }
            });
        }
    }
}
