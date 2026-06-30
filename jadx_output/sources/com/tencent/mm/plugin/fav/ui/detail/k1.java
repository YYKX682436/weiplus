package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class k1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI f100750d;

    public k1(com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI) {
        this.f100750d = favoriteSightDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f100750d.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.fav.ui.detail.g1(this);
        k0Var.f211881s = new com.tencent.mm.plugin.fav.ui.detail.j1(this);
        k0Var.v();
        return true;
    }
}
