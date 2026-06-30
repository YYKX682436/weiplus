package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class f1 implements com.tencent.luggage.sdk.jsapi.component.service.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsruntime.j0 f47421a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsruntime.r f47422b;

    public f1(com.tencent.mm.plugin.appbrand.jsruntime.j0 contextManager) {
        kotlin.jvm.internal.o.g(contextManager, "contextManager");
        this.f47421a = contextManager;
        this.f47422b = ((com.tencent.mm.plugin.appbrand.jsruntime.b) contextManager).t0();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.e1
    public void a(com.tencent.mm.plugin.appbrand.jsruntime.r context) {
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.plugin.appbrand.jsruntime.n) this.f47422b).q0(context, "WeixinJSContext");
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.e1
    public void b() {
        ((com.tencent.mm.plugin.appbrand.jsruntime.n) ((com.tencent.mm.plugin.appbrand.jsruntime.b) this.f47421a).y0()).q0(this.f47422b, "WeixinJSContext");
    }
}
