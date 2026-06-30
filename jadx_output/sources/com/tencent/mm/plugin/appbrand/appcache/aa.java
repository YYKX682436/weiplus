package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class aa implements c01.yc {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f75437d;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AppBrandNotify", new com.tencent.mm.plugin.appbrand.appcache.x9(null));
        hashMap.put("AppPublicLibraryNotify", new com.tencent.mm.plugin.appbrand.appcache.z9(null));
        hashMap.put("mmbizwxaconfig", new com.tencent.mm.plugin.appbrand.appcache.v9(null));
        hashMap.put("ForceOpenAppNotify", new com.tencent.mm.plugin.appbrand.debugger.c0());
        hashMap.put("AppBrandForceKill", new com.tencent.mm.plugin.appbrand.debugger.b0());
        if (com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d) {
            hashMap.put("AppBrandTestUpdateWxaUsageListNotify", new com.tencent.mm.plugin.appbrand.debugger.u0());
        }
        f75437d = java.util.Collections.unmodifiableMap(hashMap);
    }

    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        if (gm0.j1.a()) {
            java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "msg content is null");
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.appcache.t9(this, g17), "MicroMsg.AppBrand.WxaPkgPushingXmlHandler");
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
