package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

/* loaded from: classes7.dex */
public final class k implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f161779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.l f161780c;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.l lVar2) {
        this.f161778a = lVar;
        this.f161779b = i17;
        this.f161780c = lVar2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        java.lang.String o17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12058x46df12ab c12058x46df12ab = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12058x46df12ab) abstractC11888x1a859600;
        if (c12058x46df12ab == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "onReceiveResult#IProcessResultReceiver, result is null");
            return;
        }
        int ordinal = c12058x46df12ab.f161751d.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component = this.f161778a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.l lVar = this.f161780c;
        if (ordinal == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveResult#IProcessResultReceiver, errCode: ");
            int i17 = c12058x46df12ab.f161752e;
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsActivity", sb6.toString());
            if (i17 == 0) {
                o17 = lVar.o("ok");
            } else {
                lVar.getClass();
                o17 = lVar.o("fail:internal error");
            }
            component.a(this.f161779b, o17);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        org.json.JSONObject navigateBackInfo = c12058x46df12ab.f161753f;
        lVar.getClass();
        try {
            navigateBackInfo.put("feedId", navigateBackInfo.optString("feedID"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "preProcessNavigateBackInfo, fail since " + e17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigateBackInfo, "navigateBackInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "dispatch#JsEventOnNavigateBackFromChannelsActivity, navigateBackInfo: " + navigateBackInfo);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.j0();
        j0Var.u(component);
        j0Var.f163907f = navigateBackInfo.toString();
        j0Var.m();
    }
}
