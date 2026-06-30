package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.app.n0 f75203a = new com.tencent.mm.plugin.appbrand.app.n0(null);

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f75204b = false;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f75205c = false;

    public static void a(java.lang.String str) {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "current ProcessImportance [%d][%d][%s], %s", java.lang.Integer.valueOf(runningAppProcessInfo.importance), java.lang.Integer.valueOf(runningAppProcessInfo.importanceReasonCode), runningAppProcessInfo.importanceReasonComponent, str);
    }
}
