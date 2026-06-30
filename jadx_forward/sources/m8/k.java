package m8;

/* loaded from: classes15.dex */
public final class k implements m8.i {

    /* renamed from: a, reason: collision with root package name */
    public final q9.o f406106a;

    /* renamed from: b, reason: collision with root package name */
    public final q9.n f406107b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f406108c;

    /* renamed from: d, reason: collision with root package name */
    public final m8.p f406109d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f406110e;

    /* renamed from: f, reason: collision with root package name */
    public final m8.l0 f406111f;

    /* renamed from: g, reason: collision with root package name */
    public final m8.k0 f406112g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f406113h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f406114i;

    /* renamed from: j, reason: collision with root package name */
    public int f406115j;

    /* renamed from: k, reason: collision with root package name */
    public int f406116k;

    /* renamed from: l, reason: collision with root package name */
    public int f406117l;

    /* renamed from: m, reason: collision with root package name */
    public int f406118m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f406119n;

    /* renamed from: o, reason: collision with root package name */
    public m8.m0 f406120o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f406121p;

    /* renamed from: q, reason: collision with root package name */
    public d9.l0 f406122q;

    /* renamed from: r, reason: collision with root package name */
    public q9.n f406123r;

    /* renamed from: s, reason: collision with root package name */
    public m8.y f406124s;

    /* renamed from: t, reason: collision with root package name */
    public m8.m f406125t;

    /* renamed from: u, reason: collision with root package name */
    public int f406126u;

    /* renamed from: v, reason: collision with root package name */
    public long f406127v;

    public k(m8.b0[] b0VarArr, q9.o oVar, m8.u uVar) {
        java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int i17 = t9.d0.f498031a;
        t9.a.d(b0VarArr.length > 0);
        oVar.getClass();
        this.f406106a = oVar;
        this.f406114i = false;
        this.f406115j = 0;
        this.f406116k = 1;
        this.f406110e = new java.util.concurrent.CopyOnWriteArraySet();
        q9.n nVar = new q9.n(new q9.m[b0VarArr.length]);
        this.f406107b = nVar;
        this.f406120o = m8.m0.f406168a;
        this.f406111f = new m8.l0();
        this.f406112g = new m8.k0();
        this.f406122q = d9.l0.f308907d;
        this.f406123r = nVar;
        this.f406124s = m8.y.f406211d;
        m8.j jVar = new m8.j(this, android.os.Looper.myLooper() != null ? android.os.Looper.myLooper() : android.os.Looper.getMainLooper());
        this.f406108c = jVar;
        m8.m mVar = new m8.m(0, 0L);
        this.f406125t = mVar;
        this.f406109d = new m8.p(b0VarArr, oVar, uVar, this.f406114i, this.f406115j, jVar, mVar, this);
    }

    @Override // m8.a0
    public void a(m8.y yVar) {
        if (yVar == null) {
            yVar = m8.y.f406211d;
        }
        this.f406109d.f406182i.obtainMessage(4, yVar).sendToTarget();
    }

