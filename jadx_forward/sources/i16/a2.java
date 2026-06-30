package i16;

/* loaded from: classes16.dex */
public final class a2 extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f368887e;

    /* renamed from: f, reason: collision with root package name */
    public int f368888f;

    /* renamed from: g, reason: collision with root package name */
    public int f368889g;

    /* renamed from: i, reason: collision with root package name */
    public int f368891i;

    /* renamed from: m, reason: collision with root package name */
    public int f368892m;

    /* renamed from: h, reason: collision with root package name */
    public i16.b2 f368890h = i16.b2.ERROR;

    /* renamed from: n, reason: collision with root package name */
    public i16.c2 f368893n = i16.c2.LANGUAGE_VERSION;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.d2.f368925r     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.z1 r0 = (i16.z1) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.d2 r2 = (i16.d2) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.d2 r3 = (i16.d2) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.a2.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.d2) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.d2 c17 = c();
        if (c17.mo134563xf582434a()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.d2 c() {
        i16.d2 d2Var = new i16.d2(this, null);
        int i17 = this.f368887e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        d2Var.f368928f = this.f368888f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        d2Var.f368929g = this.f368889g;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        d2Var.f368930h = this.f368890h;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        d2Var.f368931i = this.f368891i;
        if ((i17 & 16) == 16) {
            i18 |= 16;
        }
        d2Var.f368932m = this.f368892m;
        if ((i17 & 32) == 32) {
            i18 |= 32;
        }
        d2Var.f368933n = this.f368893n;
        d2Var.f368927e = i18;
        return d2Var;
    }

    /* renamed from: clone */
    public java.lang.Object m134567x5a5dd5d() {
        i16.a2 a2Var = new i16.a2();
        a2Var.d(c());
        return a2Var;
    }

    public i16.a2 d(i16.d2 d2Var) {
        if (d2Var == i16.d2.f368924q) {
            return this;
        }
        int i17 = d2Var.f368927e;
        if ((i17 & 1) == 1) {
            int i18 = d2Var.f368928f;
            this.f368887e |= 1;
            this.f368888f = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = d2Var.f368929g;
            this.f368887e = 2 | this.f368887e;
            this.f368889g = i19;
        }
        if ((i17 & 4) == 4) {
            i16.b2 b2Var = d2Var.f368930h;
            b2Var.getClass();
            this.f368887e = 4 | this.f368887e;
            this.f368890h = b2Var;
        }
        int i27 = d2Var.f368927e;
        if ((i27 & 8) == 8) {
            int i28 = d2Var.f368931i;
            this.f368887e = 8 | this.f368887e;
            this.f368891i = i28;
        }
        if ((i27 & 16) == 16) {
            int i29 = d2Var.f368932m;
            this.f368887e = 16 | this.f368887e;
            this.f368892m = i29;
        }
        if ((i27 & 32) == 32) {
            i16.c2 c2Var = d2Var.f368933n;
            c2Var.getClass();
            this.f368887e = 32 | this.f368887e;
            this.f368893n = c2Var;
        }
        this.f432870d = this.f432870d.e(d2Var.f368926d);
        return this;
    }
}
