package v22;

/* loaded from: classes10.dex */
public final class q extends v22.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Surface f514382c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f514383d;

    /* renamed from: e, reason: collision with root package name */
    public wo.i1 f514384e;

    /* renamed from: f, reason: collision with root package name */
    public android.media.MediaFormat f514385f;

    /* renamed from: g, reason: collision with root package name */
    public final gp.c f514386g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f514387h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f514388i;

    /* renamed from: j, reason: collision with root package name */
    public long f514389j;

    /* renamed from: k, reason: collision with root package name */
    public final android.os.HandlerThread f514390k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Object f514391l;

    /* renamed from: m, reason: collision with root package name */
    public final v22.p f514392m;

    public q(java.lang.String videoPath, int i17, android.view.Surface surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f514382c = surface;
        this.f514383d = "MicroMsg.EmojiMixVideoDecoderAsync";
        gp.c cVar = new gp.c();
        this.f514386g = cVar;
        this.f514387h = "";
        int i18 = pu5.i.f440006b;
        this.f514390k = pu5.f.a("EmojiMixVideoDecoderAsync_decodeThread", 5);
        this.f514391l = new java.lang.Object();
        this.f514392m = new v22.p(this);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiMixVideoDecoderAsync", "create decoder with path: ".concat(videoPath));
            cVar.k(videoPath);
            int d17 = cVar.d();
            for (int i19 = 0; i19 < d17; i19++) {
                android.media.MediaFormat e17 = this.f514386g.e(i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getTrackFormat(...)");
                java.lang.String string = e17.getString("mime");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                if (r26.n0.B(string, "video", false)) {
                    java.lang.String string2 = e17.getString("mime");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
                    this.f514387h = string2;
                    this.f514385f = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f514383d, "find video format " + this.f514385f + ", mime: " + string2);
                    this.f514386g.i(i19);
                    return;
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f514383d, e18, "init create extractor error", new java.lang.Object[0]);
        }
    }

    public static final void d(v22.q qVar, android.media.MediaCodec.BufferInfo bufferInfo) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f514383d, "processDecodeBuffer pts: " + bufferInfo.presentationTimeUs + ", size: " + bufferInfo.size);
        yz5.l lVar = qVar.f514333a;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Long.valueOf(bufferInfo.presentationTimeUs * 1000));
        }
        synchronized (qVar.f514391l) {
            try {
                qVar.f514391l.wait(3000L);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(qVar.f514383d, e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // v22.a0
    public int a() {
        if (this.f514385f == null) {
            return -1;
        }
        java.lang.String str = this.f514387h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return -1;
        }
        try {
            wo.i1 c17 = wo.i1.c(str);
            this.f514384e = c17;
            c17.a(this.f514385f, this.f514382c, null, 0);
            boolean c18 = fp.h.c(23);
            v22.p pVar = this.f514392m;
            if (c18) {
                android.os.HandlerThread handlerThread = this.f514390k;
                handlerThread.start();
                android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
                wo.i1 i1Var = this.f514384e;
                if (i1Var != null) {
                    i1Var.f529252a.setCallback(pVar, handler);
                }
            } else {
                wo.i1 i1Var2 = this.f514384e;
                if (i1Var2 != null) {
                    i1Var2.f529252a.setCallback(pVar);
                }
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f514383d, "init decoder error " + e17.getMessage());
            return -1;
        }
    }

    @Override // v22.a0
    public void b(boolean z17) {
        if (z17) {
            return;
        }
        synchronized (this.f514391l) {
            try {
                this.f514391l.notifyAll();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f514383d, e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // v22.a0
    public void c() {
        wo.i1 i1Var = this.f514384e;
        if (i1Var != null) {
            if (i1Var != null) {
                i1Var.x();
            }
        } else {
            yz5.a aVar = this.f514334b;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }
}
