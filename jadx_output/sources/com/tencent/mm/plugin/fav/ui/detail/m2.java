package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes9.dex */
public class m2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI f100760d;

    public m2(com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI favoriteVoiceDetailUI) {
        this.f100760d = favoriteVoiceDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f100760d.finish();
        return true;
    }
}
