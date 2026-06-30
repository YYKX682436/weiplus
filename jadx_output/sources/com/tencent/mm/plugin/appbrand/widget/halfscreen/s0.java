package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class s0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.c0 f91217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 f91218e;

    public s0(com.tencent.mm.plugin.appbrand.widget.c0 c0Var, com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 x0Var) {
        this.f91217d = c0Var;
        this.f91218e = x0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        android.view.View rootView;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.appbrand.widget.c0 c0Var = com.tencent.mm.plugin.appbrand.widget.c0.f91067g;
        com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 x0Var = this.f91218e;
        com.tencent.mm.plugin.appbrand.widget.c0 c0Var2 = this.f91217d;
        if (c0Var2 != c0Var && c0Var2 != com.tencent.mm.plugin.appbrand.widget.c0.f91068h) {
            java.lang.Object animatedValue = animation.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            x0Var.d(((java.lang.Integer) animatedValue).intValue());
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.q qVar = x0Var.f91239g;
        java.lang.Object animatedValue2 = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        qVar.setTop(((java.lang.Integer) animatedValue2).intValue());
        com.tencent.mm.plugin.appbrand.o6 runtime = x0Var.f91233a.H2.f91195a;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mm.plugin.appbrand.page.d5 x07 = runtime.x0();
        android.view.View findViewById = (x07 == null || (rootView = x07.getRootView()) == null) ? null : rootView.findViewById(com.tencent.mm.R.id.w_);
        hk1.e eVar = findViewById instanceof hk1.e ? (hk1.e) findViewById : null;
        if (eVar != null) {
            android.view.View view = eVar.f281877g;
            if (kotlin.jvm.internal.o.b(view != null ? view.getParent() : null, eVar) && eVar.f281876f != null) {
                android.view.View view2 = eVar.f281877g;
                kotlin.jvm.internal.o.d(view2);
                int top = view2.getTop();
                android.view.ViewGroup viewGroup = eVar.f281876f;
                kotlin.jvm.internal.o.d(viewGroup);
                android.view.ViewGroup viewGroup2 = eVar.f281876f;
                kotlin.jvm.internal.o.d(viewGroup2);
                viewGroup.setTop(top - viewGroup2.getMeasuredHeight());
            }
        }
        x0Var.V(x0Var.f91239g.getLeft(), x0Var.f91239g.getTop(), x0Var.f91239g.getRight(), x0Var.f91239g.getBottom());
    }
}
