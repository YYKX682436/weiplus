package w03;

/* loaded from: classes10.dex */
public final class r extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w03.u f523433d;

    public r(w03.u uVar) {
        this.f523433d = uVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        w03.u uVar = this.f523433d;
        uVar.f523437e = false;
        if (uVar.f523441i && uVar.f523440h) {
            uVar.Q6();
        }
        ((ku5.t0) ku5.t0.f394148d).B(new w03.t(uVar));
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        b(animation);
        w03.u uVar = this.f523433d;
        uVar.f523437e = false;
        if (uVar.f523441i && uVar.f523440h) {
            uVar.Q6();
        }
        ((ku5.t0) ku5.t0.f394148d).B(new w03.t(uVar));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        w03.u uVar = this.f523433d;
        uVar.f523437e = true;
        uVar.O6().Z6();
    }
}
