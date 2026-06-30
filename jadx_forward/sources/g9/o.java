package g9;

/* loaded from: classes15.dex */
public final class o implements r9.a0, r9.d0, d9.i0, q8.g, d9.e0 {
    public int A;
    public boolean B;
    public boolean[] C;
    public boolean[] D;
    public long E;
    public long F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: d, reason: collision with root package name */
    public final int f351159d;

    /* renamed from: e, reason: collision with root package name */
    public final g9.n f351160e;

    /* renamed from: f, reason: collision with root package name */
    public final g9.f f351161f;

    /* renamed from: g, reason: collision with root package name */
    public final r9.b f351162g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f351163h;

    /* renamed from: i, reason: collision with root package name */
    public final int f351164i;

    /* renamed from: n, reason: collision with root package name */
    public final d9.g f351166n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f351173u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f351174v;

    /* renamed from: w, reason: collision with root package name */
    public int f351175w;

    /* renamed from: x, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f351176x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f351177y;

    /* renamed from: z, reason: collision with root package name */
    public d9.l0 f351178z;

    /* renamed from: m, reason: collision with root package name */
    public final r9.g0 f351165m = new r9.g0("Loader:HlsSampleStreamWrapper");

    /* renamed from: o, reason: collision with root package name */
    public final g9.d f351167o = new g9.d();

    /* renamed from: t, reason: collision with root package name */
    public int[] f351172t = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public d9.f0[] f351171s = new d9.f0[0];

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f351168p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f351169q = new g9.m(this);

    /* renamed from: r, reason: collision with root package name */
    public final android.os.Handler f351170r = new android.os.Handler();

    public o(int i17, g9.n nVar, g9.f fVar, r9.b bVar, long j17, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i18, d9.g gVar) {
        this.f351159d = i17;
        this.f351160e = nVar;
        this.f351161f = fVar;
        this.f351162g = bVar;
        this.f351163h = c1601x7dc4e417;
        this.f351164i = i18;
        this.f351166n = gVar;
        this.E = j17;
        this.F = j17;
    }

    public static com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 s(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e4172) {
        if (c1601x7dc4e417 == null) {
            return c1601x7dc4e4172;
        }
        int c17 = t9.k.c(c1601x7dc4e4172.f125613i);
        java.lang.String str = c1601x7dc4e417.f125610f;
        return new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417(c1601x7dc4e417.f125608d, c1601x7dc4e4172.f125612h, c1601x7dc4e4172.f125613i, c17 == 1 ? t(str, 1) : c17 == 2 ? t(str, 2) : null, c1601x7dc4e417.f125609e, c1601x7dc4e4172.f125614m, c1601x7dc4e417.f125617p, c1601x7dc4e417.f125618q, c1601x7dc4e4172.f125619r, c1601x7dc4e4172.f125620s, c1601x7dc4e4172.f125621t, c1601x7dc4e4172.f125623v, c1601x7dc4e4172.f125622u, c1601x7dc4e4172.f125624w, c1601x7dc4e4172.f125625x, c1601x7dc4e4172.f125626y, c1601x7dc4e4172.f125627z, c1601x7dc4e4172.A, c1601x7dc4e4172.B, c1601x7dc4e417.D, c1601x7dc4e417.E, c1601x7dc4e4172.F, c1601x7dc4e4172.C, c1601x7dc4e4172.f125615n, c1601x7dc4e4172.f125616o, c1601x7dc4e4172.f125611g);
    }

    public static java.lang.String t(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String[] split = str.split("(\\s*,\\s*)|(\\s*$)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str2 : split) {
            if (i17 == t9.k.c(t9.k.a(str2))) {
                if (sb6.length() > 0) {
                    sb6.append(",");
                }
                sb6.append(str2);
            }
        }
        if (sb6.length() > 0) {
            return sb6.toString();
        }
        return null;
    }

    @Override // d9.e0
    public void a(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417) {
        this.f351170r.post(this.f351169q);
    }

