package km1;

/* loaded from: classes7.dex */
public final class s implements ag.g, ag.c, ag.d, ag.e, gh.r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v, android.graphics.SurfaceTexture.OnFrameAvailableListener {
    public static final km1.a E = new km1.a(null);
    public static final boolean F;
    public static final android.util.Size G;
    public final km1.s A;
    public final km1.s B;
    public final km1.s C;
    public final gh.y D;

    /* renamed from: d, reason: collision with root package name */
    public final yf.i0 f390560d;

    /* renamed from: e, reason: collision with root package name */
    public final yf.o f390561e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f390562f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.ref.WeakReference f390563g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f390564h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f390565i;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f390566m;

    /* renamed from: n, reason: collision with root package name */
    public volatile android.view.Surface f390567n;

    /* renamed from: o, reason: collision with root package name */
    public volatile android.util.Size f390568o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f390569p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f390570q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f390571r;

    /* renamed from: s, reason: collision with root package name */
    public volatile android.graphics.SurfaceTexture f390572s;

    /* renamed from: t, reason: collision with root package name */
    public volatile ts0.r f390573t;

    /* renamed from: u, reason: collision with root package name */
    public volatile com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f390574u;

    /* renamed from: v, reason: collision with root package name */
    public volatile com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f390575v;

    /* renamed from: w, reason: collision with root package name */
    public volatile gh.t f390576w;

    /* renamed from: x, reason: collision with root package name */
    public volatile int f390577x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f390578y;

