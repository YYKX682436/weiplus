package nn0;

/* loaded from: classes14.dex */
public class s implements nn0.o, com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXLivePlayVideoRenderListener, com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener {
    public final java.lang.Object E;
    public int F;
    public int G;
    public android.graphics.Bitmap H;
    public final java.util.concurrent.atomic.AtomicBoolean I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.Surface f420140J;
    public final nn0.b0 K;
    public android.os.Handler L;
    public long M;
    public int N;
    public int P;
    public com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture Q;
    public final android.os.Message R;
    public java.lang.String S;
    public long T;

    /* renamed from: s, reason: collision with root package name */
    public nn0.b f420153s;

    /* renamed from: x, reason: collision with root package name */
    public android.content.Context f420158x;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f420141d = "Finder.NewCustomRender" + hashCode();

    /* renamed from: e, reason: collision with root package name */
    public boolean f420142e = false;

    /* renamed from: f, reason: collision with root package name */
    public android.os.HandlerThread f420143f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f420144g = null;

    /* renamed from: h, reason: collision with root package name */
    public nn0.q f420145h = null;

    /* renamed from: i, reason: collision with root package name */
    public pn0.b f420146i = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f420147m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f420148n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf f420149o = null;

    /* renamed from: p, reason: collision with root package name */
    public nn0.d0 f420150p = null;

    /* renamed from: q, reason: collision with root package name */
    public q05.c f420151q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.SurfaceTexture f420152r = null;

    /* renamed from: t, reason: collision with root package name */
    public long f420154t = -1;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.RectF[] f420155u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f420156v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f420157w = false;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 f420159y = null;

    /* renamed from: z, reason: collision with root package name */
    public android.graphics.RectF f420160z = new android.graphics.RectF(-1.0f, -1.0f, -1.0f, -1.0f);
    public final android.graphics.RectF A = new android.graphics.RectF(-1.0f, -1.0f, -1.0f, -1.0f);
    public int B = 0;
    public int C = 1;
    public int D = 0;

