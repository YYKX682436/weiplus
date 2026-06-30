package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44;

/* renamed from: com.tencent.mm.plugin.topstory.ui.widget.TopStoryTipsPopupWindow */
/* loaded from: classes8.dex */
public class C18766xb71d9084 extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f256802a;

    /* renamed from: b, reason: collision with root package name */
    public int f256803b;

    /* renamed from: c, reason: collision with root package name */
    public int f256804c;

    /* renamed from: d, reason: collision with root package name */
    public int f256805d;

    /* renamed from: e, reason: collision with root package name */
    public int f256806e;

    /* renamed from: f, reason: collision with root package name */
    public int f256807f;

    /* renamed from: g, reason: collision with root package name */
    public int f256808g;

    /* renamed from: h, reason: collision with root package name */
    public int f256809h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f256810i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f256811j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f256812k;

    public C18766xb71d9084(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        this.f256809h = 0;
        android.view.View view = this.f256812k;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f256810i);
        }
    }

    @Override // android.widget.PopupWindow
    public android.view.View getContentView() {
        return this.f256802a.getChildAt(0);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(android.view.View view) {
        android.widget.FrameLayout frameLayout = this.f256802a;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }

    @Override // android.widget.PopupWindow
    public void update() {
        super.update();
    }

    public C18766xb71d9084(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f256811j = new int[2];
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f256802a = frameLayout;
        super.setContentView(frameLayout);
    }

    public C18766xb71d9084(android.view.View view) {
        this(view.getContext(), null);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(view.getContext());
        this.f256802a = frameLayout;
        super.setContentView(frameLayout);
        setContentView(view);
    }
}
