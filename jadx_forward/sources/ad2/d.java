package ad2;

/* loaded from: classes2.dex */
public final class d extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f84656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f84657e;

    public d(ad2.h hVar, yz5.a aVar) {
        this.f84656d = hVar;
        this.f84657e = aVar;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f84656d.f84687r = false;
        yz5.a aVar = this.f84657e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ad2.h hVar = this.f84656d;
        hVar.f84687r = false;
        xc2.p0 p0Var = hVar.f84680h;
        sc2.q8 q8Var = p0Var != null ? p0Var.f534766J : null;
        if (q8Var != null) {
            q8Var.f487711b = true;
        }
        yz5.a aVar = this.f84657e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
