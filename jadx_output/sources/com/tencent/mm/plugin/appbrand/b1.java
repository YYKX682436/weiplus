package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f76754a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.c9 f76755b;

    /* renamed from: c, reason: collision with root package name */
    public final long f76756c;

    /* renamed from: d, reason: collision with root package name */
    public final long f76757d;

    public b1(com.tencent.mm.plugin.appbrand.o6 runtime, com.tencent.mm.plugin.appbrand.ui.c9 splash) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(splash, "splash");
        this.f76754a = runtime;
        this.f76755b = splash;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        this.f76756c = timeUnit.toMillis(20L);
        this.f76757d = timeUnit.toMillis(10L);
        splash.getView().addOnAttachStateChangeListener(new com.tencent.mm.plugin.appbrand.z0(this));
        com.tencent.mm.plugin.appbrand.a1 a1Var = new com.tencent.mm.plugin.appbrand.a1(this);
        com.tencent.mm.plugin.appbrand.ge geVar = runtime.H;
        if (geVar.f78253b.get()) {
            return;
        }
        geVar.f78252a.add(a1Var);
    }
}
