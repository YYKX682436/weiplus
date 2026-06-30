package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public final class lf implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f290612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f290613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21425xb877b9b3 f290614f;

    public lf(int i17, android.widget.LinearLayout linearLayout, float f17, float f18, com.p314xaae8f345.mm.ui.C21425xb877b9b3 c21425xb877b9b3) {
        this.f290612d = i17;
        this.f290613e = linearLayout;
        this.f290614f = c21425xb877b9b3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        android.widget.LinearLayout linearLayout = this.f290613e;
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.height = (int) (this.f290612d * animatedFraction);
        linearLayout.setLayoutParams(layoutParams);
        float f17 = 90.0f + (180.0f * animatedFraction);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f290614f.f278528e;
        if (c22699x3dcdb352 == null) {
            return;
        }
        c22699x3dcdb352.setRotation(f17);
    }
}
