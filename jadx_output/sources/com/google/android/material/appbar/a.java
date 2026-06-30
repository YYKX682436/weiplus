package com.google.android.material.appbar;

/* loaded from: classes14.dex */
public class a implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout f44337a;

    public a(com.google.android.material.appbar.AppBarLayout appBarLayout) {
        this.f44337a = appBarLayout;
    }

    @Override // n3.k0
    public n3.g3 a(android.view.View view, n3.g3 g3Var) {
        com.google.android.material.appbar.AppBarLayout appBarLayout = this.f44337a;
        appBarLayout.getClass();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 g3Var2 = n3.u0.b(appBarLayout) ? g3Var : null;
        if (!m3.c.a(appBarLayout.f44283i, g3Var2)) {
            appBarLayout.f44283i = g3Var2;
            appBarLayout.f44278d = -1;
            appBarLayout.f44279e = -1;
            appBarLayout.f44280f = -1;
        }
        return g3Var;
    }
}
