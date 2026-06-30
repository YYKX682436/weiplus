package com.tencent.mm.plugin.appbrand.ui;

@db5.a(71)
/* loaded from: classes7.dex */
public class AppBrandUI extends com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity implements nf.m, com.tencent.mm.plugin.appbrand.platform.window.activity.c, db5.c {
    public static final boolean X;
    public static final int[] Y;
    public static boolean Z;
    public boolean A;
    public boolean B;
    public boolean C;
    public java.lang.Runnable D;
    public final com.tencent.mm.sdk.platformtools.n3 E;
    public final java.lang.Runnable F;
    public final java.lang.Runnable G;
    public final com.tencent.mm.sdk.event.IListener H;
    public final com.tencent.mm.sdk.event.IListener I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f89411J;
    public final hk1.f K;
    public final android.view.LayoutInflater[] L;
    public android.content.res.Resources M;
    public int N;
    public com.tencent.mm.plugin.appbrand.ui.ia P;
    public com.tencent.mm.plugin.appbrand.ui.ia Q;
    public int R;
    public java.lang.String S;
    public com.tencent.mm.ui.widget.dialog.j0 T;
    public final java.util.Set U;
    public java.lang.Boolean V;
    public final com.tencent.mm.plugin.appbrand.task.b1 W;
    private com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC mRuntimeContainer;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.a f89412p = new com.tencent.mm.plugin.appbrand.widget.input.a(this);

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.AppBrandUITranslucentWorkaroundDelegate f89413q = new com.tencent.mm.plugin.appbrand.ui.AppBrandUITranslucentWorkaroundDelegate(this);

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.n8 f89414r;

    /* renamed from: s, reason: collision with root package name */
    public u81.h0 f89415s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f89416t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f89417u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Boolean f89418v;

    /* renamed from: w, reason: collision with root package name */
    public android.content.res.Configuration f89419w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f89420x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f89421y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f89422z;

