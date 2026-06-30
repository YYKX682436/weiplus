package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class s0 implements kd0.o2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI f100791d;

    public s0(com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI) {
        this.f100791d = favoriteImgDetailUI;
    }

    @Override // kd0.o2
    public void K0(java.lang.String str, r45.aq3 aq3Var) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImgDetailUI", "onFetchedCodeInfo codeStr: %s", str);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = this.f100791d;
        com.tencent.mm.plugin.fav.ui.detail.a1 a1Var = null;
        for (com.tencent.mm.plugin.fav.ui.detail.a1 a1Var2 : favoriteImgDetailUI.f100628p.values()) {
            if (str.equals(a1Var2.f100687e)) {
                a1Var = a1Var2;
            }
        }
        if (a1Var == null || (k0Var = a1Var.f100685c) == null || !k0Var.i()) {
            return;
        }
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.Z6(favoriteImgDetailUI, a1Var);
    }
}
