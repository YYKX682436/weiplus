package ul5;

/* loaded from: classes13.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22715x5d5f7a08 f510167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f510168e;

    public g(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22715x5d5f7a08 c22715x5d5f7a08, android.view.View view) {
        this.f510167d = c22715x5d5f7a08;
        this.f510168e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f510167d.b(this.f510168e, ((java.lang.Integer) animatedValue).intValue());
    }
}
