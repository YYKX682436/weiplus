package i16;

/* loaded from: classes16.dex */
public final class l1 extends p16.s {
    public static final p16.j0 A = new i16.f1();

    /* renamed from: z, reason: collision with root package name */
    public static final i16.l1 f369113z;

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f369114e;

    /* renamed from: f, reason: collision with root package name */
    public int f369115f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f369116g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f369117h;

    /* renamed from: i, reason: collision with root package name */
    public int f369118i;

    /* renamed from: m, reason: collision with root package name */
    public i16.l1 f369119m;

    /* renamed from: n, reason: collision with root package name */
    public int f369120n;

    /* renamed from: o, reason: collision with root package name */
    public int f369121o;

    /* renamed from: p, reason: collision with root package name */
    public int f369122p;

    /* renamed from: q, reason: collision with root package name */
    public int f369123q;

    /* renamed from: r, reason: collision with root package name */
    public int f369124r;

    /* renamed from: s, reason: collision with root package name */
    public i16.l1 f369125s;

    /* renamed from: t, reason: collision with root package name */
    public int f369126t;

    /* renamed from: u, reason: collision with root package name */
    public i16.l1 f369127u;

    /* renamed from: v, reason: collision with root package name */
    public int f369128v;

    /* renamed from: w, reason: collision with root package name */
    public int f369129w;

    /* renamed from: x, reason: collision with root package name */
    public byte f369130x;

    /* renamed from: y, reason: collision with root package name */
    public int f369131y;

    static {
        i16.l1 l1Var = new i16.l1(true);
        f369113z = l1Var;
        l1Var.l();
    }

    public l1(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f369130x = (byte) -1;
        this.f369131y = -1;
        this.f369114e = qVar.f432870d;
    }

    public static i16.k1 m(i16.l1 l1Var) {
        i16.k1 k1Var = new i16.k1();
        k1Var.b(l1Var);
        return k1Var;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        p16.r i17 = i();
        if ((this.f369115f & 4096) == 4096) {
            jVar.m(1, this.f369129w);
        }
        for (int i18 = 0; i18 < this.f369116g.size(); i18++) {
            jVar.o(2, (p16.h0) this.f369116g.get(i18));
        }
        if ((this.f369115f & 1) == 1) {
            boolean z17 = this.f369117h;
            jVar.x(3, 0);
            jVar.q(z17 ? 1 : 0);
        }
        if ((this.f369115f & 2) == 2) {
            jVar.m(4, this.f369118i);
        }
        if ((this.f369115f & 4) == 4) {
            jVar.o(5, this.f369119m);
        }
        if ((this.f369115f & 16) == 16) {
            jVar.m(6, this.f369121o);
        }
        if ((this.f369115f & 32) == 32) {
            jVar.m(7, this.f369122p);
        }
        if ((this.f369115f & 8) == 8) {
            jVar.m(8, this.f369120n);
        }
        if ((this.f369115f & 64) == 64) {
            jVar.m(9, this.f369123q);
        }
        if ((this.f369115f & 256) == 256) {
            jVar.o(10, this.f369125s);
        }
        if ((this.f369115f & 512) == 512) {
            jVar.m(11, this.f369126t);
        }
        if ((this.f369115f & 128) == 128) {
            jVar.m(12, this.f369124r);
        }
        if ((this.f369115f & 1024) == 1024) {
            jVar.o(13, this.f369127u);
        }
        if ((this.f369115f & 2048) == 2048) {
            jVar.m(14, this.f369128v);
        }
        i17.a(200, jVar);
        jVar.r(this.f369114e);
    }

