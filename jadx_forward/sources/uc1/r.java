package uc1;

/* loaded from: classes13.dex */
public class r extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76906x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f76907x24728b = "eraseMapLines";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONArray jSONArray;
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiEraseMapLines", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEraseMapLines", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiEraseMapLines", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        if (!jSONObject.has("lines")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiEraseMapLines", "data has not lines info");
            java.lang.String o17 = o("fail:invalid data");
            vc1.p1 p1Var = (vc1.p1) E;
            p1Var.getClass();
            C(lVar, i17, o17, false, p1Var instanceof dg1.h);
            return;
        }
        try {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray(jSONObject.optString("lines"));
            int i18 = 0;
            int i19 = 0;
            while (i19 < jSONArray2.length()) {
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray2.get(i19);
                java.lang.String optString = jSONObject2.optString(dm.i4.f66865x76d1ec5a);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                    org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("point");
                    vc1.y1 y1Var = optJSONObject != null ? new vc1.y1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(optJSONObject.optString("latitude"), 0.0d), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(optJSONObject.optString("longitude"), 0.0d)) : null;
                    if (y1Var != null) {
                        int optInt = jSONObject2.optInt(ya.b.f77479x42930b2, i18);
                        boolean optBoolean = jSONObject2.optBoolean("clear", true);
                        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4414x2558e5e0 interfaceC4414x2558e5e0 = (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4414x2558e5e0) ((java.util.concurrent.ConcurrentHashMap) ((vc1.p1) E).W).get(optString);
                        if (interfaceC4414x2558e5e0 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Map.DefaultTencentMapView", "lineId:%s is null", optString);
                        } else {
                            interfaceC4414x2558e5e0.mo37361xf23d96be(optBoolean);
                            jSONArray = jSONArray2;
                            interfaceC4414x2558e5e0.mo37349xa6ea8bc1(optInt, new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(y1Var.f516756a, y1Var.f516757b));
                            i19++;
                            jSONArray2 = jSONArray;
                            i18 = 0;
                        }
                    }
                }
                jSONArray = jSONArray2;
                i19++;
                jSONArray2 = jSONArray;
                i18 = 0;
            }
            java.lang.String o18 = o("ok");
            vc1.p1 p1Var2 = (vc1.p1) E;
            p1Var2.getClass();
            C(lVar, i17, o18, true, p1Var2 instanceof dg1.h);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.JsApiEraseMapLines", "", e17);
            java.lang.String o19 = o("fail:internal error");
            vc1.p1 p1Var3 = (vc1.p1) E;
            p1Var3.getClass();
            C(lVar, i17, o19, false, p1Var3 instanceof dg1.h);
        }
    }
}
