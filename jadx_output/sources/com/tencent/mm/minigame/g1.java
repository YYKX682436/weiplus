package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.minigame.g1 f69071a = new com.tencent.mm.minigame.g1();

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0132, code lost:
    
        if (r26.i0.p(r4, r6, true) == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.minigame.e1 a(java.lang.String r23, java.lang.String r24, int r25, int r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.minigame.g1.a(java.lang.String, java.lang.String, int, int, java.lang.String):com.tencent.mm.minigame.e1");
    }

    public final long b(java.lang.String moduleName, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo) {
        java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo> list;
        int i17;
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        if (wxaAttributes$WxaVersionInfo == null || (list = wxaAttributes$WxaVersionInfo.f77452o) == null) {
            return 0L;
        }
        for (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo wxaAttributes$WxaVersionModuleInfo : list) {
            if (kotlin.jvm.internal.o.b(moduleName, wxaAttributes$WxaVersionModuleInfo.f77464d)) {
                for (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo wxaAttributes$WxaWidgetInfo : wxaAttributes$WxaVersionModuleInfo.f77471n) {
                    if (wxaAttributes$WxaWidgetInfo.f77474d == 51 && (i17 = wxaAttributes$WxaWidgetInfo.f77476f) > 0) {
                        return i17;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.w("WVAModulePkgPathHelper", "getModuleSizeFromWxaVersionInfo: module " + moduleName + " not found in WxaVersionInfo");
        return 0L;
    }

    public final void c(com.tencent.mm.plugin.appbrand.service.c0 service, java.lang.String packageName, com.tencent.mm.minigame.f1 callback) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(packageName, "packageName");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.appbrand.o6 t37 = service.t3();
        kotlin.jvm.internal.o.d(t37);
        com.tencent.mm.minigame.e1 d17 = d(t37, packageName);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "getPkgPathAsync: not found locally, exec GetWVAModulePkgPathTask for ".concat(packageName));
            new com.tencent.mm.minigame.WVAModulePkgPathHelper$GetWVAModulePkgPathTask(false, service, packageName, callback).d();
        } else {
            com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "getPkgPathAsync: found locally, pkgPath=" + d17.f69063b);
            callback.a(d17);
        }
    }

    public final com.tencent.mm.minigame.e1 d(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, java.lang.String packageName) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(packageName, "packageName");
        ph1.h hVar = runtime.R;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.w("WVAModulePkgPathHelper", "getPkgPathFromLocal: modularizingHelper is null, appId=" + runtime.f74803n);
            return null;
        }
        com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo f17 = hVar.f(packageName);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.w("WVAModulePkgPathHelper", "getPkgPathFromLocal: module not found for ".concat(packageName));
            return null;
        }
        java.lang.String str = f17.pkgPath;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("WVAModulePkgPathHelper", "getPkgPathFromLocal: pkgPath is empty for ".concat(packageName));
            return null;
        }
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.w("WVAModulePkgPathHelper", "getPkgPathFromLocal: file not exists at " + str);
            return null;
        }
        com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "getPkgPathFromLocal: found pkgPath=" + str + " for " + packageName + ", version=" + f17.pkgVersion);
        kotlin.jvm.internal.o.d(str);
        return new com.tencent.mm.minigame.e1(true, str, f17.pkgVersion, f17.getPkgSize(), false, 16, null);
    }
}
