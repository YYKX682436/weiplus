package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class u {
    public u(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.Object a(android.content.Context context, l81.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantRuntimeWidgetImpl", "preInit bundle:" + b1Var.f317014b);
        java.lang.String str = b1Var.f317012a;
        b1Var.f317012a = str != null ? r26.n0.u0(str).toString() : null;
        java.lang.String str2 = b1Var.f317014b;
        java.lang.String obj = str2 != null ? r26.n0.u0(str2).toString() : null;
        b1Var.f317014b = obj;
        com.tencent.mm.plugin.appbrand.launching.g5 g5Var = com.tencent.mm.plugin.appbrand.launching.g5.f84619a;
        if (g5Var.d(obj)) {
            b1Var.f317016c = 1;
        }
        if (g5Var.e()) {
            b1Var.f317016c = 2;
        }
        new com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask(context, g5Var.g(b1Var), new com.tencent.mm.plugin.appbrand.wxassistant.t(rVar)).H(true).I();
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
