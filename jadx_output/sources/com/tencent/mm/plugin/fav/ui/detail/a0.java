package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class a0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.f0 f100682d;

    public a0(com.tencent.mm.plugin.fav.ui.detail.f0 f0Var) {
        this.f100682d = f0Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.fav.ui.detail.f0 f0Var = this.f100682d;
        boolean z17 = f0Var.f100715d;
        boolean z18 = f0Var.f100716e;
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = f0Var.f100718g;
        if (z17 && !favoriteFileDetailUI.H.b(favoriteFileDetailUI.F, false, false) && favoriteFileDetailUI.F.X1 == 0) {
            int i17 = f0Var.f100717f;
            if (i17 == 8) {
                g4Var.f(0, favoriteFileDetailUI.getString(com.tencent.mm.R.string.ccw));
                if (favoriteFileDetailUI.U != null) {
                    g4Var.f(5, favoriteFileDetailUI.getString(com.tencent.mm.R.string.c0w));
                }
                java.lang.String n17 = com.tencent.mm.vfs.w6.n(favoriteFileDetailUI.c7());
                if (((d73.i) i95.n0.c(d73.i.class)).Qg() && favoriteFileDetailUI.S != null && com.tencent.mm.plugin.handoff.model.AbsHandOffFile.Companion.a(n17)) {
                    g4Var.f(6, favoriteFileDetailUI.getString(com.tencent.mm.R.string.cff));
                }
            } else if (i17 == 15) {
                g4Var.f(0, favoriteFileDetailUI.getString(com.tencent.mm.R.string.ccw));
                g4Var.f(4, favoriteFileDetailUI.getString(com.tencent.mm.R.string.i8d));
            } else if (i17 == 4) {
                g4Var.f(0, favoriteFileDetailUI.getString(com.tencent.mm.R.string.ccw));
                g4Var.f(4, favoriteFileDetailUI.getString(com.tencent.mm.R.string.i8d));
            } else {
                g4Var.f(0, favoriteFileDetailUI.getString(com.tencent.mm.R.string.ccw));
                if (z18 && favoriteFileDetailUI.E.u0()) {
                    g4Var.f(1, favoriteFileDetailUI.getString(com.tencent.mm.R.string.cbx));
                }
            }
            if (com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.i7(favoriteFileDetailUI.F)) {
                g4Var.f(7, favoriteFileDetailUI.getString(com.tencent.mm.R.string.dt7));
            }
        }
        if (z18) {
            g4Var.f(3, favoriteFileDetailUI.getString(com.tencent.mm.R.string.f491195ca4));
            g4Var.f(2, favoriteFileDetailUI.getContext().getString(com.tencent.mm.R.string.f490367t0));
        }
    }
}
