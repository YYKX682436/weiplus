package i16;

/* loaded from: classes16.dex */
public final class w0 extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f369329e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f369330f = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.b1.f368897i     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.v0 r0 = (i16.v0) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.b1 r2 = (i16.b1) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.b1 r3 = (i16.b1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.w0.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.b1) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.b1 c17 = c();
        if (c17.mo134563xf582434a()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.b1 c() {
        i16.b1 b1Var = new i16.b1(this, null);
        if ((this.f369329e & 1) == 1) {
            this.f369330f = java.util.Collections.unmodifiableList(this.f369330f);
            this.f369329e &= -2;
        }
        b1Var.f368899e = this.f369330f;
        return b1Var;
    }

    /* renamed from: clone */
    public java.lang.Object m134641x5a5dd5d() {
        i16.w0 w0Var = new i16.w0();
        w0Var.d(c());
        return w0Var;
    }

    public i16.w0 d(i16.b1 b1Var) {
        if (b1Var == i16.b1.f368896h) {
            return this;
        }
        if (!b1Var.f368899e.isEmpty()) {
            if (this.f369330f.isEmpty()) {
                this.f369330f = b1Var.f368899e;
                this.f369329e &= -2;
            } else {
                if ((this.f369329e & 1) != 1) {
                    this.f369330f = new java.util.ArrayList(this.f369330f);
                    this.f369329e |= 1;
                }
                this.f369330f.addAll(b1Var.f368899e);
            }
        }
        this.f432870d = this.f432870d.e(b1Var.f368898d);
        return this;
    }
}
