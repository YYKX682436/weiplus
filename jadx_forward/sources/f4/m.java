package f4;

/* loaded from: classes15.dex */
public final class m implements android.view.Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f4.n f340928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f4.i f340929b;

    public m(f4.n nVar, f4.i iVar) {
        this.f340928a = nVar;
        this.f340929b = iVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(android.view.Window window, android.view.FrameMetrics frameMetrics, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameMetrics);
        f4.n nVar = this.f340928a;
        long max = java.lang.Math.max(nVar.d(frameMetrics), nVar.f340934h);
        if (max < nVar.f340933g || max == nVar.f340932f) {
            return;
        }
        float b17 = (float) nVar.b(frameMetrics);
        f4.i iVar = this.f340929b;
        f4.e c17 = this.f340928a.c(max, b17 * iVar.f340924d, frameMetrics);
        c17.f340917f = frameMetrics;
        iVar.f340921a.execute(new f4.h(iVar, c17));
        nVar.f340932f = max;
    }
}
