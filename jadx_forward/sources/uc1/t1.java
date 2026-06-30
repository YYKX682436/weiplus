package uc1;

/* loaded from: classes13.dex */
public class t1 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76916x366c91de = 343;

    /* renamed from: NAME */
    public static final java.lang.String f76917x24728b = "removeMapMarkers";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.JsApiRemoveMapMarkers", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.JsApiRemoveMapMarkers", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.JsApiRemoveMapMarkers", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        if (jSONObject.has("markers")) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("markers"));
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    ((vc1.p1) E).S(jSONArray.getString(i18));
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Map.JsApiRemoveMapMarkers", e17, "", new java.lang.Object[0]);
                lVar.a(i17, o("fail:internal error"));
                return;
            }
        }
        java.lang.String o17 = o("ok");
        vc1.p1 p1Var = (vc1.p1) E;
        p1Var.getClass();
        C(lVar, i17, o17, true, p1Var instanceof dg1.h);
    }
}
