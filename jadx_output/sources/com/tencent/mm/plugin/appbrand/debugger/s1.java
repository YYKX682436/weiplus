package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static int f77830a = -1;

    public static int a() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
            return 0;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is2G(context)) {
            return 1;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
            return 2;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
            return 3;
        }
        return com.tencent.mars.comm.NetStatusUtil.isWifi(context) ? 4 : 5;
    }

    public static void b(r45.k47 k47Var, com.tencent.mm.plugin.appbrand.debugger.z0 z0Var) {
        if (z0Var != null) {
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - z0Var.f77853b);
            com.tencent.mm.plugin.appbrand.profile.c cVar = (com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(currentTimeMillis);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(z0Var.f77852a);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(k47Var.computeSize());
            int i17 = f77830a;
            if (i17 < 0) {
                i17 = com.tencent.mars.comm.NetStatusUtil.getISPCode(com.tencent.mm.sdk.platformtools.x2.f193071a);
                f77830a = i17;
            }
            ((ch1.d) cVar).c(15190, valueOf, valueOf2, valueOf3, 0, "", "", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a()));
        }
    }
}
