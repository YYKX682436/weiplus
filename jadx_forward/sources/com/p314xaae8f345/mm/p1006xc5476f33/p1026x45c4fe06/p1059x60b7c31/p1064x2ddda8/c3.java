package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class c3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ui1.z f160957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f3 f160958b;

    public c3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f3 f3Var, ui1.z zVar) {
        this.f160958b = f3Var;
        this.f160957a = zVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOperateWXData", "[onCreateUserActionUpdate] action=" + mVar);
        this.f160958b.f161071e.f160924u = mVar.f161051d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n
    public void b(java.util.List list) {
        this.f160957a.mo2041x3f8132ef(list);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n
    public void c(boolean z17, boolean z18, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f3 f3Var = this.f160958b;
        ui1.z zVar = this.f160957a;
        if (!z17 && !z18) {
            zVar.mo2030x8f8b3d79(str2);
            zVar.mo2031x5951856a(f3Var.f161071e.f160910g.getF229340d().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce = f3Var.f161071e;
            c12004xb7c17ce.getClass();
            zVar.mo2029x3aaeeaf1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g3(c12004xb7c17ce, oVar));
            return;
        }
        if (z17) {
            zVar.mo2030x8f8b3d79("");
        } else {
            zVar.mo2030x8f8b3d79(str);
            zVar.mo2031x5951856a(f3Var.f161071e.f160910g.getF229340d().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce2 = f3Var.f161071e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce.f160907z1;
        c12004xb7c17ce2.getClass();
        zVar.mo2029x3aaeeaf1(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n
    /* renamed from: getAppId */
    public java.lang.String mo50593x74292566() {
        return this.f160958b.f161071e.f160930y;
    }
}
