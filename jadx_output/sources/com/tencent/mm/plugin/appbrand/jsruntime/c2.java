package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsruntime.c2 f83982a = new com.tencent.mm.plugin.appbrand.jsruntime.c2();

    public static final void a() {
        int i17;
        int i18;
        x51.k0 Ri = com.tencent.mm.plugin.appbrand.app.r9.Ri();
        if (Ri == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.a2 a2Var = new com.tencent.mm.plugin.appbrand.jsruntime.a2(Ri);
        com.tencent.mm.plugin.appbrand.jsruntime.z1 z1Var = new com.tencent.mm.plugin.appbrand.jsruntime.z1(Ri);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z18 = false;
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(com.tencent.mm.plugin.appbrand.jsruntime.d2.a(), false);
        if (s17 != null) {
            int i19 = 0;
            i18 = 0;
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                if (x1Var.f213236f) {
                    java.lang.String name = x1Var.f213232b;
                    kotlin.jvm.internal.o.f(name, "name");
                    yz5.q qVar = kotlin.jvm.internal.o.b(name, "@LibraryAppId") ? z1Var : null;
                    if (qVar == null) {
                        qVar = a2Var;
                    }
                    java.lang.String str = com.tencent.mm.plugin.appbrand.jsruntime.d2.a() + '/' + name;
                    java.lang.Iterable<com.tencent.mm.vfs.x1> s18 = com.tencent.mm.vfs.w6.s(str, z18);
                    com.tencent.mm.plugin.appbrand.jsruntime.c2 c2Var = f83982a;
                    if (s18 != null) {
                        for (com.tencent.mm.vfs.x1 x1Var2 : s18) {
                            if (x1Var2.f213236f) {
                                i19++;
                                i18 += ((java.lang.Number) qVar.invoke(name, str, x1Var2)).intValue();
                                if (c2Var.b(x1Var2, str)) {
                                    x1Var2.a();
                                }
                            }
                        }
                    }
                    java.lang.String a17 = com.tencent.mm.plugin.appbrand.jsruntime.d2.a();
                    kotlin.jvm.internal.o.f(a17, "retrieve(...)");
                    if (c2Var.b(x1Var, a17)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.V8WasmCacheCleanupLogic", "delete appID %s relPath %s", name, x1Var.f213231a);
                        x1Var.a();
                    }
                }
                z18 = false;
            }
            i17 = i19;
        } else {
            i17 = 0;
            i18 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.V8WasmCacheCleanupLogic", "doCleanup() cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms, dirVisitedCount:" + i17 + ", fileDeletedCount:" + i18);
    }

    public final boolean b(com.tencent.mm.vfs.x1 x1Var, java.lang.String str) {
        if (!x1Var.f213236f) {
            return false;
        }
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(str + '/' + x1Var.f213232b, false);
        java.util.List S0 = s17 != null ? kz5.n0.S0(s17) : null;
        return S0 == null || S0.isEmpty();
    }
}
