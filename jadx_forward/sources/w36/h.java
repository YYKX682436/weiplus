package w36;

/* loaded from: classes16.dex */
public final class h implements l36.f1, w36.j {

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.List f524315v = java.util.Collections.singletonList(l36.r0.HTTP_1_1);

    /* renamed from: a, reason: collision with root package name */
    public final l36.w0 f524316a;

    /* renamed from: b, reason: collision with root package name */
    public final l36.g1 f524317b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Random f524318c;

    /* renamed from: d, reason: collision with root package name */
    public final long f524319d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f524320e;

    /* renamed from: f, reason: collision with root package name */
    public l36.n f524321f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f524322g;

    /* renamed from: h, reason: collision with root package name */
    public w36.k f524323h;

    /* renamed from: i, reason: collision with root package name */
    public w36.m f524324i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.concurrent.ScheduledExecutorService f524325j;

    /* renamed from: k, reason: collision with root package name */
    public w36.g f524326k;

    /* renamed from: n, reason: collision with root package name */
    public long f524329n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f524330o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.concurrent.ScheduledFuture f524331p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f524333r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f524334s;

    /* renamed from: t, reason: collision with root package name */
    public int f524335t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f524336u;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayDeque f524327l = new java.util.ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayDeque f524328m = new java.util.ArrayDeque();

    /* renamed from: q, reason: collision with root package name */
    public int f524332q = -1;

    public h(l36.w0 w0Var, l36.g1 g1Var, java.util.Random random, long j17) {
        if (!"GET".equals(w0Var.f397215b)) {
            throw new java.lang.IllegalArgumentException("Request must be GET: " + w0Var.f397215b);
        }
        this.f524316a = w0Var;
        this.f524317b = g1Var;
        this.f524318c = random;
        this.f524319d = j17;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f524320e = x36.o.p(bArr).h();
        this.f524322g = new w36.a(this);
    }

