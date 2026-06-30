package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes14.dex */
public final class z4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f292474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f292475e;

    public z4(android.view.Window window, android.app.Activity activity) {
        this.f292474d = window;
        this.f292475e = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window = this.f292474d;
        window.setDecorFitsSystemWindows(true);
        window.getDecorView().setOnApplyWindowInsetsListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.y4(this.f292475e));
        window.getDecorView().requestApplyInsets();
    }
}
