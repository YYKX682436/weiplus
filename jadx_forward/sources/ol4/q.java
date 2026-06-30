package ol4;

/* loaded from: classes14.dex */
public final class q implements ll4.d, ll4.c {
    public final kl4.h A;
    public final ol4.e B;
    public final jz5.g C;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f427712a;

    /* renamed from: b, reason: collision with root package name */
    public final kk4.c f427713b;

    /* renamed from: c, reason: collision with root package name */
    public final int f427714c;

    /* renamed from: d, reason: collision with root package name */
    public ll4.a f427715d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.lp0 f427716e;

    /* renamed from: f, reason: collision with root package name */
    public float f427717f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f427718g;

    /* renamed from: h, reason: collision with root package name */
    public wu5.c f427719h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f427720i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f427721j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f427722k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f427723l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f427724m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f427725n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f427726o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f427727p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f427728q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f427729r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f427730s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.l f427731t;

    /* renamed from: u, reason: collision with root package name */
    public pl4.k f427732u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18723x96879d03 f427733v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18725xc88c8712 f427734w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18721x9ae6bd22 f427735x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18722xa53aee64 f427736y;

    /* renamed from: z, reason: collision with root package name */
    public ll4.b f427737z;

    public q(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f427712a = jz5.h.b(ol4.p.f427711d);
        int hashCode = hashCode();
        this.f427714c = hashCode;
        this.f427717f = 1.0f;
        java.lang.String str = "MicroMsg.TingTPPlayerCore@" + hashCode;
        this.f427730s = str;
        i95.n0.c(df0.s.class);
        ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mainProcHistoryPath:" + com.p314xaae8f345.mm.p947xba6de98f.s1.cj().f152582m);
        kk4.c wi6 = ((cf0.q) ((df0.q) i95.n0.c(df0.q.class))).wi(context);
        this.f427713b = wi6;
        kk4.f0 f0Var = (kk4.f0) wi6;
        f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101058xb88ec5da(146, true));
        f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101058xb88ec5da(161, true));
        int optInt = ml4.b.f409941b.optInt("errorRetry", 3);
        if (optInt >= 0) {
            p3380x6a61f93.p3381xf512d0a5.C30414x21b1610a.m168690x21ba953b(optInt);
        }
        int optInt2 = ml4.b.f409941b.optInt("bufferTimeOutMs", 0);
        if (optInt2 > 0) {
            f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(107, optInt2));
        }
        int optInt3 = ml4.b.f409941b.optInt("prepareTimeOutMs", 0);
        if (optInt3 > 0) {
            f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(128, optInt3));
        }
        int optInt4 = ml4.b.f409941b.optInt("preloadDurationMs", 500);
        if (optInt4 > 0) {
            f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(103, optInt4));
        }
        int optInt5 = ml4.b.f409941b.optInt("minBufferTimeMs", 4000);
        if (optInt5 > 0) {
            f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(103, optInt5));
        }
        int optInt6 = ml4.b.f409941b.optInt("bufferMinDurationMs", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54064xffc564fb);
        if (optInt6 > 0) {
            f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(102, optInt6));
        }
        int optInt7 = ml4.b.f409941b.optInt("tcpRetryCount", 0);
        if (optInt7 > 0) {
            f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(109, optInt7));
        }
        int optInt8 = ml4.b.f409941b.optInt("tcpTimeOutMs", 0);
        if (optInt8 > 0) {
            f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(108, optInt8));
        }
        int optInt9 = ml4.b.f409941b.optInt("minBufferingTimeMs", 500);
        if (optInt9 > 0) {
            f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(105, optInt9));
        }
        int optInt10 = ml4.b.f409941b.optInt("maxAnalyzeDurationMs", 1000);
        if (optInt10 > 0) {
            f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(129, optInt10));
        }
        f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(502, 0L));
        f0Var.mo100958xe1a2e326(new ol4.a(this));
        f0Var.f390074q = new ol4.b(this);
        f0Var.mo100955x40f8c003(new ol4.c(this));
        this.A = new kl4.h(0, 1, null);
        this.B = new ol4.e(this);
        this.C = jz5.h.b(new ol4.d(this));
    }

    public static final void q(ol4.q qVar) {
        qVar.getClass();
        ol4.n nVar = new ol4.n(qVar);
        wu5.c cVar = qVar.f427719h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        qVar.f427719h = ((ku5.t0) ku5.t0.f394148d).d(nVar, 500L, 400L);
    }

    @Override // ll4.c
    public yz5.l a() {
        return this.f427731t;
    }

    @Override // ll4.d
    public bw5.lp0 b() {
        bw5.lp0 lp0Var = this.f427716e;
        if (lp0Var == null) {
            bw5.lp0 lp0Var2 = bw5.lp0.f111423v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lp0Var2, "getDefaultInstance(...)");
            return lp0Var2;
        }
        if (lp0Var != null) {
            return lp0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
        throw null;
    }

    @Override // ll4.d
    public void c(float f17) {
        this.f427717f = f17;
        ((kk4.f0) this.f427713b).mo100967xd079f5a(f17);
    }

    @Override // ll4.d
    public long d() {
        if (!this.f427723l || this.f427721j || this.f427726o || this.f427725n) {
            return 0L;
        }
        kk4.c cVar = this.f427713b;
        long mo100917x37a7fa50 = ((kk4.f0) cVar).mo100917x37a7fa50();
        if (mo100917x37a7fa50 == 0) {
            return 0L;
        }
        return (((kk4.f0) cVar).mo100920x21a0b6d0() * 100) / mo100917x37a7fa50;
    }

    @Override // ll4.d
    public void e(ll4.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f427730s, "set callback " + aVar);
        this.f427715d = aVar;
    }

    @Override // ll4.d
    public void f(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreload: ");
        bw5.lp0 lp0Var = this.f427716e;
        if (lp0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var.c().f108990i);
        sb6.append(", isPrepared: ");
        bw5.lp0 lp0Var2 = this.f427716e;
        if (lp0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var2.c().A);
        sb6.append(", title: ");
        bw5.lp0 lp0Var3 = this.f427716e;
        if (lp0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var3.d().m13171x7531c8a2());
        java.lang.String str = "pause, " + sb6.toString();
        java.lang.String str2 = this.f427730s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (this.f427725n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "has call release, no need pause");
        } else {
            v(new ol4.f(this));
        }
    }

    @Override // ll4.d
    public java.lang.String g() {
        return "TingTPPlayerCore";
    }

    @Override // ll4.d
    public float h() {
        return this.f427717f;
    }

    @Override // ll4.d
    public void i(ll4.b bVar) {
        this.f427737z = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0089  */
    @Override // ll4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(bw5.kq0 r18) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ol4.q.j(bw5.kq0):void");
    }

    @Override // ll4.d
    public long k() {
        return ((kk4.f0) this.f427713b).mo100917x37a7fa50();
    }

    @Override // ll4.d
    public bw5.ap0 l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18721x9ae6bd22 c18721x9ae6bd22 = this.f427735x;
        if (c18721x9ae6bd22 != null) {
            return c18721x9ae6bd22.m72119xb1fcc4ab();
        }
        return null;
    }

    @Override // ll4.d
    public long m() {
        return ((kk4.f0) this.f427713b).mo100915xddd35a52();
    }

    @Override // ll4.d
    public void n(byte[] buffer, java.lang.String listenId, boolean z17, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18723x96879d03 c18723x96879d03 = this.f427733v;
        if (c18723x96879d03 != null) {
            c18723x96879d03.m72143x62b6f972(buffer, listenId, z17, i17, i18, i19, i27);
        }
    }

    @Override // ll4.d
    public int o() {
        return this.f427714c;
    }

    @Override // ll4.c
    public void p(yz5.l lVar) {
        this.f427731t = lVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setOnPreparedCallback: callback=");
        sb6.append(lVar != null);
        sb6.append(", hasPrepared=");
        sb6.append(this.f427723l);
        sb6.append(", willImmediatelyInvoke=");
        sb6.append(this.f427723l && lVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f427730s, sb6.toString());
        if (!this.f427723l || lVar == null) {
            return;
        }
        lVar.mo146xb9724478(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(boolean r4) {
        /*
            r3 = this;
            bw5.lp0 r0 = r3.f427716e
            if (r0 == 0) goto L68
            boolean r0 = rk4.j5.g(r0)
            if (r0 == 0) goto L23
            pl4.k r0 = r3.f427732u
            r1 = 0
            if (r0 == 0) goto L21
            r2 = 1
            java.lang.String r0 = r0.f438252c
            if (r0 == 0) goto L1d
            boolean r0 = r26.n0.N(r0)
            r0 = r0 ^ r2
            if (r0 != r2) goto L1d
            r0 = r2
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 != r2) goto L21
            r1 = r2
        L21:
            if (r1 == 0) goto L25
        L23:
            if (r4 == 0) goto L67
        L25:
            pl4.k r4 = r3.f427732u
            if (r4 == 0) goto L67
            dn.o r0 = r4.f438268s
            java.lang.String r1 = r0.f69595x6d25b0d9
            boolean r1 = com.p314xaae8f345.mm.vfs.w6.j(r1)
            if (r1 == 0) goto L67
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "deleteCachedFile fileCacheId:"
            r1.<init>(r2)
            java.lang.String r4 = r4.f438251b
            r1.append(r4)
            java.lang.String r4 = ", path "
            r1.append(r4)
            java.lang.String r4 = r0.f69595x6d25b0d9
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "MicroMsg.TingTPResourceLoader"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4)
            java.lang.String r4 = r0.f69595x6d25b0d9
            com.p314xaae8f345.mm.vfs.w6.h(r4)
            java.lang.String r4 = r0.f69595x6d25b0d9
            java.lang.String r0 = "field_fullpath"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r0)
            java.lang.String r0 = ".finish"
            java.lang.String r4 = r4.concat(r0)
            com.p314xaae8f345.mm.vfs.w6.h(r4)
        L67:
            return
        L68:
            java.lang.String r4 = "mPlayingItem"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ol4.q.r(boolean):void");
    }

    @Override // ll4.d
    /* renamed from: release */
    public void mo145969x41012807() {
        java.lang.String str = this.f427730s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "release");
        if (this.f427725n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "has call release");
            return;
        }
        this.f427715d = null;
        this.f427725n = true;
        v(new ol4.g(this));
    }

    @Override // ll4.d
    /* renamed from: reset */
    public void mo145970x6761d4f() {
        java.lang.String str = this.f427730s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "reset");
        if (this.f427726o || this.f427725n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "has call reset, reset: " + this.f427726o + ", release: " + this.f427725n);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f427727p = false;
        this.f427723l = false;
        this.f427724m = false;
        this.f427721j = false;
        this.f427718g = false;
        this.f427722k = false;
        this.f427726o = true;
        ((kk4.f0) this.f427713b).mo100934x6761d4f();
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18721x9ae6bd22 c18721x9ae6bd22 = this.f427735x;
        if (c18721x9ae6bd22 != null) {
            c18721x9ae6bd22.m72126x41012807();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18725xc88c8712 c18725xc88c8712 = this.f427734w;
        if (c18725xc88c8712 != null) {
            c18725xc88c8712.m72204x41012807();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "call reset cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // ll4.d
    /* renamed from: resume */
    public void mo145971xc84dc82d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreload: ");
        bw5.lp0 lp0Var = this.f427716e;
        if (lp0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var.c().f108990i);
        sb6.append(", isPrepared: ");
        bw5.lp0 lp0Var2 = this.f427716e;
        if (lp0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var2.c().A);
        sb6.append(", title: ");
        bw5.lp0 lp0Var3 = this.f427716e;
        if (lp0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var3.d().m13171x7531c8a2());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f427730s, "resume, " + sb6.toString());
        if (this.f427723l) {
            v(new ol4.h(this));
        }
    }

    public final boolean s() {
        return ((java.lang.Boolean) ((jz5.n) this.C).mo141623x754a37bb()).booleanValue();
    }

    @Override // ll4.d
    /* renamed from: seek */
    public void mo145972x35ce78(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f427730s, "seek " + j17);
        this.f427729r = true;
        ll4.a aVar = this.f427715d;
        if (aVar != null) {
            ll4.a.a(aVar, 9, null, 2, null);
        }
        ((kk4.f0) this.f427713b).mo100937xc9fc1b13((int) j17, 3);
    }

    @Override // ll4.c
    /* renamed from: setSurface */
    public void mo145966x42c875eb(android.view.Surface surface) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSurface: surface=");
        sb6.append(surface != null);
        sb6.append(", videoWidth=");
        kk4.c cVar = this.f427713b;
        sb6.append(((kk4.f0) cVar).mo100929x8d5c7601());
        sb6.append(", videoHeight=");
        sb6.append(((kk4.f0) cVar).mo100928x463504c());
        sb6.append(", hasPrepared=");
        sb6.append(this.f427723l);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f427730s, sb6.toString());
        ((kk4.f0) cVar).mo100970x42c875eb(surface);
    }

    @Override // ll4.d
    /* renamed from: setVolume */
    public void mo145973x27f73e1c(float f17) {
        ((kk4.f0) this.f427713b).mo100940x3aa51598(f17);
    }

    @Override // ll4.d
    /* renamed from: stop */
    public void mo145974x360802() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreload: ");
        bw5.lp0 lp0Var = this.f427716e;
        if (lp0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var.c().f108990i);
        sb6.append(", isPrepared: ");
        bw5.lp0 lp0Var2 = this.f427716e;
        if (lp0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var2.c().A);
        sb6.append(", title: ");
        bw5.lp0 lp0Var3 = this.f427716e;
        if (lp0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var3.d().m13171x7531c8a2());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f427730s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "stop, " + sb7);
        this.f427715d = null;
        if (!this.f427721j && !this.f427725n) {
            this.f427721j = true;
            v(new ol4.o(this, sb7));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "has call stop: " + this.f427721j + ", release: " + this.f427725n + ", " + sb7);
    }

    public final boolean t() {
        boolean z17;
        if (this.f427736y != null) {
            return true;
        }
        if (u()) {
            bw5.lp0 lp0Var = this.f427716e;
            if (lp0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
                throw null;
            }
            bw5.fq0 c17 = lp0Var.c();
            boolean z18 = s() && ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
            java.lang.String str = c17.H[9] ? c17.f108992n : "";
            bw5.lp0 lp0Var2 = this.f427716e;
            if (lp0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
                throw null;
            }
            bw5.xa0 k17 = lp0Var2.d().k();
            bw5.ta0 ta0Var = k17.S[22] ? k17.B : new bw5.ta0();
            java.lang.String str2 = ta0Var.f114876v[8] ? ta0Var.f114868n : "";
            bw5.lp0 lp0Var3 = this.f427716e;
            if (lp0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
                throw null;
            }
            if (!lp0Var3.e().f109496s) {
                if (str == null || str.length() == 0) {
                    if (str2 == null || str2.length() == 0) {
                        z17 = false;
                        if (!c17.f109002x || c17.f108998t || z18 || z17) {
                            return true;
                        }
                    }
                }
            }
            z17 = true;
            return !c17.f109002x ? true : true;
        }
        if (this.f427734w != null || this.f427733v != null || this.f427735x != null) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        bw5.lp0 lp0Var = this.f427716e;
        if (lp0Var != null) {
            return lp0Var.c().F && this.f427737z != null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
        throw null;
    }

    public final void v(yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        try {
            block.mo152xb9724478();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f427730s, "safeCall fail:" + th6.getMessage());
        }
    }

    @Override // ll4.c
    /* renamed from: videoHeight */
    public int mo145967x2a8d0982() {
        return ((kk4.f0) this.f427713b).mo100928x463504c();
    }

    @Override // ll4.c
    /* renamed from: videoWidth */
    public int mo145968x9f1bbe0b() {
        return ((kk4.f0) this.f427713b).mo100929x8d5c7601();
    }
}
