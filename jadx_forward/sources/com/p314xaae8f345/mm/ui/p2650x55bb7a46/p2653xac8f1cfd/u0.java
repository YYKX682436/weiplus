package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes15.dex */
public final class u0 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e, f4.g {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f281567m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.ArrayList f281568n;

    /* renamed from: e, reason: collision with root package name */
    public boolean f281569e;

    /* renamed from: g, reason: collision with root package name */
    public f4.i f281571g;

    /* renamed from: f, reason: collision with root package name */
    public boolean f281570f = true;

    /* renamed from: h, reason: collision with root package name */
    public final long f281572h = c06.e.f119249d.g(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);

    /* renamed from: i, reason: collision with root package name */
    public final int f281573i = tb5.v.f498615r.a();

    static {
        new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.t0(null);
        f281567m = new java.util.HashMap();
        f281568n = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        boolean z17 = od5.b.f426188a;
        if (od5.b.f426188a) {
            if (this.f281570f) {
                java.lang.Object p17 = this.f280113d.p();
                android.view.View view = p17 instanceof android.view.View ? (android.view.View) p17 : null;
                if (view != null) {
                    android.view.ViewParent parent = view.getParent();
                    while (parent instanceof android.view.View) {
                        view = parent;
                        parent = view.getParent();
                    }
                    java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.jid);
                    if (tag == null) {
                        tag = new f4.s();
                        view.setTag(com.p314xaae8f345.mm.R.id.jid, tag);
                    }
                    android.view.Window window = this.f280113d.g().getWindow();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                    this.f281571g = new f4.i(window, p3325xe03a0797.p3326xc267989b.h2.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), this, null);
                }
                this.f281570f = false;
            }
            f4.i iVar = this.f281571g;
            if (iVar == null) {
                return;
            }
            iVar.a(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        f281568n.clear();
        f281567m.clear();
        f4.i iVar = this.f281571g;
        if (iVar == null) {
            return;
        }
        iVar.a(false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (i17 == 0) {
            this.f281569e = false;
        } else if (i17 == 1 || i17 == 2) {
            this.f281569e = true;
        }
    }

    @Override // f4.g
    public void q1(f4.d frameData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameData, "frameData");
        if (frameData.f340914c) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6365x415f7c72 c6365x415f7c72 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6365x415f7c72();
            c6365x415f7c72.f137137d = c6365x415f7c72.b("SessionId", this.f280113d.x(), true);
            c6365x415f7c72.f137139f = frameData.f340913b;
            c6365x415f7c72.f137148o = c6365x415f7c72.b("StringVal2", "true", true);
            if (frameData instanceof f4.e) {
                android.app.Activity g17 = this.f280113d.g();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
                if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v0.f281636a == 0) {
                    android.view.Window window = g17.getWindow();
                    float f17 = 60.0f;
                    float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
                    if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                        f17 = refreshRate;
                    }
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v0.f281636a = (int) f17;
                }
                c6365x415f7c72.f137144k = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v0.f281636a;
                f4.e eVar = (f4.e) frameData;
                android.view.FrameMetrics frameMetrics = eVar.f340917f;
                long metric = frameMetrics != null ? frameMetrics.getMetric(0) : -1L;
                android.view.FrameMetrics frameMetrics2 = eVar.f340917f;
                long metric2 = frameMetrics2 != null ? frameMetrics2.getMetric(1) : -1L;
                android.view.FrameMetrics frameMetrics3 = eVar.f340917f;
                long metric3 = frameMetrics3 != null ? frameMetrics3.getMetric(2) : -1L;
                android.view.FrameMetrics frameMetrics4 = eVar.f340917f;
                long metric4 = frameMetrics4 != null ? frameMetrics4.getMetric(3) : -1L;
                android.view.FrameMetrics frameMetrics5 = eVar.f340917f;
                long metric5 = frameMetrics5 != null ? frameMetrics5.getMetric(4) : -1L;
                android.view.FrameMetrics frameMetrics6 = eVar.f340917f;
                long metric6 = frameMetrics6 != null ? frameMetrics6.getMetric(5) : -1L;
                android.view.FrameMetrics frameMetrics7 = eVar.f340917f;
                long metric7 = frameMetrics7 != null ? frameMetrics7.getMetric(6) : -1L;
                android.view.FrameMetrics frameMetrics8 = eVar.f340917f;
                long metric8 = frameMetrics8 != null ? frameMetrics8.getMetric(7) : -1L;
                c6365x415f7c72.f137146m = this.f281569e ? 1L : 0L;
                c6365x415f7c72.f137138e = metric;
                c6365x415f7c72.f137140g = metric2;
                c6365x415f7c72.f137149p = metric3;
                c6365x415f7c72.f137150q = metric4;
                c6365x415f7c72.f137151r = metric5;
                c6365x415f7c72.f137152s = metric6;
                c6365x415f7c72.f137153t = metric7;
                c6365x415f7c72.f137154u = metric8;
                if (metric5 != 0) {
                    java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((((float) metric4) * 1.0f) / ((float) metric5))}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    c6365x415f7c72.f137147n = c6365x415f7c72.b("StringVal1", r26.i0.t(format, ",", ";", false), true);
                }
            }
            if (frameData instanceof f4.f) {
                c6365x415f7c72.f137141h = ((f4.f) frameData).f340918g;
            }
            c6365x415f7c72.f137142i = oj.d.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f427215d;
            c6365x415f7c72.f137143j = this.f281573i;
            c6365x415f7c72.f137145l = this.f281572h;
            c6365x415f7c72.k();
        }
        f281568n.clear();
        f281567m.clear();
    }
}
