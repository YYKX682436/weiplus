package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100740d;

    public i2(com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI favoriteVideoPlayUI, android.app.Dialog dialog) {
        this.f100740d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100740d.dismiss();
    }
}
