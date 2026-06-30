package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.o f100894d;

    public b(com.tencent.mm.plugin.fav.ui.gallery.o oVar) {
        this.f100894d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.fav.ui.gallery.o oVar = this.f100894d;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = oVar.f101030q;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        oVar.f101030q = null;
    }
}
