package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f52774d;

    public p0(java.lang.Runnable runnable) {
        this.f52774d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Runnable runnable = this.f52774d;
        com.tencent.matrix.lifecycle.i0 i0Var = runnable == null ? new com.tencent.matrix.lifecycle.i0("", java.lang.System.currentTimeMillis()) : new com.tencent.matrix.lifecycle.i0(runnable.toString(), java.lang.System.currentTimeMillis());
        com.tencent.matrix.lifecycle.p pVar = com.tencent.matrix.lifecycle.q0.f52780a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.matrix.lifecycle.q0.f52784e;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        kotlin.jvm.internal.o.f(currentThread, "Thread.currentThread()");
        concurrentHashMap.put(currentThread, i0Var);
        runnable.run();
        java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
        kotlin.jvm.internal.o.f(currentThread2, "Thread.currentThread()");
        concurrentHashMap.put(currentThread2, new com.tencent.matrix.lifecycle.i0("", java.lang.System.currentTimeMillis()));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 500) {
            com.tencent.matrix.lifecycle.q0.f52780a.f52772d.invoke(toString(), java.lang.Long.valueOf(currentTimeMillis2));
        }
    }

    public java.lang.String toString() {
        return this.f52774d.toString();
    }
}
