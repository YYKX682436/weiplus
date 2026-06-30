package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class g3 implements ui1.x {
    @Override // ui1.x
    public ui1.z ih(com.tencent.mm.plugin.appbrand.jsapi.l component, ui1.y listener, java.util.List list) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37;
        com.tencent.mm.plugin.appbrand.wxassistant.q2 q2Var;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.plugin.appbrand.y yVar = component instanceof com.tencent.mm.plugin.appbrand.y ? (com.tencent.mm.plugin.appbrand.y) component : null;
        boolean g47 = (yVar == null || (t37 = yVar.t3()) == null || (q2Var = (com.tencent.mm.plugin.appbrand.wxassistant.q2) t37.K1(com.tencent.mm.plugin.appbrand.wxassistant.q2.class)) == null) ? false : q2Var.g4();
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantFactoryInterface", "createPresenterView: " + g47);
        if (!g47) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.wxassistant.f3 f3Var = new com.tencent.mm.plugin.appbrand.wxassistant.f3();
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantFactoryInterface", "auto accept");
        ui1.y.b(listener, 1, new java.util.ArrayList(), 0, false, 12, null);
        return f3Var;
    }
}
