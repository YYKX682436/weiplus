package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.o f100981d;

    public j(com.tencent.mm.plugin.fav.ui.gallery.o oVar) {
        this.f100981d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.fav.ui.gallery.o oVar = this.f100981d;
        if (oVar.f101030q == null) {
            android.app.Activity activity = oVar.f101020d;
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.f211776c = activity.getString(com.tencent.mm.R.string.nxe);
            e4Var.f211780g = 2;
            e4Var.f211778e = false;
            oVar.f101030q = e4Var.c();
        }
    }
}
