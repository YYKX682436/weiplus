package com.google.android.material.appbar;

/* loaded from: classes15.dex */
public class j implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.appbar.CollapsingToolbarLayout f44343a;

    public j(com.google.android.material.appbar.CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f44343a = collapsingToolbarLayout;
    }

    @Override // com.google.android.material.appbar.e
    public void a(com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
        com.google.android.material.appbar.CollapsingToolbarLayout collapsingToolbarLayout = this.f44343a;
        collapsingToolbarLayout.B = i17;
        n3.g3 g3Var = collapsingToolbarLayout.C;
        int e17 = g3Var != null ? g3Var.e() : 0;
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = collapsingToolbarLayout.getChildAt(i18);
            com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams();
            com.google.android.material.appbar.l b17 = com.google.android.material.appbar.CollapsingToolbarLayout.b(childAt);
            int i19 = layoutParams.f44322a;
            if (i19 == 1) {
                b17.a(h3.a.b(-i17, 0, ((collapsingToolbarLayout.getHeight() - com.google.android.material.appbar.CollapsingToolbarLayout.b(childAt).f44348b) - childAt.getHeight()) - ((android.widget.FrameLayout.LayoutParams) ((com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin));
            } else if (i19 == 2) {
                b17.a(java.lang.Math.round((-i17) * layoutParams.f44323b));
            }
        }
        collapsingToolbarLayout.d();
        if (collapsingToolbarLayout.f44316u != null && e17 > 0) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(collapsingToolbarLayout);
        }
        int height = collapsingToolbarLayout.getHeight();
        java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
        collapsingToolbarLayout.f44312q.m(java.lang.Math.abs(i17) / ((height - n3.u0.d(collapsingToolbarLayout)) - e17));
    }
}
