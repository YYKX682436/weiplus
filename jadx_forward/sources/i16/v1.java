package i16;

/* loaded from: classes16.dex */
public final class v1 extends p16.v implements p16.i0 {

    /* renamed from: m, reason: collision with root package name */
    public static final i16.v1 f369316m;

    /* renamed from: n, reason: collision with root package name */
    public static final p16.j0 f369317n = new i16.t1();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f369318d;

    /* renamed from: e, reason: collision with root package name */
    public int f369319e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f369320f;

    /* renamed from: g, reason: collision with root package name */
    public int f369321g;

    /* renamed from: h, reason: collision with root package name */
    public byte f369322h;

    /* renamed from: i, reason: collision with root package name */
    public int f369323i;

    static {
        i16.v1 v1Var = new i16.v1(true);
        f369316m = v1Var;
        v1Var.f369320f = java.util.Collections.emptyList();
        v1Var.f369321g = -1;
    }

    public v1(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f369322h = (byte) -1;
        this.f369323i = -1;
        this.f369318d = pVar.f432870d;
    }

    public static i16.u1 d(i16.v1 v1Var) {
        i16.u1 u1Var = new i16.u1();
        u1Var.d(v1Var);
        return u1Var;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        for (int i17 = 0; i17 < this.f369320f.size(); i17++) {
            jVar.o(1, (p16.h0) this.f369320f.get(i17));
        }
        if ((this.f369319e & 1) == 1) {
            jVar.m(2, this.f369321g);
        }
        jVar.r(this.f369318d);
    }

    public i16.u1 e() {
        return d(this);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369323i;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f369320f.size(); i19++) {
            i18 += p16.j.d(1, (p16.h0) this.f369320f.get(i19));
        }
        if ((this.f369319e & 1) == 1) {
            i18 += p16.j.b(2, this.f369321g);
        }
        int mo157707x35e001 = i18 + this.f369318d.mo157707x35e001();
        this.f369323i = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369322h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f369320f.size(); i17++) {
            if (!((i16.l1) this.f369320f.get(i17)).mo134563xf582434a()) {
                this.f369322h = (byte) 0;
                return false;
            }
        }
        this.f369322h = (byte) 1;
        return true;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.u1();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        return d(this);
    }

    public v1(boolean z17) {
        this.f369322h = (byte) -1;
        this.f369323i = -1;
        this.f369318d = p16.g.f432816d;
    }

    public v1(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f369322h = (byte) -1;
        this.f369323i = -1;
        this.f369320f = java.util.Collections.emptyList();
        this.f369321g = -1;
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 10) {
                            if (!(z18 & true)) {
                                this.f369320f = new java.util.ArrayList();
                                z18 |= true;
                            }
                            this.f369320f.add(hVar.g(i16.l1.A, lVar));
                        } else if (n17 != 16) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            this.f369319e |= 1;
                            this.f369321g = hVar.k();
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
                if (z18 & true) {
                    this.f369320f = java.util.Collections.unmodifiableList(this.f369320f);
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
            this.f369320f = java.util.Collections.unmodifiableList(this.f369320f);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
