package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class qd implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.rd f164409d;

    public qd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.rd rdVar) {
        this.f164409d = rdVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1 c11946x584a00d1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1) obj;
        if (c11946x584a00d1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowImageOperateSheet", "processRecognizeQRCodeLogic data null");
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11946x584a00d1.f160177d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowImageOperateSheet", "processRecognizeQRCodeLogic result nil");
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.qd$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.md mdVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.qd.this.f164409d.f164437g;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1 c11946x584a00d12 = c11946x584a00d1;
                    mdVar.f163137a = c11946x584a00d12;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = mdVar.f163138b;
                    if (k0Var != null && k0Var.i()) {
                        mdVar.d();
                    }
                    int i17 = c11946x584a00d12.f160179f;
                    java.lang.String str = c11946x584a00d12.f160177d;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowImageOperateSheet", "processGetCodeInfo");
                    ((jd0.z1) ((kd0.l2) i95.n0.c(kd0.l2.class))).getClass();
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.e(i17, str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowImageOperateSheet", "processGetCodeInfo is not customCode, return, codeType:" + i17);
                        return;
                    }
                    kd0.p2 p2Var = mdVar.f163143g;
                    if (p2Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowImageOperateSheet", "processGetCodeInfo sheetItemLogic == null , return");
                        return;
                    }
                    java.lang.String mo48798x74292566 = mdVar.f163139c.mo48798x74292566();
                    kd0.f2 f2Var = new kd0.f2(str);
                    f2Var.f388168b = 5;
                    f2Var.f388169c = mo48798x74292566;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).i(i17, f2Var);
                }
            });
        }
    }
}
