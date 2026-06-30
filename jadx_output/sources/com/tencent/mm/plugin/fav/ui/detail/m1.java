package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI f100759d;

    public m1(com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI) {
        this.f100759d = favoriteSightDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var;
        com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI = this.f100759d;
        if (favoriteSightDetailUI.f100641r.I0() && o72.x1.i0(favoriteSightDetailUI.f100642s) && (f4Var = favoriteSightDetailUI.f100639p) != null && f4Var.isPlaying()) {
            return;
        }
        favoriteSightDetailUI.b7(true);
    }
}
