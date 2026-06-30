package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class a4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.wxassistant.a4 f92129d = new com.tencent.mm.plugin.appbrand.wxassistant.a4();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindowLogic$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.wxassistant.n nVar = com.tencent.mm.plugin.appbrand.wxassistant.n.f92236a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reOpen isHeadless:");
        nVar.getClass();
        f06.v[] vVarArr = com.tencent.mm.plugin.appbrand.wxassistant.n.f92237b;
        f06.v vVar = vVarArr[0];
        nf.r rVar = com.tencent.mm.plugin.appbrand.wxassistant.n.f92240e;
        sb6.append(((java.lang.Boolean) rVar.b(nVar, vVar)).booleanValue());
        sb6.append(" currentSessionId:");
        java.lang.String str = com.tencent.mm.plugin.appbrand.wxassistant.n.f92239d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantLogic", sb6.toString());
        if (((java.lang.Boolean) rVar.b(nVar, vVarArr[0])).booleanValue()) {
            rVar.c(nVar, vVarArr[0], java.lang.Boolean.FALSE);
            java.util.List Ai = ((com.tencent.mm.plugin.appbrand.wxassistant.u0) ((com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class))).Ai(str);
            if (Ai.isEmpty()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWxAssistantLogic", "reOpen currentAppIdList is empty");
            } else {
                java.lang.String str2 = (java.lang.String) Ai.get(Ai.size() - 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantLogic", "reOpen currentAppIdList:" + Ai + " topAppId:" + str2);
                if (Ai.size() == 1) {
                    com.tencent.mm.plugin.appbrand.wxassistant.n.b(str2, null);
                } else {
                    com.tencent.mm.plugin.appbrand.wxassistant.n.b(str2, new com.tencent.mm.plugin.appbrand.wxassistant.g(Ai));
                }
            }
        } else {
            rVar.c(nVar, vVarArr[0], java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.appbrand.service.u5 u5Var = (com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class);
            com.tencent.mm.plugin.appbrand.service.EventWxAssistant eventWxAssistant = new com.tencent.mm.plugin.appbrand.service.EventWxAssistant(str, com.tencent.mm.plugin.appbrand.service.r0.f88764d, null);
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
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindowLogic$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
