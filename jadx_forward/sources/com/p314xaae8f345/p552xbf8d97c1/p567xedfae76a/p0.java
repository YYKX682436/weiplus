package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

/* loaded from: classes12.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f134307d;

    public p0(java.lang.Runnable runnable) {
        this.f134307d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Runnable runnable = this.f134307d;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i0 i0Var = runnable == null ? new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i0("", java.lang.System.currentTimeMillis()) : new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i0(runnable.toString(), java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p pVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134313a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134317e;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(currentThread, "Thread.currentThread()");
        concurrentHashMap.put(currentThread, i0Var);
        runnable.run();
        java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(currentThread2, "Thread.currentThread()");
        concurrentHashMap.put(currentThread2, new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i0("", java.lang.System.currentTimeMillis()));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 500) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134313a.f134305d.mo149xb9724478(m41074x9616526c(), java.lang.Long.valueOf(currentTimeMillis2));
        }
    }

    /* renamed from: toString */
    public java.lang.String m41074x9616526c() {
        return this.f134307d.toString();
    }
}
