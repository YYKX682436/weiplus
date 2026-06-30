package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes.dex */
public final class q5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q5 f166610a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q5();

    public final void a(java.lang.String pluginAppId, long j17, java.lang.String versionDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAppId, "pluginAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(versionDesc, "versionDesc");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.AppBrand.ForcePluginDevUinHelper");
                M.getClass();
                M.putString(pluginAppId, j17 + '|' + versionDesc);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ForcePluginDevUinHelper", "setForcedPluginInfo pluginAppId=" + pluginAppId + ", devUin=" + j17 + ", versionDesc=" + versionDesc);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ForcePluginDevUinHelper", "setForcedPluginInfo error: " + th6);
            }
        }
    }
}