    public void a(l36.a1 a1Var) {
        if (a1Var.f396990f != 101) {
            throw new java.net.ProtocolException("Expected HTTP 101 response but was '" + a1Var.f396990f + " " + a1Var.f396991g + "'");
        }
        java.lang.String b17 = a1Var.b("Connection");
        if (!"Upgrade".equalsIgnoreCase(b17)) {
            throw new java.net.ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + b17 + "'");
        }
        java.lang.String b18 = a1Var.b("Upgrade");
        if (!"websocket".equalsIgnoreCase(b18)) {
            throw new java.net.ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + b18 + "'");
        }
        java.lang.String b19 = a1Var.b("Sec-WebSocket-Accept");
        java.lang.String h17 = x36.o.f533229h.a(this.f524320e + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").k("SHA-1").h();
        if (h17.equals(b19)) {
            return;
        }
        throw new java.net.ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + h17 + "' but was '" + b19 + "'");
    }

    public boolean b(int i17, java.lang.String str) {
        x36.o oVar;
        synchronized (this) {
            try {
                java.lang.String a17 = w36.i.a(i17);
                if (a17 != null) {
                    throw new java.lang.IllegalArgumentException(a17);
                }
                if (str != null) {
                    oVar = x36.o.f533229h.a(str);
                    if (oVar.f533232f.length > 123) {
                        throw new java.lang.IllegalArgumentException("reason.size() > 123: ".concat(str));
                    }
                } else {
                    oVar = null;
                }
                if (!this.f524334s && !this.f524330o) {
                    this.f524330o = true;
                    this.f524328m.add(new w36.d(i17, oVar, 60000L));
                    java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f524325j;
                    if (scheduledExecutorService != null) {
                        ((java.util.concurrent.ScheduledThreadPoolExecutor) scheduledExecutorService).execute(this.f524322g);
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public void c(java.lang.Exception exc, l36.a1 a1Var) {
        synchronized (this) {
            if (this.f524334s) {
                return;
            }
            this.f524334s = true;
            w36.g gVar = this.f524326k;
            this.f524326k = null;
            java.util.concurrent.ScheduledFuture scheduledFuture = this.f524331p;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f524325j;
            if (scheduledExecutorService != null) {
                ((java.util.concurrent.ScheduledThreadPoolExecutor) scheduledExecutorService).shutdown();
            }
            try {
                ((ry5.b) this.f524317b).getClass();
                xy5.b.a("enricwu.SentinelConnectMgr", "[onFailure] t : " + exc + ", response : " + a1Var);
            } finally {
                m36.e.c(gVar);
            }
        }
    }

    public void d(java.lang.String str, w36.g gVar) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        synchronized (this) {
            try {
                this.f524326k = gVar;
                this.f524324i = new w36.m(gVar.f524312d, gVar.f524314f, this.f524318c);
                byte[] bArr = m36.e.f404919a;
                java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new m36.d(str, false));
                this.f524325j = scheduledThreadPoolExecutor;
                long j17 = this.f524319d;
                if (j17 != 0) {
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(new w36.f(this), j17, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
                }
                if (!this.f524328m.isEmpty() && (scheduledExecutorService = this.f524325j) != null) {
                    ((java.util.concurrent.ScheduledThreadPoolExecutor) scheduledExecutorService).execute(this.f524322g);
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        this.f524323h = new w36.k(gVar.f524312d, gVar.f524313e, this);
    }

    public void e() {
        while (this.f524332q == -1) {
            w36.k kVar = this.f524323h;
            kVar.b();
            if (!kVar.f524344h) {
                int i17 = kVar.f524341e;
                if (i17 != 1 && i17 != 2) {
                    throw new java.net.ProtocolException("Unknown opcode: " + java.lang.Integer.toHexString(i17));
                }
                while (!kVar.f524340d) {
                    long j17 = kVar.f524342f;
                    x36.k kVar2 = kVar.f524346j;
                    if (j17 > 0) {
                        kVar.f524338b.k1(kVar2, j17);
                        if (!kVar.f524337a) {
                            x36.i iVar = kVar.f524348l;
                            kVar2.j(iVar);
                            iVar.a(kVar2.f533227e - kVar.f524342f);
                            w36.i.b(iVar, kVar.f524347k);
                            iVar.close();
                        }
                    }
                    if (kVar.f524343g) {
                        w36.j jVar = kVar.f524339c;
                        if (i17 == 1) {
                            java.lang.String q17 = kVar2.q();
                            ry5.b bVar = (ry5.b) ((w36.h) jVar).f524317b;
                            if (!bVar.f483234g) {
                                bVar.b("test");
                            }
                            ry5.c cVar = (ry5.c) bVar.f483231d;
                            cVar.getClass();
                            if (!android.text.TextUtils.isEmpty(q17)) {
                                cVar.f483238c.post(new ry5.RunnableC30154x2d8ca1(cVar, q17));
                            }
                        } else {
                            kVar2.l();
                            ((w36.h) jVar).f524317b.getClass();
                        }
                    } else {
                        while (!kVar.f524340d) {
                            kVar.b();
                            if (!kVar.f524344h) {
                                break;
                            } else {
                                kVar.a();
                            }
                        }
                        if (kVar.f524341e != 0) {
                            throw new java.net.ProtocolException("Expected continuation opcode. Got: " + java.lang.Integer.toHexString(kVar.f524341e));
                        }
                    }
                }
                throw new java.io.IOException("closed");
            }
            kVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    public boolean f() {
        java.lang.String str;
        int i17;
        w36.g gVar;
        java.lang.String a17;
        synchronized (this) {
            if (this.f524334s) {
                return false;
            }
            w36.m mVar = this.f524324i;
            x36.o oVar = (x36.o) this.f524327l.poll();
            w36.e eVar = 0;
            r3 = null;
            w36.g gVar2 = null;
            int i18 = -1;
            if (oVar == null) {
                java.lang.Object poll = this.f524328m.poll();
                if (poll instanceof w36.d) {
                    int i19 = this.f524332q;
                    str = this.f524333r;
                    if (i19 != -1) {
                        w36.g gVar3 = this.f524326k;
                        this.f524326k = null;
                        ((java.util.concurrent.ScheduledThreadPoolExecutor) this.f524325j).shutdown();
                        gVar2 = gVar3;
                    } else {
                        this.f524331p = ((java.util.concurrent.ScheduledThreadPoolExecutor) this.f524325j).schedule(new w36.c(this), ((w36.d) poll).f524308c, java.util.concurrent.TimeUnit.MILLISECONDS);
                    }
                    i18 = i19;
                } else {
                    if (poll == null) {
                        return false;
                    }
                    str = null;
                }
                int i27 = i18;
                gVar = gVar2;
                eVar = poll;
                i17 = i27;
            } else {
                str = null;
                i17 = -1;
                gVar = null;
            }
            try {
                if (oVar != null) {
                    mVar.a(10, oVar);
                } else if (eVar instanceof w36.e) {
                    x36.o oVar2 = eVar.f524310b;
                    int i28 = eVar.f524309a;
                    long l17 = oVar2.l();
                    if (mVar.f524361h) {
                        throw new java.lang.IllegalStateException("Another message writer is active. Did you call close()?");
                    }
                    mVar.f524361h = true;
                    w36.l lVar = mVar.f524360g;
                    lVar.f524349d = i28;
                    lVar.f524350e = l17;
                    lVar.f524351f = true;
                    lVar.f524352g = false;
                    x36.l a18 = x36.v.a(lVar);
                    x36.z zVar = (x36.z) a18;
                    if (!(!zVar.f533257e)) {
                        throw new java.lang.IllegalStateException("closed".toString());
                    }
                    zVar.f533256d.x(oVar2);
                    zVar.z0();
                    ((x36.z) a18).close();
                    synchronized (this) {
                        this.f524329n -= oVar2.l();
                    }
                } else {
                    if (!(eVar instanceof w36.d)) {
                        throw new java.lang.AssertionError();
                    }
                    w36.d dVar = (w36.d) eVar;
                    int i29 = dVar.f524306a;
                    x36.o oVar3 = dVar.f524307b;
                    mVar.getClass();
                    x36.o oVar4 = x36.o.f533228g;
                    if (i29 != 0 || oVar3 != null) {
                        if (i29 != 0 && (a17 = w36.i.a(i29)) != null) {
                            throw new java.lang.IllegalArgumentException(a17);
                        }
                        x36.k kVar = new x36.k();
                        kVar.N(i29);
                        if (oVar3 != null) {
                            kVar.x(oVar3);
                        }
                        oVar4 = kVar.l();
                    }
                    try {
                        mVar.a(8, oVar4);
                        if (gVar != null) {
                            this.f524317b.a(this, i17, str);
                        }
                    } finally {
                        mVar.f524358e = true;
                    }
                }
                return true;
            } finally {
                m36.e.c(gVar);
            }
        }
    }
}
