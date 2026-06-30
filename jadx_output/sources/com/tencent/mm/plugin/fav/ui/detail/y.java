package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100816d;

    public y(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI) {
        this.f100816d = favoriteFileDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100816d;
        if (favoriteFileDetailUI.E.J0()) {
            r45.gp0 gp0Var = favoriteFileDetailUI.F;
            com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
            o72.e2 Xf = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(gp0Var.T);
            if (Xf != null && Xf.field_status != 3) {
                Xf.field_status = 2;
                ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().update(Xf, "dataId");
                ((a82.v) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).T6(gp0Var.T);
            }
            o72.e2 Xf2 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(o72.x1.W(gp0Var.T));
            if (Xf2 != null && Xf2.field_status != 3) {
                Xf2.field_status = 2;
                ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().update(Xf2, "dataId");
                ((a82.v) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).T6(o72.x1.W(gp0Var.T));
            }
            favoriteFileDetailUI.f100611o.setText(com.tencent.mm.R.string.cb_);
        } else {
            o72.r2 r2Var = favoriteFileDetailUI.E;
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = o72.x1.f343515a;
            if (r2Var.Q0()) {
                java.util.Iterator it = r2Var.field_favProto.f370964f.iterator();
                while (it.hasNext()) {
                    r45.gp0 gp0Var2 = (r45.gp0) it.next();
                    o72.e2 Xf3 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(gp0Var2.T);
                    if (Xf3 != null && Xf3.field_status != 3) {
                        Xf3.field_status = 2;
                        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().update(Xf3, "dataId");
                        ((a82.v) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).U6(gp0Var2.T);
                    }
                    o72.e2 Xf4 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(o72.x1.W(gp0Var2.T));
                    if (Xf4 != null && Xf4.field_status != 3) {
                        Xf4.field_status = 2;
                        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().update(Xf4, "dataId");
                        ((a82.v) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).U6(o72.x1.W(gp0Var2.T));
                    }
                }
                o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(r2Var.field_localId);
                int i17 = F.field_itemStatus;
                if (i17 == 1) {
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(3, F.field_localId);
                } else if (i17 == 4) {
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(6, F.field_localId);
                } else if (i17 == 9) {
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(11, F.field_localId);
                } else if (i17 == 12) {
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(14, F.field_localId);
                } else if (i17 == 15) {
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(16, F.field_localId);
                } else if (i17 == 17) {
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(18, F.field_localId);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, not uploading");
            }
            favoriteFileDetailUI.f100611o.setText(com.tencent.mm.R.string.cba);
        }
        favoriteFileDetailUI.h7();
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
