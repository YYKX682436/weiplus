package pf1;

/* loaded from: classes7.dex */
public final class b0 extends gb1.i {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f76410x366c91de = -2;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f76411x24728b = "sendToHTMLVConsoleView";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        B((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar, jSONObject, i17, null);
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.optInt("htmlId");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, org.json.JSONObject jSONObject, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        java.lang.String str;
        java.lang.String str2;
        if (yVar == null || jSONObject == null) {
            return;
        }
        try {
            android.view.KeyEvent.Callback D = D(yVar, jSONObject);
            java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(D, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.webview.vconsole.HTMLVConsoleContract.IView");
            ((pf1.q) ((pf1.e) ((pf1.q) ((pf1.c) D)).m158332x143f1b92()).f435304a).f435323f.g("onMiniProgramMessage", optString);
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.d0(i17, u(str2, jSONObject2), c0Var);
        } catch (java.lang.IllegalArgumentException e18) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:" + e18.getMessage() : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            yVar.d0(i17, u(str2, jSONObject3), c0Var);
        }
    }
}
