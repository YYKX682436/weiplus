package uc1;

/* loaded from: classes13.dex */
public class w extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76928x366c91de = 525;

    /* renamed from: NAME */
    public static final java.lang.String f76929x24728b = "getMapIndoorFloor";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapActiveIndoorInfo", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMapActiveIndoorInfo", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapActiveIndoorInfo", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        vc1.p1 p1Var = (vc1.p1) E;
        vc1.v1 v1Var = p1Var.N;
        if (v1Var == null) {
            v1Var = new vc1.v1();
            v1Var.f516719a = "";
            v1Var.f516720b = "";
            v1Var.f516721c = new java.util.LinkedList();
            v1Var.f516722d = -1;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("buildingId", v1Var.f516719a);
            hashMap.put("buildingName", v1Var.f516720b);
            java.util.List list = v1Var.f516721c;
            if (list != null && ((java.util.LinkedList) list).size() > 0) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (vc1.w1 w1Var : v1Var.f516721c) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, w1Var.f516725a);
                    jSONArray.put(jSONObject2);
                }
                hashMap.put("floorList", jSONArray);
            }
            hashMap.put("floorIndex", java.lang.Integer.valueOf(v1Var.f516722d));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapActiveIndoorInfo", "put JSON data error : %s", e17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMapActiveIndoorInfo", "getMapActiveIndoorInfo ok, values:%s", hashMap.toString());
        C(lVar, i17, p("ok", hashMap), true, p1Var instanceof dg1.h);
    }
}
