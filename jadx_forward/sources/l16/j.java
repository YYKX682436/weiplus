package l16;

/* loaded from: classes16.dex */
public final class j extends p16.v implements p16.i0 {

    /* renamed from: p, reason: collision with root package name */
    public static final l16.j f396577p;

    /* renamed from: q, reason: collision with root package name */
    public static final p16.j0 f396578q = new l16.h();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f396579d;

    /* renamed from: e, reason: collision with root package name */
    public int f396580e;

    /* renamed from: f, reason: collision with root package name */
    public l16.d f396581f;

    /* renamed from: g, reason: collision with root package name */
    public l16.g f396582g;

    /* renamed from: h, reason: collision with root package name */
    public l16.g f396583h;

    /* renamed from: i, reason: collision with root package name */
    public l16.g f396584i;

    /* renamed from: m, reason: collision with root package name */
    public l16.g f396585m;

    /* renamed from: n, reason: collision with root package name */
    public byte f396586n;

    /* renamed from: o, reason: collision with root package name */
    public int f396587o;

    static {
        l16.j jVar = new l16.j(true);
        f396577p = jVar;
        jVar.f396581f = l16.d.f396552m;
        l16.g gVar = l16.g.f396563m;
        jVar.f396582g = gVar;
        jVar.f396583h = gVar;
        jVar.f396584i = gVar;
        jVar.f396585m = gVar;
    }

    public j(p16.p pVar, l16.a aVar) {
        super(pVar);
        this.f396586n = (byte) -1;
        this.f396587o = -1;
        this.f396579d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        if ((this.f396580e & 1) == 1) {
            jVar.o(1, this.f396581f);
        }
        if ((this.f396580e & 2) == 2) {
            jVar.o(2, this.f396582g);
        }
        if ((this.f396580e & 4) == 4) {
            jVar.o(3, this.f396583h);
        }
        if ((this.f396580e & 8) == 8) {
            jVar.o(4, this.f396584i);
        }
        if ((this.f396580e & 16) == 16) {
            jVar.o(5, this.f396585m);
        }
        jVar.r(this.f396579d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f396587o;
        if (i17 != -1) {
            return i17;
        }
        int d17 = (this.f396580e & 1) == 1 ? 0 + p16.j.d(1, this.f396581f) : 0;
        if ((this.f396580e & 2) == 2) {
            d17 += p16.j.d(2, this.f396582g);
        }
        if ((this.f396580e & 4) == 4) {
            d17 += p16.j.d(3, this.f396583h);
        }
        if ((this.f396580e & 8) == 8) {
            d17 += p16.j.d(4, this.f396584i);
        }
        if ((this.f396580e & 16) == 16) {
            d17 += p16.j.d(5, this.f396585m);
        }
        int mo157707x35e001 = d17 + this.f396579d.mo157707x35e001();
        this.f396587o = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f396586n;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f396586n = (byte) 1;
        return true;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new l16.i();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        l16.i iVar = new l16.i();
        iVar.d(this);
        return iVar;
    }

    public j(boolean z17) {
        this.f396586n = (byte) -1;
        this.f396587o = -1;
        this.f396579d = p16.g.f432816d;
    }

    public j(p16.h hVar, p16.l lVar, l16.a aVar) {
        this.f396586n = (byte) -1;
        this.f396587o = -1;
        this.f396581f = l16.d.f396552m;
        l16.g gVar = l16.g.f396563m;
        this.f396582g = gVar;
        this.f396583h = gVar;
        this.f396584i = gVar;
        this.f396585m = gVar;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int n17 = hVar.n();
                        if (n17 != 0) {
                            l16.f fVar = null;
                            l16.c cVar = null;
                            l16.f fVar2 = null;
                            l16.f fVar3 = null;
                            l16.f fVar4 = null;
                            if (n17 == 10) {
                                if ((this.f396580e & 1) == 1) {
                                    l16.d dVar = this.f396581f;
                                    dVar.getClass();
                                    cVar = new l16.c();
                                    cVar.d(dVar);
                                }
                                l16.d dVar2 = (l16.d) hVar.g(l16.d.f396553n, lVar);
                                this.f396581f = dVar2;
                                if (cVar != null) {
                                    cVar.d(dVar2);
                                    this.f396581f = cVar.c();
                                }
                                this.f396580e |= 1;
                            } else if (n17 == 18) {
                                if ((this.f396580e & 2) == 2) {
                                    l16.g gVar2 = this.f396582g;
                                    gVar2.getClass();
                                    fVar2 = l16.g.d(gVar2);
                                }
                                l16.g gVar3 = (l16.g) hVar.g(l16.g.f396564n, lVar);
                                this.f396582g = gVar3;
                                if (fVar2 != null) {
                                    fVar2.d(gVar3);
                                    this.f396582g = fVar2.c();
                                }
                                this.f396580e |= 2;
                            } else if (n17 == 26) {
                                if ((this.f396580e & 4) == 4) {
                                    l16.g gVar4 = this.f396583h;
                                    gVar4.getClass();
                                    fVar3 = l16.g.d(gVar4);
                                }
                                l16.g gVar5 = (l16.g) hVar.g(l16.g.f396564n, lVar);
                                this.f396583h = gVar5;
                                if (fVar3 != null) {
                                    fVar3.d(gVar5);
                                    this.f396583h = fVar3.c();
                                }
                                this.f396580e |= 4;
                            } else if (n17 == 34) {
                                if ((this.f396580e & 8) == 8) {
                                    l16.g gVar6 = this.f396584i;
                                    gVar6.getClass();
                                    fVar4 = l16.g.d(gVar6);
                                }
                                l16.g gVar7 = (l16.g) hVar.g(l16.g.f396564n, lVar);
                                this.f396584i = gVar7;
                                if (fVar4 != null) {
                                    fVar4.d(gVar7);
                                    this.f396584i = fVar4.c();
                                }
                                this.f396580e |= 8;
                            } else if (n17 != 42) {
                                if (!hVar.q(n17, j17)) {
                                }
                            } else {
                                if ((this.f396580e & 16) == 16) {
                                    l16.g gVar8 = this.f396585m;
                                    gVar8.getClass();
                                    fVar = l16.g.d(gVar8);
                                }
                                l16.g gVar9 = (l16.g) hVar.g(l16.g.f396564n, lVar);
                                this.f396585m = gVar9;
                                if (fVar != null) {
                                    fVar.d(gVar9);
                                    this.f396585m = fVar.c();
                                }
                                this.f396580e |= 16;
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
                    this.f396579d = m17.c();
                    throw th7;
                }
                this.f396579d = m17.c();
                throw th6;
            }
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th8) {
            this.f396579d = m17.c();
            throw th8;
        }
        this.f396579d = m17.c();
    }
}
