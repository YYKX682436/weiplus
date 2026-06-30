package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d;

/* loaded from: classes.dex */
public final class v implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f165318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f165319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.w f165320f;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.w wVar) {
        this.f165318d = d0Var;
        this.f165319e = i17;
        this.f165320f = wVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898 c10755xa1fef898 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898) obj;
        long j17 = c10755xa1fef898.f149938d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.w wVar = this.f165320f;
        int i17 = this.f165319e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f165318d;
        if (j17 >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWCCoinBalance", ya.b.f77504xbb80cbe3);
            java.util.HashMap i18 = kz5.c1.i(new jz5.l("balance", java.lang.Long.valueOf(c10755xa1fef898.f149938d)));
            wVar.getClass();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            i18.put("errno", 0);
            d0Var.a(i17, wVar.t("ok", i18));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetWCCoinBalance", "fail");
        wVar.getClass();
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        d0Var.a(i17, wVar.u(str2, jSONObject));
    }
}
