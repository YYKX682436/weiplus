package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f52701d;

    public k0(java.lang.Runnable runnable) {
        this.f52701d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        kotlin.jvm.internal.o.f(currentThread, "Thread.currentThread()");
        java.lang.String name = currentThread.getName();
        int myTid = android.os.Process.myTid();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        oj.j.c("Matrix.Lifecycle.Thread", "thread run: tid = " + myTid + ", name =" + name, new java.lang.Object[0]);
        this.f52701d.run();
        com.tencent.matrix.lifecycle.p pVar = com.tencent.matrix.lifecycle.q0.f52780a;
        java.util.ArrayList arrayList = com.tencent.matrix.lifecycle.q0.f52782c;
        synchronized (arrayList) {
            arrayList.add(name);
            oj.j.c("Matrix.Lifecycle.Thread", "thread(" + myTid + ',' + name + ") finished, alive time " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", now pool size = " + (5 - arrayList.size()), new java.lang.Object[0]);
        }
    }
}
