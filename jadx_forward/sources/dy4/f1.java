package dy4;

/* loaded from: classes15.dex */
public final class f1 extends eg.a {
    public java.lang.String A;
    public java.lang.String B;
    public r45.n23 C;
    public java.lang.String D;
    public java.lang.String E;
    public sf.f F;
    public sf.e G;
    public boolean H;
    public volatile boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f326154J;
    public boolean K;
    public boolean L;
    public volatile boolean M;
    public boolean N;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public dy4.w U;
    public dg.d V;
    public final fg1.r0 W;
    public final dy4.h1 X;
    public java.util.concurrent.atomic.AtomicBoolean Y;
    public f25.m0 Z;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f326155g = jz5.h.b(new dy4.x(this));

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f326156h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.HandlerThread f326157i;

    /* renamed from: l1, reason: collision with root package name */
    public final jz5.g f326158l1;

    /* renamed from: m, reason: collision with root package name */
    public android.view.Surface f326159m;

    /* renamed from: n, reason: collision with root package name */
    public ye1.e f326160n;

    /* renamed from: o, reason: collision with root package name */
    public double f326161o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f326162p;

    /* renamed from: p0, reason: collision with root package name */
    public volatile sf.f f326163p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f326164q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f326165r;

    /* renamed from: s, reason: collision with root package name */
    public long f326166s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f326167t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f326168u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f326169v;

    /* renamed from: w, reason: collision with root package name */
    public int f326170w;

    /* renamed from: x, reason: collision with root package name */
    public int f326171x;

    /* renamed from: x0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0 f326172x0;

    /* renamed from: y, reason: collision with root package name */
    public int f326173y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f326174y0;

    /* renamed from: z, reason: collision with root package name */
    public int f326175z;

    public f1() {
        java.lang.String str = "WebViewVideoThread_" + java.lang.System.currentTimeMillis();
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(str, 5);
        this.f326157i = a17;
        this.f326161o = 1.0d;
        this.S = 1.0f;
        this.T = 1.0f;
        this.W = new fg1.r0();
        this.X = new dy4.h1();
        a17.start();
        this.f326156h = new android.os.Handler(a17.getLooper());
        this.f326158l1 = jz5.h.b(dy4.y.f326267d);
    }

    public static final void r(dy4.f1 f1Var) {
        f25.m0 m0Var = f1Var.Z;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        f1Var.Z = null;
    }

