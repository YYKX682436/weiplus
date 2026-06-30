package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes.dex */
public abstract class d5 {
    public static boolean a() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper() || java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId();
    }

    public static void b(java.lang.Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        }
    }
}
