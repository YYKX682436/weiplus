package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030;

/* loaded from: classes7.dex */
public class t implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public android.view.Choreographer f168912d;

    /* renamed from: g, reason: collision with root package name */
    public long f168915g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.u f168917i;

    /* renamed from: n, reason: collision with root package name */
    public final u65.a f168919n;

    /* renamed from: e, reason: collision with root package name */
    public long f168913e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f168914f = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f168916h = false;

    /* renamed from: m, reason: collision with root package name */
    public volatile double f168918m = 0.0d;

    public t() {
        u65.a aVar = new u65.a(2, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.performance.t$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t tVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t.this;
                android.view.Choreographer choreographer = tVar.f168912d;
                java.util.Objects.requireNonNull(choreographer);
                choreographer.postFrameCallback(tVar);
            }
        });
        this.f168919n = aVar;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            this.f168912d = android.view.Choreographer.getInstance();
            aVar.b();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.performance.t$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t tVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t.this;
                    tVar.getClass();
                    tVar.f168912d = android.view.Choreographer.getInstance();
                    tVar.f168919n.b();
                }
            });
        }
        this.f168915g = 200L;
    }

    public void a() {
        if (this.f168916h) {
            return;
        }
        this.f168916h = true;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FPSMetronome", "[start] stack:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        this.f168919n.b();
    }

    public void b() {
        if (this.f168916h) {
            this.f168919n.a();
            this.f168916h = false;
            this.f168913e = 0L;
            this.f168914f = 0;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FPSMetronome", "[stop] stack:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            android.view.Choreographer choreographer = this.f168912d;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this);
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        if (this.f168916h) {
            long j18 = j17 / 1000000;
            long j19 = this.f168913e;
            if (j19 > 0) {
                long j27 = j18 - j19;
                this.f168914f = this.f168914f + 1;
                if (j27 > this.f168915g) {
                    double d17 = (r2 * 1000) / j27;
                    if (d17 >= 60.0d) {
                        d17 = 60.0d;
                    }
                    this.f168913e = j18;
                    this.f168914f = 0;
                    this.f168918m = d17;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.u uVar = this.f168917i;
                    if (uVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.c) uVar;
                        if (java.lang.Math.round(cVar.f168865a.f168876f) != java.lang.Math.round(d17)) {
                            cVar.f168865a.f168876f = d17;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.e(cVar.f168865a.f168874d, 303, java.lang.Math.round(cVar.f168865a.f168876f) + " fps");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f fVar = cVar.f168865a;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(fVar.f168875e, "Hardware", "FPS", fVar.f168876f);
                        }
                    }
                }
            } else {
                this.f168913e = j18;
            }
        }
        if (this.f168916h) {
            this.f168912d.postFrameCallback(this);
        }
    }
}
