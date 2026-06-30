package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public final class c0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f159170a = {"Needjs", "Needmainjs", "Needwebviewjs"};

    public static void c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = str3;
        try {
            str4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6.d(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str3)));
        } catch (java.io.IOException unused) {
            str4 = "";
        }
        objArr[3] = str4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ForceOpenAppNotify", "setWxAutoTestJsFilePath appId:%s, name:%s, path:%s, md5:%s", objArr);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("MicroMsg.AppBrand.ForceOpenAppNotify.TestInjectJsPath", 2, null).putString(str + "-" + str2, str3);
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("MicroMsg.AppBrand.ForceOpenAppNotify.TestInjectJsPath", 2, null).getString(str + "-" + str2, null);
        if (!android.text.TextUtils.isEmpty(string) && com.p314xaae8f345.mm.vfs.w6.j(string)) {
            try {
                return com.p314xaae8f345.mm.vfs.w6.M(string);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ForceOpenAppNotify", "readWxAutoTestJsIfFileExisted(appId:%s, name:%s) get exception:%s", str, str2, e17);
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e
    public void a(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("appId");
        int intExtra = intent.getIntExtra("versionType", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = mc1.c.f72820x366c91de;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).aj(null, null, stringExtra, intExtra, 0, null, c12559xbdae8559);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y9
    public boolean b(java.lang.String str, java.util.Map map) {
        int i17;
        boolean z17;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!z65.c.a()) {
                return false;
            }
        }
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.AppID");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.UserName");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.VersionType"), -1);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.AppVersion"), -1);
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.Path");
        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.URL");
        java.lang.String str7 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.MD5");
        java.lang.String str8 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.ExtJsonInfo");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.enableJSCoverageCollect"), 0) == 1;
        if (P < 0) {
            return false;
        }
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.StartTime"), -1L);
        if (V > 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - V > 120) {
            return false;
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.setEnableDebug"), -1);
            if (P3 == 1) {
                k91.d1.b(str3, true);
            } else if (P3 == 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = k91.d1.f387094a;
                if (!k91.d1.f387094a.contains(str3 + "_AppDebugEnabled")) {
                    k91.d1.b(str3, false);
                }
            }
        }
        if (P == 0) {
            i17 = 0;
            z17 = true;
        } else {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di() == null) {
                return false;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                z17 = true;
                if (P == 1) {
                    return false;
                }
            } else {
                z17 = true;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().k(str3, P, str6, str7, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + 432000)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().s(str3, P);
                }
            }
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ForceOpenAppNotify", "before start weapp username[%s], appId[%s], versionType[%d] appVersion[%d] enableJSCoverageCollect:[%b]", str4, str3, java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(P2), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.d0 d0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.d0(this, P, str6, str7, str3, str8, new l81.b1(), str4, str5, P2, z18);
        java.lang.String[] strArr = f159170a;
        final cf.d dVar = new cf.d(d0Var, 3);
        for (int i18 = i17; i18 < 3; i18++) {
            java.lang.String str9 = strArr[i18];
            java.lang.String str10 = (java.lang.String) map.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo." + str9);
            if (android.text.TextUtils.isEmpty(str10)) {
                dVar.a();
            } else {
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e0(str3, str9, str10, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.debugger.c0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        cf.d.this.a();
                    }
                }));
            }
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e
    /* renamed from: name */
    public java.lang.String mo50165x337a8b() {
        return "ForceOpenAppNotify";
    }
}
