package l16;

/* loaded from: classes16.dex */
public final class g extends p16.v implements p16.i0 {

    /* renamed from: m, reason: collision with root package name */
    public static final l16.g f396563m;

    /* renamed from: n, reason: collision with root package name */
    public static final p16.j0 f396564n = new l16.e();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f396565d;

    /* renamed from: e, reason: collision with root package name */
    public int f396566e;

    /* renamed from: f, reason: collision with root package name */
    public int f396567f;

    /* renamed from: g, reason: collision with root package name */
    public int f396568g;

    /* renamed from: h, reason: collision with root package name */
    public byte f396569h;

    /* renamed from: i, reason: collision with root package name */
    public int f396570i;

    static {
        l16.g gVar = new l16.g(true);
        f396563m = gVar;
        gVar.f396567f = 0;
        gVar.f396568g = 0;
    }

    public g(p16.p pVar, l16.a aVar) {
        super(pVar);
        this.f396569h = (byte) -1;
        this.f396570i = -1;
        this.f396565d = pVar.f432870d;
    }

    public static l16.f d(l16.g gVar) {
        l16.f fVar = new l16.f();
        fVar.d(gVar);
        return fVar;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        if ((this.f396566e & 1) == 1) {
            jVar.m(1, this.f396567f);
        }
        if ((this.f396566e & 2) == 2) {
            jVar.m(2, this.f396568g);
        }
        jVar.r(this.f396565d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f396570i;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f396566e & 1) == 1 ? 0 + p16.j.b(1, this.f396567f) : 0;
        if ((this.f396566e & 2) == 2) {
            b17 += p16.j.b(2, this.f396568g);
        }
        int mo157707x35e001 = b17 + this.f396565d.mo157707x35e001();
        this.f396570i = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f396569h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f396569h = (byte) 1;
        return true;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new l16.f();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        return d(this);
    }

    public g(boolean z17) {
        this.f396569h = (byte) -1;
        this.f396570i = -1;
        this.f396565d = p16.g.f432816d;
    }

    public g(p16.h hVar, p16.l lVar, l16.a aVar) {
        this.f396569h = (byte) -1;
        this.f396570i = -1;
        boolean z17 = false;
        this.f396567f = 0;
        this.f396568g = 0;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f396566e |= 1;
                            this.f396567f = hVar.k();
                        } else if (n17 != 16) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            this.f396566e |= 2;
                            this.f396568g = hVar.k();
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th7) {
                        this.f396565d = m17.c();
                        throw th7;
                    }
                    this.f396565d = m17.c();
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
            this.f396565d = m17.c();
            throw th8;
        }
        this.f396565d = m17.c();
    }
}
