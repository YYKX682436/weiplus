package i16;

/* loaded from: classes16.dex */
public final class k1 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f369096g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f369097h = java.util.Collections.emptyList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f369098i;

    /* renamed from: m, reason: collision with root package name */
    public int f369099m;

    /* renamed from: n, reason: collision with root package name */
    public i16.l1 f369100n;

    /* renamed from: o, reason: collision with root package name */
    public int f369101o;

    /* renamed from: p, reason: collision with root package name */
    public int f369102p;

    /* renamed from: q, reason: collision with root package name */
    public int f369103q;

    /* renamed from: r, reason: collision with root package name */
    public int f369104r;

    /* renamed from: s, reason: collision with root package name */
    public int f369105s;

    /* renamed from: t, reason: collision with root package name */
    public i16.l1 f369106t;

    /* renamed from: u, reason: collision with root package name */
    public int f369107u;

    /* renamed from: v, reason: collision with root package name */
    public i16.l1 f369108v;

    /* renamed from: w, reason: collision with root package name */
    public int f369109w;

    /* renamed from: x, reason: collision with root package name */
    public int f369110x;

    public k1() {
        i16.l1 l1Var = i16.l1.f369113z;
        this.f369100n = l1Var;
        this.f369106t = l1Var;
        this.f369108v = l1Var;
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
            p16.j0 r0 = i16.l1.A     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.f1 r0 = (i16.f1) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.l1 r2 = (i16.l1) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.b(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.l1 r3 = (i16.l1) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r2 = move-exception
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L1e
            r1.b(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i16.k1.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.l1 d17 = d();
        if (d17.mo134563xf582434a()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    /* renamed from: clone */
    public java.lang.Object m134611x5a5dd5d() {
        i16.k1 k1Var = new i16.k1();
        k1Var.b(d());
        return k1Var;
    }

    public i16.l1 d() {
        i16.l1 l1Var = new i16.l1(this, null);
        int i17 = this.f369096g;
        if ((i17 & 1) == 1) {
            this.f369097h = java.util.Collections.unmodifiableList(this.f369097h);
            this.f369096g &= -2;
        }
        l1Var.f369116g = this.f369097h;
        int i18 = (i17 & 2) != 2 ? 0 : 1;
        l1Var.f369117h = this.f369098i;
        if ((i17 & 4) == 4) {
            i18 |= 2;
        }
        l1Var.f369118i = this.f369099m;
        if ((i17 & 8) == 8) {
            i18 |= 4;
        }
        l1Var.f369119m = this.f369100n;
        if ((i17 & 16) == 16) {
            i18 |= 8;
        }
        l1Var.f369120n = this.f369101o;
        if ((i17 & 32) == 32) {
            i18 |= 16;
        }
        l1Var.f369121o = this.f369102p;
        if ((i17 & 64) == 64) {
            i18 |= 32;
        }
        l1Var.f369122p = this.f369103q;
        if ((i17 & 128) == 128) {
            i18 |= 64;
        }
        l1Var.f369123q = this.f369104r;
        if ((i17 & 256) == 256) {
            i18 |= 128;
        }
        l1Var.f369124r = this.f369105s;
        if ((i17 & 512) == 512) {
            i18 |= 256;
        }
        l1Var.f369125s = this.f369106t;
        if ((i17 & 1024) == 1024) {
            i18 |= 512;
        }
        l1Var.f369126t = this.f369107u;
        if ((i17 & 2048) == 2048) {
            i18 |= 1024;
        }
        l1Var.f369127u = this.f369108v;
        if ((i17 & 4096) == 4096) {
            i18 |= 2048;
        }
        l1Var.f369128v = this.f369109w;
        if ((i17 & 8192) == 8192) {
            i18 |= 4096;
        }
        l1Var.f369129w = this.f369110x;
        l1Var.f369115f = i18;
        return l1Var;
    }

    @Override // p16.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public i16.k1 b(i16.l1 l1Var) {
        i16.l1 l1Var2;
        i16.l1 l1Var3;
        i16.l1 l1Var4;
        i16.l1 l1Var5 = i16.l1.f369113z;
        if (l1Var == l1Var5) {
            return this;
        }
        if (!l1Var.f369116g.isEmpty()) {
            if (this.f369097h.isEmpty()) {
                this.f369097h = l1Var.f369116g;
                this.f369096g &= -2;
            } else {
                if ((this.f369096g & 1) != 1) {
                    this.f369097h = new java.util.ArrayList(this.f369097h);
                    this.f369096g |= 1;
                }
                this.f369097h.addAll(l1Var.f369116g);
            }
        }
        int i17 = l1Var.f369115f;
        if ((i17 & 1) == 1) {
            boolean z17 = l1Var.f369117h;
            this.f369096g |= 2;
            this.f369098i = z17;
        }
        if ((i17 & 2) == 2) {
            int i18 = l1Var.f369118i;
            this.f369096g |= 4;
            this.f369099m = i18;
        }
        if ((i17 & 4) == 4) {
            i16.l1 l1Var6 = l1Var.f369119m;
            if ((this.f369096g & 8) != 8 || (l1Var4 = this.f369100n) == l1Var5) {
                this.f369100n = l1Var6;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var4);
                m17.b(l1Var6);
                this.f369100n = m17.d();
            }
            this.f369096g |= 8;
        }
        int i19 = l1Var.f369115f;
        if ((i19 & 8) == 8) {
            int i27 = l1Var.f369120n;
            this.f369096g |= 16;
            this.f369101o = i27;
        }
        if ((i19 & 16) == 16) {
            int i28 = l1Var.f369121o;
            this.f369096g |= 32;
            this.f369102p = i28;
        }
        if ((i19 & 32) == 32) {
            int i29 = l1Var.f369122p;
            this.f369096g |= 64;
            this.f369103q = i29;
        }
        if ((i19 & 64) == 64) {
            int i37 = l1Var.f369123q;
            this.f369096g |= 128;
            this.f369104r = i37;
        }
        if ((i19 & 128) == 128) {
            int i38 = l1Var.f369124r;
            this.f369096g |= 256;
            this.f369105s = i38;
        }
        if ((i19 & 256) == 256) {
            i16.l1 l1Var7 = l1Var.f369125s;
            if ((this.f369096g & 512) != 512 || (l1Var3 = this.f369106t) == l1Var5) {
                this.f369106t = l1Var7;
            } else {
                i16.k1 m18 = i16.l1.m(l1Var3);
                m18.b(l1Var7);
                this.f369106t = m18.d();
            }
            this.f369096g |= 512;
        }
        int i39 = l1Var.f369115f;
        if ((i39 & 512) == 512) {
            int i47 = l1Var.f369126t;
            this.f369096g |= 1024;
            this.f369107u = i47;
        }
        if ((i39 & 1024) == 1024) {
            i16.l1 l1Var8 = l1Var.f369127u;
            if ((this.f369096g & 2048) != 2048 || (l1Var2 = this.f369108v) == l1Var5) {
                this.f369108v = l1Var8;
            } else {
                i16.k1 m19 = i16.l1.m(l1Var2);
                m19.b(l1Var8);
                this.f369108v = m19.d();
            }
            this.f369096g |= 2048;
        }
        int i48 = l1Var.f369115f;
        if ((i48 & 2048) == 2048) {
            int i49 = l1Var.f369128v;
            this.f369096g |= 4096;
            this.f369109w = i49;
        }
        if ((i48 & 4096) == 4096) {
            int i57 = l1Var.f369129w;
            this.f369096g |= 8192;
            this.f369110x = i57;
        }
        c(l1Var);
        this.f432870d = this.f432870d.e(l1Var.f369114e);
        return this;
    }
}
