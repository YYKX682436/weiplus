package i16;

/* loaded from: classes16.dex */
public final class n0 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f369156g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f369157h = java.util.Collections.emptyList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f369158i = java.util.Collections.emptyList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f369159m = java.util.Collections.emptyList();

    /* renamed from: n, reason: collision with root package name */
    public i16.v1 f369160n = i16.v1.f369316m;

    /* renamed from: o, reason: collision with root package name */
    public i16.g2 f369161o = i16.g2.f368997h;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.o0.f369193r     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.m0 r0 = (i16.m0) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.o0 r2 = (i16.o0) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.o0 r3 = (i16.o0) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r2 = move-exception
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L1e
            r1.e(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i16.n0.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.o0) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.o0 d17 = d();
        if (d17.mo134563xf582434a()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    /* renamed from: clone */
    public java.lang.Object m134620x5a5dd5d() {
        i16.n0 n0Var = new i16.n0();
        n0Var.e(d());
        return n0Var;
    }

    public i16.o0 d() {
        i16.o0 o0Var = new i16.o0(this, null);
        int i17 = this.f369156g;
        if ((i17 & 1) == 1) {
            this.f369157h = java.util.Collections.unmodifiableList(this.f369157h);
            this.f369156g &= -2;
        }
        o0Var.f369196g = this.f369157h;
        if ((this.f369156g & 2) == 2) {
            this.f369158i = java.util.Collections.unmodifiableList(this.f369158i);
            this.f369156g &= -3;
        }
        o0Var.f369197h = this.f369158i;
        if ((this.f369156g & 4) == 4) {
            this.f369159m = java.util.Collections.unmodifiableList(this.f369159m);
            this.f369156g &= -5;
        }
        o0Var.f369198i = this.f369159m;
        int i18 = (i17 & 8) != 8 ? 0 : 1;
        o0Var.f369199m = this.f369160n;
        if ((i17 & 16) == 16) {
            i18 |= 2;
        }
        o0Var.f369200n = this.f369161o;
        o0Var.f369195f = i18;
        return o0Var;
    }

    public i16.n0 e(i16.o0 o0Var) {
        i16.g2 g2Var;
        i16.v1 v1Var;
        if (o0Var == i16.o0.f369192q) {
            return this;
        }
        if (!o0Var.f369196g.isEmpty()) {
            if (this.f369157h.isEmpty()) {
                this.f369157h = o0Var.f369196g;
                this.f369156g &= -2;
            } else {
                if ((this.f369156g & 1) != 1) {
                    this.f369157h = new java.util.ArrayList(this.f369157h);
                    this.f369156g |= 1;
                }
                this.f369157h.addAll(o0Var.f369196g);
            }
        }
        if (!o0Var.f369197h.isEmpty()) {
            if (this.f369158i.isEmpty()) {
                this.f369158i = o0Var.f369197h;
                this.f369156g &= -3;
            } else {
                if ((this.f369156g & 2) != 2) {
                    this.f369158i = new java.util.ArrayList(this.f369158i);
                    this.f369156g |= 2;
                }
                this.f369158i.addAll(o0Var.f369197h);
            }
        }
        if (!o0Var.f369198i.isEmpty()) {
            if (this.f369159m.isEmpty()) {
                this.f369159m = o0Var.f369198i;
                this.f369156g &= -5;
            } else {
                if ((this.f369156g & 4) != 4) {
                    this.f369159m = new java.util.ArrayList(this.f369159m);
                    this.f369156g |= 4;
                }
                this.f369159m.addAll(o0Var.f369198i);
            }
        }
        if ((o0Var.f369195f & 1) == 1) {
            i16.v1 v1Var2 = o0Var.f369199m;
            if ((this.f369156g & 8) != 8 || (v1Var = this.f369160n) == i16.v1.f369316m) {
                this.f369160n = v1Var2;
            } else {
                i16.u1 d17 = i16.v1.d(v1Var);
                d17.d(v1Var2);
                this.f369160n = d17.c();
            }
            this.f369156g |= 8;
        }
        if ((o0Var.f369195f & 2) == 2) {
            i16.g2 g2Var2 = o0Var.f369200n;
            if ((this.f369156g & 16) != 16 || (g2Var = this.f369161o) == i16.g2.f368997h) {
                this.f369161o = g2Var2;
            } else {
                i16.f2 f2Var = new i16.f2();
                f2Var.d(g2Var);
                f2Var.d(g2Var2);
                this.f369161o = f2Var.c();
            }
            this.f369156g |= 16;
        }
        c(o0Var);
        this.f432870d = this.f432870d.e(o0Var.f369194e);
        return this;
    }
}
