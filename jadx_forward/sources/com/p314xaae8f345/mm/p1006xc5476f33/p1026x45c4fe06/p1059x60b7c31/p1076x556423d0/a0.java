package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

/* loaded from: classes7.dex */
public final class a0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f161758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.b0 f161759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f161760d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.b0 b0Var, org.json.JSONObject jSONObject) {
        this.f161757a = lVar;
        this.f161758b = i17;
        this.f161759c = b0Var;
        this.f161760d = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12055xd2e613 c12055xd2e613 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12055xd2e613) abstractC11888x1a859600;
        if (c12055xd2e613 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "onReceiveResult#IProcessResultReceiver, result is null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveResult#IProcessResultReceiver, errCode: ");
        int i17 = c12055xd2e613.f161747d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", sb6.toString());
        org.json.JSONObject jSONObject = this.f161760d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.b0 b0Var = this.f161759c;
        int i18 = this.f161758b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161757a;
        if (i17 != 0) {
            lVar.a(i18, b0Var.o("fail:internal error"));
            b0Var.C(jSONObject, mq0.z.f412182w, kz5.b1.e(new jz5.l("errMsg", "errCode:" + i17)));
            return;
        }
        org.json.JSONArray jSONArray = null;
        r45.j33 j33Var = c12055xd2e613.f161748e;
        java.lang.String m75945x2fec8307 = j33Var != null ? j33Var.m75945x2fec8307(1) : null;
        kz5.q0 q0Var = kz5.q0.f395534d;
        if (m75945x2fec8307 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "onReceiveResult#IProcessResultReceiver, feedbackInfo is null");
            lVar.a(i18, b0Var.o("ok"));
            b0Var.C(jSONObject, mq0.z.f412181v, q0Var);
            return;
        }
        try {
            jSONArray = new org.json.JSONArray(j33Var.m75945x2fec8307(1));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "onReceiveResult#IProcessResultReceiver, parse feedbackInfo fail since " + e17);
        }
        if (jSONArray == null) {
            lVar.a(i18, b0Var.o("ok"));
            b0Var.C(jSONObject, mq0.z.f412181v, q0Var);
        } else {
            lVar.a(i18, b0Var.p("ok", kz5.c1.i(new jz5.l("rewardedDuration", java.lang.Integer.valueOf(j33Var.m75939xb282bd08(0))), new jz5.l("feedbackInfo", jSONArray))));
            b0Var.C(jSONObject, mq0.z.f412181v, q0Var);
        }
    }
}
