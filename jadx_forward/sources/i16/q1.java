package i16;

/* loaded from: classes16.dex */
public final class q1 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f369227g;

    /* renamed from: h, reason: collision with root package name */
    public int f369228h;

    /* renamed from: i, reason: collision with root package name */
    public int f369229i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f369230m;

    /* renamed from: n, reason: collision with root package name */
    public i16.r1 f369231n = i16.r1.INV;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f369232o = java.util.Collections.emptyList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f369233p = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.s1.f369259t     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.p1 r0 = (i16.p1) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.s1 r2 = (i16.s1) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.s1 r3 = (i16.s1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.q1.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.s1) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.s1 d17 = d();
        if (d17.mo134563xf582434a()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    /* renamed from: clone */
    public java.lang.Object m134627x5a5dd5d() {
        i16.q1 q1Var = new i16.q1();
        q1Var.e(d());
        return q1Var;
    }

    public i16.s1 d() {
        i16.s1 s1Var = new i16.s1(this, null);
        int i17 = this.f369227g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        s1Var.f369262g = this.f369228h;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        s1Var.f369263h = this.f369229i;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        s1Var.f369264i = this.f369230m;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        s1Var.f369265m = this.f369231n;
        if ((i17 & 16) == 16) {
            this.f369232o = java.util.Collections.unmodifiableList(this.f369232o);
            this.f369227g &= -17;
        }
        s1Var.f369266n = this.f369232o;
        if ((this.f369227g & 32) == 32) {
            this.f369233p = java.util.Collections.unmodifiableList(this.f369233p);
            this.f369227g &= -33;
        }
        s1Var.f369267o = this.f369233p;
        s1Var.f369261f = i18;
        return s1Var;
    }

    public i16.q1 e(i16.s1 s1Var) {
        if (s1Var == i16.s1.f369258s) {
            return this;
        }
        int i17 = s1Var.f369261f;
        if ((i17 & 1) == 1) {
            int i18 = s1Var.f369262g;
            this.f369227g |= 1;
            this.f369228h = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = s1Var.f369263h;
            this.f369227g = 2 | this.f369227g;
            this.f369229i = i19;
        }
        if ((i17 & 4) == 4) {
            boolean z17 = s1Var.f369264i;
            this.f369227g = 4 | this.f369227g;
            this.f369230m = z17;
        }
        if ((i17 & 8) == 8) {
            i16.r1 r1Var = s1Var.f369265m;
            r1Var.getClass();
            this.f369227g = 8 | this.f369227g;
            this.f369231n = r1Var;
        }
        if (!s1Var.f369266n.isEmpty()) {
            if (this.f369232o.isEmpty()) {
                this.f369232o = s1Var.f369266n;
                this.f369227g &= -17;
            } else {
                if ((this.f369227g & 16) != 16) {
                    this.f369232o = new java.util.ArrayList(this.f369232o);
                    this.f369227g |= 16;
                }
                this.f369232o.addAll(s1Var.f369266n);
            }
        }
        if (!s1Var.f369267o.isEmpty()) {
            if (this.f369233p.isEmpty()) {
                this.f369233p = s1Var.f369267o;
                this.f369227g &= -33;
            } else {
                if ((this.f369227g & 32) != 32) {
                    this.f369233p = new java.util.ArrayList(this.f369233p);
                    this.f369227g |= 32;
                }
                this.f369233p.addAll(s1Var.f369267o);
            }
        }
        c(s1Var);
        this.f432870d = this.f432870d.e(s1Var.f369260e);
        return this;
    }
}
