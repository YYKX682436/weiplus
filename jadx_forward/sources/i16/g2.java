package i16;

/* loaded from: classes16.dex */
public final class g2 extends p16.v implements p16.i0 {

    /* renamed from: h, reason: collision with root package name */
    public static final i16.g2 f368997h;

    /* renamed from: i, reason: collision with root package name */
    public static final p16.j0 f368998i = new i16.e2();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f368999d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f369000e;

    /* renamed from: f, reason: collision with root package name */
    public byte f369001f;

    /* renamed from: g, reason: collision with root package name */
    public int f369002g;

    static {
        i16.g2 g2Var = new i16.g2(true);
        f368997h = g2Var;
        g2Var.f369000e = java.util.Collections.emptyList();
    }

    public g2(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f369001f = (byte) -1;
        this.f369002g = -1;
        this.f368999d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        for (int i17 = 0; i17 < this.f369000e.size(); i17++) {
            jVar.o(1, (p16.h0) this.f369000e.get(i17));
        }
        jVar.r(this.f368999d);
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369002g;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f369000e.size(); i19++) {
            i18 += p16.j.d(1, (p16.h0) this.f369000e.get(i19));
        }
        int mo157707x35e001 = i18 + this.f368999d.mo157707x35e001();
        this.f369002g = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369001f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f369001f = (byte) 1;
        return true;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.f2();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.f2 f2Var = new i16.f2();
        f2Var.d(this);
        return f2Var;
    }

    public g2(boolean z17) {
        this.f369001f = (byte) -1;
        this.f369002g = -1;
        this.f368999d = p16.g.f432816d;
    }

    public g2(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f369001f = (byte) -1;
        this.f369002g = -1;
        this.f369000e = java.util.Collections.emptyList();
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
                                this.f369000e = new java.util.ArrayList();
                                z18 |= true;
                            }
                            this.f369000e.add(hVar.g(i16.d2.f368925r, lVar));
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
                    this.f369000e = java.util.Collections.unmodifiableList(this.f369000e);
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
            this.f369000e = java.util.Collections.unmodifiableList(this.f369000e);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
