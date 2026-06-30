package fc3;

/* loaded from: classes9.dex */
public final class n implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc3.s f342598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc3.k f342599e;

    public n(fc3.s sVar, fc3.k kVar) {
        this.f342598d = sVar;
        this.f342599e = kVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        fc3.s sVar = this.f342598d;
        boolean z17 = sVar.f342616h;
        fc3.k kVar = this.f342599e;
        if (z17) {
            sVar.b(kVar);
        } else {
            if (!sVar.f342622n) {
                kVar.f342589g = 2;
                return;
            }
            sVar.f342624p = false;
            kVar.f342589g = 3;
            fc3.s.a(sVar, kVar);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
