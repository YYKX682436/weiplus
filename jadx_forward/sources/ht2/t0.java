package ht2;

/* loaded from: classes2.dex */
public final class t0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f366439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f366440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f366441f;

    public t0(ht2.y0 y0Var, boolean z17, yz5.a aVar) {
        this.f366439d = y0Var;
        this.f366440e = z17;
        this.f366441f = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicIconResService", "tv onAnimationEnd");
        super.onAnimationEnd(animation, z17);
        ht2.y0 y0Var = this.f366439d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = y0Var.f366475f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        y0Var.f366475f = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new ht2.s0(this.f366440e, this.f366441f, null), 3, null);
    }
}
