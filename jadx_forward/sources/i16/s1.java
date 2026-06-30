package i16;

/* loaded from: classes16.dex */
public final class s1 extends p16.s {

    /* renamed from: s, reason: collision with root package name */
    public static final i16.s1 f369258s;

    /* renamed from: t, reason: collision with root package name */
    public static final p16.j0 f369259t = new i16.p1();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f369260e;

    /* renamed from: f, reason: collision with root package name */
    public int f369261f;

    /* renamed from: g, reason: collision with root package name */
    public int f369262g;

    /* renamed from: h, reason: collision with root package name */
    public int f369263h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f369264i;

    /* renamed from: m, reason: collision with root package name */
    public i16.r1 f369265m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f369266n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f369267o;

    /* renamed from: p, reason: collision with root package name */
    public int f369268p;

    /* renamed from: q, reason: collision with root package name */
    public byte f369269q;

    /* renamed from: r, reason: collision with root package name */
    public int f369270r;

    static {
        i16.s1 s1Var = new i16.s1(true);
        f369258s = s1Var;
        s1Var.f369262g = 0;
        s1Var.f369263h = 0;
        s1Var.f369264i = false;
        s1Var.f369265m = i16.r1.INV;
        s1Var.f369266n = java.util.Collections.emptyList();
        s1Var.f369267o = java.util.Collections.emptyList();
    }

    public s1(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f369268p = -1;
        this.f369269q = (byte) -1;
        this.f369270r = -1;
        this.f369260e = qVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        p16.r i17 = i();
        if ((this.f369261f & 1) == 1) {
            jVar.m(1, this.f369262g);
        }
        if ((this.f369261f & 2) == 2) {
            jVar.m(2, this.f369263h);
        }
        if ((this.f369261f & 4) == 4) {
            boolean z17 = this.f369264i;
            jVar.x(3, 0);
            jVar.q(z17 ? 1 : 0);
        }
        if ((this.f369261f & 8) == 8) {
            jVar.l(4, this.f369265m.f369257d);
        }
        for (int i18 = 0; i18 < this.f369266n.size(); i18++) {
            jVar.o(5, (p16.h0) this.f369266n.get(i18));
        }
        if (this.f369267o.size() > 0) {
            jVar.v(50);
            jVar.v(this.f369268p);
        }
        for (int i19 = 0; i19 < this.f369267o.size(); i19++) {
            jVar.n(((java.lang.Integer) this.f369267o.get(i19)).intValue());
        }
        i17.a(1000, jVar);
        jVar.r(this.f369260e);
    }

    @Override // p16.i0
    /* renamed from: getDefaultInstanceForType */
    public p16.h0 mo134575x786693c3() {
        return f369258s;
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369270r;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f369261f & 1) == 1 ? p16.j.b(1, this.f369262g) + 0 : 0;
        if ((this.f369261f & 2) == 2) {
            b17 += p16.j.b(2, this.f369263h);
        }
        if ((this.f369261f & 4) == 4) {
            b17 += p16.j.h(3) + 1;
        }
        if ((this.f369261f & 8) == 8) {
            b17 += p16.j.a(4, this.f369265m.f369257d);
        }
        for (int i18 = 0; i18 < this.f369266n.size(); i18++) {
            b17 += p16.j.d(5, (p16.h0) this.f369266n.get(i18));
        }
        int i19 = 0;
        for (int i27 = 0; i27 < this.f369267o.size(); i27++) {
            i19 += p16.j.c(((java.lang.Integer) this.f369267o.get(i27)).intValue());
        }
        int i28 = b17 + i19;
        if (!this.f369267o.isEmpty()) {
            i28 = i28 + 1 + p16.j.c(i19);
        }
        this.f369268p = i19;
        int e17 = i28 + e() + this.f369260e.mo157707x35e001();
        this.f369270r = e17;
        return e17;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369269q;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        int i17 = this.f369261f;
        if (!((i17 & 1) == 1)) {
            this.f369269q = (byte) 0;
            return false;
        }
        if (!((i17 & 2) == 2)) {
            this.f369269q = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f369266n.size(); i18++) {
            if (!((i16.l1) this.f369266n.get(i18)).mo134563xf582434a()) {
                this.f369269q = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f369269q = (byte) 1;
            return true;
        }
        this.f369269q = (byte) 0;
        return false;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.q1();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.q1 q1Var = new i16.q1();
        q1Var.e(this);
        return q1Var;
    }

