package zs5;

/* loaded from: classes15.dex */
public final class y implements at5.a {
    public static final zs5.a A = new zs5.a(null);

    /* renamed from: a, reason: collision with root package name */
    public int f557033a;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Point f557035c;

    /* renamed from: d, reason: collision with root package name */
    public int f557036d;

    /* renamed from: e, reason: collision with root package name */
    public int f557037e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f557038f;

    /* renamed from: h, reason: collision with root package name */
    public long f557040h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 f557041i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab f557042j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f557043k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f557044l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f557045m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f557046n;

    /* renamed from: o, reason: collision with root package name */
    public long f557047o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f557048p;

    /* renamed from: q, reason: collision with root package name */
    public volatile zs5.c f557049q;

    /* renamed from: r, reason: collision with root package name */
    public et5.e f557050r;

    /* renamed from: u, reason: collision with root package name */
    public jz5.l f557053u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f557054v;

    /* renamed from: w, reason: collision with root package name */
    public long f557055w;

    /* renamed from: x, reason: collision with root package name */
    public at5.b f557056x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c0 f557057y;

    /* renamed from: b, reason: collision with root package name */
    public zs5.e0 f557034b = new zs5.e0();

    /* renamed from: g, reason: collision with root package name */
    public zs5.b f557039g = zs5.b.f556852d;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f557051s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f557052t = new java.util.HashMap();

    /* renamed from: z, reason: collision with root package name */
    public final zs5.u f557058z = new zs5.u(this);

    @Override // at5.a
    public void a(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1 f1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopSession reason: ");
        sb6.append(d1Var != null ? d1Var.f298526o : null);
        sb6.append(", session: ");
        sb6.append(j17);
        sb6.append(", currentSession: ");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var2 = this.f557041i;
        sb6.append(d1Var2 != null ? java.lang.Long.valueOf(d1Var2.f298518d) : null);
        sb6.append(", isSessionStarted: ");
        sb6.append(this.f557044l);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", sb6.toString());
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var3 = this.f557041i;
        if (d1Var3 != null && j17 == d1Var3.f298518d) {
            et5.e eVar = this.f557050r;
            if (eVar != null) {
                eVar.a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a0.StopSessionFromNative);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var4 = this.f557041i;
            if (d1Var4 != null) {
                if (d1Var == null || (f1Var = d1Var.f298526o) == null) {
                    f1Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.DEFAULT;
                }
                d1Var4.f298526o = f1Var;
                if ((d1Var != null ? d1Var.f298527p : null) != null) {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a1 a1Var = d1Var.f298527p;
                    d1Var4.f298527p = a1Var;
                    int i17 = a1Var.f298481e;
                    int i18 = a1Var.f298482f;
                    int i19 = a1Var.f298480d;
                }
                if (this.f557044l) {
                    this.f557043k = true;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h0.f298581b.j(d1Var4, new zs5.x(j17, this));
            }
            this.f557033a = 0;
            this.f557047o = 0L;
            this.f557041i = null;
            this.f557056x = null;
            this.f557049q = null;
            this.f557035c = null;
            this.f557036d = 0;
            this.f557037e = 0;
        }
    }

    @Override // at5.a
    public void b(rz3.b bVar) {
    }

    @Override // at5.a
    public void c(long j17, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 sessionInfo, at5.b decodeCallBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionInfo, "sessionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decodeCallBack, "decodeCallBack");
        this.f557056x = decodeCallBack;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1();
        d1Var.f298518d = j17;
        d1Var.f298519e = sessionInfo.f298519e;
        d1Var.f298520f = sessionInfo.f298520f;
        d1Var.f298521g = java.lang.System.currentTimeMillis();
        zs5.g0 g0Var = zs5.g0.F;
        d1Var.f298523i = i17 == 4 ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c1.SCAN_MERGE : com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c1.SCAN;
        d1Var.f298526o = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.DEFAULT;
        this.f557049q = new zs5.c(j17, i17, d1Var, decodeCallBack);
        this.f557041i = d1Var;
        this.f557033a = 0;
        this.f557048p = false;
        this.f557042j = null;
        this.f557047o = 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", "startSession inited: " + this.f557038f + ", initStatus: " + this.f557039g + ", session: " + j17 + ", tabType: " + i17 + ", scanUISession: " + sessionInfo.f298519e + ", isSessionStopping: " + this.f557043k);
        zs5.b bVar = this.f557039g;
        if (bVar == zs5.b.f556852d || bVar == zs5.b.f556855g) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            e(context, this.f557034b);
            this.f557045m = true;
            return;
        }
        if (bVar == zs5.b.f556853e) {
            this.f557045m = true;
            return;
        }
        if (this.f557043k) {
            this.f557046n = true;
            return;
        }
        this.f557057y = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c0(this.f557058z);
        et5.e eVar = this.f557050r;
        if (eVar != null) {
            eVar.a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a0.StartSessionFromNative);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h0 h0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h0.f298581b;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var2 = this.f557041i;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.c0 c0Var = this.f557057y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
        h0Var.i(d1Var2, c0Var);
        this.f557044l = true;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var3 = this.f557041i;
        d75.b.g(new zs5.i(d1Var3 != null ? d1Var3.f298518d : 0L, this, 0L));
    }

