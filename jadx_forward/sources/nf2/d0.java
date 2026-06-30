package nf2;

/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final nf2.e1 f418199a;

    /* renamed from: b, reason: collision with root package name */
    public final nf2.g0 f418200b;

    /* renamed from: c, reason: collision with root package name */
    public final nf2.f1 f418201c;

    /* renamed from: d, reason: collision with root package name */
    public float f418202d;

    /* renamed from: e, reason: collision with root package name */
    public float f418203e;

    /* renamed from: f, reason: collision with root package name */
    public float f418204f;

    /* renamed from: g, reason: collision with root package name */
    public float f418205g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f418206h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f418207i;

    /* renamed from: j, reason: collision with root package name */
    public final android.os.Handler f418208j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Runnable f418209k;

    /* renamed from: l, reason: collision with root package name */
    public nf2.x f418210l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f418211m;

    public d0(nf2.e1 viewProvider, nf2.g0 positionManager, nf2.f1 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewProvider, "viewProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(positionManager, "positionManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f418199a = viewProvider;
        this.f418200b = positionManager;
        this.f418201c = config;
        this.f418207i = true;
        this.f418208j = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final void a() {
        java.lang.Runnable runnable = this.f418209k;
        if (runnable != null) {
            this.f418208j.removeCallbacks(runnable);
        }
        this.f418209k = null;
    }

    public final void b(float f17, float f18) {
        this.f418206h = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLyricsGestureHelper", "exitDragMode: position=(" + f17 + ", " + f18 + ')');
        nf2.x xVar = this.f418210l;
        if (xVar != null) {
            nf2.w wVar = ((nf2.b) xVar).f418189a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = wVar.f372632e;
            if (ubVar != null) {
                ubVar.mo57727x9929ae66(0.3f, 1.0f);
            }
            float f19 = 100;
            int f27 = e06.p.f((int) (f17 * f19), 0, 100);
            int f28 = e06.p.f((int) (f18 * f19), 0, 100);
            mm2.m6 Z6 = wVar.Z6();
            Z6.getClass();
            Z6.A = e06.p.f(f27, 0, 100);
            Z6.B = e06.p.f(f28, 0, 100);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(wVar.Z6().A);
            sb6.append('#');
            sb6.append(wVar.Z6().B);
            te2.a9.f499416a.e(1, sb6.toString());
        }
    }

    public final android.view.View c() {
        nf2.e1 e1Var = this.f418199a;
        nf2.d1 d1Var = (nf2.d1) e1Var;
        android.view.View view = d1Var.f418219g;
        if (view == null) {
            view = d1Var.f418218f;
        }
        return view == null ? ((nf2.d1) e1Var).f418218f : view;
    }

    public final boolean d(android.view.MotionEvent motionEvent, android.view.View view) {
        android.view.View view2;
        if (!this.f418207i || (view2 = ((nf2.d1) this.f418199a).f418218f) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            nf2.g0 g0Var = this.f418200b;
            if (action == 1) {
                double sqrt = java.lang.Math.sqrt(java.lang.Math.pow(motionEvent.getRawX() - this.f418204f, 2.0d) + java.lang.Math.pow(motionEvent.getRawY() - this.f418205g, 2.0d));
                a();
                if (this.f418206h) {
                    jz5.l c17 = g0Var.c();
                    yz5.p pVar = this.f418211m;
                    java.lang.Object obj = c17.f384367e;
                    java.lang.Object obj2 = c17.f384366d;
                    if (pVar != null) {
                        pVar.mo149xb9724478(obj2, obj);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLyricsGestureHelper", "position saved: " + c17);
                    b(((java.lang.Number) obj2).floatValue(), ((java.lang.Number) obj).floatValue());
                } else if (sqrt < 10.0d && view != null) {
                    view.performClick();
                }
            } else if (action != 2) {
                if (action == 3) {
                    a();
                    if (this.f418206h) {
                        jz5.l c18 = g0Var.c();
                        yz5.p pVar2 = this.f418211m;
                        java.lang.Object obj3 = c18.f384367e;
                        java.lang.Object obj4 = c18.f384366d;
                        if (pVar2 != null) {
                            pVar2.mo149xb9724478(obj4, obj3);
                        }
                        b(((java.lang.Number) obj4).floatValue(), ((java.lang.Number) obj3).floatValue());
                    }
                }
            } else {
                if (java.lang.Math.sqrt(java.lang.Math.pow(motionEvent.getRawX() - this.f418204f, 2.0d) + java.lang.Math.pow(motionEvent.getRawY() - this.f418205g, 2.0d)) > 10.0d && !this.f418206h) {
                    a();
                    return true;
                }
                if (this.f418206h) {
                    float rawX = motionEvent.getRawX() - this.f418202d;
                    float rawY = motionEvent.getRawY() - this.f418203e;
                    android.view.View b17 = g0Var.b();
                    if (b17 != null) {
                        jz5.l a17 = g0Var.a(rawX, rawY);
                        b17.setX(((java.lang.Number) a17.f384366d).floatValue());
                        b17.setY(((java.lang.Number) a17.f384367e).floatValue());
                    }
                    jz5.l c19 = g0Var.c();
                    nf2.x xVar = this.f418210l;
                    java.lang.Object obj5 = c19.f384367e;
                    java.lang.Object obj6 = c19.f384366d;
                    if (xVar != null) {
                        float floatValue = ((java.lang.Number) obj6).floatValue();
                        float floatValue2 = ((java.lang.Number) obj5).floatValue();
                        float f17 = 100;
                        int f18 = e06.p.f((int) (floatValue * f17), 0, 100);
                        int f19 = e06.p.f((int) (floatValue2 * f17), 0, 100);
                        mm2.m6 Z6 = ((nf2.b) xVar).f418189a.Z6();
                        Z6.getClass();
                        Z6.A = e06.p.f(f18, 0, 100);
                        Z6.B = e06.p.f(f19, 0, 100);
                    }
                    yz5.p pVar3 = this.f418211m;
                    if (pVar3 != null) {
                        pVar3.mo149xb9724478(obj6, obj5);
                    }
                }
            }
        } else {
            this.f418204f = motionEvent.getRawX();
            this.f418205g = motionEvent.getRawY();
            this.f418202d = motionEvent.getRawX() - view2.getX();
            this.f418203e = motionEvent.getRawY() - view2.getY();
            nf2.y yVar = new nf2.y(this);
            this.f418209k = yVar;
            this.f418208j.postDelayed(yVar, this.f418201c.f418255d);
        }
        return true;
    }

    public final void e() {
        a();
        this.f418208j.removeCallbacksAndMessages(null);
        this.f418210l = null;
        this.f418211m = null;
        this.f418206h = false;
        android.view.View c17 = c();
        if (c17 != null) {
            c17.setOnTouchListener(null);
        }
        android.view.View view = ((nf2.d1) this.f418199a).f418229q;
        if (view != null) {
            view.setOnTouchListener(null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLyricsGestureHelper", "release");
    }
}
