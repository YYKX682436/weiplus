package qa1;

/* loaded from: classes14.dex */
public class p extends gh.j implements qa1.u {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f442543p = 0;

    /* renamed from: g, reason: collision with root package name */
    public qa1.n f442544g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.SurfaceHolder f442545h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f442546i;

    /* renamed from: m, reason: collision with root package name */
    public int f442547m;

    /* renamed from: n, reason: collision with root package name */
    public int f442548n;

    /* renamed from: o, reason: collision with root package name */
    public int f442549o;

    public p(android.content.Context context) {
        super(context);
        this.f442545h = null;
        this.f442546i = false;
        this.f442547m = 0;
        this.f442548n = 0;
        this.f442549o = 0;
        qa1.a aVar = new qa1.a(this);
        this.f442544g = aVar;
        aVar.mo159664x316510();
    }

    public void b(qa1.o oVar) {
        if (oVar != null) {
            post(new qa1.i(this, oVar));
        }
    }

    public java.lang.Object c() {
        return super.mo131548x182e20a4();
    }

    public void d(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        super.surfaceChanged(surfaceHolder, i17, i18, i19);
    }

    public void e(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
    }

    public void f(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
    }

    @Override // qa1.u
    /* renamed from: getAbsSurfaceRenderer */
    public ms0.c mo159658xb03c03b4() {
        return this.f442544g.mo159658xb03c03b4();
    }

    @Override // qa1.u
    /* renamed from: getEGLContext */
    public android.opengl.EGLContext mo159659xe0fe423b() {
        return this.f442544g.mo159659xe0fe423b();
    }

    @Override // qa1.u
    /* renamed from: getPreviewTextureId */
    public int mo159660x174e6824() {
        return this.f442544g.mo159660x174e6824();
    }

    @Override // qa1.u
    /* renamed from: getSurfaceHeight */
    public int mo159661xc2fc307e() {
        return this.f442548n;
    }

    @Override // gh.j
    /* renamed from: getSurfaceTexture */
    public java.lang.Object mo131548x182e20a4() {
        return this.f442544g.mo159662x182e20a4();
    }

    @Override // qa1.u
    /* renamed from: getSurfaceWidth */
    public int mo159663x40edc78f() {
        return this.f442547m;
    }

    @Override // qa1.u
    /* renamed from: isAvailable */
    public boolean mo159665x1a7eccbf() {
        return this.f442546i;
    }

    @Override // et0.r
    public void l(yz5.a aVar) {
        this.f442544g.l(aVar);
    }

    @Override // gh.j, gh.r
    public void n(boolean z17, int i17, yz5.l lVar, com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83) {
        post(new qa1.m(this, i17, z17, lVar, abstractC4208x204d5c83));
    }

    @Override // et0.r
    /* renamed from: requestRender */
    public void mo46859x511cb905() {
        this.f442544g.mo46859x511cb905();
    }

    @Override // qa1.u
    /* renamed from: setOnSurfaceTextureAvailableDelegate */
    public void mo159666x86d373f(qa1.t tVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameGLSurfaceView", "setOnSurfaceTextureAvailableDelegate:");
        this.f442544g.mo159666x86d373f(tVar);
    }

    @Override // qa1.u
    /* renamed from: setOnTextureDrawFinishDelegate */
    public void mo159667x4c5d7736(yz5.l lVar) {
        this.f442544g.mo159667x4c5d7736(lVar);
    }

    @Override // qa1.u
    /* renamed from: setPreviewRenderer */
    public void mo159668xea80abe9(ms0.c cVar) {
        this.f442544g.mo159668xea80abe9(cVar);
    }

    @Override // gh.j, android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameGLSurfaceView", "surfaceChanged %s", surfaceHolder);
        synchronized (this) {
            this.f442549o = i17;
            this.f442547m = i18;
            this.f442548n = i19;
            this.f442545h = surfaceHolder;
        }
        this.f442544g.r(surfaceHolder, i17, i18, i19, null);
    }

    @Override // gh.j, android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameGLSurfaceView", "surfaceCreated %s", surfaceHolder);
        synchronized (this) {
            this.f442545h = surfaceHolder;
        }
        this.f442544g.A(surfaceHolder, null);
        synchronized (this) {
            this.f442546i = true;
        }
    }

    @Override // gh.j, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameGLSurfaceView", "surfaceDestroyed, holder:" + surfaceHolder);
        synchronized (this) {
            this.f442545h = surfaceHolder;
        }
        this.f442544g.p(surfaceHolder, null, false);
        synchronized (this) {
            this.f442546i = false;
        }
    }
}
