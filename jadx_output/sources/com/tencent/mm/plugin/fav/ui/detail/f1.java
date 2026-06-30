package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class f1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI f100719d;

    public f1(com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI) {
        this.f100719d = favoriteSightDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f100719d.finish();
        return true;
    }
}
