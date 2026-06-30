package i16;

/* loaded from: classes16.dex */
public final class g0 extends p16.v implements p16.i0 {

    /* renamed from: r, reason: collision with root package name */
    public static final i16.g0 f368984r;

    /* renamed from: s, reason: collision with root package name */
    public static final p16.j0 f368985s = new i16.d0();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f368986d;

    /* renamed from: e, reason: collision with root package name */
    public int f368987e;

    /* renamed from: f, reason: collision with root package name */
    public int f368988f;

    /* renamed from: g, reason: collision with root package name */
    public int f368989g;

    /* renamed from: h, reason: collision with root package name */
    public i16.f0 f368990h;

    /* renamed from: i, reason: collision with root package name */
    public i16.l1 f368991i;

    /* renamed from: m, reason: collision with root package name */
    public int f368992m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f368993n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f368994o;

    /* renamed from: p, reason: collision with root package name */
    public byte f368995p;

    /* renamed from: q, reason: collision with root package name */
    public int f368996q;

    static {
        i16.g0 g0Var = new i16.g0(true);
        f368984r = g0Var;
        g0Var.f368988f = 0;
        g0Var.f368989g = 0;
        g0Var.f368990h = i16.f0.TRUE;
        g0Var.f368991i = i16.l1.f369113z;
        g0Var.f368992m = 0;
        g0Var.f368993n = java.util.Collections.emptyList();
        g0Var.f368994o = java.util.Collections.emptyList();
    }

