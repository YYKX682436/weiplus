package uc1;

/* loaded from: classes13.dex */
public class z1 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76950x366c91de = 993;

    /* renamed from: NAME */
    public static final java.lang.String f76951x24728b = "setMapLocMarkerIcon";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapLocMarkerIcon", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetMapLocMarkerIcon", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapLocMarkerIcon", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("iconPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetMapLocMarkerIcon", "iconPath:%s", optString);
        if (android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapLocMarkerIcon", "iconPath is null, return");
            lVar.a(i17, o("fail:iconPath is null"));
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && lVar.q(o91.e.class) != null) {
            ((vc1.p1) E).V(((o91.e) lVar.q(o91.e.class)).T0(lVar, optString), (o91.d) lVar.q(o91.d.class));
        }
        lVar.a(i17, o("ok"));
    }
}
