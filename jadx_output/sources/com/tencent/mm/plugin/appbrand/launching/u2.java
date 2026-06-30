package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class u2 {
    public u2(kotlin.jvm.internal.i iVar) {
    }

    public static boolean a(com.tencent.mm.plugin.appbrand.launching.u2 u2Var, java.lang.String appId, boolean z17, com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC sysConfigWC, long j17, int i17, java.lang.Object obj) {
        java.util.concurrent.Future future;
        java.util.concurrent.Future future2;
        java.lang.String str;
        java.lang.StringBuilder sb6;
        if ((i17 & 8) != 0) {
            j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        u2Var.getClass();
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(sysConfigWC, "sysConfigWC");
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        com.tencent.mm.plugin.appbrand.launching.s2 s2Var = new com.tencent.mm.plugin.appbrand.launching.s2(c0Var, appId, z17, sysConfigWC);
        java.util.Map map = com.tencent.mm.plugin.appbrand.launching.v2.f85247i;
        if (map instanceof java.util.concurrent.ConcurrentHashMap) {
            future2 = (java.util.concurrent.Future) ((java.util.concurrent.ConcurrentHashMap) map).computeIfAbsent(appId, new com.tencent.mm.plugin.appbrand.launching.t2(s2Var));
        } else {
            synchronized (map) {
                future = (java.util.concurrent.Future) ((java.util.concurrent.ConcurrentHashMap) map).get(appId);
                if (future == null) {
                    java.lang.Object invoke = s2Var.invoke();
                    wu5.c cVar = (wu5.c) invoke;
                    kotlin.jvm.internal.o.d(cVar);
                    ((java.util.concurrent.ConcurrentHashMap) map).put(appId, cVar);
                    future = (java.util.concurrent.Future) invoke;
                }
            }
            future2 = future;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchKVStorageTransferProcess", "waitForTransferCompleted for appId:" + appId + ", hasCreatedNewTask:" + c0Var.f310112d);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z19 = false;
        try {
            try {
                java.lang.Boolean bool = (java.lang.Boolean) future2.get(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
                if (bool != null) {
                    z19 = bool.booleanValue();
                }
                str = "MicroMsg.AppBrand.AppLaunchKVStorageTransferProcess";
                sb6 = new java.lang.StringBuilder("waitForTransferCompleted for appId:");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppLaunchKVStorageTransferProcess", "waitForTransferCompleted get exception:" + e17);
                str = "MicroMsg.AppBrand.AppLaunchKVStorageTransferProcess";
                sb6 = new java.lang.StringBuilder("waitForTransferCompleted for appId:");
            }
            sb6.append(appId);
            sb6.append(", hasCreatedNewTask:");
            sb6.append(c0Var.f310112d);
            sb6.append(", completed cost:");
            sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            sb6.append("ms");
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            return z19;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchKVStorageTransferProcess", "waitForTransferCompleted for appId:" + appId + ", hasCreatedNewTask:" + c0Var.f310112d + ", completed cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            throw th6;
        }
    }
}
