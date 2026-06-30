package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class u2 {
    public u2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u2 u2Var, java.lang.String appId, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 sysConfigWC, long j17, int i17, java.lang.Object obj) {
        java.util.concurrent.Future future;
        java.util.concurrent.Future future2;
        java.lang.String str;
        java.lang.StringBuilder sb6;
        if ((i17 & 8) != 0) {
            j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        u2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sysConfigWC, "sysConfigWC");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s2 s2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s2(c0Var, appId, z17, sysConfigWC);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v2.f166780i;
        if (map instanceof java.util.concurrent.ConcurrentHashMap) {
            future2 = (java.util.concurrent.Future) ((java.util.concurrent.ConcurrentHashMap) map).computeIfAbsent(appId, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t2(s2Var));
        } else {
            synchronized (map) {
                future = (java.util.concurrent.Future) ((java.util.concurrent.ConcurrentHashMap) map).get(appId);
                if (future == null) {
                    java.lang.Object mo152xb9724478 = s2Var.mo152xb9724478();
                    wu5.c cVar = (wu5.c) mo152xb9724478;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
                    ((java.util.concurrent.ConcurrentHashMap) map).put(appId, cVar);
                    future = (java.util.concurrent.Future) mo152xb9724478;
                }
            }
            future2 = future;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchKVStorageTransferProcess", "waitForTransferCompleted for appId:" + appId + ", hasCreatedNewTask:" + c0Var.f391645d);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppLaunchKVStorageTransferProcess", "waitForTransferCompleted get exception:" + e17);
                str = "MicroMsg.AppBrand.AppLaunchKVStorageTransferProcess";
                sb6 = new java.lang.StringBuilder("waitForTransferCompleted for appId:");
            }
            sb6.append(appId);
            sb6.append(", hasCreatedNewTask:");
            sb6.append(c0Var.f391645d);
            sb6.append(", completed cost:");
            sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            sb6.append("ms");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            return z19;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchKVStorageTransferProcess", "waitForTransferCompleted for appId:" + appId + ", hasCreatedNewTask:" + c0Var.f391645d + ", completed cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            throw th6;
        }
    }
}
