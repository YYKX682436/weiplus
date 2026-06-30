package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes11.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.o f100992d;

    public l(com.tencent.mm.plugin.fav.ui.gallery.o oVar) {
        this.f100992d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.fav.ui.gallery.o oVar = this.f100992d;
        java.lang.String string = oVar.f101020d.getString(com.tencent.mm.R.string.nxj);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(oVar.f101020d);
        u1Var.g(string);
        u1Var.n(oVar.f101020d.getString(com.tencent.mm.R.string.c_g));
        u1Var.l(com.tencent.mm.plugin.fav.ui.gallery.k.f100987a);
        u1Var.q(false);
    }
}
