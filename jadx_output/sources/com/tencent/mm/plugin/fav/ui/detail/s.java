package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class s implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100790d;

    public s(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI) {
        this.f100790d = favoriteFileDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        o72.k3 k3Var = o72.k3.LeavelFullScreen;
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100790d;
        o72.o3.b(k3Var, favoriteFileDetailUI.E);
        u82.a aVar = favoriteFileDetailUI.U;
        if (aVar != null && aVar.U(1, false)) {
            return true;
        }
        p82.a aVar2 = favoriteFileDetailUI.T;
        if (aVar2 != null && aVar2.m0(1)) {
            return true;
        }
        favoriteFileDetailUI.finish();
        return true;
    }
}
