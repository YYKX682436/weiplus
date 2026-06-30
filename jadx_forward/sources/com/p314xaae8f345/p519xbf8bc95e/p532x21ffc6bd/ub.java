package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ub extends android.view.View implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu {

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f133919a;

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f133920b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.Object f133921c;

    /* renamed from: d, reason: collision with root package name */
    private int f133922d;

    /* renamed from: e, reason: collision with root package name */
    private int f133923e;

    /* renamed from: f, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq f133924f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f133925g;

    public ub(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar) {
        super(bdVar.mo36630x76847179());
        this.f133925g = true;
        java.lang.Object l17 = bdVar.l();
        if (l17 == null) {
            return;
        }
        this.f133919a = bdVar.mo36630x76847179();
        this.f133920b = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) bdVar.d();
        this.f133921c = l17;
        this.f133922d = bdVar.m();
        int n17 = bdVar.n();
        this.f133923e = n17;
        if (n17 <= 0 || this.f133922d <= 0) {
            this.f133922d = 0;
            this.f133923e = 0;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq tqVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq(this.f133920b);
        this.f133924f = tqVar;
        tqVar.a(this.f133921c);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq.a(bdVar.p());
        this.f133924f.f133697a = bdVar.r();
        this.f133924f.start();
    }

    private void f() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133920b;
        if (trVar == null || !this.f133925g) {
            return;
        }
        trVar.a((javax.microedition.khronos.opengles.GL10) null, (javax.microedition.khronos.egl.EGLConfig) null);
        this.f133920b.a((javax.microedition.khronos.opengles.GL10) null, this.f133922d, this.f133923e);
        this.f133920b.e(this.f133922d, this.f133923e);
        this.f133925g = false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void a() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq tqVar = this.f133924f;
        if (tqVar != null) {
            tqVar.b();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133920b;
        if (trVar == null || !this.f133925g) {
            return;
        }
        trVar.a((javax.microedition.khronos.opengles.GL10) null, (javax.microedition.khronos.egl.EGLConfig) null);
        this.f133920b.a((javax.microedition.khronos.opengles.GL10) null, this.f133922d, this.f133923e);
        this.f133920b.e(this.f133922d, this.f133923e);
        this.f133925g = false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq tqVar = this.f133924f;
        if (tqVar != null) {
            tqVar.a();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq tqVar = this.f133924f;
        if (tqVar != null) {
            tqVar.c();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq tqVar = this.f133924f;
        if (tqVar != null) {
            synchronized (tqVar) {
                this.f133924f.notify();
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final boolean e() {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: getMapHeight */
    public final int mo36661x223a1eed() {
        return this.f133923e;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: getMapWidth */
    public final int mo36662x8610cf40() {
        return this.f133922d;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: getView */
    public final android.view.View mo36663xfb86a31b() {
        return this;
    }

    @Override // android.view.View, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133920b;
        if (trVar != null) {
            this.f133922d = i17;
            this.f133923e = i18;
            trVar.a((javax.microedition.khronos.opengles.GL10) null, i17, i18);
            this.f133920b.e(i17, i18);
            this.f133920b.H();
            this.f133925g = true;
        }
    }

    @Override // android.view.View, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: setMapOpaque */
    public final void mo36664x8b17525b(boolean z17) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: setZOrderMediaOverlay */
    public final void mo36665xe5e6c0e2(boolean z17) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void a(java.lang.Object obj, int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq tqVar;
        if (this.f133920b == null || (tqVar = this.f133924f) == null || !tqVar.isAlive()) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq tqVar2 = this.f133924f;
        if (tqVar2 != null) {
            this.f133921c = obj;
            tqVar2.a(obj);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133920b;
        if (trVar != null) {
            trVar.a((javax.microedition.khronos.opengles.GL10) null, (javax.microedition.khronos.egl.EGLConfig) null);
            this.f133920b.a((javax.microedition.khronos.opengles.GL10) null, i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void a(float f17) {
        if (this.f133924f != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tq.a(f17);
        }
    }
}
