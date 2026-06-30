package i16;

/* loaded from: classes16.dex */
public final class a1 extends p16.v implements p16.i0 {

    /* renamed from: n, reason: collision with root package name */
    public static final i16.a1 f368878n;

    /* renamed from: o, reason: collision with root package name */
    public static final p16.j0 f368879o = new i16.x0();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f368880d;

    /* renamed from: e, reason: collision with root package name */
    public int f368881e;

    /* renamed from: f, reason: collision with root package name */
    public int f368882f;

    /* renamed from: g, reason: collision with root package name */
    public int f368883g;

    /* renamed from: h, reason: collision with root package name */
    public i16.z0 f368884h;

    /* renamed from: i, reason: collision with root package name */
    public byte f368885i;

    /* renamed from: m, reason: collision with root package name */
    public int f368886m;

    static {
        i16.a1 a1Var = new i16.a1(true);
        f368878n = a1Var;
        a1Var.f368882f = -1;
        a1Var.f368883g = 0;
        a1Var.f368884h = i16.z0.PACKAGE;
    }

    public a1(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f368885i = (byte) -1;
        this.f368886m = -1;
        this.f368880d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        if ((this.f368881e & 1) == 1) {
            jVar.m(1, this.f368882f);
        }
        if ((this.f368881e & 2) == 2) {
            jVar.m(2, this.f368883g);
        }
        if ((this.f368881e & 4) == 4) {
            jVar.l(3, this.f368884h.f369378d);
        }
        jVar.r(this.f368880d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f368886m;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f368881e & 1) == 1 ? 0 + p16.j.b(1, this.f368882f) : 0;
        if ((this.f368881e & 2) == 2) {
            b17 += p16.j.b(2, this.f368883g);
        }
        if ((this.f368881e & 4) == 4) {
            b17 += p16.j.a(3, this.f368884h.f369378d);
        }
        int mo157707x35e001 = b17 + this.f368880d.mo157707x35e001();
        this.f368886m = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f368885i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if ((this.f368881e & 2) == 2) {
            this.f368885i = (byte) 1;
            return true;
        }
        this.f368885i = (byte) 0;
        return false;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.y0();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.y0 y0Var = new i16.y0();
        y0Var.d(this);
        return y0Var;
    }

    public a1(boolean z17) {
        this.f368885i = (byte) -1;
        this.f368886m = -1;
        this.f368880d = p16.g.f432816d;
    }

    public a1(p16.h hVar, p16.l lVar, i16.a aVar) {
        i16.z0 z0Var;
        this.f368885i = (byte) -1;
        this.f368886m = -1;
        this.f368882f = -1;
        boolean z17 = false;
        this.f368883g = 0;
        i16.z0 z0Var2 = i16.z0.PACKAGE;
        this.f368884h = z0Var2;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f368881e |= 1;
                            this.f368882f = hVar.k();
                        } else if (n17 == 16) {
                            this.f368881e |= 2;
                            this.f368883g = hVar.k();
                        } else if (n17 != 24) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            int k17 = hVar.k();
                            if (k17 == 0) {
                                z0Var = i16.z0.CLASS;
                            } else if (k17 != 1) {
                                z0Var = k17 != 2 ? null : i16.z0.LOCAL;
                            } else {
                                z0Var = z0Var2;
                            }
                            if (z0Var == null) {
                                j17.v(n17);
                                j17.v(k17);
                            } else {
                                this.f368881e |= 4;
                                this.f368884h = z0Var;
                            }
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th7) {
                        this.f368880d = m17.c();
                        throw th7;
                    }
                    this.f368880d = m17.c();
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
            this.f368880d = m17.c();
            throw th8;
        }
        this.f368880d = m17.c();
    }
}
