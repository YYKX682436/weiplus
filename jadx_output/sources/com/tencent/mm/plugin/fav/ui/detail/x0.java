package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class x0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f100812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.a1 f100813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI f100814f;

    public x0(com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI, com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.plugin.fav.ui.detail.a1 a1Var) {
        this.f100814f = favoriteImgDetailUI;
        this.f100812d = k0Var;
        this.f100813e = a1Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f100812d;
        k0Var.o(null);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = this.f100814f;
        if (favoriteImgDetailUI.f100630r) {
            if (favoriteImgDetailUI.f100627o.t0()) {
                g4Var.f(2, favoriteImgDetailUI.getContext().getString(com.tencent.mm.R.string.ccw));
            }
            if (favoriteImgDetailUI.f100627o.u0()) {
                g4Var.f(1, favoriteImgDetailUI.getContext().getString(com.tencent.mm.R.string.cbx));
            }
            g4Var.f(3, favoriteImgDetailUI.getContext().getString(com.tencent.mm.R.string.ccr));
            com.tencent.mm.plugin.fav.ui.detail.a1 a1Var = this.f100813e;
            if (com.tencent.mm.sdk.platformtools.t8.K0(a1Var.f100687e)) {
                return;
            }
            favoriteImgDetailUI.getClass();
            com.tencent.mm.plugin.fav.ui.detail.g0 g0Var = new com.tencent.mm.plugin.fav.ui.detail.g0(favoriteImgDetailUI, a1Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImgDetailUI", "fetchCodeInfo code: %s, hasGet: %b", a1Var.f100687e, java.lang.Boolean.valueOf(a1Var.f100692j));
            if (!a1Var.f100692j) {
                a1Var.f100692j = true;
                ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) favoriteImgDetailUI.f100631s).h(a1Var.f100688f, a1Var.f100687e);
            }
            k0Var.o(((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) favoriteImgDetailUI.f100631s).b(g0Var, a1Var.f100688f, a1Var.f100687e, 4));
        }
    }
}
