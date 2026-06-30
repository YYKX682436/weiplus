package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class b2 implements al5.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI f100699a;

    public b2(com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI favoriteVideoPlayUI) {
        this.f100699a = favoriteVideoPlayUI;
    }

    @Override // al5.a4
    public void a() {
        com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI favoriteVideoPlayUI = this.f100699a;
        if (favoriteVideoPlayUI.f100674y) {
            if (!favoriteVideoPlayUI.f100664o.f101582w) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "longClickListener onClick isPrepared:false");
                return;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) favoriteVideoPlayUI.getContext(), 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.fav.ui.detail.e2(favoriteVideoPlayUI);
            k0Var.f211881s = new com.tencent.mm.plugin.fav.ui.detail.f2(favoriteVideoPlayUI);
            k0Var.v();
        }
    }
}
