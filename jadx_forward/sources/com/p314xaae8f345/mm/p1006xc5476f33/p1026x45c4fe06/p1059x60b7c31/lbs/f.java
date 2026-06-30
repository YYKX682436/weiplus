package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34399x366c91de = 103;

    /* renamed from: NAME */
    public static final java.lang.String f34400x24728b = "chooseLocation";

    /* renamed from: g, reason: collision with root package name */
    public final int f162943g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseLocation", "chooseLocation data:%s", jSONObject);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 8);
        intent.putExtra("type_tag", 4);
        if (jSONObject != null && jSONObject.has("latitude") && jSONObject.has("longitude")) {
            double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject.optString("latitude"), 0.0d);
            double F2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject.optString("longitude"), 0.0d);
            intent.putExtra("KPickPoiLat", F);
            intent.putExtra("KPickPoiLong", F2);
        }
        android.app.Activity Z0 = e9Var.Z0();
        if (Z0 == null) {
            e9Var.a(i17, o("fail:internal error invalid android context"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseLocation", "mmActivity is null, invoke fail!");
        } else {
            nf.g.a(Z0).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e(this, e9Var, i17));
            j45.l.n(Z0, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, this.f162943g);
        }
    }
}
