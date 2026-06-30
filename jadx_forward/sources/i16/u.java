package i16;

/* loaded from: classes16.dex */
public final class u extends p16.v implements p16.i0 {

    /* renamed from: h, reason: collision with root package name */
    public static final i16.u f369288h;

    /* renamed from: i, reason: collision with root package name */
    public static final p16.j0 f369289i = new i16.s();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f369290d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f369291e;

    /* renamed from: f, reason: collision with root package name */
    public byte f369292f;

    /* renamed from: g, reason: collision with root package name */
    public int f369293g;

    static {
        i16.u uVar = new i16.u(true);
        f369288h = uVar;
        uVar.f369291e = java.util.Collections.emptyList();
    }

    public u(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f369292f = (byte) -1;
        this.f369293g = -1;
        this.f369290d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        for (int i17 = 0; i17 < this.f369291e.size(); i17++) {
            jVar.o(1, (p16.h0) this.f369291e.get(i17));
        }
        jVar.r(this.f369290d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369293g;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f369291e.size(); i19++) {
            i18 += p16.j.d(1, (p16.h0) this.f369291e.get(i19));
        }
        int mo157707x35e001 = i18 + this.f369290d.mo157707x35e001();
        this.f369293g = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369292f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f369291e.size(); i17++) {
            if (!((i16.z) this.f369291e.get(i17)).mo134563xf582434a()) {
                this.f369292f = (byte) 0;
                return false;
            }
        }
        this.f369292f = (byte) 1;
        return true;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.t();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.t tVar = new i16.t();
        tVar.d(this);
        return tVar;
    }

    public u(boolean z17) {
        this.f369292f = (byte) -1;
        this.f369293g = -1;
        this.f369290d = p16.g.f432816d;
    }

    public u(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f369292f = (byte) -1;
        this.f369293g = -1;
        this.f369291e = java.util.Collections.emptyList();
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 != 10) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            if (!(z18 & true)) {
                                this.f369291e = new java.util.ArrayList();
                                z18 |= true;
                            }
                            this.f369291e.add(hVar.g(i16.z.f369365p, lVar));
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
                    this.f369291e = java.util.Collections.unmodifiableList(this.f369291e);
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
            this.f369291e = java.util.Collections.unmodifiableList(this.f369291e);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
