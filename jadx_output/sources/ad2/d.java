package ad2;

/* loaded from: classes2.dex */
public final class d extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f3123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f3124e;

    public d(ad2.h hVar, yz5.a aVar) {
        this.f3123d = hVar;
        this.f3124e = aVar;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f3123d.f3154r = false;
        yz5.a aVar = this.f3124e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        ad2.h hVar = this.f3123d;
        hVar.f3154r = false;
        xc2.p0 p0Var = hVar.f3147h;
        sc2.q8 q8Var = p0Var != null ? p0Var.f453233J : null;
        if (q8Var != null) {
            q8Var.f406178b = true;
        }
        yz5.a aVar = this.f3124e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
