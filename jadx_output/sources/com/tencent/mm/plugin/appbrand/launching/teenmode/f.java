package com.tencent.mm.plugin.appbrand.launching.teenmode;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.teenmode.f f85195d = new com.tencent.mm.plugin.appbrand.launching.teenmode.f();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.launching.teenmode.k kVar = com.tencent.mm.plugin.appbrand.launching.teenmode.k.f85200a;
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        java.util.ArrayList<com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo> u07 = w2Var != null ? w2Var.u0(Integer.MAX_VALUE, com.tencent.mm.plugin.appbrand.appusage.y5.ASC) : null;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = u07 != null ? java.lang.Integer.valueOf(u07.size()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeReporter", "checkRemovedCollection allCollection: %d", objArr);
        java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.launching.teenmode.k.f85201b;
        if (u07 != null) {
            for (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo : u07) {
                com.tencent.mm.plugin.appbrand.launching.teenmode.k kVar2 = com.tencent.mm.plugin.appbrand.launching.teenmode.k.f85200a;
                java.lang.String username = appBrandRecentTaskInfo.f76361d;
                kotlin.jvm.internal.o.f(username, "username");
                java.lang.String b17 = kVar2.b(username, appBrandRecentTaskInfo.f76363f);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeReporter", "checkRemovedCollection key: %s", b17);
                if (hashMap.containsKey(b17)) {
                    hashMap.remove(b17);
                }
            }
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeReporter", "checkRemovedCollection needRemove key: %s", entry.getKey());
            com.tencent.mm.plugin.appbrand.launching.teenmode.k.c(((com.tencent.mm.plugin.appbrand.launching.teenmode.a) entry.getValue()).f85190a);
        }
        kVar.e(u07);
    }
}
