package i16;

/* loaded from: classes16.dex */
public final class q0 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f369222g;

    /* renamed from: h, reason: collision with root package name */
    public i16.e1 f369223h = i16.e1.f368944h;

    /* renamed from: i, reason: collision with root package name */
    public i16.b1 f369224i = i16.b1.f368896h;

    /* renamed from: m, reason: collision with root package name */
    public i16.o0 f369225m = i16.o0.f369192q;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f369226n = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.r0.f369244q     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.p0 r0 = (i16.p0) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.r0 r2 = (i16.r0) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.r0 r3 = (i16.r0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.q0.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.r0) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.r0 d17 = d();
        if (d17.mo134563xf582434a()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    /* renamed from: clone */
    public java.lang.Object m134626x5a5dd5d() {
        i16.q0 q0Var = new i16.q0();
        q0Var.e(d());
        return q0Var;
    }

    public i16.r0 d() {
        i16.r0 r0Var = new i16.r0(this, null);
        int i17 = this.f369222g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        r0Var.f369247g = this.f369223h;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        r0Var.f369248h = this.f369224i;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        r0Var.f369249i = this.f369225m;
        if ((i17 & 8) == 8) {
            this.f369226n = java.util.Collections.unmodifiableList(this.f369226n);
            this.f369222g &= -9;
        }
        r0Var.f369250m = this.f369226n;
        r0Var.f369246f = i18;
        return r0Var;
    }

    public i16.q0 e(i16.r0 r0Var) {
        i16.o0 o0Var;
        i16.b1 b1Var;
        i16.e1 e1Var;
        if (r0Var == i16.r0.f369243p) {
            return this;
        }
        if ((r0Var.f369246f & 1) == 1) {
            i16.e1 e1Var2 = r0Var.f369247g;
            if ((this.f369222g & 1) != 1 || (e1Var = this.f369223h) == i16.e1.f368944h) {
                this.f369223h = e1Var2;
            } else {
                i16.d1 d1Var = new i16.d1();
                d1Var.d(e1Var);
                d1Var.d(e1Var2);
                this.f369223h = d1Var.c();
            }
            this.f369222g |= 1;
        }
        if ((r0Var.f369246f & 2) == 2) {
            i16.b1 b1Var2 = r0Var.f369248h;
            if ((this.f369222g & 2) != 2 || (b1Var = this.f369224i) == i16.b1.f368896h) {
                this.f369224i = b1Var2;
            } else {
                i16.w0 w0Var = new i16.w0();
                w0Var.d(b1Var);
                w0Var.d(b1Var2);
                this.f369224i = w0Var.c();
            }
            this.f369222g |= 2;
        }
        if ((r0Var.f369246f & 4) == 4) {
            i16.o0 o0Var2 = r0Var.f369249i;
            if ((this.f369222g & 4) != 4 || (o0Var = this.f369225m) == i16.o0.f369192q) {
                this.f369225m = o0Var2;
            } else {
                i16.n0 n0Var = new i16.n0();
                n0Var.e(o0Var);
                n0Var.e(o0Var2);
                this.f369225m = n0Var.d();
            }
            this.f369222g |= 4;
        }
        if (!r0Var.f369250m.isEmpty()) {
            if (this.f369226n.isEmpty()) {
                this.f369226n = r0Var.f369250m;
                this.f369222g &= -9;
            } else {
                if ((this.f369222g & 8) != 8) {
                    this.f369226n = new java.util.ArrayList(this.f369226n);
                    this.f369222g |= 8;
                }
                this.f369226n.addAll(r0Var.f369250m);
            }
        }
        c(r0Var);
        this.f432870d = this.f432870d.e(r0Var.f369245e);
        return this;
    }
}
