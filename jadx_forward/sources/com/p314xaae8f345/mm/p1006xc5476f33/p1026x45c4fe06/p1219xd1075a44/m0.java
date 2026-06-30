package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* loaded from: classes7.dex */
public class m0 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.n0 f173288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f173289e;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.n0 n0Var, android.view.View view) {
        this.f173288d = n0Var;
        this.f173289e = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.n0 n0Var = this.f173288d;
        n0Var.getClass();
        n0Var.f173302a.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.k(view);
        return this.f173289e == view ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }
}
