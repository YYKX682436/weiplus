package si0;

/* loaded from: classes13.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.v f489612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f489613e;

    public h(si0.v vVar, long j17) {
        this.f489612d = vVar;
        this.f489613e = j17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        si0.v vVar = this.f489612d;
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b c24045xac389d8b = vVar.f489721k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c24045xac389d8b);
        c24045xac389d8b.m88955x27addd8e(this.f489613e, si0.g.f489608d);
        vVar.f489724n = animation.getCurrentPlayTime();
        java.lang.Object animatedValue = vVar.f489725o.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        double floatValue = ((java.lang.Float) animatedValue).floatValue();
        if (vVar.f489723m == floatValue) {
            return;
        }
        vVar.f489723m = floatValue;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = vVar.f489733w;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        vVar.f489733w = p3325xe03a0797.p3326xc267989b.l.d(vVar.f489730t, vVar.f489731u, null, new si0.n(vVar, floatValue, null), 2, null);
    }
}
