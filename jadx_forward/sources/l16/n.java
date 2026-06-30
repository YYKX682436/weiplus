package l16;

/* loaded from: classes16.dex */
public final class n extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f396591e;

    /* renamed from: g, reason: collision with root package name */
    public int f396593g;

    /* renamed from: f, reason: collision with root package name */
    public int f396592f = 1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f396594h = "";

    /* renamed from: i, reason: collision with root package name */
    public l16.o f396595i = l16.o.NONE;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f396596m = java.util.Collections.emptyList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f396597n = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = l16.p.f396604t     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.m r0 = (l16.m) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.p r2 = (l16.p) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            l16.p r3 = (l16.p) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: l16.n.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((l16.p) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        l16.p c17 = c();
        if (c17.mo134563xf582434a()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public l16.p c() {
        l16.p pVar = new l16.p(this, null);
        int i17 = this.f396591e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        pVar.f396607f = this.f396592f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        pVar.f396608g = this.f396593g;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        pVar.f396609h = this.f396594h;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        pVar.f396610i = this.f396595i;
        if ((i17 & 16) == 16) {
            this.f396596m = java.util.Collections.unmodifiableList(this.f396596m);
            this.f396591e &= -17;
        }
        pVar.f396611m = this.f396596m;
        if ((this.f396591e & 32) == 32) {
            this.f396597n = java.util.Collections.unmodifiableList(this.f396597n);
            this.f396591e &= -33;
        }
        pVar.f396613o = this.f396597n;
        pVar.f396606e = i18;
        return pVar;
    }

    /* renamed from: clone */
    public java.lang.Object m144883x5a5dd5d() {
        l16.n nVar = new l16.n();
        nVar.d(c());
        return nVar;
    }

    public l16.n d(l16.p pVar) {
        if (pVar == l16.p.f396603s) {
            return this;
        }
        int i17 = pVar.f396606e;
        if ((i17 & 1) == 1) {
            int i18 = pVar.f396607f;
            this.f396591e |= 1;
            this.f396592f = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = pVar.f396608g;
            this.f396591e = 2 | this.f396591e;
            this.f396593g = i19;
        }
        if ((i17 & 4) == 4) {
            this.f396591e |= 4;
            this.f396594h = pVar.f396609h;
        }
        if ((i17 & 8) == 8) {
            l16.o oVar = pVar.f396610i;
            oVar.getClass();
            this.f396591e = 8 | this.f396591e;
            this.f396595i = oVar;
        }
        if (!pVar.f396611m.isEmpty()) {
            if (this.f396596m.isEmpty()) {
                this.f396596m = pVar.f396611m;
                this.f396591e &= -17;
            } else {
                if ((this.f396591e & 16) != 16) {
                    this.f396596m = new java.util.ArrayList(this.f396596m);
                    this.f396591e |= 16;
                }
                this.f396596m.addAll(pVar.f396611m);
            }
        }
        if (!pVar.f396613o.isEmpty()) {
            if (this.f396597n.isEmpty()) {
                this.f396597n = pVar.f396613o;
                this.f396591e &= -33;
            } else {
                if ((this.f396591e & 32) != 32) {
                    this.f396597n = new java.util.ArrayList(this.f396597n);
                    this.f396591e |= 32;
                }
                this.f396597n.addAll(pVar.f396613o);
            }
        }
        this.f432870d = this.f432870d.e(pVar.f396605d);
        return this;
    }
}
