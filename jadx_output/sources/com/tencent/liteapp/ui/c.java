package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f46138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f46139e;

    public c(android.view.Window window, android.app.Activity activity) {
        this.f46138d = window;
        this.f46139e = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window = this.f46138d;
        window.setDecorFitsSystemWindows(true);
        window.getDecorView().setOnApplyWindowInsetsListener(new com.tencent.liteapp.ui.b(this.f46139e));
        window.getDecorView().requestApplyInsets();
    }
}
