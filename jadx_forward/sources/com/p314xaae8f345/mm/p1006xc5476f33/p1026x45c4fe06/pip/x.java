package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f169097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y f169098e;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y yVar, boolean z17) {
        this.f169098e = yVar;
        this.f169097d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y yVar = this.f169098e;
        if (yVar.f169100a.m(false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = yVar.f169100a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.k kVar = o0Var.C;
            if (kVar != null && (cVar = o0Var.f169066p) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.p0) kVar).b(cVar.f168970i, this.f169097d ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.n.OTHER_VIDEO_AUTO_PLAY : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.n.OTHER_VIDEO_PLAY);
            }
            yVar.f169100a.a("processTransferFromOnPlay");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.f169100a.f169051a, "processTransferFromOnPlay, clearPipVideoRelated");
            yVar.f169100a.e(true, true);
        }
    }
}
