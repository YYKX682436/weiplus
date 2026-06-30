package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes5.dex */
public final class j8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f101205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f101207f;

    public j8(android.view.View view, int i17, android.view.View view2) {
        this.f101205d = view;
        this.f101206e = i17;
        this.f101207f = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f101205d;
        view.getHitRect(rect);
        int i17 = rect.top;
        int i18 = this.f101206e;
        rect.top = i17 - i18;
        rect.bottom += i18;
        rect.left -= i18;
        rect.right += i18;
        this.f101207f.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
