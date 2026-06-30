package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc;

/* loaded from: classes7.dex */
public class l implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f163948c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.m f163949d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f163949d = mVar;
        this.f163946a = lVar;
        this.f163947b = i17;
        this.f163948c = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.f
    /* renamed from: onResult */
    public void mo51151x57429edc(int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        int i18 = this.f163947b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f163946a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.m mVar = this.f163949d;
        if (i17 != 0) {
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(mVar, i17, "fail: " + str, hashMap);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCSendHCEResponseCommand", "sendHCEMessage callback json: %s", a17);
            if (lVar != null) {
                lVar.a(i18, a17);
                return;
            }
            return;
        }
        mVar.getClass();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.String optString = this.f163948c.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_apdu_command", optString);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.a(lVar.mo48798x74292566(), 32, bundle);
            hashMap2.put("errCode", 0);
            lVar.a(i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(mVar, 0, "ok", hashMap2));
            return;
        }
        hashMap2.put("errCode", 13005);
        java.lang.String a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(mVar, 13005, "fail", hashMap2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCSendHCEResponseCommand", "sendHCEMessage callback json: %s", a18);
        if (lVar != null) {
            lVar.a(i18, a18);
        }
    }
}