    @Override // m8.i
    public void b(m8.h... hVarArr) {
        m8.p pVar = this.f406109d;
        synchronized (pVar) {
            if (pVar.f406195y) {
                return;
            }
            int i17 = pVar.E;
            pVar.E = i17 + 1;
            pVar.f406182i.obtainMessage(11, hVarArr).sendToTarget();
            boolean z17 = false;
            while (pVar.F <= i17) {
                try {
                    pVar.wait();
                } catch (java.lang.InterruptedException unused) {
                    z17 = true;
                }
            }
            if (z17) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    @Override // m8.a0
    public boolean c() {
        return this.f406114i;
    }

    @Override // m8.a0
    public void d(m8.z zVar) {
        this.f406110e.remove(zVar);
    }

    @Override // m8.a0
    public void e(boolean z17) {
        if (this.f406114i != z17) {
            this.f406114i = z17;
            this.f406109d.f406182i.obtainMessage(1, z17 ? 1 : 0, 0).sendToTarget();
            java.util.Iterator it = this.f406110e.iterator();
            while (it.hasNext()) {
                ((m8.z) it.next()).y(z17, this.f406116k);
            }
        }
    }

    @Override // m8.i
    public void f(m8.h... hVarArr) {
        m8.p pVar = this.f406109d;
        if (pVar.f406195y) {
            return;
        }
        pVar.E++;
        pVar.f406182i.obtainMessage(11, hVarArr).sendToTarget();
    }

    public int g() {
        if (this.f406120o.j()) {
            return 0;
        }
        long i17 = (this.f406120o.j() || this.f406117l > 0) ? this.f406127v : i(this.f406125t.f406167e);
        long mo146926x51e8b0a = mo146926x51e8b0a();
        if (i17 == -9223372036854775807L || mo146926x51e8b0a == -9223372036854775807L) {
            return 0;
        }
        if (mo146926x51e8b0a == 0) {
            return 100;
        }
        int i18 = (int) ((i17 * 100) / mo146926x51e8b0a);
        int i19 = t9.d0.f498031a;
        return java.lang.Math.max(0, java.lang.Math.min(i18, 100));
    }

    @Override // m8.a0
    /* renamed from: getCurrentPosition */
    public long mo146925x9746038c() {
        return (this.f406120o.j() || this.f406117l > 0) ? this.f406127v : i(this.f406125t.f406166d);
    }

    @Override // m8.a0
    /* renamed from: getDuration */
    public long mo146926x51e8b0a() {
        if (this.f406120o.j()) {
            return -9223372036854775807L;
        }
        if (!(!this.f406120o.j() && this.f406117l == 0 && this.f406125t.f406163a.a())) {
            return m8.b.b(this.f406120o.g(h(), this.f406111f).f406161f);
        }
        d9.z zVar = this.f406125t.f406163a;
        m8.m0 m0Var = this.f406120o;
        int i17 = zVar.f308960a;
        m8.k0 k0Var = this.f406112g;
        m0Var.c(i17, k0Var);
        long[] jArr = k0Var.f406137j[zVar.f308961b];
        int length = jArr.length;
        int i18 = zVar.f308962c;
        return m8.b.b(i18 < length ? jArr[i18] : -9223372036854775807L);
    }

    public int h() {
        return (this.f406120o.j() || this.f406117l > 0) ? this.f406126u : this.f406120o.d(this.f406125t.f406163a.f308960a, this.f406112g, false).f406130c;
    }

    public final long i(long j17) {
        long b17 = m8.b.b(j17);
        if (this.f406125t.f406163a.a()) {
            return b17;
        }
        m8.m0 m0Var = this.f406120o;
        int i17 = this.f406125t.f406163a.f308960a;
        m8.k0 k0Var = this.f406112g;
        m0Var.c(i17, k0Var);
        return b17 + m8.b.b(k0Var.f406132e);
    }

    public void j(d9.a0 a0Var) {
        boolean j17 = this.f406120o.j();
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f406110e;
        if (!j17 || this.f406121p != null) {
            this.f406120o = m8.m0.f406168a;
            this.f406121p = null;
            java.util.Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((m8.z) it.next()).t(this.f406120o, this.f406121p);
            }
        }
        if (this.f406113h) {
            this.f406113h = false;
            this.f406122q = d9.l0.f308907d;
            this.f406123r = this.f406107b;
            q9.k kVar = (q9.k) this.f406106a;
            kVar.getClass();
            kVar.f442399c = null;
            java.util.Iterator it6 = copyOnWriteArraySet.iterator();
            while (it6.hasNext()) {
                ((m8.z) it6.next()).e(this.f406122q, this.f406123r);
            }
        }
        this.f406118m++;
        this.f406109d.f406182i.obtainMessage(0, 1, 0, a0Var).sendToTarget();
    }

    @Override // m8.a0
    /* renamed from: release */
    public void mo146927x41012807() {
        java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int i17 = t9.d0.f498031a;
        java.util.HashSet hashSet = m8.q.f406197a;
        synchronized (m8.q.class) {
            java.util.HashSet hashSet2 = m8.q.f406197a;
        }
        m8.p pVar = this.f406109d;
        synchronized (pVar) {
            if (!pVar.f406195y) {
                pVar.f406182i.sendEmptyMessage(6);
                boolean z17 = false;
                while (!pVar.f406195y) {
                    try {
                        pVar.wait();
                    } catch (java.lang.InterruptedException unused) {
                        z17 = true;
                    }
                }
                if (z17) {
                    java.lang.Thread.currentThread().interrupt();
                }
                pVar.f406183m.quit();
            }
        }
        this.f406108c.removeCallbacksAndMessages(null);
    }

    @Override // m8.a0
    /* renamed from: seekTo */
    public void mo146928xc9fc1b13(long j17) {
        int h17 = h();
        if (h17 < 0 || (!this.f406120o.j() && h17 >= this.f406120o.i())) {
            throw new m8.t(this.f406120o, h17, j17);
        }
        this.f406117l++;
        this.f406126u = h17;
        if (!this.f406120o.j()) {
            m8.m0 m0Var = this.f406120o;
            m8.l0 l0Var = this.f406111f;
            m0Var.g(h17, l0Var);
            long a17 = j17 == -9223372036854775807L ? l0Var.f406160e : m8.b.a(j17);
            int i17 = l0Var.f406158c;
            long j18 = l0Var.f406162g + a17;
            m8.m0 m0Var2 = this.f406120o;
            m8.k0 k0Var = this.f406112g;
            long j19 = m0Var2.d(i17, k0Var, false).f406131d;
            while (j19 != -9223372036854775807L && j18 >= j19 && i17 < l0Var.f406159d) {
                j18 -= j19;
                i17++;
                j19 = this.f406120o.d(i17, k0Var, false).f406131d;
            }
        }
        m8.p pVar = this.f406109d;
        if (j17 == -9223372036854775807L) {
            this.f406127v = 0L;
            pVar.f406182i.obtainMessage(3, new m8.n(this.f406120o, h17, -9223372036854775807L)).sendToTarget();
            return;
        }
        this.f406127v = j17;
        pVar.f406182i.obtainMessage(3, new m8.n(this.f406120o, h17, m8.b.a(j17))).sendToTarget();
        java.util.Iterator it = this.f406110e.iterator();
        while (it.hasNext()) {
            ((m8.z) it.next()).A();
        }
    }

    @Override // m8.a0
    public int t() {
        return this.f406116k;
    }
}
