package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class m0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI f100758d;

    public m0(com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI) {
        this.f100758d = favoriteImgDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f100758d.finish();
        return true;
    }
}
