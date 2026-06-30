package i16;

/* loaded from: classes16.dex */
public final class r0 extends p16.s {

    /* renamed from: p, reason: collision with root package name */
    public static final i16.r0 f369243p;

    /* renamed from: q, reason: collision with root package name */
    public static final p16.j0 f369244q = new i16.p0();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f369245e;

    /* renamed from: f, reason: collision with root package name */
    public int f369246f;

    /* renamed from: g, reason: collision with root package name */
    public i16.e1 f369247g;

    /* renamed from: h, reason: collision with root package name */
    public i16.b1 f369248h;

    /* renamed from: i, reason: collision with root package name */
    public i16.o0 f369249i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f369250m;

    /* renamed from: n, reason: collision with root package name */
    public byte f369251n;

    /* renamed from: o, reason: collision with root package name */
    public int f369252o;

    static {
        i16.r0 r0Var = new i16.r0(true);
        f369243p = r0Var;
        r0Var.f369247g = i16.e1.f368944h;
        r0Var.f369248h = i16.b1.f368896h;
        r0Var.f369249i = i16.o0.f369192q;
        r0Var.f369250m = java.util.Collections.emptyList();
    }

    public r0(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f369251n = (byte) -1;
        this.f369252o = -1;
        this.f369245e = qVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        p16.r i17 = i();
        if ((this.f369246f & 1) == 1) {
            jVar.o(1, this.f369247g);
        }
        if ((this.f369246f & 2) == 2) {
            jVar.o(2, this.f369248h);
        }
        if ((this.f369246f & 4) == 4) {
            jVar.o(3, this.f369249i);
        }
        for (int i18 = 0; i18 < this.f369250m.size(); i18++) {
            jVar.o(4, (p16.h0) this.f369250m.get(i18));
        }
        i17.a(200, jVar);
        jVar.r(this.f369245e);
    }

    @Override // p16.i0
    /* renamed from: getDefaultInstanceForType */
    public p16.h0 mo134575x786693c3() {
        return f369243p;
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369252o;
        if (i17 != -1) {
            return i17;
        }
        int d17 = (this.f369246f & 1) == 1 ? p16.j.d(1, this.f369247g) + 0 : 0;
        if ((this.f369246f & 2) == 2) {
            d17 += p16.j.d(2, this.f369248h);
        }
        if ((this.f369246f & 4) == 4) {
            d17 += p16.j.d(3, this.f369249i);
        }
        for (int i18 = 0; i18 < this.f369250m.size(); i18++) {
            d17 += p16.j.d(4, (p16.h0) this.f369250m.get(i18));
        }
        int e17 = d17 + e() + this.f369245e.mo157707x35e001();
        this.f369252o = e17;
        return e17;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369251n;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (((this.f369246f & 2) == 2) && !this.f369248h.mo134563xf582434a()) {
            this.f369251n = (byte) 0;
            return false;
        }
        if (((this.f369246f & 4) == 4) && !this.f369249i.mo134563xf582434a()) {
            this.f369251n = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.f369250m.size(); i17++) {
            if (!((i16.o) this.f369250m.get(i17)).mo134563xf582434a()) {
                this.f369251n = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f369251n = (byte) 1;
            return true;
        }
        this.f369251n = (byte) 0;
        return false;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.q0();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.q0 q0Var = new i16.q0();
        q0Var.e(this);
        return q0Var;
    }

    public r0(boolean z17) {
        this.f369251n = (byte) -1;
        this.f369252o = -1;
        this.f369245e = p16.g.f432816d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    public r0(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f369251n = (byte) -1;
        this.f369252o = -1;
        this.f369247g = i16.e1.f368944h;
        this.f369248h = i16.b1.f368896h;
        this.f369249i = i16.o0.f369192q;
        this.f369250m = java.util.Collections.emptyList();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        char c17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        i16.n0 n0Var = null;
                        i16.d1 d1Var = null;
                        i16.w0 w0Var = null;
                        if (n17 == 10) {
                            if ((this.f369246f & 1) == 1) {
                                i16.e1 e1Var = this.f369247g;
                                e1Var.getClass();
                                d1Var = new i16.d1();
                                d1Var.d(e1Var);
                            }
                            i16.e1 e1Var2 = (i16.e1) hVar.g(i16.e1.f368945i, lVar);
                            this.f369247g = e1Var2;
                            if (d1Var != null) {
                                d1Var.d(e1Var2);
                                this.f369247g = d1Var.c();
                            }
                            this.f369246f |= 1;
                        } else if (n17 == 18) {
                            if ((this.f369246f & 2) == 2) {
                                i16.b1 b1Var = this.f369248h;
                                b1Var.getClass();
                                w0Var = new i16.w0();
                                w0Var.d(b1Var);
                            }
                            i16.b1 b1Var2 = (i16.b1) hVar.g(i16.b1.f368897i, lVar);
                            this.f369248h = b1Var2;
                            if (w0Var != null) {
                                w0Var.d(b1Var2);
                                this.f369248h = w0Var.c();
                            }
                            this.f369246f |= 2;
                        } else if (n17 == 26) {
                            if ((this.f369246f & 4) == 4) {
                                i16.o0 o0Var = this.f369249i;
                                o0Var.getClass();
                                n0Var = new i16.n0();
                                n0Var.e(o0Var);
                            }
                            i16.o0 o0Var2 = (i16.o0) hVar.g(i16.o0.f369193r, lVar);
                            this.f369249i = o0Var2;
                            if (n0Var != null) {
                                n0Var.e(o0Var2);
                                this.f369249i = n0Var.d();
                            }
                            this.f369246f |= 4;
                        } else if (n17 != 34) {
                            if (!j(hVar, j17, lVar, n17)) {
                            }
                        } else {
                            int i17 = (c17 == true ? 1 : 0) & 8;
                            c17 = c17;
                            if (i17 != 8) {
                                this.f369250m = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | '\b';
                            }
                            this.f369250m.add(hVar.g(i16.o.R, lVar));
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
                if (((c17 == true ? 1 : 0) & 8) == 8) {
                    this.f369250m = java.util.Collections.unmodifiableList(this.f369250m);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                    this.f369245e = m17.c();
                    h();
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    this.f369245e = m17.c();
                    throw th7;
                }
            }
        }
        if (((c17 == true ? 1 : 0) & 8) == 8) {
            this.f369250m = java.util.Collections.unmodifiableList(this.f369250m);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
            this.f369245e = m17.c();
            h();
        } catch (java.lang.Throwable th8) {
            this.f369245e = m17.c();
            throw th8;
        }
    }
}
