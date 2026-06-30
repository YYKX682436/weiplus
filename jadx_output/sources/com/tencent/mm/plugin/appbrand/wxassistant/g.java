package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f92204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.List list) {
        super(0);
        this.f92204d = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.service.u5 u5Var = (com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class);
        com.tencent.mm.plugin.appbrand.wxassistant.n.f92236a.getClass();
        com.tencent.mm.plugin.appbrand.service.EventWxAssistant eventWxAssistant = new com.tencent.mm.plugin.appbrand.service.EventWxAssistant(com.tencent.mm.plugin.appbrand.wxassistant.n.f92239d, com.tencent.mm.plugin.appbrand.service.r0.f88765e, new com.tencent.mm.plugin.appbrand.service.RestoreRuntimeParams(this.f92204d.subList(0, r5.size() - 1)));
        com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) u5Var;
        u0Var.getClass();
        com.tencent.mm.plugin.appbrand.wxassistant.x1 x1Var = u0Var.f92317d;
        x1Var.getClass();
        com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var2 = x1Var.f92340a;
        kotlin.jvm.internal.o.d(u0Var2);
        java.lang.String Ni = u0Var2.Ni(eventWxAssistant.f88614d);
        if (Ni == null || Ni.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWxAssistantService", "send EventWxAssistant ToAppBrandProcess: appId is null");
        } else {
            com.tencent.mm.plugin.appbrand.ipc.m0.b(Ni, eventWxAssistant);
        }
        return jz5.f0.f302826a;
    }
}
