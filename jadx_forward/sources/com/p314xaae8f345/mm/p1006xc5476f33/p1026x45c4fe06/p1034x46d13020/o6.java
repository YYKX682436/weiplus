package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public enum o6 {
    ;

    public static void a(java.lang.String str, java.lang.String str2, int i17, java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.n6(str, str2, i17, runnable), "MicroMsg.AppBrand.RemoveUsageTask");
    }

    public static void b(java.lang.String str, java.lang.String str2, int i17) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.s8) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.s8.class)).wi(str2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.gb) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.gb.class)).getClass();
        java.lang.String h17 = gm0.j1.u().h();
        if (!h17.endsWith("/")) {
            h17 = h17.concat("/");
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(h17 + "appbrand/loadingurl/" + str2);
        if (r6Var.m() && r6Var.y()) {
            com.p314xaae8f345.mm.vfs.w6.f(r6Var.u());
        }
        java.lang.String absolutePath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath.concat("/");
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(absolutePath + "tencent/MicroMsg/appbrand/loadingurl");
        if (r6Var2.m() && r6Var2.y()) {
            com.p314xaae8f345.mm.vfs.w6.f(r6Var2.u());
        }
        if (i17 == 0) {
            s81.b bVar = (s81.b) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(s81.b.class);
            bVar.getClass();
            if (!(str2 == null || str2.length() == 0)) {
                bVar.f486259e.mo70514xb06685ab("AppBrandWxaPkgPreDownloadStatistics2", "appId=?", new java.lang.String[]{str2});
            }
            ((k91.a4) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(k91.a4.class)).C1(str2, Integer.MAX_VALUE);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).a(str2);
        k91.b3 b3Var = (k91.b3) nd.f.a(k91.b3.class);
        k91.s1.a(b3Var != null ? ((nd1.l2) b3Var).a(str2) : str2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        if (a17 != null) {
            a17.putBoolean("appbrand_enable_file_storage_space_statistics_for_".concat(str2), false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui().y0(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Zi().d(str2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = k91.d1.f387094a;
        k91.d1.f387094a.remove(str2.concat("_AppDebugEnabled"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb.d Ai = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ai();
        Ai.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", "delete appId(%s)", str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb.c();
        cVar.f69054x28d45f97 = str2;
        Ai.mo9951xb06685ab(cVar, new java.lang.String[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.k4.J(str2);
        java.lang.String uin = kk.v.a(((v81.e) i95.n0.c(v81.e.class)).Z3(str2));
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.i(uin, str2).mo49676x192e2029();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "clean NonFlatten appId=%s e=%s", str2, e17);
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.j(uin, str2).mo49676x192e2029();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "clean OpenDataNonFlatten appId=%s e=%s", str2, e18);
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.k(uin, str2).mo49676x192e2029();
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "clean PrivateNonFlatten appId=%s e=%s", str2, e19);
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.c(uin, str2).mo49676x192e2029();
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "clean ClientDataFlatten appId=%s e=%s", str2, e27);
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.l(uin, str2).mo49676x192e2029();
        } catch (java.lang.Exception e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "clean SinglePageNotFlatten appId=%s e=%s", str2, e28);
        }
        try {
            java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.e() + str2 + "/blobTmp/";
            com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(str3);
            com.p314xaae8f345.mm.vfs.w6.g(str3, true);
            if (r6Var3.m()) {
                r6Var3.l();
            }
        } catch (java.lang.Exception e29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "clean flattenBlobPath appId=%s e=%s", str2, e29);
        }
        java.util.Collection collection = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.f157642a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.vfs.w6.f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.f(str2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k0.f157778a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandStorageQuotaManager", "clearCalculatedStorageSize ".concat(str2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b17 = q0Var.b("AppBrandStorageQuota");
        if (b17 != null) {
            b17.remove("storage_size_" + str2 + "_temp");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b18 = q0Var.b("AppBrandStorageQuota");
        if (b18 != null) {
            b18.remove("storage_size_" + str2 + "_saved_temp");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b19 = q0Var.b("AppBrandStorageQuota");
        if (b19 != null) {
            b19.remove("storage_size_" + str2 + "_normal_none_flatten");
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(i17)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5.class)).z0(str2, i17, "{}");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o.class)).y0(str2, i17);
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var4 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sb.f168623c.c());
        if (r6Var4.m() && r6Var4.y()) {
            com.p314xaae8f345.mm.vfs.r6[] G = r6Var4.G();
            if (G == null) {
                G = new com.p314xaae8f345.mm.vfs.r6[0];
            }
            for (com.p314xaae8f345.mm.vfs.r6 r6Var5 : G) {
                if (r6Var5.m82467xfb82e301().startsWith(str2)) {
                    if (r6Var5.A()) {
                        r6Var5.l();
                    } else {
                        com.p314xaae8f345.mm.vfs.w6.g(r6Var5.o(), true);
                    }
                }
            }
        }
        ri1.g.a(str2, i17);
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d2.a(), false);
        if (s17 != null) {
            java.util.Iterator it = s17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) it.next();
                if (x1Var.f294769f) {
                    java.lang.String str4 = x1Var.f294765b;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str4)) {
                        if (!com.p314xaae8f345.mm.vfs.w6.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d2.a() + '/' + str4, true)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.V8WasmCacheCleanupLogic", "wasm cache %s remove failed.", str2);
                        }
                    }
                }
            }
        }
        java.lang.Iterable s18 = com.p314xaae8f345.mm.vfs.w6.s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l1.a(), false);
        if (s18 != null) {
            java.util.Iterator it6 = s18.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.vfs.x1 x1Var2 = (com.p314xaae8f345.mm.vfs.x1) it6.next();
                if (x1Var2.f294769f) {
                    java.lang.String str5 = x1Var2.f294765b;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str5)) {
                        if (!com.p314xaae8f345.mm.vfs.w6.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l1.a() + '/' + str5, true)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.MBShaderCacheCleanupLogic", "shader cache %s remove failed.", str2);
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l.class);
        lVar.getClass();
        if (!(str2.length() == 0)) {
            lVar.f157173e.mo70514xb06685ab(lVar.mo145255x88e404c3(), "appId=?", new java.lang.String[]{str2});
        }
        java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
        try {
            keyStore.load(null);
            java.lang.String str6 = "com.tencent.mm.plugin.appbrand.jsapi.crypto." + str2 + ".key.";
            java.util.Enumeration<java.lang.String> aliases = keyStore.aliases();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(aliases, "aliases(...)");
            while (aliases.hasMoreElements()) {
                java.lang.String nextElement = aliases.nextElement();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nextElement);
                if (r26.i0.y(nextElement, str6, false)) {
                    try {
                        keyStore.deleteEntry(nextElement);
                    } catch (java.security.KeyStoreException e37) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiCrypto", e37, "Cannot remove key with alias ".concat(nextElement), new java.lang.Object[0]);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiCrypto", th6, "keyStore load fail", new java.lang.Object[0]);
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "retrieve(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r1.b(str2, a18);
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "retrieveSnapshot(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r1.b(str2, c17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", "deleteUsrCacheByAppId(" + str2 + ") cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.c4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cc.class))).Zi(str2);
        ((k81.a) ((j81.k) i95.n0.c(j81.k.class))).wi(str2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uin, "uin");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAudioCache", "[clear] result" + com.p314xaae8f345.mm.vfs.w6.g(new te.a(uin, str2).f499297d, true));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u.f159492a;
        t91.a aVar = t91.a.f498100a;
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteAppInfoAsync, appId: " + str2 + ", versionType: " + i17);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u.f159493b) {
            ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.h(str2, i17), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
        } else {
            aVar.b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteAppInfoAsync, not in main process");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l3.f157174a.m();
        k91.g3 g3Var = k91.g3.f387125a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.RequirePrivateInfoLogic", "clearExtFlag %s", str2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) k91.g3.f387126b).mo141623x754a37bb();
        java.lang.String format = java.lang.String.format(k91.g3.f387127c, java.util.Arrays.copyOf(new java.lang.Object[]{str2}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        o4Var2.remove(format);
        jf.q.f380875a.a().remove(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.u0 wi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.u0.wi();
        if (wi6 != null) {
            wi6.Bi(str2);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RemoveUsageTask", "removeImpl with username(%s) appId(%s) type(%d)", str, str2, java.lang.Integer.valueOf(i17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().P0(str, i17);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d1) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d1.class)).z0(str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.b0) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.b0.class)).d(str);
        java.lang.String e17 = android.text.TextUtils.isEmpty(str2) ? k91.k4.e(str) : str2;
        if (android.text.TextUtils.isEmpty(e17)) {
            return;
        }
        java.util.Objects.requireNonNull(e17);
        x51.k0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ri();
        if (Ri != null) {
            try {
                Ri.A("AppBrandWxaPkgManifestRecord", "delete from AppBrandWxaPkgManifestRecord where debugType=0 and version=0");
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MiroMsg.WxaPkgStorageInvalidRecordFixer", e18, " removeInvalidReleaseRecords", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().N(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.f(e17, i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RemoveUsageTask", "miniprogram(%s %d) before kill", e17, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().t(e17, i17, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RemoveUsageTask", "miniprogram(%s %d) killed", e17, java.lang.Integer.valueOf(i17));
        int e19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().e(e17, i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7078xde9ebcc9 c7078xde9ebcc9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7078xde9ebcc9();
        c7078xde9ebcc9.f143863d = 1L;
        c7078xde9ebcc9.f143864e = c7078xde9ebcc9.b("Appid", e17, true);
        c7078xde9ebcc9.f143865f = i17;
        c7078xde9ebcc9.f143866g = e19;
        c7078xde9ebcc9.f143867h = 1L;
        c7078xde9ebcc9.k();
        boolean r17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().r(e17, 0);
        boolean r18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().r(e17, 2);
        boolean r19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().r(e17, 1);
        boolean z07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class)).z0(str, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RemoveUsageTask", "removeImpl, with username(%s) appId(%s) type(%d) hasRelease(%B), hasPreview(%B), hasDebug(%B), isCollection(%B)", str, e17, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(r17), java.lang.Boolean.valueOf(r18), java.lang.Boolean.valueOf(r19), java.lang.Boolean.valueOf(z07));
        if (r17 || r18 || r19) {
            ((gk1.g) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(gk1.g.class)).y0(e17, i17, gk1.d.f353994a);
            if (!r17) {
                ((k91.a4) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(k91.a4.class)).L0(str, false);
            }
        } else {
            k91.v5 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().n1(str, "smallHeadURL", "bigHeadURL", "brandIconURL", "roundedSquareIconURL");
            if (n17 != null) {
                java.lang.String[] strArr = {n17.f68920x68aa7b8d, n17.f68907x6b8edeb4, n17.f68910xea1bd3d4, n17.f68917xa22f9ad1};
                for (int i18 = 0; i18 < 4; i18++) {
                    java.lang.String str3 = strArr[i18];
                    l01.b bVar = l01.d0.f396294a;
                    bVar.getClass();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        java.lang.String j17 = l01.b.j(str3);
                        if (!bVar.f396275d.d(j17)) {
                            ((l01.k) bVar.f396277f).a(j17);
                        }
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        l01.n nVar = (l01.n) bVar.f396276e;
                        nVar.getClass();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                            continue;
                        } else {
                            synchronized (nVar.f396314a) {
                                java.util.Iterator it = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) nVar.f396314a).m77802xbc5e1583().iterator();
                                while (it.hasNext()) {
                                    if (((java.lang.String) it.next()).contains(str3)) {
                                        it.remove();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (z07) {
                k91.k4.i(str);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().L0(str, false);
            }
            gk1.g gVar = (gk1.g) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(gk1.g.class);
            gVar.getClass();
            gVar.y0(e17, -1, gk1.d.f353994a);
            ((k91.a4) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(k91.a4.class)).L0(str, false);
            k91.x3 x3Var = (k91.x3) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(k91.x3.class);
            x3Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WeDataExptInfoStorage", "deleteExptInfo(appId:" + e17 + ')');
            if (!(e17.length() == 0)) {
                x3Var.f387353d.mo70514xb06685ab(x3Var.mo145255x88e404c3(), "appId=?", new java.lang.String[]{e17});
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h9.g(str, e17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h9.c(str, e17);
        ((t81.s) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.s.class)).c(e17);
        ((t81.s) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.s.class)).d(str);
        b(str, e17, i17);
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o6 m49801xdce0328(java.lang.String str) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(java.lang.Enum.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o6.class, str));
        return null;
    }
}