    static {
        X = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_move_task_to_back_android12_workaround, 1) == 1;
        com.tencent.mm.plugin.appbrand.me.f85749d = 1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_rm_event_refer_from_native_page, 0);
        com.tencent.mm.plugin.appbrand.me.f85750e = 1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_use_new_scene_from_native_page, 0);
        Y = new int[]{0, 11, 6, 8};
        Z = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f4 A[EDGE_INSN: B:80:0x01f4->B:64:0x01f4 BREAK  A[LOOP:2: B:57:0x01d3->B:78:0x01f1], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBrandUI() {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.AppBrandUI.<init>():void");
    }

    public static void g7(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = appBrandUI.mRuntimeContainer.getActiveRuntime();
        if (activeRuntime != null) {
            activeRuntime.N.f425432a.s(u81.u.ON_SYSTEM_SCREEN_OFF, null);
        }
    }

    public static android.content.res.Configuration p7(android.app.Activity activity) {
        android.content.res.Resources resources;
        if (activity instanceof com.tencent.mm.ui.MMFragmentActivity) {
            return ((com.tencent.mm.ui.MMFragmentActivity) activity).getOriginalResources().getConfiguration();
        }
        if (activity instanceof com.tencent.mm.ui.MMBaseActivity) {
            return ((com.tencent.mm.ui.MMBaseActivity) activity).getOriginalResources().getConfiguration();
        }
        try {
            resources = activity.getResources();
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "getIntrinsicActivityConfiguration(%s) getResources npe %s", activity, e17);
            resources = null;
        }
        if (resources == null) {
            resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
        }
        return resources.getConfiguration();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    public final void A7(android.content.Intent intent, java.lang.String str) {
        java.lang.String str2;
        ?? r17;
        int i17;
        sj1.b bVar;
        java.lang.String str3 = "performLoadRuntime(%s) cost:%dms";
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        setIntent(intent);
        try {
            try {
                android.util.Pair E7 = E7(intent);
                final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) E7.first;
                final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) E7.second;
                if (appBrandInitConfigWC != null && appBrandStatObject != null && appBrandInitConfigWC.D != null) {
                    intent.setExtrasClassLoader(getClassLoader());
                    k7(appBrandStatObject);
                    com.tencent.luggage.sdk.config.AppBrandInitWindowConfig appBrandInitWindowConfig = appBrandInitConfigWC.B1;
                    if (appBrandInitWindowConfig != null && appBrandInitWindowConfig.f47286d) {
                        com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity.d7(this, appBrandInitWindowConfig.f47287e);
                    } else if (appBrandInitConfigWC.L1.f77361h) {
                        com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity.d7(this, getResources().getColor(com.tencent.mm.R.color.f478553an));
                    } else {
                        com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity.d7(this, getResources().getColor(com.tencent.mm.R.color.f478490b));
                    }
                    if (com.tencent.mm.plugin.appbrand.l.b(appBrandInitConfigWC.f77278d) == null) {
                        java.lang.String str4 = appBrandInitConfigWC.f47277w;
                        java.lang.String str5 = appBrandInitConfigWC.f77278d;
                        java.lang.String str6 = appBrandInitConfigWC.f47278x;
                        str2 = appBrandInitConfigWC.f77279e;
                        com.tencent.mm.plugin.appbrand.report.quality.t0.b(str4, str5, str6, str2, java.lang.String.valueOf(appBrandInitConfigWC.L), com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, appBrandInitConfigWC.k());
                        com.tencent.mm.plugin.appbrand.c6.a(1, appBrandInitConfigWC);
                    }
                    appBrandInitConfigWC.f47269b2 = appBrandStatObject;
                    try {
                        com.tencent.mm.plugin.appbrand.report.model.n.a(this, appBrandInitConfigWC, str);
                        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, "key_launch_app_client_version", com.tencent.mm.sdk.platformtools.z.f193112h);
                        int i18 = com.tencent.mm.sdk.platformtools.z.f193112h;
                        if (i18 != g17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "load(intent) mismatch client_version now_version[%d], intent_version[%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(g17));
                            com.tencent.mm.plugin.appbrand.c6.a(5, appBrandInitConfigWC);
                            com.tencent.mm.plugin.appbrand.c6.a(3, appBrandInitConfigWC);
                            finish();
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                            return;
                        }
                        appBrandInitConfigWC.f77289r = this.R;
                        int h17 = com.tencent.mm.sdk.platformtools.x2.n() ? gm0.j1.a() ? gm0.j1.b().h() : 0 : gm0.m.i();
                        if (h17 == 0) {
                            dp.a.makeText(this, com.tencent.mm.R.string.f490024is, 1).show();
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1294L, 0);
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "load() recreate by system history, nowUin==INVALID_UIN, just finish, config.appId:%s", appBrandInitConfigWC.f77278d);
                            finish();
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                            return;
                        }
                        if (h17 != appBrandInitConfigWC.f47279x0) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1294L, 1);
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "load() recreate by system history, nowUin[%s] != config.uin[%s], reset config appId:%s", kk.v.a(h17), kk.v.a(appBrandInitConfigWC.f47279x0), appBrandInitConfigWC.f77278d);
                            finish();
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                            return;
                        }
                        try {
                            if ((intent.getFlags() & 1048576) > 0) {
                                try {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "load() recreate by system history, old initConfig[%s]", appBrandInitConfigWC.toString());
                                    appBrandInitConfigWC.I = java.lang.System.currentTimeMillis();
                                    appBrandInitConfigWC.f77293f2 = java.lang.System.currentTimeMillis();
                                    appBrandInitConfigWC.f47275u = 1;
                                    str2 = "performLoadRuntime(%s) cost:%dms";
                                    r17 = 1;
                                    i17 = 2;
                                    appBrandInitConfigWC.f77298k2 = new com.tencent.mm.plugin.appbrand.report.quality.QualitySession(com.tencent.mm.plugin.appbrand.utils.t.a(appBrandInitConfigWC.f47279x0), appBrandInitConfigWC, appBrandStatObject, 0L);
                                    appBrandInitConfigWC.i(appBrandInitConfigWC.f77298k2.f88134d);
                                    appBrandInitConfigWC.m();
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", str3, str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                                    throw th;
                                }
                            } else {
                                str2 = "performLoadRuntime(%s) cost:%dms";
                                r17 = 1;
                                i17 = 2;
                                appBrandInitConfigWC.f47275u = 0;
                            }
                            if (android.text.TextUtils.isEmpty(appBrandInitConfigWC.f47277w) && appBrandInitConfigWC.f77298k2 != null) {
                                appBrandInitConfigWC.i(appBrandInitConfigWC.f77298k2.f88134d);
                            }
                            try {
                                if (appBrandInitConfigWC.f77298k2 != null) {
                                    com.tencent.mm.plugin.appbrand.report.quality.w1.f88373a.g(appBrandInitConfigWC.f77278d, appBrandInitConfigWC.f77298k2.f88134d);
                                }
                                D7(appBrandInitConfigWC, appBrandStatObject);
                            } catch (java.lang.Throwable th7) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUI", "reportProcessColdStart %s", th7);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "load() config %s , stat %s", appBrandInitConfigWC, appBrandStatObject);
                            com.tencent.mm.plugin.appbrand.keylogger.w.e(appBrandInitConfigWC.f77278d, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepContainerUILaunch);
                            if (com.tencent.mm.plugin.appbrand.l.b(appBrandInitConfigWC.f77278d) == null) {
                                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_appbrand_preload_before_runtime_init_early, com.tencent.mm.sdk.platformtools.z.f193112h <= 671097855 ? r17 : false)) {
                                    ((ku5.t0) ku5.t0.f312615d).a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandUI$$d
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z18 = com.tencent.mm.plugin.appbrand.ui.AppBrandUI.X;
                                            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC2 = com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC.this;
                                            com.tencent.mm.plugin.appbrand.task.x0 x0Var = appBrandInitConfigWC2.k() ? com.tencent.mm.plugin.appbrand.task.x0.WAGAME : com.tencent.mm.plugin.appbrand.task.x0.WASERVICE;
                                            com.tencent.mm.plugin.appbrand.task.b0 b0Var = com.tencent.mm.plugin.appbrand.task.r.f89160a;
                                            com.tencent.mm.plugin.appbrand.task.r.k(x0Var, null, false, null, com.tencent.mm.plugin.appbrand.service.x6.Q, 1, new com.tencent.luggage.sdk.jsapi.component.service.v1(appBrandInitConfigWC2.L1.c() || appBrandInitConfigWC2.r() == k91.z3.TRANSPARENT || appBrandInitConfigWC2.f77292e2 || !i81.j.a(appBrandInitConfigWC2), !appBrandInitConfigWC2.d()));
                                        }
                                    });
                                }
                            }
                            try {
                                r7(appBrandInitConfigWC.f77312y2, appBrandInitConfigWC.f77278d, appBrandInitConfigWC.L1);
                            } catch (java.lang.Throwable th8) {
                                java.lang.Object[] objArr = new java.lang.Object[i17];
                                objArr[0] = appBrandInitConfigWC.f77278d;
                                objArr[r17] = th8;
                                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "handleDeclarePrompt appId:%s, exception:%s", objArr);
                                com.tencent.mm.ui.widget.dialog.j0 j0Var = this.T;
                                if (j0Var != null) {
                                    j0Var.dismiss();
                                }
                            }
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(appBrandInitConfigWC.Z1)) {
                                db5.t7.i(com.tencent.mm.sdk.platformtools.x2.f193071a, appBrandInitConfigWC.Z1, -1);
                            }
                            java.lang.String str7 = this.S;
                            double d17 = appBrandInitConfigWC.K;
                            if (sj1.l.f408372b && (bVar = (sj1.b) sj1.l.f408373c.get(str7)) != null) {
                                bVar.f("public:prepare", "点击启动", d17, 1000.0d + d17);
                            }
                            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
                            appBrandRuntimeContainerWC.getClass();
                            appBrandRuntimeContainerWC.w().runOnUiThread(new ze.h(appBrandRuntimeContainerWC, null, appBrandInitConfigWC, appBrandStatObject));
                            z7(this.mRuntimeContainer.getActiveRuntime());
                            if ("onNewIntent".equals(str)) {
                                mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandUI.9
                                    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
                                    public void onPaused() {
                                        com.tencent.mm.plugin.appbrand.ui.AppBrandUI.this.mo133getLifecycle().c(this);
                                    }

                                    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
                                    public void onResumed() {
                                        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC2 = appBrandInitConfigWC;
                                        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject2 = appBrandStatObject;
                                        com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = com.tencent.mm.plugin.appbrand.ui.AppBrandUI.this;
                                        appBrandUI.t7(appBrandInitConfigWC2, appBrandStatObject2);
                                        appBrandUI.mo133getLifecycle().c(this);
                                    }
                                });
                            } else {
                                t7(appBrandInitConfigWC, appBrandStatObject);
                            }
                            l7();
                            hk1.f fVar = this.K;
                            if (fVar != null) {
                                this.f90321n.add(fVar);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", str2, str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                            return;
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                            str3 = str2;
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", str3, str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                            throw th;
                        }
                    } catch (com.tencent.mm.plugin.appbrand.report.model.a unused) {
                        com.tencent.mm.plugin.appbrand.c6.a(35, appBrandInitConfigWC);
                        com.tencent.mm.plugin.appbrand.report.model.n.b();
                        finish();
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                        return;
                    }
                }
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC2 = this.mRuntimeContainer;
                if (appBrandRuntimeContainerWC2 == null || appBrandRuntimeContainerWC2.getActiveRuntime() == null) {
                    finish();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "performLoadRuntime-retrieveLaunchParams get exception %s", e17);
                finish();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "performLoadRuntime(%s) cost:%dms", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
        }
    }

    public final void B7() {
        com.tencent.mm.plugin.appbrand.app.n0 n0Var = com.tencent.mm.plugin.appbrand.app.o0.f75203a;
        if (n0Var.f75192a) {
            com.tencent.mm.plugin.appbrand.app.n0.a(n0Var, this);
        }
        try {
            java.lang.String str = ((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) E7(getIntent()).first).f77294g2;
            boolean isEmpty = android.text.TextUtils.isEmpty(str);
            com.tencent.mm.plugin.appbrand.ui.z8 z8Var = com.tencent.mm.plugin.appbrand.ui.z8.f90369a;
            if (!isEmpty) {
                z8Var.a(str, getClass().getCanonicalName());
            }
            if (!u46.l.c(com.tencent.mm.sdk.platformtools.x2.f193072b, str)) {
                z8Var.a(com.tencent.mm.sdk.platformtools.x2.f193072b, getClass().getCanonicalName());
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        com.tencent.mm.plugin.appbrand.o6 o6Var = appBrandRuntimeContainerWC == null ? null : (com.tencent.mm.plugin.appbrand.o6) appBrandRuntimeContainerWC.getActiveRuntime();
        if (o6Var != null) {
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = o6Var.H2;
            if (l0Var.e().c() && l0Var.q() && l0Var.f91196b) {
                l0Var.f91196b = false;
                com.tencent.mm.plugin.appbrand.widget.halfscreen.v vVar = new com.tencent.mm.plugin.appbrand.widget.halfscreen.v(l0Var);
                com.tencent.mm.plugin.appbrand.widget.f0 f0Var = l0Var.f91198d;
                if (f0Var != null) {
                    com.tencent.mm.plugin.appbrand.widget.f0.e0(f0Var, com.tencent.mm.plugin.appbrand.widget.c0.f91065e, vVar, false, 4, null);
                }
            }
        }
    }

    public void C7(java.lang.String str, int i17) {
        if (this.f89420x || this.f89421y) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "has recreateProcess!");
            return;
        }
        try {
            if (i17 == 1) {
                this.f89421y = true;
            } else if (i17 == 0) {
                this.f89420x = true;
            }
            android.util.Pair E7 = E7(getIntent());
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) E7.first;
            android.os.Parcelable parcelable = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) E7.second;
            appBrandInitConfigWC.f77293f2 = java.lang.System.currentTimeMillis();
            appBrandInitConfigWC.I = java.lang.System.currentTimeMillis();
            android.content.Intent intent = getIntent();
            intent.putExtra("key_appbrand_init_config", appBrandInitConfigWC);
            intent.putExtra("key_appbrand_stat_object", parcelable);
            setIntent(intent);
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.tencent.mm.plugin.appbrand.app.r0.f75243h;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "markActivityRecreateByConfigurationChanged %s", this);
            com.tencent.mm.plugin.appbrand.app.r0.f75244i.f75246e.set(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "recreate Activity[%s] by %s", getClass().getSimpleName(), str);
            recreate();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandUI", e17, "recreate Activity exception", new java.lang.Object[0]);
            finish();
        }
    }

    public final void D7(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        if (this.f89418v == null) {
            this.f89418v = java.lang.Boolean.FALSE;
        }
        if (!this.f89418v.booleanValue() || Z || appBrandInitConfigWC.f77298k2 == null || appBrandInitConfigWC.f77296i2) {
            return;
        }
        Z = true;
        km0.b a17 = gm0.j1.p().a();
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidProcessStartCostStruct weAppQualityAndroidProcessStartCostStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidProcessStartCostStruct();
        weAppQualityAndroidProcessStartCostStruct.f62386d = weAppQualityAndroidProcessStartCostStruct.b("InstanceId", appBrandInitConfigWC.f77298k2.f88134d, true);
        weAppQualityAndroidProcessStartCostStruct.f62387e = weAppQualityAndroidProcessStartCostStruct.b("AppId", appBrandInitConfigWC.f77278d, true);
        weAppQualityAndroidProcessStartCostStruct.f62388f = appBrandInitConfigWC.L;
        int i17 = appBrandInitConfigWC.f77281g + 1;
        cm.n nVar = null;
        weAppQualityAndroidProcessStartCostStruct.f62389g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.q.demo : cm.q.debug : cm.q.release;
        weAppQualityAndroidProcessStartCostStruct.f62390h = appBrandInitConfigWC.f47284z + 1000;
        weAppQualityAndroidProcessStartCostStruct.f62392j = appBrandStatObject.f87790f;
        long j17 = appBrandInitConfigWC.f77293f2;
        weAppQualityAndroidProcessStartCostStruct.f62393k = j17;
        long j18 = a17.f308991e.f308981a;
        weAppQualityAndroidProcessStartCostStruct.f62394l = j18;
        weAppQualityAndroidProcessStartCostStruct.f62391i = j18 - j17;
        weAppQualityAndroidProcessStartCostStruct.f62395m = appBrandInitConfigWC.f47275u;
        weAppQualityAndroidProcessStartCostStruct.k();
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidWebViewPreInitCostStruct weAppQualityAndroidWebViewPreInitCostStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidWebViewPreInitCostStruct();
        weAppQualityAndroidWebViewPreInitCostStruct.f62396d = weAppQualityAndroidWebViewPreInitCostStruct.b("InstanceId", appBrandInitConfigWC.f77298k2.f88134d, true);
        weAppQualityAndroidWebViewPreInitCostStruct.f62397e = weAppQualityAndroidWebViewPreInitCostStruct.b("AppId", appBrandInitConfigWC.f77278d, true);
        weAppQualityAndroidWebViewPreInitCostStruct.f62398f = appBrandInitConfigWC.L;
        int i18 = appBrandInitConfigWC.f77281g + 1;
        weAppQualityAndroidWebViewPreInitCostStruct.f62399g = i18 != 1 ? i18 != 2 ? i18 != 3 ? null : cm.r.demo : cm.r.debug : cm.r.release;
        weAppQualityAndroidWebViewPreInitCostStruct.f62400h = appBrandInitConfigWC.f47284z + 1000;
        weAppQualityAndroidWebViewPreInitCostStruct.f62402j = appBrandStatObject.f87790f;
        long j19 = l81.a.f317002a;
        weAppQualityAndroidWebViewPreInitCostStruct.f62403k = j19;
        long j27 = l81.a.f317003b;
        weAppQualityAndroidWebViewPreInitCostStruct.f62404l = j27;
        weAppQualityAndroidWebViewPreInitCostStruct.f62401i = j27 - j19;
        int ordinal = com.tencent.xweb.WebView.getCurrentModuleWebCoreType().ordinal();
        if (ordinal == 1) {
            weAppQualityAndroidWebViewPreInitCostStruct.f62405m = 3L;
        } else if (ordinal == 2) {
            weAppQualityAndroidWebViewPreInitCostStruct.f62405m = 2L;
        } else if (ordinal == 3) {
            weAppQualityAndroidWebViewPreInitCostStruct.f62405m = 4L;
        } else if (ordinal == 4) {
            weAppQualityAndroidWebViewPreInitCostStruct.f62405m = 3L;
        }
        weAppQualityAndroidWebViewPreInitCostStruct.k();
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidMMKernelStartupCostStruct weAppQualityAndroidMMKernelStartupCostStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidMMKernelStartupCostStruct();
        weAppQualityAndroidMMKernelStartupCostStruct.f62357d = weAppQualityAndroidMMKernelStartupCostStruct.b("InstanceId", appBrandInitConfigWC.f77298k2.f88134d, true);
        weAppQualityAndroidMMKernelStartupCostStruct.f62358e = weAppQualityAndroidMMKernelStartupCostStruct.b("AppId", appBrandInitConfigWC.f77278d, true);
        weAppQualityAndroidMMKernelStartupCostStruct.f62359f = appBrandInitConfigWC.L;
        int i19 = appBrandInitConfigWC.f77281g + 1;
        if (i19 == 1) {
            nVar = cm.n.release;
        } else if (i19 == 2) {
            nVar = cm.n.debug;
        } else if (i19 == 3) {
            nVar = cm.n.demo;
        }
        weAppQualityAndroidMMKernelStartupCostStruct.f62360g = nVar;
        weAppQualityAndroidMMKernelStartupCostStruct.f62361h = appBrandInitConfigWC.f47284z + 1000;
        weAppQualityAndroidMMKernelStartupCostStruct.f62363j = appBrandStatObject.f87790f;
        km0.a aVar = a17.f308991e;
        long j28 = aVar.f308981a;
        weAppQualityAndroidMMKernelStartupCostStruct.f62364k = j28;
        long j29 = aVar.f308986f;
        weAppQualityAndroidMMKernelStartupCostStruct.f62365l = j29;
        weAppQualityAndroidMMKernelStartupCostStruct.f62362i = j29 - j28;
        weAppQualityAndroidMMKernelStartupCostStruct.f62366m = l81.a.f317004c ? 1L : 0L;
        weAppQualityAndroidMMKernelStartupCostStruct.k();
    }

    public android.util.Pair E7(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            throw new java.lang.NullPointerException("intent.getExtras() returns NULL");
        }
        extras.setClassLoader(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC.class.getClassLoader());
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) extras.getParcelable("key_appbrand_init_config");
        extras.setClassLoader(com.tencent.mm.plugin.appbrand.report.AppBrandStatObject.class.getClassLoader());
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) extras.getParcelable("key_appbrand_stat_object");
        if (appBrandInitConfigWC == null || appBrandStatObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "retrieveLaunchParams, config:(%b)%s, stat:(%b)%s", java.lang.Boolean.valueOf(extras.containsKey("key_appbrand_init_config")), appBrandInitConfigWC, java.lang.Boolean.valueOf(extras.containsKey("key_appbrand_stat_object")), appBrandStatObject);
        }
        if (appBrandInitConfigWC == null) {
            throw new java.lang.NullPointerException("config is NULL");
        }
        if (appBrandStatObject != null) {
            return android.util.Pair.create(appBrandInitConfigWC, appBrandStatObject);
        }
        throw new java.lang.NullPointerException("stat is NULL");
    }

    public boolean F7() {
        android.content.pm.ActivityInfo activityInfo;
        java.lang.Boolean bool = this.V;
        if (bool != null) {
            return bool.booleanValue();
        }
        android.content.pm.PackageManager packageManager = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager();
        try {
            android.content.ComponentName componentName = getComponentName();
            if (componentName == null) {
                componentName = new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, getClass());
            }
            activityInfo = packageManager.getActivityInfo(componentName, 128);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "runInStandaloneTask, resolve info e = %s", e17);
            activityInfo = null;
        }
        if (activityInfo == null) {
            return true;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!com.tencent.mm.sdk.platformtools.x2.f193072b.equals(activityInfo.taskAffinity));
        this.V = valueOf;
        return valueOf.booleanValue();
    }

    public final boolean G7(boolean z17) {
        com.tencent.mm.plugin.appbrand.task.e1.f89016a.a(this, java.lang.String.format(java.util.Locale.ENGLISH, "super_moveTaskToBack(%b)", java.lang.Boolean.valueOf(z17)));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "super_moveTaskToBack stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        return super.moveTaskToBack(z17);
    }

    public void H7(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.startActivityForResult(intent, i17, bundle);
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher
    public boolean W6() {
        return com.tencent.mm.minigame.y.f69161i;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime;
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        if (appBrandRuntimeContainerWC != null && (activeRuntime = appBrandRuntimeContainerWC.getActiveRuntime()) != null) {
            java.util.Set<com.tencent.mm.plugin.appbrand.oc> set = (java.util.Set) activeRuntime.S1.get(keyEvent.getKeyCode());
            boolean z17 = false;
            if (set != null) {
                for (com.tencent.mm.plugin.appbrand.oc ocVar : set) {
                    int i17 = ocVar.f86244b;
                    if (i17 == -1 || i17 == keyEvent.getAction()) {
                        z17 |= ocVar.a(keyEvent);
                    }
                }
            }
            if (z17) {
                return true;
            }
        }
        keyEvent.getKeyCode();
        keyEvent.getAction();
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f7() {
        getIntent().removeExtra("android.view.autofill.extra.RESTORE_SESSION_TOKEN");
        super.finishAndRemoveTask();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer;
        int i17;
        if (isFinishing() || isDestroyed()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandUI$$c
            @Override // java.lang.Runnable
            public final void run() {
                boolean z17 = com.tencent.mm.plugin.appbrand.ui.AppBrandUI.X;
                com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = com.tencent.mm.plugin.appbrand.ui.AppBrandUI.this;
                appBrandUI.getClass();
                try {
                    com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C.delete(appBrandUI.hashCode());
                } catch (java.lang.Exception unused) {
                }
            }
        });
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = null;
        com.tencent.mm.plugin.appbrand.o6 o6Var = appBrandRuntimeContainerWC == null ? null : (com.tencent.mm.plugin.appbrand.o6) appBrandRuntimeContainerWC.getActiveRuntime();
        boolean z17 = false;
        if (o6Var != null) {
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = o6Var.H2;
            hl1.h hVar = l0Var.f91199e;
            hVar.d(hVar.h(), 0, 100L);
            if (l0Var.e().c()) {
                if (l0Var.q()) {
                    l0Var.f91196b = false;
                    l0Var.f91197c = false;
                }
                if (l0Var.f91195a.f74821z != null) {
                    l0Var.m();
                }
            }
        }
        com.tencent.mm.plugin.appbrand.task.e1.f89016a.a(this, "finish");
        com.tencent.mm.plugin.appbrand.ui.v9.c(this);
        try {
            try {
                try {
                    com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC2 = this.mRuntimeContainer;
                    if (appBrandRuntimeContainerWC2 != null) {
                        try {
                            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC2 = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) ((ze.n) appBrandRuntimeContainerWC2.getActiveRuntime()).u0();
                            if (appBrandInitConfigWC2 != null && (appBrandLaunchReferrer = appBrandInitConfigWC2.D) != null && !this.f89422z && (8 == (i17 = appBrandLaunchReferrer.f77322d) || 4 == i17)) {
                                if (!com.tencent.mm.plugin.appbrand.ui.n8.b(getIntent(), this) && !this.B) {
                                    try {
                                        android.content.Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
                                        if (launchIntentForPackage != null) {
                                            launchIntentForPackage.addFlags(268435456);
                                            java.util.ArrayList arrayList = new java.util.ArrayList();
                                            arrayList.add(launchIntentForPackage);
                                            java.util.Collections.reverse(arrayList);
                                            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUI", "finish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                            startActivity((android.content.Intent) arrayList.get(0));
                                            yj0.a.f(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUI", "finish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                        }
                                    } catch (java.lang.Exception e17) {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "finish() try back to LauncherUI get exception %s", e17);
                                    }
                                }
                                com.tencent.mm.plugin.appbrand.ui.n8 n8Var = this.f89414r;
                                if (n8Var != null) {
                                    if ((!(this instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI) && n8Var.a(this, appBrandInitConfigWC2)) ? com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89437g.b(this, com.tencent.mm.plugin.appbrand.ui.x9.f90337f) : false) {
                                        z17 = true;
                                    }
                                }
                            }
                            appBrandInitConfigWC = appBrandInitConfigWC2;
                        } catch (java.lang.Exception unused) {
                        }
                        this.mRuntimeContainer.l0();
                        this.mRuntimeContainer.o0(com.tencent.mm.plugin.appbrand.u5.Finish, this.B);
                    }
                } catch (java.lang.Exception unused2) {
                    return;
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "finish e = %s", e18);
                com.tencent.mm.plugin.appbrand.ui.b9.a(com.tencent.mm.sdk.platformtools.w9.f193053a, getClass().getCanonicalName());
                str = ((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) E7(getIntent()).first).f77294g2;
                if (android.text.TextUtils.isEmpty(str)) {
                    return;
                }
            }
            if (z17) {
                try {
                    com.tencent.mm.plugin.appbrand.ui.b9.a(com.tencent.mm.sdk.platformtools.w9.f193053a, getClass().getCanonicalName());
                    java.lang.String str2 = ((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) E7(getIntent()).first).f77294g2;
                    if (android.text.TextUtils.isEmpty(str2)) {
                        return;
                    }
                    com.tencent.mm.plugin.appbrand.ui.b9.a(str2, getClass().getCanonicalName());
                    return;
                } catch (java.lang.Exception unused3) {
                    return;
                }
            }
            if (this.f89422z) {
                getIntent().removeExtra("android.view.autofill.extra.RESTORE_SESSION_TOKEN");
                super.finish();
            } else {
                f7();
            }
            if (!this.A) {
                java.lang.Runnable runnable = this.D;
                if (runnable != null) {
                    runnable.run();
                } else {
                    s7(appBrandInitConfigWC);
                }
            }
            com.tencent.mm.plugin.appbrand.ui.b9.a(com.tencent.mm.sdk.platformtools.w9.f193053a, getClass().getCanonicalName());
            str = ((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) E7(getIntent()).first).f77294g2;
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            com.tencent.mm.plugin.appbrand.ui.b9.a(str, getClass().getCanonicalName());
        } finally {
            try {
                com.tencent.mm.plugin.appbrand.ui.b9.a(com.tencent.mm.sdk.platformtools.w9.f193053a, getClass().getCanonicalName());
                java.lang.String str3 = ((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) E7(getIntent()).first).f77294g2;
                if (!android.text.TextUtils.isEmpty(str3)) {
                    com.tencent.mm.plugin.appbrand.ui.b9.a(str3, getClass().getCanonicalName());
                }
            } catch (java.lang.Exception unused4) {
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.ContentResolver getContentResolver() {
        return getApplicationContext() != null ? getApplicationContext().getContentResolver() : super.getContentResolver();
    }

    @Override // android.app.Activity
    public final android.view.LayoutInflater getLayoutInflater() {
        android.view.LayoutInflater layoutInflater;
        android.view.LayoutInflater[] layoutInflaterArr = this.L;
        android.view.LayoutInflater layoutInflater2 = layoutInflaterArr[0];
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        synchronized (layoutInflaterArr) {
            android.view.LayoutInflater[] layoutInflaterArr2 = this.L;
            layoutInflater = layoutInflaterArr2[0];
            if (layoutInflater == null) {
                layoutInflater = y7();
                layoutInflaterArr2[0] = layoutInflater;
            }
        }
        return layoutInflater;
    }

    @Override // android.app.Activity
    public final java.lang.String getLocalClassName() {
        if (getComponentName() != null) {
            return super.getLocalClassName();
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
        java.lang.String name = getClass().getName();
        int length = str.length();
        return (name.startsWith(str) && name.length() > length && name.charAt(length) == '.') ? name.substring(length + 1) : name;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
        if (this.M == null) {
            this.M = super.getResources();
        }
        return this.M;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        android.view.LayoutInflater layoutInflater;
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        android.view.LayoutInflater[] layoutInflaterArr = this.L;
        android.view.LayoutInflater layoutInflater2 = layoutInflaterArr[0];
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        synchronized (layoutInflaterArr) {
            android.view.LayoutInflater[] layoutInflaterArr2 = this.L;
            layoutInflater = layoutInflaterArr2[0];
            if (layoutInflater == null) {
                layoutInflater = y7();
                layoutInflaterArr2[0] = layoutInflater;
            }
        }
        return layoutInflater;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return new com.tencent.mm.plugin.appbrand.ui.c8(this, super.importUIComponents());
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public final void initActivityCloseAnimation() {
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public final void initActivityOpenAnimation(android.content.Intent intent) {
        if (intent == null || intent.getComponent() == null || !intent.getComponent().equals(getComponentName())) {
            super.initActivityOpenAnimation(intent);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean isCallSuperOnSaveInstanceState() {
        return true;
    }

    @Override // db5.c
    public final void k2() {
        this.f89413q.f89445e = true;
    }

    public final void k7(com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        if (appBrandStatObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "adjustWindowFlag, statObj is null");
            return;
        }
        if (1225 == appBrandStatObject.f87790f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WmpfVoipWindowFlags", "add, activity: " + this);
            android.view.Window window = getWindow();
            if (window != null) {
                window.addFlags(6815744);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WmpfVoipWindowFlags", "clear, activity: " + this);
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(6815744);
        }
    }

    public final void l7() {
        hk1.f fVar = this.K;
        if (fVar != null) {
            this.f90321n.remove(fVar);
        }
        this.E.removeCallbacks(this.F);
    }

    public final void m7() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        int stackSize = appBrandRuntimeContainerWC == null ? -1 : appBrandRuntimeContainerWC.getStackSize();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "%s.closeIfNoActiveRuntimes %d,", getLocalClassName(), java.lang.Integer.valueOf(stackSize));
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC2 = this.mRuntimeContainer;
        if (appBrandRuntimeContainerWC2 instanceof com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC) {
            appBrandRuntimeContainerWC2.a0();
        } else if (stackSize <= 0) {
            finish();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public final boolean moveTaskToBack(boolean z17) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC;
        int i17;
        com.tencent.mm.plugin.appbrand.task.e1 e1Var = com.tencent.mm.plugin.appbrand.task.e1.f89016a;
        e1Var.a(this, java.lang.String.format(java.util.Locale.ENGLISH, "moveTaskToBack(%b)", java.lang.Boolean.valueOf(z17)));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "moveTaskToBack stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.tencent.mm.plugin.appbrand.ui.v9.c(this);
        try {
            appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) this.mRuntimeContainer.getActiveRuntime().u0();
        } catch (java.lang.Exception unused) {
            appBrandInitConfigWC = null;
        }
        try {
            if (appBrandInitConfigWC != null) {
                try {
                    com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = appBrandInitConfigWC.D;
                    if (appBrandLaunchReferrer != null && ((8 == (i17 = appBrandLaunchReferrer.f77322d) || 4 == i17) && !com.tencent.mm.plugin.appbrand.ui.n8.b(getIntent(), this))) {
                        try {
                            android.content.Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
                            if (launchIntentForPackage != null) {
                                launchIntentForPackage.addFlags(268435456);
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(launchIntentForPackage);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUI", "moveTaskToBack", "(Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                startActivity((android.content.Intent) arrayList.get(0));
                                yj0.a.f(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUI", "moveTaskToBack", "(Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "moveTaskToBack() try back to LauncherUI get exception %s", e17);
                        }
                        boolean moveTaskToBack = super.moveTaskToBack(z17);
                        if (!isFinishing() && !this.A) {
                            s7(appBrandInitConfigWC);
                        }
                        return moveTaskToBack;
                    }
                } catch (java.lang.NullPointerException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "moveTaskToBack() get exception %s, invoke finish()", e18);
                    finish();
                    if (!isFinishing() && !this.A && appBrandInitConfigWC != null) {
                        s7(appBrandInitConfigWC);
                    }
                    return true;
                }
            }
            if (appBrandInitConfigWC != null && com.tencent.mm.plugin.appbrand.appusage.d.f76406a.a(this, appBrandInitConfigWC)) {
                if (!isFinishing() && !this.A) {
                    s7(appBrandInitConfigWC);
                }
                return true;
            }
            com.tencent.mm.plugin.appbrand.ui.n8 n8Var = this.f89414r;
            if (n8Var != null) {
                if (n8Var.a(this, appBrandInitConfigWC) ? com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89437g.b(this, com.tencent.mm.plugin.appbrand.ui.x9.f90336e) : false) {
                    e1Var.a(this, "moveTaskToBack use android12 workaround");
                    if (!isFinishing() && !this.A && appBrandInitConfigWC != null) {
                        s7(appBrandInitConfigWC);
                    }
                    return true;
                }
            }
            boolean moveTaskToBack2 = super.moveTaskToBack(z17);
            if (!isFinishing() && !this.A && appBrandInitConfigWC != null) {
                s7(appBrandInitConfigWC);
            }
            return moveTaskToBack2;
        } catch (java.lang.Throwable th6) {
            if (!isFinishing() && !this.A && appBrandInitConfigWC != null) {
                s7(appBrandInitConfigWC);
            }
            throw th6;
        }
    }

    public void n7() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime;
        if (!com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            this.E.post(this.G);
            return;
        }
        int i17 = com.tencent.mm.plugin.appbrand.ui.d8.f89665b[mo133getLifecycle().b().ordinal()];
        if (i17 == 1 || i17 == 2) {
            if (this.B) {
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUI", "forceMoveTaskToBack, hash:%d, name:%s, state:%s, skip.", java.lang.Integer.valueOf(hashCode()), getLocalClassName(), mo133getLifecycle().b());
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        if (appBrandRuntimeContainerWC == null || (activeRuntime = appBrandRuntimeContainerWC.getActiveRuntime()) == null || activeRuntime.L0() || activeRuntime.S) {
            finish();
            return;
        }
        int i18 = activeRuntime instanceof com.tencent.mm.plugin.appbrand.o6 ? ((com.tencent.mm.plugin.appbrand.o6) activeRuntime).l2().f87790f : 0;
        if (i18 == 1225) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUI", "forceMoveTaskToBack, hash:%d, name:%s, appId:%s, scene:%d, skip.", java.lang.Integer.valueOf(hashCode()), getLocalClassName(), activeRuntime.f74803n, java.lang.Integer.valueOf(i18));
            return;
        }
        if (G7(false)) {
            activeRuntime.N.f425432a.s(u81.u.ON_CONTAINER_FORCED_MOVE_TO_BACK, null);
            com.tencent.mm.plugin.appbrand.hc hcVar = activeRuntime.f74796e;
            if (hcVar == null || hcVar.getActiveRuntime() != activeRuntime) {
                return;
            }
            activeRuntime.h0();
        }
    }

    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC o7() {
        try {
            return (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) E7(getIntent()).first;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        nf.g.a(this).g(i17, i18, intent);
        if (intent != null && "jsapi_pay_onActivityResult".equals(intent.getStringExtra("key_jsapi_pay_onActivityResult")) && i18 == 5) {
            db5.e1.E(this, intent.getStringExtra("key_jsapi_pay_err_msg"), "", intent.getStringExtra("key_jsapi_pay_err_dialog_confirm"), false, new com.tencent.mm.plugin.appbrand.ui.a8(this));
        }
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.appbrand.task.e1.f89016a.a(this, "onBackPressed");
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onConfigurationChanged(android.content.res.Configuration r7) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.AppBrandUI.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        zk3.c Ai;
        boolean z17;
        java.lang.String str;
        try {
            java.lang.String stringExtra = getIntent().getStringExtra("key_app_id");
            this.S = stringExtra;
            sj1.l.d(stringExtra, getIntent().getBooleanExtra("key_remote_debug", false));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "appId: %s start", this.S);
            this.R = sj1.l.f(this.S, "public:prepare", "资源准备");
            sj1.l.i(this.S, "public:prepare", "(安卓)Activity初始化");
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.plugin.appbrand.task.e1 e1Var = com.tencent.mm.plugin.appbrand.task.e1.f89016a;
            java.util.Locale locale = java.util.Locale.ENGLISH;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = bundle == null ? "null" : java.lang.Integer.valueOf(bundle.hashCode());
            e1Var.a(this, java.lang.String.format(locale, "onCreate(%s)", objArr));
            com.tencent.mm.plugin.appbrand.app.n0 n0Var = com.tencent.mm.plugin.appbrand.app.o0.f75203a;
            n0Var.f75193b.put(hashCode(), 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "setSkipMiscPreload %b", java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.appbrand.app.o0.f75204b = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "alive activity count %d", java.lang.Integer.valueOf(n0Var.f75193b.size()));
            if (com.tencent.mm.sdk.platformtools.c2.c(getIntent(), "key_disable_animation", false) || q75.d.a()) {
                setTheme(com.tencent.mm.plugin.appbrand.ui.ja.a(false));
            } else {
                setTheme(com.tencent.mm.plugin.appbrand.ui.ja.a(F7()));
            }
            if (!com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d) {
                com.tencent.mm.sdk.platformtools.b.c();
            }
            try {
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C.put(hashCode(), getTaskId());
            } catch (java.lang.Exception unused) {
            }
            try {
                cf.i.b("[AppBrandUILifeCycleSpeedProfile] AppBrandUI.super.onCreate", new com.tencent.mm.plugin.appbrand.ui.g8(this, bundle));
                if (bundle != null && bundle.containsKey("com.tencent.mm.plugin.appbrand.ui.AppBrandUI.SAVED_INSTANCE_STATE_KEY_OVERRIDE_INTENT")) {
                    try {
                        android.content.Intent intent = (android.content.Intent) bundle.getParcelable("com.tencent.mm.plugin.appbrand.ui.AppBrandUI.SAVED_INSTANCE_STATE_KEY_OVERRIDE_INTENT");
                        if (intent != null) {
                            if (!F7()) {
                                str = "!runInStandaloneTask";
                                z17 = false;
                            } else if (getIntent() == null) {
                                str = "NULL==getIntent()";
                                z17 = true;
                            } else {
                                z17 = ((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) E7(intent).first).I > ((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) E7(getIntent()).first).I;
                                str = "override.clickTimestamp() > original.clickTimestamp()";
                            }
                            if (z17) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "onCreate %d, overrideIntent is applied, reason:%s", java.lang.Integer.valueOf(hashCode()), str);
                                setIntent(intent);
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "onCreate %d, try use overrideIntent, exception:%s", java.lang.Integer.valueOf(hashCode()), e17);
                    }
                }
                if (getIntent() == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "onCreate %d, null intent", java.lang.Integer.valueOf(hashCode()));
                    finish();
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "[AppBrandUILifeCycleSpeedProfile] onCreate %d, intent.flags = %d, super.onCreate() cost %dms", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(getIntent().getFlags()), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                this.f89416t = true;
                cf.i.b("[AppBrandUILifeCycleSpeedProfile] onCreate stuffs " + getLocalClassName(), new com.tencent.mm.plugin.appbrand.ui.i8(this));
                android.view.View view = this.f90318h;
                if (view instanceof hk1.e) {
                    ((hk1.e) view).setRuntimeContainer(this.mRuntimeContainer);
                }
                com.tencent.mm.plugin.appbrand.ui.v9.b(this);
                if (rh1.b.f395625b) {
                    android.view.View decorView = getWindow().getDecorView();
                    if ((decorView instanceof android.view.ViewGroup) && ((android.view.ViewGroup) decorView).getChildCount() > 0 && (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this)) != null) {
                        ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) Ai).R6(this.f90318h, new com.tencent.mm.plugin.appbrand.ui.f8(this), true);
                    }
                }
                A7(getIntent(), "onCreate");
                com.tencent.mm.plugin.appbrand.ui.n8 n8Var = this.f89414r;
                if (n8Var != null) {
                    n8Var.c(this, getIntent());
                }
                mo133getLifecycle().a(this.f89413q);
                com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) this.mRuntimeContainer.getActiveRuntime();
                if (o6Var != null) {
                    com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = o6Var.H2;
                    l0Var.f91199e.reset();
                    l0Var.t(100L);
                    if (l0Var.e().c() && l0Var.q()) {
                        l0Var.f91196b = true;
                        java.lang.Object parent = l0Var.f91195a.f74810s.getParent();
                        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
                        android.view.View view2 = (android.view.View) parent;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(4);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger", "onActivityCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger", "onActivityCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
                java.lang.String str2 = (appBrandRuntimeContainerWC == null || appBrandRuntimeContainerWC.getActiveRuntime() == null) ? "" : ((ze.n) this.mRuntimeContainer.getActiveRuntime()).f74803n;
                cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AppBrandUI);
                aVar.Rj(this, iy1.a.MiniProgram);
                aVar.fk(this, "wa_appid", str2);
                uh0.t tVar = (uh0.t) i95.n0.c(uh0.t.class);
                ((th0.y) tVar).getClass();
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (z65.c.a()) {
                    com.tencent.mm.plugin.appbrand.da.c(new com.tencent.mm.plugin.appbrand.ui.j8(this, tVar));
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandUI", th6, "%s.onCreate", getLocalClassName());
                try {
                    java.lang.reflect.Field declaredField = android.app.Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    if (!((java.lang.Boolean) declaredField.get(this)).booleanValue()) {
                        super.onCreate(bundle);
                    }
                } catch (java.lang.Exception unused2) {
                }
                finish();
            }
        } catch (android.os.BadParcelableException | java.lang.IllegalStateException e18) {
            try {
                super.onCreate(bundle);
            } catch (java.lang.Exception unused3) {
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "appId: %s onCreate exception:%s finish", this.S, e18);
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        android.app.Activity activity = this.f89412p.f91275a;
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        activity.getWindow().setSoftInputMode(16);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.appbrand.report.model.t0 t0Var;
        long longValue;
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC;
        com.tencent.mm.plugin.appbrand.task.e1.f89016a.a(this, "onDestroy");
        try {
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C.delete(hashCode());
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.appbrand.app.n0.a(com.tencent.mm.plugin.appbrand.app.o0.f75203a, this);
        com.tencent.mm.plugin.appbrand.ui.v9.c(this);
        com.tencent.mm.plugin.appbrand.ui.y9 y9Var = com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89437g;
        int hashCode = hashCode();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.tencent.mm.plugin.appbrand.utils.h1.a(com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89438h, hashCode);
        if (bitmap != null) {
            bitmap.recycle();
        }
        com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89439i.remove(hashCode);
        l7();
        if (!this.f89420x && !isChangingConfigurations() && (appBrandRuntimeContainerWC = this.mRuntimeContainer) != null) {
            appBrandRuntimeContainerWC.o0(com.tencent.mm.plugin.appbrand.u5.OnDestroy, this.B);
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC2 = this.mRuntimeContainer;
        if (appBrandRuntimeContainerWC2 != null) {
            java.util.LinkedList linkedList = appBrandRuntimeContainerWC2.f74839r;
            java.util.Iterator it = new java.util.LinkedList(linkedList).iterator();
            while (it.hasNext()) {
                ze.n nVar = (ze.n) it.next();
                if ((nVar instanceof com.tencent.mm.plugin.appbrand.o6) && (t0Var = ((com.tencent.mm.plugin.appbrand.o6) nVar).M2) != null) {
                    com.tencent.mm.autogen.mmdata.rpt.AppBrandCloseReasonStruct appBrandCloseReasonStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandCloseReasonStruct();
                    java.lang.Long l17 = t0Var.f88109a;
                    appBrandCloseReasonStruct.f55128e = l17 != null ? l17.longValue() : -1L;
                    appBrandCloseReasonStruct.f55127d = appBrandCloseReasonStruct.b("appId", t0Var.f88110b, true);
                    appBrandCloseReasonStruct.f55131h = appBrandCloseReasonStruct.b("flags", com.tencent.mm.plugin.appbrand.report.quality.d.f88159a.a(), true);
                    appBrandCloseReasonStruct.f55130g = 1L;
                    appBrandCloseReasonStruct.f55132i = appBrandCloseReasonStruct.b(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, t0Var.f88111c, true);
                    if (t0Var.f88112d == null) {
                        longValue = 0;
                    } else {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.lang.Long l18 = t0Var.f88112d;
                        kotlin.jvm.internal.o.d(l18);
                        longValue = currentTimeMillis - l18.longValue();
                    }
                    appBrandCloseReasonStruct.f55129f = longValue;
                    appBrandCloseReasonStruct.n();
                    bm5.f1.a();
                    appBrandCloseReasonStruct.k();
                }
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.addAll(linkedList);
            linkedList2.addAll(appBrandRuntimeContainerWC2.f74840s.values());
            appBrandRuntimeContainerWC2.J(null);
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) it6.next();
                appBrandRuntime.f74817x1 = false;
                appBrandRuntimeContainerWC2.r(appBrandRuntime);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "cleanup");
            appBrandRuntimeContainerWC2.S();
            android.content.Context context = appBrandRuntimeContainerWC2.f87645d;
            if (context instanceof com.tencent.mm.plugin.appbrand.ui.z6) {
                ((com.tencent.mm.plugin.appbrand.ui.z6) context).setBaseContext(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            appBrandRuntimeContainerWC2.G(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        u81.h0 h0Var = this.f89415s;
        if (h0Var != null) {
            try {
                com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(h0Var.f425436a);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BaseAppBrandUIHomePressReceiver", "unregister screen off receiver e = " + e17);
            }
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.T;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        super.onDestroy();
        android.view.View view = this.f90318h;
        if (view != null) {
            ((android.view.ViewGroup) view).removeAllViews();
        }
        vj5.n c17 = vj5.n.c(this);
        if (c17 != null) {
            c17.a();
        }
        nf.g.b(this);
        q75.a.b(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onEnterAnimationComplete() {
        com.tencent.mm.plugin.appbrand.task.e1.f89016a.a(this, "onEnterAnimationComplete");
        com.tencent.mm.plugin.appbrand.ui.w8 w8Var = (com.tencent.mm.plugin.appbrand.ui.w8) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.appbrand.ui.w8.class);
        com.tencent.mm.sdk.platformtools.n3 n3Var = w8Var.f90312f;
        java.lang.Runnable runnable = w8Var.f90313g;
        n3Var.removeCallbacks(runnable);
        ((com.tencent.mm.plugin.appbrand.ui.v8) runnable).run();
        l7();
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        if (appBrandRuntimeContainerWC != null && appBrandRuntimeContainerWC.getStackSize() == 1) {
            ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntimeContainerWC.getActiveRuntime()).j3();
        }
        android.util.ArraySet arraySet = com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89440m;
        java.util.Iterator it = arraySet.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI) it.next()).T6();
        }
        arraySet.clear();
        B7();
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "onNewIntent %s, %d, isFinishing:%b", intent, java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(isFinishing()));
        com.tencent.mm.plugin.appbrand.task.e1.f89016a.a(this, "onNewIntent");
        com.tencent.mm.plugin.appbrand.app.n0 n0Var = com.tencent.mm.plugin.appbrand.app.o0.f75203a;
        n0Var.f75193b.put(hashCode(), 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "setSkipMiscPreload %b", java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.appbrand.app.o0.f75204b = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "alive activity count %d", java.lang.Integer.valueOf(n0Var.f75193b.size()));
        if (isFinishing() || isDestroyed() || intent == null) {
            return;
        }
        this.f89417u = true;
        if (intent.getBooleanExtra("key_appbrand_bring_ui_to_front", false)) {
            m7();
            return;
        }
        com.tencent.mm.plugin.appbrand.ui.v9.b(this);
        if (intent.getParcelableExtra("key_appbrand_init_config") != null) {
            try {
                super.onNewIntent(intent);
                db5.f.b(this);
                A7(intent, "onNewIntent");
                com.tencent.mm.plugin.appbrand.ui.n8 n8Var = this.f89414r;
                if (n8Var != null) {
                    n8Var.c(this, intent);
                    return;
                }
                return;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandUI", th6, "%s.onNewIntent", getLocalClassName());
                m7();
                return;
            }
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = appBrandRuntimeContainerWC == null ? null : appBrandRuntimeContainerWC.getActiveRuntime();
        if (activeRuntime != null) {
            java.util.Set d17 = com.tencent.mm.plugin.appbrand.x0.f92370e.d(activeRuntime.f74803n);
            if (d17 != null) {
                java.util.Iterator it = d17.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.f.a(it.next());
                    throw null;
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.appbrand.task.e1.f89016a.a(this, "onPause");
        l7();
        super.onPause();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.oa(this, new com.tencent.mm.plugin.appbrand.ui.z7(this)));
        this.f89416t = false;
        this.f89417u = false;
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        appBrandRuntimeContainerWC.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "onPause tid = %d", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        appBrandRuntimeContainerWC.Y(new com.tencent.mm.plugin.appbrand.x4(appBrandRuntimeContainerWC));
        this.f89411J.dead();
        com.tencent.mm.plugin.appbrand.platform.window.activity.e0 b17 = com.tencent.mm.plugin.appbrand.platform.window.activity.e0.b(this);
        synchronized (b17.f87584d) {
            com.tencent.mm.plugin.appbrand.utils.h4 h4Var = b17.f87585e;
            if (h4Var != null) {
                h4Var.disable();
            }
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = this.mRuntimeContainer.getActiveRuntime();
        java.util.Map map = i81.j.f289592a;
        if ((activeRuntime instanceof com.tencent.mm.plugin.appbrand.o6) && activeRuntime.W0()) {
            com.tencent.mm.plugin.appbrand.ad.jsapi.k kVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.k();
            kVar.f74914i = "launch";
            kVar.x(((com.tencent.mm.plugin.appbrand.o6) activeRuntime).C0());
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.isGame(this.mRuntimeContainer.getActiveRuntime());
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        java.util.Iterator it = this.mRuntimeContainer.f74839r.iterator();
        while (it.hasNext()) {
            si1.e1.d(((com.tencent.mm.plugin.appbrand.AppBrandRuntime) it.next()).f74803n, i17, strArr, iArr, false);
        }
        nf.g.a(this).h(i17, strArr, iArr);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        com.tencent.mm.plugin.appbrand.task.e1.f89016a.a(this, "onRestoreInstanceState");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.appbrand.task.e1 e1Var = com.tencent.mm.plugin.appbrand.task.e1.f89016a;
        e1Var.a(this, "onResume");
        try {
            cf.i.b("[AppBrandUILifeCycleSpeedProfile] AppBrandUI.super.onResume()", new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandUI$$e
                @Override // java.lang.Runnable
                public final void run() {
                    super/*com.tencent.mm.ui.MMFragmentActivity*/.onResume();
                }
            });
            this.E.removeCallbacks(this.G);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "onResume %d", java.lang.Integer.valueOf(hashCode()));
            int i17 = (!F7() || this.f89416t || this.f89417u) ? 0 : 2;
            com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) this.mRuntimeContainer.getActiveRuntime();
            if (o6Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "onResume, appId = %s, systemRecentsReason = %d", o6Var.f74803n, java.lang.Integer.valueOf(i17));
                o6Var.u0().f47275u = i17;
            }
            this.f89417u = false;
            this.f89416t = false;
            this.C = false;
            this.mRuntimeContainer.Q();
            this.f89411J.alive();
            com.tencent.mm.plugin.appbrand.platform.window.activity.e0.b(this).a(false);
            com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = this.mRuntimeContainer.getActiveRuntime();
            java.util.Map map = i81.j.f289592a;
            if (activeRuntime instanceof com.tencent.mm.plugin.appbrand.o6) {
                com.tencent.mm.plugin.appbrand.service.c0 C0 = ((com.tencent.mm.plugin.appbrand.o6) activeRuntime).C0();
                if (activeRuntime.W0() && C0 != null) {
                    com.tencent.mm.plugin.appbrand.ad.jsapi.m mVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.m();
                    mVar.f74918i = "launch";
                    mVar.x(C0);
                }
            }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.isGame(this.mRuntimeContainer.getActiveRuntime());
            m7();
            e1Var.a(this, "onResumed");
        } catch (android.os.BadParcelableException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "onResume BadParcelableException occurs, just finish");
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.tencent.mm.plugin.appbrand.task.e1.f89016a.a(this, "onSaveInstanceState");
        try {
            E7(getIntent());
            bundle.putParcelable("com.tencent.mm.plugin.appbrand.ui.AppBrandUI.SAVED_INSTANCE_STATE_KEY_OVERRIDE_INTENT", getIntent());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "onSaveInstanceState override intent is saved, instance:%d", java.lang.Integer.valueOf(hashCode()));
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.appbrand.task.e1 e1Var = com.tencent.mm.plugin.appbrand.task.e1.f89016a;
        e1Var.a(this, "onStart");
        this.E.removeCallbacks(this.G);
        super.onStart();
        this.B = false;
        this.C = false;
        android.util.ArraySet arraySet = com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89440m;
        java.util.Iterator it = arraySet.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI) it.next()).T6();
        }
        arraySet.clear();
        try {
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C.put(hashCode(), getTaskId());
        } catch (java.lang.Exception unused) {
        }
        m7();
        this.H.alive();
        this.I.alive();
        e1Var.a(this, "onStarted");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.appbrand.o6 a17;
        com.tencent.mm.plugin.appbrand.task.e1.f89016a.a(this, "onStop");
        com.tencent.mm.plugin.appbrand.app.n0.a(com.tencent.mm.plugin.appbrand.app.o0.f75203a, this);
        super.onStop();
        this.B = true;
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = appBrandRuntimeContainerWC.getActiveRuntime();
        if (activeRuntime != null && activeRuntime.J0() && !activeRuntime.S && !activeRuntime.L0()) {
            activeRuntime.K("reportContainerActivityStopped", new java.lang.Object[0]);
            if (activeRuntime.getWindowAndroid() instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0) {
                activeRuntime.N.f425432a.s(u81.u.ON_CONTAINER_ACTIVITY_STOPPED, null);
            }
        }
        ze.n nVar = (ze.n) appBrandRuntimeContainerWC.getActiveRuntime();
        if (nVar != null) {
            com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) nVar;
            wa1.a aVar = wa1.b.f444100a;
            if (aVar.b(o6Var) && (a17 = aVar.a(o6Var)) != null) {
                com.tencent.mm.plugin.appbrand.na naVar = a17.J2;
                naVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.EmbedHalfScreenWxaManager", "[onStop] mark down embedded wxa appid for re-show when host back to the front");
                naVar.b(o6Var);
            }
        }
        if (nVar != null && nVar.N != null) {
            long j17 = nVar.E0() == null ? 0L : (r1.f305850p * 1000) + 500;
            u81.f0 f0Var = nVar.N.f425432a;
            u81.u uVar = u81.u.CHECK_PROCESS_IMPORTANCE;
            if (j17 <= 0) {
                f0Var.s(uVar, null);
            } else {
                f0Var.f304847e.postDelayed(new u81.s(f0Var, uVar, null), j17);
            }
        }
        this.H.dead();
        this.I.dead();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        if (appBrandRuntimeContainerWC != null) {
            appBrandRuntimeContainerWC.f87646e.b(layoutParams);
            appBrandRuntimeContainerWC.g0(layoutParams);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mm.plugin.appbrand.task.e1.f89016a.a(this, "onWindowFocusChanged:" + z17);
    }

    @Override // db5.c
    public final void q4() {
        this.f89413q.f89445e = false;
    }

    public final com.tencent.mm.plugin.appbrand.hc q7() {
        return this.mRuntimeContainer;
    }

    public final void r7(com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle, java.lang.String str, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.mRuntimeContainer;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = appBrandRuntimeContainerWC != null ? appBrandRuntimeContainerWC.getActiveRuntime() : null;
        if (activeRuntime == null || !com.tencent.mm.sdk.platformtools.t8.D0(activeRuntime.f74803n, str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "handleDeclarePrompt: try dismiss last dialog, activeRuntime(%s) newAppId(%s)", activeRuntime, str);
            com.tencent.mm.ui.widget.dialog.j0 j0Var = this.T;
            if (j0Var != null) {
                j0Var.dismiss();
            }
        }
        if (weAppOpenDeclarePromptBundle == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "handleDeclarePrompt with null bundle: appid(%s) try dismiss last dialog", objArr);
            com.tencent.mm.ui.widget.dialog.j0 j0Var2 = this.T;
            if (j0Var2 != null) {
                j0Var2.dismiss();
                return;
            }
            return;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = weAppOpenDeclarePromptBundle;
        if (str == null) {
            str = "";
        }
        objArr2[1] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "handleDeclarePrompt bundle:%s appid:%s", objArr2);
        com.tencent.mm.ui.widget.dialog.j0 j0Var3 = this.T;
        if (j0Var3 != null) {
            j0Var3.dismiss();
        }
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = weAppOpenDeclarePromptBundle.f74988f;
        aVar.f211729s = weAppOpenDeclarePromptBundle.f74989g;
        java.lang.String str2 = weAppOpenDeclarePromptBundle.f74990h;
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = getString(com.tencent.mm.R.string.f490507x1);
        }
        aVar.f211732v = str2;
        aVar.E = new com.tencent.mm.plugin.appbrand.ui.v7(this, weAppOpenDeclarePromptBundle, halfScreenConfig);
        aVar.A = weAppOpenDeclarePromptBundle.f74991i;
        aVar.G = new com.tencent.mm.plugin.appbrand.ui.x7(this, weAppOpenDeclarePromptBundle, halfScreenConfig);
        com.tencent.mm.ui.widget.dialog.j0 j0Var4 = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
        j0Var4.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var4.f211837r);
        }
        this.T = j0Var4;
        j0Var4.setOnShowListener(new com.tencent.mm.plugin.appbrand.ui.y7(this, halfScreenConfig));
        j0Var4.show();
    }

    @Override // android.app.Activity
    public void recreate() {
        com.tencent.mm.plugin.appbrand.task.e1.f89016a.a(this, "recreate");
        super.recreate();
    }

    public void s7(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        com.tencent.mm.plugin.appbrand.ui.u8.INSTANCE.j(this, appBrandInitConfigWC);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e0, code lost:
    
        if (getResources().getConfiguration().orientation == 2) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e9, code lost:
    
        if (u46.a.a(com.tencent.mm.plugin.appbrand.ui.AppBrandUI.Y, r10) != false) goto L52;
     */
    @Override // com.tencent.mm.ui.MMFragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setRequestedOrientation(int r10) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.AppBrandUI.setRequestedOrientation(int):void");
    }

    @Override // android.app.Activity
    public final void setTaskDescription(android.app.ActivityManager.TaskDescription taskDescription) {
        if (F7()) {
            try {
                super.setTaskDescription(taskDescription);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandUI", e17, "setTaskDescription ", new java.lang.Object[0]);
                if (taskDescription != null) {
                    try {
                        super.setTaskDescription(new android.app.ActivityManager.TaskDescription(taskDescription.getLabel(), (android.graphics.Bitmap) null, taskDescription.getPrimaryColor()));
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i17) {
        super.setTheme(i17);
        this.N = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r1.F7() == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startActivityForResult(android.content.Intent r10, int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.AppBrandUI.startActivityForResult(android.content.Intent, int, android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataFragmentActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        if (rh1.b.f395625b) {
            ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).wi(this, hashSet);
        }
    }

    public void t7(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        appBrandInitConfigWC.f47269b2 = appBrandStatObject;
        if (com.tencent.mm.plugin.appbrand.utils.t.b(appBrandInitConfigWC.f77295h2)) {
            overridePendingTransition(0, 0);
        } else {
            com.tencent.mm.plugin.appbrand.ui.u8.INSTANCE.k(this, appBrandInitConfigWC);
        }
    }

    public final boolean u7() {
        return this.f89413q.f89445e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unbindService(android.content.ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "unbindService IllegalArgumentException %s", e17);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(android.content.BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUI", "unregisterReceiver IllegalArgumentException %s", e17);
        }
    }

    public boolean v7() {
        return true;
    }

    public boolean w7(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6) {
            return k91.y3.DISABLED == ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).u0().o();
        }
        return false;
    }

    public com.tencent.mm.plugin.appbrand.ui.ia x7(boolean z17) {
        if (z17) {
            if (this.P == null) {
                this.P = new com.tencent.mm.plugin.appbrand.ui.ia(this);
            }
            return this.P;
        }
        if (this.Q == null) {
            this.Q = new com.tencent.mm.plugin.appbrand.ui.ia(getApplicationContext(), this.N);
        }
        return this.Q;
    }

    public android.view.LayoutInflater y7() {
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) b3.l.getSystemService(getApplicationContext(), android.view.LayoutInflater.class);
        java.util.Objects.requireNonNull(layoutInflater);
        return com.tencent.mm.ui.id.a(layoutInflater, this);
    }

    public void z7(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (rh1.b.f395624a && w7(appBrandRuntime)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "onRuntimeLoaded, appId:%s, disableEnterAnimation && !keepOpaque, convertActivityToTranslucent", appBrandRuntime.f74803n);
            db5.f.c(this, null);
        }
    }
}
