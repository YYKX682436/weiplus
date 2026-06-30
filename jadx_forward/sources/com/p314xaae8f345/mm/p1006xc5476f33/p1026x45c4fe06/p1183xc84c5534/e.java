package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public class e implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd.c f169364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.f f169365e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.f fVar, vd.c cVar) {
        this.f169365e = fVar;
        this.f169364d = cVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p) obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameExtraConfigMgr", "hy: on get wxa game config resp: success?:%s, exception?:%s", bool, pVar);
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.f fVar = this.f169365e;
        if (booleanValue) {
            r45.xs3 xs3Var = this.f169364d.f516895b;
            if (xs3Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("response");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i iVar = fVar.f169374f;
            iVar.f169396c = xs3Var.f471907d;
            iVar.f169397d = xs3Var.f471908e;
            iVar.f169398e = xs3Var.f471909f;
            iVar.f169399f = xs3Var.f471910g;
            iVar.f169400g = xs3Var.f471911h;
            iVar.f169402i = xs3Var.f471912i;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.h hVar = fVar.f169373e;
        if (hVar != null) {
            ((fa1.f) hVar).a(bool.booleanValue(), pVar);
        }
        return jz5.f0.f384359a;
    }
}
