package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class a0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public final int f225029g = hashCode() & 65535;

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        int i17 = this.f225029g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiChooseLocation", "chooseLocation data: %s, requestCode: %d", jSONObject, java.lang.Integer.valueOf(i17));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 8);
        intent.putExtra("type_tag", 4);
        if (jSONObject != null && jSONObject.has("latitude") && jSONObject.has("longitude")) {
            double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject.optString("latitude"), 0.0d);
            double F2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject.optString("longitude"), 0.0d);
            intent.putExtra("KPickPoiLat", F);
            intent.putExtra("KPickPoiLong", F2);
        }
        if (!(c() instanceof android.app.Activity)) {
            this.f224976f.a("invalid activity");
            return;
        }
        android.app.Activity activity = (android.app.Activity) c();
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(activity, "android.permission.ACCESS_FINE_LOCATION", 64, "", "", new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.y(this, activity, intent))) {
            nf.g.a(activity).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.z(this));
            j45.l.n(activity, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, i17);
        }
    }
}
