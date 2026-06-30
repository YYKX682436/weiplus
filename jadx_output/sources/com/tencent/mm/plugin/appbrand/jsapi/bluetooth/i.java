package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class i implements com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h f80074b = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h(null);

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p f80075c = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.n.f80086f);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.q f80076a;

    public i(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.q clientFactory) {
        kotlin.jvm.internal.o.g(clientFactory, "clientFactory");
        this.f80076a = clientFactory;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p
    public com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s a(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s c17 = c(runtime);
        if (c17 != null) {
            return c17;
        }
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s a17 = this.f80076a.a(runtime);
        runtime.l(a17);
        return a17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p
    public void b(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s c17 = c(runtime);
        if (c17 != null) {
            runtime.c0(c17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p
    public com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s c(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        return (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s) runtime.k(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s.class);
    }
}
