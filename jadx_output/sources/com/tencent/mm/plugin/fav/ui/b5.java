package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class b5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100513d;

    public b5(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI, android.app.Dialog dialog) {
        this.f100513d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100513d.dismiss();
    }
}
