package qd1;

/* loaded from: classes.dex */
public final class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76457x366c91de = 639;

    /* renamed from: NAME */
    private static final java.lang.String f76458x24728b = "updateToast";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiUpdateToast", "updateToast: %s", jSONObject);
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiUpdateToast", "env is null, return");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(V0, "getCurrentPageView(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
        int optInt = jSONObject.optInt(dm.i4.f66865x76d1ec5a, -1);
        if (optInt != -1) {
            e9Var.mo32091x9a3f0ba2().m(new qd1.d0(V0, e9Var, i17, this, optInt, jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiUpdateToast", "invalid id, return");
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str, jSONObject2));
    }
}
