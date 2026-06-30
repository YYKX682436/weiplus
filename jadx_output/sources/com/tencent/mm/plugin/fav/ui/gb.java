package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class gb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f101118d;

    public gb(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI) {
        this.f101118d = favoriteIndexUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f101118d;
        if (favoriteIndexUI.T.f100484q) {
            favoriteIndexUI.t7();
            return true;
        }
        favoriteIndexUI.finish();
        return true;
    }
}
