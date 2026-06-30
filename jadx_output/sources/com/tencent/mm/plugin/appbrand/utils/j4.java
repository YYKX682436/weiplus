package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes15.dex */
public final class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f90487d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f90488e;

    public j4(java.lang.Runnable realRunnable) {
        kotlin.jvm.internal.o.g(realRunnable, "realRunnable");
        this.f90487d = realRunnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f90487d.run();
        this.f90488e = true;
    }
}
