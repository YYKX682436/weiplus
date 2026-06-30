package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes12.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f271213d;

    public k0(java.lang.Runnable runnable, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i0 i0Var) {
        this.f271213d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!(java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId()) && android.os.Process.getThreadPriority(android.os.Process.myTid()) != 10) {
            android.os.Process.setThreadPriority(10);
        }
        java.lang.Runnable runnable = this.f271213d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
