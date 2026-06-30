package uc1;

/* loaded from: classes13.dex */
public class g2 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76878x366c91de = 133;

    /* renamed from: NAME */
    public static final java.lang.String f76879x24728b = "updateMapMarkers";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONArray jSONArray;
        org.json.JSONObject jSONObject2;
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.JsApiUpdateMapMarkers", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.JsApiUpdateMapMarkers", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.JsApiUpdateMapMarkers", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        if (jSONObject.has("markers")) {
            try {
                jSONArray = new org.json.JSONArray(jSONObject.optString("markers"));
            } catch (org.json.JSONException unused) {
                jSONArray = null;
            }
            if (jSONArray == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.JsApiUpdateMapMarkers", "markersArray is null, return");
                lVar.a(i17, o("fail:internal error"));
                return;
            }
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                try {
                    jSONObject2 = (org.json.JSONObject) jSONArray.get(i18);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Map.JsApiUpdateMapMarkers", e17, "", new java.lang.Object[0]);
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    ik1.h0.b(new vc1.c0((vc1.p1) E, jSONObject2.optString(dm.i4.f66865x76d1ec5a), D(lVar, jSONObject, jSONObject2), (o91.d) lVar.q(o91.d.class)));
                }
            }
        }
        C(lVar, i17, o("ok"), true, ((vc1.p1) E) instanceof dg1.h);
    }
}
