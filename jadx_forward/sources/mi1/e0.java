package mi1;

/* loaded from: classes7.dex */
public final class e0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f f408074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.i0 f408075e;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f abstractC12505x244799f, mi1.i0 i0Var) {
        this.f408074d = abstractC12505x244799f;
        this.f408075e = i0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((java.lang.Integer) animatedValue).intValue() / 255;
        this.f408074d.e(intValue);
        mi1.i0 i0Var = this.f408075e;
        if (i0Var != null) {
            i0Var.a(intValue);
        }
    }
}
