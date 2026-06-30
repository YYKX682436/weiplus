package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100771d;

    public o1(com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI, android.app.Dialog dialog) {
        this.f100771d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100771d.dismiss();
    }
}
