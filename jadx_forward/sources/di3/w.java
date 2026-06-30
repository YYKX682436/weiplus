package di3;

/* loaded from: classes10.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f314300a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f314301b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f314302c;

    /* renamed from: d, reason: collision with root package name */
    public static di3.f0 f314303d;

    /* renamed from: e, reason: collision with root package name */
    public static int f314304e;

    /* renamed from: f, reason: collision with root package name */
    public static double f314305f;

    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.hardware.Camera.Parameters r13, boolean r14, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.w.a(android.hardware.Camera$Parameters, boolean, com.tencent.mm.modelcontrol.VideoTransPara):void");
    }

    public static boolean b(android.graphics.Point point) {
        if (f314301b) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
            java.lang.Object[] objArr = new java.lang.Object[1];
            di3.f0 f0Var = f314303d;
            objArr[0] = f0Var == null ? "" : java.lang.Integer.valueOf(f0Var.f314235c);
            db5.t7.m123883x26a183b(context, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573828fz2, objArr), 1).show();
            return false;
        }
        wo.g1 g1Var = wo.v1.f529362i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderConfig", "checkMediaCodecHappy, deviceInfo recorderType: %s, recorderOption: %s, isUseRecorderOption: %s", java.lang.Integer.valueOf(g1Var.f529220a), java.lang.Integer.valueOf(g1Var.f529227h), java.lang.Boolean.valueOf(f314302c));
        if (f314302c) {
            return false;
        }
        if (g1Var.f529220a != -1) {
            return true;
        }
        di3.f0 f0Var2 = f314303d;
        if (f0Var2 != null && 1 == f0Var2.f314233a) {
            return true;
        }
        if (point == null) {
            return false;
        }
        int i17 = point.x;
        boolean z17 = ai3.d.f86640a;
        if (i17 % 16 == 0) {
            if (point.y % 16 == 0) {
                return true;
            }
        }
        if (f314303d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderConfig", "checkMediaCodecHappy not happy %s", point.toString());
            f314303d.f314233a = 1;
        }
        return false;
    }

    public static void c(di3.s sVar) {
        if (sVar.f314290a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderConfig", "checkMore start %s", sVar.m124459x9616526c());
            sVar.f314290a = sVar.f314293d;
            android.graphics.Point point = sVar.f314294e;
            sVar.f314291b = point;
            sVar.f314292c = sVar.f314295f;
            int min = java.lang.Math.min(point.y, point.x);
            di3.f0 f0Var = f314303d;
            if (min >= f0Var.f314234b.f152724d + 16) {
                f0Var.c();
                di3.f0 f0Var2 = f314303d;
                f0Var2.f314238f = false;
                f0Var2.f314237e = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderConfig", "checkMore out %s", sVar.m124459x9616526c());
            }
        }
    }

    public static void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderConfig", "initSimple");
        di3.f0 f0Var = new di3.f0();
        f314303d = f0Var;
        f0Var.f314237e = false;
        f0Var.f314238f = false;
        if (fp.h.c(19)) {
            f314303d.f314233a = 2;
        } else {
            f314303d.f314233a = 1;
        }
    }

    public static void e(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, di3.v vVar) {
        int r17;
        int r18;
        int i17;
        f314301b = false;
        f314302c = false;
        f314304e = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getLargeMemoryClass();
        f314305f = ai3.d.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.String m07 = com.p314xaae8f345.mm.p2621x8fb0427b.la.m0();
        boolean z17 = vVar == di3.v.MMSightCameraNotLoginConfig && !gm0.j1.b().n();
        int P = z17 ? 19 : (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SightMediaCodecMinApiLevel"), 19) : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().mo66813xbfca20ab("SightMediaCodecMinApiLevel"), 19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderConfig", "MXM_DynaCfg_AV_Item_Key_SightMediaCodecMinApiLevel: %s", java.lang.Integer.valueOf(P));
        if (!z17) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                gm0.j1.i();
                wo.v1.a(gm0.j1.u().j().n0(77825));
            } else {
                wo.v1.a(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66811xad307fc());
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(f314304e);
        java.lang.Double valueOf2 = java.lang.Double.valueOf(f314305f);
        wo.g1 g1Var = wo.v1.f529362i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderConfig", "init large memory class: %sMB, totalMemory: %sGB  fingerprint: %s mmSightRecorderInfo: %s", valueOf, valueOf2, m07, g1Var);
        if (z17) {
            r18 = 1;
            r17 = -1;
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            gm0.j1.i();
            r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_SETTING_PRESET_INT_SYNC, -1);
            gm0.j1.i();
            r18 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_FOCUS_INT_SYNC, 1);
            gm0.j1.i();
            gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_CAPTURE_TYPE_INT_SYNC, 1);
            gm0.j1.i();
            gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_CAMERA_API_INT_SYNC, 2);
        } else {
            r17 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66817xb58848b9(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_SETTING_PRESET_INT_SYNC, -1);
            r18 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66817xb58848b9(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_FOCUS_INT_SYNC, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66817xb58848b9(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_CAPTURE_TYPE_INT_SYNC, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66817xb58848b9(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_CAMERA_API_INT_SYNC, 2);
        }
        di3.f0 a17 = di3.f0.a(r17, c11120x15dce88d);
        f314303d = a17;
        if (a17 != null) {
            a17.f314240h = r18 == 1;
            f314301b = true;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
            java.lang.Object[] objArr = new java.lang.Object[1];
            di3.f0 f0Var = f314303d;
            objArr[0] = f0Var == null ? "" : java.lang.Integer.valueOf(f0Var.f314235c);
            db5.t7.m123883x26a183b(context, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573828fz2, objArr), 1).show();
            return;
        }
        if (vVar.ordinal() != 1) {
            i17 = g1Var.f529227h;
        } else {
            int i18 = wo.v1.f529363j.f529227h;
            i17 = 12;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderConfig", "recorderOption: %s", java.lang.Integer.valueOf(i17));
        if (i17 != -1) {
            f314303d = di3.f0.a(i17, c11120x15dce88d);
        }
        di3.f0 f0Var2 = f314303d;
        if (f0Var2 != null) {
            if (r18 == 1) {
                f0Var2.f314240h = true;
            } else {
                f0Var2.f314240h = false;
            }
            f314302c = true;
            return;
        }
        di3.f0 a18 = di3.f0.a(1, c11120x15dce88d);
        f314303d = a18;
        if (r18 == 1) {
            a18.f314240h = true;
        } else {
            a18.f314240h = false;
        }
        a18.getClass();
        f314303d.getClass();
        int i19 = g1Var.f529220a;
        if (i19 != -1) {
            f314303d.f314233a = i19;
        } else {
            if (fp.h.c(P)) {
                f314303d.f314233a = 2;
            } else {
                f314303d.f314233a = 1;
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_flash_record_use_soft, false)) {
                f314303d.f314233a = 1;
            }
        }
        int i27 = g1Var.f529223d;
        if (i27 != -1) {
            f314300a = i27 == 1;
        }
        int i28 = g1Var.f529221b;
        if (i28 != -1) {
            f314303d.f314237e = i28 == 1;
        } else {
            f314303d.f314237e = false;
        }
    }
}
