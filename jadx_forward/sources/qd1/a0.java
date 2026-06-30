package qd1;

/* loaded from: classes.dex */
public final class a0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76451x366c91de = 1417;

    /* renamed from: NAME */
    private static final java.lang.String f76452x24728b = "updateActionSheet";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiUpdateActionSheet", "updateActionSheet data:" + jSONObject);
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiUpdateActionSheet", "env is null, return");
            return;
        }
        int optInt = jSONObject != null ? jSONObject.optInt(dm.i4.f66865x76d1ec5a, -1) : -1;
        if (optInt == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiUpdateActionSheet", "invalid id, return");
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str, jSONObject2));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
        java.lang.String a17 = nf.e.a(jSONObject, "alertText");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiUpdateActionSheet", "invoke, alertText: " + a17);
        java.lang.String optString = jSONObject.optString("itemList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
            int length = jSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.Object obj = jSONArray.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((java.lang.String) obj);
            }
            e9Var.m(new qd1.z(e9Var, optInt, i17, this, a17, arrayList));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.JsApiUpdateActionSheet", e18.getMessage());
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str4 != null ? str4 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var.a(i17, u(str, jSONObject3));
        }
    }
}
