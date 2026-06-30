package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public abstract class s5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f90201a = new com.tencent.mm.plugin.appbrand.ui.r5();

    /* renamed from: b, reason: collision with root package name */
    public static final x.b f90202b = new x.b();

    public static com.tencent.mm.plugin.appbrand.ui.vc a(android.content.Context context, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f90202b.remove(o6Var);
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle appBrandRuntimeReloadReportBundle = o6Var.u0().f47268a2;
            return new com.tencent.mm.plugin.appbrand.ui.d7(b(context), bitmap, appBrandRuntimeReloadReportBundle != null ? appBrandRuntimeReloadReportBundle.f85128e : null);
        }
        com.tencent.mm.plugin.appbrand.ui.uc c17 = c(context, o6Var.u0());
        if (c17 != null) {
            c17.setRuntime(o6Var);
            return c17;
        }
        if (o6Var.u0().r() == k91.z3.TRANSPARENT) {
            return new com.tencent.mm.plugin.appbrand.ui.la(b(context));
        }
        if ("wxb1320569c2a2b6d2".equals(o6Var.f74803n) && 1190 == o6Var.g2()) {
            return new com.tencent.mm.plugin.appbrand.ui.la(b(context));
        }
        if (n91.t.b(o6Var)) {
            return new n91.n(b(context), o6Var);
        }
        if (!com.tencent.mm.plugin.appbrand.ui.u8.o(o6Var) && !com.tencent.mm.plugin.appbrand.kf.a(o6Var) && !o6Var.Q0()) {
            if (o6Var.r2()) {
                com.tencent.mm.plugin.appbrand.ui.w4 w4Var = new com.tencent.mm.plugin.appbrand.ui.w4(b(context), o6Var);
                return o6Var.v0() ? new com.tencent.mm.plugin.appbrand.ui.g(b(context), o6Var, w4Var, o6Var.A2) : w4Var;
            }
            com.tencent.mm.plugin.appbrand.ui.c9 d17 = d(context, o6Var, o6Var.u0().E2);
            d17.setLabelInjector(new com.tencent.mm.plugin.appbrand.ui.q5(o6Var));
            return o6Var.v0() ? new com.tencent.mm.plugin.appbrand.ui.g(b(context), o6Var, d17, o6Var.A2) : d17;
        }
        com.tencent.mm.plugin.appbrand.ui.f6 g4Var = o6Var.r2() ? new com.tencent.mm.plugin.appbrand.ui.g4(b(context), o6Var, o6Var.u0().N) : new com.tencent.mm.plugin.appbrand.ui.f6(b(context), o6Var, o6Var.u0().N);
        if (o6Var.Q0()) {
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = o6Var.u0().L1;
            if (halfScreenConfig.f77367q == k91.y2.f305827d) {
                com.tencent.mm.plugin.appbrand.ui.c9 d18 = d(context, o6Var, halfScreenConfig.b());
                com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar a17 = mi1.c0.f326525a.a(o6Var, b(context), true);
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo = halfScreenConfig.F;
                if (customSubjectInfo != com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo.f77386f) {
                    a17.setTitle(customSubjectInfo.f77387d);
                    a17.setWxaIconUrl(customSubjectInfo.f77388e);
                    d18.j(customSubjectInfo.f77388e, customSubjectInfo.f77387d);
                } else {
                    a17.setTitle(o6Var.u0().f77279e);
                    a17.setWxaIconUrl(o6Var.u0().f77280f);
                }
                a17.setCloseBtnListener(new com.tencent.mm.plugin.appbrand.ui.p5(o6Var));
                if (halfScreenConfig.D != k91.x2.f305817e) {
                    d18.setActionBar(a17);
                } else {
                    android.view.View findViewById = d18.C.findViewById(com.tencent.mm.R.id.a0n);
                    if (findViewById != null) {
                        d18.C.removeView(findViewById);
                    }
                }
                d18.s(true);
                return d18;
            }
            g4Var.setBackButtonVisibility(halfScreenConfig.B);
            g4Var.s(true);
        }
        return g4Var;
    }

    public static android.content.Context b(android.content.Context context) {
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n() ? false : ((java.lang.Boolean) f90201a.get()).booleanValue()) {
            context = com.tencent.mm.plugin.appbrand.page.u.b(context, true);
        }
        return com.tencent.mm.sdk.platformtools.x2.n() ? new android.content.MutableContextWrapper(context) : context;
    }

    public static com.tencent.mm.plugin.appbrand.ui.uc c(android.content.Context context, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        android.graphics.Bitmap bitmap;
        if (appBrandInitConfigWC.r() == k91.z3.TRANSPARENT) {
            com.tencent.luggage.sdk.config.AppBrandInitWindowConfig appBrandInitWindowConfig = appBrandInitConfigWC.B1;
            java.lang.String str = appBrandInitWindowConfig == null ? null : appBrandInitWindowConfig.f47289g;
            if (com.tencent.mm.vfs.w6.j(str) && appBrandInitConfigWC.f77292e2) {
                try {
                    bitmap = com.tencent.mm.sdk.platformtools.x.J(str, null);
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLoadingSplashFactory", "createSnapshotDisplayLoadingSplash for transparent window, but get bitmap failed, appId:%s", appBrandInitConfigWC.f77278d);
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    com.tencent.mm.plugin.appbrand.ui.uc ucVar = new com.tencent.mm.plugin.appbrand.ui.uc(context, bitmap, false);
                    ucVar.B(0, !com.tencent.mm.ui.bk.C(), true);
                    return ucVar;
                }
            }
            return null;
        }
        if (!appBrandInitConfigWC.f77292e2 || !android.text.TextUtils.isEmpty(nf.z.a(appBrandInitConfigWC.f77283i))) {
            return null;
        }
        if (!gk1.g.f272463f.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLoadingSplashFactory", "createSnapshotDisplayLoadingSplash but switch off, appId:%s", appBrandInitConfigWC.f77278d);
            return null;
        }
        java.lang.String str2 = appBrandInitConfigWC.f77304q2;
        if (com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLoadingSplashFactory", "createScreenshotSplash with appId:%s, path:%s", appBrandInitConfigWC.f77278d, str2);
            android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str2, null);
            if (J2 != null && !J2.isRecycled()) {
                return new com.tencent.mm.plugin.appbrand.ui.uc(context, J2);
            }
        }
        return null;
    }

    public static com.tencent.mm.plugin.appbrand.ui.c9 d(android.content.Context context, com.tencent.mm.plugin.appbrand.o6 o6Var, k91.b1 b1Var) {
        com.tencent.mm.plugin.appbrand.page.t s07 = o6Var.s0();
        s07.getClass();
        android.content.Context context2 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
        kotlin.jvm.internal.o.d(context2);
        com.tencent.mm.plugin.appbrand.ui.c9 c9Var = (com.tencent.mm.plugin.appbrand.ui.c9) s07.f87104c.a(com.tencent.mm.plugin.appbrand.ui.c9.class, s07.b(context2, com.tencent.mm.plugin.appbrand.ui.c9.class));
        if (c9Var != null) {
            com.tencent.mm.plugin.appbrand.ui.h7.a(c9Var.f89630z, c9Var.B, c9Var.A);
            c9Var.setTheme(b1Var);
            c9Var.N(o6Var);
        } else {
            c9Var = new com.tencent.mm.plugin.appbrand.ui.c9(b(context), o6Var);
            c9Var.setTheme(b1Var);
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_loading_weak_net_tips, 0) == 1) {
            new com.tencent.mm.plugin.appbrand.b1(o6Var, c9Var);
        }
        return c9Var;
    }
}
