package i16;

/* loaded from: classes16.dex */
public final class i0 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f369034g;

    /* renamed from: h, reason: collision with root package name */
    public int f369035h = 6;

    /* renamed from: i, reason: collision with root package name */
    public int f369036i = 6;

    /* renamed from: m, reason: collision with root package name */
    public int f369037m;

    /* renamed from: n, reason: collision with root package name */
    public i16.l1 f369038n;

    /* renamed from: o, reason: collision with root package name */
    public int f369039o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f369040p;

    /* renamed from: q, reason: collision with root package name */
    public i16.l1 f369041q;

    /* renamed from: r, reason: collision with root package name */
    public int f369042r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f369043s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f369044t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f369045u;

    /* renamed from: v, reason: collision with root package name */
    public i16.v1 f369046v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f369047w;

    /* renamed from: x, reason: collision with root package name */
    public i16.u f369048x;

    public i0() {
        i16.l1 l1Var = i16.l1.f369113z;
        this.f369038n = l1Var;
        this.f369040p = java.util.Collections.emptyList();
        this.f369041q = l1Var;
        this.f369043s = java.util.Collections.emptyList();
        this.f369044t = java.util.Collections.emptyList();
        this.f369045u = java.util.Collections.emptyList();
        this.f369046v = i16.v1.f369316m;
        this.f369047w = java.util.Collections.emptyList();
        this.f369048x = i16.u.f369288h;
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
            p16.j0 r0 = i16.j0.B     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.h0 r0 = (i16.h0) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.j0 r2 = (i16.j0) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.j0 r3 = (i16.j0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.i0.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.j0) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.j0 d17 = d();
        if (d17.mo134563xf582434a()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    /* renamed from: clone */
    public java.lang.Object m134600x5a5dd5d() {
        i16.i0 i0Var = new i16.i0();
        i0Var.e(d());
        return i0Var;
    }

    public i16.j0 d() {
        i16.j0 j0Var = new i16.j0(this, null);
        int i17 = this.f369034g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        j0Var.f369060g = this.f369035h;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        j0Var.f369061h = this.f369036i;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        j0Var.f369062i = this.f369037m;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        j0Var.f369063m = this.f369038n;
        if ((i17 & 16) == 16) {
            i18 |= 16;
        }
        j0Var.f369064n = this.f369039o;
        if ((i17 & 32) == 32) {
            this.f369040p = java.util.Collections.unmodifiableList(this.f369040p);
            this.f369034g &= -33;
        }
        j0Var.f369065o = this.f369040p;
        if ((i17 & 64) == 64) {
            i18 |= 32;
        }
        j0Var.f369066p = this.f369041q;
        if ((i17 & 128) == 128) {
            i18 |= 64;
        }
        j0Var.f369067q = this.f369042r;
        if ((this.f369034g & 256) == 256) {
            this.f369043s = java.util.Collections.unmodifiableList(this.f369043s);
            this.f369034g &= -257;
        }
        j0Var.f369068r = this.f369043s;
        if ((this.f369034g & 512) == 512) {
            this.f369044t = java.util.Collections.unmodifiableList(this.f369044t);
            this.f369034g &= -513;
        }
        j0Var.f369069s = this.f369044t;
        if ((this.f369034g & 1024) == 1024) {
            this.f369045u = java.util.Collections.unmodifiableList(this.f369045u);
            this.f369034g &= -1025;
        }
        j0Var.f369071u = this.f369045u;
        if ((i17 & 2048) == 2048) {
            i18 |= 128;
        }
        j0Var.f369072v = this.f369046v;
        if ((this.f369034g & 4096) == 4096) {
            this.f369047w = java.util.Collections.unmodifiableList(this.f369047w);
            this.f369034g &= -4097;
        }
        j0Var.f369073w = this.f369047w;
        if ((i17 & 8192) == 8192) {
            i18 |= 256;
        }
        j0Var.f369074x = this.f369048x;
        j0Var.f369059f = i18;
        return j0Var;
    }

    public i16.i0 e(i16.j0 j0Var) {
        i16.u uVar;
        i16.v1 v1Var;
        i16.l1 l1Var;
        i16.l1 l1Var2;
        if (j0Var == i16.j0.A) {
            return this;
        }
        int i17 = j0Var.f369059f;
        if ((i17 & 1) == 1) {
            int i18 = j0Var.f369060g;
            this.f369034g |= 1;
            this.f369035h = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = j0Var.f369061h;
            this.f369034g = 2 | this.f369034g;
            this.f369036i = i19;
        }
        if ((i17 & 4) == 4) {
            int i27 = j0Var.f369062i;
            this.f369034g = 4 | this.f369034g;
            this.f369037m = i27;
        }
        if ((i17 & 8) == 8) {
            i16.l1 l1Var3 = j0Var.f369063m;
            if ((this.f369034g & 8) != 8 || (l1Var2 = this.f369038n) == i16.l1.f369113z) {
                this.f369038n = l1Var3;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var2);
                m17.b(l1Var3);
                this.f369038n = m17.d();
            }
            this.f369034g |= 8;
        }
        if ((j0Var.f369059f & 16) == 16) {
            int i28 = j0Var.f369064n;
            this.f369034g = 16 | this.f369034g;
            this.f369039o = i28;
        }
        if (!j0Var.f369065o.isEmpty()) {
            if (this.f369040p.isEmpty()) {
                this.f369040p = j0Var.f369065o;
                this.f369034g &= -33;
            } else {
                if ((this.f369034g & 32) != 32) {
                    this.f369040p = new java.util.ArrayList(this.f369040p);
                    this.f369034g |= 32;
                }
                this.f369040p.addAll(j0Var.f369065o);
            }
        }
        if ((j0Var.f369059f & 32) == 32) {
            i16.l1 l1Var4 = j0Var.f369066p;
            if ((this.f369034g & 64) != 64 || (l1Var = this.f369041q) == i16.l1.f369113z) {
                this.f369041q = l1Var4;
            } else {
                i16.k1 m18 = i16.l1.m(l1Var);
                m18.b(l1Var4);
                this.f369041q = m18.d();
            }
            this.f369034g |= 64;
        }
        if ((j0Var.f369059f & 64) == 64) {
            int i29 = j0Var.f369067q;
            this.f369034g |= 128;
            this.f369042r = i29;
        }
        if (!j0Var.f369068r.isEmpty()) {
            if (this.f369043s.isEmpty()) {
                this.f369043s = j0Var.f369068r;
                this.f369034g &= -257;
            } else {
                if ((this.f369034g & 256) != 256) {
                    this.f369043s = new java.util.ArrayList(this.f369043s);
                    this.f369034g |= 256;
                }
                this.f369043s.addAll(j0Var.f369068r);
            }
        }
        if (!j0Var.f369069s.isEmpty()) {
            if (this.f369044t.isEmpty()) {
                this.f369044t = j0Var.f369069s;
                this.f369034g &= -513;
            } else {
                if ((this.f369034g & 512) != 512) {
                    this.f369044t = new java.util.ArrayList(this.f369044t);
                    this.f369034g |= 512;
                }
                this.f369044t.addAll(j0Var.f369069s);
            }
        }
        if (!j0Var.f369071u.isEmpty()) {
            if (this.f369045u.isEmpty()) {
                this.f369045u = j0Var.f369071u;
                this.f369034g &= -1025;
            } else {
                if ((this.f369034g & 1024) != 1024) {
                    this.f369045u = new java.util.ArrayList(this.f369045u);
                    this.f369034g |= 1024;
                }
                this.f369045u.addAll(j0Var.f369071u);
            }
        }
        if ((j0Var.f369059f & 128) == 128) {
            i16.v1 v1Var2 = j0Var.f369072v;
            if ((this.f369034g & 2048) != 2048 || (v1Var = this.f369046v) == i16.v1.f369316m) {
                this.f369046v = v1Var2;
            } else {
                i16.u1 d17 = i16.v1.d(v1Var);
                d17.d(v1Var2);
                this.f369046v = d17.c();
            }
            this.f369034g |= 2048;
        }
        if (!j0Var.f369073w.isEmpty()) {
            if (this.f369047w.isEmpty()) {
                this.f369047w = j0Var.f369073w;
                this.f369034g &= -4097;
            } else {
                if ((this.f369034g & 4096) != 4096) {
                    this.f369047w = new java.util.ArrayList(this.f369047w);
                    this.f369034g |= 4096;
                }
                this.f369047w.addAll(j0Var.f369073w);
            }
        }
        if ((j0Var.f369059f & 256) == 256) {
            i16.u uVar2 = j0Var.f369074x;
            if ((this.f369034g & 8192) != 8192 || (uVar = this.f369048x) == i16.u.f369288h) {
                this.f369048x = uVar2;
            } else {
                i16.t tVar = new i16.t();
                tVar.d(uVar);
                tVar.d(uVar2);
                this.f369048x = tVar.c();
            }
            this.f369034g |= 8192;
        }
        c(j0Var);
        this.f432870d = this.f432870d.e(j0Var.f369058e);
        return this;
    }
}
