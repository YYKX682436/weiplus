package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class m8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.m8 f171399a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.m8();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Integer[] f171400b = {100, 200};

    public static final void b(android.app.Activity activity) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.finish();
    }

    public final void a(android.app.Activity activity) {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIAccountReleaseHandler", "handleAccountRelease activity:" + activity.getComponentName() + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        try {
            runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (android.os.RemoteException unused) {
            runningAppProcessInfo = null;
        }
        if (runningAppProcessInfo != null && u46.a.b(f171400b, java.lang.Integer.valueOf(runningAppProcessInfo.importance)) && !activity.isFinishing() && !activity.isDestroyed()) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.cd.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.l8(activity));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish directly importance[");
        sb6.append(runningAppProcessInfo != null ? runningAppProcessInfo.importance : -1);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIAccountReleaseHandler", sb6.toString());
        b(activity);
    }
}
