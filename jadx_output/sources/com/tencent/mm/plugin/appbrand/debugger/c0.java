package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public final class c0 implements com.tencent.mm.plugin.appbrand.appcache.y9, com.tencent.mm.plugin.appbrand.debugger.e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f77637a = {"Needjs", "Needmainjs", "Needwebviewjs"};

    public static void c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = str3;
        try {
            str4 = com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo.d(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str3)));
        } catch (java.io.IOException unused) {
            str4 = "";
        }
        objArr[3] = str4;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ForceOpenAppNotify", "setWxAutoTestJsFilePath appId:%s, name:%s, path:%s, md5:%s", objArr);
        com.tencent.mm.sdk.platformtools.o4.N("MicroMsg.AppBrand.ForceOpenAppNotify.TestInjectJsPath", 2, null).putString(str + "-" + str2, str3);
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.N("MicroMsg.AppBrand.ForceOpenAppNotify.TestInjectJsPath", 2, null).getString(str + "-" + str2, null);
        if (!android.text.TextUtils.isEmpty(string) && com.tencent.mm.vfs.w6.j(string)) {
            try {
                return com.tencent.mm.vfs.w6.M(string);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ForceOpenAppNotify", "readWxAutoTestJsIfFileExisted(appId:%s, name:%s) get exception:%s", str, str2, e17);
            }
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.debugger.e
    public void a(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("appId");
        int intExtra = intent.getIntExtra("versionType", 0);
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = mc1.c.CTRL_INDEX;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(null, null, stringExtra, intExtra, 0, null, appBrandStatObject);
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y9
    public boolean b(java.lang.String str, java.util.Map map) {
        int i17;
        boolean z17;
        if (!com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!z65.c.a()) {
                return false;
            }
        }
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.AppID");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.UserName");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.VersionType"), -1);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.AppVersion"), -1);
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.Path");
        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.URL");
        java.lang.String str7 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.MD5");
        java.lang.String str8 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.ExtJsonInfo");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.enableJSCoverageCollect"), 0) == 1;
        if (P < 0) {
            return false;
        }
        long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.StartTime"), -1L);
        if (V > 0 && com.tencent.mm.sdk.platformtools.t8.i1() - V > 120) {
            return false;
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.setEnableDebug"), -1);
            if (P3 == 1) {
                k91.d1.b(str3, true);
            } else if (P3 == 0) {
                com.tencent.mm.sdk.platformtools.o4 o4Var = k91.d1.f305561a;
                if (!k91.d1.f305561a.contains(str3 + "_AppDebugEnabled")) {
                    k91.d1.b(str3, false);
                }
            }
        }
        if (P == 0) {
            i17 = 0;
            z17 = true;
        } else {
            if (com.tencent.mm.plugin.appbrand.app.r9.Di() == null) {
                return false;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str6) || com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                z17 = true;
                if (P == 1) {
                    return false;
                }
            } else {
                z17 = true;
                if (com.tencent.mm.plugin.appbrand.app.r9.Di().k(str3, P, str6, str7, com.tencent.mm.sdk.platformtools.t8.i1(), com.tencent.mm.sdk.platformtools.t8.i1() + 432000)) {
                    com.tencent.mm.plugin.appbrand.task.u0.C().s(str3, P);
                }
            }
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ForceOpenAppNotify", "before start weapp username[%s], appId[%s], versionType[%d] appVersion[%d] enableJSCoverageCollect:[%b]", str4, str3, java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(P2), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.appbrand.debugger.d0 d0Var = new com.tencent.mm.plugin.appbrand.debugger.d0(this, P, str6, str7, str3, str8, new l81.b1(), str4, str5, P2, z18);
        java.lang.String[] strArr = f77637a;
        final cf.d dVar = new cf.d(d0Var, 3);
        for (int i18 = i17; i18 < 3; i18++) {
            java.lang.String str9 = strArr[i18];
            java.lang.String str10 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo." + str9);
            if (android.text.TextUtils.isEmpty(str10)) {
                dVar.a();
            } else {
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.debugger.e0(str3, str9, str10, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.debugger.c0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        cf.d.this.a();
                    }
                }));
            }
        }
        return z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.debugger.e
    public java.lang.String name() {
        return "ForceOpenAppNotify";
    }
}
