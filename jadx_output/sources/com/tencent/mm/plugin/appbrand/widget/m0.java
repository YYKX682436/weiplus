package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public class m0 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.n0 f91755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f91756e;

    public m0(com.tencent.mm.plugin.appbrand.widget.n0 n0Var, android.view.View view) {
        this.f91755d = n0Var;
        this.f91756e = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        com.tencent.mm.plugin.appbrand.widget.n0 n0Var = this.f91755d;
        n0Var.getClass();
        n0Var.f91769a.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(view);
        return this.f91756e == view ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }
}
