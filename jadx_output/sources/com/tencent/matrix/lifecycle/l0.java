package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class l0 implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.l0 f52702d = new com.tencent.matrix.lifecycle.l0();

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.String str;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        kotlin.jvm.internal.o.f(currentThread, "Thread.currentThread()");
        java.lang.ThreadGroup threadGroup = currentThread.getThreadGroup();
        com.tencent.matrix.lifecycle.k0 k0Var = new com.tencent.matrix.lifecycle.k0(runnable);
        com.tencent.matrix.lifecycle.p pVar = com.tencent.matrix.lifecycle.q0.f52780a;
        java.util.ArrayList arrayList = com.tencent.matrix.lifecycle.q0.f52782c;
        synchronized (arrayList) {
            str = (java.lang.String) kz5.h0.C(arrayList);
        }
        return new java.lang.Thread(threadGroup, k0Var, str != null ? str : "matrix_x_x", 0L);
    }
}
