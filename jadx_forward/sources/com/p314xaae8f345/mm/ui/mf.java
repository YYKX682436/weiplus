package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public final class mf implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f290673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f290674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21425xb877b9b3 f290675f;

    public mf(int i17, int i18, android.widget.LinearLayout linearLayout, float f17, float f18, com.p314xaae8f345.mm.ui.C21425xb877b9b3 c21425xb877b9b3) {
        this.f290673d = i17;
        this.f290674e = linearLayout;
        this.f290675f = c21425xb877b9b3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        float f17 = this.f290673d + ((0 - r0) * animatedFraction);
        android.widget.LinearLayout linearLayout = this.f290674e;
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.height = (int) f17;
        linearLayout.setLayoutParams(layoutParams);
        float f18 = 270.0f + ((-180.0f) * animatedFraction);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f290675f.f278528e;
        if (c22699x3dcdb352 == null) {
            return;
        }
        c22699x3dcdb352.setRotation(f18);
    }
}
