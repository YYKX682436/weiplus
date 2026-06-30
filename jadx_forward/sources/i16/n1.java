package i16;

/* loaded from: classes16.dex */
public final class n1 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f369162g;

    /* renamed from: i, reason: collision with root package name */
    public int f369164i;

    /* renamed from: n, reason: collision with root package name */
    public i16.l1 f369166n;

    /* renamed from: o, reason: collision with root package name */
    public int f369167o;

    /* renamed from: p, reason: collision with root package name */
    public i16.l1 f369168p;

    /* renamed from: q, reason: collision with root package name */
    public int f369169q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f369170r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f369171s;

    /* renamed from: h, reason: collision with root package name */
    public int f369163h = 6;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f369165m = java.util.Collections.emptyList();

    public n1() {
        i16.l1 l1Var = i16.l1.f369113z;
        this.f369166n = l1Var;
        this.f369168p = l1Var;
        this.f369170r = java.util.Collections.emptyList();
        this.f369171s = java.util.Collections.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.o1.f369204v     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.m1 r0 = (i16.m1) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.o1 r2 = (i16.o1) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.o1 r3 = (i16.o1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.n1.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.o1) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.o1 d17 = d();
        if (d17.mo134563xf582434a()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    /* renamed from: clone */
    public java.lang.Object m134621x5a5dd5d() {
        i16.n1 n1Var = new i16.n1();
        n1Var.e(d());
        return n1Var;
    }

    public i16.o1 d() {
        i16.o1 o1Var = new i16.o1(this, null);
        int i17 = this.f369162g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        o1Var.f369207g = this.f369163h;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        o1Var.f369208h = this.f369164i;
        if ((i17 & 4) == 4) {
            this.f369165m = java.util.Collections.unmodifiableList(this.f369165m);
            this.f369162g &= -5;
        }
        o1Var.f369209i = this.f369165m;
        if ((i17 & 8) == 8) {
            i18 |= 4;
        }
        o1Var.f369210m = this.f369166n;
        if ((i17 & 16) == 16) {
            i18 |= 8;
        }
        o1Var.f369211n = this.f369167o;
        if ((i17 & 32) == 32) {
            i18 |= 16;
        }
        o1Var.f369212o = this.f369168p;
        if ((i17 & 64) == 64) {
            i18 |= 32;
        }
        o1Var.f369213p = this.f369169q;
        if ((this.f369162g & 128) == 128) {
            this.f369170r = java.util.Collections.unmodifiableList(this.f369170r);
            this.f369162g &= -129;
        }
        o1Var.f369214q = this.f369170r;
        if ((this.f369162g & 256) == 256) {
            this.f369171s = java.util.Collections.unmodifiableList(this.f369171s);
            this.f369162g &= -257;
        }
        o1Var.f369215r = this.f369171s;
        o1Var.f369206f = i18;
        return o1Var;
    }

    public i16.n1 e(i16.o1 o1Var) {
        i16.l1 l1Var;
        i16.l1 l1Var2;
        if (o1Var == i16.o1.f369203u) {
            return this;
        }
        int i17 = o1Var.f369206f;
        if ((i17 & 1) == 1) {
            int i18 = o1Var.f369207g;
            this.f369162g |= 1;
            this.f369163h = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = o1Var.f369208h;
            this.f369162g = 2 | this.f369162g;
            this.f369164i = i19;
        }
        if (!o1Var.f369209i.isEmpty()) {
            if (this.f369165m.isEmpty()) {
                this.f369165m = o1Var.f369209i;
                this.f369162g &= -5;
            } else {
                if ((this.f369162g & 4) != 4) {
                    this.f369165m = new java.util.ArrayList(this.f369165m);
                    this.f369162g |= 4;
                }
                this.f369165m.addAll(o1Var.f369209i);
            }
        }
        if ((o1Var.f369206f & 4) == 4) {
            i16.l1 l1Var3 = o1Var.f369210m;
            if ((this.f369162g & 8) != 8 || (l1Var2 = this.f369166n) == i16.l1.f369113z) {
                this.f369166n = l1Var3;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var2);
                m17.b(l1Var3);
                this.f369166n = m17.d();
            }
            this.f369162g |= 8;
        }
        int i27 = o1Var.f369206f;
        if ((i27 & 8) == 8) {
            int i28 = o1Var.f369211n;
            this.f369162g |= 16;
            this.f369167o = i28;
        }
        if ((i27 & 16) == 16) {
            i16.l1 l1Var4 = o1Var.f369212o;
            if ((this.f369162g & 32) != 32 || (l1Var = this.f369168p) == i16.l1.f369113z) {
                this.f369168p = l1Var4;
            } else {
                i16.k1 m18 = i16.l1.m(l1Var);
                m18.b(l1Var4);
                this.f369168p = m18.d();
            }
            this.f369162g |= 32;
        }
        if ((o1Var.f369206f & 32) == 32) {
            int i29 = o1Var.f369213p;
            this.f369162g |= 64;
            this.f369169q = i29;
        }
        if (!o1Var.f369214q.isEmpty()) {
            if (this.f369170r.isEmpty()) {
                this.f369170r = o1Var.f369214q;
                this.f369162g &= -129;
            } else {
                if ((this.f369162g & 128) != 128) {
                    this.f369170r = new java.util.ArrayList(this.f369170r);
                    this.f369162g |= 128;
                }
                this.f369170r.addAll(o1Var.f369214q);
            }
        }
        if (!o1Var.f369215r.isEmpty()) {
            if (this.f369171s.isEmpty()) {
                this.f369171s = o1Var.f369215r;
                this.f369162g &= -257;
            } else {
                if ((this.f369162g & 256) != 256) {
                    this.f369171s = new java.util.ArrayList(this.f369171s);
                    this.f369162g |= 256;
                }
                this.f369171s.addAll(o1Var.f369215r);
            }
        }
        c(o1Var);
        this.f432870d = this.f432870d.e(o1Var.f369205e);
        return this;
    }
}
