package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class va implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f292646d;

    public va(com.p314xaae8f345.mm.ui.ga gaVar) {
        this.f292646d = gaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f292646d.r0(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue(), false);
    }
}
