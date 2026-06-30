package wc1;

/* loaded from: classes7.dex */
public class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77343x366c91de = 1411;

    /* renamed from: NAME */
    public static final java.lang.String f77344x24728b = "listenLoadSubPackageTaskStateChange";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCreateLoadSubPackageTask", "JsApiListenLoadSubPackageTaskStateChange get the env,but the env is null");
            return;
        }
        wc1.t tVar = (wc1.t) e9Var.k(wc1.t.class);
        if (tVar == null) {
            tVar = new wc1.t(e9Var);
            if (!tVar.f526029e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateLoadSubPackageTask", "JsApiListenLoadSubPackageTaskStateChange not support listen task state change");
                str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi not supported" : null;
                str2 = str != null ? str : "";
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 100);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                e9Var.a(i17, u(str2, jSONObject2));
                return;
            }
            e9Var.l(tVar);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("states");
        if (optJSONArray != null) {
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                arrayList.add(optJSONArray.optString(i18));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateLoadSubPackageTask", "allowed statesList:" + arrayList);
        java.util.HashSet hashSet = new java.util.HashSet();
        tVar.f526028d = hashSet;
        hashSet.addAll(arrayList);
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        e9Var.a(i17, u(str2, jSONObject3));
    }
}
