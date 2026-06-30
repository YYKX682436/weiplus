package qp1;

/* loaded from: classes2.dex */
public final class f0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f447253d;

    public f0(yz5.l lVar) {
        this.f447253d = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f447253d.mo146xb9724478(java.lang.Float.valueOf(it.getAnimatedFraction()));
    }
}
