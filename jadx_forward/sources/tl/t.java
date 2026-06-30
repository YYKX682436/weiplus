package tl;

/* loaded from: classes12.dex */
public class t implements tl.b {

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.Object f501652x = new java.lang.Object();

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.Object f501653y = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public tl.a f501658e;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f501664k;

    /* renamed from: o, reason: collision with root package name */
    public android.media.MediaRecorder f501668o;

    /* renamed from: q, reason: collision with root package name */
    public final to.c f501670q;

    /* renamed from: r, reason: collision with root package name */
    public tl.s f501671r;

    /* renamed from: s, reason: collision with root package name */
    public long f501672s;

    /* renamed from: a, reason: collision with root package name */
    public int f501654a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f501655b = null;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f501656c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public yl.g f501657d = null;

    /* renamed from: f, reason: collision with root package name */
    public n21.f f501659f = null;

    /* renamed from: g, reason: collision with root package name */
    public n21.g f501660g = null;

    /* renamed from: h, reason: collision with root package name */
    public long f501661h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f501662i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f501663j = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f501665l = 8000;

    /* renamed from: m, reason: collision with root package name */
    public int f501666m = 16000;

    /* renamed from: n, reason: collision with root package name */
    public boolean f501667n = false;

    /* renamed from: p, reason: collision with root package name */
    public tl.w f501669p = null;

    /* renamed from: t, reason: collision with root package name */
    public final tl.r f501673t = new tl.r(this, 1500);

    /* renamed from: u, reason: collision with root package name */
    public final fp.j f501674u = new fp.j();

