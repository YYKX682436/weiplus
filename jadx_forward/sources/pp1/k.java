package pp1;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f438955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f438956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f438957f;

    public k(pp1.z zVar, boolean z17, android.animation.ValueAnimator valueAnimator) {
        this.f438955d = zVar;
        this.f438956e = z17;
        this.f438957f = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pp1.z zVar = this.f438955d;
        boolean z17 = this.f438956e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = zVar.f438981f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12917x19ac03e7);
        zVar.n(z17, true, 0.0f, c12917x19ac03e7.m54108x4480f5e7(), false);
        this.f438957f.start();
    }
}
