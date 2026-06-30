package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.o f101003d;

    public m(com.tencent.mm.plugin.fav.ui.gallery.o oVar) {
        this.f101003d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.fav.ui.gallery.o oVar = this.f101003d;
        com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = oVar.f101029p;
        if (b1Var == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[BatchSave] Download timeout, favId: ");
        o72.r2 r2Var = b1Var.f100897a;
        sb6.append(r2Var.field_id);
        sb6.append(", localId: ");
        sb6.append(r2Var.field_localId);
        sb6.append(", dataId: ");
        sb6.append(b1Var.f100898b.T);
        sb6.append(", stop download and continue next");
        com.tencent.mars.xlog.Log.e("MicroMsg.FavDataBatchSaveLogic", sb6.toString());
        oVar.f101023g.remove(oVar.c(b1Var));
        oVar.f101029p = null;
        oVar.a();
        oVar.f101031r.post(new com.tencent.mm.plugin.fav.ui.gallery.e(oVar, b1Var));
    }
}
