package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

/* loaded from: classes12.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f134234d;

    public k0(java.lang.Runnable runnable) {
        this.f134234d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(currentThread, "Thread.currentThread()");
        java.lang.String name = currentThread.getName();
        int myTid = android.os.Process.myTid();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        oj.j.c("Matrix.Lifecycle.Thread", "thread run: tid = " + myTid + ", name =" + name, new java.lang.Object[0]);
        this.f134234d.run();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p pVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134313a;
        java.util.ArrayList arrayList = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134315c;
        synchronized (arrayList) {
            arrayList.add(name);
            oj.j.c("Matrix.Lifecycle.Thread", "thread(" + myTid + ',' + name + ") finished, alive time " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", now pool size = " + (5 - arrayList.size()), new java.lang.Object[0]);
        }
    }
}
