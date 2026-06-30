package yc1;

/* loaded from: classes7.dex */
public final class m extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f77521x366c91de = -2;

    /* renamed from: NAME */
    private static final java.lang.String f77522x24728b = "bindSocketToNetwork";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        if (lVar == null) {
            return;
        }
        if (jSONObject == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiBindSocketToNetwork", "invoke, data: " + jSONObject);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wifi", jSONObject.optString("networkType"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiBindSocketToNetwork", "invoke, not bind to wifi is denied now");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str2, jSONObject3));
            return;
        }
        int optInt = jSONObject.optInt("socketFd", -1);
        if (optInt >= 0) {
            yc1.l lVar2 = new yc1.l(lVar, i17, this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindSocketToNetworkLogic", "bindSocketToWifi, socketFd: " + optInt);
            uh1.r1.f509431h.b(new uh1.d1(lVar2, optInt));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiBindSocketToNetwork", "invoke, socketFd is invalid");
        str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        str2 = str != null ? str : "";
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", 101);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        lVar.a(i17, u(str2, jSONObject4));
    }
}
