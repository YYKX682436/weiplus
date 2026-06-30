package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public enum u8 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd {
    INSTANCE;

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, int i17, android.view.animation.Animation.AnimationListener animationListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = c11510xdd90c2f2.f156343s;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        boolean c17 = n3.x0.c(qVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar2 = c11510xdd90c2f2.f156343s;
        if (!c17) {
            qVar2.setWillNotDraw(true);
            qVar2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.s8(c11510xdd90c2f2, i17, animationListener));
            return;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17);
        loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t8(animationListener, c11510xdd90c2f2));
        qVar2.startAnimation(loadAnimation);
        if (c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2).u0().L1;
            if (c11816x5915d2c1.c()) {
                if (c11816x5915d2c1.D == k91.x2.f387350e) {
                    android.view.View findViewById = qVar2.getRootView().findViewById(com.p314xaae8f345.mm.R.id.w_);
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
        return com.p314xaae8f345.mm.ui.bk.v0() && com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b1.f35295x233c02ec.b();
    }

    public static int i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        if (c12559xbdae8559 == null) {
            return 0;
        }
        return c12559xbdae8559.f169323f;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 r5) {
        /*
            boolean r0 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            r3 = r5
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) r3
            com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData r4 = r3.B2
            if (r4 != 0) goto L17
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r3 = r3.f128802b2
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
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) r5
            boolean r5 = r5.H2
            return r5
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.n(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig):boolean");
    }

    public static boolean o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        if (!(c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2;
        return o6Var.e3() || o6Var.l2().f169323f == 1099;
    }

    public void j(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        if (activity == null) {
            return;
        }
        if (c11808xe47dc718 == null && (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc q76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) activity).q7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c = q76 == null ? null : q76.mo48805xd384d23c();
            if (mo48805xd384d23c != null) {
                c11808xe47dc718 = mo48805xd384d23c.u0();
            }
        }
        if (c11808xe47dc718 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) c11808xe47dc718;
            if (k91.y3.DISABLED == c11809xbc286be4.q()) {
                activity.overridePendingTransition(0, 0);
                return;
            }
            if (k91.y3.POPUP == c11809xbc286be4.q()) {
                activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559279a7);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = c11809xbc286be4.L1;
            if (c11816x5915d2c1 != null && c11816x5915d2c1.c() && (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d) activity).s7(c11809xbc286be4);
                return;
            } else if (c11809xbc286be4.f158825e2 || c11809xbc286be4.K1 == 1) {
                activity.overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292613c, com.p314xaae8f345.mm.ui.uc.f292614d);
                return;
            }
        }
        if (h()) {
            activity.overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559279a7);
        } else {
            activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559278a6, com.p314xaae8f345.mm.R.C30854x2dc211.f559279a7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(android.app.Activity r7, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 r8) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.k(android.app.Activity, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 r5, java.lang.Runnable r6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 r7, java.lang.Runnable r8) {
        /*
            r4 = this;
            if (r7 != 0) goto L3
            return
        L3:
            boolean r0 = r7 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6
            if (r0 == 0) goto L11
            r0 = r7
            com.tencent.mm.plugin.appbrand.o6 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) r0
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
            boolean r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f.m53403xf9801149(r3, r0)
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
            int r0 = com.p314xaae8f345.mm.ui.uc.f292614d
            r2 = r0
            goto L5c
        L41:
            k91.y3 r0 = k91.y3.DISABLED
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r3 = r7.u0()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) r3
            k91.y3 r3 = r3.q()
            if (r0 != r3) goto L52
            r1 = 0
        L50:
            r2 = r1
            goto L5c
        L52:
            boolean r0 = o(r7)
            if (r0 == 0) goto L5c
            int r2 = com.p314xaae8f345.mm.ui.uc.f292614d
            int r1 = com.p314xaae8f345.mm.ui.uc.f292613c
        L5c:
            if (r2 != 0) goto L64
            if (r8 == 0) goto L6c
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(r8)
            goto L6c
        L64:
            com.tencent.mm.plugin.appbrand.ui.q8 r0 = new com.tencent.mm.plugin.appbrand.ui.q8
            r0.<init>(r4, r7, r8)
            a(r7, r2, r0)
        L6c:
            if (r5 == 0) goto L7e
            if (r1 != 0) goto L76
            if (r6 == 0) goto L7e
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(r6)
            goto L7e
        L76:
            com.tencent.mm.plugin.appbrand.ui.r8 r7 = new com.tencent.mm.plugin.appbrand.ui.r8
            r7.<init>(r4, r6)
            a(r5, r1, r7)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.l(com.tencent.mm.plugin.appbrand.AppBrandRuntime, java.lang.Runnable, com.tencent.mm.plugin.appbrand.AppBrandRuntime, java.lang.Runnable):void");
    }

    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.Runnable runnable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22, java.lang.Runnable runnable2) {
        int ordinal;
        if (c11510xdd90c2f2 == null) {
            return;
        }
        boolean z17 = c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = z17 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2).u0().L1 : null;
        int i17 = com.p314xaae8f345.mm.R.C30854x2dc211.f559261p;
        int i18 = com.p314xaae8f345.mm.R.C30854x2dc211.f559281a9;
        if (c11816x5915d2c1 == null || !c11816x5915d2c1.c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = z17 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2).u0() : null;
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
            if (o(c11510xdd90c2f2)) {
                i18 = com.p314xaae8f345.mm.ui.uc.f292611a;
            }
            if (o(c11510xdd90c2f2)) {
                i17 = com.p314xaae8f345.mm.ui.uc.f292612b;
            }
        } else if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f.m53403xf9801149(c11510xdd90c2f2.r0(), c11816x5915d2c1) && (ordinal = c11816x5915d2c1.a(c11510xdd90c2f2.r0()).ordinal()) != 0) {
            i18 = ordinal != 1 ? com.p314xaae8f345.mm.R.C30854x2dc211.f559261p : com.p314xaae8f345.mm.ui.uc.f292611a;
        }
        a(c11510xdd90c2f2, i18, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.o8(this, c11510xdd90c2f2, runnable));
        if (c11510xdd90c2f22 != null) {
            a(c11510xdd90c2f22, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p8(this, runnable2));
        }
    }
}
