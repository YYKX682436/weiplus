package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class x5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f35006x366c91de = 101;

    /* renamed from: NAME */
    public static final java.lang.String f35007x24728b = "getAppConfig";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (jSONObject == null) {
            c0Var.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetAppConfig", "data is null");
            return;
        }
        java.lang.String mo48798x74292566 = c0Var.mo48798x74292566();
        int optInt = jSONObject.optInt("type", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetAppConfig", "getAppConfig app_id:%s,type:%d", mo48798x74292566, java.lang.Integer.valueOf(optInt));
        if (optInt <= 0) {
            c0Var.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetAppConfig", "type %d is invalid", java.lang.Integer.valueOf(optInt));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11918x149daf43 c11918x149daf43 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11918x149daf43();
        c11918x149daf43.f160050f = mo48798x74292566;
        c11918x149daf43.f160053i = optInt;
        c11918x149daf43.f160054m = c0Var.t3().g2();
        c11918x149daf43.f160055n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w5(this, optInt, c11918x149daf43, c0Var, i17);
        c11918x149daf43.d();
    }
}
