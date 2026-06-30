package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes.dex */
public final class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 103;
    public static final java.lang.String NAME = "chooseLocation";

    /* renamed from: g, reason: collision with root package name */
    public final int f81410g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseLocation", "chooseLocation data:%s", jSONObject);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 8);
        intent.putExtra("type_tag", 4);
        if (jSONObject != null && jSONObject.has("latitude") && jSONObject.has("longitude")) {
            double F = com.tencent.mm.sdk.platformtools.t8.F(jSONObject.optString("latitude"), 0.0d);
            double F2 = com.tencent.mm.sdk.platformtools.t8.F(jSONObject.optString("longitude"), 0.0d);
            intent.putExtra("KPickPoiLat", F);
            intent.putExtra("KPickPoiLong", F2);
        }
        android.app.Activity Z0 = e9Var.Z0();
        if (Z0 == null) {
            e9Var.a(i17, o("fail:internal error invalid android context"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseLocation", "mmActivity is null, invoke fail!");
        } else {
            nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.lbs.e(this, e9Var, i17));
            j45.l.n(Z0, ya.b.LOCATION, ".ui.RedirectUI", intent, this.f81410g);
        }
    }
}
