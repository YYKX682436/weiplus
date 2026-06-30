package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class l1 {
    public static final int a(android.content.Context context) {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) (context != null ? context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100) : null);
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        long j17 = 1024;
        return (int) ((memoryInfo.totalMem / j17) / j17);
    }
}
