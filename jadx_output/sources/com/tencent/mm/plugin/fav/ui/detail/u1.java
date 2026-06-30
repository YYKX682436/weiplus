package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes11.dex */
public class u1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI f100803d;

    public u1(com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI favoriteTextDetailUI) {
        this.f100803d = favoriteTextDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f100803d.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.fav.ui.detail.q1(this);
        k0Var.f211881s = new com.tencent.mm.plugin.fav.ui.detail.t1(this);
        k0Var.v();
        return true;
    }
}
