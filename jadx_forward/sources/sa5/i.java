package sa5;

/* loaded from: classes14.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sa5.j f486877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f486878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f486879f;

    public i(sa5.j jVar, long j17, yz5.a aVar) {
        this.f486877d = jVar;
        this.f486878e = j17;
        this.f486879f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sa5.j jVar = this.f486877d;
        jVar.d();
        android.view.View view = jVar.f486884d;
        if (view != null) {
            sa5.h hVar = new sa5.h(jVar);
            android.view.ViewPropertyAnimator interpolator = view.animate().setInterpolator(jVar.f());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interpolator);
            jVar.g(interpolator);
            interpolator.setUpdateListener(hVar);
            interpolator.withEndAction(new sa5.g(jVar, this.f486879f, interpolator));
            interpolator.setDuration(this.f486878e).start();
        }
    }
}
