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
    public boolean f86034J;
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
    public android.content.Context f86035q;

    /* renamed from: r, reason: collision with root package name */
    public m8.i f86036r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.Surface f86037s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f86038t;

    /* renamed from: u, reason: collision with root package name */
    public af1.w f86039u;

    /* renamed from: v, reason: collision with root package name */
    public d9.a0 f86040v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f86041w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f86042x;

    /* renamed from: y, reason: collision with root package name */
    public m8.f f86043y;

    /* renamed from: z, reason: collision with root package name */
    public af1.n f86044z;

    public x(android.os.Handler handler) {
        this(handler, 0, 0.75f, 10000, 25000, 15000, 30000, 2500, 5000);
    }

    @Override // ye1.a
    public boolean G(int i17, int i18) {
        boolean G = super.G(i17, i18);
        oe1.q1 Q = Q();
        if (Q != null) {
            Q.t5(this.f86041w);
        }
        this.Y = true;
        this.U = 0;
        return G;
    }

    public final boolean M() {
        return this.f86036r != null;
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
        if (map == null && !oe1.v1.h().f426281e) {
            oe1.q1 Q = Q();
            r9.j G4 = Q != null ? Q.G4() : null;
            if (G4 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "getDataSourceFactory, return customized data source factory");
                return G4;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "getDataSourceFactory, return default data source factory");
        return af1.z.a(this.f86035q, map);
    }

    public q8.h P() {
        return new af1.j();
    }

    public oe1.q1 Q() {
        return (oe1.q1) i95.n0.c(oe1.q1.class);
    }

    public final void R() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "iniMediaPlayer");
        cf1.e eVar = new cf1.e(af1.z.f86049a, 0, this.O, this.P, 25000, this.N);
        this.B = eVar;
        q9.h hVar = new q9.h(eVar);
        this.A = new af1.h(hVar);
        m8.c cVar = new m8.c(new r9.o(true, 65536), this.Q, this.R, this.S, this.T);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f86042x;
        m8.k kVar = new m8.k((m8.b0[]) arrayList.toArray(new m8.b0[arrayList.size()]), hVar, cVar);
        this.f86036r = kVar;
        kVar.f406110e.add(this.f86043y);
    }

    public void S() {
    }

    public void T() {
    }

    public final void U(int i17, int i18, java.lang.Object obj, boolean z17) {
        if (((java.util.ArrayList) this.f86042x).isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f86042x).iterator();
        while (it.hasNext()) {
            m8.b0 b0Var = (m8.b0) it.next();
            if (((m8.a) b0Var).f406068d == i17) {
                arrayList.add(new m8.h(b0Var, i18, obj));
            }
        }
        if (z17) {
            this.f86036r.b((m8.h[]) arrayList.toArray(new m8.h[arrayList.size()]));
        } else {
            this.f86036r.f((m8.h[]) arrayList.toArray(new m8.h[arrayList.size()]));
        }
    }

    public final void V(boolean z17) {
        if (!z17 || this.f542702h == null) {
            this.E.f542735a = false;
            return;
        }
        ye1.w wVar = this.E;
        if (wVar.f542735a) {
            return;
        }
        wVar.f542735a = true;
        ye1.w wVar2 = wVar.f542739e.f542734d;
        wVar2.f542737c.postDelayed(wVar2.f542739e, wVar2.f542736b);
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
        this.f86036r.a(new m8.y(f17, 1.0f));
        return true;
    }

    @Override // ye1.e
    /* renamed from: getCurrentPosition */
    public int mo1851x9746038c() {
        if (M()) {
            return (int) this.f86036r.mo146925x9746038c();
        }
        return 0;
    }

    @Override // ye1.e
    /* renamed from: getDuration */
    public int mo1852x51e8b0a() {
        if (M()) {
            return (int) this.f86036r.mo146926x51e8b0a();
        }
        return 0;
    }

    @Override // ye1.e
    /* renamed from: getPlayerType */
    public int mo1853x6b2cfdb1() {
        return 2;
    }

    @Override // ye1.e
    /* renamed from: getVideoHeight */
    public int mo1854x463504c() {
        return this.G;
    }

    @Override // ye1.e
    /* renamed from: getVideoWidth */
    public int mo1855x8d5c7601() {
        return this.F;
    }

    @Override // ye1.e
    /* renamed from: isPlaying */
    public boolean mo1856xc00617a4() {
        if (!M()) {
            return false;
        }
        int t17 = this.f86036r.t();
        return (t17 == 1 || t17 == 2 || t17 == 3) ? this.f86036r.c() : t17 == 4 && this.I;
    }

    @Override // ye1.e
    public ye1.e l(java.lang.Class cls) {
        af1.x xVar = af1.x.class.isAssignableFrom(cls) ? this : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "castTo, playerClass: %s, playerImpl: %s", cls, xVar);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdavanceTrackSelection", "set#preferredPeakBitRate, value: " + d17);
        eVar.f122428h = d17;
        java.util.Iterator it = eVar.f122427g.iterator();
        while (it.hasNext()) {
            ((cf1.f) it.next()).f122436n = d17;
        }
    }

    @Override // ye1.e
    /* renamed from: pause */
    public void mo1857x65825f6() {
        if (M()) {
            this.f86036r.e(false);
            this.f542695a = 3;
        }
    }

    @Override // ye1.e
    /* renamed from: prepareAsync */
    public void mo1858x857611b5() {
        if (this.f86040v == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.ExoMediaPlayer", "prepareAsync, media source is null");
            return;
        }
        if (M()) {
            ((m8.k) this.f86036r).e(false);
            ((m8.k) this.f86036r).j(this.f86040v);
            this.X = true;
        }
    }

    @Override // ye1.e
    /* renamed from: release */
    public void mo1859x41012807() {
        this.K = true;
        if (M()) {
            V(false);
            if (M()) {
                this.f86036r.mo146927x41012807();
                this.f86036r.d(this.f86043y);
                this.f86036r = null;
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
        android.view.Surface surface = this.f86037s;
        if (surface != null) {
            if (this.f86038t) {
                surface.release();
            }
            this.f86037s = null;
        }
        this.f542697c = null;
        this.f542698d = null;
        this.f542699e = null;
        this.f542700f = null;
        this.f542701g = null;
        this.f542702h = null;
        this.f542703i = null;
        this.f542695a = -2;
        this.f542696b = true;
    }

    @Override // ye1.e
    /* renamed from: reset */
    public void mo1860x6761d4f() {
        if (M()) {
            V(false);
            if (M()) {
                ((m8.k) this.f86036r).e(false);
                ((m8.k) this.f86036r).f406109d.f406182i.sendEmptyMessage(5);
            }
            this.I = false;
            this.H = 0;
            this.f86039u.f86033a = new int[]{1, 1, 1, 1};
            this.f542695a = 0;
        }
    }

    @Override // ye1.e
    /* renamed from: seekTo */
    public void mo1861xc9fc1b13(long j17) {
        if (M()) {
            this.f86036r.mo146928xc9fc1b13(j17);
            af1.w wVar = this.f86039u;
            wVar.c((wVar.f86033a[3] & com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader.f55823x6f7d4830) != 0, 100);
            this.M.set(true);
        }
    }

    @Override // ye1.e
    /* renamed from: setDataSource */
    public void mo1862x683d6267(java.lang.String str) {
        x(str, null, 0);
    }

    @Override // ye1.e
    /* renamed from: setMute */
    public void mo1863x764d819b(boolean z17) {
        if (M()) {
            if (z17) {
                c(0.0f, 0.0f);
            } else {
                c(1.0f, 1.0f);
            }
        }
    }

    @Override // ye1.e
    /* renamed from: setSurface */
    public void mo1864x42c875eb(android.view.Surface surface) {
        if (M() && M()) {
            android.view.Surface surface2 = this.f86037s;
            if (surface2 == null || surface2 == surface || surface == null) {
                U(2, 1, surface, false);
            } else {
                if (this.f86038t) {
                    surface2.release();
                }
                U(2, 1, surface, true);
                long mo146925x9746038c = this.f86036r.mo146925x9746038c();
                if (t9.d0.f498031a < 23) {
                    this.C.postDelayed(new af1.l(this, mo146925x9746038c), 200L);
                }
            }
            this.f86037s = surface;
            this.f86038t = false;
        }
    }

    @Override // ye1.e
    /* renamed from: start */
    public void mo1865x68ac462() {
        if (M()) {
            if (this.f86036r.t() == 4) {
                this.f86036r.mo146928xc9fc1b13(0L);
            }
            this.f86036r.e(true);
            this.f542695a = 3;
            this.L.set(false);
        }
    }

    @Override // ye1.e
    /* renamed from: stop */
    public void mo1866x360802() {
        if (!M() || this.L.getAndSet(true)) {
            return;
        }
        ((m8.k) this.f86036r).e(false);
        ((m8.k) this.f86036r).f406109d.f406182i.sendEmptyMessage(5);
        this.f542695a = 5;
    }

    @Override // ye1.a, ye1.e
    public void x(java.lang.String str, java.lang.String str2, int i17) {
        d9.a0 kVar;
        android.net.Uri parse = android.net.Uri.parse(str);
        int N = 2 == i17 ? 2 : N(parse);
        d9.a0 a0Var = null;
        java.util.Map singletonMap = str2 != null ? java.util.Collections.singletonMap("Referer", str2) : null;
        if (N == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "buildMediaSource, type:HLS, url:%s", parse);
            kVar = new g9.k(parse, af1.z.a(this.f86035q, singletonMap), this.C, this.f86044z);
        } else {
            if (N != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.ExoMediaPlayer", "buildMediaSource, unsupported type:" + N + ", url:" + parse);
                this.f86040v = a0Var;
                this.f86041w = str;
                this.U = 0;
                this.f542695a = 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "buildMediaSource, type:other, url:%s", parse);
            kVar = new d9.v(parse, O(singletonMap), P(), this.C, this.f86044z);
        }
        a0Var = kVar;
        this.f86040v = a0Var;
        this.f86041w = str;
        this.U = 0;
        this.f542695a = 1;
    }

    @Override // ye1.e
    public void y(java.lang.String str, int i17) {
        x(str, null, i17);
    }

    public x(android.os.Handler handler, int i17, float f17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f86041w = null;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "ExoMediaPlayer, handler = %s, maxInitBitrate = %s, bandFraction = %s, minDur = %s, maxDur = %s, minBuffer = %s, maxBuffer = %s, bufferForPlaybackMs:%s, bufferForPlaybackAfterRebufferMs:%s", handler, java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
        this.N = f17;
        this.O = i18;
        this.P = i19;
        this.Q = i27;
        this.R = i28;
        this.S = i29;
        this.T = i37;
        this.f86035q = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f86039u = new af1.w(null);
        if (handler != null) {
            this.C = handler;
        } else {
            int i38 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a("ExoMediaPlayer_HandlerThread", 5);
            this.D = a17;
            a17.start();
            this.C = new android.os.Handler(this.D.getLooper());
        }
        this.f86043y = new af1.u(this, null);
        this.f86044z = new af1.n(this, null);
        ye1.w wVar = new ye1.w(this.C);
        this.E = wVar;
        wVar.f542736b = 1000;
        wVar.f542738d = new af1.m(this, null);
        af1.v vVar = new af1.v(this, null);
        android.content.Context context = this.f86035q;
        android.os.Handler handler2 = this.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        y8.e eVar = y8.e.f541346a;
        arrayList2.add(new n8.b0(eVar, null, true, handler2, vVar, n8.d.a(context), new n8.f[0]));
        arrayList.addAll(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(new u9.i(context, eVar, 5000, null, false, handler2, vVar, 50));
        arrayList.addAll(arrayList3);
        this.f86042x = arrayList;
        if (handler != null && handler.getLooper() == android.os.Looper.myLooper()) {
            R();
            return;
        }
        this.C.post(new af1.k(this));
        synchronized (this) {
            while (this.f86036r == null) {
                try {
                    wait();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
    }
}
