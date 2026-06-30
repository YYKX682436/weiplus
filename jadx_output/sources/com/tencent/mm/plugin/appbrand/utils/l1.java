package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class l1 {
    public static final int a(android.content.Context context) {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) (context != null ? context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME) : null);
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        long j17 = 1024;
        return (int) ((memoryInfo.totalMem / j17) / j17);
    }
}
