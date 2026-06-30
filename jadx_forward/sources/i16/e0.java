package i16;

/* loaded from: classes16.dex */
public final class e0 extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f368936e;

    /* renamed from: f, reason: collision with root package name */
    public int f368937f;

    /* renamed from: g, reason: collision with root package name */
    public int f368938g;

    /* renamed from: m, reason: collision with root package name */
    public int f368941m;

    /* renamed from: h, reason: collision with root package name */
    public i16.f0 f368939h = i16.f0.TRUE;

    /* renamed from: i, reason: collision with root package name */
    public i16.l1 f368940i = i16.l1.f369113z;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f368942n = java.util.Collections.emptyList();

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f368943o = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.g0.f368985s     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.d0 r0 = (i16.d0) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.g0 r2 = (i16.g0) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.g0 r3 = (i16.g0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.e0.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.g0) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.g0 c17 = c();
        if (c17.mo134563xf582434a()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.g0 c() {
        i16.g0 g0Var = new i16.g0(this, null);
        int i17 = this.f368936e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        g0Var.f368988f = this.f368937f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        g0Var.f368989g = this.f368938g;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        g0Var.f368990h = this.f368939h;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        g0Var.f368991i = this.f368940i;
        if ((i17 & 16) == 16) {
            i18 |= 16;
        }
        g0Var.f368992m = this.f368941m;
        if ((i17 & 32) == 32) {
            this.f368942n = java.util.Collections.unmodifiableList(this.f368942n);
            this.f368936e &= -33;
        }
        g0Var.f368993n = this.f368942n;
        if ((this.f368936e & 64) == 64) {
            this.f368943o = java.util.Collections.unmodifiableList(this.f368943o);
            this.f368936e &= -65;
        }
        g0Var.f368994o = this.f368943o;
        g0Var.f368987e = i18;
        return g0Var;
    }

    /* renamed from: clone */
    public java.lang.Object m134582x5a5dd5d() {
        i16.e0 e0Var = new i16.e0();
        e0Var.d(c());
        return e0Var;
    }

    public i16.e0 d(i16.g0 g0Var) {
        i16.l1 l1Var;
        if (g0Var == i16.g0.f368984r) {
            return this;
        }
        int i17 = g0Var.f368987e;
        if ((i17 & 1) == 1) {
            int i18 = g0Var.f368988f;
            this.f368936e |= 1;
            this.f368937f = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = g0Var.f368989g;
            this.f368936e = 2 | this.f368936e;
            this.f368938g = i19;
        }
        if ((i17 & 4) == 4) {
            i16.f0 f0Var = g0Var.f368990h;
            f0Var.getClass();
            this.f368936e = 4 | this.f368936e;
            this.f368939h = f0Var;
        }
        if ((g0Var.f368987e & 8) == 8) {
            i16.l1 l1Var2 = g0Var.f368991i;
            if ((this.f368936e & 8) != 8 || (l1Var = this.f368940i) == i16.l1.f369113z) {
                this.f368940i = l1Var2;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var);
                m17.b(l1Var2);
                this.f368940i = m17.d();
            }
            this.f368936e |= 8;
        }
        if ((g0Var.f368987e & 16) == 16) {
            int i27 = g0Var.f368992m;
            this.f368936e = 16 | this.f368936e;
            this.f368941m = i27;
        }
        if (!g0Var.f368993n.isEmpty()) {
            if (this.f368942n.isEmpty()) {
                this.f368942n = g0Var.f368993n;
                this.f368936e &= -33;
            } else {
                if ((this.f368936e & 32) != 32) {
                    this.f368942n = new java.util.ArrayList(this.f368942n);
                    this.f368936e |= 32;
                }
                this.f368942n.addAll(g0Var.f368993n);
            }
        }
        if (!g0Var.f368994o.isEmpty()) {
            if (this.f368943o.isEmpty()) {
                this.f368943o = g0Var.f368994o;
                this.f368936e &= -65;
            } else {
                if ((this.f368936e & 64) != 64) {
                    this.f368943o = new java.util.ArrayList(this.f368943o);
                    this.f368936e |= 64;
                }
                this.f368943o.addAll(g0Var.f368994o);
            }
        }
        this.f432870d = this.f432870d.e(g0Var.f368986d);
        return this;
    }
}
