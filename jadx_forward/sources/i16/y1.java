package i16;

/* loaded from: classes16.dex */
public final class y1 extends p16.s {

    /* renamed from: r, reason: collision with root package name */
    public static final i16.y1 f369352r;

    /* renamed from: s, reason: collision with root package name */
    public static final p16.j0 f369353s = new i16.w1();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f369354e;

    /* renamed from: f, reason: collision with root package name */
    public int f369355f;

    /* renamed from: g, reason: collision with root package name */
    public int f369356g;

    /* renamed from: h, reason: collision with root package name */
    public int f369357h;

    /* renamed from: i, reason: collision with root package name */
    public i16.l1 f369358i;

    /* renamed from: m, reason: collision with root package name */
    public int f369359m;

    /* renamed from: n, reason: collision with root package name */
    public i16.l1 f369360n;

    /* renamed from: o, reason: collision with root package name */
    public int f369361o;

    /* renamed from: p, reason: collision with root package name */
    public byte f369362p;

    /* renamed from: q, reason: collision with root package name */
    public int f369363q;

    static {
        i16.y1 y1Var = new i16.y1(true);
        f369352r = y1Var;
        y1Var.f369356g = 0;
        y1Var.f369357h = 0;
        i16.l1 l1Var = i16.l1.f369113z;
        y1Var.f369358i = l1Var;
        y1Var.f369359m = 0;
        y1Var.f369360n = l1Var;
        y1Var.f369361o = 0;
    }

    public y1(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f369362p = (byte) -1;
        this.f369363q = -1;
        this.f369354e = qVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        p16.r i17 = i();
        if ((this.f369355f & 1) == 1) {
            jVar.m(1, this.f369356g);
        }
        if ((this.f369355f & 2) == 2) {
            jVar.m(2, this.f369357h);
        }
        if ((this.f369355f & 4) == 4) {
            jVar.o(3, this.f369358i);
        }
        if ((this.f369355f & 16) == 16) {
            jVar.o(4, this.f369360n);
        }
        if ((this.f369355f & 8) == 8) {
            jVar.m(5, this.f369359m);
        }
        if ((this.f369355f & 32) == 32) {
            jVar.m(6, this.f369361o);
        }
        i17.a(200, jVar);
        jVar.r(this.f369354e);
    }

    @Override // p16.i0
    /* renamed from: getDefaultInstanceForType */
    public p16.h0 mo134575x786693c3() {
        return f369352r;
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369363q;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f369355f & 1) == 1 ? 0 + p16.j.b(1, this.f369356g) : 0;
        if ((this.f369355f & 2) == 2) {
            b17 += p16.j.b(2, this.f369357h);
        }
        if ((this.f369355f & 4) == 4) {
            b17 += p16.j.d(3, this.f369358i);
        }
        if ((this.f369355f & 16) == 16) {
            b17 += p16.j.d(4, this.f369360n);
        }
        if ((this.f369355f & 8) == 8) {
            b17 += p16.j.b(5, this.f369359m);
        }
        if ((this.f369355f & 32) == 32) {
            b17 += p16.j.b(6, this.f369361o);
        }
        int e17 = b17 + e() + this.f369354e.mo157707x35e001();
        this.f369363q = e17;
        return e17;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369362p;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        int i17 = this.f369355f;
        if (!((i17 & 2) == 2)) {
            this.f369362p = (byte) 0;
            return false;
        }
        if (((i17 & 4) == 4) && !this.f369358i.mo134563xf582434a()) {
            this.f369362p = (byte) 0;
            return false;
        }
        if (((this.f369355f & 16) == 16) && !this.f369360n.mo134563xf582434a()) {
            this.f369362p = (byte) 0;
            return false;
        }
        if (d()) {
            this.f369362p = (byte) 1;
            return true;
        }
        this.f369362p = (byte) 0;
        return false;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.x1();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.x1 x1Var = new i16.x1();
        x1Var.e(this);
        return x1Var;
    }

    public y1(boolean z17) {
        this.f369362p = (byte) -1;
        this.f369363q = -1;
        this.f369354e = p16.g.f432816d;
    }

    public y1(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f369362p = (byte) -1;
        this.f369363q = -1;
        boolean z17 = false;
        this.f369356g = 0;
        this.f369357h = 0;
        i16.l1 l1Var = i16.l1.f369113z;
        this.f369358i = l1Var;
        this.f369359m = 0;
        this.f369360n = l1Var;
        this.f369361o = 0;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    try {
                        int n17 = hVar.n();
                        if (n17 != 0) {
                            if (n17 == 8) {
                                this.f369355f |= 1;
                                this.f369356g = hVar.k();
                            } else if (n17 != 16) {
                                i16.k1 k1Var = null;
                                if (n17 == 26) {
                                    if ((this.f369355f & 4) == 4) {
                                        i16.l1 l1Var2 = this.f369358i;
                                        l1Var2.getClass();
                                        k1Var = i16.l1.m(l1Var2);
                                    }
                                    i16.l1 l1Var3 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                    this.f369358i = l1Var3;
                                    if (k1Var != null) {
                                        k1Var.b(l1Var3);
                                        this.f369358i = k1Var.d();
                                    }
                                    this.f369355f |= 4;
                                } else if (n17 == 34) {
                                    if ((this.f369355f & 16) == 16) {
                                        i16.l1 l1Var4 = this.f369360n;
                                        l1Var4.getClass();
                                        k1Var = i16.l1.m(l1Var4);
                                    }
                                    i16.l1 l1Var5 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                    this.f369360n = l1Var5;
                                    if (k1Var != null) {
                                        k1Var.b(l1Var5);
                                        this.f369360n = k1Var.d();
                                    }
                                    this.f369355f |= 16;
                                } else if (n17 == 40) {
                                    this.f369355f |= 8;
                                    this.f369359m = hVar.k();
                                } else if (n17 != 48) {
                                    if (!j(hVar, j17, lVar, n17)) {
                                    }
                                } else {
                                    this.f369355f |= 32;
                                    this.f369361o = hVar.k();
                                }
                            } else {
                                this.f369355f |= 2;
                                this.f369357h = hVar.k();
                            }
                        }
                        z17 = true;
                    } catch (java.io.IOException e17) {
                        p16.z zVar = new p16.z(e17.getMessage());
                        zVar.f432904d = this;
                        throw zVar;
                    }
                } catch (p16.z e18) {
                    e18.f432904d = this;
                    throw e18;
                }
            } catch (java.lang.Throwable th6) {
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                } catch (java.lang.Throwable th7) {
                    this.f369354e = m17.c();
                    throw th7;
                }
                this.f369354e = m17.c();
                h();
                throw th6;
            }
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th8) {
            this.f369354e = m17.c();
            throw th8;
        }
        this.f369354e = m17.c();
        h();
    }
}
