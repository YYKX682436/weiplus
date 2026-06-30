package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3;

/* renamed from: io.flutter.embedding.engine.renderer.SurfaceTextureSurfaceProducer */
/* loaded from: classes15.dex */
final class C28649xf77765b1 implements io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.GLTextureConsumer {

    /* renamed from: flutterJNI */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f71270x2014a1e9;

    /* renamed from: handler */
    private final android.os.Handler f71271x294b574a;

    /* renamed from: id, reason: collision with root package name */
    private final long f374765id;

    /* renamed from: released */
    private boolean f71272xdf23d93d;

    /* renamed from: requestBufferWidth */
    private int f71273xe25d2757;

    /* renamed from: requestedBufferHeight */
    private int f71274x40531815;

    /* renamed from: surface */
    private android.view.Surface f71275x9189ecad;

    /* renamed from: texture */
    private final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry f71276xab7dd51b;

    public C28649xf77765b1(long j17, android.os.Handler handler, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry) {
        this.f374765id = j17;
        this.f71271x294b574a = handler;
        this.f71270x2014a1e9 = c28586x96e67e09;
        this.f71276xab7dd51b = surfaceTextureEntry;
    }

    /* renamed from: createSurface */
    public android.view.Surface m138130x17711011(android.graphics.SurfaceTexture surfaceTexture) {
        return new android.view.Surface(surfaceTexture);
    }

    /* renamed from: finalize */
    public void m138131xd764dc1e() {
        try {
            if (this.f71272xdf23d93d) {
                return;
            }
            mo138094x41012807();
            this.f71271x294b574a.post(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.TextureFinalizerRunnable(this.f374765id, this.f71270x2014a1e9));
        } finally {
            super.finalize();
        }
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
    /* renamed from: getForcedNewSurface */
    public android.view.Surface mo138082xadc3e21c() {
        this.f71275x9189ecad = null;
        return mo138084xcf572877();
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
    /* renamed from: getHeight */
    public int mo138083x1c4fb41d() {
        return this.f71274x40531815;
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
    /* renamed from: getSurface */
    public android.view.Surface mo138084xcf572877() {
        android.view.Surface surface = this.f71275x9189ecad;
        if (surface == null || !surface.isValid()) {
            this.f71275x9189ecad = m138130x17711011(this.f71276xab7dd51b.mo138117x299653ae());
        }
        return this.f71275x9189ecad;
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.GLTextureConsumer
    /* renamed from: getSurfaceTexture */
    public android.graphics.SurfaceTexture mo138132x182e20a4() {
        return this.f71276xab7dd51b.mo138117x299653ae();
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
    /* renamed from: getWidth */
    public int mo138085x755bd410() {
        return this.f71273xe25d2757;
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
    /* renamed from: handlesCropAndRotation */
    public boolean mo138086xf2ff5afa() {
        return true;
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry
    public long id() {
        return this.f374765id;
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry
    /* renamed from: release */
    public void mo138094x41012807() {
        this.f71276xab7dd51b.mo138094x41012807();
        android.view.Surface surface = this.f71275x9189ecad;
        if (surface != null) {
            surface.release();
            this.f71275x9189ecad = null;
        }
        this.f71272xdf23d93d = true;
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
    /* renamed from: scheduleFrame */
    public void mo138095x62a02d16() {
        this.f71270x2014a1e9.m137695xc1a8dd0a(this.f374765id);
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
    /* renamed from: setCallback */
    public void mo138096x6c4ebec7(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer.Callback callback) {
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry
    /* renamed from: setOnFrameAvailableListener */
    public void mo138097xdd9eabf1(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameAvailableListener onFrameAvailableListener) {
        this.f71276xab7dd51b.mo138097xdd9eabf1(onFrameAvailableListener);
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
    /* renamed from: setSize */
    public void mo138098x76500f83(int i17, int i18) {
        this.f71273xe25d2757 = i17;
        this.f71274x40531815 = i18;
        mo138132x182e20a4().setDefaultBufferSize(i17, i18);
    }
}
