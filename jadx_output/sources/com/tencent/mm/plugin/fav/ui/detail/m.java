package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100757d;

    public m(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI, android.app.Dialog dialog) {
        this.f100757d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100757d.dismiss();
    }
}
