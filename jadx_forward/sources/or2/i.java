package or2;

/* loaded from: classes10.dex */
public class i implements android.view.Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f429177a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f429178b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Window f429179c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f429180d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f429181e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f429182f;

    /* renamed from: g, reason: collision with root package name */
    public final int f429183g;

    /* renamed from: h, reason: collision with root package name */
    public final long f429184h;

    /* renamed from: i, reason: collision with root package name */
    public final or2.h f429185i;

    /* renamed from: j, reason: collision with root package name */
    public long f429186j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f429187k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f429188l;

    public i(java.lang.String scene, android.view.View view, android.view.Window window, android.os.Handler handler, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f429177a = scene;
        this.f429178b = view;
        this.f429179c = window;
        this.f429180d = handler;
        this.f429181e = z17;
        this.f429182f = z18;
        int a17 = or2.k.a(window);
        this.f429183g = 1000 / a17;
        this.f429184h = java.util.concurrent.TimeUnit.SECONDS.toNanos(1L) / a17;
        this.f429185i = new or2.h(scene, a17);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        this.f429187k = true;
    }

    public boolean a() {
        boolean z17;
        or2.h frameInfo = this.f429185i;
        long j17 = frameInfo.f429167g;
        if (frameInfo.f429168h <= 0) {
            frameInfo.f429168h = java.lang.System.nanoTime();
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17) {
            return false;
        }
        android.content.Context context = this.f429178b.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[scrollToFps] commentScene:");
        sb6.append(V6.m75939xb282bd08(5));
        sb6.append(" scene:");
        java.lang.String scene = this.f429177a;
        sb6.append(scene);
        sb6.append(' ');
        sb6.append(frameInfo);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FpsMonitor", sb6.toString());
        or2.o oVar = or2.o.f429197a;
        V6.m75939xb282bd08(5);
        int a17 = frameInfo.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (or2.u.f429218e) {
            pm0.v.O("Finder.FinderFpsReporter", new or2.n(a17, scene));
        }
        if (this.f429181e) {
            long j18 = frameInfo.f429175o;
            if (j18 != 0) {
                or2.j jVar = or2.j.f429189a;
                or2.j.f429191c.d(java.lang.Long.valueOf(j18), frameInfo);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameInfo, "frameInfo");
                pm0.v.O("Finder.FinderFpsReporter", new or2.m(frameInfo, V6));
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    @Override // android.view.Window.OnFrameMetricsAvailableListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFrameMetricsAvailable(android.view.Window r18, android.view.FrameMetrics r19, int r20) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: or2.i.onFrameMetricsAvailable(android.view.Window, android.view.FrameMetrics, int):void");
    }
}
