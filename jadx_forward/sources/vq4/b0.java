package vq4;

/* loaded from: classes14.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vq4.b0 f520803a = new vq4.b0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f520804b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f520805c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f520806d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f520807e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f520808f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f520809g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f520810h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f520811i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f520812j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f520813k;

    static {
        f520811i = android.os.Process.myUid() / 100000 != 0;
    }

    public static final boolean c() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_decode_thread_independence, true);
    }

    public static final boolean d() {
        if (rs0.n.f480839d.f() > 70) {
            return true;
        }
        bm5.o1 o1Var = bm5.o1.f104252a;
        bm5.h0 h0Var = bm5.h0.RepairerConfig_VOIP_ForceFaceBeautyUseLowConfig_Int;
        return !(o1Var.g(h0Var, -1) != -1 ? o1Var.g(h0Var, -1) != 1 : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clifig_voip_xsetting_force_beauty_lowconfig, false));
    }

    public static final boolean f() {
        boolean Ui = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRendererHelper", "checkVoIPShortcutAnswer: isBluetoothScoSupported: " + Ui);
        if (!Ui) {
            return false;
        }
        nq4.f fVar = nq4.f.f420547a;
        int i17 = nq4.f.f420548b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRendererHelper", "checkVoIPShortcutAnswer: voipCoreType: " + i17);
        if (i17 == 1) {
            bm5.o1 o1Var = bm5.o1.f104252a;
            int h17 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2581x765f0e50.C20818x7afb15f7());
            new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2581x765f0e50.C20818x7afb15f7();
            java.lang.Integer num = -1;
            return ((num instanceof java.lang.Integer) && h17 == num.intValue()) ? j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2581x765f0e50.C20818x7afb15f7()) == 1 : o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2581x765f0e50.C20818x7afb15f7()) == 1;
        }
        if (i17 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRendererHelper", "checkVoIPShortcutAnswer: Invalid VoipCoreType");
            return false;
        }
        boolean z17 = android.provider.Settings.Global.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "bluetooth_voip_state", 0) == 1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Bluetooth_voip_state: ");
        sb6.append(z17);
        sb6.append(" useBTQuickAccept: ");
        vq4.b0 b0Var = f520803a;
        sb6.append(b0Var.m());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRendererHelper", sb6.toString());
        if (z17) {
            return b0Var.m();
        }
        return false;
    }

    public static final boolean g() {
        nq4.f fVar = nq4.f.f420547a;
        int i17 = nq4.f.f420548b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRendererHelper", "checkVoIPShortcutAnswer: voipCoreType: " + i17);
        if (i17 != 1) {
            if (i17 == 3) {
                return f520803a.m();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRendererHelper", "checkVoIPShortcutAnswer: Invalid VoipCoreType");
            return false;
        }
        bm5.o1 o1Var = bm5.o1.f104252a;
        int h17 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2581x765f0e50.C20818x7afb15f7());
        new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2581x765f0e50.C20818x7afb15f7();
        java.lang.Integer num = -1;
        return ((num instanceof java.lang.Integer) && h17 == num.intValue()) ? j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2581x765f0e50.C20818x7afb15f7()) == 1 : o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2581x765f0e50.C20818x7afb15f7()) == 1;
    }

    public static final boolean h() {
        java.lang.Object obj;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_support_shortcut_voip_manufacture_list, "", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi, "getExpt(...)");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Zi, "")) {
            return true;
        }
        java.util.Iterator it = r26.n0.f0(Zi, new java.lang.String[]{","}, false, 0, 6, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (r26.i0.p((java.lang.String) obj, android.os.Build.MANUFACTURER, false)) {
                break;
            }
        }
        return obj != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int i() {
        /*
            vq4.b0 r0 = vq4.b0.f520803a
            boolean r0 = r0.b()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3b
            bm5.o1 r0 = bm5.o1.f104252a
            bm5.h0 r3 = bm5.h0.RepairerConfig_VOIP_FaceBeautyParams_Int
            r4 = -1
            int r5 = r0.g(r3, r4)
            r6 = 2
            if (r5 == r4) goto L20
            int r0 = r0.g(r3, r4)
            if (r0 != r6) goto L1e
            r0 = r2
            goto L36
        L1e:
            r0 = r1
            goto L36
        L20:
            wo.o r0 = wo.v1.f529366m
            int r0 = r0.f529300y
            if (r0 != r2) goto L1e
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r3 = e42.d0.clicfg_voip_xsetting_allow_voip_use_facebeautyrank
            h62.d r0 = (h62.d) r0
            boolean r0 = r0.fj(r3, r1)
        L36:
            if (r0 == 0) goto L39
            goto L3c
        L39:
            r6 = r2
            goto L3c
        L3b:
            r6 = r1
        L3c:
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_FACEBEAUTY_CUSTOM_STRING
            r4 = 0
            java.lang.String r0 = r0.v(r3, r4)
            if (r0 != 0) goto L4e
            return r6
        L4e:
            cl0.g r3 = new cl0.g
            r3.<init>(r0)
            java.lang.String r0 = "version"
            boolean r4 = r3.has(r0)     // Catch: java.lang.Exception -> L65
            if (r4 != r2) goto L5d
            r1 = r2
        L5d:
            if (r1 == 0) goto L72
            int r0 = r3.getInt(r0)     // Catch: java.lang.Exception -> L65
            r6 = r0
            goto L72
        L65:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "safeGetInt"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r2, r1, r0)
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vq4.b0.i():int");
    }

    public static final android.util.Size j() {
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_VOIP_ForceHardCameraInit_Int, 0);
        if (g17 == 0) {
            return null;
        }
        if (g17 == 1) {
            return new android.util.Size(480, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
        }
        if (g17 == 2) {
            return new android.util.Size(640, 480);
        }
        if (g17 == 3) {
            return new android.util.Size(1280, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf);
        }
        if (g17 != 4) {
            return null;
        }
        return new android.util.Size(1920, 1080);
    }

    public static final android.util.Size k() {
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_VOIP_ForceHardEncode_Int, 0);
        if (g17 == 1) {
            return new android.util.Size(480, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
        }
        if (g17 == 2) {
            return new android.util.Size(640, 480);
        }
        if (g17 == 3) {
            return new android.util.Size(1280, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf);
        }
        if (g17 != 4) {
            return null;
        }
        return new android.util.Size(1920, 1080);
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab l() {
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_FACEBEAUTY_CUSTOM_STRING, "");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v17, "") ? n() : new com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab(new cl0.g(v17));
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab n() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab c19568xd45988ab;
        int i17 = c01.z1.g().I;
        boolean d17 = d();
        if (!(!(bm5.o1.f104252a.e(bm5.h0.RepairerConfig_VOIP_XEffectConfigEnable_Float, 0.0f) == 0.0f))) {
            java.lang.String Zi = i17 == 2 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_voip_xsetting_female_beauty_config, null, true) : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_voip_xsetting_male_beauty_config, null, true);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
                try {
                    cl0.g a17 = d17 ? new cl0.g(Zi).a("high") : new cl0.g(Zi).a("low");
                    vq4.b0 b0Var = f520803a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                    return b0Var.r(a17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipRendererHelper", e17, "getXSettingVoipBeautyConfig error", new java.lang.Object[0]);
                }
            }
            if (d17) {
                c19568xd45988ab = new com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab();
                c19568xd45988ab.f270135m = 15;
                c19568xd45988ab.f270132g = i17 != 2 ? 25 : 40;
                c19568xd45988ab.f270138p = i17 == 2 ? 80 : 60;
                c19568xd45988ab.f270139q = i17 != 2 ? 60 : 80;
                c19568xd45988ab.f270136n = i17 == 2 ? 30 : 25;
                c19568xd45988ab.f270140r = 25;
                c19568xd45988ab.f270131f = true;
                c19568xd45988ab.H = 10;
                c19568xd45988ab.f270134i = 0;
                c19568xd45988ab.f270137o = 0;
                c19568xd45988ab.f270141s = 0;
                c19568xd45988ab.f270142t = 0;
                c19568xd45988ab.f270143u = 0;
                c19568xd45988ab.f270144v = 0;
                c19568xd45988ab.f270145w = 0;
                c19568xd45988ab.f270146x = 0;
                c19568xd45988ab.f270147y = 0;
                c19568xd45988ab.f270148z = 0;
                c19568xd45988ab.A = 0;
                c19568xd45988ab.B = 0;
                c19568xd45988ab.C = 0;
                c19568xd45988ab.D = 0;
                c19568xd45988ab.E = 0;
                c19568xd45988ab.F = 0;
                c19568xd45988ab.G = 0;
            } else {
                c19568xd45988ab = new com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab();
                c19568xd45988ab.f270135m = 15;
                c19568xd45988ab.f270132g = i17 != 2 ? 25 : 40;
                c19568xd45988ab.f270131f = false;
                c19568xd45988ab.f270140r = 25;
            }
            return c19568xd45988ab;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab c19568xd45988ab2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab();
        ar4.e eVar = ar4.e.f94946a;
        java.lang.Integer a18 = eVar.a("skinBright");
        c19568xd45988ab2.f270135m = a18 != null ? a18.intValue() : 0;
        java.lang.Integer a19 = eVar.a("skinSmooth");
        c19568xd45988ab2.f270132g = a19 != null ? a19.intValue() : 0;
        java.lang.Integer a27 = eVar.a("eyePouch");
        c19568xd45988ab2.f270138p = a27 != null ? a27.intValue() : 0;
        java.lang.Integer a28 = eVar.a("smileFolds");
        c19568xd45988ab2.f270139q = a28 != null ? a28.intValue() : 0;
        java.lang.Integer a29 = eVar.a("eyeBright");
        c19568xd45988ab2.f270136n = a29 != null ? a29.intValue() : 0;
        java.lang.Integer a37 = eVar.a("sharpen");
        c19568xd45988ab2.f270140r = a37 != null ? a37.intValue() : 0;
        java.lang.Integer a38 = eVar.a("filterRate");
        c19568xd45988ab2.f270131f = (a38 != null ? a38.intValue() : 0) != 0;
        java.lang.Integer a39 = eVar.a("filterRate");
        c19568xd45988ab2.H = a39 != null ? a39.intValue() : 0;
        java.lang.Integer a47 = eVar.a("faceMorph");
        c19568xd45988ab2.f270134i = a47 != null ? a47.intValue() : 0;
        java.lang.Integer a48 = eVar.a("rosy");
        c19568xd45988ab2.f270137o = a48 != null ? a48.intValue() : 0;
        java.lang.Integer a49 = eVar.a("teethBright");
        c19568xd45988ab2.f270141s = a49 != null ? a49.intValue() : 0;
        java.lang.Integer a57 = eVar.a("smallHead");
        c19568xd45988ab2.f270142t = a57 != null ? a57.intValue() : 0;
        java.lang.Integer a58 = eVar.a("cheekBone");
        c19568xd45988ab2.f270143u = a58 != null ? a58.intValue() : 0;
        java.lang.Integer a59 = eVar.a("lowerJawBone");
        c19568xd45988ab2.f270144v = a59 != null ? a59.intValue() : 0;
        java.lang.Integer a67 = eVar.a("wingOfNose");
        c19568xd45988ab2.f270145w = a67 != null ? a67.intValue() : 0;
        java.lang.Integer a68 = eVar.a("chinShort");
        c19568xd45988ab2.f270146x = a68 != null ? a68.intValue() : 0;
        java.lang.Integer a69 = eVar.a("chinLong");
        c19568xd45988ab2.f270147y = a69 != null ? a69.intValue() : 0;
        java.lang.Integer a76 = eVar.a("hairLineHigh");
        c19568xd45988ab2.f270148z = a76 != null ? a76.intValue() : 0;
        java.lang.Integer a77 = eVar.a("hairLineLow");
        c19568xd45988ab2.A = a77 != null ? a77.intValue() : 0;
        java.lang.Integer a78 = eVar.a("bigEye");
        c19568xd45988ab2.B = a78 != null ? a78.intValue() : 0;
        java.lang.Integer a79 = eVar.a("boySlim");
        c19568xd45988ab2.C = a79 != null ? a79.intValue() : 0;
        java.lang.Integer a86 = eVar.a("girlSlim");
        c19568xd45988ab2.D = a86 != null ? a86.intValue() : 0;
        java.lang.Integer a87 = eVar.a("mouthMorph");
        c19568xd45988ab2.E = a87 != null ? a87.intValue() : 0;
        java.lang.Integer a88 = eVar.a("zhaiLian");
        c19568xd45988ab2.F = a88 != null ? a88.intValue() : 0;
        java.lang.Integer a89 = eVar.a("contour");
        c19568xd45988ab2.G = a89 != null ? a89.intValue() : 0;
        return c19568xd45988ab2;
    }

    public static final void o() {
        f520805c = true;
        f520812j = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_fix_camera_fold_up, true);
        ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voip_camera_black_retry_timeout, 10);
        bm5.o1 o1Var = bm5.o1.f104252a;
        bm5.h0 h0Var = bm5.h0.RepairerConfig_VOIP_VoIPPreRender_Int;
        f520804b = o1Var.g(h0Var, 0) != 0 ? o1Var.g(h0Var, 0) == 1 : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_xsetting_voip_prerender, true);
        f520806d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_orientation_enable, false);
        f520810h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d().getBoolean("settings_landscape_mode", false);
        boolean A = com.p314xaae8f345.mm.ui.bk.A();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_orientation_pad_ignore_landscape_mode, false);
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_orientation_check_landscape_mode, true);
        if ((!A || !fj6) && fj7) {
            f520806d &= f520810h;
        }
        boolean z17 = f520806d;
        boolean z18 = f520811i;
        f520806d = z17 && !z18;
        f520807e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_orientation_apply_system_rotate_locked_enable, false);
        f520808f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_orientation_float_window_enable, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRendererHelper", "initVoIPStrategy, isPad:" + A + ", padIgnoreLandscapeMode:" + fj6 + ", checkLandscapeMode:" + fj7 + ", isLandscapeMode:" + f520810h + ", isMultipleUser:" + z18 + ", adaptiveRotateEnable:" + f520806d + ", adaptiveRotateApplySystemRotateLockedEnable:" + f520807e + ", adaptiveRotateFloatWindowEnable:" + f520808f);
        f520809g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_launch_fs_wait_flutter_engine_android, false);
        ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ringtone_ilink_floatcard_playing, true);
        f520813k = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_fix_render_reuse_error, false);
    }

    public static final boolean p() {
        bm5.o1 o1Var = bm5.o1.f104252a;
        bm5.h0 h0Var = bm5.h0.RepairerConfig_VOIP_CameraChangePreviewSizeLow_Int;
        if (o1Var.g(h0Var, 0) != 0) {
            return o1Var.g(h0Var, 0) == 1;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_camera_change_previewsize_lower, false);
    }

    public static final boolean q() {
        return (wo.w0.m().equals("MI 5C") && fp.e0.i()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r6 = this;
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_FACEBEAUTY_CUSTOM_STRING
            java.lang.String r2 = ""
            java.lang.String r0 = r0.v(r1, r2)
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r2)
            if (r1 != 0) goto L44
            if (r0 != 0) goto L19
            goto L44
        L19:
            cl0.g r1 = new cl0.g
            r1.<init>(r0)
            java.lang.String r0 = "version"
            r3 = 1
            r4 = 0
            boolean r5 = r1.has(r0)     // Catch: java.lang.Exception -> L33
            if (r5 != r3) goto L2b
            r5 = r3
            goto L2c
        L2b:
            r5 = r4
        L2c:
            if (r5 == 0) goto L3e
            int r0 = r1.getInt(r0)     // Catch: java.lang.Exception -> L33
            goto L3f
        L33:
            r0 = move-exception
            java.lang.String r1 = "safeGetInt"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r2, r0)
        L3e:
            r0 = r4
        L3f:
            if (r0 == 0) goto L42
            goto L48
        L42:
            r3 = r4
            goto L48
        L44:
            boolean r3 = r6.b()
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vq4.b0.a():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fd, code lost:
    
        if (r8 >= 0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vq4.b0.b():boolean");
    }

    public final boolean e(java.lang.String str) {
        cl0.g gVar = new cl0.g(str);
        int optInt = gVar.optInt("code");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRendererHelper", "gpu faceBeauty black list is " + str);
        java.lang.String e17 = rs0.n.f480839d.e();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            return false;
        }
        try {
            cl0.g gVar2 = new cl0.g(e17);
            boolean z17 = true;
            if (optInt != 0) {
                if (optInt != gVar2.optInt("code")) {
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRendererHelper", "code is fit " + z17 + " cause code fit");
                }
            } else {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.mo15082x48bce8a4("vendor"), gVar2.mo15082x48bce8a4("vendor")) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.mo15082x48bce8a4(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d), gVar2.mo15082x48bce8a4(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d)) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.mo15082x48bce8a4("version"), gVar2.mo15082x48bce8a4("version"))) {
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRendererHelper", "code is fit " + z17 + " cause name and vendor and version fit");
                }
            }
            return z17;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipRendererHelper", e18, "checkPermissionByGpuInfo error", new java.lang.Object[0]);
            return false;
        }
    }

    public final boolean m() {
        int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2538xd14fac7c.C20341xb5a9b006());
        if (h17 == -1) {
            return false;
        }
        if (h17 == 1) {
            return true;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_ilink_bluetooth_quick_accept_enable, false);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab r(cl0.g gVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab c19568xd45988ab = new com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab();
        double d17 = 100;
        c19568xd45988ab.f270132g = (int) (gVar.optDouble("skinSmooth") * d17);
        c19568xd45988ab.f270135m = (int) (gVar.optDouble("skinBright") * d17);
        c19568xd45988ab.B = (int) (gVar.optDouble("eyeBigger") * d17);
        c19568xd45988ab.f270136n = (int) (gVar.optDouble("eyeBright") * d17);
        c19568xd45988ab.f270134i = (int) (gVar.optDouble("faceThin") * d17);
        c19568xd45988ab.f270140r = (int) (gVar.optDouble("sharpenFilter") * d17);
        c19568xd45988ab.f270142t = (int) (gVar.optDouble("smallHead") * d17);
        c19568xd45988ab.f270139q = (int) (gVar.optDouble("smileFolds") * d17);
        c19568xd45988ab.f270138p = (int) (gVar.optDouble("eyePouch") * d17);
        c19568xd45988ab.f270141s = (int) (gVar.optDouble("teethBright") * d17);
        c19568xd45988ab.f270145w = (int) (gVar.optDouble("wingOfNose") * d17);
        c19568xd45988ab.f270144v = (int) (gVar.optDouble("lowerJawbone") * d17);
        c19568xd45988ab.f270143u = (int) (gVar.optDouble("cheekBone") * d17);
        c19568xd45988ab.H = (int) (gVar.optDouble("naturalFilter") * d17);
        return c19568xd45988ab;
    }
}
