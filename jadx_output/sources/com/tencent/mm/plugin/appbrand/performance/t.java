package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes7.dex */
public class t implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public android.view.Choreographer f87379d;

    /* renamed from: g, reason: collision with root package name */
    public long f87382g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.performance.u f87384i;

    /* renamed from: n, reason: collision with root package name */
    public final u65.a f87386n;

    /* renamed from: e, reason: collision with root package name */
    public long f87380e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f87381f = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f87383h = false;

    /* renamed from: m, reason: collision with root package name */
    public volatile double f87385m = 0.0d;

    public t() {
        u65.a aVar = new u65.a(2, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.performance.t$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.performance.t tVar = com.tencent.mm.plugin.appbrand.performance.t.this;
                android.view.Choreographer choreographer = tVar.f87379d;
                java.util.Objects.requireNonNull(choreographer);
                choreographer.postFrameCallback(tVar);
            }
        });
        this.f87386n = aVar;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            this.f87379d = android.view.Choreographer.getInstance();
            aVar.b();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.performance.t$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.performance.t tVar = com.tencent.mm.plugin.appbrand.performance.t.this;
                    tVar.getClass();
                    tVar.f87379d = android.view.Choreographer.getInstance();
                    tVar.f87386n.b();
                }
            });
        }
        this.f87382g = 200L;
    }

    public void a() {
        if (this.f87383h) {
            return;
        }
        this.f87383h = true;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("FPSMetronome", "[start] stack:%s", new com.tencent.mm.sdk.platformtools.z3());
        this.f87386n.b();
    }

    public void b() {
        if (this.f87383h) {
            this.f87386n.a();
            this.f87383h = false;
            this.f87380e = 0L;
            this.f87381f = 0;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("FPSMetronome", "[stop] stack:%s", new com.tencent.mm.sdk.platformtools.z3());
            android.view.Choreographer choreographer = this.f87379d;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this);
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        if (this.f87383h) {
            long j18 = j17 / 1000000;
            long j19 = this.f87380e;
            if (j19 > 0) {
                long j27 = j18 - j19;
                this.f87381f = this.f87381f + 1;
                if (j27 > this.f87382g) {
                    double d17 = (r2 * 1000) / j27;
                    if (d17 >= 60.0d) {
                        d17 = 60.0d;
                    }
                    this.f87380e = j18;
                    this.f87381f = 0;
                    this.f87385m = d17;
                    com.tencent.mm.plugin.appbrand.performance.u uVar = this.f87384i;
                    if (uVar != null) {
                        com.tencent.mm.plugin.appbrand.performance.c cVar = (com.tencent.mm.plugin.appbrand.performance.c) uVar;
                        if (java.lang.Math.round(cVar.f87332a.f87343f) != java.lang.Math.round(d17)) {
                            cVar.f87332a.f87343f = d17;
                            com.tencent.mm.plugin.appbrand.performance.h.e(cVar.f87332a.f87341d, 303, java.lang.Math.round(cVar.f87332a.f87343f) + " fps");
                            com.tencent.mm.plugin.appbrand.performance.f fVar = cVar.f87332a;
                            com.tencent.mm.plugin.appbrand.performance.m.a(fVar.f87342e, "Hardware", "FPS", fVar.f87343f);
                        }
                    }
                }
            } else {
                this.f87380e = j18;
            }
        }
        if (this.f87383h) {
            this.f87379d.postFrameCallback(this);
        }
    }
}
