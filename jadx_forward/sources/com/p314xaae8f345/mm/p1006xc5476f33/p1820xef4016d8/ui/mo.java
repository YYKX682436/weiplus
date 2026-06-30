package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes5.dex */
public final class mo extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f228731a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f228732b;

    /* renamed from: c, reason: collision with root package name */
    public int f228733c;

    /* renamed from: d, reason: collision with root package name */
    public int f228734d;

    /* renamed from: e, reason: collision with root package name */
    public int f228735e;

    /* renamed from: f, reason: collision with root package name */
    public int f228736f;

    /* renamed from: g, reason: collision with root package name */
    public int f228737g;

    /* renamed from: h, reason: collision with root package name */
    public int f228738h;

    /* renamed from: i, reason: collision with root package name */
    public int f228739i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f228740j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f228741k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f228742l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(android.view.View contentView) {
        super(contentView.getContext(), (android.util.AttributeSet) null, -1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        this.f228731a = "MicroMsg.LuckyMoneyPopupWindow";
        this.f228741k = new int[2];
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(contentView.getContext());
        this.f228732b = frameLayout;
        super.setContentView(frameLayout);
        setContentView(contentView);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        this.f228739i = 0;
        android.view.View view = this.f228742l;
        if (view != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f228740j);
        }
    }

    @Override // android.widget.PopupWindow
    public android.view.View getContentView() {
        android.widget.FrameLayout frameLayout = this.f228732b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
        android.view.View childAt = frameLayout.getChildAt(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
        return childAt;
    }

    @Override // android.widget.PopupWindow
    public void setContentView(android.view.View view) {
        android.widget.FrameLayout frameLayout = this.f228732b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
        frameLayout.removeAllViews();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
        frameLayout.addView(view);
    }
}
