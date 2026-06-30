package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public enum u8 implements com.tencent.mm.plugin.appbrand.ui.dd {
    INSTANCE;

    public static void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, int i17, android.view.animation.Animation.AnimationListener animationListener) {
        com.tencent.mm.plugin.appbrand.widget.q qVar = appBrandRuntime.f74810s;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        boolean c17 = n3.x0.c(qVar);
        com.tencent.mm.plugin.appbrand.widget.q qVar2 = appBrandRuntime.f74810s;
        if (!c17) {
            qVar2.setWillNotDraw(true);
            qVar2.post(new com.tencent.mm.plugin.appbrand.ui.s8(appBrandRuntime, i17, animationListener));
            return;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(com.tencent.mm.sdk.platformtools.x2.f193071a, i17);
        loadAnimation.setAnimationListener(new com.tencent.mm.plugin.appbrand.ui.t8(animationListener, appBrandRuntime));
        qVar2.startAnimation(loadAnimation);
        if (appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6) {
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).u0().L1;
            if (halfScreenConfig.c()) {
                if (halfScreenConfig.D == k91.x2.f305817e) {
                    android.view.View findViewById = qVar2.getRootView().findViewById(com.tencent.mm.R.id.w_);
                    if (findViewById instanceof hk1.e) {
                        hk1.e eVar = (hk1.e) findViewById;
                        eVar.getClass();
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(1, (int) loadAnimation.getDuration());
                        ofInt.setDuration(loadAnimation.getDuration() * 10);
                        ofInt.addUpdateListener(new hk1.a(eVar, loadAnimation, ofInt));
                        ofInt.start();
                    }
                }
            }
        }
    }

    public static boolean h() {
        return com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.y() && !com.tencent.mm.plugin.appbrand.ui.b1.Companion.b();
    }

    public static int i(com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        if (appBrandStatObject == null) {
            return 0;
        }
        return appBrandStatObject.f87790f;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean n(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r5) {
        /*
            boolean r0 = r5 instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            r3 = r5
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) r3
            com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData r4 = r3.B2
            if (r4 != 0) goto L17
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r3 = r3.f47269b2
            int r3 = i(r3)
            r4 = 1187(0x4a3, float:1.663E-42)
            if (r3 != r4) goto L19
        L17:
            r3 = r1
            goto L1a
        L19:
            r3 = r2
        L1a:
            if (r3 == 0) goto L1d
            return r1
        L1d:
            if (r0 == 0) goto L24
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r5 = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) r5
            boolean r5 = r5.H2
            return r5
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.u8.n(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig):boolean");
    }

    public static boolean o(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (!(appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) appBrandRuntime;
        return o6Var.e3() || o6Var.l2().f87790f == 1099;
    }

    public void j(android.app.Activity activity, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        if (activity == null) {
            return;
        }
        if (appBrandInitConfig == null && (activity instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI)) {
            com.tencent.mm.plugin.appbrand.hc q76 = ((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) activity).q7();
            com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = q76 == null ? null : q76.getActiveRuntime();
            if (activeRuntime != null) {
                appBrandInitConfig = activeRuntime.u0();
            }
        }
        if (appBrandInitConfig instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig;
            if (k91.y3.DISABLED == appBrandInitConfigWC.q()) {
                activity.overridePendingTransition(0, 0);
                return;
            }
            if (k91.y3.POPUP == appBrandInitConfigWC.q()) {
                activity.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477746a7);
                return;
            }
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = appBrandInitConfigWC.L1;
            if (halfScreenConfig != null && halfScreenConfig.c() && (activity instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI)) {
                ((com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI) activity).s7(appBrandInitConfigWC);
                return;
            } else if (appBrandInitConfigWC.f77292e2 || appBrandInitConfigWC.K1 == 1) {
                activity.overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
                return;
            }
        }
        if (h()) {
            activity.overridePendingTransition(0, com.tencent.mm.R.anim.f477746a7);
        } else {
            activity.overridePendingTransition(com.tencent.mm.R.anim.f477745a6, com.tencent.mm.R.anim.f477746a7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(android.app.Activity r7, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r8) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.u8.k(android.app.Activity, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.tencent.mm.plugin.appbrand.AppBrandRuntime r5, java.lang.Runnable r6, com.tencent.mm.plugin.appbrand.AppBrandRuntime r7, java.lang.Runnable r8) {
        /*
            r4 = this;
            if (r7 != 0) goto L3
            return
        L3:
            boolean r0 = r7 instanceof com.tencent.mm.plugin.appbrand.o6
            if (r0 == 0) goto L11
            r0 = r7
            com.tencent.mm.plugin.appbrand.o6 r0 = (com.tencent.mm.plugin.appbrand.o6) r0
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.L1
            goto L12
        L11:
            r0 = 0
        L12:
            r1 = 2130771992(0x7f010018, float:1.714709E38)
            r2 = 2130772010(0x7f01002a, float:1.7147126E38)
            if (r0 == 0) goto L41
            boolean r3 = r0.c()
            if (r3 == 0) goto L41
            android.app.Activity r3 = r7.r0()
            boolean r3 = com.tencent.mm.plugin.appbrand.widget.halfscreen.f.shouldUseCenterPopStyle(r3, r0)
            if (r3 == 0) goto L2b
            goto L5c
        L2b:
            android.app.Activity r3 = r7.r0()
            k91.s2 r0 = r0.a(r3)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L5c
            r2 = 1
            if (r0 == r2) goto L3d
            goto L50
        L3d:
            int r0 = com.tencent.mm.ui.uc.f211081d
            r2 = r0
            goto L5c
        L41:
            k91.y3 r0 = k91.y3.DISABLED
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r3 = r7.u0()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) r3
            k91.y3 r3 = r3.q()
            if (r0 != r3) goto L52
            r1 = 0
        L50:
            r2 = r1
            goto L5c
        L52:
            boolean r0 = o(r7)
            if (r0 == 0) goto L5c
            int r2 = com.tencent.mm.ui.uc.f211081d
            int r1 = com.tencent.mm.ui.uc.f211080c
        L5c:
            if (r2 != 0) goto L64
            if (r8 == 0) goto L6c
            com.tencent.mm.sdk.platformtools.u3.h(r8)
            goto L6c
        L64:
            com.tencent.mm.plugin.appbrand.ui.q8 r0 = new com.tencent.mm.plugin.appbrand.ui.q8
            r0.<init>(r4, r7, r8)
            a(r7, r2, r0)
        L6c:
            if (r5 == 0) goto L7e
            if (r1 != 0) goto L76
            if (r6 == 0) goto L7e
            com.tencent.mm.sdk.platformtools.u3.h(r6)
            goto L7e
        L76:
            com.tencent.mm.plugin.appbrand.ui.r8 r7 = new com.tencent.mm.plugin.appbrand.ui.r8
            r7.<init>(r4, r6)
            a(r5, r1, r7)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.u8.l(com.tencent.mm.plugin.appbrand.AppBrandRuntime, java.lang.Runnable, com.tencent.mm.plugin.appbrand.AppBrandRuntime, java.lang.Runnable):void");
    }

    public void m(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.Runnable runnable, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2, java.lang.Runnable runnable2) {
        int ordinal;
        if (appBrandRuntime == null) {
            return;
        }
        boolean z17 = appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = z17 ? ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).u0().L1 : null;
        int i17 = com.tencent.mm.R.anim.f477728p;
        int i18 = com.tencent.mm.R.anim.f477748a9;
        if (halfScreenConfig == null || !halfScreenConfig.c()) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = z17 ? ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).u0() : null;
            if (u07 != null && k91.y3.DISABLED == u07.o()) {
                if (runnable != null) {
                    runnable.run();
                }
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            }
            if (o(appBrandRuntime)) {
                i18 = com.tencent.mm.ui.uc.f211078a;
            }
            if (o(appBrandRuntime)) {
                i17 = com.tencent.mm.ui.uc.f211079b;
            }
        } else if (!com.tencent.mm.plugin.appbrand.widget.halfscreen.f.shouldUseCenterPopStyle(appBrandRuntime.r0(), halfScreenConfig) && (ordinal = halfScreenConfig.a(appBrandRuntime.r0()).ordinal()) != 0) {
            i18 = ordinal != 1 ? com.tencent.mm.R.anim.f477728p : com.tencent.mm.ui.uc.f211078a;
        }
        a(appBrandRuntime, i18, new com.tencent.mm.plugin.appbrand.ui.o8(this, appBrandRuntime, runnable));
        if (appBrandRuntime2 != null) {
            a(appBrandRuntime2, i17, new com.tencent.mm.plugin.appbrand.ui.p8(this, runnable2));
        }
    }
}
