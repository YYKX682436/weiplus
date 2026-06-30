package qa1;

/* loaded from: classes14.dex */
public abstract class h extends gh.k implements qa1.u {

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f442527g;

    /* renamed from: h, reason: collision with root package name */
    public rs0.h f442528h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.HandlerThread f442529i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f442530m;

    /* renamed from: n, reason: collision with root package name */
    public ms0.c f442531n;

    /* renamed from: o, reason: collision with root package name */
    public ft0.d f442532o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f442533p;

    public h(android.content.Context context) {
        super(context);
        this.f442533p = new java.util.concurrent.atomic.AtomicBoolean(false);
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("GameTextureView_renderThread", -2);
        this.f442529i = a17;
        a17.start();
        this.f442530m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f442529i.getLooper());
    }

    public static /* synthetic */ boolean a(qa1.h hVar, android.graphics.SurfaceTexture surfaceTexture) {
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return false;
    }

    public void d(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread().getId() == this.f442529i.getId()) {
            runnable.run();
        } else {
            this.f442530m.mo50293x3498a0(runnable);
        }
    }

    @Override // qa1.u
    /* renamed from: getAbsSurfaceRenderer */
    public abstract /* synthetic */ ms0.c mo159658xb03c03b4();

    @Override // qa1.u
    /* renamed from: getEGLContext */
    public android.opengl.EGLContext mo159659xe0fe423b() {
        rs0.h hVar = this.f442528h;
        if (hVar == null) {
            return null;
        }
        return hVar.f480827c;
    }

    @Override // qa1.u
    /* renamed from: getPreviewTextureId */
    public int mo159660x174e6824() {
        ft0.d dVar = this.f442532o;
        if (dVar == null || dVar.c() == null) {
            return -1;
        }
        return this.f442532o.c().f375928e;
    }

    @Override // qa1.u
    /* renamed from: getSurfaceHeight */
    public abstract /* synthetic */ int mo159661xc2fc307e();

    @Override // qa1.u
    /* renamed from: getSurfaceWidth */
    public abstract /* synthetic */ int mo159663x40edc78f();

    @Override // et0.r
    public void l(yz5.a aVar) {
        if (java.lang.Thread.currentThread().getId() == this.f442529i.getId()) {
            aVar.mo152xb9724478();
        } else {
            this.f442530m.mo50293x3498a0(new qa1.b(this, aVar));
        }
    }

    @Override // gh.k, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureAvailable, surfaceTexture:%s, width:%d, height:%d", surfaceTexture, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        d(new qa1.c(this, i17, i18, surfaceTexture));
    }

    @Override // gh.k, android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureDestroyed");
        d(new qa1.g(this));
        return false;
    }

    @Override // gh.k, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureSizeChanged, surfaceTexture:%s, width:%d, height:%d", surfaceTexture, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        d(new qa1.d(this, i17, i18));
    }

    @Override // et0.r
    /* renamed from: requestRender */
    public void mo46859x511cb905() {
        d(new qa1.f(this));
    }

    @Override // qa1.u
    /* renamed from: setOnSurfaceTextureAvailableDelegate */
    public void mo159666x86d373f(qa1.t tVar) {
        if (this.f442533p.get()) {
            tVar.a(this.f442532o.b());
        }
    }

    @Override // qa1.u
    /* renamed from: setOnTextureDrawFinishDelegate */
    public void mo159667x4c5d7736(yz5.l lVar) {
        this.f442532o.f347997e = lVar;
    }

    @Override // qa1.u
    /* renamed from: setPreviewRenderer */
    public void mo159668xea80abe9(ms0.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewGLTextureView", "setRenderer: %d", java.lang.Integer.valueOf(cVar.hashCode()));
        ft0.d dVar = this.f442532o;
        if (dVar != null) {
            dVar.g(true, false);
            this.f442532o = new ft0.h(this);
        }
        ft0.h hVar = new ft0.h(this);
        this.f442532o = hVar;
        hVar.i(cVar);
        d(new qa1.e(this, cVar));
    }
}