    public s1(boolean z17) {
        this.f369268p = -1;
        this.f369269q = (byte) -1;
        this.f369270r = -1;
        this.f369260e = p16.g.f432816d;
    }

    public s1(p16.h hVar, p16.l lVar, i16.a aVar) {
        i16.r1 r1Var;
        this.f369268p = -1;
        this.f369269q = (byte) -1;
        this.f369270r = -1;
        this.f369262g = 0;
        this.f369263h = 0;
        this.f369264i = false;
        i16.r1 r1Var2 = i16.r1.INV;
        this.f369265m = r1Var2;
        this.f369266n = java.util.Collections.emptyList();
        this.f369267o = java.util.Collections.emptyList();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    try {
                        int n17 = hVar.n();
                        if (n17 != 0) {
                            if (n17 == 8) {
                                this.f369261f |= 1;
                                this.f369262g = hVar.k();
                            } else if (n17 == 16) {
                                this.f369261f |= 2;
                                this.f369263h = hVar.k();
                            } else if (n17 == 24) {
                                this.f369261f |= 4;
                                this.f369264i = hVar.l() != 0;
                            } else if (n17 == 32) {
                                int k17 = hVar.k();
                                if (k17 == 0) {
                                    r1Var = i16.r1.IN;
                                } else if (k17 != 1) {
                                    r1Var = k17 != 2 ? null : r1Var2;
                                } else {
                                    r1Var = i16.r1.OUT;
                                }
                                if (r1Var == null) {
                                    j17.v(n17);
                                    j17.v(k17);
                                } else {
                                    this.f369261f |= 8;
                                    this.f369265m = r1Var;
                                }
                            } else if (n17 == 42) {
                                if ((i17 & 16) != 16) {
                                    this.f369266n = new java.util.ArrayList();
                                    i17 |= 16;
                                }
                                this.f369266n.add(hVar.g(i16.l1.A, lVar));
                            } else if (n17 == 48) {
                                if ((i17 & 32) != 32) {
                                    this.f369267o = new java.util.ArrayList();
                                    i17 |= 32;
                                }
                                this.f369267o.add(java.lang.Integer.valueOf(hVar.k()));
                            } else if (n17 != 50) {
                                if (!j(hVar, j17, lVar, n17)) {
                                }
                            } else {
                                int d17 = hVar.d(hVar.k());
                                if ((i17 & 32) != 32 && hVar.b() > 0) {
                                    this.f369267o = new java.util.ArrayList();
                                    i17 |= 32;
                                }
                                while (hVar.b() > 0) {
                                    this.f369267o.add(java.lang.Integer.valueOf(hVar.k()));
                                }
                                hVar.c(d17);
                            }
                        }
                        z17 = true;
                    } catch (p16.z e17) {
                        e17.f432904d = this;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    p16.z zVar = new p16.z(e18.getMessage());
                    zVar.f432904d = this;
                    throw zVar;
                }
            } catch (java.lang.Throwable th6) {
                if ((i17 & 16) == 16) {
                    this.f369266n = java.util.Collections.unmodifiableList(this.f369266n);
                }
                if ((i17 & 32) == 32) {
                    this.f369267o = java.util.Collections.unmodifiableList(this.f369267o);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                    this.f369260e = m17.c();
                    h();
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    this.f369260e = m17.c();
                    throw th7;
                }
            }
        }
        if ((i17 & 16) == 16) {
            this.f369266n = java.util.Collections.unmodifiableList(this.f369266n);
        }
        if ((i17 & 32) == 32) {
            this.f369267o = java.util.Collections.unmodifiableList(this.f369267o);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
            this.f369260e = m17.c();
            h();
        } catch (java.lang.Throwable th8) {
            this.f369260e = m17.c();
            throw th8;
        }
    }
}
