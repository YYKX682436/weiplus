package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.r f169080d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.r rVar) {
        this.f169080d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.r rVar = this.f169080d;
        if (rVar.f169082b.m(false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = rVar.f169082b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.k kVar = o0Var.C;
            if (kVar != null && (cVar = o0Var.f169066p) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.p0) kVar).b(cVar.f168970i, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.n.OTHER_VIDEO_PLAY);
            }
            rVar.f169082b.a("onPageSwitchEnd 1");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f169082b.f169051a, "onPageSwitchEnd, clearPipVideoRelated");
            rVar.f169082b.e(true, true);
        }
    }
}