    /* renamed from: z, reason: collision with root package name */
    public final km1.e f390579z;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        F = z65.c.a();
        G = new android.util.Size(-1, -1);
    }

    public s(yf.i0 livePusherBroker, yf.o livePusher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(livePusherBroker, "livePusherBroker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(livePusher, "livePusher");
        this.f390560d = livePusherBroker;
        this.f390561e = livePusher;
        java.lang.String str = "MicroMsg.AppBrandVideoCustomRenderProcessor#" + hashCode();
        this.f390562f = str;
        this.f390565i = true;
        this.f390566m = true;
        this.f390568o = G;
        this.f390578y = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f390579z = new km1.e(str);
        new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A = this;
        this.B = this;
        this.C = this;
        this.D = gh.y.VirtualView;
    }

    @Override // ag.e
    public void a(int i17) {
        boolean z17 = F;
        ts0.r rVar = this.f390573t;
        if (rVar != null) {
            rVar.t(true, false, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x
    public void b() {
        boolean z17 = F;
        s();
        android.graphics.SurfaceTexture surfaceTexture = this.f390572s;
        if (surfaceTexture != null) {
            u(surfaceTexture);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (true == r0.L0()) goto L18;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r3 = this;
            ts0.r r0 = r3.f390573t
            if (r0 == 0) goto L9
            ts0.b r0 = (ts0.b) r0
            r0.H()
        L9:
            ts0.r r0 = r3.f390573t
            if (r0 == 0) goto L10
            r0.mo167002x41012807()
        L10:
            r0 = 0
            r3.f390573t = r0
            java.lang.ref.WeakReference r0 = r3.f390563g
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.appbrand.page.n7 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) r0
            if (r0 == 0) goto L2d
            com.tencent.mm.plugin.appbrand.o6 r0 = r0.mo32091x9a3f0ba2()
            if (r0 == 0) goto L2d
            boolean r0 = r0.L0()
            r1 = 1
            if (r1 != r0) goto L2d
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r1 == 0) goto L31
            return
        L31:
            java.lang.ref.WeakReference r0 = r3.f390563g
            if (r0 == 0) goto L62
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.appbrand.page.n7 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) r0
            if (r0 != 0) goto L3e
            goto L62
        L3e:
            vb1.b r1 = vb1.d.f516006c
            java.lang.String r0 = r0.mo48798x74292566()
            java.lang.String r2 = "getAppId(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            vb1.d r0 = r1.a(r0)
            yf.i0 r1 = r3.f390560d
            int r1 = r1.f334030d
            r0.b(r1)
            int r0 = r0.d()
            if (r0 != 0) goto L69
            com.tencent.magicbrush.MagicBrush r0 = r3.f390574u
            if (r0 == 0) goto L69
            r0.e()
            goto L69
        L62:
            java.lang.String r0 = "MicroMsg.AppBrandVideoCustomRenderProcessor"
            java.lang.String r1 = "notifyBackgroundIfCan, insertComponent is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: km1.s.c():void");
    }

    @Override // ag.g
    public boolean d(sf.f invokeContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        if (F) {
            java.util.Objects.toString(invokeContext.c());
        }
        java.lang.String l17 = invokeContext.l();
        if (!(l17 != null && true == r26.n0.B(l17, "operate", false))) {
            return false;
        }
        jc1.d dVar = jc1.f.f380448d;
        org.json.JSONObject c17 = invokeContext.c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f390562f, "onPreOperateJsApiCall, params is null");
        } else {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("switchCamera", c17.optString("type")) && this.f390564h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390562f, "onPreOperateJsApiCall switchCamera");
                ts0.r rVar = this.f390573t;
                if (rVar == null) {
                    return true;
                }
                ((ts0.b) rVar).M();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("sendCustomVideoFrame", c17.optString("type"))) {
                if (!this.f390561e.mo176945xd057a1fe()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390562f, "onPreOperateJsApiCall, prevent sendCustomVideoFrame before start pushing");
                    invokeContext.a(jc1.f.f380445a);
                    return true;
                }
                try {
                    int i17 = c17.getInt("bufferId");
                    try {
                        int i18 = c17.getInt("rotation");
                        try {
                            int i19 = c17.getInt("width");
                            try {
                                int i27 = c17.getInt("height");
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0 r17 = r();
                                java.nio.ByteBuffer m07 = r17 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) r17).m0(i17) : null;
                                if (m07 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f390562f, "onPreOperateJsApiCall, videoFrameBuffer is null");
                                    invokeContext.d("fail:videoFrameBuffer is null", dVar);
                                    return true;
                                }
                                byte[] bArr = new byte[(int) (i19 * 1.5f * i27)];
                                m07.rewind();
                                m07.get(bArr);
                                this.f390560d.G(new km1.k(this, bArr, i19, i27, i18, invokeContext));
                                return true;
                            } catch (java.lang.Exception unused) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f390562f, "onPreOperateJsApiCall, height is null");
                                invokeContext.d("fail:height is null", dVar);
                                return true;
                            }
                        } catch (java.lang.Exception unused2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f390562f, "onPreOperateJsApiCall, width is null");
                            invokeContext.d("fail:width is null", dVar);
                            return true;
                        }
                    } catch (java.lang.Exception unused3) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f390562f, "onPreOperateJsApiCall, rotation is null");
                        invokeContext.d("fail:rotation is null", dVar);
                        return true;
                    }
                } catch (java.lang.Exception unused4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f390562f, "onPreOperateJsApiCall, bufferId is null");
                    invokeContext.d("fail:bufferId is null", dVar);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ag.g
    public ag.e e() {
        return this.C;
    }

    @Override // ag.g
    public void f(sf.f invokeContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        if (F) {
            java.util.Objects.toString(invokeContext.c());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = invokeContext.m();
        if (m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) {
            this.f390563g = new java.lang.ref.WeakReference(m17);
            w(invokeContext);
            q();
        }
    }

    @Override // ag.g
    public void g(android.util.Size size) {
        android.view.Surface surface;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        if (F) {
            size.toString();
        }
        this.f390568o = size;
        gh.t tVar = this.f390576w;
        if (tVar != null && (surface = this.f390567n) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390562f, "notifyPreviewSurfaceSizeUpdateIfCan, do notify");
            tVar.c(surface, size.getWidth(), size.getHeight());
        }
        q();
        p(size);
    }

    @Override // gh.r
    /* renamed from: getSurface */
    public java.lang.Object mo131547xcf572877() {
        return gh.q.a(this);
    }

    @Override // gh.r
    /* renamed from: getThisView */
    public android.view.View mo131549xc514bbd9() {
        return null;
    }

    @Override // gh.r
    /* renamed from: getViewType */
    public gh.y mo131550xc321a0f5() {
        return this.D;
    }

    @Override // ag.g
    public void h(android.view.Surface previewSurface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewSurface, "previewSurface");
        if (F) {
            previewSurface.toString();
        }
        this.f390567n = previewSurface;
        t();
        q();
    }

    @Override // ag.c
    public void i(int i17) {
        boolean z17 = F;
        this.f390577x = i17;
    }

    @Override // ag.g
    public ag.d j() {
        return this.B;
    }

    @Override // ag.g
    public void k() {
        android.view.Surface surface;
        boolean z17 = F;
        v(false, null);
        gh.t tVar = this.f390576w;
        if (tVar != null && (surface = this.f390567n) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390562f, "notifyPreviewSurfaceReleaseIfCan, do notify");
            tVar.a(surface, false);
        }
        this.f390567n = null;
    }

    @Override // ag.g
    public void l(sf.f invokeContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        if (F) {
            java.util.Objects.toString(invokeContext.c());
        }
        if (w(invokeContext)) {
            q();
        }
    }

    @Override // ag.d
    public void m(android.graphics.PointF pos) {
        ts0.r rVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pos, "pos");
        if (F) {
            pos.toString();
        }
        android.util.Size size = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(G, this.f390568o) ? null : this.f390568o;
        if (size == null || (rVar = this.f390573t) == null) {
            return;
        }
        rVar.y(rVar.m(pos.x, pos.y, 1.25f, size.getWidth(), size.getHeight()), rVar.m(pos.x, pos.y, 1.0f, size.getWidth(), size.getHeight()));
    }

    @Override // gh.r
    public void n(boolean z17, int i17, yz5.l callback, com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        if (F) {
            runtime.toString();
        }
    }

    @Override // ag.g
    public ag.c o() {
        return this.A;
    }

    @Override // gh.r
    /* renamed from: onDestroy */
    public void mo131551xac79a11b() {
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var;
        if (F) {
            java.util.Objects.toString(surfaceTexture);
        }
        if (!this.f390564h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390562f, "onFrameAvailable, videoCustomRender is not enable");
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f390563g;
        if (weakReference == null || (n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) weakReference.get()) == null) {
            return;
        }
        int i17 = this.f390560d.f334030d;
        int i18 = this.f390577x;
        km1.e eVar = this.f390579z;
        eVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t a17 = km1.u.a(n7Var);
        if (a17 == null || (f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) a17.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class)) == null) {
            return;
        }
        km1.b bVar = new km1.b();
        bVar.t(kz5.c1.k(new jz5.l("livePusherId", java.lang.Integer.valueOf(i17)), new jz5.l("deviceOrientationRotation", java.lang.Integer.valueOf(i18))));
        km1.f fVar = eVar.f390529b;
        fVar.getClass();
        fVar.f390530a = bVar;
        final km1.d dVar = new km1.d(eVar, n7Var);
        f0Var.mo51545x3498a0(new java.lang.Runnable(dVar) { // from class: km1.t

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f390580d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "function");
                this.f390580d = dVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f390580d.mo152xb9724478();
            }
        });
    }

    public final void p(android.util.Size size) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var;
        java.lang.ref.WeakReference weakReference = this.f390563g;
        if (weakReference == null || (n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) weakReference.get()) == null || (a17 = km1.u.a(n7Var)) == null || (f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) a17.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class)) == null) {
            return;
        }
        f0Var.mo51545x3498a0(new km1.h(this, size, n7Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            r5 = this;
            boolean r0 = r5.f390564h
            android.util.Size r1 = r5.f390568o
            km1.j r2 = new km1.j
            r2.<init>(r0, r1, r5)
            boolean r0 = r5.f390564h
            boolean r1 = r5.f390569p
            if (r0 != r1) goto L10
            goto L42
        L10:
            if (r0 == 0) goto L23
            yf.o r1 = r5.f390561e
            boolean r1 = r1.mo176945xd057a1fe()
            if (r1 == 0) goto L23
            java.lang.String r1 = r5.f390562f
            java.lang.String r3 = "configCustomVideoCaptureIfNeed, already push, can not enable"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r3)
            r1 = 0
            goto L43
        L23:
            java.lang.String r1 = r5.f390562f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "configCustomVideoCaptureIfNeed, do enable: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3)
            yf.i0 r1 = r5.f390560d
            km1.g r3 = new km1.g
            r3.<init>(r5, r0)
            r1.G(r3)
            r5.f390569p = r0
        L42:
            r1 = 1
        L43:
            if (r1 == 0) goto L49
            r5.v(r0, r2)
            goto L4e
        L49:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.mo146xb9724478(r0)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: km1.s.q():void");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0 r() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t a17;
        java.lang.ref.WeakReference weakReference = this.f390563g;
        if (weakReference == null || (n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) weakReference.get()) == null || (a17 = km1.u.a(n7Var)) == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0) a17.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0.class);
    }

    public final void s() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var;
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad;
        java.lang.ref.WeakReference weakReference = this.f390563g;
        if (weakReference == null || (n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) weakReference.get()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandVideoCustomRenderProcessor", "notifyForegroundIfCan, insertComponent is null");
            return;
        }
        vb1.b bVar = vb1.d.f516006c;
        java.lang.String mo48798x74292566 = n7Var.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        vb1.d a17 = bVar.a(mo48798x74292566);
        a17.c(this.f390560d.f334030d);
        if (a17.d() != 1 || (c4209xd2d3ddad = this.f390574u) == null) {
            return;
        }
        c4209xd2d3ddad.f();
    }

    @Override // gh.r
    /* renamed from: setSurfaceListener */
    public void mo131552xb06c83bf(gh.t tVar) {
        if (F) {
            java.util.Objects.toString(tVar);
        }
        this.f390576w = tVar;
        t();
    }

    public final void t() {
        gh.t tVar;
        android.view.Surface surface;
        if (this.f390575v == null || (tVar = this.f390576w) == null || (surface = this.f390567n) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390562f, "notifyPreviewSurfaceReadyIfCan, do notify");
        gh.s.a(tVar, surface, this.f390568o.getWidth(), this.f390568o.getHeight(), false, false, 16, null);
    }

    public final void u(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var;
        if (F) {
            java.util.Objects.toString(surfaceTexture);
        }
        if (this.f390573t != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390562f, "startCameraPreview, already started");
            return;
        }
        boolean z17 = this.f390566m;
        ts0.s sVar = (ts0.s) i95.n0.c(ts0.s.class);
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390562f, "startCameraPreview, camera is null");
            return;
        }
        ts0.r wi6 = ((mr0.a) sVar).wi(z17, false, false, true, false);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        wi6.c(context, !z17);
        wi6.p(surfaceTexture, false, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171);
        wi6.B(20);
        this.f390573t = wi6;
        java.lang.ref.WeakReference weakReference = this.f390563g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = (weakReference == null || (n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) weakReference.get()) == null) ? null : n7Var.mo32091x9a3f0ba2();
        if (mo32091x9a3f0ba2 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7031x24ebf74a c7031x24ebf74a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7031x24ebf74a();
            c7031x24ebf74a.f143472d = c7031x24ebf74a.b("Appid", mo32091x9a3f0ba2.f156336n, true);
            c7031x24ebf74a.f143473e = c7031x24ebf74a.b("Username", mo32091x9a3f0ba2.n0(), true);
            c7031x24ebf74a.f143474f = mo32091x9a3f0ba2.d2();
            c7031x24ebf74a.f143475g = mo32091x9a3f0ba2.f156338p.f158814g;
            c7031x24ebf74a.k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(boolean r8, yz5.l r9) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km1.s.v(boolean, yz5.l):void");
    }

    public final boolean w(sf.f fVar) {
        boolean z17 = this.f390564h;
        org.json.JSONObject c17 = fVar.c();
        boolean optBoolean = c17 != null ? c17.optBoolean("enableVideoCustomRender", z17) : z17;
        boolean z18 = this.f390565i;
        org.json.JSONObject c18 = fVar.c();
        boolean optBoolean2 = c18 != null ? c18.optBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15512xcf452269, z18) : z18;
        java.lang.String str = this.f390566m ? "front" : "back";
        org.json.JSONObject c19 = fVar.c();
        java.lang.String optString = c19 != null ? c19.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15509x87ec77fa, str) : null;
        if (optString == null) {
            optString = str;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("front", optString);
        boolean z19 = (optBoolean == z17 && optBoolean2 == z18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, str)) ? false : true;
        this.f390564h = optBoolean;
        this.f390565i = optBoolean2;
        this.f390566m = b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390562f, "updateConfig, enableVideoCustomRender: " + optBoolean + ", enableCameraPreview: " + optBoolean2 + ", useFrontCamera: " + b17 + ", isConfigUpdated: " + z19);
        if (z19) {
            if (optBoolean && optBoolean2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390562f, "override enableCameraPreview to false");
                org.json.JSONObject c27 = fVar.c();
                if (c27 != null) {
                    c27.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15512xcf452269, false);
                }
            } else if (!optBoolean && optBoolean2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390562f, "recover enableCameraPreview to true");
                org.json.JSONObject c28 = fVar.c();
                if (c28 != null) {
                    c28.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15512xcf452269, true);
                }
            }
        }
        return z19;
    }
}
