package sc1;

/* loaded from: classes7.dex */
public class c1 extends gb1.h {

    /* renamed from: CTRL_INDEX */
    private static final int f76734x366c91de = 363;

    /* renamed from: NAME */
    public static final java.lang.String f76735x24728b = "operateLivePusher";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("livePusherId");
    }

    @Override // gb1.h
    public boolean J() {
        return true;
    }

    @Override // gb1.h
    public boolean L(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject, gb1.n nVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLivePusher", "onOperateView : livePusherId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateLivePusher", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.View view2 = (android.view.View) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(android.view.View.class);
        if (!(view2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateLivePusher", "targetView not AppBrandLivePusherView");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e) view2;
        java.lang.String optString = jSONObject.optString("type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLivePusher", "onOperateView operateType=%s", optString);
        if (optString.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159978f)) {
            c12151x47b5a23e.m51032x8ba6f71a(new sc1.b1(this, nVar, tVar));
            if (c12151x47b5a23e.f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159978f, jSONObject)) {
                return true;
            }
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            nVar.a(u(str2, jSONObject2));
            return true;
        }
        if (!optString.equalsIgnoreCase("playBGM")) {
            if (c12151x47b5a23e.f(optString, jSONObject)) {
                str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str2 = str3 != null ? str3 : "";
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 0);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                nVar.a(u(str2, jSONObject3));
                return true;
            }
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            nVar.a(u(str2, jSONObject4));
            return true;
        }
        java.lang.String optString2 = jSONObject.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, url is nil");
            java.lang.String str7 = android.text.TextUtils.isEmpty("fail:url is nil") ? "fail:jsapi invalid request data" : "fail:url is nil";
            java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            try {
                jSONObject5.put("errno", 101);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            nVar.a(u(str7, jSONObject5));
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d0.c(tVar, optString2, null, new sc1.a1(this, jSONObject, c12151x47b5a23e, optString2));
        str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str3 != null ? str3 : "";
        java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
        try {
            jSONObject6.put("errno", 0);
        } catch (java.lang.Exception e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
        }
        nVar.a(u(str2, jSONObject6));
        return true;
    }
}
