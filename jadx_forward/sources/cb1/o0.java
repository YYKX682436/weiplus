package cb1;

/* loaded from: classes.dex */
public class o0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4275x366c91de = 402;

    /* renamed from: NAME */
    public static final java.lang.String f4276x24728b = "openRealnameAuth";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenRealnameAuth", "getIDCardInfo data is null");
            v5Var.a(i17, o("fail:data is null"));
            return;
        }
        android.app.Activity r07 = v5Var.t3().r0();
        if (r07 == null) {
            v5Var.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenRealnameAuth", "mmActivity is null, invoke fail!");
            return;
        }
        java.lang.String optString = jSONObject.optString("categoryId", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenRealnameAuth", "category_id is null");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 40003);
            v5Var.a(i17, p("fail:category_id is empty", hashMap));
            return;
        }
        java.lang.String mo48798x74292566 = v5Var.mo48798x74292566();
        int optInt = jSONObject.optInt("authType", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenRealnameAuth", "getIDCardInfo category_id:%s, appId:%s, authType:%d", optString, mo48798x74292566, java.lang.Integer.valueOf(optInt));
        android.content.Intent intent = new android.content.Intent(r07, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5.class);
        intent.putExtra("intent_appid", mo48798x74292566);
        intent.putExtra("intent_category_id", optString);
        intent.putExtra("intent_auth_type", optInt);
        intent.putExtra("id_ui_theme", 1);
        nf.g.a(r07).j(intent, new cb1.n0(this, v5Var, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14943, mo48798x74292566, 1, "");
    }
}
