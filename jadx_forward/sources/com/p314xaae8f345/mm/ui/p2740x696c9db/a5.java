package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes5.dex */
public final class a5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f291804d;

    public a5(android.view.Window window) {
        this.f291804d = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window = this.f291804d;
        window.setDecorFitsSystemWindows(true);
        window.getDecorView().setOnApplyWindowInsetsListener(null);
        window.getDecorView().requestApplyInsets();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KeyBoardHeightProviderUtil", "removeOnApplyWindowInsetsListener");
    }
}
