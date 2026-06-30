package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.Executor f297090a = java.util.concurrent.Executors.newSingleThreadExecutor(new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.x0());

    public static void a(java.lang.Runnable runnable) {
        if (runnable != null) {
            f297090a.execute(runnable);
        }
    }
}
