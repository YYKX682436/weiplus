package i16;

/* loaded from: classes16.dex */
public final class d2 extends p16.v implements p16.i0 {

    /* renamed from: q, reason: collision with root package name */
    public static final i16.d2 f368924q;

    /* renamed from: r, reason: collision with root package name */
    public static final p16.j0 f368925r = new i16.z1();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f368926d;

    /* renamed from: e, reason: collision with root package name */
    public int f368927e;

    /* renamed from: f, reason: collision with root package name */
    public int f368928f;

    /* renamed from: g, reason: collision with root package name */
    public int f368929g;

    /* renamed from: h, reason: collision with root package name */
    public i16.b2 f368930h;

    /* renamed from: i, reason: collision with root package name */
    public int f368931i;

    /* renamed from: m, reason: collision with root package name */
    public int f368932m;

    /* renamed from: n, reason: collision with root package name */
    public i16.c2 f368933n;

    /* renamed from: o, reason: collision with root package name */
    public byte f368934o;

    /* renamed from: p, reason: collision with root package name */
    public int f368935p;

    static {
        i16.d2 d2Var = new i16.d2(true);
        f368924q = d2Var;
        d2Var.f368928f = 0;
        d2Var.f368929g = 0;
        d2Var.f368930h = i16.b2.ERROR;
        d2Var.f368931i = 0;
        d2Var.f368932m = 0;
        d2Var.f368933n = i16.c2.LANGUAGE_VERSION;
    }

    public d2(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f368934o = (byte) -1;
        this.f368935p = -1;
        this.f368926d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        if ((this.f368927e & 1) == 1) {
            jVar.m(1, this.f368928f);
        }
        if ((this.f368927e & 2) == 2) {
            jVar.m(2, this.f368929g);
        }
        if ((this.f368927e & 4) == 4) {
            jVar.l(3, this.f368930h.f368906d);
        }
        if ((this.f368927e & 8) == 8) {
            jVar.m(4, this.f368931i);
        }
        if ((this.f368927e & 16) == 16) {
            jVar.m(5, this.f368932m);
        }
        if ((this.f368927e & 32) == 32) {
            jVar.l(6, this.f368933n.f368918d);
        }
        jVar.r(this.f368926d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f368935p;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f368927e & 1) == 1 ? 0 + p16.j.b(1, this.f368928f) : 0;
        if ((this.f368927e & 2) == 2) {
            b17 += p16.j.b(2, this.f368929g);
        }
        if ((this.f368927e & 4) == 4) {
            b17 += p16.j.a(3, this.f368930h.f368906d);
        }
        if ((this.f368927e & 8) == 8) {
            b17 += p16.j.b(4, this.f368931i);
        }
        if ((this.f368927e & 16) == 16) {
            b17 += p16.j.b(5, this.f368932m);
        }
        if ((this.f368927e & 32) == 32) {
            b17 += p16.j.a(6, this.f368933n.f368918d);
        }
        int mo157707x35e001 = b17 + this.f368926d.mo157707x35e001();
        this.f368935p = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f368934o;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f368934o = (byte) 1;
        return true;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.a2();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.a2 a2Var = new i16.a2();
        a2Var.d(this);
        return a2Var;
    }

    public d2(boolean z17) {
        this.f368934o = (byte) -1;
        this.f368935p = -1;
        this.f368926d = p16.g.f432816d;
    }

    public d2(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f368934o = (byte) -1;
        this.f368935p = -1;
        boolean z17 = false;
        this.f368928f = 0;
        this.f368929g = 0;
        i16.b2 b2Var = i16.b2.ERROR;
        this.f368930h = b2Var;
        this.f368931i = 0;
        this.f368932m = 0;
        i16.c2 c2Var = i16.c2.LANGUAGE_VERSION;
        this.f368933n = c2Var;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f368927e |= 1;
                            this.f368928f = hVar.k();
                        } else if (n17 != 16) {
                            i16.c2 c2Var2 = null;
                            i16.b2 b2Var2 = null;
                            if (n17 == 24) {
                                int k17 = hVar.k();
                                if (k17 == 0) {
                                    b2Var2 = i16.b2.WARNING;
                                } else if (k17 == 1) {
                                    b2Var2 = b2Var;
                                } else if (k17 == 2) {
                                    b2Var2 = i16.b2.HIDDEN;
                                }
                                if (b2Var2 == null) {
                                    j17.v(n17);
                                    j17.v(k17);
                                } else {
                                    this.f368927e |= 4;
                                    this.f368930h = b2Var2;
                                }
                            } else if (n17 == 32) {
                                this.f368927e |= 8;
                                this.f368931i = hVar.k();
                            } else if (n17 == 40) {
                                this.f368927e |= 16;
                                this.f368932m = hVar.k();
                            } else if (n17 != 48) {
                                if (!hVar.q(n17, j17)) {
                                }
                            } else {
                                int k18 = hVar.k();
                                if (k18 == 0) {
                                    c2Var2 = c2Var;
                                } else if (k18 == 1) {
                                    c2Var2 = i16.c2.COMPILER_VERSION;
                                } else if (k18 == 2) {
                                    c2Var2 = i16.c2.API_VERSION;
                                }
                                if (c2Var2 == null) {
                                    j17.v(n17);
                                    j17.v(k18);
                                } else {
                                    this.f368927e |= 32;
                                    this.f368933n = c2Var2;
                                }
                            }
                        } else {
                            this.f368927e |= 2;
                            this.f368929g = hVar.k();
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th7) {
                        this.f368926d = m17.c();
                        throw th7;
                    }
                    this.f368926d = m17.c();
                    throw th6;
                }
            } catch (p16.z e17) {
                e17.f432904d = this;
                throw e17;
            } catch (java.io.IOException e18) {
                p16.z zVar = new p16.z(e18.getMessage());
                zVar.f432904d = this;
                throw zVar;
            }
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th8) {
            this.f368926d = m17.c();
            throw th8;
        }
        this.f368926d = m17.c();
    }
}
