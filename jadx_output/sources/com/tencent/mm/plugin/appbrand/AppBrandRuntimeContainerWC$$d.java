package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final /* synthetic */ class AppBrandRuntimeContainerWC$$d implements java.util.function.Consumer {
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        java.lang.Iterable iterable;
        java.lang.String sessionId = (java.lang.String) obj;
        android.util.SparseIntArray sparseIntArray = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C;
        com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) ((com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class));
        u0Var.getClass();
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "removeAllAppId: sessionId:".concat(sessionId));
        com.tencent.mm.plugin.appbrand.wxassistant.w2 Di = u0Var.Di();
        Di.getClass();
        java.lang.String b17 = Di.b(sessionId);
        java.lang.String a17 = Di.a(sessionId);
        com.tencent.mm.plugin.appbrand.wxassistant.v2 v2Var = com.tencent.mm.plugin.appbrand.wxassistant.w2.f92328a;
        int i17 = com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).getInt(b17, -1);
        if (i17 == -1) {
            iterable = kz5.p0.f313996d;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (i17 >= 0) {
                int i18 = 0;
                while (true) {
                    java.lang.String string = com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).getString(a17 + i18, null);
                    kotlin.jvm.internal.o.d(string);
                    arrayList.add(string);
                    com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).W(a17 + i18);
                    if (i18 == i17) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).W(b17);
            iterable = arrayList;
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            u0Var.Ri().remove((java.lang.String) it.next());
        }
        long g17 = u0Var.Ri().g();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "removeAllAppId: sessionId:" + sessionId + " count:" + g17);
        if (g17 == 0) {
            com.tencent.mm.plugin.appbrand.wxassistant.n.f92236a.getClass();
            com.tencent.mm.plugin.appbrand.wxassistant.c3.f92150a.getClass();
            if (com.tencent.mm.plugin.appbrand.wxassistant.c3.f92155f) {
                ((ku5.t0) ku5.t0.f312615d).B(com.tencent.mm.plugin.appbrand.wxassistant.e.f92195d);
            }
        }
    }
}
