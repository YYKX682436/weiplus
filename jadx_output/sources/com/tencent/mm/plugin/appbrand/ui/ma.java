package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class ma implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f89869a;

    public ma(boolean z17, boolean z18, android.view.Window window) {
        this.f89869a = window;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i17) {
        if ((i17 & 4) == 0) {
            android.view.Window window = this.f89869a;
            window.getDecorView().setSystemUiVisibility(com.tencent.mm.plugin.appbrand.ui.na.i(window, true));
        }
    }
}
