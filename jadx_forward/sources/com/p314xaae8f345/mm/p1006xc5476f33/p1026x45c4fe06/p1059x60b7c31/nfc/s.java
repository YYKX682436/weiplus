package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc;

/* loaded from: classes7.dex */
public class s implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.t f163968c;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f163968c = tVar;
        this.f163966a = lVar;
        this.f163967b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.f
    /* renamed from: onResult */
    public void mo51151x57429edc(int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        int i18 = this.f163967b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f163966a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.t tVar = this.f163968c;
        if (i17 != 0) {
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(tVar, i17, "fail: " + str, hashMap);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "stopHCE callback result: %s", a17);
            if (lVar != null) {
                lVar.a(i18, a17);
                return;
            }
            return;
        }
        tVar.getClass();
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        if (mo48798x74292566 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(mo48798x74292566, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.f163934c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.a(lVar.mo48798x74292566(), 13, null);
        java.util.HashMap hashMap2 = new java.util.HashMap(2);
        hashMap2.put("errCode", 0);
        java.lang.String a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(tVar, 0, "ok", hashMap2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "stopHCE callback result: %s", a18);
        lVar.a(i18, a18);
    }
}
