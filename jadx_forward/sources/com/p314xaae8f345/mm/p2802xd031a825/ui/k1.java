package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes5.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f295732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f295733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f295734f;

    public k1(android.view.View view, int i17, android.view.View view2) {
        this.f295732d = view;
        this.f295733e = i17;
        this.f295734f = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f295732d;
        view.getHitRect(rect);
        int i17 = rect.top;
        int i18 = this.f295733e;
        rect.top = i17 - i18;
        rect.bottom += i18;
        rect.left -= i18;
        rect.right += i18;
        this.f295734f.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
