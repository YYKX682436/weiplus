package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f127671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f127672e;

    public c(android.view.Window window, android.app.Activity activity) {
        this.f127671d = window;
        this.f127672e = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window = this.f127671d;
        window.setDecorFitsSystemWindows(true);
        window.getDecorView().setOnApplyWindowInsetsListener(new com.p314xaae8f345.p362xadfe2b3.ui.b(this.f127672e));
        window.getDecorView().requestApplyInsets();
    }
}
