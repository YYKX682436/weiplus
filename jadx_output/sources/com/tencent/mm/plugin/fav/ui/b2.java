package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100509d;

    public b2(com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI, android.app.Dialog dialog) {
        this.f100509d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100509d.dismiss();
    }
}
