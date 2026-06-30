package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class y9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f35024x366c91de = 192;

    /* renamed from: NAME */
    public static final java.lang.String f35025x24728b = "openSetting";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (c0Var.t3().E0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenSetting", "config is null!");
            c0Var.a(i17, o("fail:internal error"));
            return;
        }
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenSetting", "mmActivity is null, invoke fail!");
            return;
        }
        java.lang.String str = "";
        java.lang.String optString = c0Var.t3().u0().f128817z == 7 ? jSONObject.optString(dm.i4.f66875xa013b0d5) : "";
        boolean optBoolean = jSONObject.optBoolean("withSubscriptions", false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            optString = c0Var.t3().u0().f128811x;
        }
        android.content.Intent putExtra = new android.content.Intent(c0Var.getF229340d(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.class).putExtra("key_username", optString);
        putExtra.putExtra("key_app_authorize_jsapi", true);
        java.lang.String mo48798x74292566 = c0Var.mo48798x74292566();
        try {
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(mo48798x74292566).u0().f128809v;
            if (str2 != null) {
                str = str2;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenSetting", "openSetting, get runtime by %s, e = %s", mo48798x74292566, e17);
            str = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenSetting", "appId:%s, sessionId:%s", mo48798x74292566, str);
        putExtra.putExtra("key_app_session_id", str);
        putExtra.setClass(Z0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.class);
        nf.g.a(Z0).j(putExtra, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x9(this, optBoolean, c0Var, i17));
    }
}
