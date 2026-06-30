package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class p3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f214344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f214345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f214346g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f214347h;

    public p3(android.view.View view, int i17, int i18, int i19, int i27) {
        this.f214343d = view;
        this.f214344e = i17;
        this.f214345f = i18;
        this.f214346g = i19;
        this.f214347h = i27;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f214343d;
        view.getHitRect(rect);
        int i17 = android.os.Build.VERSION.SDK_INT;
        int i18 = this.f214345f;
        int i19 = this.f214344e;
        if (i17 >= 31) {
            rect.inset(-i19, -i18, -this.f214346g, this.f214347h);
        } else {
            rect.inset(-i19, -i18);
        }
        java.lang.Object parent = view.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
