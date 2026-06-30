package si0;

/* loaded from: classes.dex */
public final class c0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f489576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f489577e;

    public c0(si0.l0 l0Var, long j17) {
        this.f489576d = l0Var;
        this.f489577e = j17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b c24045xac389d8b = this.f489576d.f489641k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c24045xac389d8b);
        c24045xac389d8b.m88951x827d33f(this.f489577e, si0.y.f489742d);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        si0.l0 l0Var = this.f489576d;
        if (l0Var.f489642l) {
            return;
        }
        l0Var.f489644n = 0L;
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b c24045xac389d8b = l0Var.f489641k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c24045xac389d8b);
        c24045xac389d8b.m88952xbb3aa236(this.f489577e, si0.z.f489749d);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b c24045xac389d8b = this.f489576d.f489641k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c24045xac389d8b);
        c24045xac389d8b.m88953x21f9d260(this.f489577e, si0.a0.f489568d);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b c24045xac389d8b = this.f489576d.f489641k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c24045xac389d8b);
        c24045xac389d8b.m88954xd7e2f2fd(this.f489577e, si0.b0.f489573d);
    }
}
