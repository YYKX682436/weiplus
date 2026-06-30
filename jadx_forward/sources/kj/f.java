package kj;

/* loaded from: classes12.dex */
public class f implements android.view.Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public float f389743a;

    /* renamed from: b, reason: collision with root package name */
    public float f389744b;

    /* renamed from: c, reason: collision with root package name */
    public int f389745c;

    /* renamed from: d, reason: collision with root package name */
    public int f389746d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.WindowManager.LayoutParams f389747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kj.m f389748f;

    public f(kj.m mVar) {
        this.f389748f = mVar;
        float f17 = kj.m.f389775x;
        this.f389743a = f17;
        this.f389744b = (mVar.f389780i / 60.0f) * f17;
        this.f389745c = -1;
        this.f389746d = -1;
        this.f389747e = null;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(android.view.Window window, android.view.FrameMetrics frameMetrics, int i17) {
        this.f389748f.getClass();
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u) {
            for (int i18 = 0; i18 <= 8; i18++) {
                long metric = frameMetrics.getMetric(kj.i.f389752e[i18]);
                if (metric < 0 || metric >= 4611686018427387903L) {
                    return;
                }
            }
            android.view.FrameMetrics frameMetrics2 = new android.view.FrameMetrics(frameMetrics);
            if (this.f389747e == null) {
                this.f389747e = window.getAttributes();
            }
            int i19 = this.f389747e.preferredDisplayModeId;
            int i27 = this.f389745c;
            kj.m mVar = this.f389748f;
            if (i19 != i27 || this.f389746d != mVar.f389780i) {
                this.f389745c = i19;
                this.f389746d = mVar.f389780i;
                float j17 = mVar.j(window);
                this.f389743a = j17;
                this.f389744b = (mVar.f389780i / 60.0f) * j17;
            }
            long metric2 = frameMetrics2.getMetric(8);
            float f17 = 1.0E9f / this.f389743a;
            float max = java.lang.Math.max(0.0f, (((float) metric2) - f17) / f17);
            kj.m mVar2 = this.f389748f;
            mVar2.f389776e += max;
            jj.b bVar = mVar2.f389779h;
            if (bVar != null && max >= this.f389744b) {
                ((jr0.d) bVar).a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v, frameMetrics2, max, this.f389743a);
            }
            synchronized (this.f389748f.f389781m) {
                java.util.Iterator it = this.f389748f.f389781m.iterator();
                while (it.hasNext()) {
                    ((jj.c) it.next()).a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v, frameMetrics2, max, this.f389743a);
                }
            }
        }
    }
}
