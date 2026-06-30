package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class s4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a5 f163579c;

    public s4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a5 a5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f163579c = a5Var;
        this.f163577a = lVar;
        this.f163578b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12167xc1abb645 c12167xc1abb645 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12167xc1abb645) abstractC11888x1a859600;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a5 a5Var = this.f163579c;
        int i17 = this.f163578b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f163577a;
        if (c12167xc1abb645 == null) {
            lVar.a(i17, a5Var.o("fail"));
            return;
        }
        int i18 = c12167xc1abb645.f163203d;
        if (i18 != -1) {
            if (i18 != 0) {
                lVar.a(i17, a5Var.o("fail"));
                return;
            } else {
                lVar.a(i17, a5Var.o("cancel"));
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55 c11696x173f8d55 = c12167xc1abb645.f163204e;
        if (c11696x173f8d55 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseVideo", "choose result code is OK but videoObj null");
            lVar.a(i17, a5Var.o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("tempFilePath", c11696x173f8d55.f157635d);
        hashMap.put("duration", java.lang.Integer.valueOf(c11696x173f8d55.f157645n));
        hashMap.put("size", java.lang.Long.valueOf(c11696x173f8d55.f157646o));
        hashMap.put("height", java.lang.Integer.valueOf(c11696x173f8d55.f157648q));
        hashMap.put("width", java.lang.Integer.valueOf(c11696x173f8d55.f157647p));
        lVar.a(i17, a5Var.p("ok", hashMap));
    }
}
