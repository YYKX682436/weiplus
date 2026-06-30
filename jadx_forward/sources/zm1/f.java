package zm1;

/* loaded from: classes11.dex */
public final class f extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm1.h f555667d;

    public f(zm1.h hVar) {
        this.f555667d = hVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        zm1.h hVar = this.f555667d;
        hVar.f555674i = false;
        hVar.Q6();
        um1.b bVar = hVar.f555672g;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        b(animation);
        zm1.h hVar = this.f555667d;
        hVar.f555674i = false;
        hVar.Q6();
        um1.b bVar = hVar.f555672g;
        if (bVar != null) {
            bVar.mo147882xbb3aa236();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        zm1.h hVar = this.f555667d;
        hVar.f555674i = true;
        b66.g b17 = b66.i.f99700d.b(bw5.eq0.TingMusic);
        if (b17 != null) {
            ((b66.i) b17).e();
        }
        um1.b bVar = hVar.f555672g;
        if (bVar != null) {
            bVar.mo147883xd7e2f2fd();
        }
    }
}
