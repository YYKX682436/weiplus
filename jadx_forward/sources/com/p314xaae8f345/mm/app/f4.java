package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public abstract class f4 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ScheduledExecutorService f134949a = java.util.concurrent.Executors.newScheduledThreadPool(2, new com.p314xaae8f345.mm.app.e4());

    public static void a(java.lang.Runnable runnable) {
        f134949a.execute(runnable);
    }
}
