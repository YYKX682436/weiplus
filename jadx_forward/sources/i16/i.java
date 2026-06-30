package i16;

/* loaded from: classes16.dex */
public final class i extends p16.v implements p16.i0 {

    /* renamed from: m, reason: collision with root package name */
    public static final i16.i f369026m;

    /* renamed from: n, reason: collision with root package name */
    public static final p16.j0 f369027n = new i16.c();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f369028d;

    /* renamed from: e, reason: collision with root package name */
    public int f369029e;

    /* renamed from: f, reason: collision with root package name */
    public int f369030f;

    /* renamed from: g, reason: collision with root package name */
    public i16.h f369031g;

    /* renamed from: h, reason: collision with root package name */
    public byte f369032h;

    /* renamed from: i, reason: collision with root package name */
    public int f369033i;

    static {
        i16.i iVar = new i16.i(true);
        f369026m = iVar;
        iVar.f369030f = 0;
        iVar.f369031g = i16.h.f369003v;
    }

    public i(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f369032h = (byte) -1;
        this.f369033i = -1;
        this.f369028d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        if ((this.f369029e & 1) == 1) {
            jVar.m(1, this.f369030f);
        }
        if ((this.f369029e & 2) == 2) {
            jVar.o(2, this.f369031g);
        }
        jVar.r(this.f369028d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369033i;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f369029e & 1) == 1 ? 0 + p16.j.b(1, this.f369030f) : 0;
        if ((this.f369029e & 2) == 2) {
            b17 += p16.j.d(2, this.f369031g);
        }
        int mo157707x35e001 = b17 + this.f369028d.mo157707x35e001();
        this.f369033i = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369032h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        int i17 = this.f369029e;
        if (!((i17 & 1) == 1)) {
            this.f369032h = (byte) 0;
            return false;
        }
        if (!((i17 & 2) == 2)) {
            this.f369032h = (byte) 0;
            return false;
        }
        if (this.f369031g.mo134563xf582434a()) {
            this.f369032h = (byte) 1;
            return true;
        }
        this.f369032h = (byte) 0;
        return false;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.d();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.d dVar = new i16.d();
        dVar.d(this);
        return dVar;
    }

    public i(boolean z17) {
        this.f369032h = (byte) -1;
        this.f369033i = -1;
        this.f369028d = p16.g.f432816d;
    }

    public i(p16.h hVar, p16.l lVar, i16.a aVar) {
        i16.f fVar;
        this.f369032h = (byte) -1;
        this.f369033i = -1;
        boolean z17 = false;
        this.f369030f = 0;
        this.f369031g = i16.h.f369003v;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    try {
                        int n17 = hVar.n();
                        if (n17 != 0) {
                            if (n17 == 8) {
                                this.f369029e |= 1;
                                this.f369030f = hVar.k();
                            } else if (n17 != 18) {
                                if (!hVar.q(n17, j17)) {
                                }
                            } else {
                                if ((this.f369029e & 2) == 2) {
                                    i16.h hVar2 = this.f369031g;
                                    hVar2.getClass();
                                    fVar = new i16.f();
                                    fVar.d(hVar2);
                                } else {
                                    fVar = null;
                                }
                                i16.h hVar3 = (i16.h) hVar.g(i16.h.f369004w, lVar);
                                this.f369031g = hVar3;
                                if (fVar != null) {
                                    fVar.d(hVar3);
                                    this.f369031g = fVar.c();
                                }
                                this.f369029e |= 2;
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
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                } catch (java.lang.Throwable th7) {
                    this.f369028d = m17.c();
                    throw th7;
                }
                this.f369028d = m17.c();
                throw th6;
            }
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th8) {
            this.f369028d = m17.c();
            throw th8;
        }
        this.f369028d = m17.c();
    }
}
