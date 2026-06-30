package mi1;

/* loaded from: classes7.dex */
public final class l1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.q1 f408145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f408146e;

    public l1(mi1.q1 q1Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f408145d = q1Var;
        this.f408146e = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f408145d.f408198f.f408100a = 0;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f408146e;
        if (((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
        }
    }
}
