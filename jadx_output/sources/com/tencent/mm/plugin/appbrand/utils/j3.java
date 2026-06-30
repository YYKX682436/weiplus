package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class j3 implements java.lang.Runnable, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.n2 f90483d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f90484e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f90485f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f90486g;

    public j3(com.tencent.mm.plugin.appbrand.utils.n2 mRegistry, java.lang.Runnable runnable, java.lang.String str) {
        kotlin.jvm.internal.o.g(mRegistry, "mRegistry");
        this.f90483d = mRegistry;
        this.f90484e = runnable;
        this.f90485f = str;
        this.f90486g = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final com.tencent.mm.plugin.appbrand.utils.j3 a(com.tencent.mm.plugin.appbrand.utils.n2 registry, java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.g(registry, "registry");
        if (runnable instanceof com.tencent.mm.plugin.appbrand.utils.j3) {
            runnable = ((com.tencent.mm.plugin.appbrand.utils.j3) runnable).f90484e;
        }
        java.lang.String stackTraceString = android.util.Log.getStackTraceString(new java.lang.Throwable());
        kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
        com.tencent.mm.plugin.appbrand.utils.j3 j3Var = new com.tencent.mm.plugin.appbrand.utils.j3(registry, runnable, stackTraceString);
        registry.keep(j3Var);
        return j3Var;
    }

    @Override // im5.a
    public void dead() {
        this.f90486g.set(true);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.utils.n2 n2Var = this.f90483d;
        if (this.f90486g.get()) {
            com.tencent.mars.xlog.Log.w("Luggage.WXA.LifeCycleWrappedRunnable", "run() but dead, <init> stackTrace = " + this.f90485f);
        } else {
            try {
                java.lang.Runnable runnable = this.f90484e;
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                n2Var.n2(this);
            }
        }
    }

    public java.lang.String toString() {
        return "[LifeCycleWrappedRunnable]" + this.f90484e;
    }
}
