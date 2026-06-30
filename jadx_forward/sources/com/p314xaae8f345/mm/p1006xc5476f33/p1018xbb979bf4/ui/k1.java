package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes14.dex */
public final class k1 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 f156105d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var) {
        this.f156105d = l1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View v17, android.view.WindowInsets insets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        android.view.View view = this.f156105d.f362934g;
        if (view != null) {
            view.setPadding(insets.getSystemWindowInsetLeft(), 0, insets.getSystemWindowInsetRight(), 0);
        }
        return insets;
    }
}
