package cg2;

/* loaded from: classes5.dex */
public final class v implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f41139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cg2.r f41140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ai1 f41141f;

    public v(cg2.r rVar, r45.ai1 ai1Var) {
        this.f41140e = rVar;
        this.f41141f = ai1Var;
        if (!android.animation.Animator.AnimatorListener.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(android.animation.Animator.AnimatorListener.class.getClassLoader(), new java.lang.Class[]{android.animation.Animator.AnimatorListener.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.animation.Animator.AnimatorListener");
        }
        this.f41139d = (android.animation.Animator.AnimatorListener) newProxyInstance;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f41140e.f41124f.setText(" x" + this.f41141f.getInteger(4));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f41140e.f41124f.setText(" x" + this.f41141f.getInteger(4));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f41139d.onAnimationRepeat(p07);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f41139d.onAnimationStart(p07);
    }
}
