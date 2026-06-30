package com.p314xaae8f345.mm.rfx.p2589x5fb4e56;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f273772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.HandlerThread f273773e;

    public f(com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20958x70e103f8 c20958x70e103f8, java.lang.Runnable runnable, android.os.HandlerThread handlerThread) {
        this.f273772d = runnable;
        this.f273773e = handlerThread;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        this.f273772d.run();
        atomicInteger = com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20958x70e103f8.f39149x63f2f241;
        atomicInteger.getAndDecrement();
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.mm.rfx.p2589x5fb4e56.e(this));
    }
}
