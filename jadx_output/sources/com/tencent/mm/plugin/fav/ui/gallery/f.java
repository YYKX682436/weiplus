package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.o f100914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f100915e;

    public f(com.tencent.mm.plugin.fav.ui.gallery.o oVar, boolean z17) {
        this.f100914d = oVar;
        this.f100915e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.fav.ui.gallery.o oVar = this.f100914d;
        com.tencent.mm.plugin.fav.ui.gallery.a aVar = oVar.f101021e;
        int i17 = oVar.f101025i.get();
        int i18 = oVar.f101026m;
        java.util.List list = oVar.f101024h;
        com.tencent.mm.plugin.fav.ui.gallery.u0 u0Var = (com.tencent.mm.plugin.fav.ui.gallery.u0) aVar;
        u0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[BatchSave] Complete: success=");
        sb6.append(this.f100915e);
        sb6.append(", saved=");
        sb6.append(i17);
        sb6.append("/");
        sb6.append(i18);
        sb6.append(", failed=");
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryUI", sb6.toString());
        boolean isEmpty = arrayList.isEmpty();
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = u0Var.f101084a;
        if (isEmpty) {
            java.lang.String string = h0Var.f100952l.getString(com.tencent.mm.R.string.f491919nx5);
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(h0Var.f100952l);
            e4Var.f211776c = string;
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
        } else {
            java.lang.String string2 = h0Var.f100952l.getString(com.tencent.mm.R.string.f491914nx4);
            android.app.Activity activity = h0Var.f100952l;
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
            u1Var.g(string2);
            u1Var.n(activity.getString(com.tencent.mm.R.string.c_g));
            u1Var.l(new com.tencent.mm.plugin.fav.ui.gallery.u0$$a());
            u1Var.q(false);
        }
        if (h0Var.f100941a == null || !com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100919b) {
            return;
        }
        h0Var.i();
    }
}
