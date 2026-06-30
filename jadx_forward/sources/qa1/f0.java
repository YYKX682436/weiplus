package qa1;

/* loaded from: classes14.dex */
public class f0 implements qa1.n {

    /* renamed from: d, reason: collision with root package name */
    public final qa1.p f442516d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f442517e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f442518f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f442519g;

    /* renamed from: h, reason: collision with root package name */
    public rs0.h f442520h;

    /* renamed from: i, reason: collision with root package name */
    public ms0.c f442521i;

    /* renamed from: m, reason: collision with root package name */
    public ft0.d f442522m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f442523n = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    public ms0.c f442524o = null;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f442525p = false;

    public f0(qa1.p pVar) {
        this.f442516d = pVar;
    }

    @Override // qa1.n
    public void A(android.view.SurfaceHolder surfaceHolder, qa1.o oVar) {
        try {
            this.f442524o = new qa1.x(this, 1, 2);
            mo159668xea80abe9(new qa1.y(this, 1, 2));
            a(new qa1.z(this, surfaceHolder, oVar));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: onSurfaceTextureAvailable, error:" + e17.getMessage());
            this.f442516d.b(oVar);
        }
    }

    public void a(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread().getId() == this.f442517e.getId()) {
            runnable.run();
        } else {
            this.f442518f.mo50293x3498a0(runnable);
        }
    }

    @Override // qa1.n
    public boolean g(int i17) {
        if (!this.f442525p) {
            return false;
        }
        int i18 = qa1.p.f442543p;
        if ((i17 & 1) > 0) {
            return !((i17 & 2) > 0);
        }
        return false;
    }

    @Override // qa1.u
    /* renamed from: getAbsSurfaceRenderer */
    public ms0.c mo159658xb03c03b4() {
        return this.f442524o;
    }

    @Override // qa1.u
    /* renamed from: getEGLContext */
    public android.opengl.EGLContext mo159659xe0fe423b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "getEGLContext environment:" + this.f442520h);
        rs0.h hVar = this.f442520h;
        if (hVar == null) {
            return null;
        }
        return hVar.f480827c;
    }

    @Override // qa1.u
    /* renamed from: getPreviewTextureId */
    public int mo159660x174e6824() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "getPreviewTextureId previewController:" + this.f442522m.c());
        ft0.d dVar = this.f442522m;
        if (dVar == null || dVar.c() == null) {
            return -1;
        }
        return this.f442522m.c().f375928e;
    }

    @Override // qa1.u
    /* renamed from: getSurfaceHeight */
    public int mo159661xc2fc307e() {
        return this.f442516d.f442548n;
    }

    @Override // qa1.n
    /* renamed from: getSurfaceTexture */
    public java.lang.Object mo159662x182e20a4() {
        return this.f442522m.b();
    }

    @Override // qa1.u
    /* renamed from: getSurfaceWidth */
    public int mo159663x40edc78f() {
        return this.f442516d.f442547m;
    }

    @Override // qa1.n
    /* renamed from: init */
    public void mo159664x316510() {
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("GameTextureView_renderThread", -2);
        this.f442517e = a17;
        a17.start();
        this.f442518f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f442517e.getLooper());
    }

    @Override // qa1.u
    /* renamed from: isAvailable */
    public boolean mo159665x1a7eccbf() {
        return this.f442516d.f442546i;
    }

    @Override // et0.r
    public void l(yz5.a aVar) {
        a(new qa1.e0(this, aVar));
    }

    @Override // qa1.n
    public void p(android.view.SurfaceHolder surfaceHolder, qa1.o oVar, boolean z17) {
        ms0.c cVar = this.f442524o;
        if (cVar != null) {
            cVar.n(false);
        }
        a(new qa1.b0(this, oVar));
    }

    @Override // qa1.n
    public void r(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19, qa1.o oVar) {
        a(new qa1.a0(this, i18, i19, surfaceHolder, i17, oVar));
    }

    @Override // et0.r
    /* renamed from: requestRender */
    public void mo46859x511cb905() {
        a(new qa1.d0(this));
    }

    @Override // qa1.u
    /* renamed from: setOnSurfaceTextureAvailableDelegate */
    public void mo159666x86d373f(qa1.t tVar) {
        if (this.f442523n.get()) {
            tVar.a(this.f442522m.b());
        }
    }

    @Override // qa1.u
    /* renamed from: setOnTextureDrawFinishDelegate */
    public void mo159667x4c5d7736(yz5.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "setOnTextureDrawFinishDelegate:");
        this.f442522m.f347997e = lVar;
    }

    @Override // qa1.u
    /* renamed from: setPreviewRenderer */
    public void mo159668xea80abe9(ms0.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "setRenderer: %d", java.lang.Integer.valueOf(cVar.hashCode()));
        ft0.d dVar = this.f442522m;
        if (dVar != null) {
            dVar.g(true, false);
            this.f442522m = new ft0.h(this);
        }
        ft0.h hVar = new ft0.h(this);
        this.f442522m = hVar;
        hVar.i(cVar);
        a(new qa1.c0(this, cVar));
    }
}
