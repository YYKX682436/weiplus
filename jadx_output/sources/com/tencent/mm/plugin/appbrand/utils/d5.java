package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes.dex */
public abstract class d5 {
    public static boolean a() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper() || java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId();
    }

    public static void b(java.lang.Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        }
    }
}
