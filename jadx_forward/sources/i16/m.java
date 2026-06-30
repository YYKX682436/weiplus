package i16;

/* loaded from: classes16.dex */
public final class m extends p16.q {
    public int B;

    /* renamed from: g, reason: collision with root package name */
    public int f369132g;

    /* renamed from: i, reason: collision with root package name */
    public int f369134i;

    /* renamed from: m, reason: collision with root package name */
    public int f369135m;

    /* renamed from: z, reason: collision with root package name */
    public int f369148z;

    /* renamed from: h, reason: collision with root package name */
    public int f369133h = 6;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f369136n = java.util.Collections.emptyList();

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f369137o = java.util.Collections.emptyList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f369138p = java.util.Collections.emptyList();

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f369139q = java.util.Collections.emptyList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f369140r = java.util.Collections.emptyList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f369141s = java.util.Collections.emptyList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f369142t = java.util.Collections.emptyList();

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f369143u = java.util.Collections.emptyList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f369144v = java.util.Collections.emptyList();

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f369145w = java.util.Collections.emptyList();

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f369146x = java.util.Collections.emptyList();

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f369147y = java.util.Collections.emptyList();
    public i16.l1 A = i16.l1.f369113z;
    public java.util.List C = java.util.Collections.emptyList();
    public java.util.List D = java.util.Collections.emptyList();
    public java.util.List E = java.util.Collections.emptyList();
    public i16.v1 F = i16.v1.f369316m;
    public java.util.List G = java.util.Collections.emptyList();
    public i16.g2 H = i16.g2.f368997h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.o.R     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            i16.l r0 = (i16.l) r0     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            r0.getClass()     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            i16.o r0 = new i16.o     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            r1.e(r0)
            return r1
        L10:
            r2 = move-exception
            goto L1a
        L12:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> L10
            i16.o r3 = (i16.o) r3     // Catch: java.lang.Throwable -> L10
            throw r2     // Catch: java.lang.Throwable -> L18
        L18:
            r2 = move-exception
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L20
            r1.e(r3)
        L20:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i16.m.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.o) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.o d17 = d();
        if (d17.mo134563xf582434a()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    /* renamed from: clone */
    public java.lang.Object m134616x5a5dd5d() {
        i16.m mVar = new i16.m();
        mVar.e(d());
        return mVar;
    }

    public i16.o d() {
        i16.o oVar = new i16.o(this, (i16.a) null);
        int i17 = this.f369132g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        oVar.f369175g = this.f369133h;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        oVar.f369176h = this.f369134i;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        oVar.f369177i = this.f369135m;
        if ((i17 & 8) == 8) {
            this.f369136n = java.util.Collections.unmodifiableList(this.f369136n);
            this.f369132g &= -9;
        }
        oVar.f369178m = this.f369136n;
        if ((this.f369132g & 16) == 16) {
            this.f369137o = java.util.Collections.unmodifiableList(this.f369137o);
            this.f369132g &= -17;
        }
        oVar.f369179n = this.f369137o;
        if ((this.f369132g & 32) == 32) {
            this.f369138p = java.util.Collections.unmodifiableList(this.f369138p);
            this.f369132g &= -33;
        }
        oVar.f369180o = this.f369138p;
        if ((this.f369132g & 64) == 64) {
            this.f369139q = java.util.Collections.unmodifiableList(this.f369139q);
            this.f369132g &= -65;
        }
        oVar.f369182q = this.f369139q;
        if ((this.f369132g & 128) == 128) {
            this.f369140r = java.util.Collections.unmodifiableList(this.f369140r);
            this.f369132g &= -129;
        }
        oVar.f369184s = this.f369140r;
        if ((this.f369132g & 256) == 256) {
            this.f369141s = java.util.Collections.unmodifiableList(this.f369141s);
            this.f369132g &= -257;
        }
        oVar.f369185t = this.f369141s;
        if ((this.f369132g & 512) == 512) {
            this.f369142t = java.util.Collections.unmodifiableList(this.f369142t);
            this.f369132g &= -513;
        }
        oVar.f369187v = this.f369142t;
        if ((this.f369132g & 1024) == 1024) {
            this.f369143u = java.util.Collections.unmodifiableList(this.f369143u);
            this.f369132g &= -1025;
        }
        oVar.f369188w = this.f369143u;
        if ((this.f369132g & 2048) == 2048) {
            this.f369144v = java.util.Collections.unmodifiableList(this.f369144v);
            this.f369132g &= -2049;
        }
        oVar.f369189x = this.f369144v;
        if ((this.f369132g & 4096) == 4096) {
            this.f369145w = java.util.Collections.unmodifiableList(this.f369145w);
            this.f369132g &= -4097;
        }
        oVar.f369190y = this.f369145w;
        if ((this.f369132g & 8192) == 8192) {
            this.f369146x = java.util.Collections.unmodifiableList(this.f369146x);
            this.f369132g &= -8193;
        }
        oVar.f369191z = this.f369146x;
        if ((this.f369132g & 16384) == 16384) {
            this.f369147y = java.util.Collections.unmodifiableList(this.f369147y);
            this.f369132g &= -16385;
        }
        oVar.A = this.f369147y;
        if ((i17 & 32768) == 32768) {
            i18 |= 8;
        }
        oVar.C = this.f369148z;
        if ((i17 & 65536) == 65536) {
            i18 |= 16;
        }
        oVar.D = this.A;
        if ((i17 & 131072) == 131072) {
            i18 |= 32;
        }
        oVar.E = this.B;
        if ((this.f369132g & 262144) == 262144) {
            this.C = java.util.Collections.unmodifiableList(this.C);
            this.f369132g &= -262145;
        }
        oVar.F = this.C;
        if ((this.f369132g & 524288) == 524288) {
            this.D = java.util.Collections.unmodifiableList(this.D);
            this.f369132g &= -524289;
        }
        oVar.H = this.D;
        if ((this.f369132g & 1048576) == 1048576) {
            this.E = java.util.Collections.unmodifiableList(this.E);
            this.f369132g &= -1048577;
        }
        oVar.I = this.E;
        if ((i17 & 2097152) == 2097152) {
            i18 |= 64;
        }
        oVar.K = this.F;
        if ((this.f369132g & 4194304) == 4194304) {
            this.G = java.util.Collections.unmodifiableList(this.G);
            this.f369132g &= -4194305;
        }
        oVar.L = this.G;
        if ((i17 & 8388608) == 8388608) {
            i18 |= 128;
        }
        oVar.M = this.H;
        oVar.f369174f = i18;
        return oVar;
    }

    public i16.m e(i16.o oVar) {
        i16.g2 g2Var;
        i16.v1 v1Var;
        i16.l1 l1Var;
        if (oVar == i16.o.Q) {
            return this;
        }
        int i17 = oVar.f369174f;
        if ((i17 & 1) == 1) {
            int i18 = oVar.f369175g;
            this.f369132g |= 1;
            this.f369133h = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = oVar.f369176h;
            this.f369132g = 2 | this.f369132g;
            this.f369134i = i19;
        }
        if ((i17 & 4) == 4) {
            int i27 = oVar.f369177i;
            this.f369132g = 4 | this.f369132g;
            this.f369135m = i27;
        }
        if (!oVar.f369178m.isEmpty()) {
            if (this.f369136n.isEmpty()) {
                this.f369136n = oVar.f369178m;
                this.f369132g &= -9;
            } else {
                if ((this.f369132g & 8) != 8) {
                    this.f369136n = new java.util.ArrayList(this.f369136n);
                    this.f369132g |= 8;
                }
                this.f369136n.addAll(oVar.f369178m);
            }
        }
        if (!oVar.f369179n.isEmpty()) {
            if (this.f369137o.isEmpty()) {
                this.f369137o = oVar.f369179n;
                this.f369132g &= -17;
            } else {
                if ((this.f369132g & 16) != 16) {
                    this.f369137o = new java.util.ArrayList(this.f369137o);
                    this.f369132g |= 16;
                }
                this.f369137o.addAll(oVar.f369179n);
            }
        }
        if (!oVar.f369180o.isEmpty()) {
            if (this.f369138p.isEmpty()) {
                this.f369138p = oVar.f369180o;
                this.f369132g &= -33;
            } else {
                if ((this.f369132g & 32) != 32) {
                    this.f369138p = new java.util.ArrayList(this.f369138p);
                    this.f369132g |= 32;
                }
                this.f369138p.addAll(oVar.f369180o);
            }
        }
        if (!oVar.f369182q.isEmpty()) {
            if (this.f369139q.isEmpty()) {
                this.f369139q = oVar.f369182q;
                this.f369132g &= -65;
            } else {
                if ((this.f369132g & 64) != 64) {
                    this.f369139q = new java.util.ArrayList(this.f369139q);
                    this.f369132g |= 64;
                }
                this.f369139q.addAll(oVar.f369182q);
            }
        }
        if (!oVar.f369184s.isEmpty()) {
            if (this.f369140r.isEmpty()) {
                this.f369140r = oVar.f369184s;
                this.f369132g &= -129;
            } else {
                if ((this.f369132g & 128) != 128) {
                    this.f369140r = new java.util.ArrayList(this.f369140r);
                    this.f369132g |= 128;
                }
                this.f369140r.addAll(oVar.f369184s);
            }
        }
        if (!oVar.f369185t.isEmpty()) {
            if (this.f369141s.isEmpty()) {
                this.f369141s = oVar.f369185t;
                this.f369132g &= -257;
            } else {
                if ((this.f369132g & 256) != 256) {
                    this.f369141s = new java.util.ArrayList(this.f369141s);
                    this.f369132g |= 256;
                }
                this.f369141s.addAll(oVar.f369185t);
            }
        }
        if (!oVar.f369187v.isEmpty()) {
            if (this.f369142t.isEmpty()) {
                this.f369142t = oVar.f369187v;
                this.f369132g &= -513;
            } else {
                if ((this.f369132g & 512) != 512) {
                    this.f369142t = new java.util.ArrayList(this.f369142t);
                    this.f369132g |= 512;
                }
                this.f369142t.addAll(oVar.f369187v);
            }
        }
        if (!oVar.f369188w.isEmpty()) {
            if (this.f369143u.isEmpty()) {
                this.f369143u = oVar.f369188w;
                this.f369132g &= -1025;
            } else {
                if ((this.f369132g & 1024) != 1024) {
                    this.f369143u = new java.util.ArrayList(this.f369143u);
                    this.f369132g |= 1024;
                }
                this.f369143u.addAll(oVar.f369188w);
            }
        }
        if (!oVar.f369189x.isEmpty()) {
            if (this.f369144v.isEmpty()) {
                this.f369144v = oVar.f369189x;
                this.f369132g &= -2049;
            } else {
                if ((this.f369132g & 2048) != 2048) {
                    this.f369144v = new java.util.ArrayList(this.f369144v);
                    this.f369132g |= 2048;
                }
                this.f369144v.addAll(oVar.f369189x);
            }
        }
        if (!oVar.f369190y.isEmpty()) {
            if (this.f369145w.isEmpty()) {
                this.f369145w = oVar.f369190y;
                this.f369132g &= -4097;
            } else {
                if ((this.f369132g & 4096) != 4096) {
                    this.f369145w = new java.util.ArrayList(this.f369145w);
                    this.f369132g |= 4096;
                }
                this.f369145w.addAll(oVar.f369190y);
            }
        }
        if (!oVar.f369191z.isEmpty()) {
            if (this.f369146x.isEmpty()) {
                this.f369146x = oVar.f369191z;
                this.f369132g &= -8193;
            } else {
                if ((this.f369132g & 8192) != 8192) {
                    this.f369146x = new java.util.ArrayList(this.f369146x);
                    this.f369132g |= 8192;
                }
                this.f369146x.addAll(oVar.f369191z);
            }
        }
        if (!oVar.A.isEmpty()) {
            if (this.f369147y.isEmpty()) {
                this.f369147y = oVar.A;
                this.f369132g &= -16385;
            } else {
                if ((this.f369132g & 16384) != 16384) {
                    this.f369147y = new java.util.ArrayList(this.f369147y);
                    this.f369132g |= 16384;
                }
                this.f369147y.addAll(oVar.A);
            }
        }
        int i28 = oVar.f369174f;
        if ((i28 & 8) == 8) {
            int i29 = oVar.C;
            this.f369132g |= 32768;
            this.f369148z = i29;
        }
        if ((i28 & 16) == 16) {
            i16.l1 l1Var2 = oVar.D;
            if ((this.f369132g & 65536) != 65536 || (l1Var = this.A) == i16.l1.f369113z) {
                this.A = l1Var2;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var);
                m17.b(l1Var2);
                this.A = m17.d();
            }
            this.f369132g |= 65536;
        }
        if ((oVar.f369174f & 32) == 32) {
            int i37 = oVar.E;
            this.f369132g |= 131072;
            this.B = i37;
        }
        if (!oVar.F.isEmpty()) {
            if (this.C.isEmpty()) {
                this.C = oVar.F;
                this.f369132g &= -262145;
            } else {
                if ((this.f369132g & 262144) != 262144) {
                    this.C = new java.util.ArrayList(this.C);
                    this.f369132g |= 262144;
                }
                this.C.addAll(oVar.F);
            }
        }
        if (!oVar.H.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = oVar.H;
                this.f369132g &= -524289;
            } else {
                if ((this.f369132g & 524288) != 524288) {
                    this.D = new java.util.ArrayList(this.D);
                    this.f369132g |= 524288;
                }
                this.D.addAll(oVar.H);
            }
        }
        if (!oVar.I.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = oVar.I;
                this.f369132g &= -1048577;
            } else {
                if ((this.f369132g & 1048576) != 1048576) {
                    this.E = new java.util.ArrayList(this.E);
                    this.f369132g |= 1048576;
                }
                this.E.addAll(oVar.I);
            }
        }
        if ((oVar.f369174f & 64) == 64) {
            i16.v1 v1Var2 = oVar.K;
            if ((this.f369132g & 2097152) != 2097152 || (v1Var = this.F) == i16.v1.f369316m) {
                this.F = v1Var2;
            } else {
                i16.u1 d17 = i16.v1.d(v1Var);
                d17.d(v1Var2);
                this.F = d17.c();
            }
            this.f369132g |= 2097152;
        }
        if (!oVar.L.isEmpty()) {
            if (this.G.isEmpty()) {
                this.G = oVar.L;
                this.f369132g &= -4194305;
            } else {
                if ((this.f369132g & 4194304) != 4194304) {
                    this.G = new java.util.ArrayList(this.G);
                    this.f369132g |= 4194304;
                }
                this.G.addAll(oVar.L);
            }
        }
        if ((oVar.f369174f & 128) == 128) {
            i16.g2 g2Var2 = oVar.M;
            if ((this.f369132g & 8388608) != 8388608 || (g2Var = this.H) == i16.g2.f368997h) {
                this.H = g2Var2;
            } else {
                i16.f2 f2Var = new i16.f2();
                f2Var.d(g2Var);
                f2Var.d(g2Var2);
                this.H = f2Var.c();
            }
            this.f369132g |= 8388608;
        }
        c(oVar);
        this.f432870d = this.f432870d.e(oVar.f369173e);
        return this;
    }
}
