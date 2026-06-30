package si0;

/* loaded from: classes13.dex */
public final class x implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f489740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f489741e;

    public x(si0.l0 l0Var, long j17) {
        this.f489740d = l0Var;
        this.f489741e = j17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        si0.l0 l0Var = this.f489740d;
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b c24045xac389d8b = l0Var.f489641k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c24045xac389d8b);
        c24045xac389d8b.m88955x27addd8e(this.f489741e, si0.w.f489738d);
        l0Var.f489644n = animation.getCurrentPlayTime();
        java.lang.Object animatedValue = l0Var.f489645o.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        double floatValue = ((java.lang.Float) animatedValue).floatValue();
        if (l0Var.f489643m == floatValue) {
            return;
        }
        l0Var.f489643m = floatValue;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = l0Var.f489653w;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        l0Var.f489653w = p3325xe03a0797.p3326xc267989b.l.d(l0Var.f489650t, l0Var.f489651u, null, new si0.d0(l0Var, floatValue, null), 2, null);
    }
}
