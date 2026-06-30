package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public class m8 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f156719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.n8 f156720e;

    public m8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.n8 n8Var, km5.b bVar) {
        this.f156720e = n8Var;
        this.f156719d = bVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ff4 ff4Var;
        km5.b bVar = this.f156719d;
        java.lang.String requestAppID = this.f156720e.f156729a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestAppID, "requestAppID");
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = m1Var != null ? m1Var.mo47948x7f0c4558() : null;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = mo47948x7f0c4558 instanceof com.p314xaae8f345.mm.p944x882e457a.o ? (com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c4558 : null;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152243a.f152217a : null;
        r45.dr5 dr5Var = fVar instanceof r45.dr5 ? (r45.dr5) fVar : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((dr5Var == null || (ff4Var = dr5Var.f454237d) == null) ? null : ff4Var.f455804d, requestAppID)) {
            gm0.j1.n().f354821b.q(1345, this);
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c45582 = m1Var != null ? m1Var.mo47948x7f0c4558() : null;
                com.p314xaae8f345.mm.p944x882e457a.o oVar2 = mo47948x7f0c45582 instanceof com.p314xaae8f345.mm.p944x882e457a.o ? (com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c45582 : null;
                java.lang.Object obj = oVar2 != null ? oVar2.f152244b.f152233a : null;
                r45.er5 er5Var = obj instanceof r45.er5 ? (r45.er5) obj : null;
                if (er5Var == null) {
                    throw new java.lang.IllegalArgumentException();
                }
                objArr[0] = java.lang.Integer.valueOf(er5Var.f455227d);
                bVar.c(objArr);
            } catch (java.lang.Exception e17) {
                bVar.a(e17);
            }
        }
    }
}
