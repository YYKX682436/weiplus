package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class u6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34900x366c91de = 1585;

    /* renamed from: NAME */
    public static final java.lang.String f34901x24728b = "jumpToOfflinePay";

    /* renamed from: g, reason: collision with root package name */
    public final int f165034g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        this.f162871e = false;
        android.app.Activity r07 = (d0Var == null || (t37 = d0Var.t3()) == null) ? null : t37.r0();
        if (r07 == null || jSONObject == null) {
            if (d0Var != null) {
                d0Var.a(i17, o("fail:internal error invalid android context"));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiJumpToOfflinePay", "mmActivity is null, invoke fail!");
            return;
        }
        nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t6(this, d0Var, i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiJumpToOfflinePay", "json: %s", jSONObject.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.e(d0Var.mo48798x74292566());
        if (e17 == null) {
            d0Var.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiJumpToOfflinePay", "sysConfig is null, invoke fail!");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(d0Var.mo48798x74292566());
        if (b17 == null) {
            d0Var.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiJumpToOfflinePay", "runtime is null, invoke fail!");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String mo48798x74292566 = d0Var.mo48798x74292566();
        if (mo48798x74292566 == null) {
            mo48798x74292566 = "";
        }
        intent.putExtra("appId", mo48798x74292566);
        java.lang.String optString = jSONObject.optString("timeStamp");
        if (optString == null) {
            optString = "";
        }
        intent.putExtra("timeStamp", optString);
        java.lang.String optString2 = jSONObject.optString("nonceStr");
        if (optString2 == null) {
            optString2 = "";
        }
        intent.putExtra("nonceStr", optString2);
        java.lang.String optString3 = jSONObject.optString("package");
        if (optString3 == null) {
            optString3 = "";
        }
        intent.putExtra("packageExt", optString3);
        java.lang.String optString4 = jSONObject.optString("signType");
        if (optString4 == null) {
            optString4 = "";
        }
        intent.putExtra("signtype", optString4);
        java.lang.String optString5 = jSONObject.optString("paySign");
        if (optString5 == null) {
            optString5 = "";
        }
        intent.putExtra("paySignature", optString5);
        java.lang.String str = e17.f387374d;
        if (str == null) {
            str = "";
        }
        intent.putExtra("wxapp_username", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = b17.x0();
        java.lang.String m52170xad58292c = x07 != null ? x07.m52170xad58292c() : null;
        if (m52170xad58292c == null) {
            m52170xad58292c = "";
        }
        intent.putExtra("wxapp_path", m52170xad58292c);
        intent.putExtra("jsapiFuncName", "WAJumpToOfflinePay");
        java.lang.String optString6 = jSONObject.optString("queryStr");
        java.lang.String str2 = optString6 != null ? optString6 : "";
        if (str2.length() == 0) {
            d0Var.a(i17, o("fail:queryStr is null"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiJumpToOfflinePay", "queryStr.isEmpty()");
        } else {
            intent.putExtra("queryString", str2);
            ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
            intent.putExtra("key_from_scene", 7);
            j45.l.n(r07, "offline", ".ui.WalletOfflineEntranceUI", intent, this.f165034g);
        }
    }
}
