package i16;

/* loaded from: classes16.dex */
public final class o0 extends p16.s {

    /* renamed from: q, reason: collision with root package name */
    public static final i16.o0 f369192q;

    /* renamed from: r, reason: collision with root package name */
    public static final p16.j0 f369193r = new i16.m0();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f369194e;

    /* renamed from: f, reason: collision with root package name */
    public int f369195f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f369196g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f369197h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f369198i;

    /* renamed from: m, reason: collision with root package name */
    public i16.v1 f369199m;

    /* renamed from: n, reason: collision with root package name */
    public i16.g2 f369200n;

    /* renamed from: o, reason: collision with root package name */
    public byte f369201o;

    /* renamed from: p, reason: collision with root package name */
    public int f369202p;

    static {
        i16.o0 o0Var = new i16.o0(true);
        f369192q = o0Var;
        o0Var.f369196g = java.util.Collections.emptyList();
        o0Var.f369197h = java.util.Collections.emptyList();
        o0Var.f369198i = java.util.Collections.emptyList();
        o0Var.f369199m = i16.v1.f369316m;
        o0Var.f369200n = i16.g2.f368997h;
    }

    public o0(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f369201o = (byte) -1;
        this.f369202p = -1;
        this.f369194e = qVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        p16.r i17 = i();
        for (int i18 = 0; i18 < this.f369196g.size(); i18++) {
            jVar.o(3, (p16.h0) this.f369196g.get(i18));
        }
        for (int i19 = 0; i19 < this.f369197h.size(); i19++) {
            jVar.o(4, (p16.h0) this.f369197h.get(i19));
        }
        for (int i27 = 0; i27 < this.f369198i.size(); i27++) {
            jVar.o(5, (p16.h0) this.f369198i.get(i27));
        }
        if ((this.f369195f & 1) == 1) {
            jVar.o(30, this.f369199m);
        }
        if ((this.f369195f & 2) == 2) {
            jVar.o(32, this.f369200n);
        }
        i17.a(200, jVar);
        jVar.r(this.f369194e);
    }

