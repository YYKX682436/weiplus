package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f100761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100763f;

    public n(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI, float f17, java.lang.String str) {
        this.f100763f = favoriteFileDetailUI;
        this.f100761d = f17;
        this.f100762e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100763f;
        favoriteFileDetailUI.f100619v.setProgress((int) this.f100761d);
        favoriteFileDetailUI.f100620w.setText(this.f100762e);
    }
}
