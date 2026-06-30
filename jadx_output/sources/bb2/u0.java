package bb2;

/* loaded from: classes5.dex */
public final class u0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f19008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.z0 f19009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bb2.r0 f19010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bb2.q0 f19011g;

    public u0(bb2.z0 z0Var, bb2.r0 r0Var, bb2.q0 q0Var) {
        this.f19009e = z0Var;
        this.f19010f = r0Var;
        this.f19011g = q0Var;
        if (!android.animation.Animator.AnimatorListener.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(android.animation.Animator.AnimatorListener.class.getClassLoader(), new java.lang.Class[]{android.animation.Animator.AnimatorListener.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.animation.Animator.AnimatorListener");
        }
        this.f19008d = (android.animation.Animator.AnimatorListener) newProxyInstance;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f19009e.t(this.f19010f, this.f19011g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f19009e.t(this.f19010f, this.f19011g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f19008d.onAnimationRepeat(p07);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f19008d.onAnimationStart(p07);
    }
}
