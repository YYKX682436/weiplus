package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI f100754e;

    public l0(com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI, android.app.Dialog dialog) {
        this.f100754e = favoriteImgDetailUI;
        this.f100753d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100753d.dismiss();
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = this.f100754e;
        com.tencent.mm.ui.widget.snackbar.j.c(favoriteImgDetailUI.getString(com.tencent.mm.R.string.c9u), null, favoriteImgDetailUI, null, null);
    }
}
