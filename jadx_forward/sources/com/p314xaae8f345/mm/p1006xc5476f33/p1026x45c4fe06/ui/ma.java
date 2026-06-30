package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class ma implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f171402a;

    public ma(boolean z17, boolean z18, android.view.Window window) {
        this.f171402a = window;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i17) {
        if ((i17 & 4) == 0) {
            android.view.Window window = this.f171402a;
            window.getDecorView().setSystemUiVisibility(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.i(window, true));
        }
    }
}
