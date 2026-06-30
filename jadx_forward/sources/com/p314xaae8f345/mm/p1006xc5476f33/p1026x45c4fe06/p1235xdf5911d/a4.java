package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes7.dex */
public final class a4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.a4 f173662d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.a4();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindowLogic$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173769a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reOpen isHeadless:");
        nVar.getClass();
        f06.v[] vVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173770b;
        f06.v vVar = vVarArr[0];
        nf.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173773e;
        sb6.append(((java.lang.Boolean) rVar.b(nVar, vVar)).booleanValue());
        sb6.append(" currentSessionId:");
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173772d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantLogic", sb6.toString());
        if (((java.lang.Boolean) rVar.b(nVar, vVarArr[0])).booleanValue()) {
            rVar.c(nVar, vVarArr[0], java.lang.Boolean.FALSE);
            java.util.List Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class))).Ai(str);
            if (Ai.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWxAssistantLogic", "reOpen currentAppIdList is empty");
            } else {
                java.lang.String str2 = (java.lang.String) Ai.get(Ai.size() - 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantLogic", "reOpen currentAppIdList:" + Ai + " topAppId:" + str2);
                if (Ai.size() == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.b(str2, null);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.b(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.g(Ai));
                }
            }
        } else {
            rVar.c(nVar, vVarArr[0], java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5 u5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12578x35916623 c12578x35916623 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12578x35916623(str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r0.f170297d, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) u5Var;
            u0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x1 x1Var = u0Var.f173850d;
            x1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0 u0Var2 = x1Var.f173873a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var2);
            java.lang.String Ni = u0Var2.Ni(c12578x35916623.f170147d);
            if (Ni == null || Ni.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWxAssistantService", "send EventWxAssistant ToAppBrandProcess: appId is null");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(Ni, c12578x35916623);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindowLogic$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
