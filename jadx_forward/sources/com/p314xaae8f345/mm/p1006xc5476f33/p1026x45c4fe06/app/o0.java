package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.n0 f156736a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.n0(null);

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f156737b = false;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f156738c = false;

    public static void a(java.lang.String str) {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "current ProcessImportance [%d][%d][%s], %s", java.lang.Integer.valueOf(runningAppProcessInfo.importance), java.lang.Integer.valueOf(runningAppProcessInfo.importanceReasonCode), runningAppProcessInfo.importanceReasonComponent, str);
    }
}
