package wo1;

/* loaded from: classes5.dex */
public final class n0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f529529d;

    public n0(wo1.a1 a1Var) {
        this.f529529d = a1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f m174216x963add53 = this.f529529d.m174216x963add53();
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        m174216x963add53.m82049x3ae760af(((java.lang.Integer) animatedValue).intValue());
    }
}
