package i16;

/* loaded from: classes16.dex */
public final class k extends p16.v implements p16.i0 {

    /* renamed from: m, reason: collision with root package name */
    public static final i16.k f369086m;

    /* renamed from: n, reason: collision with root package name */
    public static final p16.j0 f369087n = new i16.b();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f369088d;

    /* renamed from: e, reason: collision with root package name */
    public int f369089e;

    /* renamed from: f, reason: collision with root package name */
    public int f369090f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f369091g;

    /* renamed from: h, reason: collision with root package name */
    public byte f369092h;

    /* renamed from: i, reason: collision with root package name */
    public int f369093i;

    static {
        i16.k kVar = new i16.k(true);
        f369086m = kVar;
        kVar.f369090f = 0;
        kVar.f369091g = java.util.Collections.emptyList();
    }

    public k(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f369092h = (byte) -1;
        this.f369093i = -1;
        this.f369088d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        if ((this.f369089e & 1) == 1) {
            jVar.m(1, this.f369090f);
        }
        for (int i17 = 0; i17 < this.f369091g.size(); i17++) {
            jVar.o(2, (p16.h0) this.f369091g.get(i17));
        }
        jVar.r(this.f369088d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369093i;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f369089e & 1) == 1 ? p16.j.b(1, this.f369090f) + 0 : 0;
        for (int i18 = 0; i18 < this.f369091g.size(); i18++) {
            b17 += p16.j.d(2, (p16.h0) this.f369091g.get(i18));
        }
        int mo157707x35e001 = b17 + this.f369088d.mo157707x35e001();
        this.f369093i = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369092h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!((this.f369089e & 1) == 1)) {
            this.f369092h = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.f369091g.size(); i17++) {
            if (!((i16.i) this.f369091g.get(i17)).mo134563xf582434a()) {
                this.f369092h = (byte) 0;
                return false;
            }
        }
        this.f369092h = (byte) 1;
        return true;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.j();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.j jVar = new i16.j();
        jVar.d(this);
        return jVar;
    }

    public k(boolean z17) {
        this.f369092h = (byte) -1;
        this.f369093i = -1;
        this.f369088d = p16.g.f432816d;
    }

    public k(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f369092h = (byte) -1;
        this.f369093i = -1;
        boolean z17 = false;
        this.f369090f = 0;
        this.f369091g = java.util.Collections.emptyList();
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f369089e |= 1;
                            this.f369090f = hVar.k();
                        } else if (n17 != 18) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            if ((i17 & 2) != 2) {
                                this.f369091g = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            this.f369091g.add(hVar.g(i16.i.f369027n, lVar));
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
                if ((i17 & 2) == 2) {
                    this.f369091g = java.util.Collections.unmodifiableList(this.f369091g);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                    throw th6;
                } finally {
                }
            }
        }
        if ((i17 & 2) == 2) {
            this.f369091g = java.util.Collections.unmodifiableList(this.f369091g);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
