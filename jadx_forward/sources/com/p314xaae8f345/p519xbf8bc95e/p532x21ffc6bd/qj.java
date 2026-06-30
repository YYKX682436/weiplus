package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qj implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb {

    /* renamed from: i, reason: collision with root package name */
    private static final int f132487i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final float f132488j = 10.0f;

    /* renamed from: a, reason: collision with root package name */
    boolean f132489a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qm f132490b;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az f132492d;

    /* renamed from: g, reason: collision with root package name */
    private float f132495g;

    /* renamed from: h, reason: collision with root package name */
    private float f132496h;

    /* renamed from: k, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd f132497k;

    /* renamed from: l, reason: collision with root package name */
    private float f132498l;

    /* renamed from: m, reason: collision with root package name */
    private float f132499m;

    /* renamed from: n, reason: collision with root package name */
    private final float f132500n;

    /* renamed from: e, reason: collision with root package name */
    private final long f132493e = 250;

    /* renamed from: f, reason: collision with root package name */
    private final long f132494f = 1200;

    /* renamed from: c, reason: collision with root package name */
    public boolean f132491c = false;

    /* renamed from: com.tencent.mapsdk.internal.qj$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass4 extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f132507a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f132508b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.graphics.PointF f132509c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(double[] dArr, long j17, long j18, android.graphics.PointF pointF) {
            super(3, dArr);
            this.f132507a = j17;
            this.f132508b = j18;
            this.f132509c = pointF;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm
        public final boolean a() {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f132507a;
            long j17 = this.f132508b;
            if (elapsedRealtime > j17) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qj.this.f132489a = false;
                return true;
            }
            float f17 = this.f132509c.x;
            if (f17 != 0.0f) {
                this.A[0] = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jj.a(elapsedRealtime, f17, -f17, j17);
            }
            float f18 = this.f132509c.y;
            if (f18 != 0.0f) {
                this.A[1] = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jj.a(elapsedRealtime, f18, -f18, this.f132508b);
            }
            return false;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm
        public final void b() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qj.this.f132489a = false;
        }
    }

    public qj(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar) {
        this.f132495g = android.view.ViewConfiguration.getMinimumFlingVelocity();
        this.f132496h = android.view.ViewConfiguration.getMaximumFlingVelocity();
        this.f132497k = bdVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az) bdVar.d();
        this.f132492d = azVar;
        if (azVar != null) {
            azVar.a(this);
            android.content.Context I = this.f132492d.I();
            if (I != null) {
                android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(I);
                this.f132495g = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f132496h = viewConfiguration.getScaledMaximumFlingVelocity();
            }
        }
        this.f132490b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qm();
        this.f132500n = bdVar.k() * 2.5f;
    }

    private void k(float f17, float f18) {
        this.f132491c = true;
        if (this.f132489a) {
            return;
        }
        float f19 = f17 / 64.0f;
        float f27 = f18 / 64.0f;
        if (java.lang.Math.abs(f19) >= this.f132500n || java.lang.Math.abs(f27) >= this.f132500n) {
            float max = java.lang.Math.max(java.lang.Math.abs(f17), java.lang.Math.abs(f18));
            float f28 = this.f132495g;
            android.graphics.PointF pointF = new android.graphics.PointF(f19, f27);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.f132489a = true;
            this.f132497k.c().a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qj.AnonymousClass4(new double[]{0.0d, 0.0d}, elapsedRealtime, (((max - f28) / (this.f132496h - f28)) * 950.0f) + 250, pointF));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final void a() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean b(float f17) {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean c(float f17, float f18) {
        if (!this.f132490b.b() || !this.f132490b.c()) {
            return false;
        }
        this.f132491c = true;
        if (this.f132489a) {
            return false;
        }
        float f19 = f17 / 64.0f;
        float f27 = f18 / 64.0f;
        if (java.lang.Math.abs(f19) < this.f132500n && java.lang.Math.abs(f27) < this.f132500n) {
            return false;
        }
        float max = java.lang.Math.max(java.lang.Math.abs(f17), java.lang.Math.abs(f18));
        float f28 = this.f132495g;
        android.graphics.PointF pointF = new android.graphics.PointF(f19, f27);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f132489a = true;
        this.f132497k.c().a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qj.AnonymousClass4(new double[]{0.0d, 0.0d}, elapsedRealtime, (((max - f28) / (this.f132496h - f28)) * 950.0f) + 250, pointF));
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean d() {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean e(float f17, float f18) {
        if (!this.f132490b.f()) {
            return false;
        }
        this.f132498l = this.f132497k.c().A.f133942b.f133976l;
        this.f132499m = f18;
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean f(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        if (this.f132490b.f()) {
            this.f132497k.c().c(java.lang.Math.pow(2.0d, ((this.f132499m - f18) * f132488j) / this.f132497k.j().height()) * this.f132498l);
            this.f132497k.c().a(true);
        }
        return true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean g(float f17, float f18) {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean h(float f17, float f18) {
        this.f132497k.c().f130351o.e();
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean i(float f17, float f18) {
        this.f132497k.c().a(false);
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean j(float f17, float f18) {
        return false;
    }

    private static /* synthetic */ boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qj qjVar) {
        qjVar.f132489a = false;
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean b(float f17, float f18) {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean d(float f17, float f18) {
        return false;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qm qmVar) {
        this.f132490b = qmVar;
        boolean a17 = qmVar.a();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar = this.f132492d;
        if (azVar == null) {
            return;
        }
        if (a17) {
            azVar.b(this);
        } else {
            azVar.a(this);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(new java.lang.Object[0]);
        if (this.f132490b.i()) {
            final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad c17 = this.f132497k.c();
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
        boolean z17 = this.f132491c;
        this.f132491c = false;
        return z17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean a(float f17, float f18) {
        if (!this.f132490b.f()) {
            return false;
        }
        final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad c17 = this.f132497k.c();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.qj.1
            @Override // java.lang.Runnable
            public final void run() {
                c17.p();
            }
        };
        if (c17.L) {
            com.tencent.mapsdk.internal.v.d dVar = c17.A.f133958r;
            if (dVar != null) {
                float width = c17.f130362z.j().width() * (dVar.f133981a + 0.5f);
                f18 = (dVar.f133982b + 0.5f) * c17.f130362z.j().height();
                f17 = width;
            } else {
                c17.a(runnable);
                return false;
            }
        }
        if (!c17.l()) {
            return false;
        }
        android.graphics.Rect rect = c17.A.f133954n;
        int height = rect.height();
        float t17 = c17.f130362z.i().t();
        if (f18 >= rect.top && f18 < (r2 + height) - t17) {
            f18 = (r2 + height) - t17;
        }
        c17.f130362z.i().c(f17, f18);
        runnable.run();
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean c() {
        if (this.f132489a) {
            this.f132497k.c().f130351o.e();
            this.f132489a = false;
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean a(android.view.MotionEvent motionEvent, float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad c17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk i17;
        if (!this.f132490b.b() || (bdVar = (c17 = this.f132497k.c()).f130362z) == null || (i17 = bdVar.i()) == null) {
            return false;
        }
        i17.b(f17, f18);
        c17.c();
        c17.a(true);
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean a(float f17) {
        if (!this.f132490b.d()) {
            return false;
        }
        double d17 = (f17 / 8.0f) * 2.0f;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad c17 = this.f132497k.c();
        c17.f130351o.e();
        c17.b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm(102, new double[]{0.0d, d17}));
        this.f132497k.c().a(true);
        return true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean a(android.graphics.PointF pointF, android.graphics.PointF pointF2, float f17) {
        if (!this.f132490b.e()) {
            return false;
        }
        this.f132497k.c().a(true);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad c17 = this.f132497k.c();
        double d17 = f17;
        double d18 = pointF.x;
        double d19 = pointF.y;
        double d27 = pointF2.x;
        double d28 = pointF2.y;
        c17.f130351o.e();
        float width = c17.f130362z.j().width() / 2.0f;
        float height = c17.f130362z.j().height() / 2.0f;
        com.tencent.mapsdk.internal.v.d dVar = c17.A.f133958r;
        if (c17.M) {
            if (dVar != null) {
                d18 = width + (dVar.f133981a * width * 2.0f);
                d19 = height + (dVar.f133982b * height * 2.0f);
            } else {
                d18 = width;
                d19 = height;
            }
            d27 = d18;
            d28 = d19;
        }
        c17.c(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm(103, new double[]{d17, d18, d19, d27, d28}));
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean a(android.graphics.PointF pointF, android.graphics.PointF pointF2, double d17, double d18) {
        if (!this.f132490b.j()) {
            return false;
        }
        final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad c17 = this.f132497k.c();
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
