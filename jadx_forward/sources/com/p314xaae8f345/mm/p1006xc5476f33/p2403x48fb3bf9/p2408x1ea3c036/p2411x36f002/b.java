package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002;

/* loaded from: classes8.dex */
public class b implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f264164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f264165b;

    public b(android.view.Window window, boolean z17) {
        this.f264164a = window;
        this.f264165b = z17;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i17) {
        if ((i17 & 4) == 0) {
            android.view.Window window = this.f264164a;
            window.getDecorView().setSystemUiVisibility(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.c.b(window, this.f264165b));
        }
    }
}
