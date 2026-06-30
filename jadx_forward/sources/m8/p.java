package m8;

/* loaded from: classes15.dex */
public final class p implements android.os.Handler.Callback, d9.w, d9.y {
    public boolean A;
    public boolean B;
    public int C = 1;
    public int D;
    public int E;
    public int F;
    public long G;
    public int H;
    public m8.n I;

    /* renamed from: J, reason: collision with root package name */
    public long f406176J;
    public m8.l K;
    public m8.l L;
    public m8.l M;
    public m8.m0 N;

    /* renamed from: d, reason: collision with root package name */
    public final m8.b0[] f406177d;

    /* renamed from: e, reason: collision with root package name */
    public final m8.c0[] f406178e;

    /* renamed from: f, reason: collision with root package name */
    public final q9.o f406179f;

    /* renamed from: g, reason: collision with root package name */
    public final m8.u f406180g;

    /* renamed from: h, reason: collision with root package name */
    public final t9.y f406181h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f406182i;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.HandlerThread f406183m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f406184n;

    /* renamed from: o, reason: collision with root package name */
    public final m8.i f406185o;

    /* renamed from: p, reason: collision with root package name */
    public final m8.l0 f406186p;

    /* renamed from: q, reason: collision with root package name */
    public final m8.k0 f406187q;

    /* renamed from: r, reason: collision with root package name */
    public final m8.w f406188r;

    /* renamed from: s, reason: collision with root package name */
    public m8.m f406189s;

    /* renamed from: t, reason: collision with root package name */
    public m8.y f406190t;

    /* renamed from: u, reason: collision with root package name */
    public m8.b0 f406191u;

    /* renamed from: v, reason: collision with root package name */
    public t9.j f406192v;

    /* renamed from: w, reason: collision with root package name */
    public d9.a0 f406193w;

    /* renamed from: x, reason: collision with root package name */
    public m8.b0[] f406194x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f406195y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f406196z;

    public p(m8.b0[] b0VarArr, q9.o oVar, m8.u uVar, boolean z17, int i17, android.os.Handler handler, m8.m mVar, m8.i iVar) {
        this.f406177d = b0VarArr;
        this.f406179f = oVar;
        this.f406180g = uVar;
        this.f406196z = z17;
        this.D = i17;
        this.f406184n = handler;
        this.f406189s = mVar;
        this.f406185o = iVar;
        this.f406178e = new m8.c0[b0VarArr.length];
        for (int i18 = 0; i18 < b0VarArr.length; i18++) {
            m8.b0 b0Var = b0VarArr[i18];
            ((m8.a) b0Var).f406070f = i18;
            m8.c0[] c0VarArr = this.f406178e;
            m8.a aVar = (m8.a) b0Var;
            aVar.getClass();
            c0VarArr[i18] = aVar;
        }
        this.f406181h = new t9.y();
        this.f406194x = new m8.b0[0];
        this.f406186p = new m8.l0();
        this.f406187q = new m8.k0();
        this.f406188r = new m8.w();
        oVar.getClass();
        this.f406190t = m8.y.f406211d;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f406183m = handlerThread;
        handlerThread.start();
        this.f406182i = new android.os.Handler(handlerThread.getLooper(), this);
    }

    public final void A(m8.h[] hVarArr) {
        try {
            for (m8.h hVar : hVarArr) {
                hVar.f406090a.b(hVar.f406091b, hVar.f406092c);
            }
            int i17 = this.C;
            if (i17 == 3 || i17 == 2) {
                this.f406182i.sendEmptyMessage(2);
            }
            synchronized (this) {
                this.F++;
                notifyAll();
            }
        } catch (java.lang.Throwable th6) {
            synchronized (this) {
                this.F++;
                notifyAll();
                throw th6;
            }
        }
    }

