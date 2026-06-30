package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public abstract class s5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f171734a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.r5();

    /* renamed from: b, reason: collision with root package name */
    public static final x.b f171735b = new x.b();

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f171735b.m174754xc84af884(o6Var);
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1141xc84c5534.C12376xdd2459a1 c12376xdd2459a1 = o6Var.u0().f128801a2;
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d7(b(context), bitmap, c12376xdd2459a1 != null ? c12376xdd2459a1.f166661e : null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.uc c17 = c(context, o6Var.u0());
        if (c17 != null) {
            c17.m53048xdb05916(o6Var);
            return c17;
        }
        if (o6Var.u0().r() == k91.z3.TRANSPARENT) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.la(b(context));
        }
        if ("wxb1320569c2a2b6d2".equals(o6Var.f156336n) && 1190 == o6Var.g2()) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.la(b(context));
        }
        if (n91.t.b(o6Var)) {
            return new n91.n(b(context), o6Var);
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.o(o6Var) && !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kf.a(o6Var) && !o6Var.Q0()) {
            if (o6Var.r2()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4(b(context), o6Var);
                return o6Var.v0() ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g(b(context), o6Var, w4Var, o6Var.A2) : w4Var;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 d17 = d(context, o6Var, o6Var.u0().E2);
            d17.m52969xdbf46906(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.q5(o6Var));
            return o6Var.v0() ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g(b(context), o6Var, d17, o6Var.A2) : d17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f6 g4Var = o6Var.r2() ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g4(b(context), o6Var, o6Var.u0().N) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f6(b(context), o6Var, o6Var.u0().N);
        if (o6Var.Q0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = o6Var.u0().L1;
            if (c11816x5915d2c1.f158900q == k91.y2.f387360d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 d18 = d(context, o6Var, c11816x5915d2c1.b());
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f a17 = mi1.c0.f408058a.a(o6Var, b(context), true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo customSubjectInfo = c11816x5915d2c1.F;
                if (customSubjectInfo != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo.f158919f) {
                    a17.mo52141x53bfe316(customSubjectInfo.f158920d);
                    a17.m52152x4bd4ce78(customSubjectInfo.f158921e);
                    d18.j(customSubjectInfo.f158921e, customSubjectInfo.f158920d);
                } else {
                    a17.mo52141x53bfe316(o6Var.u0().f158812e);
                    a17.m52152x4bd4ce78(o6Var.u0().f158813f);
                }
                a17.mo52138xaaa7669a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p5(o6Var));
                if (c11816x5915d2c1.D != k91.x2.f387350e) {
                    d18.m52966x679283bb(a17);
                } else {
                    android.view.View findViewById = d18.C.findViewById(com.p314xaae8f345.mm.R.id.a0n);
                    if (findViewById != null) {
                        d18.C.removeView(findViewById);
                    }
                }
                d18.s(true);
                return d18;
            }
            g4Var.m52984x5ca1166d(c11816x5915d2c1.B);
            g4Var.s(true);
        }
        return g4Var;
    }

    public static android.content.Context b(android.content.Context context) {
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? false : ((java.lang.Boolean) f171734a.get()).booleanValue()) {
            context = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u.b(context, true);
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? new android.content.MutableContextWrapper(context) : context;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.uc c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        android.graphics.Bitmap bitmap;
        if (c11809xbc286be4.r() == k91.z3.TRANSPARENT) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8 c3898xeaad22a8 = c11809xbc286be4.B1;
            java.lang.String str = c3898xeaad22a8 == null ? null : c3898xeaad22a8.f128822g;
            if (com.p314xaae8f345.mm.vfs.w6.j(str) && c11809xbc286be4.f158825e2) {
                try {
                    bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null);
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLoadingSplashFactory", "createSnapshotDisplayLoadingSplash for transparent window, but get bitmap failed, appId:%s", c11809xbc286be4.f158811d);
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.uc ucVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.uc(context, bitmap, false);
                    ucVar.B(0, !com.p314xaae8f345.mm.ui.bk.C(), true);
                    return ucVar;
                }
            }
            return null;
        }
        if (!c11809xbc286be4.f158825e2 || !android.text.TextUtils.isEmpty(nf.z.a(c11809xbc286be4.f158816i))) {
            return null;
        }
        if (!gk1.g.f353996f.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLoadingSplashFactory", "createSnapshotDisplayLoadingSplash but switch off, appId:%s", c11809xbc286be4.f158811d);
            return null;
        }
        java.lang.String str2 = c11809xbc286be4.f158837q2;
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLoadingSplashFactory", "createScreenshotSplash with appId:%s, path:%s", c11809xbc286be4.f158811d, str2);
            android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str2, null);
            if (J2 != null && !J2.isRecycled()) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.uc(context, J2);
            }
        }
        return null;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 d(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, k91.b1 b1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t s07 = o6Var.s0();
        s07.getClass();
        android.content.Context context2 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 c9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9) s07.f168637c.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9.class, s07.b(context2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9.class));
        if (c9Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h7.a(c9Var.f171163z, c9Var.B, c9Var.A);
            c9Var.m52971x53bf3687(b1Var);
            c9Var.N(o6Var);
        } else {
            c9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9(b(context), o6Var);
            c9Var.m52971x53bf3687(b1Var);
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_loading_weak_net_tips, 0) == 1) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b1(o6Var, c9Var);
        }
        return c9Var;
    }
}
