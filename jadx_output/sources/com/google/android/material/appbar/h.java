package com.google.android.material.appbar;

/* loaded from: classes14.dex */
public class h implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.appbar.CollapsingToolbarLayout f44341a;

    public h(com.google.android.material.appbar.CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f44341a = collapsingToolbarLayout;
    }

    @Override // n3.k0
    public n3.g3 a(android.view.View view, n3.g3 g3Var) {
        com.google.android.material.appbar.CollapsingToolbarLayout collapsingToolbarLayout = this.f44341a;
        collapsingToolbarLayout.getClass();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 g3Var2 = n3.u0.b(collapsingToolbarLayout) ? g3Var : null;
        if (!m3.c.a(collapsingToolbarLayout.C, g3Var2)) {
            collapsingToolbarLayout.C = g3Var2;
            collapsingToolbarLayout.requestLayout();
        }
        return g3Var.f334338a.c();
    }
}
