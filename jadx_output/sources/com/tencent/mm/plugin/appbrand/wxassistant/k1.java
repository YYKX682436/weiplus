package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class k1 implements com.tencent.mm.plugin.appbrand.wxassistant.q2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f92224d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f92225e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f92226f;

    public k1(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f92224d = runtime;
        com.tencent.mars.xlog.Log.i("Luggage.CapsuleAnimatorEventHelper", "isEnable set: " + mi1.o0.f326653b + " -> true");
        mi1.o0.f326653b = true;
        this.f92225e = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.f92226f = new java.util.concurrent.atomic.AtomicReference(com.tencent.mm.plugin.appbrand.wxassistant.b3.f92137f);
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.q2
    public com.tencent.mm.plugin.appbrand.wxassistant.b3 W1() {
        java.lang.Object obj = this.f92226f.get();
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (com.tencent.mm.plugin.appbrand.wxassistant.b3) obj;
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.q2
    public boolean g4() {
        return this.f92225e.get();
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.q2
    public void l1(com.tencent.mm.plugin.appbrand.wxassistant.b3 state) {
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWxAssistantService", "setAgentState: " + state);
        this.f92226f.set(state);
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.q2
    public void zb(boolean z17) {
        com.tencent.mm.plugin.appbrand.wxassistant.c3 c3Var = com.tencent.mm.plugin.appbrand.wxassistant.c3.f92150a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean a17 = z65.c.a();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f92225e;
        if (!a17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuggageWxAssistantService", "enableWxAssistant fail, isFeatureEnabled: false");
            atomicBoolean.set(false);
            com.tencent.mm.plugin.appbrand.widget.input.n.f91551d = true;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWxAssistantService", "enableWxAssistant isEnable:" + z17);
        atomicBoolean.set(z17);
        com.tencent.mm.plugin.appbrand.hc hcVar = this.f92224d.f74796e;
        if (hcVar instanceof com.tencent.mm.plugin.appbrand.wxassistant.p2) {
            kotlin.jvm.internal.o.e(hcVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.wxassistant.IRuntimeContainerHandlerForWxAssistant");
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = (com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC) ((com.tencent.mm.plugin.appbrand.wxassistant.p2) hcVar);
            appBrandRuntimeContainerWC.Y(new com.tencent.mm.plugin.appbrand.t5(appBrandRuntimeContainerWC, z17));
        }
        if (z17) {
            com.tencent.mm.plugin.appbrand.widget.input.n.f91551d = false;
        } else {
            com.tencent.mm.plugin.appbrand.widget.input.n.f91551d = true;
        }
    }
}
