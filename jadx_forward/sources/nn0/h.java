package nn0;

/* loaded from: classes14.dex */
public class h implements nn0.o, com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXLivePlayVideoRenderListener, com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener {
    public nn0.b A;
    public final java.lang.Object C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public android.content.Context H;
    public com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f420095J;
    public boolean K;
    public android.graphics.RectF L;
    public android.graphics.RectF[] M;
    public int N;
    public long P;

    /* renamed from: r, reason: collision with root package name */
    public android.view.Surface f420107r;

    /* renamed from: y, reason: collision with root package name */
    public boolean f420114y;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f420096d = "CustomRender_" + hashCode();

    /* renamed from: e, reason: collision with root package name */
    public boolean f420097e = false;

    /* renamed from: f, reason: collision with root package name */
    public android.os.HandlerThread f420098f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f420099g = null;

    /* renamed from: h, reason: collision with root package name */
    public nn0.g f420100h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf f420101i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.view.TextureView f420102m = null;

    /* renamed from: n, reason: collision with root package name */
    public nn0.m f420103n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.SurfaceTexture f420104o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.SurfaceTexture f420105p = null;

    /* renamed from: q, reason: collision with root package name */
    public android.view.Surface f420106q = null;

    /* renamed from: s, reason: collision with root package name */
    public int f420108s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f420109t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f420110u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f420111v = 0;

    /* renamed from: w, reason: collision with root package name */
    public q05.c f420112w = null;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.SurfaceTexture f420113x = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f420115z = false;
    public long B = -1;

    public h(android.content.Context context) {
        this.f420114y = false;
        this.A = null;
        java.lang.Object obj = new java.lang.Object();
        this.C = obj;
        this.D = 1;
        this.E = 0;
        this.F = false;
        this.G = false;
        this.I = null;
        this.f420095J = false;
        this.K = false;
        this.L = new android.graphics.RectF(-1.0f, -1.0f, -1.0f, -1.0f);
        this.M = null;
        this.N = 0;
        this.H = context;
        this.f420114y = true;
        synchronized (obj) {
            this.A = new nn0.b();
        }
    }

    @Override // nn0.o
    public void B(boolean z17) {
        this.f420115z = z17;
    }

    @Override // nn0.o
    public void Bg(android.graphics.RectF[] rectFArr) {
        this.M = rectFArr;
        nn0.b bVar = this.A;
        if (bVar != null) {
            bVar.u(rectFArr);
        }
    }

    @Override // nn0.o
    public android.graphics.SurfaceTexture Da() {
        return this.f420113x;
    }

    @Override // nn0.o
    public void Gg(pn0.b bVar) {
    }

    @Override // nn0.o
    public void O2(pn0.b bVar) {
    }

    public boolean a(nn0.b bVar, java.lang.Object obj) {
        if (bVar == null || !bVar.f420085w || !bVar.w(obj)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "shared eglcontext changed!");
        b(bVar);
        this.G = false;
        return true;
    }

