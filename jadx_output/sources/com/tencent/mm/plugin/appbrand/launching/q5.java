package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes.dex */
public final class q5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.q5 f85077a = new com.tencent.mm.plugin.appbrand.launching.q5();

    public final void a(java.lang.String pluginAppId, long j17, java.lang.String versionDesc) {
        kotlin.jvm.internal.o.g(pluginAppId, "pluginAppId");
        kotlin.jvm.internal.o.g(versionDesc, "versionDesc");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            try {
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.AppBrand.ForcePluginDevUinHelper");
                M.getClass();
                M.putString(pluginAppId, j17 + '|' + versionDesc);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ForcePluginDevUinHelper", "setForcedPluginInfo pluginAppId=" + pluginAppId + ", devUin=" + j17 + ", versionDesc=" + versionDesc);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ForcePluginDevUinHelper", "setForcedPluginInfo error: " + th6);
            }
        }
    }
}
