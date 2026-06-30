package qd1;

/* loaded from: classes.dex */
public final class c0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76455x366c91de = 1416;

    /* renamed from: NAME */
    private static final java.lang.String f76456x24728b = "updateModal";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiUpdateModal", "updateModal data:" + jSONObject);
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiUpdateModal", "env is null, return");
            return;
        }
        int optInt = jSONObject != null ? jSONObject.optInt(dm.i4.f66865x76d1ec5a, -1) : -1;
        if (optInt != -1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
            e9Var.m(new qd1.b0(e9Var, optInt, i17, this, jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28), jSONObject.optString("content", ""), jSONObject.optString("placeholderText"), jSONObject.optString("confirmText", e9Var.getF229340d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gpa)), jSONObject.optString("cancelText", e9Var.getF229340d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gp9))));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiUpdateModal", "invalid id, return");
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str2, jSONObject2));
    }
}
