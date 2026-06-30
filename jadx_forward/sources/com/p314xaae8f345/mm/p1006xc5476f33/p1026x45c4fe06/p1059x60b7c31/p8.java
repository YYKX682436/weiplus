package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class p8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34585x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34586x24728b = "opNativeRedDot";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString("op");
        int optInt = jSONObject.optInt("redDotType", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpNativeRedDot", "op:%s redDotType:%d", optString, java.lang.Integer.valueOf(optInt));
        optString.getClass();
        if (optString.equals("clear")) {
            cj1.b.a(optInt);
            lVar.a(i17, o("ok"));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOpNativeRedDot", "unknown op:%s", optString);
            lVar.a(i17, o("fail unknown op"));
        }
    }
}
