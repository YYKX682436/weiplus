package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f;

/* loaded from: classes7.dex */
public final class s0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0 f172750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0 f172751e;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0 x0Var) {
        this.f172750d = c0Var;
        this.f172751e = x0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        android.view.View rootView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0 c0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172600g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0 x0Var = this.f172751e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0 c0Var2 = this.f172750d;
        if (c0Var2 != c0Var && c0Var2 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172601h) {
            java.lang.Object animatedValue = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            x0Var.d(((java.lang.Integer) animatedValue).intValue());
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = x0Var.f172772g;
        java.lang.Object animatedValue2 = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        qVar.setTop(((java.lang.Integer) animatedValue2).intValue());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = x0Var.f172766a.H2.f172728a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = runtime.x0();
        android.view.View findViewById = (x07 == null || (rootView = x07.getRootView()) == null) ? null : rootView.findViewById(com.p314xaae8f345.mm.R.id.w_);
        hk1.e eVar = findViewById instanceof hk1.e ? (hk1.e) findViewById : null;
        if (eVar != null) {
            android.view.View view = eVar.f363410g;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view != null ? view.getParent() : null, eVar) && eVar.f363409f != null) {
                android.view.View view2 = eVar.f363410g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
                int top = view2.getTop();
                android.view.ViewGroup viewGroup = eVar.f363409f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
                android.view.ViewGroup viewGroup2 = eVar.f363409f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup2);
                viewGroup.setTop(top - viewGroup2.getMeasuredHeight());
            }
        }
        x0Var.V(x0Var.f172772g.getLeft(), x0Var.f172772g.getTop(), x0Var.f172772g.getRight(), x0Var.f172772g.getBottom());
    }
}
