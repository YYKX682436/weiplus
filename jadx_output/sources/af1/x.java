package af1;

/* loaded from: classes15.dex */
public class x extends ye1.a {
    public af1.h A;
    public cf1.e B;
    public android.os.Handler C;
    public android.os.HandlerThread D;
    public ye1.w E;
    public int F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f4501J;
    public volatile boolean K;
    public final java.util.concurrent.atomic.AtomicBoolean L;
    public final java.util.concurrent.atomic.AtomicBoolean M;
    public float N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public o8.f V;
    public o8.f W;
    public volatile boolean X;
    public volatile boolean Y;

    /* renamed from: q, reason: collision with root package name */
    public android.content.Context f4502q;

    /* renamed from: r, reason: collision with root package name */
    public m8.i f4503r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.Surface f4504s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4505t;

    /* renamed from: u, reason: collision with root package name */
    public af1.w f4506u;

    /* renamed from: v, reason: collision with root package name */
    public d9.a0 f4507v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f4508w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f4509x;

    /* renamed from: y, reason: collision with root package name */
    public m8.f f4510y;

    /* renamed from: z, reason: collision with root package name */
    public af1.n f4511z;

    public x(android.os.Handler handler) {
        this(handler, 0, 0.75f, 10000, 25000, 15000, 30000, 2500, 5000);
    }

    @Override // ye1.a
    public boolean G(int i17, int i18) {
        boolean G = super.G(i17, i18);
        oe1.q1 Q = Q();
        if (Q != null) {
            Q.t5(this.f4508w);
        }
        this.Y = true;
        this.U = 0;
        return G;
    }

    public final boolean M() {
        return this.f4503r != null;
    }

    public int N(android.net.Uri uri) {
        if (uri != null) {
            java.lang.String uri2 = uri.toString();
            if (uri2.contains(".m3u8") || uri2.contains(".m3u")) {
                return 2;
            }
        }
        return 3;
    }

    public r9.j O(java.util.Map map) {
        if (map == null && !oe1.v1.h().f344748e) {
            oe1.q1 Q = Q();
            r9.j G4 = Q != null ? Q.G4() : null;
            if (G4 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "getDataSourceFactory, return customized data source factory");
                return G4;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "getDataSourceFactory, return default data source factory");
        return af1.z.a(this.f4502q, map);
    }

    public q8.h P() {
        return new af1.j();
    }

    public oe1.q1 Q() {
        return (oe1.q1) i95.n0.c(oe1.q1.class);
    }

