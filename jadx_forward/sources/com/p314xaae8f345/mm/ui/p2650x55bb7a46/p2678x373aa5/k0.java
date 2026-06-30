package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes9.dex */
public class k0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 f284514e;

    public k0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689, android.view.View view) {
        this.f284514e = c21897x17252689;
        this.f284513d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = this.f284514e;
        android.graphics.Rect rect = c21897x17252689.W;
        android.view.View view = this.f284513d;
        view.getGlobalVisibleRect(rect);
        c21897x17252689.W.top = view.getTop();
        c21897x17252689.W.bottom = view.getBottom();
        c21897x17252689.f284377p0.setAlpha((int) (((java.lang.Float) valueAnimator.getAnimatedValue("alpha")).floatValue() * 255.0f));
        c21897x17252689.T.m75895x31e85dfb();
    }
}
