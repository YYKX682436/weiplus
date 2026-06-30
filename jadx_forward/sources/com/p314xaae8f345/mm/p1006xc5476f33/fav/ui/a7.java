package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes5.dex */
public final class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f181996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f181997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f181998f;

    public a7(android.view.View view, int i17, android.view.View view2) {
        this.f181996d = view;
        this.f181997e = i17;
        this.f181998f = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f181996d;
        view.getHitRect(rect);
        int i17 = rect.top;
        int i18 = this.f181997e;
        rect.top = i17 - i18;
        rect.bottom += i18;
        rect.left -= i18;
        rect.right += i18;
        this.f181998f.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
