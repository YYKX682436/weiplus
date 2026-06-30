package cn2;

/* loaded from: classes2.dex */
public final class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f43609d;

    public r(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f43609d = mMPAGView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f43609d.setTranslationX(((java.lang.Float) animatedValue).floatValue());
    }
}
