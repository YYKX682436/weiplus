package com.tencent.mm.mj_publisher.finder.movie_composing.panel.base;

/* loaded from: classes5.dex */
public abstract class z {
    public static final boolean a(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q qVar) {
        if (qVar == null) {
            return false;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p f69205e = qVar.getF69205e();
        return f69205e == com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69244f || f69205e == com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69245g || f69205e == com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69246h || f69205e == com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69247i;
    }

    public static final void b(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel, android.view.View view, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(baseComposingPanel, "<this>");
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int navigationBarHeight = baseComposingPanel.getNavigationBarHeight();
        int dimensionPixelSize = j65.q.a(baseComposingPanel.getContext()).getDimensionPixelSize(com.tencent.mm.R.dimen.ajd);
        int dimensionPixelSize2 = j65.q.a(baseComposingPanel.getContext()).getDimensionPixelSize(com.tencent.mm.R.dimen.ala);
        marginLayoutParams.topMargin = 0;
        if (num != null) {
            dimensionPixelSize2 = baseComposingPanel.getNavigationBarHeight() + num.intValue();
        } else if (navigationBarHeight != 0) {
            dimensionPixelSize2 = (int) (((baseComposingPanel.getNavigationBarHeight() * 1.0f) * (dimensionPixelSize2 + dimensionPixelSize)) / dimensionPixelSize);
        }
        marginLayoutParams.bottomMargin = dimensionPixelSize2;
    }
}
