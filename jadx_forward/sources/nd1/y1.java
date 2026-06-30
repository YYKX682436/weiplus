package nd1;

/* loaded from: classes7.dex */
public final class y1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f72987x366c91de = 1066;

    /* renamed from: NAME */
    private static final java.lang.String f72988x24728b = "setVisualEffectOnCapture";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o4 o4Var;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (yVar == null) {
            return;
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("visualEffect", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSetVisualEffectOnCapture", "invoke, visualEffect: " + optString);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = yVar.mo32091x9a3f0ba2();
        if (mo32091x9a3f0ba2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.SafeScreenShotRecordSwitcher", "get, runtime is null");
            o4Var = null;
        } else {
            o4Var = mo32091x9a3f0ba2.T1;
        }
        if (o4Var == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "hidden")) {
            ((ku5.t0) ku5.t0.f394148d).B(new nd1.w1(o4Var));
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            yVar.a(i17, u(str2, jSONObject3));
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            yVar.a(i17, u(str2, jSONObject4));
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new nd1.x1(o4Var));
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("errno", 0);
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        yVar.a(i17, u(str2, jSONObject5));
    }
}
