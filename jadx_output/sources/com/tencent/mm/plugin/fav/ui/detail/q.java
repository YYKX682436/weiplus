package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes8.dex */
public class q implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100780b;

    public q(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI, java.lang.String str) {
        this.f100780b = favoriteFileDetailUI;
        this.f100779a = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteFileDetailUI", "%d save video now video path %s out path %s", java.lang.Integer.valueOf(hashCode()), this.f100779a, str2);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100780b;
        android.widget.Toast.makeText(favoriteFileDetailUI.getContext(), favoriteFileDetailUI.getString(com.tencent.mm.R.string.k7b, q75.c.c(str2)), 1).show();
        q75.c.f(str2, favoriteFileDetailUI.getContext());
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteFileDetailUI", "%d save video now video path %s out path %s", java.lang.Integer.valueOf(hashCode()), this.f100779a, str2);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100780b;
        android.widget.Toast.makeText(favoriteFileDetailUI.getContext(), favoriteFileDetailUI.getString(com.tencent.mm.R.string.k7a), 1).show();
    }
}
