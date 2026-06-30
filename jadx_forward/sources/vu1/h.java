package vu1;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f521722a;

    /* renamed from: b, reason: collision with root package name */
    public final int f521723b;

    /* renamed from: c, reason: collision with root package name */
    public final int f521724c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.Surface f521725d;

    /* renamed from: e, reason: collision with root package name */
    public vu1.c f521726e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f521727f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.HandlerThread f521728g;

    /* renamed from: h, reason: collision with root package name */
    public vu1.b f521729h;

    /* renamed from: i, reason: collision with root package name */
    public os0.c f521730i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.SurfaceTexture f521731j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.Surface f521732k;

    /* renamed from: l, reason: collision with root package name */
    public rs0.h f521733l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f521734m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f521735n;

    /* renamed from: o, reason: collision with root package name */
    public long f521736o;

    /* renamed from: p, reason: collision with root package name */
    public long f521737p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f521738q;

    public h(int i17, int i18, int i19) {
        boolean fj6;
        this.f521722a = i17;
        this.f521723b = i18;
        this.f521724c = i19;
        java.lang.String str = "MicroMsg.ScreenCastRenderMgr" + hashCode();
        int i27 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(str, 10);
        this.f521728g = a17;
        int i28 = wo.v1.f529366m.f529299x;
        if (i28 == -1) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_opengl_render, true);
        } else if (i28 == 1) {
            fj6 = true;
        } else if (i28 != 2) {
            fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_opengl_render, true);
        } else {
            fj6 = false;
        }
        this.f521734m = fj6;
        a17.start();
        this.f521727f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
        this.f521736o = -1L;
        this.f521737p = -1L;
        this.f521738q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("ScreenCastRenderTimer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new vu1.e(this), true);
    }

    public final void a() {
        rs0.h hVar = this.f521733l;
        if (hVar != null) {
            android.opengl.EGLDisplay eGLDisplay = hVar.f480825a;
            android.opengl.EGLSurface eGLSurface = hVar.f480826b;
            if (android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, hVar.f480827c)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenCastRenderMgr", "makeEGLCurrent faild ");
        }
    }

    public final void b(final yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.f521728g.isAlive()) {
            this.f521727f.mo50293x3498a0(new java.lang.Runnable(callback) { // from class: vu1.f

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f521720d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "function");
                    this.f521720d = callback;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f521720d.mo152xb9724478();
                }
            });
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenCastRenderMgr", "queue in error");
        }
    }

    public final void c() {
        android.hardware.display.VirtualDisplay virtualDisplay;
        boolean z17 = this.f521734m;
        int i17 = this.f521723b;
        int i18 = this.f521722a;
        if (z17) {
            this.f521730i = new os0.c(this.f521722a, this.f521723b, 0, 0, 0, 0, 60, null);
            is0.c cVar = new is0.c(false, 20L);
            os0.c cVar2 = this.f521730i;
            if (cVar2 != null) {
                cVar2.H = cVar.f375928e;
            }
            android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar.f375928e);
            this.f521731j = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(i18, i17);
            android.graphics.SurfaceTexture surfaceTexture2 = this.f521731j;
            if (surfaceTexture2 != null) {
                surfaceTexture2.setOnFrameAvailableListener(new vu1.g(this));
            }
            this.f521732k = new android.view.Surface(this.f521731j);
        } else {
            vu1.b bVar = new vu1.b(i18, i17);
            this.f521729h = bVar;
            android.os.Looper mo50280x23b2dd47 = this.f521727f.mo50280x23b2dd47();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo50280x23b2dd47, "getLooper(...)");
            android.media.ImageReader newInstance = android.media.ImageReader.newInstance(i18, i17, 1, 1);
            bVar.f521712c = newInstance;
            if (newInstance != null) {
                newInstance.setOnImageAvailableListener(new vu1.a(bVar), new android.os.Handler(mo50280x23b2dd47));
            }
            android.media.ImageReader imageReader = bVar.f521712c;
            bVar.f521713d = imageReader != null ? imageReader.getSurface() : null;
            vu1.b bVar2 = this.f521729h;
            this.f521732k = bVar2 != null ? bVar2.f521713d : null;
        }
        android.view.Surface surface = this.f521732k;
        if (surface != null) {
            vu1.c cVar3 = this.f521726e;
            if (cVar3 != null && (virtualDisplay = ((tu1.c) cVar3).f503623a.f503645c) != null) {
                virtualDisplay.setSurface(surface);
            }
            long j17 = 1000 / this.f521724c;
            this.f521738q.c(j17, j17);
        }
    }
}