    public s(android.content.Context context) {
        this.f420153s = null;
        java.lang.Object obj = new java.lang.Object();
        this.E = obj;
        this.F = 0;
        this.G = 0;
        this.H = null;
        this.I = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f420140J = null;
        this.K = new nn0.b0();
        this.N = 0;
        this.P = 0;
        this.Q = null;
        this.R = android.os.Message.obtain();
        this.S = "";
        this.T = 0L;
        this.f420158x = context;
        this.L = new android.os.Handler(android.os.Looper.getMainLooper());
        this.N = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_live_render_surface_destroy_strategy, 0);
        this.P = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_live_render_surface_lifecycle_check, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "commonInit surfaceDestroyStrategy = " + this.N + ", surfaceCheckStrategy = " + this.P);
        synchronized (obj) {
            this.f420153s = new nn0.b();
            a();
        }
    }

    @Override // nn0.o
    public void B(boolean z17) {
        pn0.b bVar = this.f420146i;
        if (bVar != null) {
            bVar.B(z17);
        }
    }

    @Override // nn0.o
    public void Bg(android.graphics.RectF[] rectFArr) {
        this.f420155u = rectFArr;
        nn0.b bVar = this.f420153s;
        if (bVar != null) {
            bVar.u(rectFArr);
        }
    }

    @Override // nn0.o
    public android.graphics.SurfaceTexture Da() {
        return this.f420152r;
    }

    @Override // nn0.o
    public void Gg(pn0.b bVar) {
        synchronized (this.E) {
            if (this.f420153s == null) {
                return;
            }
            android.view.Surface mo158745xcf572877 = bVar.mo158745xcf572877();
            if (mo158745xcf572877 == null) {
                return;
            }
            java.lang.ref.WeakReference weakReference = this.f420153s.G;
            if (mo158745xcf572877 == (weakReference != null ? (android.view.Surface) weakReference.get() : null)) {
                hn0.s[] sVarArr = hn0.s.f363968d;
                if ((this.N & 1) <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "onSurfaceChanged: surfaceDestroyStrategy = " + this.N + ", skip destroy");
                } else if (this.f420145h != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "obtainMessage(MSG_DESTROY)_onSurfaceChanged");
                    this.f420145h.obtainMessage(3, this.f420153s).sendToTarget();
                }
            }
        }
    }

    @Override // nn0.o
    public void O2(pn0.b bVar) {
        synchronized (this.E) {
            if (this.f420153s == null) {
                return;
            }
            android.view.Surface mo158745xcf572877 = bVar.mo158745xcf572877();
            if (mo158745xcf572877 == null) {
                return;
            }
            java.lang.ref.WeakReference weakReference = this.f420153s.G;
            if (mo158745xcf572877 == (weakReference != null ? (android.view.Surface) weakReference.get() : null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "surfaceRender.surface Destroyed, but mCustomGLRenderImp is not null");
                hn0.s[] sVarArr = hn0.s.f363968d;
                if ((this.N & 2) <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "onSurfaceDestroyed: surfaceDestroyStrategy = " + this.N + ", skip ignore");
                } else if (this.f420145h != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "obtainMessage(MSG_DESTROY)_onSurfaceDestroyed");
                    this.f420145h.obtainMessage(3, this.f420153s).sendToTarget();
                }
            }
        }
    }

    public final void a() {
        synchronized (this.E) {
            nn0.b bVar = this.f420153s;
            if (bVar == null) {
                return;
            }
            boolean z17 = this.N > 0;
            if (bVar.P != z17) {
                bVar.P = z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.f420063a, "updateNeedHoldSurface: " + z17);
                if (!bVar.P) {
                    bVar.G = null;
                }
            }
        }
    }

    public boolean b(nn0.b bVar, java.lang.Object obj) {
        if (bVar == null || !bVar.f420085w || !bVar.w(obj)) {
            return false;
        }
        c(bVar, "checkShareContextChange");
        this.f420157w = false;
        return true;
    }

    @Override // nn0.o
    public void bc(ps0.a aVar) {
        nn0.b bVar = this.f420153s;
        if (bVar != null) {
            if (aVar != null) {
                ((go0.w1) aVar).e(this.f420144g);
            }
            bVar.R = aVar;
        }
    }

    public void c(nn0.b bVar, java.lang.String str) {
        android.content.Context context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "destroyInternal fromSrc = " + str);
        if (bVar == null || !bVar.f420085w) {
            return;
        }
        try {
            bVar.p();
            q05.c cVar = this.f420151q;
            if (cVar != null) {
                cVar.a();
                this.f420151q = null;
            }
            bVar.y();
            if (this.B == 1 && (context = this.f420158x) != null) {
                bVar.z(context);
            }
            synchronized (this.E) {
                if (this.f420153s == bVar) {
                    this.f420153s = null;
                    this.f420157w = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f420141d, "mCustomGLRenderImp != customGLRenderImp");
                }
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f420141d, "destroyInternal error");
            synchronized (this.E) {
                if (this.f420153s == bVar) {
                    this.f420153s = null;
                    this.f420157w = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f420141d, "mCustomGLRenderImp != customGLRenderImp");
                }
            }
        }
    }

    public final pn0.b d() {
        pn0.b bVar = this.f420146i;
        if (bVar != null && ((pn0.a) bVar).d()) {
            return this.f420146i;
        }
        java.lang.ref.WeakReference weakReference = this.f420148n;
        pn0.b bVar2 = weakReference != null ? (pn0.b) weakReference.get() : null;
        if (bVar2 == null || !((pn0.a) bVar2).d()) {
            return null;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return bVar2;
    }

    @Override // nn0.o
    public void d1(boolean z17) {
        nn0.b bVar = this.f420153s;
        if (bVar != null) {
            bVar.v(z17);
        }
    }

    public void e() {
        l();
        this.f420140J = null;
        synchronized (this) {
            java.lang.String str = this.f420141d;
            int i17 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a(str, 10);
            this.f420143f = a17;
            a17.start();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "CustomRender mGLThread start " + this.f420143f.isAlive());
            this.f420144g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f420143f.getLooper());
            this.f420145h = new nn0.q(this.f420143f.getLooper(), this);
        }
    }

    @Override // nn0.o
    public void f(boolean z17) {
        h(z17);
        synchronized (this.E) {
            if (this.f420145h != null) {
                this.f420154t = this.f420143f.getId();
            }
        }
    }

    /* renamed from: finalize */
    public void m149805xd764dc1e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "finalize");
        l();
        this.L.removeCallbacksAndMessages(null);
        this.L = null;
        this.f420158x = null;
        this.f420159y = null;
        this.f420149o = null;
        this.f420146i = null;
        this.f420148n = null;
        this.f420152r = null;
        this.M = 0L;
    }

    public void g() {
        this.f420156v = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "startPlay surfaceRender = " + this.f420146i);
        boolean bj6 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
        int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
        int Ni = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        zl2.r4 r4Var = zl2.r4.f555483a;
        int i17 = 0;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85442w3).mo141623x754a37bb()).r()).intValue() == 1;
        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).getClass();
        if (bj6 && z17) {
            this.M = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).wi();
            i17 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).aj(this.M, Di, Ni, 3, 48000, 2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "WaveHAid, enable:%s, type:%s, device:%s, result:%s", java.lang.Boolean.valueOf(bj6), java.lang.Integer.valueOf(Di), java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(i17));
        pn0.b bVar = this.f420146i;
        if (bVar != null) {
            bVar.mo158747x8113c2b6();
        }
    }

    @Override // nn0.o
    /* renamed from: getVideoHeight */
    public int mo149796x463504c() {
        return this.G;
    }

    @Override // nn0.o
    /* renamed from: getVideoWidth */
    public int mo149797x8d5c7601() {
        return this.F;
    }

    public void h(boolean z17) {
        this.f420156v = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "stopPlay clearLastFrame = " + z17 + " surfaceRender = " + this.f420146i);
        pn0.b bVar = this.f420146i;
        if (bVar != null) {
            bVar.mo158748x66343656(z17);
        }
        if (z17) {
            this.f420149o = null;
            this.f420150p = null;
        }
        this.f420148n = null;
        if (this.M != 0) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Bi(this.M);
            this.M = 0L;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 != 2) {
            if (i17 == 3) {
                java.lang.Object obj = message.obj;
                if (obj instanceof nn0.b) {
                    c((nn0.b) obj, "MSG_DESTROY");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "MSG_DESTROY");
                return false;
            }
            if (i17 != 1000) {
                return false;
            }
        }
        this.R.copyFrom(message);
        j((com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture) message.obj);
        return false;
    }

    @Override // nn0.o
    public void he(android.graphics.RectF rectF) {
        this.A.set(rectF);
        nn0.b bVar = this.f420153s;
        if (bVar != null) {
            bVar.t(rectF);
            k(1000, 1000, null);
        }
    }

    public void i(nn0.b bVar, android.view.Surface surface) {
        c(bVar, "dealSurfaceChange");
        this.f420157w = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x013d, code lost:
    
        if (r9.f420085w == false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture r26) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn0.s.j(com.tencent.rtmp.TXLivePlayer$TXLiteAVTexture):void");
    }

    @Override // nn0.o
    public void j4(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, nn0.c0 c0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "setPlayerView glRootView = " + scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf + " listener = " + c0Var);
        this.f420150p = c0Var == null ? null : new nn0.d0(c0Var, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.hashCode());
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null) {
            this.f420149o = null;
            return;
        }
        pn0.b bVar = this.f420146i;
        if (bVar != null && ((pn0.a) bVar).d()) {
            pn0.b bVar2 = this.f420146i;
            if (((pn0.a) bVar2).f438480k == scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf && bVar2.a(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "setPlayerView repeat setView: " + scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "setPlayerView check surface render = " + this.f420146i);
        pn0.b bVar3 = this.f420146i;
        if (bVar3 != null) {
            bVar3.mo158746x6761d4f();
        }
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getF150155g() != null) {
            this.f420146i = new pn0.e(this);
        } else {
            this.f420146i = new pn0.h(this);
        }
        this.f420147m = true;
        pn0.b bVar4 = this.f420146i;
        int i17 = this.B;
        int i18 = this.C;
        int i19 = this.D;
        pn0.a aVar = (pn0.a) bVar4;
        aVar.f438474e = i17;
        aVar.f438475f = i18;
        aVar.f438476g = i19;
        bVar4.b(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
        this.f420149o = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        k(1000, 1000, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "setPlayerView finish check surface render = " + this.f420146i);
    }

    public void k(int i17, int i18, com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture tXLiteAVTexture) {
        if (tXLiteAVTexture == null && (tXLiteAVTexture = (com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture) this.R.obj) == null) {
            return;
        }
        synchronized (this) {
            nn0.q qVar = this.f420145h;
            if (qVar != null) {
                if (i18 != 0) {
                    qVar.removeMessages(i18);
                }
                this.f420145h.obtainMessage(i17, tXLiteAVTexture).sendToTarget();
            }
        }
    }

    public void l() {
        synchronized (this) {
            android.os.HandlerThread handlerThread = this.f420143f;
            if (handlerThread != null && handlerThread.isAlive()) {
                this.f420143f.quitSafely();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "CustomRender mGLThread quit");
            }
            this.f420144g = null;
            this.f420145h = null;
            this.f420143f = null;
        }
    }

    @Override // nn0.o
    public void le(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        if (surfaceTexture != null) {
            this.f420146i = new pn0.c(this, surfaceTexture, i17, i18);
            this.f420147m = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "setOutsideSurfaceTexture " + surfaceTexture);
        }
    }

    @Override // nn0.o
    public void n7(int i17) {
        this.B = i17;
        this.f420157w = false;
        pn0.b bVar = this.f420146i;
        if (bVar != null) {
            ((pn0.a) bVar).f438474e = i17;
        }
        nn0.b bVar2 = this.f420153s;
        if (bVar2 != null) {
            if (i17 == 1) {
                bVar2.m(this.f420158x);
            } else {
                bVar2.z(this.f420158x);
            }
        }
        if (this.B == 2) {
            this.f420142e = true;
        }
    }

    @Override // nn0.o
    public com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf o1() {
        return this.f420149o;
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener
    /* renamed from: onAudioInfoChanged */
    public void mo94540xb9e6b46f(int i17, int i18, int i19) {
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener
    /* renamed from: onPcmDataAvailable */
    public void mo94541xe5629f84(byte[] bArr, long j17) {
        if (this.M == 0 || bArr.length <= 0) {
            return;
        }
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[bArr.length];
        wd0.l1 l1Var = (wd0.l1) i95.n0.c(wd0.l1.class);
        long j18 = this.M;
        ((u14.t) l1Var).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17488x7dde8191.m68993x50c5b64f(j18, bArr, bArr2, length) == 0) {
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXLivePlayVideoRenderListener
    /* renamed from: onRenderVideoFrame */
    public void mo94543x3cf387e7(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture tXLiteAVTexture) {
        int i17;
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture tXLiteAVTexture2 = tXLiteAVTexture;
        int i18 = tXLiteAVTexture2.f46519x6be2dc6;
        int i19 = tXLiteAVTexture2.f46517xb7389127;
        if (this.F != i18 || this.G != i19) {
            this.F = i18;
            this.G = i19;
        }
        pn0.b bVar = this.f420146i;
        if (bVar != null) {
            bVar.c(i18, i19);
        }
        nn0.b0 b0Var = this.K;
        b0Var.getClass();
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture tXLiteAVTexture3 = b0Var.f420089a;
        if (tXLiteAVTexture3 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tXLiteAVTexture3.f46516x77710645, tXLiteAVTexture2.f46516x77710645)) {
            com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture tXLiteAVTexture4 = new com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture();
            tXLiteAVTexture4.f46516x77710645 = tXLiteAVTexture2.f46516x77710645;
            b0Var.f420089a = tXLiteAVTexture4;
        }
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture tXLiteAVTexture5 = b0Var.f420089a;
        if (tXLiteAVTexture5 != null && ((i17 = tXLiteAVTexture5.f46518xc35d0396) == 0 || tXLiteAVTexture5.f46519x6be2dc6 != tXLiteAVTexture2.f46519x6be2dc6 || tXLiteAVTexture5.f46517xb7389127 != tXLiteAVTexture2.f46517xb7389127)) {
            if (i17 != 0) {
                rs0.g gVar = rs0.i.f480829a;
                android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SingleTextureCache", "checkResetCache deleteTexture:" + tXLiteAVTexture5.f46518xc35d0396);
            }
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            int i27 = iArr[0];
            android.opengl.GLES20.glBindTexture(3553, i27);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, tXLiteAVTexture2.f46519x6be2dc6, tXLiteAVTexture2.f46517xb7389127, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
            android.opengl.GLES20.glBindTexture(3553, 0);
            tXLiteAVTexture5.f46518xc35d0396 = i27;
            tXLiteAVTexture5.f46519x6be2dc6 = tXLiteAVTexture2.f46519x6be2dc6;
            tXLiteAVTexture5.f46517xb7389127 = tXLiteAVTexture2.f46517xb7389127;
            tXLiteAVTexture5.f46516x77710645 = tXLiteAVTexture2.f46516x77710645;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SingleTextureCache", "checkResetCache newTextureId:" + i27 + ", width:" + tXLiteAVTexture5.f46519x6be2dc6 + ", height:" + tXLiteAVTexture5.f46517xb7389127 + ", eglContext:" + tXLiteAVTexture5.f46516x77710645);
        }
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture tXLiteAVTexture6 = b0Var.f420089a;
        if (tXLiteAVTexture6 != null) {
            int i28 = tXLiteAVTexture6.f46518xc35d0396;
            int i29 = tXLiteAVTexture2.f46518xc35d0396;
            int i37 = tXLiteAVTexture2.f46519x6be2dc6;
            int i38 = tXLiteAVTexture2.f46517xb7389127;
            int[] iArr2 = new int[1];
            android.opengl.GLES20.glGenFramebuffers(1, iArr2, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, iArr2[0]);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i29, 0);
            if (android.opengl.GLES20.glCheckFramebufferStatus(36160) != 36053) {
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr2, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SingleTextureCache", "GL_FRAMEBUFFER_COMPLETE failed.");
            } else {
                android.opengl.GLES20.glBindTexture(3553, i28);
                android.opengl.GLES20.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, i37, i38);
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glBindTexture(3553, 0);
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr2, 0);
            }
        }
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture tXLiteAVTexture7 = b0Var.f420089a;
        if (tXLiteAVTexture7 != null) {
            tXLiteAVTexture2 = tXLiteAVTexture7;
        }
        android.opengl.GLES20.glFinish();
        k(2, 0, tXLiteAVTexture2);
    }

    @Override // nn0.o
    public nn0.a pg() {
        return this.f420153s;
    }

    @Override // nn0.o
    /* renamed from: setPlayListener */
    public void mo149798xbdb2cd8a(com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "set listener " + interfaceC25479x1853e9c1);
        this.f420159y = interfaceC25479x1853e9c1;
    }

    @Override // nn0.o
    /* renamed from: setRenderMode */
    public void mo149799x638e3a5b(int i17) {
        this.C = i17;
        pn0.b bVar = this.f420146i;
        if (bVar != null) {
            bVar.mo158743x638e3a5b(i17);
        }
    }

    @Override // nn0.o
    /* renamed from: setRenderRotation */
    public void mo149800x4594f436(int i17) {
        this.D = i17;
        pn0.b bVar = this.f420146i;
        if (bVar != null) {
            bVar.mo158744x4594f436(i17);
        }
    }

    @Override // nn0.o
    /* renamed from: startPlay */
    public void mo149801x8113c2b6() {
        e();
        this.f420157w = false;
        g();
    }

    @Override // nn0.o
    /* renamed from: stopPlay */
    public void mo149802x66343656(boolean z17) {
        h(z17);
        nn0.b bVar = this.f420153s;
        synchronized (this.E) {
            if (this.f420145h != null) {
                this.f420154t = this.f420143f.getId();
            }
            if (bVar != null) {
                this.f420153s = null;
            }
            this.f420157w = false;
        }
        synchronized (this) {
            if (bVar != null) {
                nn0.q qVar = this.f420145h;
                if (qVar != null) {
                    qVar.obtainMessage(3, bVar).sendToTarget();
                }
            }
            l();
        }
    }

    @Override // nn0.o
    public void t3(android.graphics.RectF rectF) {
        this.f420160z = rectF;
        nn0.b bVar = this.f420153s;
        if (bVar != null) {
            bVar.s(rectF);
        }
    }

    @Override // nn0.o
    public void u(int i17, int i18) {
        pn0.b d17 = d();
        if (d17 != null) {
            d17.u(i17, i18);
        }
    }

    @Override // nn0.o
    public void v(android.view.Surface surface, int i17, int i18) {
        if (surface != null) {
            this.f420146i = new pn0.c(this, surface, i17, i18);
            this.f420147m = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420141d, "setOutsideSurface " + surface);
        }
    }

    @Override // nn0.o
    public void v3(android.graphics.SurfaceTexture surfaceTexture) {
        this.f420152r = surfaceTexture;
    }

    @Override // nn0.o
    public android.graphics.Bitmap yf(android.graphics.Bitmap.Config config) {
        int i17;
        int i18;
        pn0.b bVar = this.f420146i;
        if (bVar != null && (bVar instanceof pn0.h)) {
            if (((pn0.a) bVar).f438480k == null || ((pn0.a) bVar).f438480k.mo46536x4ee17f0a() == null) {
                return null;
            }
            return ((pn0.a) this.f420146i).f438480k.mo46536x4ee17f0a().getBitmap();
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.I;
        if (!atomicBoolean.get() && (i17 = this.F) != 0 && (i18 = this.G) != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/live/core/core/postprocessor/customrender/NewCustomRender", "getSurfaceViewFrameBitmap", "(Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/live/core/core/postprocessor/customrender/NewCustomRender", "getSurfaceViewFrameBitmap", "(Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.H = createBitmap;
            if (createBitmap == null || createBitmap.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f420141d, "getSurfaceViewFrameBitmap failed to create bitmap, size=%dx%d", java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(this.G));
                return null;
            }
            if (atomicBoolean.compareAndSet(false, true)) {
                this.T = java.lang.System.currentTimeMillis();
                k(1000, 1000, null);
            }
        }
        return this.H;
    }

    @Override // nn0.o
    public void z(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, int i17, int i18) {
        j4(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, null);
        u(i17, i18);
    }
}
