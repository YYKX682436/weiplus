package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class jm implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout f103764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f103766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f103767g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103768h;

    public jm(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, int i17, int i18, int i19, android.widget.TextView textView) {
        this.f103764d = constraintLayout;
        this.f103765e = i17;
        this.f103766f = i18;
        this.f103767g = i19;
        this.f103768h = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f103764d;
        constraintLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f103768h.setMaxWidth(((constraintLayout.getMeasuredWidth() - this.f103765e) - this.f103766f) - this.f103767g);
    }
}