    public void b(nn0.b bVar) {
        android.content.Context context;
        if (bVar == null || !bVar.f420085w) {
            return;
        }
        try {
            bVar.p();
            q05.c cVar = this.f420112w;
            if (cVar != null) {
                cVar.a();
                this.f420112w = null;
            }
            bVar.y();
            if (this.N == 1 && (context = this.H) != null) {
                bVar.z(context);
            }
            synchronized (this.C) {
                if (this.A == bVar) {
                    this.A = null;
                    this.G = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f420096d, "mCustomGLRenderImp != customGLRenderImp");
                }
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f420096d, "destroyInternal error");
            synchronized (this.C) {
                if (this.A == bVar) {
                    this.A = null;
                    this.G = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f420096d, "mCustomGLRenderImp != customGLRenderImp");
                }
            }
        }
    }

    @Override // nn0.o
    public void bc(ps0.a aVar) {
        nn0.b bVar = this.A;
        if (bVar != null) {
            if (aVar != null) {
                ((go0.w1) aVar).e(this.f420099g);
            }
            bVar.R = aVar;
        }
    }

    public void c() {
        i();
        this.K = true;
        synchronized (this) {
            java.lang.String str = "GL.CustomRender_" + java.util.concurrent.ThreadLocalRandom.current().nextInt(0, 10000);
            int i17 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a(str, 10);
            this.f420098f = a17;
            a17.start();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "CustomRender mGLThread start " + this.f420098f.isAlive() + " threadName = " + str + "@" + hashCode());
            this.f420099g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f420098f.getLooper());
            this.f420100h = new nn0.g(this.f420098f.getLooper(), this);
        }
    }

    public void d() {
        this.F = true;
        this.f420114y = true;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.f420101i;
        int i17 = 0;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.m94617x2f1ab5b7();
            this.f420101i.setVisibility(0);
        }
        android.view.TextureView textureView = this.f420102m;
        if (textureView != null) {
            textureView.setVisibility(0);
        }
        boolean bj6 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
        int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
        int Ni = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        zl2.r4 r4Var = zl2.r4.f555483a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85442w3).mo141623x754a37bb()).r()).intValue() == 1;
        if (bj6 && z17) {
            this.P = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).wi();
            i17 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).aj(this.P, Di, Ni, 3, 48000, 2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "WaveHAid, enable:%s, type:%s, device:%s, result:%s", java.lang.Boolean.valueOf(bj6), java.lang.Integer.valueOf(Di), java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(i17));
    }

    @Override // nn0.o
    public void d1(boolean z17) {
        nn0.b bVar = this.A;
        if (bVar != null) {
            bVar.v(z17);
        }
    }

    public void e(boolean z17) {
        if (!this.f420115z || z17) {
            this.f420114y = false;
        } else {
            this.f420114y = true;
        }
        this.f420115z = false;
        this.F = false;
        this.f420095J = false;
        this.f420113x = null;
        if (z17) {
            com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.f420101i;
            if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
                scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.setVisibility(8);
            }
            android.view.TextureView textureView = this.f420102m;
            if (textureView != null) {
                textureView.setVisibility(8);
            }
        }
        if (this.P != 0) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Bi(this.P);
            this.P = 0L;
        }
    }

    @Override // nn0.o
    public void f(boolean z17) {
        mo149802x66343656(z17);
    }

    /* renamed from: finalize */
    public void m149795xd764dc1e() {
        i();
        this.H = null;
        this.I = null;
        this.P = 0L;
    }

    public void g(nn0.b bVar, android.graphics.SurfaceTexture surfaceTexture) {
        b(bVar);
        this.G = false;
    }

    @Override // nn0.o
    /* renamed from: getVideoHeight */
    public int mo149796x463504c() {
        return 0;
    }

    @Override // nn0.o
    /* renamed from: getVideoWidth */
    public int mo149797x8d5c7601() {
        return 0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:22|(3:24|(1:26)|27)|28|(1:30)|31|54|36|(5:104|105|(1:107)(1:112)|108|109)|38|(3:40|(1:98)(1:44)|(3:46|47|(1:49)(8:50|(3:52|(1:54)(1:(1:57)(1:58))|55)|59|(4:63|(2:79|80)|65|(4:67|(2:69|(1:71)(2:72|(1:74)))|75|76))|83|(1:85)(1:94)|86|(1:92)(2:90|91))))|99|100|101|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00c7, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r12.f420096d, "renderInternal makeCurrent error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00a0, code lost:
    
        if (r8.f420085w == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture r13) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn0.h.h(com.tencent.rtmp.TXLivePlayer$TXLiteAVTexture):void");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 2) {
            h((com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture) message.obj);
            return false;
        }
        if (i17 != 3) {
            return false;
        }
        java.lang.Object obj = message.obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "MSG_DESTROY customRenderImpl = " + obj + " mCustomGLRenderImp = " + this.A);
        if (obj instanceof nn0.b) {
            b((nn0.b) obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "MSG_DESTROY");
        return false;
    }

    @Override // nn0.o
    public void he(android.graphics.RectF rectF) {
    }

    public void i() {
        synchronized (this) {
            android.os.HandlerThread handlerThread = this.f420098f;
            if (handlerThread != null && handlerThread.isAlive()) {
                this.f420098f.quitSafely();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "CustomRender mGLThread quit");
            }
            this.f420099g = null;
            this.f420100h = null;
            this.f420098f = null;
        }
    }

    @Override // nn0.o
    public void j4(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, nn0.c0 c0Var) {
        android.view.TextureView mo46536x4ee17f0a;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2 = this.f420101i;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2 != null && scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2 != scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf && (mo46536x4ee17f0a = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2.mo46536x4ee17f0a()) != null) {
            this.f420101i.removeView(mo46536x4ee17f0a);
        }
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf3 = this.f420101i;
        if ((scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf3 == null && scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) || (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf3 != null && !scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf3.equals(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf))) {
            this.f420095J = false;
        }
        this.f420101i = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            android.view.TextureView mo46536x4ee17f0a2 = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46536x4ee17f0a();
            this.f420102m = mo46536x4ee17f0a2;
            if (mo46536x4ee17f0a2 == null) {
                this.f420102m = new android.view.TextureView(this.f420101i.getContext());
            }
            this.f420102m.setOpaque(false);
            this.f420102m.setTransform(new android.graphics.Matrix());
            this.f420102m.setScaleX(1.0f);
            this.f420102m.setScaleY(1.0f);
            this.f420102m.setRotation(0.0f);
            if (this.f420102m.getParent() != null && (this.f420102m.getParent() instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) this.f420102m.getParent()).removeView(this.f420102m);
            }
            this.f420101i.mo46533x473bda1f(this.f420102m);
        }
        android.view.TextureView textureView = this.f420102m;
        if (textureView != null && this.f420113x == null) {
            textureView.setSurfaceTextureListener(null);
        }
        if (this.f420102m.getWidth() != 0 && this.f420102m.getHeight() != 0) {
            this.f420104o = this.f420102m.getSurfaceTexture();
            this.f420108s = this.f420102m.getWidth();
            this.f420109t = this.f420102m.getHeight();
        }
        android.view.TextureView textureView2 = this.f420102m;
        if (textureView2 != null && this.N != 1) {
            this.f420108s = textureView2.getWidth();
            this.f420109t = this.f420102m.getHeight();
            nn0.m mVar = new nn0.m(this.f420102m);
            this.f420103n = mVar;
            mVar.f(this.f420110u, this.f420111v);
            this.f420103n.g(this.f420108s, this.f420109t);
            this.f420103n.b(this.D);
            this.f420103n.d(this.E % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
        }
        this.f420102m.setSurfaceTextureListener(new nn0.d(this));
        if (this.f420113x != null) {
            android.graphics.SurfaceTexture surfaceTexture = this.f420102m.getSurfaceTexture();
            android.graphics.SurfaceTexture surfaceTexture2 = this.f420113x;
            if (surfaceTexture == surfaceTexture2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "not setSurfaceTexture old surfaceTexture " + this.f420102m.getSurfaceTexture() + ", new surfaceTexture " + this.f420113x);
                return;
            }
            try {
                this.f420102m.setSurfaceTexture(surfaceTexture2);
                this.f420104o = this.f420113x;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "setSurfaceTexture error " + e17);
                this.f420104o = this.f420102m.getSurfaceTexture();
            }
        }
    }

    @Override // nn0.o
    public void le(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f420105p = surfaceTexture;
        u(i17, i18);
    }

    @Override // nn0.o
    public void n7(int i17) {
        this.N = i17;
        this.G = false;
        nn0.b bVar = this.A;
        if (bVar != null) {
            if (i17 == 1) {
                bVar.m(this.H);
            } else {
                bVar.z(this.H);
            }
        }
        if (this.N == 2) {
            this.f420097e = true;
        }
    }

    @Override // nn0.o
    public com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf o1() {
        return null;
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener
    /* renamed from: onAudioInfoChanged */
    public void mo94540xb9e6b46f(int i17, int i18, int i19) {
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener
    /* renamed from: onPcmDataAvailable */
    public void mo94541xe5629f84(byte[] bArr, long j17) {
        if (this.P == 0 || bArr.length <= 0) {
            return;
        }
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[bArr.length];
        wd0.l1 l1Var = (wd0.l1) i95.n0.c(wd0.l1.class);
        long j18 = this.P;
        ((u14.t) l1Var).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17488x7dde8191.m68993x50c5b64f(j18, bArr, bArr2, length) == 0) {
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXLivePlayVideoRenderListener
    /* renamed from: onRenderVideoFrame */
    public void mo94543x3cf387e7(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture tXLiteAVTexture) {
        int i17 = tXLiteAVTexture.f46519x6be2dc6;
        int i18 = tXLiteAVTexture.f46517xb7389127;
        if (this.f420110u != i17 || this.f420111v != i18) {
            this.f420110u = i17;
            this.f420111v = i18;
            nn0.m mVar = this.f420103n;
            if (mVar != null && this.N != 1) {
                mVar.f(i17, i18);
            }
        }
        android.opengl.GLES20.glFinish();
        synchronized (this) {
            nn0.g gVar = this.f420100h;
            if (gVar != null) {
                gVar.obtainMessage(2, tXLiteAVTexture).sendToTarget();
            }
        }
    }

    @Override // nn0.o
    public nn0.a pg() {
        return this.A;
    }

    @Override // nn0.o
    /* renamed from: setPlayListener */
    public void mo149798xbdb2cd8a(com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "set listener " + interfaceC25479x1853e9c1);
        this.I = interfaceC25479x1853e9c1;
    }

    @Override // nn0.o
    /* renamed from: setRenderMode */
    public void mo149799x638e3a5b(int i17) {
        this.D = i17;
        nn0.m mVar = this.f420103n;
        if (mVar == null || this.N == 1) {
            return;
        }
        mVar.b(i17);
    }

    @Override // nn0.o
    /* renamed from: setRenderRotation */
    public void mo149800x4594f436(int i17) {
        this.E = i17;
        nn0.m mVar = this.f420103n;
        if (mVar == null || this.N == 1) {
            return;
        }
        mVar.d(i17 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
    }

    @Override // nn0.o
    /* renamed from: startPlay */
    public void mo149801x8113c2b6() {
        c();
        this.G = false;
        d();
    }

    @Override // nn0.o
    /* renamed from: stopPlay */
    public void mo149802x66343656(boolean z17) {
        e(z17);
        nn0.b bVar = this.A;
        synchronized (this.C) {
            if (this.f420100h != null) {
                this.B = this.f420098f.getId();
            }
            if (bVar != null) {
                this.A = null;
            }
            this.G = false;
        }
        synchronized (this) {
            if (bVar != null) {
                nn0.g gVar = this.f420100h;
                if (gVar != null) {
                    gVar.obtainMessage(3, bVar).sendToTarget();
                }
            }
        }
        i();
    }

    @Override // nn0.o
    public void t3(android.graphics.RectF rectF) {
        this.L = rectF;
        nn0.b bVar = this.A;
        if (bVar != null) {
            bVar.s(rectF);
        }
    }

    @Override // nn0.o
    public void u(int i17, int i18) {
        if (i17 == this.f420108s && i18 == this.f420109t) {
            return;
        }
        this.f420108s = i17;
        this.f420109t = i18;
        nn0.m mVar = this.f420103n;
        if (mVar == null || this.N == 1) {
            return;
        }
        mVar.g(i17, i18);
    }

    @Override // nn0.o
    public void v(android.view.Surface surface, int i17, int i18) {
        this.f420106q = surface;
        u(i17, i18);
    }

    @Override // nn0.o
    public void v3(android.graphics.SurfaceTexture surfaceTexture) {
        this.f420113x = surfaceTexture;
    }

    @Override // nn0.o
    public android.graphics.Bitmap yf(android.graphics.Bitmap.Config config) {
        return null;
    }

    @Override // nn0.o
    public void z(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, int i17, int i18) {
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2 = this.f420101i;
        if ((scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2 == null && scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) || (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2 != null && !scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2.equals(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf))) {
            this.f420095J = false;
        }
        this.f420101i = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            android.view.TextureView mo46536x4ee17f0a = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46536x4ee17f0a();
            this.f420102m = mo46536x4ee17f0a;
            if (mo46536x4ee17f0a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f420096d, "switchPlayerViewImmediately, mTextureView is null!!");
                return;
            }
            mo46536x4ee17f0a.setOpaque(false);
            this.f420102m.setTransform(new android.graphics.Matrix());
            this.f420102m.setScaleX(1.0f);
            this.f420102m.setScaleY(1.0f);
            this.f420102m.setRotation(0.0f);
            android.view.TextureView textureView = this.f420102m;
            if (textureView != null && this.f420113x == null) {
                textureView.setSurfaceTextureListener(null);
            }
            android.view.TextureView textureView2 = this.f420102m;
            if (textureView2 != null && this.N != 1) {
                this.f420108s = textureView2.getWidth();
                this.f420109t = this.f420102m.getHeight();
                nn0.m mVar = new nn0.m(this.f420102m);
                this.f420103n = mVar;
                mVar.f(this.f420110u, this.f420111v);
                this.f420103n.g(this.f420108s, this.f420109t);
                this.f420103n.b(this.D);
                this.f420103n.d(this.E % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
            }
            this.f420102m.setSurfaceTextureListener(new nn0.e(this));
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f420102m.getSurfaceTexture();
        android.graphics.SurfaceTexture surfaceTexture2 = this.f420113x;
        if (surfaceTexture2 == null || surfaceTexture == surfaceTexture2) {
            this.f420104o = surfaceTexture;
        } else {
            try {
                this.f420102m.setSurfaceTexture(surfaceTexture2);
                this.f420104o = this.f420113x;
                this.f420113x = null;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "setSurfaceTexture error onSurfacetextureAvailable " + e17);
                this.f420104o = surfaceTexture;
            }
        }
        this.f420105p = null;
        this.f420106q = null;
        this.K = true;
        u(i17, i18);
    }
}
