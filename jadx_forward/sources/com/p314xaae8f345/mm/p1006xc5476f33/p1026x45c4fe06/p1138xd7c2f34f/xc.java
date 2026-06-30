package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes7.dex */
public final class xc extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f166953d = false;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f166954e;

    public void Ai() {
        java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().a()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it.next();
            if (!sVar.f129221e) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().s(sVar.f129217a, -1);
            }
        }
    }

    public void Bi(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        java.lang.String appId = android.text.TextUtils.isEmpty(str2) ? k91.k4.e(str) : str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppLauncher", "closeWxaApp() identity:[%s | %s]->[%s | %s], versionType:%d, allowBackgroundRunning:%b", str, str2, str, appId, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (android.text.TextUtils.isEmpty(appId)) {
            return;
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().s(appId, i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 C = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        C.i(appId, i17, new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.k(C));
    }

    public final void Di() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f166954e;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f166954e = null;
        }
    }

    public boolean Ni() {
        return com.p314xaae8f345.p3210x3857dc.b.m().h("dis_set_back_ground_color", "tools", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Ri(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, ot0.q qVar, android.os.Bundle bundle) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        if ((bundle != null && bundle.getBoolean("stat_kf_guide", false)) == true) {
            c12559xbdae8559.f169323f = 1157;
            c12559xbdae8559.f169324g = str;
        } else {
            ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
            if (aVar == null || (i17 = aVar.O) <= 0) {
                c12559xbdae8559.f169323f = 1036;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppLauncher", "launchByOpenSdkAppMessage use VISIT_SCENE_FROM_OPEN_SDK scene");
            } else {
                c12559xbdae8559.f169323f = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppLauncher", "launchByOpenSdkAppMessage use launchscene:%d", java.lang.Integer.valueOf(i17));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str3 = qVar.f430179d;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 == null) {
                str3 = "";
            }
            sb6.append(str3);
            sb6.append(":");
            java.lang.String str4 = qVar.f430207k;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String a17 = fp.s0.a(str4);
            if (a17 == null) {
                a17 = "";
            }
            sb6.append(a17);
            c12559xbdae8559.f169324g = sb6.toString();
        }
        c12559xbdae8559.f169321d = z17 ? 2 : 1;
        c12559xbdae8559.f169322e = z17 ? java.lang.String.format("%s:%s", str, str2) : str2;
        c12559xbdae8559.f169334t = str;
        c12559xbdae8559.f169335u = str2;
        c12559xbdae8559.f169336v = 1;
        c12559xbdae8559.f169333s = bundle.getString("stat_msg_id", "");
        com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9 c11105x57aff1b9 = new com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9();
        c12559xbdae8559.f169331q = bundle.getInt("chat_type", -1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430226o2)) {
            c12559xbdae8559.f169324g += ":0";
        } else {
            c11105x57aff1b9.f151948d = str;
            c11105x57aff1b9.f151949e = qVar.f430226o2;
            c12559xbdae8559.f169324g += ":1";
        }
        c11105x57aff1b9.f151952h = qVar.f430250u2;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(c12559xbdae8559.f169324g);
        sb7.append(":");
        java.lang.String str5 = qVar.f430222n2;
        if (str5 == null) {
            str5 = "";
        }
        sb7.append(str5);
        c12559xbdae8559.f169324g = sb7.toString();
        c12559xbdae8559.f169324g += ":" + bundle.getInt("chat_type", -1);
        c12559xbdae8559.f169324g += ":" + str;
        if (c12559xbdae8559.f169323f == 1157) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(c12559xbdae8559.f169324g);
            sb8.append(":");
            java.lang.String str6 = qVar.f430179d;
            if (str6 == null) {
                str6 = "";
            }
            sb8.append(str6);
            c12559xbdae8559.f169324g = sb8.toString();
        }
        int i19 = c12559xbdae8559.f169323f;
        if ((i19 == 1036 || i19 == 1346) && ((i18 = bundle.getInt("stat_scene", 0)) == 2 || i18 == 1)) {
            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(qVar.f430206j2);
            c12559xbdae8559.f169324g += ":" + (k01.f.g(qVar, Bi) ? 1 : 0) + ":" + (k01.f.f(qVar, Bi) ? 1 : 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        c11812xa040dc98.f158855d = 4;
        c11812xa040dc98.f158856e = qVar.f430179d;
        java.lang.String str7 = z17 ? str : "";
        java.lang.String str8 = qVar.f430206j2;
        java.lang.String str9 = qVar.f430210k2;
        java.lang.String str10 = qVar.f430202i2;
        int i27 = qVar.f430270z2;
        int i28 = qVar.A2;
        int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.f165881r;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9)) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x.f166565a).c(context, str8, str9, str10, i27, i28, c12559xbdae8559, c11812xa040dc98, c11105x57aff1b9, str7, str);
    }

    public void Ui(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, java.lang.String str4, java.lang.String str5) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        c11812xa040dc98.f158855d = 7;
        c11812xa040dc98.f158856e = str4;
        c11812xa040dc98.f158865q = str5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.e7(context, str, str2, str3, i17, i18, c12559xbdae8559, c11812xa040dc98, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r0 != 1036) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Vi(android.content.Context r10, java.lang.String r11, java.lang.String r12, int r13, int r14, java.lang.String r15, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 r16, java.lang.String r17) {
        /*
            r9 = this;
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r7 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
            r7.<init>()
            r6 = r16
            int r0 = r6.f169323f
            r1 = 1020(0x3fc, float:1.43E-42)
            if (r0 == r1) goto L38
            r1 = 1043(0x413, float:1.462E-42)
            if (r0 == r1) goto L38
            r1 = 1055(0x41f, float:1.478E-42)
            if (r0 == r1) goto L34
            r1 = 1069(0x42d, float:1.498E-42)
            if (r0 == r1) goto L30
            r1 = 1082(0x43a, float:1.516E-42)
            if (r0 == r1) goto L38
            r1 = 1102(0x44e, float:1.544E-42)
            if (r0 == r1) goto L38
            r1 = 1346(0x542, float:1.886E-42)
            if (r0 == r1) goto L30
            r1 = 1035(0x40b, float:1.45E-42)
            if (r0 == r1) goto L38
            r1 = 1036(0x40c, float:1.452E-42)
            if (r0 == r1) goto L30
        L2d:
            r0 = r17
            goto L3c
        L30:
            r0 = 4
            r7.f158855d = r0
            goto L2d
        L34:
            r0 = 2
            r7.f158855d = r0
            goto L2d
        L38:
            r0 = 5
            r7.f158855d = r0
            goto L2d
        L3c:
            r7.f158856e = r0
            r8 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r15
            r4 = r13
            r5 = r14
            r6 = r16
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.e7(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc.Vi(android.content.Context, java.lang.String, java.lang.String, int, int, java.lang.String, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject, java.lang.String):void");
    }

    public void Zi(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, int i18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeAppLauncher", "targetAppId %s referrerAppId %s, Null Or Nil");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1055;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(fp.s0.a(str == null ? "" : str));
        sb6.append(":");
        sb6.append(str2);
        sb6.append(":");
        sb6.append(i18);
        c12559xbdae8559.f169324g = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        c11812xa040dc98.f158856e = str2;
        c11812xa040dc98.f158855d = 2;
        c11812xa040dc98.f158860i = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.e7(context, null, str3, str4, i17, -1, c12559xbdae8559, c11812xa040dc98, null);
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    public void aj(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.e7(context, str, str2, str3, i17, i18, c12559xbdae8559, null, null);
    }

    public void bj(android.content.Context context, l81.b1 b1Var) {
        android.app.Activity a17;
        android.view.Window window;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5 g5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.f166152a;
        try {
            g5Var.a(b1Var);
            if (b1Var.Y != null && !k01.j.f384572a.b(b1Var.f398545a, b1Var.f398547b)) {
                b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, -2, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), true, true, false, false, 24, null), false, null, k91.t2.f387299d, false, false, null, null, false, true, null, false, 0, null, -2, 0, 0, false, false, false, null, false, null, 0, false, null, true, 0, false, false, false, false, null, null, null, false, null, null, false, -1342448020, 2043, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x.f166565a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc g17 = g5Var.g(b1Var);
            if (k91.z3.TRANSPARENT == b1Var.H && b1Var.f398544J && (a17 = q75.a.a(context)) != null && (window = a17.getWindow()) != null) {
                com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8 c3898xeaad22a8 = g17.K;
                if (c3898xeaad22a8 == null) {
                    c3898xeaad22a8 = new com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8(false, 0, null, null, false, null, null, 127, null);
                }
                g17.K = c3898xeaad22a8;
                c3898xeaad22a8.f128819d = true;
                c3898xeaad22a8.f128820e = window.getNavigationBarColor();
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a) xVar).a(context, g17);
        } catch (java.lang.Exception e17) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.ExportWxaInstrumentation", e17, "", new java.lang.Object[0]);
        }
    }

    public void cj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.g6 g6Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk isMain[%b]", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.uc ucVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.uc(this, g6Var);
        this.f166953d = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.vc vcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.vc(this, ucVar, str, str2);
        Di();
        this.f166954e = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, vcVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.h(1, str2, str3, str, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.wc(this, ucVar, str, str2, i17));
    }

    public void fj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18) {
        this.f166953d = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.sc scVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.sc(this, str3);
        Di();
        this.f166954e = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, scVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.h(2, str3, str4, str2, str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.tc(this, str3, str, str2, i18, context, i17));
    }

    public void hj(l81.e1 uiCallback) {
        if (uiCallback != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.od odVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.od.f166407a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCallback, "uiCallback");
            android.util.SparseIntArray sparseIntArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.od.f166409c;
            synchronized (sparseIntArray) {
                sparseIntArray.put(uiCallback.hashCode(), 1);
            }
        }
    }

    public void ij(l81.b1 b1Var, l81.v0 v0Var) {
        if (b1Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u1.f170794a.a(b1Var, v0Var);
    }

    public boolean wi(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5 g5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.f166152a;
        if (g5Var.d(str) || g5Var.e()) {
            i17 = -1;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().A(str, i17);
    }
}
