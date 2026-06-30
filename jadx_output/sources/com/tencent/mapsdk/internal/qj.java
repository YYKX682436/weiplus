package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qj implements com.tencent.mapsdk.internal.fb {

    /* renamed from: i, reason: collision with root package name */
    private static final int f50954i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final float f50955j = 10.0f;

    /* renamed from: a, reason: collision with root package name */
    boolean f50956a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qm f50957b;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mapsdk.internal.az f50959d;

    /* renamed from: g, reason: collision with root package name */
    private float f50962g;

    /* renamed from: h, reason: collision with root package name */
    private float f50963h;

    /* renamed from: k, reason: collision with root package name */
    private com.tencent.mapsdk.internal.bd f50964k;

    /* renamed from: l, reason: collision with root package name */
    private float f50965l;

    /* renamed from: m, reason: collision with root package name */
    private float f50966m;

    /* renamed from: n, reason: collision with root package name */
    private final float f50967n;

    /* renamed from: e, reason: collision with root package name */
    private final long f50960e = 250;

    /* renamed from: f, reason: collision with root package name */
    private final long f50961f = 1200;

    /* renamed from: c, reason: collision with root package name */
    public boolean f50958c = false;

    /* renamed from: com.tencent.mapsdk.internal.qj$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass4 extends com.tencent.mapsdk.internal.jm {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f50974a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f50975b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.graphics.PointF f50976c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(double[] dArr, long j17, long j18, android.graphics.PointF pointF) {
            super(3, dArr);
            this.f50974a = j17;
            this.f50975b = j18;
            this.f50976c = pointF;
        }

        @Override // com.tencent.mapsdk.internal.jm
        public final boolean a() {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f50974a;
            long j17 = this.f50975b;
            if (elapsedRealtime > j17) {
                com.tencent.mapsdk.internal.qj.this.f50956a = false;
                return true;
            }
            float f17 = this.f50976c.x;
            if (f17 != 0.0f) {
                this.A[0] = com.tencent.mapsdk.internal.jj.a(elapsedRealtime, f17, -f17, j17);
            }
            float f18 = this.f50976c.y;
            if (f18 != 0.0f) {
                this.A[1] = com.tencent.mapsdk.internal.jj.a(elapsedRealtime, f18, -f18, this.f50975b);
            }
            return false;
        }

        @Override // com.tencent.mapsdk.internal.jm
        public final void b() {
            com.tencent.mapsdk.internal.qj.this.f50956a = false;
        }
    }

    public qj(com.tencent.mapsdk.internal.bd bdVar) {
        this.f50962g = android.view.ViewConfiguration.getMinimumFlingVelocity();
        this.f50963h = android.view.ViewConfiguration.getMaximumFlingVelocity();
        this.f50964k = bdVar;
        com.tencent.mapsdk.internal.az azVar = (com.tencent.mapsdk.internal.az) bdVar.d();
        this.f50959d = azVar;
        if (azVar != null) {
            azVar.a(this);
            android.content.Context I = this.f50959d.I();
            if (I != null) {
                android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(I);
                this.f50962g = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f50963h = viewConfiguration.getScaledMaximumFlingVelocity();
            }
        }
        this.f50957b = new com.tencent.mapsdk.internal.qm();
        this.f50967n = bdVar.k() * 2.5f;
    }

    private void k(float f17, float f18) {
        this.f50958c = true;
        if (this.f50956a) {
            return;
        }
        float f19 = f17 / 64.0f;
        float f27 = f18 / 64.0f;
        if (java.lang.Math.abs(f19) >= this.f50967n || java.lang.Math.abs(f27) >= this.f50967n) {
            float max = java.lang.Math.max(java.lang.Math.abs(f17), java.lang.Math.abs(f18));
            float f28 = this.f50962g;
            android.graphics.PointF pointF = new android.graphics.PointF(f19, f27);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.f50956a = true;
            this.f50964k.c().a(new com.tencent.mapsdk.internal.qj.AnonymousClass4(new double[]{0.0d, 0.0d}, elapsedRealtime, (((max - f28) / (this.f50963h - f28)) * 950.0f) + 250, pointF));
        }
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final void a() {
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean b(float f17) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean c(float f17, float f18) {
        if (!this.f50957b.b() || !this.f50957b.c()) {
            return false;
        }
        this.f50958c = true;
        if (this.f50956a) {
            return false;
        }
        float f19 = f17 / 64.0f;
        float f27 = f18 / 64.0f;
        if (java.lang.Math.abs(f19) < this.f50967n && java.lang.Math.abs(f27) < this.f50967n) {
            return false;
        }
        float max = java.lang.Math.max(java.lang.Math.abs(f17), java.lang.Math.abs(f18));
        float f28 = this.f50962g;
        android.graphics.PointF pointF = new android.graphics.PointF(f19, f27);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f50956a = true;
        this.f50964k.c().a(new com.tencent.mapsdk.internal.qj.AnonymousClass4(new double[]{0.0d, 0.0d}, elapsedRealtime, (((max - f28) / (this.f50963h - f28)) * 950.0f) + 250, pointF));
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean d() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean e(float f17, float f18) {
        if (!this.f50957b.f()) {
            return false;
        }
        this.f50965l = this.f50964k.c().A.f52409b.f52443l;
        this.f50966m = f18;
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean f(float f17, float f18) {
        com.tencent.mapsdk.internal.lb.a(java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        if (this.f50957b.f()) {
            this.f50964k.c().c(java.lang.Math.pow(2.0d, ((this.f50966m - f18) * f50955j) / this.f50964k.j().height()) * this.f50965l);
            this.f50964k.c().a(true);
        }
        return true;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean g(float f17, float f18) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean h(float f17, float f18) {
        this.f50964k.c().f48818o.e();
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean i(float f17, float f18) {
        this.f50964k.c().a(false);
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean j(float f17, float f18) {
        return false;
    }

    private static /* synthetic */ boolean a(com.tencent.mapsdk.internal.qj qjVar) {
        qjVar.f50956a = false;
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean b(float f17, float f18) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean d(float f17, float f18) {
        return false;
    }

    private void a(com.tencent.mapsdk.internal.qm qmVar) {
        this.f50957b = qmVar;
        boolean a17 = qmVar.a();
        com.tencent.mapsdk.internal.az azVar = this.f50959d;
        if (azVar == null) {
            return;
        }
        if (a17) {
            azVar.b(this);
        } else {
            azVar.a(this);
        }
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean b() {
        com.tencent.mapsdk.internal.lb.a(new java.lang.Object[0]);
        if (this.f50957b.i()) {
            final com.tencent.mapsdk.internal.ad c17 = this.f50964k.c();
            c17.b(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.qj.2
                @Override // java.lang.Runnable
                public final void run() {
                    c17.p();
                }
            });
        }
        return false;
    }

    private boolean e() {
        boolean z17 = this.f50958c;
        this.f50958c = false;
        return z17;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean a(float f17, float f18) {
        if (!this.f50957b.f()) {
            return false;
        }
        final com.tencent.mapsdk.internal.ad c17 = this.f50964k.c();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.qj.1
            @Override // java.lang.Runnable
            public final void run() {
                c17.p();
            }
        };
        if (c17.L) {
            com.tencent.mapsdk.internal.v.d dVar = c17.A.f52425r;
            if (dVar != null) {
                float width = c17.f48829z.j().width() * (dVar.f52448a + 0.5f);
                f18 = (dVar.f52449b + 0.5f) * c17.f48829z.j().height();
                f17 = width;
            } else {
                c17.a(runnable);
                return false;
            }
        }
        if (!c17.l()) {
            return false;
        }
        android.graphics.Rect rect = c17.A.f52421n;
        int height = rect.height();
        float t17 = c17.f48829z.i().t();
        if (f18 >= rect.top && f18 < (r2 + height) - t17) {
            f18 = (r2 + height) - t17;
        }
        c17.f48829z.i().c(f17, f18);
        runnable.run();
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean c() {
        if (this.f50956a) {
            this.f50964k.c().f48818o.e();
            this.f50956a = false;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean a(android.view.MotionEvent motionEvent, float f17, float f18) {
        com.tencent.mapsdk.internal.ad c17;
        com.tencent.mapsdk.internal.bd bdVar;
        com.tencent.mapsdk.internal.tk i17;
        if (!this.f50957b.b() || (bdVar = (c17 = this.f50964k.c()).f48829z) == null || (i17 = bdVar.i()) == null) {
            return false;
        }
        i17.b(f17, f18);
        c17.c();
        c17.a(true);
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean a(float f17) {
        if (!this.f50957b.d()) {
            return false;
        }
        double d17 = (f17 / 8.0f) * 2.0f;
        com.tencent.mapsdk.internal.ad c17 = this.f50964k.c();
        c17.f48818o.e();
        c17.b(new com.tencent.mapsdk.internal.jm(102, new double[]{0.0d, d17}));
        this.f50964k.c().a(true);
        return true;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean a(android.graphics.PointF pointF, android.graphics.PointF pointF2, float f17) {
        if (!this.f50957b.e()) {
            return false;
        }
        this.f50964k.c().a(true);
        com.tencent.mapsdk.internal.ad c17 = this.f50964k.c();
        double d17 = f17;
        double d18 = pointF.x;
        double d19 = pointF.y;
        double d27 = pointF2.x;
        double d28 = pointF2.y;
        c17.f48818o.e();
        float width = c17.f48829z.j().width() / 2.0f;
        float height = c17.f48829z.j().height() / 2.0f;
        com.tencent.mapsdk.internal.v.d dVar = c17.A.f52425r;
        if (c17.M) {
            if (dVar != null) {
                d18 = width + (dVar.f52448a * width * 2.0f);
                d19 = height + (dVar.f52449b * height * 2.0f);
            } else {
                d18 = width;
                d19 = height;
            }
            d27 = d18;
            d28 = d19;
        }
        c17.c(new com.tencent.mapsdk.internal.jm(103, new double[]{d17, d18, d19, d27, d28}));
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean a(android.graphics.PointF pointF, android.graphics.PointF pointF2, double d17, double d18) {
        if (!this.f50957b.j()) {
            return false;
        }
        final com.tencent.mapsdk.internal.ad c17 = this.f50964k.c();
        c17.a(true);
        c17.a(d18 / d17, pointF.x, pointF.y, pointF2.x, pointF2.y, true, new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.qj.3
            @Override // java.lang.Runnable
            public final void run() {
                c17.p();
            }
        });
        return false;
    }
}
