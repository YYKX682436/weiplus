package qd1;

/* loaded from: classes7.dex */
public final class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76463x366c91de = 105;

    /* renamed from: NAME */
    private static final java.lang.String f76464x24728b = "showToast";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (V0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowToast", "invoke JsApi JsApiShowToast failed, current page view is null.");
            e9Var.a(i17, o("fail"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowToast", "showToast:%s, callbackId:%d", jSONObject, java.lang.Integer.valueOf(i17));
        int optInt = jSONObject.optInt(dm.i4.f66865x76d1ec5a, -1);
        int optInt2 = jSONObject.optInt("duration", 1500);
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String optString2 = jSONObject.optString("icon", ya.b.f77504xbb80cbe3);
        java.lang.String optString3 = jSONObject.optString("image");
        V0.m(new qd1.w(this, e9Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3), V0, optInt, optInt2, optString, i17, jSONObject.optBoolean("mask"), optString2, optString3));
    }
}
