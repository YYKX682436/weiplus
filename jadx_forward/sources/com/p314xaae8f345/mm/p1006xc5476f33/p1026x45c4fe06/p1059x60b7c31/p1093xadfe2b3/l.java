package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes8.dex */
public class l implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.m f163075a;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.m mVar) {
        this.f163075a = mVar;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenLiteApp", "jsApiOpenLiteApp fail");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.m mVar = this.f163075a;
        mVar.f163077e.a(mVar.f163078f, mVar.f163081i.o("fail"));
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenLiteApp", "jsApiOpenLiteApp success. forcePortrait:%b openType:%d", java.lang.Boolean.valueOf(this.f163075a.f163081i.f163092i), java.lang.Integer.valueOf(this.f163075a.f163079g.f442190i));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.m mVar = this.f163075a;
        if (mVar.f163081i.f163092i && mVar.f163079g.f442190i == 1) {
            ((android.app.Activity) mVar.f163080h).setRequestedOrientation(1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.m mVar2 = this.f163075a;
        mVar2.f163077e.a(mVar2.f163078f, mVar2.f163081i.o("ok"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.u uVar = this.f163075a.f163081i;
        if (uVar.f163090g) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.n(uVar);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(nVar, 1000L, false);
        }
    }
}
