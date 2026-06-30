package i16;

/* loaded from: classes16.dex */
public final class d1 extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f368922e;

    /* renamed from: f, reason: collision with root package name */
    public p16.c0 f368923f = p16.b0.f432803e;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.e1.f368945i     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.c1 r0 = (i16.c1) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.e1 r2 = (i16.e1) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.e1 r3 = (i16.e1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.d1.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.e1) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.e1 c17 = c();
        if (c17.mo134563xf582434a()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.e1 c() {
        i16.e1 e1Var = new i16.e1(this, null);
        if ((this.f368922e & 1) == 1) {
            this.f368923f = this.f368923f.b();
            this.f368922e &= -2;
        }
        e1Var.f368947e = this.f368923f;
        return e1Var;
    }

    /* renamed from: clone */
    public java.lang.Object m134580x5a5dd5d() {
        i16.d1 d1Var = new i16.d1();
        d1Var.d(c());
        return d1Var;
    }

    public i16.d1 d(i16.e1 e1Var) {
        if (e1Var == i16.e1.f368944h) {
            return this;
        }
        if (!e1Var.f368947e.isEmpty()) {
            if (this.f368923f.isEmpty()) {
                this.f368923f = e1Var.f368947e;
                this.f368922e &= -2;
            } else {
                if ((this.f368922e & 1) != 1) {
                    this.f368923f = new p16.b0(this.f368923f);
                    this.f368922e |= 1;
                }
                this.f368923f.addAll(e1Var.f368947e);
            }
        }
        this.f432870d = this.f432870d.e(e1Var.f368946d);
        return this;
    }
}
