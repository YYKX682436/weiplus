package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f100765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI f100766e;

    public n1(com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI, int i17) {
        this.f100766e = favoriteSightDetailUI;
        this.f100765d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100766e.f100638o.setProgress(this.f100765d);
    }
}
