package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class m8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.m8 f89866a = new com.tencent.mm.plugin.appbrand.ui.m8();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Integer[] f89867b = {100, 200};

    public static final void b(android.app.Activity activity) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.finish();
    }

    public final void a(android.app.Activity activity) {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIAccountReleaseHandler", "handleAccountRelease activity:" + activity.getComponentName() + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        try {
            runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (android.os.RemoteException unused) {
            runningAppProcessInfo = null;
        }
        if (runningAppProcessInfo != null && u46.a.b(f89867b, java.lang.Integer.valueOf(runningAppProcessInfo.importance)) && !activity.isFinishing() && !activity.isDestroyed()) {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.ui.cd.class, new com.tencent.mm.plugin.appbrand.ui.l8(activity));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish directly importance[");
        sb6.append(runningAppProcessInfo != null ? runningAppProcessInfo.importance : -1);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIAccountReleaseHandler", sb6.toString());
        b(activity);
    }
}
