package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public enum o6 {
    ;

    public static void a(java.lang.String str, java.lang.String str2, int i17, java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.appusage.n6(str, str2, i17, runnable), "MicroMsg.AppBrand.RemoveUsageTask");
    }

    public static void b(java.lang.String str, java.lang.String str2, int i17) {
        ((com.tencent.mm.plugin.appbrand.appcache.s8) i95.n0.c(com.tencent.mm.plugin.appbrand.appcache.s8.class)).wi(str2);
        ((com.tencent.mm.plugin.appbrand.appcache.gb) i95.n0.c(com.tencent.mm.plugin.appbrand.appcache.gb.class)).getClass();
        java.lang.String h17 = gm0.j1.u().h();
        if (!h17.endsWith("/")) {
            h17 = h17.concat("/");
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(h17 + "appbrand/loadingurl/" + str2);
        if (r6Var.m() && r6Var.y()) {
            com.tencent.mm.vfs.w6.f(r6Var.u());
        }
        java.lang.String absolutePath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath.concat("/");
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(absolutePath + "tencent/MicroMsg/appbrand/loadingurl");
        if (r6Var2.m() && r6Var2.y()) {
            com.tencent.mm.vfs.w6.f(r6Var2.u());
        }
        if (i17 == 0) {
            s81.b bVar = (s81.b) com.tencent.mm.plugin.appbrand.app.r9.fj(s81.b.class);
            bVar.getClass();
            if (!(str2 == null || str2.length() == 0)) {
                bVar.f404726e.delete("AppBrandWxaPkgPreDownloadStatistics2", "appId=?", new java.lang.String[]{str2});
            }
            ((k91.a4) com.tencent.mm.plugin.appbrand.app.r9.fj(k91.a4.class)).C1(str2, Integer.MAX_VALUE);
        }
        ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).a(str2);
        k91.b3 b3Var = (k91.b3) nd.f.a(k91.b3.class);
        k91.s1.a(b3Var != null ? ((nd1.l2) b3Var).a(str2) : str2);
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        if (a17 != null) {
            a17.putBoolean("appbrand_enable_file_storage_space_statistics_for_".concat(str2), false);
        }
        com.tencent.mm.plugin.appbrand.app.r9.Ui().y0(str2);
        com.tencent.mm.plugin.appbrand.app.r9.Zi().d(str2);
        com.tencent.mm.sdk.platformtools.o4 o4Var = k91.d1.f305561a;
        k91.d1.f305561a.remove(str2.concat("_AppDebugEnabled"));
        com.tencent.mm.plugin.appbrand.task.checkdemo.d Ai = com.tencent.mm.plugin.appbrand.app.r9.Ai();
        Ai.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", "delete appId(%s)", str2);
        com.tencent.mm.plugin.appbrand.task.checkdemo.c cVar = new com.tencent.mm.plugin.appbrand.task.checkdemo.c();
        cVar.field_appId = str2;
        Ai.delete(cVar, new java.lang.String[0]);
        com.tencent.mm.plugin.appbrand.jsapi.auth.k4.J(str2);
        java.lang.String uin = kk.v.a(((v81.e) i95.n0.c(v81.e.class)).Z3(str2));
        try {
            com.tencent.mm.plugin.appbrand.jsapi.file.l2.i(uin, str2).cleanupDirectory();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "clean NonFlatten appId=%s e=%s", str2, e17);
        }
        try {
            com.tencent.mm.plugin.appbrand.jsapi.file.l2.j(uin, str2).cleanupDirectory();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "clean OpenDataNonFlatten appId=%s e=%s", str2, e18);
        }
        try {
            com.tencent.mm.plugin.appbrand.jsapi.file.l2.k(uin, str2).cleanupDirectory();
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "clean PrivateNonFlatten appId=%s e=%s", str2, e19);
        }
        try {
            com.tencent.mm.plugin.appbrand.jsapi.file.l2.c(uin, str2).cleanupDirectory();
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "clean ClientDataFlatten appId=%s e=%s", str2, e27);
        }
        try {
            com.tencent.mm.plugin.appbrand.jsapi.file.l2.l(uin, str2).cleanupDirectory();
        } catch (java.lang.Exception e28) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "clean SinglePageNotFlatten appId=%s e=%s", str2, e28);
        }
        try {
            java.lang.String str3 = com.tencent.mm.plugin.appbrand.jsapi.file.l2.e() + str2 + "/blobTmp/";
            com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(str3);
            com.tencent.mm.vfs.w6.g(str3, true);
            if (r6Var3.m()) {
                r6Var3.l();
            }
        } catch (java.lang.Exception e29) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "clean flattenBlobPath appId=%s e=%s", str2, e29);
        }
        java.util.Collection collection = com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.f76109a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.vfs.w6.f(com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.f(str2));
        }
        com.tencent.mm.plugin.appbrand.appstorage.k0 k0Var = com.tencent.mm.plugin.appbrand.appstorage.k0.f76245a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandStorageQuotaManager", "clearCalculatedStorageSize ".concat(str2));
        com.tencent.mm.plugin.appbrand.app.q0 q0Var = com.tencent.mm.plugin.appbrand.app.q0.f75227a;
        com.tencent.mm.sdk.platformtools.o4 b17 = q0Var.b("AppBrandStorageQuota");
        if (b17 != null) {
            b17.remove("storage_size_" + str2 + "_temp");
        }
        com.tencent.mm.sdk.platformtools.o4 b18 = q0Var.b("AppBrandStorageQuota");
        if (b18 != null) {
            b18.remove("storage_size_" + str2 + "_saved_temp");
        }
        com.tencent.mm.sdk.platformtools.o4 b19 = q0Var.b("AppBrandStorageQuota");
        if (b19 != null) {
            b19.remove("storage_size_" + str2 + "_normal_none_flatten");
        }
        if (com.tencent.mm.plugin.appbrand.appcache.g0.a(i17)) {
            ((com.tencent.mm.plugin.appbrand.launching.a5) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.a5.class)).z0(str2, i17, "{}");
            ((com.tencent.mm.plugin.appbrand.appcache.o) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.o.class)).y0(str2, i17);
        }
        com.tencent.mm.vfs.r6 r6Var4 = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.page.sb.f87090c.c());
        if (r6Var4.m() && r6Var4.y()) {
            com.tencent.mm.vfs.r6[] G = r6Var4.G();
            if (G == null) {
                G = new com.tencent.mm.vfs.r6[0];
            }
            for (com.tencent.mm.vfs.r6 r6Var5 : G) {
                if (r6Var5.getName().startsWith(str2)) {
                    if (r6Var5.A()) {
                        r6Var5.l();
                    } else {
                        com.tencent.mm.vfs.w6.g(r6Var5.o(), true);
                    }
                }
            }
        }
        ri1.g.a(str2, i17);
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(com.tencent.mm.plugin.appbrand.jsruntime.d2.a(), false);
        if (s17 != null) {
            java.util.Iterator it = s17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) it.next();
                if (x1Var.f213236f) {
                    java.lang.String str4 = x1Var.f213232b;
                    if (kotlin.jvm.internal.o.b(str2, str4)) {
                        if (!com.tencent.mm.vfs.w6.g(com.tencent.mm.plugin.appbrand.jsruntime.d2.a() + '/' + str4, true)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.V8WasmCacheCleanupLogic", "wasm cache %s remove failed.", str2);
                        }
                    }
                }
            }
        }
        java.lang.Iterable s18 = com.tencent.mm.vfs.w6.s(com.tencent.mm.plugin.appbrand.jsruntime.l1.a(), false);
        if (s18 != null) {
            java.util.Iterator it6 = s18.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                com.tencent.mm.vfs.x1 x1Var2 = (com.tencent.mm.vfs.x1) it6.next();
                if (x1Var2.f213236f) {
                    java.lang.String str5 = x1Var2.f213232b;
                    if (kotlin.jvm.internal.o.b(str2, str5)) {
                        if (!com.tencent.mm.vfs.w6.g(com.tencent.mm.plugin.appbrand.jsruntime.l1.a() + '/' + str5, true)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.MBShaderCacheCleanupLogic", "shader cache %s remove failed.", str2);
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.appbrand.appcache.l lVar = (com.tencent.mm.plugin.appbrand.appcache.l) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.l.class);
        lVar.getClass();
        if (!(str2.length() == 0)) {
            lVar.f75640e.delete(lVar.getTableName(), "appId=?", new java.lang.String[]{str2});
        }
        java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
        try {
            keyStore.load(null);
            java.lang.String str6 = "com.tencent.mm.plugin.appbrand.jsapi.crypto." + str2 + ".key.";
            java.util.Enumeration<java.lang.String> aliases = keyStore.aliases();
            kotlin.jvm.internal.o.f(aliases, "aliases(...)");
            while (aliases.hasMoreElements()) {
                java.lang.String nextElement = aliases.nextElement();
                kotlin.jvm.internal.o.d(nextElement);
                if (r26.i0.y(nextElement, str6, false)) {
                    try {
                        keyStore.deleteEntry(nextElement);
                    } catch (java.security.KeyStoreException e37) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiCrypto", e37, "Cannot remove key with alias ".concat(nextElement), new java.lang.Object[0]);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiCrypto", th6, "keyStore load fail", new java.lang.Object[0]);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String a18 = com.tencent.mm.plugin.appbrand.jsruntime.u1.a();
        kotlin.jvm.internal.o.f(a18, "retrieve(...)");
        com.tencent.mm.plugin.appbrand.jsruntime.r1.b(str2, a18);
        java.lang.String c17 = com.tencent.mm.plugin.appbrand.jsruntime.u1.c();
        kotlin.jvm.internal.o.f(c17, "retrieveSnapshot(...)");
        com.tencent.mm.plugin.appbrand.jsruntime.r1.b(str2, c17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", "deleteUsrCacheByAppId(" + str2 + ") cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        ((com.tencent.mm.plugin.appbrand.appcache.c4) ((com.tencent.mm.plugin.appbrand.appcache.cc) i95.n0.c(com.tencent.mm.plugin.appbrand.appcache.cc.class))).Zi(str2);
        ((k81.a) ((j81.k) i95.n0.c(j81.k.class))).wi(str2);
        kotlin.jvm.internal.o.g(uin, "uin");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAudioCache", "[clear] result" + com.tencent.mm.vfs.w6.g(new te.a(uin, str2).f417764d, true));
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u uVar = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77959a;
        t91.a aVar = t91.a.f416567a;
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteAppInfoAsync, appId: " + str2 + ", versionType: " + i17);
        if (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77960b) {
            ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.h(str2, i17), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
        } else {
            aVar.b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteAppInfoAsync, not in main process");
        }
        com.tencent.mm.plugin.appbrand.appcache.l3.f75641a.m();
        k91.g3 g3Var = k91.g3.f305592a;
        com.tencent.mars.xlog.Log.i("Luggage.RequirePrivateInfoLogic", "clearExtFlag %s", str2);
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) k91.g3.f305593b).getValue();
        java.lang.String format = java.lang.String.format(k91.g3.f305594c, java.util.Arrays.copyOf(new java.lang.Object[]{str2}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        o4Var2.remove(format);
        jf.q.f299342a.a().remove(str2);
        com.tencent.mm.plugin.appbrand.appcache.predownload.u0 wi6 = com.tencent.mm.plugin.appbrand.appcache.predownload.u0.wi();
        if (wi6 != null) {
            wi6.Bi(str2);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RemoveUsageTask", "removeImpl with username(%s) appId(%s) type(%d)", str, str2, java.lang.Integer.valueOf(i17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.app.r9.hj().P0(str, i17);
        ((com.tencent.mm.plugin.appbrand.appusage.d1) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.d1.class)).z0(str);
        ((com.tencent.mm.plugin.appbrand.backgroundfetch.b0) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.backgroundfetch.b0.class)).d(str);
        java.lang.String e17 = android.text.TextUtils.isEmpty(str2) ? k91.k4.e(str) : str2;
        if (android.text.TextUtils.isEmpty(e17)) {
            return;
        }
        java.util.Objects.requireNonNull(e17);
        x51.k0 Ri = com.tencent.mm.plugin.appbrand.app.r9.Ri();
        if (Ri != null) {
            try {
                Ri.A("AppBrandWxaPkgManifestRecord", "delete from AppBrandWxaPkgManifestRecord where debugType=0 and version=0");
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MiroMsg.WxaPkgStorageInvalidRecordFixer", e18, " removeInvalidReleaseRecords", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().N(new com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.f(e17, i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RemoveUsageTask", "miniprogram(%s %d) before kill", e17, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.appbrand.task.u0.C().t(e17, i17, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RemoveUsageTask", "miniprogram(%s %d) killed", e17, java.lang.Integer.valueOf(i17));
        int e19 = com.tencent.mm.plugin.appbrand.app.r9.Di().e(e17, i17);
        com.tencent.mm.autogen.mmdata.rpt.WeAppPackageDeleteActionStruct weAppPackageDeleteActionStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppPackageDeleteActionStruct();
        weAppPackageDeleteActionStruct.f62330d = 1L;
        weAppPackageDeleteActionStruct.f62331e = weAppPackageDeleteActionStruct.b("Appid", e17, true);
        weAppPackageDeleteActionStruct.f62332f = i17;
        weAppPackageDeleteActionStruct.f62333g = e19;
        weAppPackageDeleteActionStruct.f62334h = 1L;
        weAppPackageDeleteActionStruct.k();
        boolean r17 = com.tencent.mm.plugin.appbrand.app.r9.Di().r(e17, 0);
        boolean r18 = com.tencent.mm.plugin.appbrand.app.r9.Di().r(e17, 2);
        boolean r19 = com.tencent.mm.plugin.appbrand.app.r9.Di().r(e17, 1);
        boolean z07 = ((com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)).z0(str, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RemoveUsageTask", "removeImpl, with username(%s) appId(%s) type(%d) hasRelease(%B), hasPreview(%B), hasDebug(%B), isCollection(%B)", str, e17, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(r17), java.lang.Boolean.valueOf(r18), java.lang.Boolean.valueOf(r19), java.lang.Boolean.valueOf(z07));
        if (r17 || r18 || r19) {
            ((gk1.g) com.tencent.mm.plugin.appbrand.app.r9.fj(gk1.g.class)).y0(e17, i17, gk1.d.f272461a);
            if (!r17) {
                ((k91.a4) com.tencent.mm.plugin.appbrand.app.r9.fj(k91.a4.class)).L0(str, false);
            }
        } else {
            k91.v5 n17 = com.tencent.mm.plugin.appbrand.app.r9.ij().n1(str, "smallHeadURL", "bigHeadURL", "brandIconURL", "roundedSquareIconURL");
            if (n17 != null) {
                java.lang.String[] strArr = {n17.field_smallHeadURL, n17.field_bigHeadURL, n17.field_brandIconURL, n17.field_roundedSquareIconURL};
                for (int i18 = 0; i18 < 4; i18++) {
                    java.lang.String str3 = strArr[i18];
                    l01.b bVar = l01.d0.f314761a;
                    bVar.getClass();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        java.lang.String j17 = l01.b.j(str3);
                        if (!bVar.f314742d.d(j17)) {
                            ((l01.k) bVar.f314744f).a(j17);
                        }
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        l01.n nVar = (l01.n) bVar.f314743e;
                        nVar.getClass();
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                            continue;
                        } else {
                            synchronized (nVar.f314781a) {
                                java.util.Iterator it = ((com.tencent.mm.sdk.platformtools.r2) nVar.f314781a).keySet().iterator();
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
                com.tencent.mm.plugin.appbrand.app.r9.ij().L0(str, false);
            }
            gk1.g gVar = (gk1.g) com.tencent.mm.plugin.appbrand.app.r9.fj(gk1.g.class);
            gVar.getClass();
            gVar.y0(e17, -1, gk1.d.f272461a);
            ((k91.a4) com.tencent.mm.plugin.appbrand.app.r9.fj(k91.a4.class)).L0(str, false);
            k91.x3 x3Var = (k91.x3) com.tencent.mm.plugin.appbrand.app.r9.fj(k91.x3.class);
            x3Var.getClass();
            com.tencent.mars.xlog.Log.i("Luggage.WeDataExptInfoStorage", "deleteExptInfo(appId:" + e17 + ')');
            if (!(e17.length() == 0)) {
                x3Var.f305820d.delete(x3Var.getTableName(), "appId=?", new java.lang.String[]{e17});
            }
        }
        com.tencent.mm.plugin.appbrand.launching.h9.g(str, e17);
        com.tencent.mm.plugin.appbrand.launching.h9.c(str, e17);
        ((t81.s) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.s.class)).c(e17);
        ((t81.s) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.s.class)).d(str);
        b(str, e17, i17);
    }

    public static com.tencent.mm.plugin.appbrand.appusage.o6 valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.appusage.o6.class, str));
        return null;
    }
}
