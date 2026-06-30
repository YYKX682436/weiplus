package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class e2 implements com.tencent.mm.plugin.fav.ui.gallery.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.l2 f100913a;

    public e2(com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var) {
        this.f100913a = l2Var;
    }

    public void a(boolean z17, com.tencent.mm.plugin.fav.ui.gallery.o1 o1Var, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[onCheck] isChecked :%s pos:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (z17) {
            com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.a(o1Var.f101036b);
        } else {
            com.tencent.mm.plugin.fav.ui.gallery.f1 f1Var = com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a;
            com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = o1Var.f101036b;
            f1Var.getClass();
            if (b1Var != null) {
                r45.gp0 gp0Var = b1Var.f100898b;
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGallerySelectedHandle", "remove : %s", gp0Var.T);
                java.util.ArrayList arrayList = f1Var.f100918a;
                arrayList.remove(b1Var);
                arrayList.remove(f1Var.c(gp0Var.T));
                java.util.Iterator it = f1Var.f100920c.iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.fav.ui.gallery.l2) ((com.tencent.mm.plugin.fav.ui.gallery.e1) it.next())).f100999g = true;
                }
            }
        }
        ((com.tencent.mm.plugin.fav.ui.gallery.h0) this.f100913a.f100993a).k(com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100918a.size());
    }
}