    @Override // p16.i0
    /* renamed from: getDefaultInstanceForType */
    public p16.h0 mo134575x786693c3() {
        return f369192q;
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369202p;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f369196g.size(); i19++) {
            i18 += p16.j.d(3, (p16.h0) this.f369196g.get(i19));
        }
        for (int i27 = 0; i27 < this.f369197h.size(); i27++) {
            i18 += p16.j.d(4, (p16.h0) this.f369197h.get(i27));
        }
        for (int i28 = 0; i28 < this.f369198i.size(); i28++) {
            i18 += p16.j.d(5, (p16.h0) this.f369198i.get(i28));
        }
        if ((this.f369195f & 1) == 1) {
            i18 += p16.j.d(30, this.f369199m);
        }
        if ((this.f369195f & 2) == 2) {
            i18 += p16.j.d(32, this.f369200n);
        }
        int e17 = i18 + e() + this.f369194e.mo157707x35e001();
        this.f369202p = e17;
        return e17;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369201o;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f369196g.size(); i17++) {
            if (!((i16.j0) this.f369196g.get(i17)).mo134563xf582434a()) {
                this.f369201o = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f369197h.size(); i18++) {
            if (!((i16.u0) this.f369197h.get(i18)).mo134563xf582434a()) {
                this.f369201o = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f369198i.size(); i19++) {
            if (!((i16.o1) this.f369198i.get(i19)).mo134563xf582434a()) {
                this.f369201o = (byte) 0;
                return false;
            }
        }
        if (((this.f369195f & 1) == 1) && !this.f369199m.mo134563xf582434a()) {
            this.f369201o = (byte) 0;
            return false;
        }
        if (d()) {
            this.f369201o = (byte) 1;
            return true;
        }
        this.f369201o = (byte) 0;
        return false;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.n0();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.n0 n0Var = new i16.n0();
        n0Var.e(this);
        return n0Var;
    }

    public o0(boolean z17) {
        this.f369201o = (byte) -1;
        this.f369202p = -1;
        this.f369194e = p16.g.f432816d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public o0(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f369201o = (byte) -1;
        this.f369202p = -1;
        this.f369196g = java.util.Collections.emptyList();
        this.f369197h = java.util.Collections.emptyList();
        this.f369198i = java.util.Collections.emptyList();
        this.f369199m = i16.v1.f369316m;
        this.f369200n = i16.g2.f368997h;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        char c17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 26) {
                            int i17 = (c17 == true ? 1 : 0) & 1;
                            c17 = c17;
                            if (i17 != 1) {
                                this.f369196g = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | 1;
                            }
                            this.f369196g.add(hVar.g(i16.j0.B, lVar));
                        } else if (n17 == 34) {
                            int i18 = (c17 == true ? 1 : 0) & 2;
                            c17 = c17;
                            if (i18 != 2) {
                                this.f369197h = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | 2;
                            }
                            this.f369197h.add(hVar.g(i16.u0.B, lVar));
                        } else if (n17 != 42) {
                            i16.f2 f2Var = null;
                            i16.u1 u1Var = null;
                            if (n17 == 242) {
                                if ((this.f369195f & 1) == 1) {
                                    i16.v1 v1Var = this.f369199m;
                                    v1Var.getClass();
                                    u1Var = i16.v1.d(v1Var);
                                }
                                i16.v1 v1Var2 = (i16.v1) hVar.g(i16.v1.f369317n, lVar);
                                this.f369199m = v1Var2;
                                if (u1Var != null) {
                                    u1Var.d(v1Var2);
                                    this.f369199m = u1Var.c();
                                }
                                this.f369195f |= 1;
                            } else if (n17 != 258) {
                                if (!j(hVar, j17, lVar, n17)) {
                                }
                            } else {
                                if ((this.f369195f & 2) == 2) {
                                    i16.g2 g2Var = this.f369200n;
                                    g2Var.getClass();
                                    f2Var = new i16.f2();
                                    f2Var.d(g2Var);
                                }
                                i16.g2 g2Var2 = (i16.g2) hVar.g(i16.g2.f368998i, lVar);
                                this.f369200n = g2Var2;
                                if (f2Var != null) {
                                    f2Var.d(g2Var2);
                                    this.f369200n = f2Var.c();
                                }
                                this.f369195f |= 2;
                            }
                        } else {
                            int i19 = (c17 == true ? 1 : 0) & 4;
                            c17 = c17;
                            if (i19 != 4) {
                                this.f369198i = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | 4;
                            }
                            this.f369198i.add(hVar.g(i16.o1.f369204v, lVar));
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
                if (((c17 == true ? 1 : 0) & 1) == 1) {
                    this.f369196g = java.util.Collections.unmodifiableList(this.f369196g);
                }
                if (((c17 == true ? 1 : 0) & 2) == 2) {
                    this.f369197h = java.util.Collections.unmodifiableList(this.f369197h);
                }
                if (((c17 == true ? 1 : 0) & 4) == 4) {
                    this.f369198i = java.util.Collections.unmodifiableList(this.f369198i);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                    this.f369194e = m17.c();
                    h();
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    this.f369194e = m17.c();
                    throw th7;
                }
            }
        }
        if (((c17 == true ? 1 : 0) & 1) == 1) {
            this.f369196g = java.util.Collections.unmodifiableList(this.f369196g);
        }
        if (((c17 == true ? 1 : 0) & 2) == 2) {
            this.f369197h = java.util.Collections.unmodifiableList(this.f369197h);
        }
        if (((c17 == true ? 1 : 0) & 4) == 4) {
            this.f369198i = java.util.Collections.unmodifiableList(this.f369198i);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
            this.f369194e = m17.c();
            h();
        } catch (java.lang.Throwable th8) {
            this.f369194e = m17.c();
            throw th8;
        }
    }
}
