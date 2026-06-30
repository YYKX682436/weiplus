package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qk implements android.view.View.OnTouchListener {
    private static final int I = 50;

    /* renamed from: b, reason: collision with root package name */
    private static final int f50978b = 255;

    /* renamed from: c, reason: collision with root package name */
    private static final int f50979c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static final int f50980d = 6;

    /* renamed from: e, reason: collision with root package name */
    private static final double f50981e = 2.5d;

    /* renamed from: f, reason: collision with root package name */
    private static final double f50982f = 0.5d;

    /* renamed from: g, reason: collision with root package name */
    private static final double f50983g = 0.003d;

    /* renamed from: h, reason: collision with root package name */
    private static final double f50984h = 0.001d;

    /* renamed from: i, reason: collision with root package name */
    private static final double f50985i = 0.1d;

    /* renamed from: j, reason: collision with root package name */
    private static final double f50986j = 0.5d;

    /* renamed from: k, reason: collision with root package name */
    private static final int f50987k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int f50988l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f50989m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f50990n = 4;

    /* renamed from: o, reason: collision with root package name */
    private static final int f50991o = 8;

    /* renamed from: p, reason: collision with root package name */
    private static final float f50992p = (float) java.lang.Math.cos(0.0017453292780017621d);

    /* renamed from: q, reason: collision with root package name */
    private static final int f50993q = 10;

    /* renamed from: u, reason: collision with root package name */
    private static final int f50994u = 120;
    private android.view.GestureDetector E;
    private final com.tencent.mapsdk.internal.bd F;
    private final java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tz> G;

    /* renamed from: J, reason: collision with root package name */
    private java.lang.reflect.Method f50995J;
    private java.lang.reflect.Method K;

    /* renamed from: r, reason: collision with root package name */
    private boolean f50997r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f50998s;

    /* renamed from: t, reason: collision with root package name */
    private long f50999t;

    /* renamed from: v, reason: collision with root package name */
    private int f51000v = 0;

    /* renamed from: w, reason: collision with root package name */
    private final android.graphics.PointF f51001w = new android.graphics.PointF();

    /* renamed from: x, reason: collision with root package name */
    private final android.graphics.PointF f51002x = new android.graphics.PointF();

    /* renamed from: y, reason: collision with root package name */
    private final android.graphics.PointF f51003y = new android.graphics.PointF();

    /* renamed from: z, reason: collision with root package name */
    private final android.graphics.PointF f51004z = new android.graphics.PointF();
    private final android.graphics.PointF A = new android.graphics.PointF();
    private final android.graphics.PointF B = new android.graphics.PointF();
    private final android.graphics.PointF C = new android.graphics.PointF();
    private long D = 0;
    private final com.tencent.mapsdk.internal.qk.a H = new com.tencent.mapsdk.internal.qk.a(this, 0);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.ql f50996a = new com.tencent.mapsdk.internal.ql();

    public qk(final com.tencent.mapsdk.internal.tz tzVar) {
        this.G = new java.lang.ref.WeakReference<>(tzVar);
        this.F = (com.tencent.mapsdk.internal.bd) tzVar.d_;
        com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.qk.1
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mapsdk.internal.qk.this.E = new android.view.GestureDetector(tzVar.I(), com.tencent.mapsdk.internal.qk.this.H);
                com.tencent.mapsdk.internal.qk.this.E.setOnDoubleTapListener(com.tencent.mapsdk.internal.qk.this.H);
            }
        });
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEvent2;
        com.tencent.mapsdk.internal.qk qkVar;
        android.view.GestureDetector gestureDetector;
        boolean z17;
        float max;
        boolean z18;
        float max2;
        boolean z19;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            this.D = android.os.SystemClock.elapsedRealtime();
                            this.f51000v = 0;
                            this.f50997r = true;
                            this.f50999t = android.os.SystemClock.elapsedRealtime();
                            this.f50998s = false;
                            a(this.f51003y, this.f51004z, motionEvent);
                            this.f50996a.c();
                            return true;
                        }
                        if (action == 6 && !this.f50998s) {
                            this.f50998s = true;
                            this.f50996a.d();
                            return true;
                        }
                        motionEvent2 = motionEvent;
                        qkVar = this;
                    }
                } else {
                    if (this.f50997r && !this.f50998s) {
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        if (elapsedRealtime - this.f50999t < 8) {
                            return true;
                        }
                        this.f50999t = elapsedRealtime;
                        a(this.f51001w, this.f51002x, motionEvent);
                        android.graphics.PointF pointF = this.f51001w;
                        float f17 = pointF.x;
                        android.graphics.PointF pointF2 = this.f51003y;
                        float f18 = f17 - pointF2.x;
                        float f19 = pointF.y - pointF2.y;
                        android.graphics.PointF pointF3 = this.f51002x;
                        float f27 = pointF3.x;
                        android.graphics.PointF pointF4 = this.f51004z;
                        float f28 = f27 - pointF4.x;
                        float f29 = pointF3.y - pointF4.y;
                        boolean z27 = ((double) java.lang.Math.abs(f19)) > ((double) java.lang.Math.abs(f18)) * 1.5d && ((double) java.lang.Math.abs(f29)) > ((double) java.lang.Math.abs(f28)) * 1.5d;
                        boolean z28 = ((double) java.lang.Math.abs(f19)) > ((double) java.lang.Math.abs(f18)) * 1.5d && ((double) java.lang.Math.abs(f29)) > ((double) java.lang.Math.abs(f28)) * 1.5d;
                        boolean z29 = ((double) java.lang.Math.abs(f18)) > ((double) java.lang.Math.abs(f19)) * 1.5d && ((double) java.lang.Math.abs(f28)) > ((double) java.lang.Math.abs(f29)) * 1.5d;
                        boolean z37 = ((double) java.lang.Math.abs(f18)) > ((double) java.lang.Math.abs(f19)) * 1.5d && ((double) java.lang.Math.abs(f28)) > ((double) java.lang.Math.abs(f29)) * 1.5d;
                        float f37 = f18 * f28;
                        boolean z38 = f37 > 0.0f;
                        float f38 = f19 * f29;
                        boolean z39 = f38 > 0.0f;
                        int i17 = this.f51000v;
                        boolean z47 = ((i17 & 8) == 0 && (i17 & 1) == 0 && (i17 & 4) == 0) ? false : true;
                        double d17 = z47 ? f50985i : 0.5d;
                        if (f37 > 0.0f) {
                            max = java.lang.Math.abs(f18 + f28);
                            z17 = z39;
                        } else {
                            z17 = z39;
                            max = java.lang.Math.max(java.lang.Math.abs(f18), java.lang.Math.abs(f28));
                        }
                        double d18 = max;
                        if (f38 > 0.0f) {
                            max2 = java.lang.Math.abs(f19 + f29);
                            z18 = z47;
                        } else {
                            z18 = z47;
                            max2 = java.lang.Math.max(java.lang.Math.abs(f19), java.lang.Math.abs(f29));
                        }
                        double max3 = java.lang.Math.max(d18, max2);
                        boolean z48 = max3 > d17;
                        boolean z49 = z48 && z38 && (z29 || z37) && this.G.get().h();
                        boolean z57 = z48 && z17 && (z27 || z28) && this.G.get().j();
                        android.graphics.PointF pointF5 = this.f51004z;
                        float f39 = pointF5.x;
                        android.graphics.PointF pointF6 = this.f51003y;
                        boolean z58 = z38;
                        double d19 = f39 - pointF6.x;
                        boolean z59 = z49;
                        double d27 = pointF5.y - pointF6.y;
                        android.graphics.PointF pointF7 = this.f51002x;
                        boolean z66 = z59;
                        float f47 = pointF7.x;
                        android.graphics.PointF pointF8 = this.f51001w;
                        double d28 = f47 - pointF8.x;
                        boolean z67 = z57;
                        double d29 = pointF7.y - pointF8.y;
                        double sqrt = java.lang.Math.sqrt((d19 * d19) + (d27 * d27));
                        double sqrt2 = java.lang.Math.sqrt((d28 * d28) + (d29 * d29));
                        double d37 = sqrt * sqrt2;
                        double d38 = ((d19 * d28) + (d27 * d29)) / d37;
                        double acos = (java.lang.Math.acos(d38) * 180.0d) / 3.141592653589793d;
                        if ((d19 * d29) - (d27 * d28) < 0.0d) {
                            acos = -acos;
                        }
                        double d39 = acos;
                        boolean z68 = java.lang.Math.abs(d38) < ((double) f50992p);
                        double d47 = (this.f51000v & 2) == 0 ? f50981e : 0.5d;
                        double abs = java.lang.Math.abs(d39);
                        boolean z69 = d37 > 0.0d && z68 && java.lang.Math.abs(d39) > d47 && this.G.get().k();
                        double d48 = sqrt2 / sqrt;
                        double d49 = z18 ? f50984h : f50983g;
                        double d57 = d48 - 1.0d;
                        double abs2 = java.lang.Math.abs(d57);
                        boolean z76 = sqrt > 0.0d && abs2 > d49 && this.G.get().i();
                        boolean z77 = z76;
                        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("trace-gesture", "began:" + z48 + ":" + z76 + ":" + z69, "value:" + max3 + ":" + abs2 + ":" + abs);
                        if (z69) {
                            z48 = false;
                        }
                        if (z67) {
                            z19 = false;
                            z69 = false;
                            z66 = false;
                        } else {
                            z19 = z77;
                        }
                        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("beganMove:".concat(java.lang.String.valueOf(z48)), "vertical:".concat(java.lang.String.valueOf(z17)), "horizontal:".concat(java.lang.String.valueOf(z58)), "verticalMove:".concat(java.lang.String.valueOf(z67)), "horizontalMove:".concat(java.lang.String.valueOf(z66)));
                        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("beganRotate:".concat(java.lang.String.valueOf(z69)), "cosValue : ".concat(java.lang.String.valueOf(d38)), "cosAngle : ".concat(java.lang.String.valueOf(z68)), "angle:".concat(java.lang.String.valueOf(d39)), "rotateJudge : ".concat(java.lang.String.valueOf(d47)));
                        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("beganScale:".concat(java.lang.String.valueOf(z19)), "d1:".concat(java.lang.String.valueOf(sqrt)), "scale - 1 = " + java.lang.Math.abs(d57), "scaleJudge : ".concat(java.lang.String.valueOf(d49)));
                        if (z48) {
                            if (z66) {
                                this.f51000v |= 8;
                                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("MT_INTENT_MOVE");
                                this.f50996a.a(motionEvent, (f18 + f28) / 2.0f, (f19 + f29) / 2.0f);
                            }
                            if (z67) {
                                this.f51000v |= 1;
                                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("MT_INTENT_MOVE_VERTICAL");
                                android.graphics.PointF pointF9 = this.f51003y;
                                android.graphics.PointF pointF10 = this.f51001w;
                                pointF9.set(pointF10.x, pointF10.y);
                                android.graphics.PointF pointF11 = this.f51004z;
                                android.graphics.PointF pointF12 = this.f51002x;
                                pointF11.set(pointF12.x, pointF12.y);
                                this.f50996a.a(java.lang.Math.abs(f19) > java.lang.Math.abs(f29) ? f19 : f29);
                            }
                        }
                        if (z69) {
                            this.f51000v |= 2;
                            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("MT_INTENT_ROTATE");
                            if (z58 && !this.G.get().h()) {
                                android.graphics.PointF pointF13 = this.f51003y;
                                android.graphics.PointF pointF14 = this.f51001w;
                                pointF13.set(pointF14.x, pointF14.y);
                                android.graphics.PointF pointF15 = this.f51004z;
                                android.graphics.PointF pointF16 = this.f51002x;
                                pointF15.set(pointF16.x, pointF16.y);
                                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("NO_HORIZONAL_ROTATE");
                                return true;
                            }
                            android.graphics.PointF pointF17 = this.f51004z;
                            android.graphics.PointF pointF18 = this.f51003y;
                            android.graphics.PointF pointF19 = this.f51002x;
                            android.graphics.PointF pointF20 = this.f51001w;
                            float f48 = pointF18.x;
                            float f49 = pointF17.x;
                            android.graphics.PointF pointF21 = null;
                            if (f48 != f49) {
                                float f57 = pointF20.x;
                                float f58 = pointF19.x;
                                if (f57 != f58) {
                                    float f59 = pointF18.y;
                                    float f66 = pointF17.y;
                                    float f67 = (f59 - f66) / (f48 - f49);
                                    float f68 = pointF20.y;
                                    float f69 = pointF19.y;
                                    float f76 = (f68 - f69) / (f57 - f58);
                                    if (f67 != f76) {
                                        float f77 = ((f69 * f57) - (f68 * f58)) / (f57 - f58);
                                        float f78 = (f77 - (((f66 * f48) - (f59 * f49)) / (f48 - f49))) / (f67 - f76);
                                        pointF21 = new android.graphics.PointF(f78, (f76 * f78) + f77);
                                    }
                                }
                            }
                            if (pointF21 == null ? false : a(pointF21.x, pointF21.y)) {
                                com.tencent.mapsdk.internal.bd bdVar = this.F;
                                this.C.set(bdVar == null ? 0 : bdVar.j().width() / 2, this.F == null ? 0 : r6.j().height() / 2);
                                com.tencent.mapsdk.internal.ql qlVar = this.f50996a;
                                android.graphics.PointF pointF22 = this.C;
                                qlVar.a(pointF22, pointF22, (float) d39);
                            } else {
                                android.graphics.PointF pointF23 = this.A;
                                android.graphics.PointF pointF24 = this.f51003y;
                                float f79 = pointF24.x;
                                android.graphics.PointF pointF25 = this.f51004z;
                                pointF23.set((f79 + pointF25.x) / 2.0f, (pointF24.y + pointF25.y) / 2.0f);
                                android.graphics.PointF pointF26 = this.B;
                                android.graphics.PointF pointF27 = this.f51001w;
                                float f86 = pointF27.x;
                                android.graphics.PointF pointF28 = this.f51002x;
                                pointF26.set((f86 + pointF28.x) / 2.0f, (pointF27.y + pointF28.y) / 2.0f);
                                this.f50996a.a(this.A, this.B, (float) d39);
                            }
                        }
                        if (z19) {
                            this.f51000v |= 4;
                            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("MT_INTENT_SCALE");
                            if (z58 && !this.G.get().h()) {
                                android.graphics.PointF pointF29 = this.f51003y;
                                android.graphics.PointF pointF30 = this.f51001w;
                                pointF29.set(pointF30.x, pointF30.y);
                                android.graphics.PointF pointF31 = this.f51004z;
                                android.graphics.PointF pointF32 = this.f51002x;
                                pointF31.set(pointF32.x, pointF32.y);
                                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("NO_HORIZONAL_SCALE");
                                return true;
                            }
                            android.graphics.PointF pointF33 = this.A;
                            android.graphics.PointF pointF34 = this.f51003y;
                            float f87 = pointF34.x;
                            android.graphics.PointF pointF35 = this.f51004z;
                            pointF33.set((f87 + pointF35.x) / 2.0f, (pointF34.y + pointF35.y) / 2.0f);
                            android.graphics.PointF pointF36 = this.B;
                            android.graphics.PointF pointF37 = this.f51001w;
                            float f88 = pointF37.x;
                            android.graphics.PointF pointF38 = this.f51002x;
                            pointF36.set((f88 + pointF38.x) / 2.0f, (pointF37.y + pointF38.y) / 2.0f);
                            this.f50996a.a(this.A, this.B, sqrt, sqrt2);
                        }
                        android.graphics.PointF pointF39 = this.f51003y;
                        android.graphics.PointF pointF40 = this.f51001w;
                        pointF39.set(pointF40.x, pointF40.y);
                        android.graphics.PointF pointF41 = this.f51004z;
                        android.graphics.PointF pointF42 = this.f51002x;
                        pointF41.set(pointF42.x, pointF42.y);
                        return true;
                    }
                    motionEvent2 = motionEvent;
                    qkVar = this;
                    qkVar.f50996a.j(motionEvent.getX(), motionEvent.getY());
                }
            }
            motionEvent2 = motionEvent;
            qkVar = this;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - qkVar.D;
            if (qkVar.f51000v == 0 && elapsedRealtime2 > 0 && elapsedRealtime2 < 200) {
                android.graphics.PointF pointF43 = qkVar.f51003y;
                float f89 = pointF43.x;
                android.graphics.PointF pointF44 = qkVar.f51004z;
                double d58 = f89 - pointF44.x;
                double d59 = pointF43.y - pointF44.y;
                if ((d58 * d58) + (d59 * d59) > 2500.0d) {
                    qkVar.f50996a.b();
                }
            }
            qkVar.f50996a.i(motionEvent.getX(), motionEvent.getY());
        } else {
            motionEvent2 = motionEvent;
            qkVar = this;
            qkVar.D = 0L;
            qkVar.f50997r = false;
            qkVar.f50996a.h(motionEvent.getX(), motionEvent.getY());
        }
        if (qkVar.f50997r || (gestureDetector = qkVar.E) == null) {
            return true;
        }
        gestureDetector.onTouchEvent(motionEvent2);
        return true;
    }

    private void b(com.tencent.mapsdk.internal.fb fbVar) {
        synchronized (this.f50996a) {
            this.f50996a.b(fbVar);
        }
    }

    /* loaded from: classes13.dex */
    public class a extends android.view.GestureDetector.SimpleOnGestureListener {

        /* renamed from: b, reason: collision with root package name */
        private android.graphics.PointF f51008b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f51009c;

        private a() {
            this.f51008b = new android.graphics.PointF();
            this.f51009c = true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(android.view.MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f51009c = true;
                if (com.tencent.mapsdk.internal.qk.this.E != null) {
                    com.tencent.mapsdk.internal.qk.this.E.setIsLongpressEnabled(false);
                }
                this.f51008b.set(motionEvent.getX(), motionEvent.getY());
                com.tencent.mapsdk.internal.qk.this.f50996a.e(x17, y17);
            } else if (action == 1) {
                if (this.f51009c) {
                    com.tencent.mapsdk.internal.qk.this.f50996a.a(x17, y17);
                }
                this.f51008b.set(0.0f, 0.0f);
                if (com.tencent.mapsdk.internal.qk.this.E != null) {
                    com.tencent.mapsdk.internal.qk.this.E.setIsLongpressEnabled(true);
                }
                com.tencent.mapsdk.internal.qk.this.f50996a.g(x17, y17);
            } else if (action == 2) {
                android.graphics.PointF pointF = this.f51008b;
                float f17 = x17 - pointF.x;
                float f18 = y17 - pointF.y;
                if (java.lang.Math.abs(f17) > 10.0f || java.lang.Math.abs(f18) > 10.0f) {
                    this.f51009c = false;
                    com.tencent.mapsdk.internal.qk.this.f50996a.f(x17, y17);
                }
                if (com.tencent.mapsdk.internal.qk.this.E != null) {
                    com.tencent.mapsdk.internal.qk.this.E.setIsLongpressEnabled(true);
                }
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
            com.tencent.mapsdk.internal.qk.this.f50996a.c(f17, f18);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(android.view.MotionEvent motionEvent) {
            if (com.tencent.mapsdk.internal.qk.this.f50997r) {
                return;
            }
            com.tencent.mapsdk.internal.qk.this.f50996a.d(motionEvent.getX(), motionEvent.getY());
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
            if (com.tencent.mapsdk.internal.qk.this.G != null && com.tencent.mapsdk.internal.qk.this.G.get() != null && ((com.tencent.mapsdk.internal.tz) com.tencent.mapsdk.internal.qk.this.G.get()).al()) {
                double sqrt = java.lang.Math.sqrt((f17 * f17) + (f18 * f18));
                if ((motionEvent != null && (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f)) || ((motionEvent2 != null && (motionEvent2.getX() < 0.0f || motionEvent2.getY() < 0.0f)) || sqrt > 50.0d)) {
                    return true;
                }
            }
            com.tencent.mapsdk.internal.qk.this.f50996a.a(motionEvent2, -f17, -f18);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
            com.tencent.mapsdk.internal.qk.this.f50996a.b(motionEvent.getX(), motionEvent.getY());
            return true;
        }

        public /* synthetic */ a(com.tencent.mapsdk.internal.qk qkVar, byte b17) {
            this();
        }
    }

    public final void a(com.tencent.mapsdk.internal.fb fbVar) {
        synchronized (this.f50996a) {
            this.f50996a.a(fbVar);
        }
    }

    private boolean b(float f17, float f18) {
        return a(f17, f18);
    }

    private void a(android.view.MotionEvent motionEvent) {
        double max;
        float f17;
        boolean z17;
        double max2;
        boolean z18;
        android.graphics.PointF pointF = this.f51001w;
        float f18 = pointF.x;
        android.graphics.PointF pointF2 = this.f51003y;
        float f19 = f18 - pointF2.x;
        float f27 = pointF.y - pointF2.y;
        android.graphics.PointF pointF3 = this.f51002x;
        float f28 = pointF3.x;
        android.graphics.PointF pointF4 = this.f51004z;
        float f29 = f28 - pointF4.x;
        float f37 = pointF3.y - pointF4.y;
        boolean z19 = ((double) java.lang.Math.abs(f27)) > ((double) java.lang.Math.abs(f19)) * 1.5d && ((double) java.lang.Math.abs(f37)) > ((double) java.lang.Math.abs(f29)) * 1.5d;
        boolean z27 = ((double) java.lang.Math.abs(f27)) > ((double) java.lang.Math.abs(f19)) * 1.5d && ((double) java.lang.Math.abs(f37)) > ((double) java.lang.Math.abs(f29)) * 1.5d;
        boolean z28 = ((double) java.lang.Math.abs(f19)) > ((double) java.lang.Math.abs(f27)) * 1.5d && ((double) java.lang.Math.abs(f29)) > ((double) java.lang.Math.abs(f37)) * 1.5d;
        boolean z29 = ((double) java.lang.Math.abs(f19)) > ((double) java.lang.Math.abs(f27)) * 1.5d && ((double) java.lang.Math.abs(f29)) > ((double) java.lang.Math.abs(f37)) * 1.5d;
        float f38 = f19 * f29;
        boolean z37 = f38 > 0.0f;
        float f39 = f27 * f37;
        boolean z38 = f39 > 0.0f;
        int i17 = this.f51000v;
        boolean z39 = ((i17 & 8) == 0 && (i17 & 1) == 0 && (i17 & 4) == 0) ? false : true;
        double d17 = z39 ? f50985i : 0.5d;
        if (f38 > 0.0f) {
            max = java.lang.Math.abs(f19 + f29);
        } else {
            max = java.lang.Math.max(java.lang.Math.abs(f19), java.lang.Math.abs(f29));
        }
        if (f39 > 0.0f) {
            f17 = f29;
            z17 = z19;
            max2 = java.lang.Math.abs(f27 + f37);
        } else {
            f17 = f29;
            z17 = z19;
            max2 = java.lang.Math.max(java.lang.Math.abs(f27), java.lang.Math.abs(f37));
        }
        double max3 = java.lang.Math.max(max, max2);
        boolean z47 = max3 > d17;
        boolean z48 = z47 && z37 && (z28 || z29) && this.G.get().h();
        boolean z49 = z47 && z38 && (z17 || z27) && this.G.get().j();
        android.graphics.PointF pointF5 = this.f51004z;
        float f47 = pointF5.x;
        android.graphics.PointF pointF6 = this.f51003y;
        boolean z57 = z48;
        double d18 = f47 - pointF6.x;
        double d19 = pointF5.y - pointF6.y;
        android.graphics.PointF pointF7 = this.f51002x;
        float f48 = pointF7.x;
        android.graphics.PointF pointF8 = this.f51001w;
        float f49 = f17;
        boolean z58 = z37;
        double d27 = f48 - pointF8.x;
        float f57 = pointF7.y - pointF8.y;
        boolean z59 = z49;
        double d28 = f57;
        double sqrt = java.lang.Math.sqrt((d18 * d18) + (d19 * d19));
        double sqrt2 = java.lang.Math.sqrt((d27 * d27) + (d28 * d28));
        double d29 = sqrt * sqrt2;
        double d37 = ((d18 * d27) + (d19 * d28)) / d29;
        double acos = (java.lang.Math.acos(d37) * 180.0d) / 3.141592653589793d;
        if ((d18 * d28) - (d19 * d27) < 0.0d) {
            acos = -acos;
        }
        boolean z66 = java.lang.Math.abs(d37) < ((double) f50992p);
        double d38 = (this.f51000v & 2) == 0 ? f50981e : 0.5d;
        double abs = java.lang.Math.abs(acos);
        boolean z67 = d29 > 0.0d && z66 && java.lang.Math.abs(acos) > d38 && this.G.get().k();
        double d39 = sqrt2 / sqrt;
        double d47 = z39 ? f50984h : f50983g;
        double d48 = d39 - 1.0d;
        double d49 = acos;
        double abs2 = java.lang.Math.abs(d48);
        boolean z68 = sqrt > 0.0d && abs2 > d47 && this.G.get().i();
        boolean z69 = z68;
        boolean z76 = z47;
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("trace-gesture", "began:" + z47 + ":" + z68 + ":" + z67, "value:" + max3 + ":" + abs2 + ":" + abs);
        boolean z77 = z67 ? false : z76;
        if (z59) {
            z67 = false;
            z18 = false;
            z57 = false;
        } else {
            z18 = z69;
        }
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("beganMove:".concat(java.lang.String.valueOf(z77)), "vertical:".concat(java.lang.String.valueOf(z38)), "horizontal:".concat(java.lang.String.valueOf(z58)), "verticalMove:".concat(java.lang.String.valueOf(z59)), "horizontalMove:".concat(java.lang.String.valueOf(z57)));
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("beganRotate:".concat(java.lang.String.valueOf(z67)), "cosValue : ".concat(java.lang.String.valueOf(d37)), "cosAngle : ".concat(java.lang.String.valueOf(z66)), "angle:".concat(java.lang.String.valueOf(d49)), "rotateJudge : ".concat(java.lang.String.valueOf(d38)));
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("beganScale:".concat(java.lang.String.valueOf(z18)), "d1:".concat(java.lang.String.valueOf(sqrt)), "scale - 1 = " + java.lang.Math.abs(d48), "scaleJudge : ".concat(java.lang.String.valueOf(d47)));
        if (z77) {
            if (z57) {
                this.f51000v |= 8;
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("MT_INTENT_MOVE");
                this.f50996a.a(motionEvent, (f19 + f49) / 2.0f, (f27 + f37) / 2.0f);
            }
            if (z59) {
                this.f51000v |= 1;
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("MT_INTENT_MOVE_VERTICAL");
                android.graphics.PointF pointF9 = this.f51003y;
                android.graphics.PointF pointF10 = this.f51001w;
                pointF9.set(pointF10.x, pointF10.y);
                android.graphics.PointF pointF11 = this.f51004z;
                android.graphics.PointF pointF12 = this.f51002x;
                pointF11.set(pointF12.x, pointF12.y);
                this.f50996a.a(java.lang.Math.abs(f27) > java.lang.Math.abs(f37) ? f27 : f37);
            }
        }
        if (z67) {
            this.f51000v |= 2;
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("MT_INTENT_ROTATE");
            if (z58 && !this.G.get().h()) {
                android.graphics.PointF pointF13 = this.f51003y;
                android.graphics.PointF pointF14 = this.f51001w;
                pointF13.set(pointF14.x, pointF14.y);
                android.graphics.PointF pointF15 = this.f51004z;
                android.graphics.PointF pointF16 = this.f51002x;
                pointF15.set(pointF16.x, pointF16.y);
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("NO_HORIZONAL_ROTATE");
                return;
            }
            android.graphics.PointF pointF17 = this.f51004z;
            android.graphics.PointF pointF18 = this.f51003y;
            android.graphics.PointF pointF19 = this.f51002x;
            android.graphics.PointF pointF20 = this.f51001w;
            float f58 = pointF18.x;
            float f59 = pointF17.x;
            android.graphics.PointF pointF21 = null;
            if (f58 != f59) {
                float f66 = pointF20.x;
                float f67 = pointF19.x;
                if (f66 != f67) {
                    float f68 = pointF18.y;
                    float f69 = pointF17.y;
                    float f76 = (f68 - f69) / (f58 - f59);
                    float f77 = pointF20.y;
                    float f78 = pointF19.y;
                    float f79 = (f77 - f78) / (f66 - f67);
                    if (f76 != f79) {
                        float f86 = ((f78 * f66) - (f77 * f67)) / (f66 - f67);
                        float f87 = (f86 - (((f69 * f58) - (f68 * f59)) / (f58 - f59))) / (f76 - f79);
                        pointF21 = new android.graphics.PointF(f87, (f79 * f87) + f86);
                    }
                }
            }
            if (pointF21 == null ? false : a(pointF21.x, pointF21.y)) {
                com.tencent.mapsdk.internal.bd bdVar = this.F;
                this.C.set(bdVar == null ? 0 : bdVar.j().width() / 2, this.F == null ? 0 : r3.j().height() / 2);
                com.tencent.mapsdk.internal.ql qlVar = this.f50996a;
                android.graphics.PointF pointF22 = this.C;
                qlVar.a(pointF22, pointF22, (float) d49);
            } else {
                android.graphics.PointF pointF23 = this.A;
                android.graphics.PointF pointF24 = this.f51003y;
                float f88 = pointF24.x;
                android.graphics.PointF pointF25 = this.f51004z;
                pointF23.set((f88 + pointF25.x) / 2.0f, (pointF24.y + pointF25.y) / 2.0f);
                android.graphics.PointF pointF26 = this.B;
                android.graphics.PointF pointF27 = this.f51001w;
                float f89 = pointF27.x;
                android.graphics.PointF pointF28 = this.f51002x;
                pointF26.set((f89 + pointF28.x) / 2.0f, (pointF27.y + pointF28.y) / 2.0f);
                this.f50996a.a(this.A, this.B, (float) d49);
            }
        }
        if (z18) {
            this.f51000v |= 4;
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("MT_INTENT_SCALE");
            if (z58 && !this.G.get().h()) {
                android.graphics.PointF pointF29 = this.f51003y;
                android.graphics.PointF pointF30 = this.f51001w;
                pointF29.set(pointF30.x, pointF30.y);
                android.graphics.PointF pointF31 = this.f51004z;
                android.graphics.PointF pointF32 = this.f51002x;
                pointF31.set(pointF32.x, pointF32.y);
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50220u).a("NO_HORIZONAL_SCALE");
                return;
            }
            android.graphics.PointF pointF33 = this.A;
            android.graphics.PointF pointF34 = this.f51003y;
            float f96 = pointF34.x;
            android.graphics.PointF pointF35 = this.f51004z;
            pointF33.set((f96 + pointF35.x) / 2.0f, (pointF34.y + pointF35.y) / 2.0f);
            android.graphics.PointF pointF36 = this.B;
            android.graphics.PointF pointF37 = this.f51001w;
            float f97 = pointF37.x;
            android.graphics.PointF pointF38 = this.f51002x;
            pointF36.set((f97 + pointF38.x) / 2.0f, (pointF37.y + pointF38.y) / 2.0f);
            this.f50996a.a(this.A, this.B, sqrt, sqrt2);
        }
        android.graphics.PointF pointF39 = this.f51003y;
        android.graphics.PointF pointF40 = this.f51001w;
        pointF39.set(pointF40.x, pointF40.y);
        android.graphics.PointF pointF41 = this.f51004z;
        android.graphics.PointF pointF42 = this.f51002x;
        pointF41.set(pointF42.x, pointF42.y);
    }

    private boolean b() {
        android.graphics.PointF pointF = this.f51003y;
        float f17 = pointF.x;
        android.graphics.PointF pointF2 = this.f51004z;
        double d17 = f17 - pointF2.x;
        double d18 = pointF.y - pointF2.y;
        return (d17 * d17) + (d18 * d18) > 2500.0d;
    }

    private boolean a() {
        android.graphics.PointF pointF = this.f51004z;
        android.graphics.PointF pointF2 = this.f51003y;
        android.graphics.PointF pointF3 = this.f51002x;
        android.graphics.PointF pointF4 = this.f51001w;
        float f17 = pointF2.x;
        float f18 = pointF.x;
        android.graphics.PointF pointF5 = null;
        if (f17 != f18) {
            float f19 = pointF4.x;
            float f27 = pointF3.x;
            if (f19 != f27) {
                float f28 = pointF2.y;
                float f29 = pointF.y;
                float f37 = (f28 - f29) / (f17 - f18);
                float f38 = pointF4.y;
                float f39 = pointF3.y;
                float f47 = (f38 - f39) / (f19 - f27);
                if (f37 != f47) {
                    float f48 = ((f39 * f19) - (f38 * f27)) / (f19 - f27);
                    float f49 = (f48 - (((f29 * f17) - (f28 * f18)) / (f17 - f18))) / (f37 - f47);
                    pointF5 = new android.graphics.PointF(f49, (f47 * f49) + f48);
                }
            }
        }
        if (pointF5 == null) {
            return false;
        }
        return a(pointF5.x, pointF5.y);
    }

    private boolean a(float f17, float f18) {
        com.tencent.mapsdk.internal.bd bdVar = this.F;
        int width = bdVar == null ? 0 : bdVar.j().width() / 2;
        com.tencent.mapsdk.internal.bd bdVar2 = this.F;
        int height = bdVar2 == null ? 0 : bdVar2.j().height() / 2;
        float width2 = this.F == null ? 0.0f : r3.j().width() / 3.0f;
        com.tencent.mapsdk.internal.bd bdVar3 = this.F;
        return java.lang.Math.abs(f17 - ((float) width)) < width2 && java.lang.Math.abs(f18 - ((float) height)) < (bdVar3 != null ? ((float) bdVar3.j().height()) / 3.0f : 0.0f);
    }

    private static void a(android.graphics.PointF pointF, android.graphics.PointF pointF2, android.view.MotionEvent motionEvent) {
        try {
            float x17 = motionEvent.getX(0);
            float x18 = motionEvent.getX(1);
            float y17 = motionEvent.getY(0);
            float y18 = motionEvent.getY(1);
            pointF.set(x17, y17);
            pointF2.set(x18, y18);
        } catch (java.lang.Exception unused) {
        }
    }
}
