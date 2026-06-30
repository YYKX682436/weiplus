package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

/* loaded from: classes12.dex */
public final class l0 implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.l0 f134235d = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.l0();

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.String str;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(currentThread, "Thread.currentThread()");
        java.lang.ThreadGroup threadGroup = currentThread.getThreadGroup();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k0 k0Var = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k0(runnable);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p pVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134313a;
        java.util.ArrayList arrayList = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134315c;
        synchronized (arrayList) {
            str = (java.lang.String) kz5.h0.C(arrayList);
        }
        return new java.lang.Thread(threadGroup, k0Var, str != null ? str : "matrix_x_x", 0L);
    }
}
