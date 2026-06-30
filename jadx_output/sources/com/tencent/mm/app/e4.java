package com.tencent.mm.app;

/* loaded from: classes7.dex */
public class e4 implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f53404d = new java.util.concurrent.atomic.AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "MMCrashANRThread-" + this.f53404d.getAndIncrement());
    }
}
