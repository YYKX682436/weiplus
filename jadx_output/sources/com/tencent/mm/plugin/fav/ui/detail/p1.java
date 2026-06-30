package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes11.dex */
public class p1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI f100777d;

    public p1(com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI favoriteTextDetailUI) {
        this.f100777d = favoriteTextDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f100777d.finish();
        return true;
    }
}
