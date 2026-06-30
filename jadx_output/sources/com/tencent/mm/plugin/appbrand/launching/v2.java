package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class v2 implements java.util.concurrent.Callable, wu5.d {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.u2 f85246h = new com.tencent.mm.plugin.appbrand.launching.u2(null);

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f85247i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f85248d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f85249e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC f85250f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.concurrent.Future f85251g;

    public v2(java.lang.String str, boolean z17, com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC, kotlin.jvm.internal.i iVar) {
        this.f85248d = str;
        this.f85249e = z17;
        this.f85250f = appBrandSysConfigWC;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            c01.i8[] g17 = com.tencent.mm.plugin.appbrand.launching.x2.g(this.f85249e, this.f85250f);
            kotlin.jvm.internal.o.f(g17, "getAppBrandDataTransfer(...)");
            for (c01.i8 i8Var : g17) {
                if (i8Var.b(o45.wf.f343029g)) {
                    i8Var.c(o45.wf.f343029g);
                }
            }
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.util.Map map = f85247i;
            if (map instanceof java.util.concurrent.ConcurrentHashMap) {
                java.lang.String str = this.f85248d;
                java.util.concurrent.Future future = this.f85251g;
                if (future == null) {
                    kotlin.jvm.internal.o.o("attachedFuture");
                    throw null;
                }
                ((java.util.concurrent.ConcurrentHashMap) map).remove(str, future);
            } else {
                synchronized (map) {
                    java.lang.Object obj = ((java.util.concurrent.ConcurrentHashMap) map).get(this.f85248d);
                    java.util.concurrent.Future future2 = this.f85251g;
                    if (future2 == null) {
                        kotlin.jvm.internal.o.o("attachedFuture");
                        throw null;
                    }
                    if (kotlin.jvm.internal.o.b(obj, future2)) {
                        ((java.util.concurrent.ConcurrentHashMap) map).remove(this.f85248d);
                    }
                }
            }
            return bool;
        } catch (java.lang.Throwable th6) {
            java.util.Map map2 = f85247i;
            if (map2 instanceof java.util.concurrent.ConcurrentHashMap) {
                java.lang.String str2 = this.f85248d;
                java.util.concurrent.Future future3 = this.f85251g;
                if (future3 == null) {
                    kotlin.jvm.internal.o.o("attachedFuture");
                    throw null;
                }
                ((java.util.concurrent.ConcurrentHashMap) map2).remove(str2, future3);
            } else {
                synchronized (map2) {
                    java.lang.Object obj2 = ((java.util.concurrent.ConcurrentHashMap) map2).get(this.f85248d);
                    java.util.concurrent.Future future4 = this.f85251g;
                    if (future4 == null) {
                        kotlin.jvm.internal.o.o("attachedFuture");
                        throw null;
                    }
                    if (kotlin.jvm.internal.o.b(obj2, future4)) {
                        ((java.util.concurrent.ConcurrentHashMap) map2).remove(this.f85248d);
                    }
                }
            }
            throw th6;
        }
    }

    @Override // wu5.d
    public void f(java.util.concurrent.Future future) {
        kotlin.jvm.internal.o.e(future, "null cannot be cast to non-null type java.util.concurrent.Future<kotlin.Boolean>");
        this.f85251g = future;
    }
}