    /* renamed from: v, reason: collision with root package name */
    public final tl.v f501675v = new tl.n(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f501676w = false;

    public t(to.c cVar) {
        this.f501664k = false;
        this.f501672s = -1L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "MMAudioRecorder recMode: " + cVar);
        this.f501670q = cVar;
        boolean z17 = tl.w0.f501708b;
        to.c cVar2 = to.c.AMR;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "can't use silk encode, force to use amr mode now");
            this.f501670q = cVar2;
        }
        if (this.f501670q == cVar2) {
            this.f501668o = new gp.e();
        } else {
            b();
        }
        this.f501672s = -1L;
        this.f501664k = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r2) > 500) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a() {
        /*
            r6 = this;
            to.c r0 = to.c.AMR
            r1 = 0
            to.c r2 = r6.f501670q
            if (r2 != r0) goto L11
            android.media.MediaRecorder r0 = r6.f501668o
            if (r0 != 0) goto Lc
            return r1
        Lc:
            int r0 = r0.getMaxAmplitude()
            return r0
        L11:
            tl.s r0 = r6.f501671r
            tl.s r2 = tl.s.RECORDING
            if (r0 != r2) goto L4a
            int r0 = r6.f501654a
            long r2 = r6.f501672s
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L2e
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r2
            r2 = 500(0x1f4, double:2.47E-321)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L47
        L2e:
            int r2 = r6.f501654a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "MicroMsg.MMAudioRecorder"
            java.lang.String r4 = "mCurAmplitude:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r2)
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r2 = android.os.SystemClock.elapsedRealtime()
            r6.f501672s = r2
        L47:
            r6.f501654a = r1
            return r0
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.t.a():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r0.f415796k.nextInt(r4) != (r4 / 2)) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.t.b():void");
    }

    public void c() {
        if (this.f501670q == to.c.AMR) {
            android.media.MediaRecorder mediaRecorder = this.f501668o;
            if (mediaRecorder != null) {
                mediaRecorder.prepare();
                return;
            }
            return;
        }
        if (this.f501671r == tl.s.INITIALIZING && this.f501655b != null) {
            this.f501671r = tl.s.READY;
        } else {
            this.f501671r = tl.s.ERROR;
            d();
        }
    }

    public void d() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "release curState:%s, pcmRecorder:%s", this.f501671r, this.f501669p);
        if (this.f501670q == to.c.AMR) {
            android.media.MediaRecorder mediaRecorder = this.f501668o;
            if (mediaRecorder != null) {
                mediaRecorder.release();
                return;
            }
            return;
        }
        if (this.f501671r == tl.s.RECORDING) {
            h();
        }
        synchronized (f501653y) {
            this.f501664k = false;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new tl.j(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "release finished cost:%s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public void e(tl.a aVar) {
        if (this.f501670q != to.c.AMR) {
            if (this.f501671r == tl.s.INITIALIZING) {
                this.f501658e = aVar;
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAudioRecorder", "setOnErrorListener on wrong state");
                return;
            }
        }
        android.media.MediaRecorder mediaRecorder = this.f501668o;
        if (mediaRecorder == null) {
            return;
        }
        this.f501658e = aVar;
        mediaRecorder.setOnErrorListener(new tl.i(this));
    }

    public void f(java.lang.String str) {
        if (this.f501670q == to.c.AMR) {
            android.media.MediaRecorder mediaRecorder = this.f501668o;
            if (mediaRecorder == null) {
                return;
            }
            mediaRecorder.setOutputFile(str);
            this.f501655b = str;
            return;
        }
        if (this.f501671r != tl.s.INITIALIZING) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAudioRecorder", "set output path on wrong state");
            this.f501671r = tl.s.ERROR;
            return;
        }
        this.f501655b = str;
        tl.w wVar = this.f501669p;
        if (wVar != null) {
            wVar.F = str;
        }
    }

    public void g() {
        if (this.f501670q == to.c.AMR) {
            android.media.MediaRecorder mediaRecorder = this.f501668o;
            if (mediaRecorder != null) {
                mediaRecorder.start();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "Start record now state: " + this.f501671r + " recMode: " + this.f501670q);
        if (this.f501671r == tl.s.READY) {
            this.f501662i = java.lang.System.currentTimeMillis();
            this.f501663j = 0;
            this.f501671r = tl.s.RECORDING;
            if (com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d()) {
                this.f501673t.c(0L, 300L);
            }
            synchronized (f501652x) {
                this.f501669p.k();
            }
        } else {
            gm0.j1.i();
            gm0.j1.u().f354681a.f(27, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAudioRecorder", "start() called on illegal state");
            this.f501671r = tl.s.ERROR;
        }
        this.f501664k = false;
    }

    public boolean h() {
        boolean z17;
        if (this.f501670q == to.c.AMR) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "stop sysMediaRecorder: %s", this.f501668o);
            android.media.MediaRecorder mediaRecorder = this.f501668o;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
                this.f501668o.release();
                this.f501668o = null;
            }
            return true;
        }
        fp.j jVar = new fp.j();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "stop now state: " + this.f501671r);
        if (this.f501671r == tl.s.INITIALIZING) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(357L, 53L, 1L, true);
            if (!this.f501676w) {
                g0Var.mo68477x336bdfd8(357L, 54L, 1L, true);
            }
            this.f501676w = true;
        }
        if (this.f501671r != tl.s.RECORDING) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAudioRecorder", "stop() called on illegal state");
            this.f501671r = tl.s.ERROR;
            return true;
        }
        synchronized (f501652x) {
            if (this.f501669p != null) {
                this.f501664k = true;
            } else {
                this.f501664k = false;
            }
        }
        long a17 = jVar.a();
        this.f501671r = tl.s.STOPPED;
        long a18 = jVar.a();
        synchronized (f501653y) {
            z17 = this.f501664k;
        }
        if (z17) {
            ((ku5.t0) ku5.t0.f394148d).g(new tl.o(this));
        }
        synchronized (this.f501656c) {
            yl.g gVar = this.f501657d;
            if (gVar != null) {
                gVar.d();
            }
            n21.f fVar = this.f501659f;
            if (fVar != null) {
                fVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpeexEncoderWorker", "stop ");
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new n21.e(fVar));
            }
        }
        long j17 = this.f501662i;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "toNow " + currentTimeMillis + " startTickCnt: " + this.f501662i + " pcmDataReadedCnt: " + this.f501663j);
        if (currentTimeMillis > 2000 && this.f501663j == 0) {
            gm0.j1.i();
            gm0.j1.u().f354681a.f(27, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "16k not suppourt");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "Wait Stop Time Media:" + a17 + " Read:" + a18 + " Thr:" + jVar.a());
        return false;
    }
}
