package cg2;

/* loaded from: classes5.dex */
public final class v implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f122672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cg2.r f122673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ai1 f122674f;

    public v(cg2.r rVar, r45.ai1 ai1Var) {
        this.f122673e = rVar;
        this.f122674f = ai1Var;
        if (!android.animation.Animator.AnimatorListener.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(android.animation.Animator.AnimatorListener.class.getClassLoader(), new java.lang.Class[]{android.animation.Animator.AnimatorListener.class}, pm0.v.f438336b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.animation.Animator.AnimatorListener");
        }
        this.f122672d = (android.animation.Animator.AnimatorListener) newProxyInstance;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f122673e.f122657f.setText(" x" + this.f122674f.m75939xb282bd08(4));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f122673e.f122657f.setText(" x" + this.f122674f.m75939xb282bd08(4));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f122672d.onAnimationRepeat(p07);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f122672d.onAnimationStart(p07);
    }
}
