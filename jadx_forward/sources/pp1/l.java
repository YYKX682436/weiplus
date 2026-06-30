package pp1;

/* loaded from: classes14.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f438958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f438959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f438960f;

    public l(pp1.z zVar, boolean z17, android.animation.ValueAnimator valueAnimator) {
        this.f438958d = zVar;
        this.f438959e = z17;
        this.f438960f = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pp1.z zVar = this.f438958d;
        boolean z17 = pp1.z.B;
        zVar.t(1.0f, false);
        ku5.u0 u0Var = ku5.t0.f394148d;
        pp1.k kVar = new pp1.k(this.f438958d, this.f438959e, this.f438960f);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(kVar, 50L, false);
    }
}
