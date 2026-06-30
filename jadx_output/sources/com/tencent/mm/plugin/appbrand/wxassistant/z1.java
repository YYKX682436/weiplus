package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f92356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.c2 f92357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(boolean z17, com.tencent.mm.plugin.appbrand.wxassistant.c2 c2Var) {
        super(0);
        this.f92356d = z17;
        this.f92357e = c2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.wxassistant.q2 q2Var;
        com.tencent.mm.plugin.appbrand.wxassistant.q2 q2Var2;
        if (this.f92356d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWxAssistantView", "showInterceptDialog: remove wx assistant");
            this.f92357e.f92146e = false;
            com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = this.f92357e.f92145d.getActiveRuntime();
            if (activeRuntime != null && (q2Var2 = (com.tencent.mm.plugin.appbrand.wxassistant.q2) activeRuntime.K1(com.tencent.mm.plugin.appbrand.wxassistant.q2.class)) != null) {
                q2Var2.l1(com.tencent.mm.plugin.appbrand.wxassistant.b3.f92138g);
            }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime2 = this.f92357e.f92145d.getActiveRuntime();
            if (activeRuntime2 != null && (q2Var = (com.tencent.mm.plugin.appbrand.wxassistant.q2) activeRuntime2.K1(com.tencent.mm.plugin.appbrand.wxassistant.q2.class)) != null) {
                q2Var.zb(false);
            }
            com.tencent.mm.plugin.appbrand.hc hcVar = this.f92357e.f92145d;
            if (hcVar instanceof com.tencent.mm.plugin.appbrand.wxassistant.p2) {
                kotlin.jvm.internal.o.e(hcVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.wxassistant.IRuntimeContainerHandlerForWxAssistant");
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = (com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC) ((com.tencent.mm.plugin.appbrand.wxassistant.p2) hcVar);
                appBrandRuntimeContainerWC.Y(new com.tencent.mm.plugin.appbrand.t5(appBrandRuntimeContainerWC, false));
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.LuggageWxAssistantView", "setAgentState: not support, runtimeContainerHandler is not IRuntimeContainerHandlerForWxAssistant");
            }
        }
        return jz5.f0.f302826a;
    }
}
