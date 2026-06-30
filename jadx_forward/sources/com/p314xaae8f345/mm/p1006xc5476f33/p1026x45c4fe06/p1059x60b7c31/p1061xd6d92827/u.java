package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827;

/* loaded from: classes.dex */
public final class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.r {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.r
    public void C(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(uc1.f2.f76870x366c91de, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.r
    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 service = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = service.t3();
        if (t37 == null || (u07 = t37.u0()) == null) {
            return;
        }
        int i17 = u07.f128817z + 1000;
        java.lang.String mo48798x74292566 = service.mo48798x74292566();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (mo48798x74292566 == null) {
            mo48798x74292566 = "";
        }
        objArr[1] = mo48798x74292566;
        g0Var.d(15651, objArr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.r
    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, android.content.Intent intent, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 service = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = service.t3();
        android.app.Activity r07 = t37 != null ? t37.r0() : null;
        if (r07 == null) {
            service.a(i17, o("fail:internal error invalid android context"));
        } else if (service instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.x) {
            intent.setClassName(r07, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            nf.g.a(r07).j(intent, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.t(service, i17, this));
        } else {
            j45.l.j(r07, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
            service.a(i17, o("ok"));
        }
    }
}
