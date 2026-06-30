package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.file.i f81070a = new com.tencent.mm.plugin.appbrand.jsapi.file.i();

    public static final long a(java.lang.String appId, java.lang.String key, com.tencent.mm.vfs.r6 dir) {
        long c17;
        com.tencent.mm.vfs.t6 t6Var;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(dir, "dir");
        boolean m17 = dir.m();
        com.tencent.mm.plugin.appbrand.jsapi.file.i iVar = f81070a;
        if (!m17 || !dir.y()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandStorageUtils[mountTest]", "dir not exist[" + appId + ',' + key + ',' + dir.u() + ']');
            iVar.c(appId, key, 0L, true);
            return 0L;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (kotlin.jvm.internal.o.b(key, "temp") ? true : kotlin.jvm.internal.o.b(key, "saved_temp")) {
            if (kotlin.jvm.internal.o.b(key, "temp")) {
                com.tencent.mm.plugin.appbrand.appstorage.r0 r0Var = com.tencent.mm.plugin.appbrand.appstorage.s0.f76317a;
                t6Var = com.tencent.mm.plugin.appbrand.appstorage.s0.f76319c;
            } else {
                t6Var = com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.f76127e;
            }
            com.tencent.mm.vfs.r6[] H = dir.H(t6Var);
            if (H != null) {
                c17 = 0;
                for (com.tencent.mm.vfs.r6 r6Var : H) {
                    c17 += r6Var.C();
                }
            } else {
                c17 = 0;
            }
        } else {
            c17 = com.tencent.mm.plugin.appbrand.appstorage.l1.c(dir);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandStorageUtils[mountTest]", "calculateDirSize [" + appId + ',' + key + ',' + dir.u() + "]->" + c17 + " cost[" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ']');
        if (c17 >= 0) {
            iVar.c(appId, key, c17, true);
        }
        if (c17 < 0) {
            return 0L;
        }
        return c17;
    }

    public final long b(java.lang.String appId, java.lang.String key) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.sdk.platformtools.o4 b17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.b("AppBrandStorageQuota");
        long j17 = 0;
        if (b17 != null) {
            j17 = b17.getLong("storage_size_" + appId + '_' + key, 0L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandStorageUtils[mountTest]", "get saved storage size:" + j17 + " for " + appId + ',' + key);
        return j17;
    }

    public final void c(java.lang.String appId, java.lang.String key, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(key, "key");
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandStorageUtils[mountTest]", "before size: " + b(appId, key) + ", save storage size:" + j17 + " for " + appId + ',' + key);
        }
        com.tencent.mm.sdk.platformtools.o4 b17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.b("AppBrandStorageQuota");
        if (b17 != null) {
            android.content.SharedPreferences.Editor putLong = b17.putLong("storage_size_" + appId + '_' + key, j17);
            if (putLong != null) {
                putLong.apply();
            }
        }
    }
}