    public final boolean A(boolean z17, boolean z18) {
        dy4.w wVar;
        dy4.w wVar2;
        if (this.M && this.N) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(x(), "play, background not allow play");
            return true;
        }
        if (this.f326160n == null) {
            return false;
        }
        pm0.v.X(new dy4.a1(this));
        if (this.f326168u) {
            ye1.e eVar = this.f326160n;
            if (eVar != null && eVar.mo1856xc00617a4()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video play, video is playing");
                if (J() && (wVar2 = this.U) != null) {
                    wVar2.f(z17);
                }
                return true;
            }
        }
        if (!this.f326168u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video play, video not prepared yet, start until prepared");
            this.f326169v = true;
            return true;
        }
        ye1.e eVar2 = this.f326160n;
        if (eVar2 != null && eVar2.mo53293x75286adb() == 5) {
            if (!z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video has ended playing, do not restart");
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video play, video has stopped now, try prepare and start when prepared");
            B();
            this.f326169v = true;
            return true;
        }
        if (!this.L) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video play");
            if (this.f326160n != null) {
                if (J() && (wVar = this.U) != null) {
                    wVar.f(z17);
                }
                ye1.e eVar3 = this.f326160n;
                if (eVar3 != null) {
                    eVar3.mo1865x68ac462();
                }
            }
            return true;
        }
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video has ended playing, do not restart");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video play, video has ended playing, clear surface and start again");
        this.L = false;
        try {
            if (this.f326159m != null && this.f326168u) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "clearSurfaceTexture");
                android.view.Surface surface = this.f326159m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surface);
                u(surface);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(x(), e17, "clearSurfaceTexture error", new java.lang.Object[0]);
        }
        E(this.F);
        if (this.f326160n != null) {
            this.f326167t = true;
            I(this.A);
            java.lang.String x17 = x();
            java.lang.Object[] objArr = new java.lang.Object[1];
            ye1.e eVar4 = this.f326160n;
            objArr[0] = eVar4 != null ? java.lang.Integer.valueOf(eVar4.mo53293x75286adb()) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x17, "video play, media player state:%s", objArr);
            B();
            this.f326169v = true;
        }
        return true;
    }

    public final void B() {
        dy4.w wVar;
        if (this.f326160n != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video prepare async");
            if (J() && (wVar = this.U) != null) {
                wVar.g();
            }
            dy4.w wVar2 = this.U;
            if (wVar2 != null) {
                java.lang.String str = wVar2.f326248a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onStartDownloadReport");
                try {
                    wVar2.d("StartDownload", null);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onStartDownloadReport fail", e17);
                }
            }
            this.f326168u = false;
            this.f326169v = false;
            ye1.e eVar = this.f326160n;
            if (eVar != null) {
                eVar.mo1858x857611b5();
            }
            dy4.g1 g1Var = this.X.f326197a;
            if (g1Var.f326181d <= 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                g1Var.f326181d = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1379L, 20L, 1L, false);
            }
        }
    }

    public final void C() {
        nw4.k kVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video release");
        pm0.v.X(new dy4.c1(this));
        dy4.w wVar = this.U;
        if (wVar != null) {
            dy4.d dVar = wVar.f326249b;
            java.lang.Object obj = (dVar == null || (kVar = dVar.f326146a) == null) ? null : kVar.f422393a;
            dy4.b bVar = obj instanceof dy4.b ? (dy4.b) obj : null;
            if (bVar != null) {
                bVar.g0(wVar.f326256i);
            }
            z41.c cVar = wVar.f326259l;
            if (cVar != null) {
                cVar.disable();
            }
            android.database.ContentObserver contentObserver = wVar.f326260m;
            java.lang.String str = wVar.f326248a;
            if (contentObserver != null) {
                try {
                    android.content.ContentResolver contentResolver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();
                    android.database.ContentObserver contentObserver2 = wVar.f326260m;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentObserver2);
                    contentResolver.unregisterContentObserver(contentObserver2);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "unregisterContentObserver", new java.lang.Object[0]);
                }
            }
            android.content.BroadcastReceiver broadcastReceiver = wVar.f326261n;
            if (broadcastReceiver != null) {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(broadcastReceiver);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th7, "unregisterContentObserver", new java.lang.Object[0]);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k0 k0Var = wVar.f326262o;
            if (k0Var != null) {
                ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
                java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268518b;
                synchronized (arrayList) {
                    arrayList.remove(k0Var);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0 l0Var = wVar.f326263p;
            if (l0Var != null) {
                ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
                java.util.ArrayList arrayList2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268519c;
                synchronized (arrayList2) {
                    arrayList2.remove(l0Var);
                }
            }
        }
        K();
        D();
        dy4.w wVar2 = this.U;
        if (wVar2 != null) {
            wVar2.i();
        }
        this.U = null;
        if (this.V != null) {
            this.V = null;
        }
        android.view.Surface surface = this.f326159m;
        if (surface != null) {
            surface.release();
            this.f326159m = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video release handler thread");
        this.f326156h.removeCallbacksAndMessages(null);
        this.f326157i.quitSafely();
        dy4.w wVar3 = this.U;
        if (wVar3 != null) {
            dy4.d dVar2 = wVar3.f326249b;
            nw4.k kVar2 = dVar2 != null ? dVar2.f326146a : null;
            if (kVar2 != null) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                kVar2.f422393a = context;
            }
        }
        this.F = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0 l0Var2 = this.f326172x0;
        if (l0Var2 != null) {
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            java.util.ArrayList arrayList3 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268519c;
            synchronized (arrayList3) {
                arrayList3.remove(l0Var2);
            }
        }
    }

    public final synchronized void D() {
        if (this.f326160n != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "releaseMediaPlayer");
            ye1.e eVar = this.f326160n;
            if (eVar != null) {
                eVar.p(null);
            }
            ye1.e eVar2 = this.f326160n;
            if (eVar2 != null) {
                eVar2.r(null);
            }
            ye1.e eVar3 = this.f326160n;
            if (eVar3 != null) {
                eVar3.B(null);
            }
            ye1.e eVar4 = this.f326160n;
            if (eVar4 != null) {
                eVar4.z(null);
            }
            ye1.e eVar5 = this.f326160n;
            if (eVar5 != null) {
                eVar5.h(null);
            }
            ye1.e eVar6 = this.f326160n;
            if (eVar6 != null) {
                eVar6.g(null);
            }
            ye1.e eVar7 = this.f326160n;
            if (eVar7 != null) {
                eVar7.mo1866x360802();
            }
            ye1.e eVar8 = this.f326160n;
            if (eVar8 != null) {
                eVar8.mo1860x6761d4f();
            }
            ye1.e eVar9 = this.f326160n;
            if (eVar9 != null) {
                eVar9.mo1859x41012807();
            }
        }
        this.f326160n = null;
        this.I = false;
    }

    public final void E(sf.f fVar) {
        this.L = false;
        D();
        v(fVar);
        ye1.e eVar = this.f326160n;
        if (eVar != null) {
            eVar.mo1863x764d819b(this.K);
            if (this.f326159m != null) {
                if (this.M) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "applyMediaPlayerParams, setSurface, WebViewInBackground");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "applyMediaPlayerParams, setSurface");
                ye1.e eVar2 = this.f326160n;
                if (eVar2 != null) {
                    eVar2.mo1864x42c875eb(this.f326159m);
                }
            }
        }
    }

    public final boolean F(java.lang.Runnable runnable) {
        android.os.Handler handler = this.f326156h;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(handler.getLooper(), android.os.Looper.myLooper())) {
            runnable.run();
            return true;
        }
        handler.post(runnable);
        return true;
    }

    public final void G(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "bitmap recycle " + bitmap);
        bitmap.recycle();
    }

    public final void H(long j17) {
        dy4.w wVar;
        if (!this.f326168u || this.f326160n == null) {
            this.f326166s = j17;
            return;
        }
        if (J() && (wVar = this.U) != null) {
            wVar.g();
        }
        ye1.e eVar = this.f326160n;
        if (eVar != null) {
            this.f326164q = eVar != null ? eVar.mo1856xc00617a4() : false;
            long min = java.lang.Math.min(this.f326160n != null ? r0.mo1852x51e8b0a() : 0, java.lang.Math.max(0L, j17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "seek, position:%s, isPlaying:%s", java.lang.Long.valueOf(min), java.lang.Boolean.valueOf(this.f326164q));
            ye1.e eVar2 = this.f326160n;
            if (eVar2 != null) {
                eVar2.mo1861xc9fc1b13(min);
            }
        }
    }

    public final void I(java.lang.String str) {
        this.D = str;
        ye1.e eVar = this.f326160n;
        if (eVar != null) {
            eVar.y(str, this.P);
        }
        dy4.w wVar = this.U;
        if (wVar != null) {
            long q07 = oe1.v1.h().q0(str, 0L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(1379L, 6L, 1L, false);
            if (q07 > 0) {
                g0Var.mo68477x336bdfd8(1379L, 7L, 1L, false);
            }
            try {
                org.json.JSONObject c17 = wVar.c();
                c17.put("preloadSize", q07);
                wVar.a("onVideoPreLoadedMetaData", c17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(wVar.f326248a, "onVideoPreLoadedMetaData fail", e17);
            }
        }
    }

    public final synchronized boolean J() {
        boolean z17;
        if (this.H) {
            z17 = this.U != null;
        }
        return z17;
    }

    public final boolean K() {
        dy4.w wVar;
        pm0.v.X(new dy4.d1(this));
        ye1.e eVar = this.f326160n;
        if (eVar == null) {
            return false;
        }
        sf.f fVar = this.F;
        dy4.h1 h1Var = this.X;
        h1Var.getClass();
        dy4.g1 g1Var = h1Var.f326197a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g1Var.f326193p) && g1Var.f326181d > 0) {
            g1Var.f326188k = java.lang.System.currentTimeMillis();
            h1Var.b(fVar, eVar, "onMediaPlayerVideoStop");
        }
        if (!this.f326168u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video stop, video not prepared yet, stop video when prepared");
            this.f326169v = false;
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video stop");
        eVar.mo1866x360802();
        if (J() && (wVar = this.U) != null) {
            wVar.e(true);
        }
        return true;
    }

    @Override // eg.b
    public boolean b(sf.f invokeContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        return true;
    }

    @Override // eg.a, eg.b
    public void e() {
        F(new dy4.m0(this));
    }

    @Override // eg.b
    public java.lang.String f(sf.f invokeContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        F(new dy4.j0(invokeContext, this));
        return null;
    }

    @Override // eg.a, eg.b
    public void i(android.view.Surface surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        F(new dy4.n0(this, surface));
    }

    @Override // eg.a, eg.b
    public void k(android.graphics.Bitmap bitmap) {
        int i17;
        sf.f fVar = this.f326163p0;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(x(), "handlePluginScreenshotTaken, invokeContext is null");
            return;
        }
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(x(), "handlePluginScreenshotTaken, bitmap is null");
            fVar.g("fail");
            return;
        }
        int i18 = this.Q;
        android.graphics.Bitmap createScaledBitmap = (i18 == 0 || (i17 = this.R) == 0) ? bitmap : android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (this.S * i18), (int) (this.T * i17), false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(createScaledBitmap);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        createScaledBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        byte[] encode = android.util.Base64.encode(byteArrayOutputStream.toByteArray(), 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
        java.lang.String str = new java.lang.String(encode, UTF_8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "handlePluginScreenshotTaken size=" + str.length());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("image", str);
        fVar.h("ok", hashMap);
        G(bitmap);
        G(createScaledBitmap);
        this.f326163p0 = null;
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        i(new android.view.Surface(surfaceTexture));
    }

    public final void s() {
        fg1.r0 r0Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.E)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "adjust objectFit, no video objectFit");
            return;
        }
        if (!this.f326168u || this.f334032f == null || (r0Var = this.W) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "adjust objectFit, video not prepared");
            return;
        }
        if (r0Var.a(this.E, this.Q, this.R, this.f326170w, this.f326171x)) {
            fg1.r0 r0Var2 = this.W;
            this.S = r0Var2.f343421h;
            this.T = r0Var2.f343422i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "adjust objectFit:%s, scale:[%s, %s]", this.E, java.lang.Float.valueOf(this.S), java.lang.Float.valueOf(this.T));
            sf.i.c(this.f334032f, this.f334031e, this.f334030d, this.S, this.T);
        }
    }

    public final void t(sf.f fVar) {
        w(fVar);
        ku5.u0 u0Var = ku5.t0.f394148d;
        dy4.z zVar = new dy4.z(this, fVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(zVar, 2000L, false);
    }

    public final void u(android.view.Surface surface) {
        javax.microedition.khronos.egl.EGL egl = javax.microedition.khronos.egl.EGLContext.getEGL();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) egl;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, null);
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
        egl10.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, eGLConfigArr, 1, new int[1]);
        javax.microedition.khronos.egl.EGLConfig eGLConfig = eGLConfigArr[0];
        javax.microedition.khronos.egl.EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = egl10.eglCreateWindowSurface(eglGetDisplay, eGLConfig, surface, new int[]{12344});
        egl10.eglMakeCurrent(eglGetDisplay, eglCreateWindowSurface, eglCreateWindowSurface, eglCreateContext);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        egl10.eglSwapBuffers(eglGetDisplay, eglCreateWindowSurface);
        egl10.eglDestroySurface(eglGetDisplay, eglCreateWindowSurface);
        javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
        egl10.eglTerminate(eglGetDisplay);
    }

    public final void v(sf.f fVar) {
        ye1.e wVar;
        org.json.JSONObject c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "createMediaPlayer");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if ((fVar == null || (c17 = fVar.c()) == null) ? false : c17.has("localFeedId")) {
            wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.v();
        } else {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.w(context);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "createMediaPlayer cost %s", java.lang.Long.valueOf(currentTimeMillis2));
        dy4.h1 h1Var = this.X;
        h1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(1379L, 10L, 1L, false);
        g0Var.mo68477x336bdfd8(1379L, 11L, currentTimeMillis2, false);
        h1Var.f326197a.f326178a = currentTimeMillis2;
        this.f326160n = wVar;
        this.f326161o = 1.0d;
        this.I = true;
        if (!this.I) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(x(), "createMediaPlayer, create media player fail");
            return;
        }
        ye1.e eVar = this.f326160n;
        if (eVar != null) {
            eVar.p(new dy4.a0(this));
        }
        ye1.e eVar2 = this.f326160n;
        if (eVar2 != null) {
            eVar2.r(new dy4.b0(this));
        }
        ye1.e eVar3 = this.f326160n;
        if (eVar3 != null) {
            eVar3.B(new dy4.c0(this));
        }
        ye1.e eVar4 = this.f326160n;
        if (eVar4 != null) {
            eVar4.z(new dy4.d0(this));
        }
        ye1.e eVar5 = this.f326160n;
        if (eVar5 != null) {
            eVar5.h(new dy4.e0(this));
        }
        ye1.e eVar6 = this.f326160n;
        if (eVar6 != null) {
            eVar6.g(new dy4.f0(this));
        }
        ye1.e eVar7 = this.f326160n;
        if (eVar7 != null) {
            eVar7.d(new dy4.g0(this));
        }
        ye1.e eVar8 = this.f326160n;
        if (eVar8 != null) {
            eVar8.q(new dy4.h0(this));
        }
        ye1.e eVar9 = this.f326160n;
        if (eVar9 != null) {
            eVar9.k(new dy4.i0(this));
        }
        dy4.w wVar2 = this.U;
        if (wVar2 != null) {
            java.lang.String str = wVar2.f326248a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onStartPlayerReport");
            try {
                wVar2.d("StartPlayer", null);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onStartPlayerReport fail", e17);
            }
        }
    }

    public final void w(sf.f fVar) {
        if (this.M || !(fVar.mo50272x76847179() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            return;
        }
        android.content.Context mo50272x76847179 = fVar.mo50272x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo50272x76847179, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        if (((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo50272x76847179).mo78538xecd98af8()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(x(), "checkPause, onBackGround");
            y();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1379L, 0L, 1L, false);
        }
    }

    public final java.lang.String x() {
        return (java.lang.String) ((jz5.n) this.f326155g).mo141623x754a37bb();
    }

    public final void y() {
        r45.n23 n23Var;
        if (!this.M) {
            java.lang.String str = this.B;
            if (!(str == null || str.length() == 0) && (n23Var = this.C) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.u.a(2, n23Var);
            }
        }
        this.M = true;
        x();
        pm0.v.X(new dy4.k0(this));
        F(new dy4.l0(this));
    }

    public final boolean z() {
        dy4.w wVar;
        pm0.v.X(new dy4.z0(this));
        ye1.e eVar = this.f326160n;
        if (eVar == null) {
            return false;
        }
        if (!this.f326168u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video pause, video not prepared yet, pause video when prepared");
            this.f326169v = false;
            return true;
        }
        if (!(eVar != null && eVar.mo1856xc00617a4())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video pause, video is not playing");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "video pause");
        ye1.e eVar2 = this.f326160n;
        if (eVar2 != null) {
            eVar2.mo1857x65825f6();
        }
        if (J() && (wVar = this.U) != null) {
            wVar.e(false);
        }
        return true;
    }
}
