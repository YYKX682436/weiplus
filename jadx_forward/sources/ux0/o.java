package ux0;

/* loaded from: classes14.dex */
public final class o implements ux0.d, android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f513358d;

    /* renamed from: e, reason: collision with root package name */
    public volatile android.view.Surface f513359e;

    /* renamed from: f, reason: collision with root package name */
    public pp0.p0 f513360f;

    /* renamed from: g, reason: collision with root package name */
    public rs0.h f513361g;

    /* renamed from: h, reason: collision with root package name */
    public is0.c f513362h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.SurfaceTexture f513363i;

    /* renamed from: m, reason: collision with root package name */
    public ux0.i f513364m;

    /* renamed from: n, reason: collision with root package name */
    public ux0.h f513365n;

    /* renamed from: o, reason: collision with root package name */
    public ux0.h f513366o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f513368q;

    /* renamed from: s, reason: collision with root package name */
    public final android.os.HandlerThread f513370s;

    /* renamed from: t, reason: collision with root package name */
    public final android.os.Handler f513371t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f513372u;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f513367p = new java.lang.Object();

    /* renamed from: r, reason: collision with root package name */
    public xr0.j f513369r = new xr0.j(0, 0);

    public o(int i17) {
        this.f513358d = i17;
        int i18 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("ShootComposing-Use", -2);
        this.f513370s = a17;
        this.f513372u = new java.util.ArrayList();
        a17.start();
        this.f513371t = new android.os.Handler(a17.getLooper());
    }

    public static final void e(ux0.o oVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) oVar.f513372u;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ux0.c) it.next()).f513318a.close();
        }
        arrayList.clear();
        ux0.i iVar = oVar.f513364m;
        if (iVar != null) {
            for (ux0.c cVar : iVar.f513346b) {
                cVar.f513318a.close();
            }
        }
        oVar.f513364m = null;
        ux0.h hVar = oVar.f513365n;
        if (hVar != null) {
            int[] iArr = hVar.f513336d;
            if (iArr[0] != 0) {
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr, 0);
                iArr[0] = 0;
            }
            int i17 = hVar.f513337e;
            if (i17 != 0) {
                android.opengl.GLES20.glDeleteProgram(i17);
                hVar.f513337e = 0;
            }
        }
        oVar.f513365n = null;
        ux0.h hVar2 = oVar.f513366o;
        if (hVar2 != null) {
            int[] iArr2 = hVar2.f513336d;
            if (iArr2[0] != 0) {
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr2, 0);
                iArr2[0] = 0;
            }
            int i18 = hVar2.f513337e;
            if (i18 != 0) {
                android.opengl.GLES20.glDeleteProgram(i18);
                hVar2.f513337e = 0;
            }
        }
        oVar.f513366o = null;
        is0.c cVar2 = oVar.f513362h;
        if (cVar2 != null) {
            cVar2.close();
        }
        oVar.f513362h = null;
        rs0.h hVar3 = oVar.f513361g;
        if (hVar3 != null) {
            rs0.i.f480829a.u(hVar3);
            oVar.f513361g = null;
        }
    }

    public static final void f(ux0.o oVar, pp0.p0 p0Var, xr0.j jVar) {
        synchronized (oVar.f513367p) {
            oVar.f513368q = false;
        }
        oVar.f513361g = rs0.i.f480829a.m(null, null, 1, 1, p0Var.J0());
        oVar.f513362h = new is0.c(false, 24L);
        is0.c cVar = oVar.f513362h;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar != null ? cVar.f375928e : 0);
        surfaceTexture.setDefaultBufferSize(jVar.f537706a, jVar.f537707b);
        surfaceTexture.setOnFrameAvailableListener(oVar, oVar.f513371t);
        oVar.f513363i = surfaceTexture;
        oVar.f513359e = new android.view.Surface(oVar.f513363i);
        oVar.f513364m = new ux0.i(oVar.f513358d, jVar);
        oVar.f513365n = new ux0.h(ux0.g.TEXTURE_OES, true);
    }

    @Override // ux0.d
    public void a(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 frame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frame, "frame");
        if (!(frame instanceof ux0.c)) {
            throw new java.lang.IllegalArgumentException("frame is not CamSessionTextureVideoFrame");
        }
        this.f513371t.post(new ux0.m(this, frame));
    }

    @Override // ux0.d
    public java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        this.f513371t.post(new ux0.j(this, nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    @Override // ux0.d
    public void c() {
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ux0.n nVar = new ux0.n(this);
            android.os.HandlerThread handlerThread = this.f513370s;
            if (handlerThread.isAlive()) {
                this.f513371t.post(nVar);
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(handlerThread.quitSafely()));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }

    @Override // ux0.d
    public void d(pp0.p0 camManager, xr0.j frameSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camManager, "camManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSize, "frameSize");
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        ux0.k kVar = new ux0.k(countDownLatch, this, frameSize, camManager);
        if (this.f513370s.isAlive()) {
            this.f513371t.post(kVar);
        }
        countDownLatch.await();
    }

    @Override // ux0.d
    /* renamed from: getSurface */
    public android.view.Surface mo170672xcf572877() {
        return this.f513359e;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.Object m143895xf1229813;
        ux0.c cVar;
        int i17;
        int i18;
        xr0.j jVar;
        synchronized (this.f513367p) {
            if (surfaceTexture == null) {
                return;
            }
            if (this.f513361g == null) {
                return;
            }
            if (this.f513368q) {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    surfaceTexture.updateTexImage();
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                return;
            }
            ux0.h hVar = this.f513365n;
            if (hVar == null) {
                return;
            }
            ux0.i iVar = this.f513364m;
            if (iVar == null) {
                return;
            }
            pp0.p0 p0Var = this.f513360f;
            if (p0Var == null) {
                return;
            }
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                surfaceTexture.updateTexImage();
                surfaceTexture.getTransformMatrix(hVar.f513335c);
                iVar.f513346b[iVar.f513347c].a();
                int i19 = iVar.f513347c;
                iVar.f513347c = (i19 + 1) % iVar.f513345a;
                cVar = iVar.f513346b[i19];
                cVar.f513319b = surfaceTexture.getTimestamp();
                is0.c cVar2 = this.f513362h;
                i17 = cVar2 != null ? cVar2.f375928e : 0;
                i18 = cVar.f513318a.f375928e;
                jVar = this.f513369r;
            } catch (java.lang.Throwable th7) {
                p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
            }
            if (!hVar.c(i17, i18, jVar.f537706a, jVar.f537707b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextureVideoFrameSender", "Failed to render texture");
                return;
            }
            cVar.f513320c = android.opengl.GLES30.glFenceSync(37143, 0);
            android.opengl.GLES20.glFlush();
            p0Var.d0(cVar);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextureVideoFrameSender", "Failed to render: " + m143898xd4a2fc34);
            }
            return;
        }
    }

    @Override // ux0.d
    /* renamed from: onPause */
    public void mo170673xb01dfb57() {
        synchronized (this.f513367p) {
            this.f513368q = true;
        }
    }

    @Override // ux0.d
    /* renamed from: onResume */
    public void mo170674x57429eec() {
        synchronized (this.f513367p) {
            this.f513368q = false;
        }
    }

    @Override // ux0.d
    /* renamed from: release */
    public void mo170675x41012807() {
        ux0.l lVar = new ux0.l(this);
        if (this.f513370s.isAlive()) {
            this.f513371t.post(lVar);
        }
    }
}
