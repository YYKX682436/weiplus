package com.tencent.mm.modelrecovery;

@j95.b
/* loaded from: classes12.dex */
public class a extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        final km0.b a17 = gm0.j1.p().a();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            final android.app.Application application = ((km0.c) gm0.j1.p().a()).f308989c;
            gm0.j1.i().c(new hm0.x(this) { // from class: com.tencent.mm.modelrecovery.PluginRecovery$1
                @Override // hm0.t
                public void b() {
                    com.tencent.mars.xlog.Log.i("MicroMsg.recovery.PluginRecovery", "Check app profile: ");
                    com.tencent.mars.xlog.Log.i("MicroMsg.recovery.PluginRecovery", "UserId = " + com.tencent.mm.sdk.platformtools.c7.b());
                    com.tencent.mars.xlog.Log.i("MicroMsg.recovery.PluginRecovery", "UserInfo = " + com.tencent.mm.sdk.platformtools.c7.c(application));
                    com.tencent.mars.xlog.Log.i("MicroMsg.recovery.PluginRecovery", "UserProfile = ".concat(com.tencent.mm.sdk.platformtools.c7.a(application)));
                    boolean d17 = com.tencent.mm.sdk.platformtools.c7.d(application);
                    com.tencent.mars.xlog.Log.i("MicroMsg.recovery.PluginRecovery", "RunningInDualApp = " + d17);
                    if (d17) {
                        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.modelrecovery.PluginRecovery$1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                                    dp.a.makeText(application, "微信正运行在分身应用, 部分功能可能存在兼容性问题", 0).show();
                                }
                            }
                        });
                    }
                    synchronized (com.tencent.mm.recovery.RecoveryInitializer.class) {
                    }
                }
            });
        }
        ((ku5.t0) ku5.t0.f312615d).g(new h21.e$$a());
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable(this) { // from class: com.tencent.mm.modelrecovery.PluginRecovery$2
                @Override // java.lang.Runnable
                public void run() {
                    km0.b bVar = a17;
                    try {
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                        h21.j.b(bVar.f308989c);
                        h21.j.a(bVar.f308989c);
                        android.app.Application application2 = bVar.f308989c;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.recovery.PluginRecovery", e17, "post recovery fail", new java.lang.Object[0]);
                    }
                }
            });
            gm0.j1.i().c(new hm0.x(this) { // from class: com.tencent.mm.modelrecovery.PluginRecovery$3
                @Override // hm0.t
                public void b() {
                    ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.modelrecovery.PluginRecovery$3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            java.lang.String str;
                            e42.e0 e0Var;
                            if (gm0.j1.i().f273208a.f273299d) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.recovery.PluginRecovery", "pull recovery online config");
                                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
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
                                    wVar.getBoolean("enable", true);
                                    h62.d dVar = (h62.d) e0Var;
                                    int Ni = dVar.Ni(e42.d0.clicfg_recovery_r_enable, 1);
                                    if (Ni <= 0) {
                                        z17 = false;
                                    }
                                    wVar.putBoolean("enable", z17);
                                    wVar.c();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.recovery.reporter", "online config, enabled = " + Ni);
                                    d55.a0 a0Var = new d55.a0(context2);
                                    int Ni2 = dVar.Ni(e42.d0.clicfg_recovery_r_threshold_1, 5);
                                    int Ni3 = dVar.Ni(e42.d0.clicfg_recovery_r_threshold_2, 6);
                                    str = "MicroMsg.recovery.PluginRecovery";
                                    try {
                                        long Ui = dVar.Ui(e42.d0.clicfg_recovery_r_auto_reset, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                                        long Ui2 = dVar.Ui(e42.d0.clicfg_recovery_r_interval, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                                        long Ui3 = dVar.Ui(e42.d0.clicfg_recovery_r_interval_sub, 30000L);
                                        long Ui4 = dVar.Ui(e42.d0.clicfg_recovery_r_app_exit_info, 1800000L);
                                        if (com.tencent.mm.sdk.platformtools.s9.f192975c || z65.c.a()) {
                                            Ui4 = 0;
                                        }
                                        if (Ni2 >= 2) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.recovery.reporter", "setThresholdLevel1, value = " + Ni2);
                                            a0Var.f226555a = Ni2;
                                        }
                                        if (Ni3 >= a0Var.f226555a) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.recovery.reporter", "setThresholdLevel2, value = " + Ni3);
                                            a0Var.f226556b = Ni3;
                                        }
                                        if (Ui >= 5000) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.recovery.reporter", "setAutoResetDelay, value = " + Ui);
                                            a0Var.f226560f = Ui;
                                        }
                                        if (Ui2 >= 5000) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.recovery.reporter", "setCrashInterval, value = " + Ui2);
                                            a0Var.f226557c = Ui2;
                                        }
                                        if (Ui3 >= 5000) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.recovery.reporter", "setCrashSubInterval, value = " + Ui3);
                                            a0Var.f226558d = Ui3;
                                        }
                                        if (Ui4 >= 0) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.recovery.reporter", "setAppExitInfoInterval, value = " + Ui4);
                                            a0Var.f226561g = Ui4;
                                        }
                                        a0Var.a();
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.recovery.reporter", th, "pull abtest config for recovery fail", new java.lang.Object[0]);
                                        long j17 = new d55.a0(a17.f308989c).f226560f;
                                        com.tencent.mars.xlog.Log.i(str, "unregister recovery after millis: " + j17);
                                        ku5.u0 u0Var = ku5.t0.f312615d;
                                        h21.f$$a f__a = new h21.f$$a();
                                        ku5.t0 t0Var = (ku5.t0) u0Var;
                                        t0Var.getClass();
                                        t0Var.z(f__a, j17, false);
                                    }
                                    long j172 = new d55.a0(a17.f308989c).f226560f;
                                    com.tencent.mars.xlog.Log.i(str, "unregister recovery after millis: " + j172);
                                    ku5.u0 u0Var2 = ku5.t0.f312615d;
                                    h21.f$$a f__a2 = new h21.f$$a();
                                    ku5.t0 t0Var2 = (ku5.t0) u0Var2;
                                    t0Var2.getClass();
                                    t0Var2.z(f__a2, j172, false);
                                }
                            }
                            str = "MicroMsg.recovery.PluginRecovery";
                            long j1722 = new d55.a0(a17.f308989c).f226560f;
                            com.tencent.mars.xlog.Log.i(str, "unregister recovery after millis: " + j1722);
                            ku5.u0 u0Var22 = ku5.t0.f312615d;
                            h21.f$$a f__a22 = new h21.f$$a();
                            ku5.t0 t0Var22 = (ku5.t0) u0Var22;
                            t0Var22.getClass();
                            t0Var22.z(f__a22, j1722, false);
                        }
                    });
                }
            });
        }
    }
}
