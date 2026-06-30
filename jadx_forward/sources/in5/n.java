package in5;

/* loaded from: classes2.dex */
public final class n extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public long f374628a = android.os.SystemClock.elapsedRealtime();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.v f374629b;

    public n(in5.v vVar) {
        this.f374629b = vVar;
    }

    @Override // ym5.n0
    /* renamed from: getAdditionalCondition */
    public boolean mo55689xe831ad7e(android.view.View target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        return this.f374629b.a(target);
    }

    @Override // ym5.n0
    /* renamed from: getExposePercent */
    public float mo136789x5392a02b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return this.f374629b.b(view);
    }

    @Override // ym5.n0
    /* renamed from: getExposedId */
    public long mo55681x18a217a5(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return this.f374629b.c(view);
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        long j19 = 0;
        if (!z17 && this.f374628a != 0) {
            j19 = android.os.SystemClock.elapsedRealtime() - this.f374628a;
        }
        long j27 = j19;
        if (z17) {
            this.f374628a = android.os.SystemClock.elapsedRealtime();
        }
        this.f374629b.d(view, j17, j18, z17, j27);
    }
}
