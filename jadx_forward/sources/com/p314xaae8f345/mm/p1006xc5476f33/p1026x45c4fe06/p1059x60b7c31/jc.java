package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class jc extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34372x366c91de = 1391;

    /* renamed from: NAME */
    private static final java.lang.String f34373x24728b = "requestPayAuthen";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        if (((d0Var == null || (t37 = d0Var.t3()) == null) ? null : t37.r0()) == null) {
            if (d0Var != null) {
                java.lang.String str = android.text.TextUtils.isEmpty("fail") ? "fail:internal error invalid android context" : "fail";
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", -1);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                d0Var.a(i17, u(str, jSONObject2));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestPayAuthen", "mmActivity is null, invoke fail!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestPayAuthen", "get data: %s", java.lang.String.valueOf(jSONObject));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("jsApiScene", "1");
        bundle.putString("notifyType", f34373x24728b);
        bundle.putString("appId", d0Var.mo48798x74292566());
        bundle.putString("nonceStr", jSONObject != null ? jSONObject.optString("nonceStr") : null);
        bundle.putString("timeStamp", jSONObject != null ? jSONObject.optString("timeStamp") : null);
        bundle.putString("package", jSONObject != null ? jSONObject.optString("package") : null);
        bundle.putString("paySign", jSONObject != null ? jSONObject.optString("paySign") : null);
        bundle.putString("signType", jSONObject != null ? jSONObject.optString("signType") : null);
        bundle.putString("jsapiName", f34373x24728b);
        bundle.putInt("jsapi_type", 1);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3170x59c587e3.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ic(d0Var, i17, this));
    }
}
