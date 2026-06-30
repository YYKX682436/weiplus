package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class zc implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 f218210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f218211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f218212f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f218213g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f218214h;

    public zc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7, android.view.View view, android.view.View view2, int i17, int i18) {
        this.f218210d = c15452x854f54e7;
        this.f218211e = view;
        this.f218212f = view2;
        this.f218213g = i17;
        this.f218214h = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        float animatedFraction = anim.getAnimatedFraction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7 = this.f218210d;
        float f17 = c15452x854f54e7.f215091f;
        android.view.View view = this.f218211e;
        android.view.View view2 = this.f218212f;
        view2.getLayoutParams().width = (int) (f17 + ((view.getWidth() - c15452x854f54e7.f215091f) * animatedFraction));
        view2.requestLayout();
        view2.setBackgroundColor(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7.O6(c15452x854f54e7, animatedFraction, this.f218213g, this.f218214h));
        if (animatedFraction > 0.5f) {
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.iqr)).setAlpha((animatedFraction - 0.5f) * 2);
        }
    }
}
