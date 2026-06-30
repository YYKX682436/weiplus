package lk5;

/* loaded from: classes2.dex */
public final class k0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f400573d;

    public k0(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f400573d = f0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f400573d.f391649d++;
        java.lang.System.currentTimeMillis();
    }
}