    public final void R() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "iniMediaPlayer");
        cf1.e eVar = new cf1.e(af1.z.f4516a, 0, this.O, this.P, 25000, this.N);
        this.B = eVar;
        q9.h hVar = new q9.h(eVar);
        this.A = new af1.h(hVar);
        m8.c cVar = new m8.c(new r9.o(true, 65536), this.Q, this.R, this.S, this.T);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f4509x;
        m8.k kVar = new m8.k((m8.b0[]) arrayList.toArray(new m8.b0[arrayList.size()]), hVar, cVar);
        this.f4503r = kVar;
        kVar.f324577e.add(this.f4510y);
    }

    public void S() {
    }

    public void T() {
    }

    public final void U(int i17, int i18, java.lang.Object obj, boolean z17) {
        if (((java.util.ArrayList) this.f4509x).isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f4509x).iterator();
        while (it.hasNext()) {
            m8.b0 b0Var = (m8.b0) it.next();
            if (((m8.a) b0Var).f324535d == i17) {
                arrayList.add(new m8.h(b0Var, i18, obj));
            }
        }
        if (z17) {
            this.f4503r.b((m8.h[]) arrayList.toArray(new m8.h[arrayList.size()]));
        } else {
            this.f4503r.f((m8.h[]) arrayList.toArray(new m8.h[arrayList.size()]));
        }
    }

    public final void V(boolean z17) {
        if (!z17 || this.f461169h == null) {
            this.E.f461202a = false;
            return;
        }
        ye1.w wVar = this.E;
        if (wVar.f461202a) {
            return;
        }
        wVar.f461202a = true;
        ye1.w wVar2 = wVar.f461206e.f461201d;
        wVar2.f461204c.postDelayed(wVar2.f461206e, wVar2.f461203b);
    }

    @Override // ye1.e
    public void b(boolean z17) {
        this.I = z17;
    }

    @Override // ye1.e
    public void c(float f17, float f18) {
        U(1, 2, java.lang.Float.valueOf(f17), false);
    }

    @Override // ye1.e
    public boolean f(float f17) {
        if (!M()) {
            return false;
        }
        this.f4503r.a(new m8.y(f17, 1.0f));
        return true;
    }

    @Override // ye1.e
    public int getCurrentPosition() {
        if (M()) {
            return (int) this.f4503r.getCurrentPosition();
        }
        return 0;
    }

    @Override // ye1.e
    public int getDuration() {
        if (M()) {
            return (int) this.f4503r.getDuration();
        }
        return 0;
    }

    @Override // ye1.e
    public int getPlayerType() {
        return 2;
    }

    @Override // ye1.e
    public int getVideoHeight() {
        return this.G;
    }

    @Override // ye1.e
    public int getVideoWidth() {
        return this.F;
    }

    @Override // ye1.e
    public boolean isPlaying() {
        if (!M()) {
            return false;
        }
        int t17 = this.f4503r.t();
        return (t17 == 1 || t17 == 2 || t17 == 3) ? this.f4503r.c() : t17 == 4 && this.I;
    }

    @Override // ye1.e
    public ye1.e l(java.lang.Class cls) {
        af1.x xVar = af1.x.class.isAssignableFrom(cls) ? this : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "castTo, playerClass: %s, playerImpl: %s", cls, xVar);
        return xVar;
    }

    @Override // ye1.e
    public void m(java.lang.String str, java.lang.String str2) {
        x(str, str2, 0);
    }

    @Override // ye1.a, ye1.e
    public void n(double d17) {
        cf1.e eVar = this.B;
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AdavanceTrackSelection", "set#preferredPeakBitRate, value: " + d17);
        eVar.f40895h = d17;
        java.util.Iterator it = eVar.f40894g.iterator();
        while (it.hasNext()) {
            ((cf1.f) it.next()).f40903n = d17;
        }
    }

    @Override // ye1.e
    public void pause() {
        if (M()) {
            this.f4503r.e(false);
            this.f461162a = 3;
        }
    }

    @Override // ye1.e
    public void prepareAsync() {
        if (this.f4507v == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.ExoMediaPlayer", "prepareAsync, media source is null");
            return;
        }
        if (M()) {
            ((m8.k) this.f4503r).e(false);
            ((m8.k) this.f4503r).j(this.f4507v);
            this.X = true;
        }
    }

    @Override // ye1.e
    public void release() {
        this.K = true;
        if (M()) {
            V(false);
            if (M()) {
                this.f4503r.release();
                this.f4503r.d(this.f4510y);
                this.f4503r = null;
            }
            this.F = 0;
            this.G = 0;
            this.H = 0;
        }
        android.os.HandlerThread handlerThread = this.D;
        if (handlerThread != null) {
            handlerThread.quit();
            this.D = null;
        }
        android.view.Surface surface = this.f4504s;
        if (surface != null) {
            if (this.f4505t) {
                surface.release();
            }
            this.f4504s = null;
        }
        this.f461164c = null;
        this.f461165d = null;
        this.f461166e = null;
        this.f461167f = null;
        this.f461168g = null;
        this.f461169h = null;
        this.f461170i = null;
        this.f461162a = -2;
        this.f461163b = true;
    }

    @Override // ye1.e
    public void reset() {
        if (M()) {
            V(false);
            if (M()) {
                ((m8.k) this.f4503r).e(false);
                ((m8.k) this.f4503r).f324576d.f324649i.sendEmptyMessage(5);
            }
            this.I = false;
            this.H = 0;
            this.f4506u.f4500a = new int[]{1, 1, 1, 1};
            this.f461162a = 0;
        }
    }

    @Override // ye1.e
    public void seekTo(long j17) {
        if (M()) {
            this.f4503r.seekTo(j17);
            af1.w wVar = this.f4506u;
            wVar.c((wVar.f4500a[3] & com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHF_MASKPROC) != 0, 100);
            this.M.set(true);
        }
    }

    @Override // ye1.e
    public void setDataSource(java.lang.String str) {
        x(str, null, 0);
    }

    @Override // ye1.e
    public void setMute(boolean z17) {
        if (M()) {
            if (z17) {
                c(0.0f, 0.0f);
            } else {
                c(1.0f, 1.0f);
            }
        }
    }

    @Override // ye1.e
    public void setSurface(android.view.Surface surface) {
        if (M() && M()) {
            android.view.Surface surface2 = this.f4504s;
            if (surface2 == null || surface2 == surface || surface == null) {
                U(2, 1, surface, false);
            } else {
                if (this.f4505t) {
                    surface2.release();
                }
                U(2, 1, surface, true);
                long currentPosition = this.f4503r.getCurrentPosition();
                if (t9.d0.f416498a < 23) {
                    this.C.postDelayed(new af1.l(this, currentPosition), 200L);
                }
            }
            this.f4504s = surface;
            this.f4505t = false;
        }
    }

    @Override // ye1.e
    public void start() {
        if (M()) {
            if (this.f4503r.t() == 4) {
                this.f4503r.seekTo(0L);
            }
            this.f4503r.e(true);
            this.f461162a = 3;
            this.L.set(false);
        }
    }

    @Override // ye1.e
    public void stop() {
        if (!M() || this.L.getAndSet(true)) {
            return;
        }
        ((m8.k) this.f4503r).e(false);
        ((m8.k) this.f4503r).f324576d.f324649i.sendEmptyMessage(5);
        this.f461162a = 5;
    }

    @Override // ye1.a, ye1.e
    public void x(java.lang.String str, java.lang.String str2, int i17) {
        d9.a0 kVar;
        android.net.Uri parse = android.net.Uri.parse(str);
        int N = 2 == i17 ? 2 : N(parse);
        d9.a0 a0Var = null;
        java.util.Map singletonMap = str2 != null ? java.util.Collections.singletonMap("Referer", str2) : null;
        if (N == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "buildMediaSource, type:HLS, url:%s", parse);
            kVar = new g9.k(parse, af1.z.a(this.f4502q, singletonMap), this.C, this.f4511z);
        } else {
            if (N != 3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.ExoMediaPlayer", "buildMediaSource, unsupported type:" + N + ", url:" + parse);
                this.f4507v = a0Var;
                this.f4508w = str;
                this.U = 0;
                this.f461162a = 1;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "buildMediaSource, type:other, url:%s", parse);
            kVar = new d9.v(parse, O(singletonMap), P(), this.C, this.f4511z);
        }
        a0Var = kVar;
        this.f4507v = a0Var;
        this.f4508w = str;
        this.U = 0;
        this.f461162a = 1;
    }

    @Override // ye1.e
    public void y(java.lang.String str, int i17) {
        x(str, null, i17);
    }

    public x(android.os.Handler handler, int i17, float f17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f4508w = null;
        this.L = new java.util.concurrent.atomic.AtomicBoolean();
        this.M = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.N = 0.75f;
        this.O = 10000;
        this.P = 25000;
        this.Q = 15000;
        this.R = 30000;
        this.S = 2500;
        this.T = 5000;
        this.U = 0;
        this.V = null;
        this.W = null;
        this.X = false;
        this.Y = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "ExoMediaPlayer, handler = %s, maxInitBitrate = %s, bandFraction = %s, minDur = %s, maxDur = %s, minBuffer = %s, maxBuffer = %s, bufferForPlaybackMs:%s, bufferForPlaybackAfterRebufferMs:%s", handler, java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
        this.N = f17;
        this.O = i18;
        this.P = i19;
        this.Q = i27;
        this.R = i28;
        this.S = i29;
        this.T = i37;
        this.f4502q = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f4506u = new af1.w(null);
        if (handler != null) {
            this.C = handler;
        } else {
            int i38 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a("ExoMediaPlayer_HandlerThread", 5);
            this.D = a17;
            a17.start();
            this.C = new android.os.Handler(this.D.getLooper());
        }
        this.f4510y = new af1.u(this, null);
        this.f4511z = new af1.n(this, null);
        ye1.w wVar = new ye1.w(this.C);
        this.E = wVar;
        wVar.f461203b = 1000;
        wVar.f461205d = new af1.m(this, null);
        af1.v vVar = new af1.v(this, null);
        android.content.Context context = this.f4502q;
        android.os.Handler handler2 = this.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        y8.e eVar = y8.e.f459813a;
        arrayList2.add(new n8.b0(eVar, null, true, handler2, vVar, n8.d.a(context), new n8.f[0]));
        arrayList.addAll(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(new u9.i(context, eVar, 5000, null, false, handler2, vVar, 50));
        arrayList.addAll(arrayList3);
        this.f4509x = arrayList;
        if (handler != null && handler.getLooper() == android.os.Looper.myLooper()) {
            R();
            return;
        }
        this.C.post(new af1.k(this));
        synchronized (this) {
            while (this.f4503r == null) {
                try {
                    wait();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
    }
}
