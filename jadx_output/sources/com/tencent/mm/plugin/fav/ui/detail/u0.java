package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.a1 f100800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI f100802f;

    public u0(com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI, com.tencent.mm.plugin.fav.ui.detail.a1 a1Var, java.lang.String str) {
        this.f100802f = favoriteImgDetailUI;
        this.f100800d = a1Var;
        this.f100801e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.detail.a1 a1Var = this.f100800d;
        r45.gp0 gp0Var = a1Var.f100683a;
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = this.f100802f;
        android.graphics.Bitmap g17 = com.tencent.mm.plugin.fav.ui.ra.g(gp0Var, favoriteImgDetailUI.f100627o, true);
        if (g17 == null) {
            g17 = favoriteImgDetailUI.a7(a1Var.f100683a);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.detail.t0(this, g17));
    }
}
