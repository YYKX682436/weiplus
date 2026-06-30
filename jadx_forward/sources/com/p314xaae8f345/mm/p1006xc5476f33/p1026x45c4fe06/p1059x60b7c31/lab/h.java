package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab;

/* loaded from: classes7.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34390x366c91de = 558;

    /* renamed from: NAME */
    public static final java.lang.String f34391x24728b = "setLabInfo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetLabInfo", "fail:data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String optString = jSONObject.optString("labId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || !jSONObject.has("enabled")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetLabInfo", "fail:labId is null or no enabled");
            lVar.a(i17, o("fail:invalid data"));
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.C12143xbfa90314(optString, jSONObject.optBoolean("enabled")), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.f.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.e(this, lVar, i17));
        }
    }
}
