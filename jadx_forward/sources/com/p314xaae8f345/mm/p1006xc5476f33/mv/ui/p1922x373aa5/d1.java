package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes2.dex */
public final class d1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f233336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f233337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f233338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f233339g;

    public d1(android.view.View view, yz5.l lVar, int i17, int i18) {
        this.f233336d = view;
        this.f233337e = lVar;
        this.f233338f = i17;
        this.f233339g = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.View view = this.f233336d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = intValue;
        view.setLayoutParams(layoutParams);
        yz5.l lVar = this.f233337e;
        if (lVar != null) {
            int i17 = this.f233338f;
            lVar.mo146xb9724478(java.lang.Float.valueOf((intValue - i17) / (this.f233339g - i17)));
        }
    }
}
