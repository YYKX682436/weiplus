package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf;

/* loaded from: classes3.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.i f254758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f254759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f254760f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f254761g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f254762h;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.i iVar, android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2) {
        this.f254758d = iVar;
        this.f254759e = context;
        this.f254760f = viewGroup;
        this.f254761g = view;
        this.f254762h = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.getAnimatedFraction();
        float animatedFraction = it.getAnimatedFraction();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f254758d.f254771i;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f254758d.f254771i;
        int a17 = (int) (ym5.x.a(this.f254759e, 48.0f) * animatedFraction);
        if (c22621x7603e0172 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = c22621x7603e0172.getLayoutParams();
            layoutParams.height = a17;
            c22621x7603e0172.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.i iVar = this.f254758d;
        android.view.ViewGroup viewGroup = this.f254760f;
        int a18 = (int) (ym5.x.a(this.f254759e, 64.0f) * animatedFraction);
        iVar.getClass();
        if (viewGroup != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            layoutParams2.height = a18;
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (animatedFraction >= 0.5f) {
            android.view.View view = this.f254761g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$expand$3$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$expand$3$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f254762h.setBackground(this.f254759e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.btn));
        }
        if (animatedFraction >= 1.0d) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = this.f254758d.f254771i;
            if (c22621x7603e0173 != null) {
                c22621x7603e0173.requestFocus();
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.b(this.f254758d, this.f254759e);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(bVar, 50L, false);
        }
    }
}
