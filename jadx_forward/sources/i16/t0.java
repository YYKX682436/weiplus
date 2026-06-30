package i16;

/* loaded from: classes16.dex */
public final class t0 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f369273g;

    /* renamed from: h, reason: collision with root package name */
    public int f369274h = md1.d1.f72842x366c91de;

    /* renamed from: i, reason: collision with root package name */
    public int f369275i = 2054;

    /* renamed from: m, reason: collision with root package name */
    public int f369276m;

    /* renamed from: n, reason: collision with root package name */
    public i16.l1 f369277n;

    /* renamed from: o, reason: collision with root package name */
    public int f369278o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f369279p;

    /* renamed from: q, reason: collision with root package name */
    public i16.l1 f369280q;

    /* renamed from: r, reason: collision with root package name */
    public int f369281r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f369282s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f369283t;

    /* renamed from: u, reason: collision with root package name */
    public i16.y1 f369284u;

    /* renamed from: v, reason: collision with root package name */
    public int f369285v;

    /* renamed from: w, reason: collision with root package name */
    public int f369286w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f369287x;

    public t0() {
        i16.l1 l1Var = i16.l1.f369113z;
        this.f369277n = l1Var;
        this.f369279p = java.util.Collections.emptyList();
        this.f369280q = l1Var;
        this.f369282s = java.util.Collections.emptyList();
        this.f369283t = java.util.Collections.emptyList();
        this.f369284u = i16.y1.f369352r;
        this.f369287x = java.util.Collections.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.u0.B     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.s0 r0 = (i16.s0) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.u0 r2 = (i16.u0) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.u0 r3 = (i16.u0) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r2 = move-exception
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L1e
            r1.e(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i16.t0.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.u0) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.u0 d17 = d();
        if (d17.mo134563xf582434a()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    /* renamed from: clone */
    public java.lang.Object m134635x5a5dd5d() {
        i16.t0 t0Var = new i16.t0();
        t0Var.e(d());
        return t0Var;
    }

    public i16.u0 d() {
        i16.u0 u0Var = new i16.u0(this, null);
        int i17 = this.f369273g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        u0Var.f369296g = this.f369274h;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        u0Var.f369297h = this.f369275i;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        u0Var.f369298i = this.f369276m;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        u0Var.f369299m = this.f369277n;
        if ((i17 & 16) == 16) {
            i18 |= 16;
        }
        u0Var.f369300n = this.f369278o;
        if ((i17 & 32) == 32) {
            this.f369279p = java.util.Collections.unmodifiableList(this.f369279p);
            this.f369273g &= -33;
        }
        u0Var.f369301o = this.f369279p;
        if ((i17 & 64) == 64) {
            i18 |= 32;
        }
        u0Var.f369302p = this.f369280q;
        if ((i17 & 128) == 128) {
            i18 |= 64;
        }
        u0Var.f369303q = this.f369281r;
        if ((this.f369273g & 256) == 256) {
            this.f369282s = java.util.Collections.unmodifiableList(this.f369282s);
            this.f369273g &= -257;
        }
        u0Var.f369304r = this.f369282s;
        if ((this.f369273g & 512) == 512) {
            this.f369283t = java.util.Collections.unmodifiableList(this.f369283t);
            this.f369273g &= -513;
        }
        u0Var.f369305s = this.f369283t;
        if ((i17 & 1024) == 1024) {
            i18 |= 128;
        }
        u0Var.f369307u = this.f369284u;
        if ((i17 & 2048) == 2048) {
            i18 |= 256;
        }
        u0Var.f369308v = this.f369285v;
        if ((i17 & 4096) == 4096) {
            i18 |= 512;
        }
        u0Var.f369309w = this.f369286w;
        if ((this.f369273g & 8192) == 8192) {
            this.f369287x = java.util.Collections.unmodifiableList(this.f369287x);
            this.f369273g &= -8193;
        }
        u0Var.f369310x = this.f369287x;
        u0Var.f369295f = i18;
        return u0Var;
    }

    public i16.t0 e(i16.u0 u0Var) {
        i16.y1 y1Var;
        i16.l1 l1Var;
        i16.l1 l1Var2;
        if (u0Var == i16.u0.A) {
            return this;
        }
        int i17 = u0Var.f369295f;
        if ((i17 & 1) == 1) {
            int i18 = u0Var.f369296g;
            this.f369273g |= 1;
            this.f369274h = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = u0Var.f369297h;
            this.f369273g = 2 | this.f369273g;
            this.f369275i = i19;
        }
        if ((i17 & 4) == 4) {
            int i27 = u0Var.f369298i;
            this.f369273g = 4 | this.f369273g;
            this.f369276m = i27;
        }
        if ((i17 & 8) == 8) {
            i16.l1 l1Var3 = u0Var.f369299m;
            if ((this.f369273g & 8) != 8 || (l1Var2 = this.f369277n) == i16.l1.f369113z) {
                this.f369277n = l1Var3;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var2);
                m17.b(l1Var3);
                this.f369277n = m17.d();
            }
            this.f369273g |= 8;
        }
        if ((u0Var.f369295f & 16) == 16) {
            int i28 = u0Var.f369300n;
            this.f369273g = 16 | this.f369273g;
            this.f369278o = i28;
        }
        if (!u0Var.f369301o.isEmpty()) {
            if (this.f369279p.isEmpty()) {
                this.f369279p = u0Var.f369301o;
                this.f369273g &= -33;
            } else {
                if ((this.f369273g & 32) != 32) {
                    this.f369279p = new java.util.ArrayList(this.f369279p);
                    this.f369273g |= 32;
                }
                this.f369279p.addAll(u0Var.f369301o);
            }
        }
        if ((u0Var.f369295f & 32) == 32) {
            i16.l1 l1Var4 = u0Var.f369302p;
            if ((this.f369273g & 64) != 64 || (l1Var = this.f369280q) == i16.l1.f369113z) {
                this.f369280q = l1Var4;
            } else {
                i16.k1 m18 = i16.l1.m(l1Var);
                m18.b(l1Var4);
                this.f369280q = m18.d();
            }
            this.f369273g |= 64;
        }
        if ((u0Var.f369295f & 64) == 64) {
            int i29 = u0Var.f369303q;
            this.f369273g |= 128;
            this.f369281r = i29;
        }
        if (!u0Var.f369304r.isEmpty()) {
            if (this.f369282s.isEmpty()) {
                this.f369282s = u0Var.f369304r;
                this.f369273g &= -257;
            } else {
                if ((this.f369273g & 256) != 256) {
                    this.f369282s = new java.util.ArrayList(this.f369282s);
                    this.f369273g |= 256;
                }
                this.f369282s.addAll(u0Var.f369304r);
            }
        }
        if (!u0Var.f369305s.isEmpty()) {
            if (this.f369283t.isEmpty()) {
                this.f369283t = u0Var.f369305s;
                this.f369273g &= -513;
            } else {
                if ((this.f369273g & 512) != 512) {
                    this.f369283t = new java.util.ArrayList(this.f369283t);
                    this.f369273g |= 512;
                }
                this.f369283t.addAll(u0Var.f369305s);
            }
        }
        if ((u0Var.f369295f & 128) == 128) {
            i16.y1 y1Var2 = u0Var.f369307u;
            if ((this.f369273g & 1024) != 1024 || (y1Var = this.f369284u) == i16.y1.f369352r) {
                this.f369284u = y1Var2;
            } else {
                i16.x1 x1Var = new i16.x1();
                x1Var.e(y1Var);
                x1Var.e(y1Var2);
                this.f369284u = x1Var.d();
            }
            this.f369273g |= 1024;
        }
        int i37 = u0Var.f369295f;
        if ((i37 & 256) == 256) {
            int i38 = u0Var.f369308v;
            this.f369273g |= 2048;
            this.f369285v = i38;
        }
        if ((i37 & 512) == 512) {
            int i39 = u0Var.f369309w;
            this.f369273g |= 4096;
            this.f369286w = i39;
        }
        if (!u0Var.f369310x.isEmpty()) {
            if (this.f369287x.isEmpty()) {
                this.f369287x = u0Var.f369310x;
                this.f369273g &= -8193;
            } else {
                if ((this.f369273g & 8192) != 8192) {
                    this.f369287x = new java.util.ArrayList(this.f369287x);
                    this.f369273g |= 8192;
                }
                this.f369287x.addAll(u0Var.f369310x);
            }
        }
        c(u0Var);
        this.f432870d = this.f432870d.e(u0Var.f369294e);
        return this;
    }
}
