package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class f4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q4 f163338c;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q4 q4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f163338c = q4Var;
        this.f163336a = lVar;
        this.f163337b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f1885 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885) abstractC11888x1a859600;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q4 q4Var = this.f163338c;
        int i17 = this.f163337b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f163336a;
        if (c12165x963f1885 == null) {
            lVar.a(i17, q4Var.o("fail"));
            return;
        }
        int i18 = c12165x963f1885.f163196d;
        if (i18 != -1) {
            if (i18 != 0) {
                lVar.a(i17, q4Var.o("fail"));
                return;
            } else {
                lVar.a(i17, q4Var.o("cancel"));
                return;
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("tempFiles", new org.json.JSONArray(c12165x963f1885.f163197e));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "err tempFiles json object create");
        }
        lVar.a(i17, q4Var.p("ok", hashMap));
    }
}
