package be1;

/* loaded from: classes.dex */
public class r0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4232x366c91de = 168;

    /* renamed from: NAME */
    public static final java.lang.String f4233x24728b = "setClipboardData";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            lVar.a(i17, o("fail"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetClipboardData", "stevyang dataStr %s", optString);
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(lVar.mo50352x76847179(), com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, optString, null);
            lVar.a(i17, o("ok"));
            C(lVar, optString);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetClipboardData", "setPrimaryClip get exception:%s", e17);
            lVar.a(i17, o("fail:internal error"));
        }
    }

    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
    }
}