    public g0(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f368995p = (byte) -1;
        this.f368996q = -1;
        this.f368986d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        if ((this.f368987e & 1) == 1) {
            jVar.m(1, this.f368988f);
        }
        if ((this.f368987e & 2) == 2) {
            jVar.m(2, this.f368989g);
        }
        if ((this.f368987e & 4) == 4) {
            jVar.l(3, this.f368990h.f368966d);
        }
        if ((this.f368987e & 8) == 8) {
            jVar.o(4, this.f368991i);
        }
        if ((this.f368987e & 16) == 16) {
            jVar.m(5, this.f368992m);
        }
        for (int i17 = 0; i17 < this.f368993n.size(); i17++) {
            jVar.o(6, (p16.h0) this.f368993n.get(i17));
        }
        for (int i18 = 0; i18 < this.f368994o.size(); i18++) {
            jVar.o(7, (p16.h0) this.f368994o.get(i18));
        }
        jVar.r(this.f368986d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f368996q;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f368987e & 1) == 1 ? p16.j.b(1, this.f368988f) + 0 : 0;
        if ((this.f368987e & 2) == 2) {
            b17 += p16.j.b(2, this.f368989g);
        }
        if ((this.f368987e & 4) == 4) {
            b17 += p16.j.a(3, this.f368990h.f368966d);
        }
        if ((this.f368987e & 8) == 8) {
            b17 += p16.j.d(4, this.f368991i);
        }
        if ((this.f368987e & 16) == 16) {
            b17 += p16.j.b(5, this.f368992m);
        }
        for (int i18 = 0; i18 < this.f368993n.size(); i18++) {
            b17 += p16.j.d(6, (p16.h0) this.f368993n.get(i18));
        }
        for (int i19 = 0; i19 < this.f368994o.size(); i19++) {
            b17 += p16.j.d(7, (p16.h0) this.f368994o.get(i19));
        }
        int mo157707x35e001 = b17 + this.f368986d.mo157707x35e001();
        this.f368996q = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f368995p;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (((this.f368987e & 8) == 8) && !this.f368991i.mo134563xf582434a()) {
            this.f368995p = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.f368993n.size(); i17++) {
            if (!((i16.g0) this.f368993n.get(i17)).mo134563xf582434a()) {
                this.f368995p = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f368994o.size(); i18++) {
            if (!((i16.g0) this.f368994o.get(i18)).mo134563xf582434a()) {
                this.f368995p = (byte) 0;
                return false;
            }
        }
        this.f368995p = (byte) 1;
        return true;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.e0();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.e0 e0Var = new i16.e0();
        e0Var.d(this);
        return e0Var;
    }

    public g0(boolean z17) {
        this.f368995p = (byte) -1;
        this.f368996q = -1;
        this.f368986d = p16.g.f432816d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public g0(p16.h hVar, p16.l lVar, i16.a aVar) {
        i16.f0 f0Var;
        this.f368995p = (byte) -1;
        this.f368996q = -1;
        boolean z17 = false;
        this.f368988f = 0;
        this.f368989g = 0;
        i16.f0 f0Var2 = i16.f0.TRUE;
        this.f368990h = f0Var2;
        this.f368991i = i16.l1.f369113z;
        this.f368992m = 0;
        this.f368993n = java.util.Collections.emptyList();
        this.f368994o = java.util.Collections.emptyList();
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        char c17 = 0;
        while (!z17) {
            try {
                try {
                    try {
                        int n17 = hVar.n();
                        if (n17 != 0) {
                            if (n17 == 8) {
                                this.f368987e |= 1;
                                this.f368988f = hVar.k();
                            } else if (n17 != 16) {
                                i16.k1 k1Var = null;
                                i16.f0 f0Var3 = null;
                                if (n17 == 24) {
                                    int k17 = hVar.k();
                                    if (k17 != 0) {
                                        if (k17 == 1) {
                                            f0Var3 = i16.f0.FALSE;
                                        } else if (k17 == 2) {
                                            f0Var3 = i16.f0.NULL;
                                        }
                                        f0Var = f0Var3;
                                    } else {
                                        f0Var = f0Var2;
                                    }
                                    if (f0Var == null) {
                                        j17.v(n17);
                                        j17.v(k17);
                                    } else {
                                        this.f368987e |= 4;
                                        this.f368990h = f0Var;
                                    }
                                } else if (n17 == 34) {
                                    if ((this.f368987e & 8) == 8) {
                                        i16.l1 l1Var = this.f368991i;
                                        l1Var.getClass();
                                        k1Var = i16.l1.m(l1Var);
                                    }
                                    i16.k1 k1Var2 = k1Var;
                                    i16.l1 l1Var2 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                    this.f368991i = l1Var2;
                                    if (k1Var2 != null) {
                                        k1Var2.b(l1Var2);
                                        this.f368991i = k1Var2.d();
                                    }
                                    this.f368987e |= 8;
                                } else if (n17 != 40) {
                                    p16.j0 j0Var = f368985s;
                                    if (n17 == 50) {
                                        int i17 = (c17 == true ? 1 : 0) & 32;
                                        c17 = c17;
                                        if (i17 != 32) {
                                            this.f368993n = new java.util.ArrayList();
                                            c17 = (c17 == true ? 1 : 0) | ' ';
                                        }
                                        this.f368993n.add(hVar.g(j0Var, lVar));
                                    } else if (n17 != 58) {
                                        if (!hVar.q(n17, j17)) {
                                        }
                                    } else {
                                        int i18 = (c17 == true ? 1 : 0) & 64;
                                        c17 = c17;
                                        if (i18 != 64) {
                                            this.f368994o = new java.util.ArrayList();
                                            c17 = (c17 == true ? 1 : 0) | '@';
                                        }
                                        this.f368994o.add(hVar.g(j0Var, lVar));
                                    }
                                } else {
                                    this.f368987e |= 16;
                                    this.f368992m = hVar.k();
                                }
                            } else {
                                this.f368987e |= 2;
                                this.f368989g = hVar.k();
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
                if (((c17 == true ? 1 : 0) & 32) == 32) {
                    this.f368993n = java.util.Collections.unmodifiableList(this.f368993n);
                }
                if (((c17 == true ? 1 : 0) & 64) == 64) {
                    this.f368994o = java.util.Collections.unmodifiableList(this.f368994o);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                    throw th6;
                } finally {
                }
            }
        }
        if (((c17 == true ? 1 : 0) & 32) == 32) {
            this.f368993n = java.util.Collections.unmodifiableList(this.f368993n);
        }
        if (((c17 == true ? 1 : 0) & 64) == 64) {
            this.f368994o = java.util.Collections.unmodifiableList(this.f368994o);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
