package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f88474a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.screenshot.q0 f88475b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f88476c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.screenshot.t1 f88477d;

    public e(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, com.tencent.mm.plugin.appbrand.screenshot.q0 listener) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f88474a = runtime;
        this.f88475b = listener;
        this.f88476c = jz5.h.b(new com.tencent.mm.plugin.appbrand.screenshot.d(this));
        this.f88477d = new com.tencent.mm.plugin.appbrand.screenshot.t1(new com.tencent.mm.plugin.appbrand.screenshot.c(this));
        com.tencent.mm.plugin.appbrand.w8 w8Var = new com.tencent.mm.plugin.appbrand.w8(new com.tencent.mm.plugin.appbrand.screenshot.b(this));
        if (runtime.T) {
            w8Var.a();
        } else {
            runtime.G.add(w8Var);
        }
    }

    public static final java.lang.String a(com.tencent.mm.plugin.appbrand.screenshot.e eVar) {
        return (java.lang.String) ((jz5.n) eVar.f88476c).getValue();
    }
}
