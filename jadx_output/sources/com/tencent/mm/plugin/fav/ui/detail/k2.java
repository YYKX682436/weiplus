package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class k2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI f100751d;

    public k2(com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI favoriteVideoPlayUI) {
        this.f100751d = favoriteVideoPlayUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI favoriteVideoPlayUI = this.f100751d;
        favoriteVideoPlayUI.f100664o.getViewTreeObserver().removeOnPreDrawListener(this);
        favoriteVideoPlayUI.f100672w.c(favoriteVideoPlayUI.f100664o, favoriteVideoPlayUI.f100663n, new com.tencent.mm.plugin.fav.ui.detail.j2(this));
        return true;
    }
}
