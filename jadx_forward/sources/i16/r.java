package i16;

/* loaded from: classes16.dex */
public final class r extends p16.s {

    /* renamed from: o, reason: collision with root package name */
    public static final i16.r f369234o;

    /* renamed from: p, reason: collision with root package name */
    public static final p16.j0 f369235p = new i16.p();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f369236e;

    /* renamed from: f, reason: collision with root package name */
    public int f369237f;

    /* renamed from: g, reason: collision with root package name */
    public int f369238g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f369239h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f369240i;

    /* renamed from: m, reason: collision with root package name */
    public byte f369241m;

    /* renamed from: n, reason: collision with root package name */
    public int f369242n;

    static {
        i16.r rVar = new i16.r(true);
        f369234o = rVar;
        rVar.f369238g = 6;
        rVar.f369239h = java.util.Collections.emptyList();
        rVar.f369240i = java.util.Collections.emptyList();
    }

    public r(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f369241m = (byte) -1;
        this.f369242n = -1;
        this.f369236e = qVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        p16.r i17 = i();
        if ((this.f369237f & 1) == 1) {
            jVar.m(1, this.f369238g);
        }
        for (int i18 = 0; i18 < this.f369239h.size(); i18++) {
            jVar.o(2, (p16.h0) this.f369239h.get(i18));
        }
        for (int i19 = 0; i19 < this.f369240i.size(); i19++) {
            jVar.m(31, ((java.lang.Integer) this.f369240i.get(i19)).intValue());
        }
        i17.a(19000, jVar);
        jVar.r(this.f369236e);
    }

    @Override // p16.i0
    /* renamed from: getDefaultInstanceForType */
    public p16.h0 mo134575x786693c3() {
        return f369234o;
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369242n;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f369237f & 1) == 1 ? p16.j.b(1, this.f369238g) + 0 : 0;
        for (int i18 = 0; i18 < this.f369239h.size(); i18++) {
            b17 += p16.j.d(2, (p16.h0) this.f369239h.get(i18));
        }
        int i19 = 0;
        for (int i27 = 0; i27 < this.f369240i.size(); i27++) {
            i19 += p16.j.c(((java.lang.Integer) this.f369240i.get(i27)).intValue());
        }
        int size = b17 + i19 + (this.f369240i.size() * 2) + e() + this.f369236e.mo157707x35e001();
        this.f369242n = size;
        return size;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369241m;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f369239h.size(); i17++) {
            if (!((i16.y1) this.f369239h.get(i17)).mo134563xf582434a()) {
                this.f369241m = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f369241m = (byte) 1;
            return true;
        }
        this.f369241m = (byte) 0;
        return false;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.q();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.q qVar = new i16.q();
        qVar.e(this);
        return qVar;
    }

    public r(boolean z17) {
        this.f369241m = (byte) -1;
        this.f369242n = -1;
        this.f369236e = p16.g.f432816d;
    }

    public r(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f369241m = (byte) -1;
        this.f369242n = -1;
        this.f369238g = 6;
        this.f369239h = java.util.Collections.emptyList();
        this.f369240i = java.util.Collections.emptyList();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f369237f |= 1;
                            this.f369238g = hVar.k();
                        } else if (n17 == 18) {
                            if ((i17 & 2) != 2) {
                                this.f369239h = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            this.f369239h.add(hVar.g(i16.y1.f369353s, lVar));
                        } else if (n17 == 248) {
                            if ((i17 & 4) != 4) {
                                this.f369240i = new java.util.ArrayList();
                                i17 |= 4;
                            }
                            this.f369240i.add(java.lang.Integer.valueOf(hVar.k()));
                        } else if (n17 != 250) {
                            if (!j(hVar, j17, lVar, n17)) {
                            }
                        } else {
                            int d17 = hVar.d(hVar.k());
                            if ((i17 & 4) != 4 && hVar.b() > 0) {
                                this.f369240i = new java.util.ArrayList();
                                i17 |= 4;
                            }
                            while (hVar.b() > 0) {
                                this.f369240i.add(java.lang.Integer.valueOf(hVar.k()));
                            }
                            hVar.c(d17);
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    if ((i17 & 2) == 2) {
                        this.f369239h = java.util.Collections.unmodifiableList(this.f369239h);
                    }
                    if ((i17 & 4) == 4) {
                        this.f369240i = java.util.Collections.unmodifiableList(this.f369240i);
                    }
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                        this.f369236e = m17.c();
                        h();
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        this.f369236e = m17.c();
                        throw th7;
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
        if ((i17 & 2) == 2) {
            this.f369239h = java.util.Collections.unmodifiableList(this.f369239h);
        }
        if ((i17 & 4) == 4) {
            this.f369240i = java.util.Collections.unmodifiableList(this.f369240i);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
            this.f369236e = m17.c();
            h();
        } catch (java.lang.Throwable th8) {
            this.f369236e = m17.c();
            throw th8;
        }
    }
}
