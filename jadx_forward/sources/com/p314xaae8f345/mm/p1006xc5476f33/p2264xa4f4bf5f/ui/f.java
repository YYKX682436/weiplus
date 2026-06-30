package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828 f255386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f255387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255388f;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828 c18609xe5770828, android.content.Context context, android.view.View view) {
        this.f255386d = c18609xe5770828;
        this.f255387e = context;
        this.f255388f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.getAnimatedFraction();
        float animatedFraction = it.getAnimatedFraction();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828 c18609xe5770828 = this.f255386d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c18609xe5770828.f254941g;
        android.content.Context context = this.f255387e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828.a(c18609xe5770828, c22621x7603e017, 0, (int) (ym5.x.a(context, 48.0f) - (ym5.x.a(context, 48.0f) * animatedFraction)));
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828.a(c18609xe5770828, c18609xe5770828.f254946o, 0, (int) (ym5.x.a(context, 64.0f) - (ym5.x.a(context, 64.0f) * animatedFraction)));
        if (animatedFraction >= 0.5f) {
            android.view.View view = c18609xe5770828.f254945n;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$fold$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$fold$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = c18609xe5770828.f254948q;
            if (view2 != null) {
                view2.setBackground(null);
            }
            this.f255388f.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b6i));
        }
        if (animatedFraction >= 1.0d) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = c18609xe5770828.f254941g;
            if (c22621x7603e0172 != null) {
                c22621x7603e0172.setVisibility(8);
            }
            android.widget.TextView tvInputTips = c18609xe5770828.getTvInputTips();
            if (tvInputTips != null) {
                tvInputTips.setVisibility(0);
            }
        }
    }
}
