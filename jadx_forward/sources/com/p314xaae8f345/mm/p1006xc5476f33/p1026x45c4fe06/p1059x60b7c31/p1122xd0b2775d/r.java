package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d;

/* loaded from: classes7.dex */
public final class r implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f165312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f165313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.s f165314c;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.s sVar) {
        this.f165312a = d0Var;
        this.f165313b = i17;
        this.f165314c = sVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12283x18def3d6 c12283x18def3d6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12283x18def3d6) abstractC11888x1a859600;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.s sVar = this.f165314c;
        int i17 = this.f165313b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f165312a;
        if (c12283x18def3d6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiConsumeWCCoin", "onReceiveResult get NULL result");
            sVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i17, sVar.u(str2, jSONObject));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiConsumeWCCoin", "onReceiveResult resultCode:%s", c12283x18def3d6.f165285d);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12283x18def3d6.f165285d, "ok")) {
            java.util.HashMap i18 = kz5.c1.i(new jz5.l("balance", c12283x18def3d6.f165286e));
            sVar.getClass();
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            i18.put("errno", 0);
            d0Var.a(i17, sVar.t("ok", i18));
            return;
        }
        java.lang.String str5 = "fail " + c12283x18def3d6.f165285d;
        sVar.getClass();
        str = android.text.TextUtils.isEmpty(str5) ? null : str5;
        str2 = str != null ? str : "";
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        d0Var.a(i17, sVar.u(str2, jSONObject2));
    }
}
