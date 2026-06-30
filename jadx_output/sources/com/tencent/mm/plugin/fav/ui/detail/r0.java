package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class r0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f100785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI f100786e;

    public r0(com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI, long j17) {
        this.f100786e = favoriteImgDetailUI;
        this.f100785d = j17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f100786e.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.fav.ui.detail.n0(this);
        k0Var.f211881s = new com.tencent.mm.plugin.fav.ui.detail.q0(this);
        k0Var.v();
        return true;
    }
}
