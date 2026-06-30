package com.tencent.mm.plugin.appbrand.launching;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public final class xc extends i95.w implements com.tencent.mm.plugin.appbrand.service.h6 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f85420d = false;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f85421e;

    public void Ai() {
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.plugin.appbrand.task.u0.C().a()).iterator();
        while (it.hasNext()) {
            com.tencent.luggage.sdk.processes.s sVar = (com.tencent.luggage.sdk.processes.s) it.next();
            if (!sVar.f47688e) {
                com.tencent.mm.plugin.appbrand.task.u0.C().s(sVar.f47684a, -1);
            }
        }
    }

    public void Bi(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        java.lang.String appId = android.text.TextUtils.isEmpty(str2) ? k91.k4.e(str) : str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeAppLauncher", "closeWxaApp() identity:[%s | %s]->[%s | %s], versionType:%d, allowBackgroundRunning:%b", str, str2, str, appId, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (android.text.TextUtils.isEmpty(appId)) {
            return;
        }
        if (!z17) {
            com.tencent.mm.plugin.appbrand.task.u0.C().s(appId, i17);
            return;
        }
        com.tencent.mm.plugin.appbrand.task.u0 C = com.tencent.mm.plugin.appbrand.task.u0.C();
        kotlin.jvm.internal.o.g(appId, "appId");
        C.i(appId, i17, new com.tencent.luggage.sdk.processes.k(C));
    }

    public final void Di() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f85421e;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f85421e = null;
        }
    }

    public boolean Ni() {
        return com.tencent.xweb.b.m().h("dis_set_back_ground_color", "tools", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Ri(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, ot0.q qVar, android.os.Bundle bundle) {
        int i17;
        int i18;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        if ((bundle != null && bundle.getBoolean("stat_kf_guide", false)) == true) {
            appBrandStatObject.f87790f = 1157;
            appBrandStatObject.f87791g = str;
        } else {
            ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
            if (aVar == null || (i17 = aVar.O) <= 0) {
                appBrandStatObject.f87790f = 1036;
                com.tencent.mars.xlog.Log.i("MicroMsg.WeAppLauncher", "launchByOpenSdkAppMessage use VISIT_SCENE_FROM_OPEN_SDK scene");
            } else {
                appBrandStatObject.f87790f = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.WeAppLauncher", "launchByOpenSdkAppMessage use launchscene:%d", java.lang.Integer.valueOf(i17));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str3 = qVar.f348646d;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str3 == null) {
                str3 = "";
            }
            sb6.append(str3);
            sb6.append(":");
            java.lang.String str4 = qVar.f348674k;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String a17 = fp.s0.a(str4);
            if (a17 == null) {
                a17 = "";
            }
            sb6.append(a17);
            appBrandStatObject.f87791g = sb6.toString();
        }
        appBrandStatObject.f87788d = z17 ? 2 : 1;
        appBrandStatObject.f87789e = z17 ? java.lang.String.format("%s:%s", str, str2) : str2;
        appBrandStatObject.f87801t = str;
        appBrandStatObject.f87802u = str2;
        appBrandStatObject.f87803v = 1;
        appBrandStatObject.f87800s = bundle.getString("stat_msg_id", "");
        com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional = new com.tencent.mm.modelappbrand.LaunchParamsOptional();
        appBrandStatObject.f87798q = bundle.getInt("chat_type", -1);
        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348693o2)) {
            appBrandStatObject.f87791g += ":0";
        } else {
            launchParamsOptional.f70415d = str;
            launchParamsOptional.f70416e = qVar.f348693o2;
            appBrandStatObject.f87791g += ":1";
        }
        launchParamsOptional.f70419h = qVar.f348717u2;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(appBrandStatObject.f87791g);
        sb7.append(":");
        java.lang.String str5 = qVar.f348689n2;
        if (str5 == null) {
            str5 = "";
        }
        sb7.append(str5);
        appBrandStatObject.f87791g = sb7.toString();
        appBrandStatObject.f87791g += ":" + bundle.getInt("chat_type", -1);
        appBrandStatObject.f87791g += ":" + str;
        if (appBrandStatObject.f87790f == 1157) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(appBrandStatObject.f87791g);
            sb8.append(":");
            java.lang.String str6 = qVar.f348646d;
            if (str6 == null) {
                str6 = "";
            }
            sb8.append(str6);
            appBrandStatObject.f87791g = sb8.toString();
        }
        int i19 = appBrandStatObject.f87790f;
        if ((i19 == 1036 || i19 == 1346) && ((i18 = bundle.getInt("stat_scene", 0)) == 2 || i18 == 1)) {
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(qVar.f348673j2);
            appBrandStatObject.f87791g += ":" + (k01.f.g(qVar, Bi) ? 1 : 0) + ":" + (k01.f.f(qVar, Bi) ? 1 : 0);
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77322d = 4;
        appBrandLaunchReferrer.f77323e = qVar.f348646d;
        java.lang.String str7 = z17 ? str : "";
        java.lang.String str8 = qVar.f348673j2;
        java.lang.String str9 = qVar.f348677k2;
        java.lang.String str10 = qVar.f348669i2;
        int i27 = qVar.f348737z2;
        int i28 = qVar.A2;
        int i29 = com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.f84348r;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str8) && com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
            return;
        }
        ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).c(context, str8, str9, str10, i27, i28, appBrandStatObject, appBrandLaunchReferrer, launchParamsOptional, str7, str);
    }

    public void Ui(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, java.lang.String str4, java.lang.String str5) {
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77322d = 7;
        appBrandLaunchReferrer.f77323e = str4;
        appBrandLaunchReferrer.f77332q = str5;
        com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.e7(context, str, str2, str3, i17, i18, appBrandStatObject, appBrandLaunchReferrer, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r0 != 1036) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Vi(android.content.Context r10, java.lang.String r11, java.lang.String r12, int r13, int r14, java.lang.String r15, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r16, java.lang.String r17) {
        /*
            r9 = this;
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r7 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
            r7.<init>()
            r6 = r16
            int r0 = r6.f87790f
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
            r7.f77322d = r0
            goto L2d
        L34:
            r0 = 2
            r7.f77322d = r0
            goto L2d
        L38:
            r0 = 5
            r7.f77322d = r0
            goto L2d
        L3c:
            r7.f77323e = r0
            r8 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r15
            r4 = r13
            r5 = r14
            r6 = r16
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.e7(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.xc.Vi(android.content.Context, java.lang.String, java.lang.String, int, int, java.lang.String, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject, java.lang.String):void");
    }

    public void Zi(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, int i18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeAppLauncher", "targetAppId %s referrerAppId %s, Null Or Nil");
            return;
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1055;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(fp.s0.a(str == null ? "" : str));
        sb6.append(":");
        sb6.append(str2);
        sb6.append(":");
        sb6.append(i18);
        appBrandStatObject.f87791g = sb6.toString();
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77323e = str2;
        appBrandLaunchReferrer.f77322d = 2;
        appBrandLaunchReferrer.f77327i = str;
        com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.e7(context, null, str3, str4, i17, -1, appBrandStatObject, appBrandLaunchReferrer, null);
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public void aj(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.e7(context, str, str2, str3, i17, i18, appBrandStatObject, null, null);
    }

    public void bj(android.content.Context context, l81.b1 b1Var) {
        android.app.Activity a17;
        android.view.Window window;
        com.tencent.mm.plugin.appbrand.launching.g5 g5Var = com.tencent.mm.plugin.appbrand.launching.g5.f84619a;
        try {
            g5Var.a(b1Var);
            if (b1Var.Y != null && !k01.j.f303039a.b(b1Var.f317012a, b1Var.f317014b)) {
                b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, -2, null, false, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479672c9), true, true, false, false, 24, null), false, null, k91.t2.f305766d, false, false, null, null, false, true, null, false, 0, null, -2, 0, 0, false, false, false, null, false, null, 0, false, null, true, 0, false, false, false, false, null, null, null, false, null, null, false, -1342448020, 2043, null);
            }
            com.tencent.mm.plugin.appbrand.launching.precondition.x xVar = com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a;
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel g17 = g5Var.g(b1Var);
            if (k91.z3.TRANSPARENT == b1Var.H && b1Var.f317011J && (a17 = q75.a.a(context)) != null && (window = a17.getWindow()) != null) {
                com.tencent.luggage.sdk.config.AppBrandInitWindowConfig appBrandInitWindowConfig = g17.K;
                if (appBrandInitWindowConfig == null) {
                    appBrandInitWindowConfig = new com.tencent.luggage.sdk.config.AppBrandInitWindowConfig(false, 0, null, null, false, null, null, 127, null);
                }
                g17.K = appBrandInitWindowConfig;
                appBrandInitWindowConfig.f47286d = true;
                appBrandInitWindowConfig.f47287e = window.getNavigationBarColor();
            }
            ((com.tencent.mm.plugin.appbrand.launching.a) xVar).a(context, g17);
        } catch (java.lang.Exception e17) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.ExportWxaInstrumentation", e17, "", new java.lang.Object[0]);
        }
    }

    public void cj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, com.tencent.mm.plugin.appbrand.service.g6 g6Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk isMain[%b]", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.u3.e()));
        com.tencent.mm.plugin.appbrand.launching.uc ucVar = new com.tencent.mm.plugin.appbrand.launching.uc(this, g6Var);
        this.f85420d = false;
        com.tencent.mm.plugin.appbrand.launching.vc vcVar = new com.tencent.mm.plugin.appbrand.launching.vc(this, ucVar, str, str2);
        Di();
        this.f85421e = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490604zq), true, true, vcVar);
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.h(1, str2, str3, str, null, new com.tencent.mm.plugin.appbrand.launching.wc(this, ucVar, str, str2, i17));
    }

    public void fj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18) {
        this.f85420d = false;
        com.tencent.mm.plugin.appbrand.launching.sc scVar = new com.tencent.mm.plugin.appbrand.launching.sc(this, str3);
        Di();
        this.f85421e = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490604zq), true, true, scVar);
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.h(2, str3, str4, str2, str, new com.tencent.mm.plugin.appbrand.launching.tc(this, str3, str, str2, i18, context, i17));
    }

    public void hj(l81.e1 uiCallback) {
        if (uiCallback != null) {
            com.tencent.mm.plugin.appbrand.launching.od odVar = com.tencent.mm.plugin.appbrand.launching.od.f84874a;
            kotlin.jvm.internal.o.g(uiCallback, "uiCallback");
            android.util.SparseIntArray sparseIntArray = com.tencent.mm.plugin.appbrand.launching.od.f84876c;
            synchronized (sparseIntArray) {
                sparseIntArray.put(uiCallback.hashCode(), 1);
            }
        }
    }

    public void ij(l81.b1 b1Var, l81.v0 v0Var) {
        if (b1Var == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.u1.f89261a.a(b1Var, v0Var);
    }

    public boolean wi(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.launching.g5 g5Var = com.tencent.mm.plugin.appbrand.launching.g5.f84619a;
        if (g5Var.d(str) || g5Var.e()) {
            i17 = -1;
        }
        return com.tencent.mm.plugin.appbrand.task.u0.C().A(str, i17);
    }
}
