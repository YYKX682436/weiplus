package ul5;

/* loaded from: classes4.dex */
public final class a0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4 f510159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f510160e;

    public a0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4 c22717x128919c4, android.view.View view) {
        this.f510159d = c22717x128919c4;
        this.f510160e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f510159d.b(this.f510160e, ((java.lang.Integer) animatedValue).intValue());
    }
}