    @Override // p16.i0
    /* renamed from: getDefaultInstanceForType */
    public p16.h0 mo134575x786693c3() {
        return f369113z;
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369131y;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f369115f & 4096) == 4096 ? p16.j.b(1, this.f369129w) + 0 : 0;
        for (int i18 = 0; i18 < this.f369116g.size(); i18++) {
            b17 += p16.j.d(2, (p16.h0) this.f369116g.get(i18));
        }
        if ((this.f369115f & 1) == 1) {
            b17 += p16.j.h(3) + 1;
        }
        if ((this.f369115f & 2) == 2) {
            b17 += p16.j.b(4, this.f369118i);
        }
        if ((this.f369115f & 4) == 4) {
            b17 += p16.j.d(5, this.f369119m);
        }
        if ((this.f369115f & 16) == 16) {
            b17 += p16.j.b(6, this.f369121o);
        }
        if ((this.f369115f & 32) == 32) {
            b17 += p16.j.b(7, this.f369122p);
        }
        if ((this.f369115f & 8) == 8) {
            b17 += p16.j.b(8, this.f369120n);
        }
        if ((this.f369115f & 64) == 64) {
            b17 += p16.j.b(9, this.f369123q);
        }
        if ((this.f369115f & 256) == 256) {
            b17 += p16.j.d(10, this.f369125s);
        }
        if ((this.f369115f & 512) == 512) {
            b17 += p16.j.b(11, this.f369126t);
        }
        if ((this.f369115f & 128) == 128) {
            b17 += p16.j.b(12, this.f369124r);
        }
        if ((this.f369115f & 1024) == 1024) {
            b17 += p16.j.d(13, this.f369127u);
        }
        if ((this.f369115f & 2048) == 2048) {
            b17 += p16.j.b(14, this.f369128v);
        }
        int e17 = b17 + e() + this.f369114e.mo157707x35e001();
        this.f369131y = e17;
        return e17;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369130x;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f369116g.size(); i17++) {
            if (!((i16.j1) this.f369116g.get(i17)).mo134563xf582434a()) {
                this.f369130x = (byte) 0;
                return false;
            }
        }
        if (((this.f369115f & 4) == 4) && !this.f369119m.mo134563xf582434a()) {
            this.f369130x = (byte) 0;
            return false;
        }
        if (((this.f369115f & 256) == 256) && !this.f369125s.mo134563xf582434a()) {
            this.f369130x = (byte) 0;
            return false;
        }
        if (((this.f369115f & 1024) == 1024) && !this.f369127u.mo134563xf582434a()) {
            this.f369130x = (byte) 0;
            return false;
        }
        if (d()) {
            this.f369130x = (byte) 1;
            return true;
        }
        this.f369130x = (byte) 0;
        return false;
    }

    public final void l() {
        this.f369116g = java.util.Collections.emptyList();
        this.f369117h = false;
        this.f369118i = 0;
        i16.l1 l1Var = f369113z;
        this.f369119m = l1Var;
        this.f369120n = 0;
        this.f369121o = 0;
        this.f369122p = 0;
        this.f369123q = 0;
        this.f369124r = 0;
        this.f369125s = l1Var;
        this.f369126t = 0;
        this.f369127u = l1Var;
        this.f369128v = 0;
        this.f369129w = 0;
    }

    public i16.k1 n() {
        return m(this);
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.k1();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        return m(this);
    }

    public l1(boolean z17) {
        this.f369130x = (byte) -1;
        this.f369131y = -1;
        this.f369114e = p16.g.f432816d;
    }

    public l1(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f369130x = (byte) -1;
        this.f369131y = -1;
        l();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    p16.j0 j0Var = A;
                    i16.k1 k1Var = null;
                    switch (n17) {
                        case 0:
                            break;
                        case 8:
                            this.f369115f |= 4096;
                            this.f369129w = hVar.k();
                            continue;
                        case 18:
                            if (!(z18 & true)) {
                                this.f369116g = new java.util.ArrayList();
                                z18 |= true;
                            }
                            this.f369116g.add(hVar.g(i16.j1.f369078o, lVar));
                            continue;
                        case 24:
                            this.f369115f |= 1;
                            this.f369117h = hVar.l() != 0;
                            continue;
                        case 32:
                            this.f369115f |= 2;
                            this.f369118i = hVar.k();
                            continue;
                        case 42:
                            if ((this.f369115f & 4) == 4) {
                                i16.l1 l1Var = this.f369119m;
                                l1Var.getClass();
                                k1Var = m(l1Var);
                            }
                            i16.l1 l1Var2 = (i16.l1) hVar.g(j0Var, lVar);
                            this.f369119m = l1Var2;
                            if (k1Var != null) {
                                k1Var.b(l1Var2);
                                this.f369119m = k1Var.d();
                            }
                            this.f369115f |= 4;
                            continue;
                        case 48:
                            this.f369115f |= 16;
                            this.f369121o = hVar.k();
                            continue;
                        case 56:
                            this.f369115f |= 32;
                            this.f369122p = hVar.k();
                            continue;
                        case 64:
                            this.f369115f |= 8;
                            this.f369120n = hVar.k();
                            continue;
                        case 72:
                            this.f369115f |= 64;
                            this.f369123q = hVar.k();
                            continue;
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45675x92fdfc4b /* 82 */:
                            if ((this.f369115f & 256) == 256) {
                                i16.l1 l1Var3 = this.f369125s;
                                l1Var3.getClass();
                                k1Var = m(l1Var3);
                            }
                            i16.l1 l1Var4 = (i16.l1) hVar.g(j0Var, lVar);
                            this.f369125s = l1Var4;
                            if (k1Var != null) {
                                k1Var.b(l1Var4);
                                this.f369125s = k1Var.d();
                            }
                            this.f369115f |= 256;
                            continue;
                        case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51695x8a2568b7 /* 88 */:
                            this.f369115f |= 512;
                            this.f369126t = hVar.k();
                            continue;
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45665x7309a58f /* 96 */:
                            this.f369115f |= 128;
                            this.f369124r = hVar.k();
                            continue;
                        case 106:
                            if ((this.f369115f & 1024) == 1024) {
                                i16.l1 l1Var5 = this.f369127u;
                                l1Var5.getClass();
                                k1Var = m(l1Var5);
                            }
                            i16.l1 l1Var6 = (i16.l1) hVar.g(j0Var, lVar);
                            this.f369127u = l1Var6;
                            if (k1Var != null) {
                                k1Var.b(l1Var6);
                                this.f369127u = k1Var.d();
                            }
                            this.f369115f |= 1024;
                            continue;
                        case 112:
                            this.f369115f |= 2048;
                            this.f369128v = hVar.k();
                            continue;
                        default:
                            if (!j(hVar, j17, lVar, n17)) {
                                break;
                            } else {
                                break;
                            }
                    }
                    z17 = true;
                } catch (p16.z e17) {
                    e17.f432904d = this;
                    throw e17;
                } catch (java.io.IOException e18) {
                    p16.z zVar = new p16.z(e18.getMessage());
                    zVar.f432904d = this;
                    throw zVar;
                }
            } catch (java.lang.Throwable th6) {
                if (z18 & true) {
                    this.f369116g = java.util.Collections.unmodifiableList(this.f369116g);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                    this.f369114e = m17.c();
                    h();
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    this.f369114e = m17.c();
                    throw th7;
                }
            }
        }
        if (z18 & true) {
            this.f369116g = java.util.Collections.unmodifiableList(this.f369116g);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
            this.f369114e = m17.c();
            h();
        } catch (java.lang.Throwable th8) {
            this.f369114e = m17.c();
            throw th8;
        }
    }
}
