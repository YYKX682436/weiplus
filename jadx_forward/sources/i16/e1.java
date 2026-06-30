package i16;

/* loaded from: classes16.dex */
public final class e1 extends p16.v implements p16.i0 {

    /* renamed from: h, reason: collision with root package name */
    public static final i16.e1 f368944h;

    /* renamed from: i, reason: collision with root package name */
    public static final p16.j0 f368945i = new i16.c1();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f368946d;

    /* renamed from: e, reason: collision with root package name */
    public p16.c0 f368947e;

    /* renamed from: f, reason: collision with root package name */
    public byte f368948f;

    /* renamed from: g, reason: collision with root package name */
    public int f368949g;

    static {
        i16.e1 e1Var = new i16.e1(true);
        f368944h = e1Var;
        e1Var.f368947e = p16.b0.f432803e;
    }

    public e1(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f368948f = (byte) -1;
        this.f368949g = -1;
        this.f368946d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        for (int i17 = 0; i17 < this.f368947e.size(); i17++) {
            p16.g f17 = this.f368947e.f(i17);
            jVar.x(1, 2);
            jVar.v(f17.mo157707x35e001());
            jVar.r(f17);
        }
        jVar.r(this.f368946d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f368949g;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f368947e.size(); i19++) {
            p16.g f17 = this.f368947e.f(i19);
            i18 += p16.j.f(f17.mo157707x35e001()) + f17.mo157707x35e001();
        }
        int size = 0 + i18 + (this.f368947e.size() * 1) + this.f368946d.mo157707x35e001();
        this.f368949g = size;
        return size;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f368948f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f368948f = (byte) 1;
        return true;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.d1();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.d1 d1Var = new i16.d1();
        d1Var.d(this);
        return d1Var;
    }

    public e1(boolean z17) {
        this.f368948f = (byte) -1;
        this.f368949g = -1;
        this.f368946d = p16.g.f432816d;
    }

    public e1(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f368948f = (byte) -1;
        this.f368949g = -1;
        this.f368947e = p16.b0.f432803e;
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int n17 = hVar.n();
                        if (n17 != 0) {
                            if (n17 != 10) {
                                if (!hVar.q(n17, j17)) {
                                }
                            } else {
                                p16.g e17 = hVar.e();
                                if (!(z18 & true)) {
                                    this.f368947e = new p16.b0();
                                    z18 |= true;
                                }
                                this.f368947e.z(e17);
                            }
                        }
                        z17 = true;
                    } catch (java.io.IOException e18) {
                        p16.z zVar = new p16.z(e18.getMessage());
                        zVar.f432904d = this;
                        throw zVar;
                    }
                } catch (p16.z e19) {
                    e19.f432904d = this;
                    throw e19;
                }
            } catch (java.lang.Throwable th6) {
                if (z18 & true) {
                    this.f368947e = this.f368947e.b();
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                    throw th6;
                } finally {
                }
            }
        }
        if (z18 & true) {
            this.f368947e = this.f368947e.b();
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
