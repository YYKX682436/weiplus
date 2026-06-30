package l16;

/* loaded from: classes16.dex */
public final class d extends p16.v implements p16.i0 {

    /* renamed from: m, reason: collision with root package name */
    public static final l16.d f396552m;

    /* renamed from: n, reason: collision with root package name */
    public static final p16.j0 f396553n = new l16.b();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f396554d;

    /* renamed from: e, reason: collision with root package name */
    public int f396555e;

    /* renamed from: f, reason: collision with root package name */
    public int f396556f;

    /* renamed from: g, reason: collision with root package name */
    public int f396557g;

    /* renamed from: h, reason: collision with root package name */
    public byte f396558h;

    /* renamed from: i, reason: collision with root package name */
    public int f396559i;

    static {
        l16.d dVar = new l16.d(true);
        f396552m = dVar;
        dVar.f396556f = 0;
        dVar.f396557g = 0;
    }

    public d(p16.p pVar, l16.a aVar) {
        super(pVar);
        this.f396558h = (byte) -1;
        this.f396559i = -1;
        this.f396554d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        if ((this.f396555e & 1) == 1) {
            jVar.m(1, this.f396556f);
        }
        if ((this.f396555e & 2) == 2) {
            jVar.m(2, this.f396557g);
        }
        jVar.r(this.f396554d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f396559i;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f396555e & 1) == 1 ? 0 + p16.j.b(1, this.f396556f) : 0;
        if ((this.f396555e & 2) == 2) {
            b17 += p16.j.b(2, this.f396557g);
        }
        int mo157707x35e001 = b17 + this.f396554d.mo157707x35e001();
        this.f396559i = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f396558h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f396558h = (byte) 1;
        return true;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new l16.c();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        l16.c cVar = new l16.c();
        cVar.d(this);
        return cVar;
    }

    public d(boolean z17) {
        this.f396558h = (byte) -1;
        this.f396559i = -1;
        this.f396554d = p16.g.f432816d;
    }

    public d(p16.h hVar, p16.l lVar, l16.a aVar) {
        this.f396558h = (byte) -1;
        this.f396559i = -1;
        boolean z17 = false;
        this.f396556f = 0;
        this.f396557g = 0;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f396555e |= 1;
                            this.f396556f = hVar.k();
                        } else if (n17 != 16) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            this.f396555e |= 2;
                            this.f396557g = hVar.k();
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th7) {
                        this.f396554d = m17.c();
                        throw th7;
                    }
                    this.f396554d = m17.c();
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
            this.f396554d = m17.c();
            throw th8;
        }
        this.f396554d = m17.c();
    }
}
