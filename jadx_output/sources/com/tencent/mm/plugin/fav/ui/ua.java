package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class ua implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f101478d;

    public ua(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI) {
        this.f101478d = favoriteIndexUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f101478d;
        favoriteIndexUI.f100279t.f();
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.p7(favoriteIndexUI);
        favoriteIndexUI.w7();
    }
}
