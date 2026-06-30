package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes3.dex */
public final class i1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f237791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f237792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f237793f;

    public i1(android.view.View view, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f237791d = view;
        this.f237792e = textView;
        this.f237793f = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f237791d.getViewTreeObserver().removeOnPreDrawListener(this);
        android.widget.TextView textView = this.f237792e;
        int measuredWidth = textView.getMeasuredWidth();
        if (measuredWidth <= 0) {
            return true;
        }
        android.widget.TextView textView2 = this.f237793f;
        if (textView2.getWidth() == measuredWidth) {
            return true;
        }
        textView2.setMinWidth(measuredWidth);
        textView.setMinWidth(measuredWidth);
        textView2.requestLayout();
        return true;
    }
}
