package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828 f255351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f255352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255353f;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828 c18609xe5770828, android.content.Context context, android.view.View view) {
        this.f255351d = c18609xe5770828;
        this.f255352e = context;
        this.f255353f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.getAnimatedFraction();
        float animatedFraction = it.getAnimatedFraction();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f255351d.f254941g;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828 c18609xe5770828 = this.f255351d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828.a(c18609xe5770828, c18609xe5770828.f254941g, 0, (int) (ym5.x.a(this.f255352e, 48.0f) * animatedFraction));
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828 c18609xe57708282 = this.f255351d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828.a(c18609xe57708282, c18609xe57708282.f254946o, 0, (int) (ym5.x.a(this.f255352e, 64.0f) * animatedFraction));
        if (animatedFraction >= 0.5f) {
            if (bk4.i.a().y()) {
                android.view.View view = this.f255351d.f254945n;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$expand$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$expand$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.view.View view2 = this.f255351d.f254945n;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$expand$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$expand$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.view.View view3 = this.f255351d.f254948q;
            if (view3 != null) {
                view3.setBackground(this.f255352e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b6h));
            }
            this.f255353f.setBackground(this.f255352e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.btj));
        }
        if (animatedFraction >= 1.0d) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f255351d.f254941g;
            if (c22621x7603e0172 != null) {
                c22621x7603e0172.requestFocus();
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d(this.f255351d, this.f255352e);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(dVar, 50L, false);
        }
    }
}
