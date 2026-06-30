package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f46143d;

    public d(android.view.Window window) {
        this.f46143d = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window = this.f46143d;
        window.setDecorFitsSystemWindows(true);
        window.getDecorView().setOnApplyWindowInsetsListener(null);
        window.getDecorView().requestApplyInsets();
        kd.c.c("LiteApp.KeyBoardHeightProviderUtil", "removeOnApplyWindowInsetsListener", new java.lang.Object[0]);
    }
}
