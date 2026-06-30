package d9;

/* loaded from: classes15.dex */
public final class t implements d9.x, q8.g, r9.a0, r9.d0, d9.e0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public d9.l0 E;
    public long F;
    public boolean[] G;
    public boolean[] H;
    public boolean I;
    public long K;
    public int M;
    public boolean N;
    public boolean P;

    /* renamed from: d, reason: collision with root package name */
    public final android.net.Uri f308931d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.k f308932e;

    /* renamed from: f, reason: collision with root package name */
    public final int f308933f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f308934g;

    /* renamed from: h, reason: collision with root package name */
    public final d9.u f308935h;

    /* renamed from: i, reason: collision with root package name */
    public final d9.r f308936i;

    /* renamed from: m, reason: collision with root package name */
    public final r9.b f308937m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f308938n;

    /* renamed from: o, reason: collision with root package name */
    public final long f308939o;

    /* renamed from: q, reason: collision with root package name */
    public final d9.q f308941q;

    /* renamed from: v, reason: collision with root package name */
    public d9.w f308946v;

    /* renamed from: w, reason: collision with root package name */
    public q8.m f308947w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f308950z;

    /* renamed from: p, reason: collision with root package name */
    public final r9.g0 f308940p = new r9.g0("Loader:ExtractorMediaPeriod");

    /* renamed from: r, reason: collision with root package name */
    public final t9.g f308942r = new t9.g();

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f308943s = new d9.m(this);

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f308944t = new d9.n(this);

    /* renamed from: u, reason: collision with root package name */
    public final android.os.Handler f308945u = new android.os.Handler();

    /* renamed from: y, reason: collision with root package name */
    public int[] f308949y = new int[0];

    /* renamed from: x, reason: collision with root package name */
    public d9.f0[] f308948x = new d9.f0[0];
    public long L = -9223372036854775807L;

    /* renamed from: J, reason: collision with root package name */
    public long f308930J = -1;

    public t(android.net.Uri uri, r9.k kVar, q8.e[] eVarArr, int i17, android.os.Handler handler, d9.u uVar, d9.r rVar, r9.b bVar, java.lang.String str, int i18) {
        this.f308931d = uri;
        this.f308932e = kVar;
        this.f308933f = i17;
        this.f308934g = handler;
        this.f308935h = uVar;
        this.f308936i = rVar;
        this.f308937m = bVar;
        this.f308938n = str;
        this.f308939o = i18;
        this.f308941q = new d9.q(eVarArr, this);
    }

    @Override // d9.e0
    public void a(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417) {
        this.f308945u.post(this.f308943s);
    }

    @Override // q8.g
    public void b(q8.m mVar) {
        this.f308947w = mVar;
        this.f308945u.post(this.f308943s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r3 = false;
     */
    @Override // d9.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long c(long r8) {
        /*
            r7 = this;
            q8.m r0 = r7.f308947w
            boolean r0 = r0.c()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r8 = 0
        Lb:
            r7.K = r8
            r0 = 0
            r7.C = r0
            boolean r1 = r7.t()
            if (r1 != 0) goto L52
            d9.f0[] r1 = r7.f308948x
            int r1 = r1.length
            r2 = r0
        L1a:
            r3 = 1
            if (r2 >= r1) goto L4f
            d9.f0[] r4 = r7.f308948x
            r4 = r4[r2]
            r4.n()
            boolean r3 = r4.e(r8, r3, r0)
            if (r3 != 0) goto L36
            boolean[] r3 = r7.H
            boolean r3 = r3[r2]
            if (r3 != 0) goto L34
            boolean r3 = r7.I
            if (r3 != 0) goto L36
        L34:
            r3 = r0
            goto L4f
        L36:
            d9.c0 r3 = r4.f308872c
            monitor-enter(r3)
            int r5 = r3.f308837l     // Catch: java.lang.Throwable -> L4c
            if (r5 != 0) goto L41
            monitor-exit(r3)
            r5 = -1
            goto L46
        L41:
            long r5 = r3.a(r5)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
        L46:
            r4.f(r5)
            int r2 = r2 + 1
            goto L1a
        L4c:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        L4f:
            if (r3 == 0) goto L52
            return r8
        L52:
            r7.L = r8
            r7.N = r0
            r9.g0 r1 = r7.f308940p
            boolean r2 = r1.a()
            if (r2 == 0) goto L64
            r9.b0 r1 = r1.f474899b
            r1.b(r0)
            goto L72
        L64:
            d9.f0[] r1 = r7.f308948x
            int r2 = r1.length
            r3 = r0
        L68:
            if (r3 >= r2) goto L72
            r4 = r1[r3]
            r4.m(r0)
            int r3 = r3 + 1
            goto L68
        L72:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.t.c(long):long");
    }

    @Override // d9.x
    public long d() {
        if (!this.C) {
            return -9223372036854775807L;
        }
        this.C = false;
        return this.K;
    }

    @Override // r9.a0
    public void e(r9.c0 c0Var, long j17, long j18) {
        long j19;
        d9.p pVar = (d9.p) c0Var;
        if (this.f308930J == -1) {
            this.f308930J = pVar.f308923i;
        }
        this.N = true;
        if (this.F == -9223372036854775807L) {
            long j27 = Long.MIN_VALUE;
            for (d9.f0 f0Var : this.f308948x) {
                d9.c0 c0Var2 = f0Var.f308872c;
                synchronized (c0Var2) {
                    j19 = c0Var2.f308839n;
                }
                j27 = java.lang.Math.max(j27, j19);
            }
            long j28 = j27 == Long.MIN_VALUE ? 0L : com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d + j27;
            this.F = j28;
            ((d9.v) this.f308936i).g(j28, this.f308947w.c());
        }
        this.f308946v.b(this);
    }

    @Override // r9.d0
    public void f() {
        d9.q qVar = this.f308941q;
        q8.e eVar = qVar.f308927c;
        if (eVar != null) {
            eVar.mo131096x41012807();
            qVar.f308927c = null;
        }
        for (d9.f0 f0Var : this.f308948x) {
            f0Var.m(false);
        }
    }

    @Override // r9.a0
    public int g(r9.c0 c0Var, long j17, long j18, java.io.IOException iOException) {
        q8.m mVar;
        d9.p pVar = (d9.p) c0Var;
        if (this.f308930J == -1) {
            this.f308930J = pVar.f308923i;
        }
        android.os.Handler handler = this.f308934g;
        if (handler != null && this.f308935h != null) {
            handler.post(new d9.o(this, iOException));
        }
        if (iOException instanceof d9.m0) {
            return 3;
        }
        int i17 = s() > this.M ? 1 : 0;
        if (this.f308930J == -1 && ((mVar = this.f308947w) == null || mVar.g() == -9223372036854775807L)) {
            this.K = 0L;
            this.C = this.A;
            for (d9.f0 f0Var : this.f308948x) {
                f0Var.m(false);
            }
            pVar.f308919e.f442173a = 0L;
            pVar.f308922h = 0L;
            pVar.f308921g = true;
        }
        this.M = s();
        return i17;
    }

    @Override // d9.i0
    public boolean h(long j17) {
        boolean z17 = false;
        if (this.N || (this.A && this.D == 0)) {
            return false;
        }
        t9.g gVar = this.f308942r;
        synchronized (gVar) {
            if (!gVar.f498045a) {
                gVar.f498045a = true;
                gVar.notifyAll();
                z17 = true;
            }
        }
        if (this.f308940p.a()) {
            return z17;
        }
        u();
        return true;
    }

    @Override // d9.x
    public long i(q9.m[] mVarArr, boolean[] zArr, d9.g0[] g0VarArr, boolean[] zArr2, long j17) {
        q9.m mVar;
        t9.a.d(this.A);
        int i17 = this.D;
        for (int i18 = 0; i18 < mVarArr.length; i18++) {
            d9.g0 g0Var = g0VarArr[i18];
            if (g0Var != null && (mVarArr[i18] == null || !zArr[i18])) {
                boolean[] zArr3 = this.G;
                int i19 = ((d9.s) g0Var).f308928a;
                t9.a.d(zArr3[i19]);
                this.D--;
                this.G[i19] = false;
                g0VarArr[i18] = null;
            }
        }
        boolean z17 = !this.B ? j17 == 0 : i17 != 0;
        for (int i27 = 0; i27 < mVarArr.length; i27++) {
            if (g0VarArr[i27] == null && (mVar = mVarArr[i27]) != null) {
                q9.e eVar = (q9.e) mVar;
                int[] iArr = eVar.f442382c;
                t9.a.d(iArr.length == 1);
                t9.a.d(iArr[0] == 0);
                int a17 = this.E.a(eVar.f442380a);
                t9.a.d(!this.G[a17]);
                this.D++;
                this.G[a17] = true;
                g0VarArr[i27] = new d9.s(this, a17);
                zArr2[i27] = true;
                if (!z17) {
                    d9.f0 f0Var = this.f308948x[a17];
                    f0Var.n();
                    if (!f0Var.e(j17, true, true)) {
                        d9.c0 c0Var = f0Var.f308872c;
                        if (c0Var.f308835j + c0Var.f308837l != 0) {
                            z17 = true;
                        }
                    }
                    z17 = false;
                }
            }
        }
        if (this.D == 0) {
            this.C = false;
            r9.g0 g0Var2 = this.f308940p;
            if (g0Var2.a()) {
                for (d9.f0 f0Var2 : this.f308948x) {
                    f0Var2.h();
                }
                g0Var2.f474899b.b(false);
            } else {
                for (d9.f0 f0Var3 : this.f308948x) {
                    f0Var3.m(false);
                }
            }
        } else if (z17) {
            j17 = c(j17);
            for (int i28 = 0; i28 < g0VarArr.length; i28++) {
                if (g0VarArr[i28] != null) {
                    zArr2[i28] = true;
                }
            }
        }
        this.B = true;
        return j17;
    }

    @Override // q8.g
    public void j() {
        this.f308950z = true;
        this.f308945u.post(this.f308943s);
    }

    @Override // d9.x
    public d9.l0 k() {
        return this.E;
    }

    @Override // q8.g
    public q8.o l(int i17, int i18) {
        int length = this.f308948x.length;
        for (int i19 = 0; i19 < length; i19++) {
            if (this.f308949y[i19] == i17) {
                return this.f308948x[i19];
            }
        }
        d9.f0 f0Var = new d9.f0(this.f308937m);
        f0Var.f308881l = this;
        int i27 = length + 1;
        int[] copyOf = java.util.Arrays.copyOf(this.f308949y, i27);
        this.f308949y = copyOf;
        copyOf[length] = i17;
        d9.f0[] f0VarArr = (d9.f0[]) java.util.Arrays.copyOf(this.f308948x, i27);
        this.f308948x = f0VarArr;
        f0VarArr[length] = f0Var;
        return f0Var;
    }

    @Override // d9.i0
    public long m() {
        long j17;
        long j18;
        long j19;
        if (this.N) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.L;
        }
        int i17 = 0;
        if (this.I) {
            int length = this.f308948x.length;
            j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            while (i17 < length) {
                if (this.H[i17]) {
                    d9.c0 c0Var = this.f308948x[i17].f308872c;
                    synchronized (c0Var) {
                        j19 = c0Var.f308839n;
                    }
                    j17 = java.lang.Math.min(j17, j19);
                }
                i17++;
            }
        } else {
            d9.f0[] f0VarArr = this.f308948x;
            int length2 = f0VarArr.length;
            long j27 = Long.MIN_VALUE;
            while (i17 < length2) {
                d9.c0 c0Var2 = f0VarArr[i17].f308872c;
                synchronized (c0Var2) {
                    j18 = c0Var2.f308839n;
                }
                j27 = java.lang.Math.max(j27, j18);
                i17++;
            }
            j17 = j27;
        }
        return j17 == Long.MIN_VALUE ? this.K : j17;
    }

    @Override // d9.i0
    public long n() {
        if (this.D == 0) {
            return Long.MIN_VALUE;
        }
        return m();
    }

    @Override // d9.x
    public void o() {
        this.f308940p.b();
    }

    @Override // d9.x
    public void p(long j17) {
        int length = this.f308948x.length;
        for (int i17 = 0; i17 < length; i17++) {
            this.f308948x[i17].g(j17, false, this.G[i17]);
        }
    }

    @Override // r9.a0
    public void q(r9.c0 c0Var, long j17, long j18, boolean z17) {
        d9.p pVar = (d9.p) c0Var;
        if (z17) {
            return;
        }
        if (this.f308930J == -1) {
            this.f308930J = pVar.f308923i;
        }
        for (d9.f0 f0Var : this.f308948x) {
            f0Var.m(false);
        }
        if (this.D > 0) {
            this.f308946v.b(this);
        }
    }

    @Override // d9.x
    public void r(d9.w wVar, long j17) {
        this.f308946v = wVar;
        t9.g gVar = this.f308942r;
        synchronized (gVar) {
            if (!gVar.f498045a) {
                gVar.f498045a = true;
                gVar.notifyAll();
            }
        }
        u();
    }

    public final int s() {
        int i17 = 0;
        for (d9.f0 f0Var : this.f308948x) {
            d9.c0 c0Var = f0Var.f308872c;
            i17 += c0Var.f308835j + c0Var.f308834i;
        }
        return i17;
    }

    public final boolean t() {
        return this.L != -9223372036854775807L;
    }

    public final void u() {
        q8.m mVar;
        d9.p pVar = new d9.p(this, this.f308931d, this.f308932e, this.f308941q, this.f308942r);
        if (this.A) {
            t9.a.d(t());
            long j17 = this.F;
            if (j17 != -9223372036854775807L && this.L >= j17) {
                this.N = true;
                this.L = -9223372036854775807L;
                return;
            }
            long d17 = this.f308947w.d(this.L);
            long j18 = this.L;
            pVar.f308919e.f442173a = d17;
            pVar.f308922h = j18;
            pVar.f308921g = true;
            this.L = -9223372036854775807L;
        }
        this.M = s();
        int i17 = this.f308933f;
        if (i17 == -1) {
            i17 = (this.A && this.f308930J == -1 && ((mVar = this.f308947w) == null || mVar.g() == -9223372036854775807L)) ? 6 : 3;
        }
        this.f308940p.d(pVar, this, i17);
    }
}