    public final void C(boolean z17) {
        if (this.B != z17) {
            this.B = z17;
            this.f406184n.obtainMessage(2, z17 ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void D(boolean z17) {
        this.A = false;
        this.f406196z = z17;
        if (!z17) {
            K();
            L();
            return;
        }
        int i17 = this.C;
        android.os.Handler handler = this.f406182i;
        if (i17 == 3) {
            I();
            handler.sendEmptyMessage(2);
        } else if (i17 == 2) {
            handler.sendEmptyMessage(2);
        }
    }

    public final void E(m8.y yVar) {
        t9.j jVar = this.f406192v;
        if (jVar != null) {
            yVar = jVar.a(yVar);
        } else {
            this.f406181h.a(yVar);
        }
        this.f406190t = yVar;
        this.f406184n.obtainMessage(7, yVar).sendToTarget();
    }

    public final void F(m8.l lVar) {
        if (this.M == lVar) {
            return;
        }
        m8.b0[] b0VarArr = this.f406177d;
        boolean[] zArr = new boolean[b0VarArr.length];
        int i17 = 0;
        for (int i18 = 0; i18 < b0VarArr.length; i18++) {
            m8.b0 b0Var = b0VarArr[i18];
            m8.a aVar = (m8.a) b0Var;
            boolean z17 = aVar.f406071g != 0;
            zArr[i18] = z17;
            q9.m mVar = lVar.f406149k.f442404b.f442401b[i18];
            if (mVar != null) {
                i17++;
            }
            if (z17 && (mVar == null || (aVar.f406075n && aVar.f406072h == this.M.f406142d[i18]))) {
                if (b0Var == this.f406191u) {
                    t9.j jVar = this.f406192v;
                    t9.y yVar = this.f406181h;
                    yVar.getClass();
                    yVar.b(jVar.e());
                    yVar.f498096g = jVar.d();
                    this.f406192v = null;
                    this.f406191u = null;
                }
                e(b0Var);
                ((m8.a) b0Var).k();
            }
        }
        this.M = lVar;
        this.f406184n.obtainMessage(3, lVar.f406149k).sendToTarget();
        d(zArr, i17);
    }

    public final void G(int i17) {
        m8.l lVar;
        m8.l lVar2;
        this.D = i17;
        this.f406188r.f406210d = i17;
        m8.l lVar3 = this.M;
        if (lVar3 == null) {
            lVar3 = this.K;
        }
        if (lVar3 == null) {
            return;
        }
        while (true) {
            int b17 = this.N.b(lVar3.f406145g.f406200a.f308960a, this.f406187q, this.f406186p, i17);
            while (true) {
                lVar = lVar3.f406148j;
                if (lVar == null || lVar3.f406145g.f406205f) {
                    break;
                } else {
                    lVar3 = lVar;
                }
            }
            if (b17 == -1 || lVar == null || lVar.f406145g.f406200a.f308960a != b17) {
                break;
            } else {
                lVar3 = lVar;
            }
        }
        int i18 = this.K.f406141c;
        m8.l lVar4 = this.L;
        int i19 = lVar4 != null ? lVar4.f406141c : -1;
        if (lVar != null) {
            while (lVar != null) {
                lVar.b();
                lVar = lVar.f406148j;
            }
            lVar3.f406148j = null;
        }
        m8.w wVar = this.f406188r;
        m8.v vVar = lVar3.f406145g;
        wVar.getClass();
        lVar3.f406145g = wVar.d(vVar, vVar.f406200a);
        int i27 = lVar3.f406141c;
        if (!(i18 <= i27)) {
            this.K = lVar3;
        }
        if ((i19 != -1 && i19 <= i27) || (lVar2 = this.M) == null) {
            return;
        }
        d9.z zVar = lVar2.f406145g.f406200a;
        this.f406189s = new m8.m(zVar, y(zVar, this.f406189s.f406166d), this.f406189s.f406165c);
    }

    public final void H(int i17) {
        if (this.C != i17) {
            this.C = i17;
            this.f406184n.obtainMessage(1, i17, 0).sendToTarget();
        }
    }

    public final void I() {
        this.A = false;
        t9.y yVar = this.f406181h;
        if (!yVar.f498093d) {
            yVar.f498095f = android.os.SystemClock.elapsedRealtime();
            yVar.f498093d = true;
        }
        for (m8.b0 b0Var : this.f406194x) {
            m8.a aVar = (m8.a) b0Var;
            t9.a.d(aVar.f406071g == 1);
            aVar.f406071g = 2;
            aVar.o();
        }
    }

    public final void J() {
        q(true);
        ((m8.c) this.f406180g).a(true);
        H(1);
    }

    public final void K() {
        t9.y yVar = this.f406181h;
        if (yVar.f498093d) {
            yVar.b(yVar.e());
            yVar.f498093d = false;
        }
        for (m8.b0 b0Var : this.f406194x) {
            e(b0Var);
        }
    }

    public final void L() {
        m8.l lVar = this.M;
        if (lVar == null) {
            return;
        }
        long d17 = lVar.f406139a.d();
        if (d17 != -9223372036854775807L) {
            r(d17);
        } else {
            m8.b0 b0Var = this.f406191u;
            if (b0Var == null || b0Var.h()) {
                this.f406176J = this.f406181h.e();
            } else {
                long e17 = this.f406192v.e();
                this.f406176J = e17;
                this.f406181h.b(e17);
            }
            d17 = this.f406176J - this.M.a();
        }
        this.f406189s.f406166d = d17;
        this.G = android.os.SystemClock.elapsedRealtime() * 1000;
        long m17 = this.f406194x.length == 0 ? Long.MIN_VALUE : this.M.f406139a.m();
        m8.m mVar = this.f406189s;
        if (m17 == Long.MIN_VALUE) {
            m17 = this.M.f406145g.f406204e;
        }
        mVar.f406167e = m17;
    }

    @Override // d9.w
    public void a(d9.x xVar) {
        this.f406182i.obtainMessage(8, xVar).sendToTarget();
    }

    @Override // d9.h0
    public void b(d9.i0 i0Var) {
        this.f406182i.obtainMessage(9, (d9.x) i0Var).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022c A[LOOP:2: B:132:0x022c->B:136:0x023c, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0445  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.p.c():void");
    }

    public final void d(boolean[] zArr, int i17) {
        int i18;
        this.f406194x = new m8.b0[i17];
        int i19 = 0;
        int i27 = 0;
        while (true) {
            m8.b0[] b0VarArr = this.f406177d;
            if (i19 >= b0VarArr.length) {
                return;
            }
            m8.b0 b0Var = b0VarArr[i19];
            q9.p pVar = this.M.f406149k;
            q9.m mVar = pVar.f442404b.f442401b[i19];
            if (mVar != null) {
                int i28 = i27 + 1;
                this.f406194x[i27] = b0Var;
                m8.a aVar = (m8.a) b0Var;
                if (aVar.f406071g == 0) {
                    m8.d0 d0Var = pVar.f442406d[i19];
                    boolean z17 = this.f406196z && this.C == 3;
                    boolean z18 = !zArr[i19] && z17;
                    q9.e eVar = (q9.e) mVar;
                    int length = eVar.f442382c.length;
                    com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[] c1601x7dc4e417Arr = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[length];
                    for (int i29 = 0; i29 < length; i29++) {
                        c1601x7dc4e417Arr[i29] = eVar.f442383d[i29];
                    }
                    m8.l lVar = this.M;
                    d9.g0 g0Var = lVar.f406142d[i19];
                    long j17 = this.f406176J;
                    i18 = i19;
                    long a17 = lVar.a();
                    t9.a.d(aVar.f406071g == 0);
                    aVar.f406069e = d0Var;
                    aVar.f406071g = 1;
                    aVar.m(z18);
                    t9.a.d(!aVar.f406075n);
                    aVar.f406072h = g0Var;
                    aVar.f406074m = false;
                    aVar.f406073i = a17;
                    aVar.q(c1601x7dc4e417Arr, a17);
                    aVar.n(j17, z18);
                    t9.j j18 = b0Var.j();
                    if (j18 != null) {
                        if (this.f406192v != null) {
                            throw new m8.e(2, null, new java.lang.IllegalStateException("Multiple renderer media clocks enabled."), -1);
                        }
                        this.f406192v = j18;
                        this.f406191u = b0Var;
                        j18.a(this.f406190t);
                    }
                    if (z17) {
                        t9.a.d(aVar.f406071g == 1);
                        aVar.f406071g = 2;
                        aVar.o();
                    }
                } else {
                    i18 = i19;
                }
                i27 = i28;
            } else {
                i18 = i19;
            }
            i19 = i18 + 1;
        }
    }

    public final void e(m8.b0 b0Var) {
        if (((m8.a) b0Var).f406071g == 2) {
            m8.a aVar = (m8.a) b0Var;
            t9.a.d(aVar.f406071g == 2);
            aVar.f406071g = 1;
            aVar.p();
        }
    }

    public final void g(d9.x xVar) {
        m8.l lVar = this.K;
        if (lVar == null || lVar.f406139a != xVar) {
            return;
        }
        lVar.f406146h = true;
        lVar.c();
        long d17 = lVar.d(lVar.f406145g.f406201b, false, new boolean[lVar.f406150l.length]);
        m8.v vVar = lVar.f406145g;
        lVar.f406145g = new m8.v(vVar.f406200a, d17, vVar.f406202c, vVar.f406203d, vVar.f406204e, vVar.f406205f, vVar.f406206g);
        if (this.M == null) {
            m8.l lVar2 = this.K;
            this.L = lVar2;
            r(lVar2.f406145g.f406201b);
            F(this.L);
        }
        k();
    }

    public final void h(java.lang.Object obj, int i17) {
        this.f406189s = new m8.m(0, 0L);
        m(obj, i17);
        this.f406189s = new m8.m(0, -9223372036854775807L);
        H(4);
        q(false);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        android.os.Handler handler = this.f406184n;
        try {
            switch (message.what) {
                case 0:
                    n((d9.a0) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    D(message.arg1 != 0);
                    return true;
                case 2:
                    c();
                    return true;
                case 3:
                    x((m8.n) message.obj);
                    return true;
                case 4:
                    E((m8.y) message.obj);
                    return true;
                case 5:
                    J();
                    return true;
                case 6:
                    o();
                    return true;
                case 7:
                    i((android.util.Pair) message.obj);
                    return true;
                case 8:
                    g((d9.x) message.obj);
                    return true;
                case 9:
                    d9.x xVar = (d9.x) message.obj;
                    m8.l lVar = this.K;
                    if (lVar != null && lVar.f406139a == xVar) {
                        k();
                    }
                    return true;
                case 10:
                    p();
                    return true;
                case 11:
                    A((m8.h[]) message.obj);
                    return true;
                case 12:
                    G(message.arg1);
                    return true;
                default:
                    return false;
            }
        } catch (java.io.IOException e17) {
            handler.obtainMessage(8, new m8.e(0, null, e17, -1)).sendToTarget();
            J();
            return true;
        } catch (java.lang.RuntimeException e18) {
            handler.obtainMessage(8, new m8.e(2, null, e18, -1)).sendToTarget();
            J();
            return true;
        } catch (m8.e e19) {
            handler.obtainMessage(8, e19).sendToTarget();
            J();
            return true;
        }
    }

    public final void i(android.util.Pair pair) {
        m8.l lVar;
        m8.l lVar2;
        java.lang.Object obj;
        java.lang.Object obj2;
        long j17;
        m8.m0 m0Var = this.N;
        m8.m0 m0Var2 = (m8.m0) pair.first;
        this.N = m0Var2;
        this.f406188r.f406209c = m0Var2;
        java.lang.Object obj3 = pair.second;
        if (m0Var == null) {
            if (this.H > 0) {
                android.util.Pair s17 = s(this.I);
                int i17 = this.H;
                this.H = 0;
                this.I = null;
                if (s17 == null) {
                    h(obj3, i17);
                    return;
                }
                int intValue = ((java.lang.Integer) s17.first).intValue();
                long longValue = ((java.lang.Long) s17.second).longValue();
                d9.z g17 = this.f406188r.g(intValue, longValue);
                this.f406189s = new m8.m(g17, g17.a() ? 0L : longValue, longValue);
                m(obj3, i17);
                return;
            }
            if (this.f406189s.f406164b != -9223372036854775807L) {
                m(obj3, 0);
                return;
            }
            if (m0Var2.j()) {
                h(obj3, 0);
                return;
            }
            android.util.Pair f17 = this.N.f(this.f406186p, this.f406187q, 0, -9223372036854775807L, 0L);
            int intValue2 = ((java.lang.Integer) f17.first).intValue();
            long longValue2 = ((java.lang.Long) f17.second).longValue();
            d9.z g18 = this.f406188r.g(intValue2, longValue2);
            this.f406189s = new m8.m(g18, g18.a() ? 0L : longValue2, longValue2);
            m(obj3, 0);
            return;
        }
        int i18 = this.f406189s.f406163a.f308960a;
        m8.l lVar3 = this.M;
        if (lVar3 == null) {
            lVar3 = this.K;
        }
        if (lVar3 == null && i18 >= m0Var.e()) {
            m(obj3, 0);
            return;
        }
        int a17 = this.N.a(lVar3 == null ? m0Var.d(i18, this.f406187q, true).f406129b : lVar3.f406140b);
        if (a17 == -1) {
            int t17 = t(i18, m0Var, this.N);
            if (t17 == -1) {
                h(obj3, 0);
                return;
            }
            android.util.Pair f18 = this.N.f(this.f406186p, this.f406187q, this.N.d(t17, this.f406187q, false).f406130c, -9223372036854775807L, 0L);
            int intValue3 = ((java.lang.Integer) f18.first).intValue();
            long longValue3 = ((java.lang.Long) f18.second).longValue();
            this.N.d(intValue3, this.f406187q, true);
            if (lVar3 != null) {
                java.lang.Object obj4 = this.f406187q.f406129b;
                m8.v vVar = lVar3.f406145g;
                d9.z zVar = vVar.f406200a;
                m8.l lVar4 = lVar3;
                lVar4.f406145g = new m8.v(zVar.f308960a == -1 ? zVar : new d9.z(-1, zVar.f308961b, zVar.f308962c), vVar.f406201b, vVar.f406202c, vVar.f406203d, vVar.f406204e, vVar.f406205f, vVar.f406206g);
                while (true) {
                    lVar4 = lVar4.f406148j;
                    if (lVar4 == null) {
                        break;
                    }
                    if (lVar4.f406140b.equals(obj4)) {
                        m8.w wVar = this.f406188r;
                        m8.v vVar2 = lVar4.f406145g;
                        wVar.getClass();
                        d9.z zVar2 = vVar2.f406200a;
                        if (zVar2.f308960a != intValue3) {
                            zVar2 = new d9.z(intValue3, zVar2.f308961b, zVar2.f308962c);
                        }
                        lVar4.f406145g = wVar.d(vVar2, zVar2);
                        obj = obj3;
                        obj2 = obj4;
                        j17 = longValue3;
                    } else {
                        m8.v vVar3 = lVar4.f406145g;
                        d9.z zVar3 = vVar3.f406200a;
                        obj = obj3;
                        obj2 = obj4;
                        j17 = longValue3;
                        lVar4.f406145g = new m8.v(zVar3.f308960a == -1 ? zVar3 : new d9.z(-1, zVar3.f308961b, zVar3.f308962c), vVar3.f406201b, vVar3.f406202c, vVar3.f406203d, vVar3.f406204e, vVar3.f406205f, vVar3.f406206g);
                    }
                    obj3 = obj;
                    obj4 = obj2;
                    longValue3 = j17;
                }
            }
            java.lang.Object obj5 = obj3;
            d9.z zVar4 = new d9.z(intValue3, -1, -1);
            this.f406189s = new m8.m(zVar4, y(zVar4, longValue3));
            m(obj5, 0);
            return;
        }
        if (a17 != i18) {
            m8.m mVar = this.f406189s;
            d9.z zVar5 = mVar.f406163a;
            m8.m mVar2 = new m8.m(zVar5.f308960a == a17 ? zVar5 : new d9.z(a17, zVar5.f308961b, zVar5.f308962c), mVar.f406164b, mVar.f406165c);
            mVar2.f406166d = mVar.f406166d;
            mVar2.f406167e = mVar.f406167e;
            this.f406189s = mVar2;
        }
        if (this.f406189s.f406163a.a()) {
            d9.z g19 = this.f406188r.g(a17, this.f406189s.f406165c);
            if (!g19.a() || g19.f308962c != this.f406189s.f406163a.f308962c) {
                this.f406189s = new m8.m(g19, y(g19, this.f406189s.f406165c), g19.a() ? this.f406189s.f406165c : -9223372036854775807L);
                m(obj3, 0);
                return;
            }
        }
        if (lVar3 == null) {
            m(obj3, 0);
            return;
        }
        while (true) {
            m8.v vVar4 = lVar3.f406145g;
            m8.w wVar2 = this.f406188r;
            wVar2.getClass();
            d9.z zVar6 = vVar4.f406200a;
            if (zVar6.f308960a != a17) {
                zVar6 = new d9.z(a17, zVar6.f308961b, zVar6.f308962c);
            }
            m8.v d17 = wVar2.d(vVar4, zVar6);
            lVar3.f406145g = d17;
            if (d17.f406205f || (lVar2 = lVar3.f406148j) == null) {
                break;
            } else {
                lVar3 = lVar2;
            }
        }
        while (true) {
            lVar = lVar3.f406148j;
            if (lVar == null) {
                break;
            }
            a17 = this.N.b(a17, this.f406187q, this.f406186p, this.D);
            if (a17 == -1 || !lVar.f406140b.equals(this.N.d(a17, this.f406187q, true).f406129b)) {
                break;
            }
            do {
                lVar3 = lVar;
                m8.v vVar5 = lVar3.f406145g;
                m8.w wVar3 = this.f406188r;
                wVar3.getClass();
                d9.z zVar7 = vVar5.f406200a;
                if (zVar7.f308960a != a17) {
                    zVar7 = new d9.z(a17, zVar7.f308961b, zVar7.f308962c);
                }
                m8.v d18 = wVar3.d(vVar5, zVar7);
                lVar3.f406145g = d18;
                if (!d18.f406205f) {
                    lVar = lVar3.f406148j;
                }
            } while (lVar != null);
        }
        m8.l lVar5 = this.L;
        if (lVar5 != null && lVar5.f406141c < lVar.f406141c) {
            this.K = lVar3;
            lVar3.f406148j = null;
            while (lVar != null) {
                lVar.b();
                lVar = lVar.f406148j;
            }
        } else {
            this.f406189s = new m8.m(this.M.f406145g.f406200a, y(this.M.f406145g.f406200a, this.f406189s.f406166d), this.f406189s.f406165c);
        }
        m(obj3, 0);
    }

    public final boolean j(long j17) {
        m8.l lVar;
        return j17 == -9223372036854775807L || this.f406189s.f406166d < j17 || ((lVar = this.M.f406148j) != null && (lVar.f406146h || lVar.f406145g.f406200a.a()));
    }

    public final void k() {
        int i17;
        m8.l lVar = this.K;
        long j17 = this.f406176J;
        long n17 = !lVar.f406146h ? 0L : lVar.f406139a.n();
        boolean z17 = false;
        if (n17 != Long.MIN_VALUE) {
            long a17 = n17 - (j17 - lVar.a());
            m8.c cVar = (m8.c) lVar.f406153o;
            char c17 = a17 > cVar.f406080c ? (char) 0 : a17 < cVar.f406079b ? (char) 2 : (char) 1;
            r9.o oVar = cVar.f406078a;
            synchronized (oVar) {
                i17 = oVar.f474927e * oVar.f474924b;
            }
            boolean z18 = i17 >= cVar.f406083f;
            boolean z19 = cVar.f406084g;
            if (c17 == 2 || (c17 == 1 && z19 && !z18)) {
                z17 = true;
            }
            cVar.f406084g = z17;
        }
        C(z17);
        if (z17) {
            m8.l lVar2 = this.K;
            lVar2.f406139a.h(this.f406176J - lVar2.a());
        }
    }

    public final void l() {
        m8.l lVar = this.K;
        if (lVar == null || lVar.f406146h) {
            return;
        }
        m8.l lVar2 = this.L;
        if (lVar2 == null || lVar2.f406148j == lVar) {
            for (m8.b0 b0Var : this.f406194x) {
                if (!((m8.a) b0Var).f406074m) {
                    return;
                }
            }
            this.K.f406139a.o();
        }
    }

    public final void m(java.lang.Object obj, int i17) {
        this.f406184n.obtainMessage(6, new m8.o(this.N, obj, this.f406189s, i17)).sendToTarget();
    }

    public final void n(d9.a0 a0Var, boolean z17) {
        this.f406184n.sendEmptyMessage(0);
        q(true);
        ((m8.c) this.f406180g).a(false);
        if (z17) {
            this.f406189s = new m8.m(0, -9223372036854775807L);
        } else {
            m8.m mVar = this.f406189s;
            this.f406189s = new m8.m(mVar.f406163a, mVar.f406166d, this.f406189s.f406165c);
        }
        this.f406193w = a0Var;
        if (a0Var != null) {
            a0Var.a(this.f406185o, true, this);
        }
        H(2);
        this.f406182i.sendEmptyMessage(2);
    }

    public final void o() {
        q(true);
        ((m8.c) this.f406180g).a(true);
        H(1);
        synchronized (this) {
            this.f406195y = true;
            notifyAll();
        }
    }

    public final void p() {
        m8.l lVar = this.M;
        if (lVar == null) {
            return;
        }
        boolean z17 = true;
        while (lVar != null && lVar.f406146h) {
            if (lVar.c()) {
                if (z17) {
                    m8.l lVar2 = this.L;
                    m8.l lVar3 = this.M;
                    boolean z18 = lVar2 != lVar3;
                    for (m8.l lVar4 = lVar3.f406148j; lVar4 != null; lVar4 = lVar4.f406148j) {
                        lVar4.b();
                    }
                    m8.l lVar5 = this.M;
                    lVar5.f406148j = null;
                    this.K = lVar5;
                    this.L = lVar5;
                    boolean[] zArr = new boolean[this.f406177d.length];
                    long d17 = lVar5.d(this.f406189s.f406166d, z18, zArr);
                    if (d17 != this.f406189s.f406166d) {
                        this.f406189s.f406166d = d17;
                        r(d17);
                    }
                    boolean[] zArr2 = new boolean[this.f406177d.length];
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        m8.b0[] b0VarArr = this.f406177d;
                        if (i17 >= b0VarArr.length) {
                            break;
                        }
                        m8.b0 b0Var = b0VarArr[i17];
                        m8.a aVar = (m8.a) b0Var;
                        boolean z19 = aVar.f406071g != 0;
                        zArr2[i17] = z19;
                        d9.g0 g0Var = this.M.f406142d[i17];
                        if (g0Var != null) {
                            i18++;
                        }
                        if (z19) {
                            if (g0Var != aVar.f406072h) {
                                if (b0Var == this.f406191u) {
                                    if (g0Var == null) {
                                        t9.y yVar = this.f406181h;
                                        t9.j jVar = this.f406192v;
                                        yVar.getClass();
                                        yVar.b(jVar.e());
                                        yVar.f498096g = jVar.d();
                                    }
                                    this.f406192v = null;
                                    this.f406191u = null;
                                }
                                e(b0Var);
                                aVar.k();
                            } else if (zArr[i17]) {
                                long j17 = this.f406176J;
                                aVar.f406075n = false;
                                aVar.f406074m = false;
                                aVar.n(j17, false);
                            }
                        }
                        i17++;
                    }
                    this.f406184n.obtainMessage(3, lVar.f406149k).sendToTarget();
                    d(zArr2, i18);
                } else {
                    this.K = lVar;
                    for (m8.l lVar6 = lVar.f406148j; lVar6 != null; lVar6 = lVar6.f406148j) {
                        lVar6.b();
                    }
                    m8.l lVar7 = this.K;
                    lVar7.f406148j = null;
                    if (lVar7.f406146h) {
                        long max = java.lang.Math.max(lVar7.f406145g.f406201b, this.f406176J - lVar7.a());
                        m8.l lVar8 = this.K;
                        lVar8.d(max, false, new boolean[lVar8.f406150l.length]);
                    }
                }
                k();
                L();
                this.f406182i.sendEmptyMessage(2);
                return;
            }
            if (lVar == this.L) {
                z17 = false;
            }
            lVar = lVar.f406148j;
        }
    }

    public final void q(boolean z17) {
        this.f406182i.removeMessages(2);
        this.A = false;
        t9.y yVar = this.f406181h;
        if (yVar.f498093d) {
            yVar.b(yVar.e());
            yVar.f498093d = false;
        }
        this.f406192v = null;
        this.f406191u = null;
        this.f406176J = 60000000L;
        for (m8.b0 b0Var : this.f406194x) {
            try {
                e(b0Var);
                ((m8.a) b0Var).k();
            } catch (java.lang.RuntimeException | m8.e unused) {
            }
        }
        this.f406194x = new m8.b0[0];
        m8.l lVar = this.M;
        if (lVar == null) {
            lVar = this.K;
        }
        while (lVar != null) {
            lVar.b();
            lVar = lVar.f406148j;
        }
        this.K = null;
        this.L = null;
        this.M = null;
        C(false);
        if (z17) {
            d9.a0 a0Var = this.f406193w;
            if (a0Var != null) {
                a0Var.e();
                this.f406193w = null;
            }
            this.f406188r.f406209c = null;
            this.N = null;
        }
    }

    public final void r(long j17) {
        m8.l lVar = this.M;
        long a17 = j17 + (lVar == null ? 60000000L : lVar.a());
        this.f406176J = a17;
        this.f406181h.b(a17);
        for (m8.b0 b0Var : this.f406194x) {
            long j18 = this.f406176J;
            m8.a aVar = (m8.a) b0Var;
            aVar.f406075n = false;
            aVar.f406074m = false;
            aVar.n(j18, false);
        }
    }

    public final android.util.Pair s(m8.n nVar) {
        m8.m0 m0Var = nVar.f406169a;
        if (m0Var.j()) {
            m0Var = this.N;
        }
        try {
            android.util.Pair f17 = m0Var.f(this.f406186p, this.f406187q, nVar.f406170b, nVar.f406171c, 0L);
            m8.m0 m0Var2 = this.N;
            if (m0Var2 == m0Var) {
                return f17;
            }
            int intValue = ((java.lang.Integer) f17.first).intValue();
            m8.k0 k0Var = this.f406187q;
            int a17 = m0Var2.a(m0Var.d(intValue, k0Var, true).f406129b);
            if (a17 != -1) {
                return android.util.Pair.create(java.lang.Integer.valueOf(a17), f17.second);
            }
            int t17 = t(((java.lang.Integer) f17.first).intValue(), m0Var, this.N);
            if (t17 == -1) {
                return null;
            }
            return this.N.f(this.f406186p, this.f406187q, this.N.d(t17, k0Var, false).f406130c, -9223372036854775807L, 0L);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new m8.t(this.N, nVar.f406170b, nVar.f406171c);
        }
    }

    public final int t(int i17, m8.m0 m0Var, m8.m0 m0Var2) {
        int e17 = m0Var.e();
        int i18 = -1;
        for (int i19 = 0; i19 < e17 && i18 == -1; i19++) {
            m8.l0 l0Var = this.f406186p;
            int i27 = this.D;
            m8.k0 k0Var = this.f406187q;
            i17 = m0Var.b(i17, k0Var, l0Var, i27);
            if (i17 == -1) {
                break;
            }
            i18 = m0Var2.a(m0Var.d(i17, k0Var, true).f406129b);
        }
        return i18;
    }

    public final void w(long j17, long j18) {
        android.os.Handler handler = this.f406182i;
        handler.removeMessages(2);
        long elapsedRealtime = (j17 + j18) - android.os.SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            handler.sendEmptyMessage(2);
        } else {
            handler.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    public final void x(m8.n nVar) {
        int i17;
        long j17;
        if (this.N == null) {
            this.H++;
            this.I = nVar;
            return;
        }
        android.util.Pair s17 = s(nVar);
        if (s17 == null) {
            m8.m mVar = new m8.m(0, 0L);
            this.f406189s = mVar;
            this.f406184n.obtainMessage(4, 1, 0, mVar).sendToTarget();
            this.f406189s = new m8.m(0, -9223372036854775807L);
            H(4);
            q(false);
            return;
        }
        int i18 = nVar.f406171c == -9223372036854775807L ? 1 : 0;
        int intValue = ((java.lang.Integer) s17.first).intValue();
        long longValue = ((java.lang.Long) s17.second).longValue();
        d9.z g17 = this.f406188r.g(intValue, longValue);
        if (g17.a()) {
            i17 = 1;
            j17 = 0;
        } else {
            i17 = i18;
            j17 = longValue;
        }
        try {
            if (g17.m123743xb2c87fbf(this.f406189s.f406163a) && j17 / 1000 == this.f406189s.f406166d / 1000) {
                return;
            }
            long y17 = y(g17, j17);
            int i19 = i17 | (j17 == y17 ? 0 : 1);
            m8.m mVar2 = new m8.m(g17, y17, longValue);
            this.f406189s = mVar2;
            this.f406184n.obtainMessage(4, i19, 0, mVar2).sendToTarget();
        } finally {
            m8.m mVar3 = new m8.m(g17, j17, longValue);
            this.f406189s = mVar3;
            this.f406184n.obtainMessage(4, i17, 0, mVar3).sendToTarget();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y(d9.z r10, long r11) {
        /*
            r9 = this;
            r9.K()
            r0 = 0
            r9.A = r0
            r1 = 2
            r9.H(r1)
            m8.l r2 = r9.M
            r3 = 0
            if (r2 != 0) goto L18
            m8.l r10 = r9.K
            if (r10 == 0) goto L16
            r10.b()
        L16:
            r4 = r3
            goto L58
        L18:
            r4 = r3
        L19:
            if (r2 == 0) goto L58
            if (r4 != 0) goto L52
            m8.v r5 = r2.f406145g
            d9.z r5 = r5.f406200a
            boolean r5 = r10.m123743xb2c87fbf(r5)
            if (r5 == 0) goto L4d
            boolean r5 = r2.f406146h
            if (r5 == 0) goto L4d
            m8.m0 r5 = r9.N
            m8.v r6 = r2.f406145g
            d9.z r6 = r6.f406200a
            int r6 = r6.f308960a
            m8.k0 r7 = r9.f406187q
            r5.c(r6, r7)
            int r5 = r7.a(r11)
            r6 = -1
            if (r5 == r6) goto L4b
            long[] r6 = r7.f406133f
            r5 = r6[r5]
            m8.v r7 = r2.f406145g
            long r7 = r7.f406202c
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4d
        L4b:
            r5 = 1
            goto L4e
        L4d:
            r5 = r0
        L4e:
            if (r5 == 0) goto L52
            r4 = r2
            goto L55
        L52:
            r2.b()
        L55:
            m8.l r2 = r2.f406148j
            goto L19
        L58:
            m8.l r10 = r9.M
            if (r10 != r4) goto L60
            m8.l r2 = r9.L
            if (r10 == r2) goto L7a
        L60:
            m8.b0[] r10 = r9.f406194x
            int r2 = r10.length
            r5 = r0
        L64:
            if (r5 >= r2) goto L70
            r6 = r10[r5]
            m8.a r6 = (m8.a) r6
            r6.k()
            int r5 = r5 + 1
            goto L64
        L70:
            m8.b0[] r10 = new m8.b0[r0]
            r9.f406194x = r10
            r9.f406192v = r3
            r9.f406191u = r3
            r9.M = r3
        L7a:
            if (r4 == 0) goto L99
            r4.f406148j = r3
            r9.K = r4
            r9.L = r4
            r9.F(r4)
            m8.l r10 = r9.M
            boolean r0 = r10.f406147i
            if (r0 == 0) goto L92
            d9.x r10 = r10.f406139a
            long r10 = r10.c(r11)
            r11 = r10
        L92:
            r9.r(r11)
            r9.k()
            goto La2
        L99:
            r9.K = r3
            r9.L = r3
            r9.M = r3
            r9.r(r11)
        La2:
            android.os.Handler r10 = r9.f406182i
            r10.sendEmptyMessage(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.p.y(d9.z, long):long");
    }
}
