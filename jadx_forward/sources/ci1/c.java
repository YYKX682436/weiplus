package ci1;

/* loaded from: classes7.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f4386x366c91de = 1468;

    /* renamed from: NAME */
    private static final java.lang.String f4387x24728b = "getChatForwardMaterials";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        ci1.a aVar;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiGetChatForwardMaterials", "getChatForwardMaterials data: " + jSONObject);
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiGetChatForwardMaterials", "getChatForwardMaterials fail, env is null");
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiGetChatForwardMaterials", "getChatForwardMaterials fail, data is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str2, jSONObject2));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = e9Var.mo32091x9a3f0ba2();
        if (mo32091x9a3f0ba2 != null) {
            aVar = (ci1.a) mo32091x9a3f0ba2.k(ci1.a.class);
            if (aVar == null) {
                aVar = new ci1.a();
                mo32091x9a3f0ba2.l(aVar);
            }
        } else {
            aVar = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        bi1.f fVar = aVar.f123193d;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiGetChatForwardMaterials", "materialData is null, return");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str2, jSONObject3));
            return;
        }
        java.lang.String str5 = fVar.f102516e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, "chat")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiGetChatForwardMaterials", "materialOrigin is " + str5 + ", return");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var.a(i17, u(str2, jSONObject4));
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("needGroupOpenID", false);
        j91.d dVar = (j91.d) e9Var.mo32091x9a3f0ba2().K1(j91.d.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar;
        java.lang.String d17 = tVar.d();
        boolean g17 = tVar.g();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new ci1.b(optBoolean, g17, d17, fVar, e9Var, i17, this, null), 3, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiGetChatForwardMaterials", "sendToUserName is null, return");
        str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        str2 = str != null ? str : "";
        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("errno", 4);
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        e9Var.a(i17, u(str2, jSONObject5));
    }
}