    @Override // q8.g
    public void b(q8.m mVar) {
    }

    @Override // r9.a0
    public void e(r9.c0 c0Var, long j17, long j18) {
        e9.a aVar = (e9.a) c0Var;
        g9.f fVar = this.f351161f;
        fVar.getClass();
        if (aVar instanceof g9.c) {
            g9.c cVar = (g9.c) aVar;
            fVar.f351109i = cVar.f331861i;
            fVar.a(cVar.f331853a.f474916a, cVar.f351095l, cVar.f351096m);
        }
        this.f351166n.d(aVar.f331853a, aVar.f331854b, this.f351159d, aVar.f331855c, aVar.f331856d, aVar.f331857e, aVar.f331858f, aVar.f331859g, j17, j18, aVar.d());
        if (this.f351174v) {
            ((g9.j) this.f351160e).b(this);
        } else {
            h(this.E);
        }
    }

    @Override // r9.d0
    public void f() {
        w();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    @Override // r9.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(r9.c0 r23, long r24, long r26, java.io.IOException r28) {
        /*
            r22 = this;
            r0 = r22
            r14 = r28
            r12 = r23
            e9.a r12 = (e9.a) r12
            long r1 = r12.d()
            boolean r3 = r12 instanceof g9.i
            r4 = 1
            r20 = 0
            if (r3 == 0) goto L1d
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L1a
            goto L1d
        L1a:
            r1 = r20
            goto L1e
        L1d:
            r1 = r4
        L1e:
            g9.f r2 = r0.f351161f
            if (r1 == 0) goto L6b
            q9.m r1 = r2.f351117q
            d9.k0 r2 = r2.f351106f
            com.google.android.exoplayer2.Format r5 = r12.f331855c
            int r2 = r2.a(r5)
            q9.e r1 = (q9.e) r1
            int r2 = r1.e(r2)
            boolean r5 = r14 instanceof r9.y
            if (r5 == 0) goto L45
            r5 = r14
            r9.y r5 = (r9.y) r5
            int r5 = r5.f474972d
            r6 = 404(0x194, float:5.66E-43)
            if (r5 == r6) goto L43
            r6 = 410(0x19a, float:5.75E-43)
            if (r5 != r6) goto L45
        L43:
            r5 = r4
            goto L47
        L45:
            r5 = r20
        L47:
            if (r5 == 0) goto L65
            r5 = 60000(0xea60, double:2.9644E-319)
            boolean r5 = r1.d(r2, r5)
            r6 = r14
            r9.y r6 = (r9.y) r6
            int r6 = r6.f474972d
            com.google.android.exoplayer2.Format[] r1 = r1.f442383d
            if (r5 == 0) goto L5f
            r1 = r1[r2]
            java.util.Objects.toString(r1)
            goto L67
        L5f:
            r1 = r1[r2]
            java.util.Objects.toString(r1)
            goto L67
        L65:
            r5 = r20
        L67:
            if (r5 == 0) goto L6e
            r1 = r4
            goto L70
        L6b:
            r2.getClass()
        L6e:
            r1 = r20
        L70:
            if (r1 == 0) goto L92
            if (r3 == 0) goto L8f
            java.util.LinkedList r1 = r0.f351168p
            java.lang.Object r2 = r1.removeLast()
            g9.i r2 = (g9.i) r2
            if (r2 != r12) goto L80
            r2 = r4
            goto L82
        L80:
            r2 = r20
        L82:
            t9.a.d(r2)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L8f
            long r1 = r0.E
            r0.F = r1
        L8f:
            r21 = r4
            goto L94
        L92:
            r21 = r20
        L94:
            d9.g r1 = r0.f351166n
            r9.n r2 = r12.f331853a
            int r3 = r12.f331854b
            int r4 = r0.f351159d
            com.google.android.exoplayer2.Format r5 = r12.f331855c
            int r6 = r12.f331856d
            java.lang.Object r7 = r12.f331857e
            long r8 = r12.f331858f
            long r10 = r12.f331859g
            long r16 = r12.d()
            r12 = r24
            r14 = r26
            r18 = r28
            r19 = r21
            r1.f(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r16, r18, r19)
            if (r21 == 0) goto Lca
            boolean r1 = r0.f351174v
            if (r1 != 0) goto Lc1
            long r1 = r0.E
            r0.h(r1)
            goto Lc8
        Lc1:
            g9.n r1 = r0.f351160e
            g9.j r1 = (g9.j) r1
            r1.b(r0)
        Lc8:
            r20 = 2
        Lca:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.o.g(r9.c0, long, long, java.io.IOException):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    @Override // d9.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(long r36) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.o.h(long):boolean");
    }

    @Override // q8.g
    public void j() {
        this.f351173u = true;
        this.f351170r.post(this.f351169q);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    @Override // d9.i0
    public long m() {
        /*
            r8 = this;
            boolean r0 = r8.I
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r8.u()
            if (r0 == 0) goto L10
            long r0 = r8.F
            return r0
        L10:
            long r0 = r8.E
            java.util.LinkedList r2 = r8.f351168p
            java.lang.Object r2 = r2.getLast()
            g9.i r2 = (g9.i) r2
            boolean r3 = r2.F
            if (r3 == 0) goto L1f
            goto L38
        L1f:
            java.util.LinkedList r2 = r8.f351168p
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L37
            java.util.LinkedList r2 = r8.f351168p
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            g9.i r2 = (g9.i) r2
            goto L38
        L37:
            r2 = 0
        L38:
            if (r2 == 0) goto L40
            long r2 = r2.f331859g
            long r0 = java.lang.Math.max(r0, r2)
        L40:
            d9.f0[] r2 = r8.f351171s
            int r3 = r2.length
            r4 = 0
        L44:
            if (r4 >= r3) goto L58
            r5 = r2[r4]
            d9.c0 r5 = r5.f308872c
            monitor-enter(r5)
            long r6 = r5.f308839n     // Catch: java.lang.Throwable -> L55
            monitor-exit(r5)
            long r0 = java.lang.Math.max(r0, r6)
            int r4 = r4 + 1
            goto L44
        L55:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.o.m():long");
    }

    @Override // d9.i0
    public long n() {
        if (u()) {
            return this.F;
        }
        if (this.I) {
            return Long.MIN_VALUE;
        }
        return ((g9.i) this.f351168p.getLast()).f331859g;
    }

    @Override // r9.a0
    public void q(r9.c0 c0Var, long j17, long j18, boolean z17) {
        e9.a aVar = (e9.a) c0Var;
        this.f351166n.b(aVar.f331853a, aVar.f331854b, this.f351159d, aVar.f331855c, aVar.f331856d, aVar.f331857e, aVar.f331858f, aVar.f331859g, j17, j18, aVar.d());
        if (z17) {
            return;
        }
        w();
        if (this.f351175w > 0) {
            ((g9.j) this.f351160e).b(this);
        }
    }

    public final boolean u() {
        return this.F != -9223372036854775807L;
    }

    public final void v() {
        if (this.f351177y || this.f351174v || !this.f351173u) {
            return;
        }
        for (d9.f0 f0Var : this.f351171s) {
            if (f0Var.i() == null) {
                return;
            }
        }
        int length = this.f351171s.length;
        int i17 = -1;
        int i18 = 0;
        char c17 = 0;
        while (true) {
            char c18 = 1;
            if (i18 >= length) {
                break;
            }
            java.lang.String str = this.f351171s[i18].i().f125613i;
            if (t9.k.e(str)) {
                c18 = 3;
            } else if (t9.k.d(str)) {
                c18 = 2;
            } else if (!com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24.equals(t9.k.b(str))) {
                c18 = 0;
            }
            if (c18 > c17) {
                i17 = i18;
                c17 = c18;
            } else if (c18 == c17 && i17 != -1) {
                i17 = -1;
            }
            i18++;
        }
        d9.k0 k0Var = this.f351161f.f351106f;
        int i19 = k0Var.f308903a;
        this.A = -1;
        this.C = new boolean[length];
        this.D = new boolean[length];
        d9.k0[] k0VarArr = new d9.k0[length];
        for (int i27 = 0; i27 < length; i27++) {
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 i28 = this.f351171s[i27].i();
            java.lang.String str2 = i28.f125613i;
            boolean z17 = t9.k.e(str2) || t9.k.d(str2);
            this.D[i27] = z17;
            this.B = z17 | this.B;
            if (i27 == i17) {
                com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[] c1601x7dc4e417Arr = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[i19];
                for (int i29 = 0; i29 < i19; i29++) {
                    c1601x7dc4e417Arr[i29] = s(k0Var.f308904b[i29], i28);
                }
                k0VarArr[i27] = new d9.k0(c1601x7dc4e417Arr);
                this.A = i27;
            } else {
                k0VarArr[i27] = new d9.k0(s((c17 == 3 && t9.k.d(i28.f125613i)) ? this.f351163h : null, i28));
            }
        }
        this.f351178z = new d9.l0(k0VarArr);
        this.f351174v = true;
        g9.j jVar = (g9.j) this.f351160e;
        int i37 = jVar.f351144p - 1;
        jVar.f351144p = i37;
        if (i37 > 0) {
            return;
        }
        int i38 = 0;
        for (g9.o oVar : jVar.f351146r) {
            i38 += oVar.f351178z.f308908a;
        }
        d9.k0[] k0VarArr2 = new d9.k0[i38];
        int i39 = 0;
        for (g9.o oVar2 : jVar.f351146r) {
            int i47 = oVar2.f351178z.f308908a;
            int i48 = 0;
            while (i48 < i47) {
                k0VarArr2[i39] = oVar2.f351178z.f308909b[i48];
                i48++;
                i39++;
            }
        }
        jVar.f351145q = new d9.l0(k0VarArr2);
        jVar.f351143o.a(jVar);
    }

    public final void w() {
        for (d9.f0 f0Var : this.f351171s) {
            f0Var.m(this.G);
        }
        this.G = false;
    }

    public boolean x(long j17, boolean z17) {
        boolean z18;
        long a17;
        this.E = j17;
        if (!z17 && !u()) {
            int length = this.f351171s.length;
            for (int i17 = 0; i17 < length; i17++) {
                d9.f0 f0Var = this.f351171s[i17];
                f0Var.n();
                if (!f0Var.e(j17, true, false) && (this.D[i17] || !this.B)) {
                    z18 = false;
                    break;
                }
                d9.c0 c0Var = f0Var.f308872c;
                synchronized (c0Var) {
                    int i18 = c0Var.f308837l;
                    if (i18 == 0) {
                        a17 = -1;
                    } else {
                        a17 = c0Var.a(i18);
                    }
                }
                f0Var.f(a17);
            }
            z18 = true;
            if (z18) {
                return false;
            }
        }
        this.F = j17;
        this.I = false;
        this.f351168p.clear();
        r9.g0 g0Var = this.f351165m;
        if (g0Var.a()) {
            g0Var.f474899b.b(false);
        } else {
            w();
        }
        return true;
    }

    @Override // q8.g
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public d9.f0 l(int i17, int i18) {
        int length = this.f351171s.length;
        for (int i19 = 0; i19 < length; i19++) {
            if (this.f351172t[i19] == i17) {
                return this.f351171s[i19];
            }
        }
        d9.f0 f0Var = new d9.f0(this.f351162g);
        f0Var.f308881l = this;
        int i27 = length + 1;
        int[] copyOf = java.util.Arrays.copyOf(this.f351172t, i27);
        this.f351172t = copyOf;
        copyOf[length] = i17;
        d9.f0[] f0VarArr = (d9.f0[]) java.util.Arrays.copyOf(this.f351171s, i27);
        this.f351171s = f0VarArr;
        f0VarArr[length] = f0Var;
        return f0Var;
    }
}
