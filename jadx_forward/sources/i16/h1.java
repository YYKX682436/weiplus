package i16;

/* loaded from: classes16.dex */
public final class h1 extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f369020e;

    /* renamed from: f, reason: collision with root package name */
    public i16.i1 f369021f = i16.i1.INV;

    /* renamed from: g, reason: collision with root package name */
    public i16.l1 f369022g = i16.l1.f369113z;

    /* renamed from: h, reason: collision with root package name */
    public int f369023h;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.j1.f369078o     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.g1 r0 = (i16.g1) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.j1 r2 = (i16.j1) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.j1 r3 = (i16.j1) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r2 = move-exception
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L1e
            r1.d(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i16.h1.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.j1) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.j1 c17 = c();
        if (c17.mo134563xf582434a()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.j1 c() {
        i16.j1 j1Var = new i16.j1(this, null);
        int i17 = this.f369020e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        j1Var.f369081f = this.f369021f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        j1Var.f369082g = this.f369022g;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        j1Var.f369083h = this.f369023h;
        j1Var.f369080e = i18;
        return j1Var;
    }

    /* renamed from: clone */
    public java.lang.Object m134595x5a5dd5d() {
        i16.h1 h1Var = new i16.h1();
        h1Var.d(c());
        return h1Var;
    }

    public i16.h1 d(i16.j1 j1Var) {
        i16.l1 l1Var;
        if (j1Var == i16.j1.f369077n) {
            return this;
        }
        if ((j1Var.f369080e & 1) == 1) {
            i16.i1 i1Var = j1Var.f369081f;
            i1Var.getClass();
            this.f369020e |= 1;
            this.f369021f = i1Var;
        }
        if ((j1Var.f369080e & 2) == 2) {
            i16.l1 l1Var2 = j1Var.f369082g;
            if ((this.f369020e & 2) != 2 || (l1Var = this.f369022g) == i16.l1.f369113z) {
                this.f369022g = l1Var2;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var);
                m17.b(l1Var2);
                this.f369022g = m17.d();
            }
            this.f369020e |= 2;
        }
        if ((j1Var.f369080e & 4) == 4) {
            int i17 = j1Var.f369083h;
            this.f369020e |= 4;
            this.f369023h = i17;
        }
        this.f432870d = this.f432870d.e(j1Var.f369079d);
        return this;
    }
}
