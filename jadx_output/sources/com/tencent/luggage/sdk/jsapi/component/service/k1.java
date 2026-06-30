package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class k1 implements com.tencent.luggage.sdk.jsapi.component.service.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f47463a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsruntime.j0 f47464b;

    /* renamed from: c, reason: collision with root package name */
    public volatile java.lang.Object f47465c;

    public k1(com.tencent.mm.plugin.appbrand.e9 env, com.tencent.mm.plugin.appbrand.jsruntime.j0 contextManager) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(contextManager, "contextManager");
        this.f47463a = env;
        this.f47464b = contextManager;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.e1
    public void a(com.tencent.mm.plugin.appbrand.jsruntime.r context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object obj = this.f47465c;
        if (obj == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JSContextInterfaceSharer", "shareTo, sharedObject is null");
            return;
        }
        cl.q0 n07 = ((com.tencent.mm.plugin.appbrand.jsruntime.n) context).n0();
        n07.getClass();
        if (obj instanceof com.eclipsesource.mmv8.V8Value) {
            ((cl.a) n07.f42724b).h(new cl.x0(n07, "WeixinJSContext", obj), false);
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.e1
    public void b() {
        com.tencent.mm.plugin.appbrand.jsruntime.r y07 = ((com.tencent.mm.plugin.appbrand.jsruntime.b) this.f47464b).y0();
        com.tencent.luggage.sdk.jsapi.component.service.j1 j1Var = new com.tencent.luggage.sdk.jsapi.component.service.j1(this, y07);
        cl.q0 n07 = ((com.tencent.mm.plugin.appbrand.jsruntime.n) y07).n0();
        n07.getClass();
        ((cl.a) n07.f42724b).h(new cl.w0(n07, "WeixinJSContext", j1Var), false);
    }
}
