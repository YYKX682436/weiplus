package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o f182536d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o oVar) {
        this.f182536d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o oVar = this.f182536d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = oVar.f182562p;
        if (b1Var == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[BatchSave] Download timeout, favId: ");
        o72.r2 r2Var = b1Var.f182430a;
        sb6.append(r2Var.f67643xc8a07680);
        sb6.append(", localId: ");
        sb6.append(r2Var.f67645x88be67a1);
        sb6.append(", dataId: ");
        sb6.append(b1Var.f182431b.T);
        sb6.append(", stop download and continue next");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavDataBatchSaveLogic", sb6.toString());
        oVar.f182556g.remove(oVar.c(b1Var));
        oVar.f182562p = null;
        oVar.a();
        oVar.f182564r.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.e(oVar, b1Var));
    }
}
