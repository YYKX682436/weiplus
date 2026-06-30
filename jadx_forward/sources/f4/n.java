package f4;

/* loaded from: classes15.dex */
public class n extends f4.l {

    /* renamed from: j, reason: collision with root package name */
    public static android.os.Handler f340930j;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.Window f340931e;

    /* renamed from: f, reason: collision with root package name */
    public long f340932f;

    /* renamed from: g, reason: collision with root package name */
    public long f340933g;

    /* renamed from: h, reason: collision with root package name */
    public long f340934h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.Window.OnFrameMetricsAvailableListener f340935i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f4.i jankStats, android.view.View view, android.view.Window window) {
        super(jankStats, view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jankStats, "jankStats");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        this.f340931e = window;
        this.f340935i = new f4.m(this, jankStats);
    }

    @Override // f4.q
    public void a(boolean z17) {
        java.util.List list;
        android.view.Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.f340935i;
        android.view.Window window = this.f340931e;
        if (!z17) {
            f4.a aVar = (f4.a) window.getDecorView().getTag(com.p314xaae8f345.mm.R.id.jic);
            if (aVar != null && (list = aVar.f340909a) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(list);
                arrayList.remove(onFrameMetricsAvailableListener);
                if (arrayList.isEmpty()) {
                    window.removeOnFrameMetricsAvailableListener(aVar);
                    window.getDecorView().setTag(com.p314xaae8f345.mm.R.id.jic, null);
                }
                aVar.f340909a = arrayList;
            }
            this.f340933g = 0L;
            return;
        }
        if (this.f340933g == 0) {
            f4.a aVar2 = (f4.a) window.getDecorView().getTag(com.p314xaae8f345.mm.R.id.jic);
            if (aVar2 == null) {
                f4.a aVar3 = new f4.a(new java.util.ArrayList());
                if (f340930j == null) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("FrameMetricsAggregator");
                    handlerThread.start();
                    f340930j = new android.os.Handler(handlerThread.getLooper());
                }
                window.addOnFrameMetricsAvailableListener(aVar3, f340930j);
                window.getDecorView().setTag(com.p314xaae8f345.mm.R.id.jic, aVar3);
                aVar2 = aVar3;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(aVar2.f340909a);
            arrayList2.add(onFrameMetricsAvailableListener);
            aVar2.f340909a = arrayList2;
            this.f340933g = java.lang.System.nanoTime();
        }
    }

    public long b(android.view.FrameMetrics metrics) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metrics, "metrics");
        return f4.c.f340910d.a((android.view.View) this.f340925b.get());
    }

    public f4.e c(long j17, long j18, android.view.FrameMetrics frameMetrics) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameMetrics, "frameMetrics");
        long metric = frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
        long j19 = j17 + metric;
        this.f340934h = j19;
        f4.u uVar = this.f340927d.f340937a;
        return new f4.e(j17, metric, frameMetrics.getMetric(6) + metric + frameMetrics.getMetric(7), metric > j18, uVar != null ? uVar.c(j17, j19) : kz5.p0.f395529d);
    }

    public long d(android.view.FrameMetrics frameMetrics) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameMetrics, "frameMetrics");
        java.lang.Object obj = f4.c.f340911e.get(this.f340926c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
        return ((java.lang.Long) obj).longValue();
    }
}
