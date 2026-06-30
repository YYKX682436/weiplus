package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class va implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f101499d;

    public va(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI) {
        this.f101499d = favoriteIndexUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f101499d;
        w82.b0 b0Var = favoriteIndexUI.f100279t;
        if (b0Var != null) {
            b0Var.f();
            com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.p7(favoriteIndexUI);
        }
        int i17 = com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.f100436y1;
        favoriteIndexUI.w7();
    }
}
