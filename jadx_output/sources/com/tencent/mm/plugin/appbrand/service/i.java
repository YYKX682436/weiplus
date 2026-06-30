package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public abstract class i {
    public static final void a(java.lang.String appId, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo appPkgHolder, java.lang.String[] scriptFilePaths, java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(appPkgHolder, "appPkgHolder");
        kotlin.jvm.internal.o.g(scriptFilePaths, "scriptFilePaths");
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.x2.j() ? bm5.f1.a() : com.tencent.mm.sdk.platformtools.w9.f193058f;
        kotlin.jvm.internal.o.d(a17);
        com.tencent.mm.ipcinvoker.f.a(a17, new com.tencent.mm.plugin.appbrand.service.AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest(appId, appPkgHolder, scriptFilePaths), com.tencent.mm.plugin.appbrand.service.g.f88672d, new com.tencent.mm.plugin.appbrand.service.h(runnable));
    }
}
