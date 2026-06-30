package com.p314xaae8f345.mm.p2776x373aa5;

/* loaded from: classes10.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f295052d;

    public c(com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00) {
        this.f295052d = c22801x87cbdc00;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f295052d;
        yz5.p onTranslateYCallback = c22801x87cbdc00.getOnTranslateYCallback();
        if (onTranslateYCallback != null) {
            onTranslateYCallback.mo149xb9724478(0, java.lang.Integer.valueOf((int) c22801x87cbdc00.getTranslationY()));
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.StickTopLoadingLayout stickTopLoadingLayout = c22801x87cbdc00.getStickTopLoadingLayout();
        if (stickTopLoadingLayout != null) {
            stickTopLoadingLayout.a(c22801x87cbdc00.getA() - java.lang.Math.abs(c22801x87cbdc00.getTranslationY()));
        }
    }
}
