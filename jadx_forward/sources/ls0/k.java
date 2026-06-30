package ls0;

/* loaded from: classes10.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final ms0.c f402380a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f402381b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.HandlerThread f402382c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f402383d;

    /* renamed from: e, reason: collision with root package name */
    public rs0.h f402384e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f402385f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f402386g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.SurfaceTexture f402387h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f402388i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f402389j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Object f402390k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f402391l;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f402392m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f402393n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f402394o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f402395p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.a f402396q;

    /* renamed from: r, reason: collision with root package name */
    public int f402397r;

    /* renamed from: s, reason: collision with root package name */
    public int f402398s;

    /* renamed from: t, reason: collision with root package name */
    public long f402399t;

    /* renamed from: u, reason: collision with root package name */
    public volatile long f402400u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f402401v;

    /* renamed from: w, reason: collision with root package name */
    public long f402402w;

    /* renamed from: x, reason: collision with root package name */
    public long f402403x;

    public k(ms0.c renderer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderer, "renderer");
        this.f402380a = renderer;
        this.f402381b = "MicroMsg.CodecInputSurface";
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("CodecInputSurface_renderThread", 5);
        this.f402382c = a17;
        this.f402390k = new java.lang.Object();
        this.f402395p = new java.lang.Object();
        this.f402397r = 33000000;
        a17.start();
        this.f402383d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
    }

    public static final void a(ls0.k kVar, long j17, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        rs0.h hVar;
        kVar.getClass();
        try {
            if (!kVar.f402401v) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f402381b, "requestDraw not init now");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f402381b, "render pts:" + j17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            ms0.c cVar = kVar.f402380a;
            if (cVar instanceof ms0.d) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.media.render.MixRenderer");
                ((ms0.d) cVar).v(bitmap, bitmap2);
            }
            android.os.SystemClock.elapsedRealtime();
            android.graphics.SurfaceTexture surfaceTexture = kVar.f402387h;
            if (surfaceTexture != null) {
                surfaceTexture.getTimestamp();
            }
            if (kVar.f402387h != null && kVar.f402388i) {
                long j18 = kVar.f402402w;
                android.graphics.SurfaceTexture surfaceTexture2 = kVar.f402387h;
                java.lang.Long valueOf = surfaceTexture2 != null ? java.lang.Long.valueOf(surfaceTexture2.getTimestamp()) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                if (j18 > valueOf.longValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f402381b, "not stickily monotonic increase timestamp");
                    kVar.f402394o = false;
                    yz5.a aVar = kVar.f402396q;
                    if (aVar != null) {
                        aVar.mo152xb9724478();
                        return;
                    }
                    return;
                }
            }
            android.graphics.SurfaceTexture surfaceTexture3 = kVar.f402387h;
            kVar.f402400u = surfaceTexture3 != null ? surfaceTexture3.getTimestamp() : 0L;
            android.os.SystemClock.elapsedRealtime();
            android.graphics.SurfaceTexture surfaceTexture4 = kVar.f402387h;
            if (surfaceTexture4 != null) {
                java.lang.Long valueOf2 = java.lang.Long.valueOf(surfaceTexture4.getTimestamp());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf2);
                long longValue = valueOf2.longValue();
                android.graphics.SurfaceTexture surfaceTexture5 = kVar.f402387h;
                if (surfaceTexture5 != null && kVar.f402402w == surfaceTexture5.getTimestamp()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f402381b, "same frame timestamp!!");
                } else {
                    j17 = longValue;
                }
                kVar.f402402w = j17;
                if (kVar.f402386g != null) {
                    long j19 = kVar.f402399t;
                    if (j19 > 0) {
                        j17 -= j19 * 1000000;
                    }
                    kVar.i(j17);
                }
            } else if (kVar.f402386g != null) {
                long j27 = kVar.f402399t;
                if (j27 > 0) {
                    j17 -= j27 * 1000000;
                }
                kVar.i(j17);
            }
            if (kVar.f402386g != null && (hVar = kVar.f402384e) != null) {
                rs0.i.f480829a.x(hVar.f480825a, hVar.f480826b);
            }
            android.os.SystemClock.elapsedRealtime();
            yz5.l lVar = kVar.f402385f;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(kVar.f402381b, e17, "", new java.lang.Object[0]);
            yz5.l lVar2 = kVar.f402385f;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
    }

    public final void b(android.view.Surface surface, boolean z17, int i17, int i18, long j17, yz5.l lVar) {
        this.f402386g = surface;
        java.lang.String str = this.f402381b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" initForRemuxer, surface:");
        sb6.append(surface);
        sb6.append(", callback:");
        sb6.append(lVar == null);
        sb6.append(", drawInOnFrameAvailable:");
        sb6.append(this.f402394o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402381b, "default use drawInFrameAvailable");
            h(true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402381b, "cannot use drawInFrameAvailable!");
            h(false);
        }
        this.f402398s = 0;
        this.f402399t = j17;
        d(new ls0.a(this, surface, i17, i18, lVar));
    }

    public final void c(android.view.Surface surface, android.opengl.EGLContext eGLContext, boolean z17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f402386g = surface;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" initWithSurface, eglContext:");
        sb6.append(eGLContext);
        sb6.append(", surface:");
        sb6.append(surface);
        sb6.append(", waitNewFrame:");
        sb6.append(z17);
        sb6.append(", callback:");
        sb6.append(lVar == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402381b, sb6.toString());
        d(new ls0.c(eGLContext, this, surface, lVar));
    }

    public final void d(yz5.a aVar) {
        synchronized (this.f402390k) {
            if (!this.f402382c.isAlive() || this.f402389j) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f402381b, hashCode() + " queue already release");
            } else {
                this.f402383d.mo50293x3498a0(aVar != null ? new ls0.i(aVar) : null);
            }
        }
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402381b, hashCode() + " release resources");
        ls0.d dVar = new ls0.d(this);
        synchronized (this.f402390k) {
            if (!this.f402382c.isAlive() || this.f402389j) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f402381b, hashCode() + " queueFirst already release");
            } else {
                this.f402383d.mo50302x6b17ad39(null);
                this.f402383d.mo50293x3498a0(new ls0.i(dVar));
            }
        }
        synchronized (this.f402390k) {
            this.f402389j = true;
            this.f402401v = false;
        }
    }

    public final void f(yz5.l lVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setDrawBlendBitmapProvider:");
        sb6.append(lVar != null ? lVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402381b, sb6.toString());
        this.f402391l = lVar;
    }

    public final void g(yz5.l lVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setDrawBlurBgBitmapProvider:");
        sb6.append(lVar != null ? lVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402381b, sb6.toString());
        this.f402393n = lVar;
    }

    public final void h(boolean z17) {
        synchronized (this.f402395p) {
            this.f402394o = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402381b, "setDrawInOnFrameAvailable:" + z17);
        }
    }

    public final void i(long j17) {
        rs0.h hVar = this.f402384e;
        if (hVar != null) {
            android.opengl.EGLExt.eglPresentationTimeANDROID(hVar.f480825a, hVar.f480826b, j17);
        }
        this.f402400u = j17;
        rs0.i.f480829a.d("eglPresentationTimeANDROID", "MicroMsg.GLEnvironmentUtil");
    }

    public final void j(android.media.MediaFormat mediaFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFormat, "mediaFormat");
        ms0.c cVar = this.f402380a;
        cVar.getClass();
        if (j62.e.g().l("clicfg_handle_media_format_change", true, true, true)) {
            if (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) {
                cVar.f412478a = mediaFormat.getInteger("width");
                int integer = mediaFormat.getInteger("height");
                cVar.f412479b = integer;
                os0.a aVar = cVar.f412484g;
                if (aVar != null) {
                    aVar.w(cVar.f412478a, integer);
                }
            }
            int i17 = cVar.f412479b;
            int i18 = cVar.f412478a;
            int integer2 = mediaFormat.containsKey("crop-left") ? mediaFormat.getInteger("crop-left") : 0;
            int integer3 = mediaFormat.containsKey("crop-top") ? mediaFormat.getInteger("crop-top") : 0;
            if (mediaFormat.containsKey("crop-right")) {
                i18 = mediaFormat.getInteger("crop-right") + 1;
            }
            if (mediaFormat.containsKey("crop-bottom")) {
                i17 = mediaFormat.getInteger("crop-bottom") + 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.AbsSurfaceRenderer", "updateTextureSizeByMediaFormat:textureWidth->" + cVar.f412478a + " textureHeight->" + cVar.f412479b + " validLeft->" + integer2 + " validTop->" + i17 + " validRight->" + i18 + "  validBottom -> " + integer3);
            os0.a aVar2 = cVar.f412484g;
            if (aVar2 != null) {
                android.graphics.Point point = new android.graphics.Point(integer2, i17 + 1);
                android.graphics.Point point2 = new android.graphics.Point(i18 + 1, integer3);
                aVar2.A = point;
                aVar2.B = point2;
            }
        }
    }
}
