package l16;

/* loaded from: classes16.dex */
public final class q extends p16.v implements p16.i0 {

    /* renamed from: m, reason: collision with root package name */
    public static final l16.q f396617m;

    /* renamed from: n, reason: collision with root package name */
    public static final p16.j0 f396618n = new l16.k();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f396619d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f396620e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f396621f;

    /* renamed from: g, reason: collision with root package name */
    public int f396622g;

    /* renamed from: h, reason: collision with root package name */
    public byte f396623h;

    /* renamed from: i, reason: collision with root package name */
    public int f396624i;

    static {
        l16.q qVar = new l16.q(true);
        f396617m = qVar;
        qVar.f396620e = java.util.Collections.emptyList();
        qVar.f396621f = java.util.Collections.emptyList();
    }

    public q(p16.p pVar, l16.a aVar) {
        super(pVar);
        this.f396622g = -1;
        this.f396623h = (byte) -1;
        this.f396624i = -1;
        this.f396619d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        for (int i17 = 0; i17 < this.f396620e.size(); i17++) {
            jVar.o(1, (p16.h0) this.f396620e.get(i17));
        }
        if (this.f396621f.size() > 0) {
            jVar.v(42);
            jVar.v(this.f396622g);
        }
        for (int i18 = 0; i18 < this.f396621f.size(); i18++) {
            jVar.n(((java.lang.Integer) this.f396621f.get(i18)).intValue());
        }
        jVar.r(this.f396619d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f396624i;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f396620e.size(); i19++) {
            i18 += p16.j.d(1, (p16.h0) this.f396620e.get(i19));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f396621f.size(); i28++) {
            i27 += p16.j.c(((java.lang.Integer) this.f396621f.get(i28)).intValue());
        }
        int i29 = i18 + i27;
        if (!this.f396621f.isEmpty()) {
            i29 = i29 + 1 + p16.j.c(i27);
        }
        this.f396622g = i27;
        int mo157707x35e001 = i29 + this.f396619d.mo157707x35e001();
        this.f396624i = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f396623h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f396623h = (byte) 1;
        return true;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new l16.l();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        l16.l lVar = new l16.l();
        lVar.d(this);
        return lVar;
    }

    public q(boolean z17) {
        this.f396622g = -1;
        this.f396623h = (byte) -1;
        this.f396624i = -1;
        this.f396619d = p16.g.f432816d;
    }

    public q(p16.h hVar, p16.l lVar, l16.a aVar) {
        this.f396622g = -1;
        this.f396623h = (byte) -1;
        this.f396624i = -1;
        this.f396620e = java.util.Collections.emptyList();
        this.f396621f = java.util.Collections.emptyList();
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 10) {
                            if ((i17 & 1) != 1) {
                                this.f396620e = new java.util.ArrayList();
                                i17 |= 1;
                            }
                            this.f396620e.add(hVar.g(l16.p.f396604t, lVar));
                        } else if (n17 == 40) {
                            if ((i17 & 2) != 2) {
                                this.f396621f = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            this.f396621f.add(java.lang.Integer.valueOf(hVar.k()));
                        } else if (n17 != 42) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            int d17 = hVar.d(hVar.k());
                            if ((i17 & 2) != 2 && hVar.b() > 0) {
                                this.f396621f = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            while (hVar.b() > 0) {
                                this.f396621f.add(java.lang.Integer.valueOf(hVar.k()));
                            }
                            hVar.c(d17);
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    if ((i17 & 1) == 1) {
                        this.f396620e = java.util.Collections.unmodifiableList(this.f396620e);
                    }
                    if ((i17 & 2) == 2) {
                        this.f396621f = java.util.Collections.unmodifiableList(this.f396621f);
                    }
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                        throw th6;
                    } finally {
                    }
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
        if ((i17 & 1) == 1) {
            this.f396620e = java.util.Collections.unmodifiableList(this.f396620e);
        }
        if ((i17 & 2) == 2) {
            this.f396621f = java.util.Collections.unmodifiableList(this.f396621f);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
