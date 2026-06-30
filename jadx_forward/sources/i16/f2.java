package i16;

/* loaded from: classes16.dex */
public final class f2 extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f368967e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f368968f = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.g2.f368998i     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.e2 r0 = (i16.e2) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.g2 r2 = (i16.g2) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.g2 r3 = (i16.g2) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.f2.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.g2) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.g2 c17 = c();
        if (c17.mo134563xf582434a()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.g2 c() {
        i16.g2 g2Var = new i16.g2(this, null);
        if ((this.f368967e & 1) == 1) {
            this.f368968f = java.util.Collections.unmodifiableList(this.f368968f);
            this.f368967e &= -2;
        }
        g2Var.f369000e = this.f368968f;
        return g2Var;
    }

    /* renamed from: clone */
    public java.lang.Object m134588x5a5dd5d() {
        i16.f2 f2Var = new i16.f2();
        f2Var.d(c());
        return f2Var;
    }

    public i16.f2 d(i16.g2 g2Var) {
        if (g2Var == i16.g2.f368997h) {
            return this;
        }
        if (!g2Var.f369000e.isEmpty()) {
            if (this.f368968f.isEmpty()) {
                this.f368968f = g2Var.f369000e;
                this.f368967e &= -2;
            } else {
                if ((this.f368967e & 1) != 1) {
                    this.f368968f = new java.util.ArrayList(this.f368968f);
                    this.f368967e |= 1;
                }
                this.f368968f.addAll(g2Var.f369000e);
            }
        }
        this.f432870d = this.f432870d.e(g2Var.f368999d);
        return this;
    }
}
