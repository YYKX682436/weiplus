package si0;

/* loaded from: classes.dex */
public final class m implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.v f489659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f489660e;

    public m(si0.v vVar, long j17) {
        this.f489659d = vVar;
        this.f489660e = j17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b c24045xac389d8b = this.f489659d.f489721k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c24045xac389d8b);
        c24045xac389d8b.m88951x827d33f(this.f489660e, si0.i.f489618d);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        si0.v vVar = this.f489659d;
        if (vVar.f489722l) {
            return;
        }
        vVar.f489724n = 0L;
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b c24045xac389d8b = vVar.f489721k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c24045xac389d8b);
        c24045xac389d8b.m88952xbb3aa236(this.f489660e, si0.j.f489622d);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b c24045xac389d8b = this.f489659d.f489721k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c24045xac389d8b);
        c24045xac389d8b.m88953x21f9d260(this.f489660e, si0.k.f489627d);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b c24045xac389d8b = this.f489659d.f489721k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c24045xac389d8b);
        c24045xac389d8b.m88954xd7e2f2fd(this.f489660e, si0.l.f489630d);
    }
}
