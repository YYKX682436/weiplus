package com.p314xaae8f345.mm.app;

/* loaded from: classes7.dex */
public class e4 implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f134937d = new java.util.concurrent.atomic.AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "MMCrashANRThread-" + this.f134937d.getAndIncrement());
    }
}
