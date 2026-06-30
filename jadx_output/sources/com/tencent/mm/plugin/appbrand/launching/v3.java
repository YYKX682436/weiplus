package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class v3 {
    public static boolean a(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        for (com.tencent.mm.plugin.appbrand.appcache.n9 n9Var : com.tencent.mm.plugin.appbrand.app.r9.Di().x(str, i17)) {
            if (n9Var != null && com.tencent.mm.vfs.w6.j(n9Var.field_pkgPath)) {
                java.lang.String d17 = com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.d(n9Var.field_pkgPath);
                if (!android.text.TextUtils.isEmpty(d17) && (u46.l.c(d17, n9Var.field_versionMd5) || u46.l.c(d17, n9Var.field_NewMd5))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "checkMainPkgExistedForAppPreLaunch(%s), return true by key:%s", str, n9Var.field_appId);
                    return true;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "checkMainPkgExistedForAppPreLaunch(%s), not found", str);
        return false;
    }

    public static com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo b(java.lang.String str, int i17) {
        java.lang.Object obj;
        int[] o17 = com.tencent.mm.plugin.appbrand.appcache.r7.f75948a.e(str) ? com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.o(true) : com.tencent.mm.plugin.appbrand.app.r9.Di().A(str, 0);
        if (o17 != null && o17.length > i17) {
            while (true) {
                int i18 = i17 + 1;
                android.util.Pair b17 = com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.b(str, 0, o17[i17], null);
                java.lang.Object obj2 = b17.first;
                if (obj2 == com.tencent.mm.plugin.appbrand.appcache.l9.APP_READY && (obj = b17.second) != null) {
                    return (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) obj;
                }
                if (obj2 == com.tencent.mm.plugin.appbrand.appcache.l9.APP_NEED_MOVE && b17.second != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "wxapkg need move, return legacy path");
                    return (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) b17.second;
                }
                if (obj2 == com.tencent.mm.plugin.appbrand.appcache.l9.APP_LOCAL_EXIST && b17.second != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "wxapkg local exist");
                    if (com.tencent.mm.plugin.appbrand.appcache.r7.f75948a.e(str)) {
                        com.tencent.mm.plugin.appbrand.appcache.k8 k8Var = new com.tencent.mm.plugin.appbrand.appcache.k8();
                        java.lang.String str2 = ((com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) b17.second).pkgPath;
                        com.tencent.mm.plugin.appbrand.appcache.x4 x4Var = k8Var.f75628a;
                        x4Var.f76048a = str2;
                        x4Var.f76049b = true;
                        com.tencent.mm.plugin.appbrand.appcache.y7 y7Var = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a;
                        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) b17.second;
                        y7Var.q(wxaPkgWrappingInfo.f75399d, wxaPkgWrappingInfo.pkgVersion, k8Var);
                    } else {
                        com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
                        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo2 = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) b17.second;
                        Di.F(str, wxaPkgWrappingInfo2.f75399d, wxaPkgWrappingInfo2.pkgVersion, wxaPkgWrappingInfo2.pkgPath);
                    }
                    return (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) b17.second;
                }
                if (i18 >= o17.length) {
                    break;
                }
                i17 = i18;
            }
        }
        return null;
    }

    public static java.lang.String c(java.lang.String str, int i17, java.lang.String[] strArr, com.tencent.mm.pointers.PString pString) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "findPkgFromPublicStorage appId:%s, targetVersion:%d", str, java.lang.Integer.valueOf(i17));
        java.lang.String f17 = com.tencent.mm.plugin.appbrand.appcache.e9.f(str, i17);
        java.lang.String str2 = com.tencent.mm.plugin.appbrand.appcache.d9.c() + "firstParty/";
        com.tencent.mm.vfs.w6.u(str2);
        boolean startsWith = f17.startsWith(str2);
        java.lang.String d17 = com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.d(f17);
        if (d(d17, strArr)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "find pkg from public storage success");
            if (pString != null) {
                pString.value = d17;
            }
            return f17;
        }
        if (!startsWith) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str3 = com.tencent.mm.plugin.appbrand.appcache.d9.c() + "general/";
        com.tencent.mm.vfs.w6.u(str3);
        sb6.append(str3);
        sb6.append(java.lang.String.format(java.util.Locale.US, "_%d_%d.wxapkg", java.lang.Integer.valueOf(str.hashCode()), java.lang.Integer.valueOf(i17)));
        java.lang.String sb7 = sb6.toString();
        java.lang.String d18 = com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.d(sb7);
        if (!d(d18, strArr)) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "find first party pkg from public storage success");
        if (pString != null) {
            pString.value = d18;
        }
        return sb7;
    }

    public static boolean d(java.lang.String str, java.lang.String[] strArr) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && strArr != null && strArr.length != 0) {
            for (java.lang.String str2 : strArr) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && u46.l.c(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