    @Override // at5.a
    public void d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var2 = this.f557041i;
        boolean z17 = false;
        if (d1Var2 != null && j17 == d1Var2.f298518d) {
            z17 = true;
        }
        if (z17) {
            if ((d1Var != null ? d1Var.f298527p : null) == null || d1Var2 == null) {
                return;
            }
            d1Var2.f298527p = d1Var.f298527p;
        }
    }

    @Override // at5.a
    public void e(android.content.Context context, zs5.e0 decoderConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decoderConfig, "decoderConfig");
        zs5.b bVar = this.f557039g;
        zs5.b bVar2 = zs5.b.f556853e;
        if (bVar == bVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AffScanDecodeQueue", "initing and ignore");
            return;
        }
        this.f557039g = bVar2;
        this.f557040h = java.lang.System.currentTimeMillis();
        this.f557034b = decoderConfig;
        zs5.n nVar = new zs5.n(this);
        java.lang.Boolean bool = et5.a.f338203a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", "init soLoaded " + bool + ", inited: " + this.f557038f + ", initStatus: " + this.f557039g + ", decoderConfig: " + decoderConfig);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            nVar.mo152xb9724478();
        } else if (bool == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
            ((ku5.t0) ku5.t0.f394148d).h(new zs5.l(nVar), "MicroMsg.AffScanDecodeQueue");
        }
    }

    @Override // at5.a
    public int f() {
        return this.f557033a;
    }

    @Override // at5.a
    public void g(et5.e reporter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reporter, "reporter");
        this.f557050r = reporter;
    }

    @Override // at5.a
    public void h(byte[] previewData, android.graphics.Point resolution, int i17, int i18, android.graphics.Rect cameraRect, android.graphics.Rect cameraRotateRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewData, "previewData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resolution, "resolution");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraRect, "cameraRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraRotateRect, "cameraRotateRect");
        i(new zs5.d(this, previewData, resolution, i17, i18, cameraRect, cameraRotateRect, java.lang.System.currentTimeMillis()));
    }

    public final void i(final yz5.a aVar) {
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable(aVar) { // from class: zs5.o

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f556986d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "function");
                this.f556986d = aVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f556986d.mo152xb9724478();
            }
        }, "AffScanDecodeQueue");
    }

    @Override // at5.a
    /* renamed from: release */
    public void mo9044x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", "release qbarId: " + this.f557040h);
        et5.e eVar = this.f557050r;
        if (eVar != null) {
            eVar.a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.a0.ReleaseFromNative);
        }
        this.f557050r = null;
        this.f557038f = false;
        this.f557039g = zs5.b.f556852d;
        this.f557044l = false;
        this.f557043k = false;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h0.f298581b.e(this.f557040h);
        try {
            zs5.h0.f556935a.clear();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanCodeNotRecognizeHelper", e17, "resetNoRecognizeCodeStringData", new java.lang.Object[0]);
        }
    }
}
