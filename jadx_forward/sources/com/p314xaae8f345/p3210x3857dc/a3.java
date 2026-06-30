package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public abstract class a3 extends com.p314xaae8f345.p3210x3857dc.b3 {
    public static void A(android.content.Context context, java.util.HashMap hashMap) {
        synchronized (zx5.n0.class) {
            if (!zx5.n0.a()) {
                by5.c4.c("XWebUpdater", "stackCheck, abort check update.");
                return;
            }
            com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
            if (n1Var != null) {
                n1Var.b(577L, 88L, 1L);
            }
            by5.c4.f("XWebUpdater", "startCheck, start check runtime update");
            if (by5.d4.f117969b == null) {
                by5.c4.g("XWebUpdater", "saveCheckUpdateTime, init first");
            } else {
                by5.d4.g("UPDATEINFOTAG").edit().putLong("last_check_update_time", java.lang.System.currentTimeMillis()).apply();
            }
            ((zx5.i0) zx5.n0.f558785a).e(context, hashMap);
            java.lang.String str = hashMap != null ? (java.lang.String) hashMap.get("UpdaterCheckType") : null;
            by5.c4.f("XWebUpdater", "startCheck, check type:" + str);
            if (str == null || !(str.equals("0") || str.equals("7"))) {
                zx5.n0.b(context, hashMap);
            } else {
                new android.os.Handler().postDelayed(new zx5.k0(context, hashMap), 5000L);
            }
        }
    }

    public static boolean B(tx5.a aVar, java.util.ArrayList arrayList) {
        if (!com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301726q) {
            by5.c4.f("XWebSdk", "updateHttpDnsHostList, xweb core is not initialized!");
            return false;
        }
        try {
            return com.p314xaae8f345.p3210x3857dc.b3.b(aVar, arrayList);
        } catch (java.lang.Throwable th6) {
            by5.c4.c("XWebSdk", "updateHttpDnsHostList, unsupported xweb core! " + th6.getMessage());
            return false;
        }
    }

    public static void C(java.util.Locale locale) {
        tx5.g a17;
        try {
            org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.u(locale);
            com.p314xaae8f345.p3210x3857dc.q2.c("lang", locale.toLanguageTag());
            tx5.i c17 = tx5.j.c(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de());
            if (c17 != null && (a17 = c17.a()) != null) {
                ((com.p314xaae8f345.p3210x3857dc.v1) a17).e(locale);
            }
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWebSdkInternal", "updateResourceLocale, error", th6);
        }
    }

    public static void D(boolean z17, int i17, int i18, java.util.HashMap hashMap) {
        by5.c4.f("XWebAudioHAid", "updateAudioHAidConfig, enable: " + z17 + ", haidType: " + i17 + ", haidDevice: " + i18);
        com.p314xaae8f345.p3210x3857dc.s1.a(z17, i17, i18, hashMap);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.xweb.update");
        intent.putExtra("stage", "audio_haid_config_update");
        intent.putExtra("package_name", org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l());
        intent.setPackage(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l());
        intent.putExtra("enable", z17);
        intent.putExtra("haid_type", i17);
        intent.putExtra("haid_device", i18);
        if (hashMap != null) {
            try {
                if (!hashMap.isEmpty()) {
                    intent.putExtra("extra_params", new org.json.JSONObject(hashMap).toString());
                }
            } catch (java.lang.Exception e17) {
                by5.c4.d("XWebRuntimeUpdater", "sendAudioHaidConfigBroadcast failed", e17);
            }
        }
        org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.sendBroadcast(intent);
        com.p314xaae8f345.p3210x3857dc.s1.b(z17, i17, i18, hashMap);
    }

    public static void c(boolean z17) {
        try {
            android.content.Context context = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c;
            if (context == null) {
                by5.c4.g("XWebSdkInternal", "clearAllWebViewCache, invalid context");
            } else {
                tx5.i c17 = tx5.j.c(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de());
                if (c17 != null) {
                    c17.f(context, z17);
                }
            }
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWebSdkInternal", "clearAllWebViewCache, error", th6);
        }
    }

    public static void d() {
        if (tx5.j.d(80034, null) == null) {
            tx5.j.d(80024, null);
            tx5.j.d(80025, null);
        }
    }

    public static boolean e() {
        return org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.e();
    }

    public static int f(android.content.Context context) {
        zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
        return by5.u3.b(context);
    }

    public static int g() {
        return org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.k();
    }

    public static int h() {
        if (!(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301722m == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS)) {
            by5.c4.g("XWebSdkInternal", "getRenderSandboxProcessMemory, not pinus now");
            return 0;
        }
        java.lang.Object d17 = tx5.j.d(80023, null);
        if (d17 instanceof java.lang.Integer) {
            return ((java.lang.Integer) d17).intValue();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.p3210x3857dc.z2 i() {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3210x3857dc.a3.i():com.tencent.xweb.z2");
    }

    public static boolean j() {
        if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de() == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE) {
            by5.c4.f("WebView", "hasInited false, current webview type is NONE");
            return false;
        }
        tx5.i c17 = tx5.j.c(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de());
        if (c17 != null) {
            return c17.d();
        }
        by5.c4.f("WebView", "hasInited false, current webview provider is null");
        return false;
    }

    public static boolean k(int i17) {
        java.lang.Object d17 = tx5.j.d(80003, new java.lang.Object[]{java.lang.Integer.valueOf(i17)});
        if (d17 instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) d17).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l() {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = zx5.j0.f558780b
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L35
            boolean r0 = zx5.j0.b()
            if (r0 != 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "isBusy:"
            r0.<init>(r3)
            boolean r3 = by5.c1.f117955a
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "XWebCleaner"
            by5.c4.f(r3, r0)
            boolean r0 = by5.c1.f117955a
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = r1
            goto L36
        L35:
            r0 = r2
        L36:
            zx5.l0 r3 = zx5.n0.f558786b
            cy5.p r3 = (cy5.p) r3
            cy5.t r3 = r3.f306428c
            if (r3 == 0) goto L42
            boolean r3 = r3.f306443n
            r3 = r3 ^ r2
            goto L43
        L42:
            r3 = r1
        L43:
            if (r0 != 0) goto L47
            if (r3 == 0) goto L48
        L47:
            r1 = r2
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3210x3857dc.a3.l():boolean");
    }

    public static boolean m() {
        return org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.o() && org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f(1011);
    }

    public static boolean n(android.content.Context context, java.lang.String str) {
        boolean b17;
        try {
            java.io.File file = new java.io.File(str);
            if (!file.exists()) {
                by5.c4.g("XWebSdkInternal", "loadPackageFromFileInternal, package does not exist");
                return false;
            }
            java.lang.String name = file.getName();
            if ("runtime_package.zip".equals(name)) {
                b17 = by5.b4.b(context, str, "runtime_package.zip", dy5.a.ZIP, false);
            } else {
                if (!"runtime_package.7z".equals(name)) {
                    by5.c4.g("XWebSdkInternal", "loadPackageFromFileInternal, wrong local package filename");
                    return false;
                }
                b17 = by5.b4.b(context, str, "runtime_package.7z", dy5.a.SEVEN_ZIP, false);
            }
            return b17;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWebSdkInternal", "loadPackageFromFileInternal, error", th6);
            return false;
        }
    }

    public static boolean o(boolean z17) {
        synchronized (zx5.n0.class) {
            if (!zx5.n0.a()) {
                return false;
            }
            if (new zx5.b0().k()) {
                by5.c4.f("XWebUpdater", "needCheckUpdate, sRuntimeUpdater ret true");
            } else {
                by5.c4.g("XWebUpdater", "needCheckUpdate, sRuntimeUpdater ret false");
                if (!z17) {
                    return false;
                }
                if (!cy5.p.a()) {
                    by5.c4.g("XWebUpdater", "needCheckUpdate, sPluginUpdater ret false");
                    return false;
                }
                by5.c4.f("XWebUpdater", "needCheckUpdate, sPluginUpdater ret true");
            }
            return true;
        }
    }

    public static boolean p(java.lang.String str) {
        if (!com.p314xaae8f345.p3210x3857dc.n0.b()) {
            by5.c4.f("UrlDispatcher", "needSwitchToTools false, init failed, url:" + str);
            return false;
        }
        java.lang.String a17 = com.p314xaae8f345.p3210x3857dc.n0.a(str);
        if (android.text.TextUtils.isEmpty(a17)) {
            by5.c4.c("UrlDispatcher", "needSwitchToTools false, host is empty");
            return false;
        }
        if (com.p314xaae8f345.p3210x3857dc.n0.c(a17, com.p314xaae8f345.p3210x3857dc.n0.f301877a)) {
            by5.c4.f("UrlDispatcher", "needSwitchToTools true, host in whitelist, host:" + a17);
            xx5.r.a(a17, 1);
            return true;
        }
        by5.c4.f("UrlDispatcher", "needSwitchToTools false, host:" + a17 + ", url:" + str);
        return false;
    }

    public static boolean q(java.lang.String str) {
        if (!com.p314xaae8f345.p3210x3857dc.n0.b()) {
            by5.c4.f("UrlDispatcher", "needUseXWeb true, init failed, url:" + str);
            return true;
        }
        java.lang.String a17 = com.p314xaae8f345.p3210x3857dc.n0.a(str);
        if (android.text.TextUtils.isEmpty(a17)) {
            by5.c4.c("UrlDispatcher", "needUseXWeb true, host is empty");
            return true;
        }
        if (com.p314xaae8f345.p3210x3857dc.n0.c(a17, com.p314xaae8f345.p3210x3857dc.n0.f301878b)) {
            by5.c4.f("UrlDispatcher", "needUseXWeb true, host in whitelist, host:" + a17);
            xx5.r.a(a17, 2);
            return true;
        }
        if (com.p314xaae8f345.p3210x3857dc.n0.c(a17, com.p314xaae8f345.p3210x3857dc.n0.f301879c)) {
            by5.c4.f("UrlDispatcher", "needUseXWeb false, host in blacklist, host:" + a17);
            xx5.r.a(a17, 3);
            return false;
        }
        by5.c4.f("UrlDispatcher", "needUseXWeb true, host:" + a17 + ", url:" + str);
        return true;
    }

    public static int r() {
        return by5.e.d();
    }

    public static boolean s(boolean z17) {
        com.p314xaae8f345.p3210x3857dc.b3.f301746a = z17;
        by5.c4.f("XWebSdkInternal", "setEnableRemoteDebug, enable:" + z17);
        if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0()) {
            try {
                com.p314xaae8f345.p3210x3857dc.q2.d("remote-debugging", z17);
                return true;
            } catch (java.lang.Exception e17) {
                by5.c4.d("XWebSdkInternal", "setEnableRemoteDebug, xweb error:", e17);
            }
        } else if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.x0()) {
            try {
                android.webkit.WebView.setWebContentsDebuggingEnabled(z17);
                return true;
            } catch (java.lang.Exception e18) {
                by5.c4.d("XWebSdkInternal", "setEnableRemoteDebug, sys error:", e18);
            }
        } else {
            by5.c4.c("XWebSdkInternal", "setEnableRemoteDebug, webview core not init yet");
        }
        return false;
    }

    public static void t(boolean z17) {
        zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
        synchronized (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.class) {
            if (android.os.Build.VERSION.SDK_INT < 26) {
                by5.c4.f("XWalkEnvironment", "setEnableSandbox, disable sandbox because android version below O");
                org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429518r = false;
            } else {
                by5.c4.f("XWalkEnvironment", "setEnableSandbox:" + z17);
                org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429518r = z17;
            }
        }
    }

    public static synchronized void u(boolean z17) {
        synchronized (com.p314xaae8f345.p3210x3857dc.a3.class) {
            synchronized (com.p314xaae8f345.p3210x3857dc.g2.class) {
                by5.c4.f("XWebEmbedSetting", "setForbidDownloadCode:" + z17);
                com.p314xaae8f345.p3210x3857dc.g2.f301818a = z17;
            }
        }
    }

    public static void v(boolean z17) {
        org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429509i = z17;
        by5.c4.f("XWalkEnvironment", "setForceDarkMode, forceDarkMode:" + z17);
    }

    public static void w(int i17) {
        zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
        synchronized (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.class) {
            by5.c4.g("XWalkEnvironment", "setMultiProcessType, multiProcessType:" + i17);
            org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429517q = i17;
        }
    }

    public static void x(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str2)) {
            try {
                if (new java.util.Date().after(new java.text.SimpleDateFormat("yyyyMMdd").parse(str2))) {
                    by5.c4.g("XWebUpdateConfigUtil", "today is after end date, set temp update config failed");
                    return;
                }
            } catch (java.lang.Throwable th6) {
                by5.c4.d("XWebUpdateConfigUtil", "setTempUpdateConfigUrl, error", th6);
                return;
            }
        }
        by5.e4.f117974c = str;
    }

    public static void y(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str2)) {
            try {
                if (new java.util.Date().after(new java.text.SimpleDateFormat("yyyyMMdd").parse(str2))) {
                    by5.c4.g("XWebUpdateConfigUtil", "today is after end date, set temp plugin update config failed");
                    return;
                }
            } catch (java.lang.Throwable th6) {
                by5.c4.d("XWebUpdateConfigUtil", "setTempPluginConfigUrl, error", th6);
                return;
            }
        }
        by5.e4.f117975d = str;
    }

    public static void z(boolean z17) {
        by5.c4.f("XWebSdkInternal", "setWaitForXWeb:" + z17);
        com.p314xaae8f345.p3210x3857dc.b3.f301749d = z17;
    }
}
