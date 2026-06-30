package i16;

/* loaded from: classes16.dex */
public final class y0 extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f369348e;

    /* renamed from: g, reason: collision with root package name */
    public int f369350g;

    /* renamed from: f, reason: collision with root package name */
    public int f369349f = -1;

    /* renamed from: h, reason: collision with root package name */
    public i16.z0 f369351h = i16.z0.PACKAGE;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.a1.f368879o     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.x0 r0 = (i16.x0) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.a1 r2 = (i16.a1) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.a1 r3 = (i16.a1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.y0.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.a1) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.a1 c17 = c();
        if (c17.mo134563xf582434a()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.a1 c() {
        i16.a1 a1Var = new i16.a1(this, null);
        int i17 = this.f369348e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        a1Var.f368882f = this.f369349f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        a1Var.f368883g = this.f369350g;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        a1Var.f368884h = this.f369351h;
        a1Var.f368881e = i18;
        return a1Var;
    }

    /* renamed from: clone */
    public java.lang.Object m134649x5a5dd5d() {
        i16.y0 y0Var = new i16.y0();
        y0Var.d(c());
        return y0Var;
    }

    public i16.y0 d(i16.a1 a1Var) {
        if (a1Var == i16.a1.f368878n) {
            return this;
        }
        int i17 = a1Var.f368881e;
        if ((i17 & 1) == 1) {
            int i18 = a1Var.f368882f;
            this.f369348e |= 1;
            this.f369349f = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = a1Var.f368883g;
            this.f369348e = 2 | this.f369348e;
            this.f369350g = i19;
        }
        if ((i17 & 4) == 4) {
            i16.z0 z0Var = a1Var.f368884h;
            z0Var.getClass();
            this.f369348e = 4 | this.f369348e;
            this.f369351h = z0Var;
        }
        this.f432870d = this.f432870d.e(a1Var.f368880d);
        return this;
    }
}
