package i16;

/* loaded from: classes16.dex */
public final class j0 extends p16.s {
    public static final i16.j0 A;
    public static final p16.j0 B = new i16.h0();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f369058e;

    /* renamed from: f, reason: collision with root package name */
    public int f369059f;

    /* renamed from: g, reason: collision with root package name */
    public int f369060g;

    /* renamed from: h, reason: collision with root package name */
    public int f369061h;

    /* renamed from: i, reason: collision with root package name */
    public int f369062i;

    /* renamed from: m, reason: collision with root package name */
    public i16.l1 f369063m;

    /* renamed from: n, reason: collision with root package name */
    public int f369064n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f369065o;

    /* renamed from: p, reason: collision with root package name */
    public i16.l1 f369066p;

    /* renamed from: q, reason: collision with root package name */
    public int f369067q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f369068r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f369069s;

    /* renamed from: t, reason: collision with root package name */
    public int f369070t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f369071u;

    /* renamed from: v, reason: collision with root package name */
    public i16.v1 f369072v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f369073w;

    /* renamed from: x, reason: collision with root package name */
    public i16.u f369074x;

    /* renamed from: y, reason: collision with root package name */
    public byte f369075y;

    /* renamed from: z, reason: collision with root package name */
    public int f369076z;

    static {
        i16.j0 j0Var = new i16.j0(true);
        A = j0Var;
        j0Var.l();
    }

    public j0(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f369070t = -1;
        this.f369075y = (byte) -1;
        this.f369076z = -1;
        this.f369058e = qVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        p16.r i17 = i();
        if ((this.f369059f & 2) == 2) {
            jVar.m(1, this.f369061h);
        }
        if ((this.f369059f & 4) == 4) {
            jVar.m(2, this.f369062i);
        }
        if ((this.f369059f & 8) == 8) {
            jVar.o(3, this.f369063m);
        }
        for (int i18 = 0; i18 < this.f369065o.size(); i18++) {
            jVar.o(4, (p16.h0) this.f369065o.get(i18));
        }
        if ((this.f369059f & 32) == 32) {
            jVar.o(5, this.f369066p);
        }
        for (int i19 = 0; i19 < this.f369071u.size(); i19++) {
            jVar.o(6, (p16.h0) this.f369071u.get(i19));
        }
        if ((this.f369059f & 16) == 16) {
            jVar.m(7, this.f369064n);
        }
        if ((this.f369059f & 64) == 64) {
            jVar.m(8, this.f369067q);
        }
        if ((this.f369059f & 1) == 1) {
            jVar.m(9, this.f369060g);
        }
        for (int i27 = 0; i27 < this.f369068r.size(); i27++) {
            jVar.o(10, (p16.h0) this.f369068r.get(i27));
        }
        if (this.f369069s.size() > 0) {
            jVar.v(90);
            jVar.v(this.f369070t);
        }
        for (int i28 = 0; i28 < this.f369069s.size(); i28++) {
            jVar.n(((java.lang.Integer) this.f369069s.get(i28)).intValue());
        }
        if ((this.f369059f & 128) == 128) {
            jVar.o(30, this.f369072v);
        }
        for (int i29 = 0; i29 < this.f369073w.size(); i29++) {
            jVar.m(31, ((java.lang.Integer) this.f369073w.get(i29)).intValue());
        }
        if ((this.f369059f & 256) == 256) {
            jVar.o(32, this.f369074x);
        }
        i17.a(19000, jVar);
        jVar.r(this.f369058e);
    }

    @Override // p16.i0
    /* renamed from: getDefaultInstanceForType */
    public p16.h0 mo134575x786693c3() {
        return A;
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369076z;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f369059f & 2) == 2 ? p16.j.b(1, this.f369061h) + 0 : 0;
        if ((this.f369059f & 4) == 4) {
            b17 += p16.j.b(2, this.f369062i);
        }
        if ((this.f369059f & 8) == 8) {
            b17 += p16.j.d(3, this.f369063m);
        }
        for (int i18 = 0; i18 < this.f369065o.size(); i18++) {
            b17 += p16.j.d(4, (p16.h0) this.f369065o.get(i18));
        }
        if ((this.f369059f & 32) == 32) {
            b17 += p16.j.d(5, this.f369066p);
        }
        for (int i19 = 0; i19 < this.f369071u.size(); i19++) {
            b17 += p16.j.d(6, (p16.h0) this.f369071u.get(i19));
        }
        if ((this.f369059f & 16) == 16) {
            b17 += p16.j.b(7, this.f369064n);
        }
        if ((this.f369059f & 64) == 64) {
            b17 += p16.j.b(8, this.f369067q);
        }
        if ((this.f369059f & 1) == 1) {
            b17 += p16.j.b(9, this.f369060g);
        }
        for (int i27 = 0; i27 < this.f369068r.size(); i27++) {
            b17 += p16.j.d(10, (p16.h0) this.f369068r.get(i27));
        }
        int i28 = 0;
        for (int i29 = 0; i29 < this.f369069s.size(); i29++) {
            i28 += p16.j.c(((java.lang.Integer) this.f369069s.get(i29)).intValue());
        }
        int i37 = b17 + i28;
        if (!this.f369069s.isEmpty()) {
            i37 = i37 + 1 + p16.j.c(i28);
        }
        this.f369070t = i28;
        if ((this.f369059f & 128) == 128) {
            i37 += p16.j.d(30, this.f369072v);
        }
        int i38 = 0;
        for (int i39 = 0; i39 < this.f369073w.size(); i39++) {
            i38 += p16.j.c(((java.lang.Integer) this.f369073w.get(i39)).intValue());
        }
        int size = i37 + i38 + (this.f369073w.size() * 2);
        if ((this.f369059f & 256) == 256) {
            size += p16.j.d(32, this.f369074x);
        }
        int e17 = size + e() + this.f369058e.mo157707x35e001();
        this.f369076z = e17;
        return e17;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369075y;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        int i17 = this.f369059f;
        if (!((i17 & 4) == 4)) {
            this.f369075y = (byte) 0;
            return false;
        }
        if (((i17 & 8) == 8) && !this.f369063m.mo134563xf582434a()) {
            this.f369075y = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f369065o.size(); i18++) {
            if (!((i16.s1) this.f369065o.get(i18)).mo134563xf582434a()) {
                this.f369075y = (byte) 0;
                return false;
            }
        }
        if (((this.f369059f & 32) == 32) && !this.f369066p.mo134563xf582434a()) {
            this.f369075y = (byte) 0;
            return false;
        }
        for (int i19 = 0; i19 < this.f369068r.size(); i19++) {
            if (!((i16.l1) this.f369068r.get(i19)).mo134563xf582434a()) {
                this.f369075y = (byte) 0;
                return false;
            }
        }
        for (int i27 = 0; i27 < this.f369071u.size(); i27++) {
            if (!((i16.y1) this.f369071u.get(i27)).mo134563xf582434a()) {
                this.f369075y = (byte) 0;
                return false;
            }
        }
        if (((this.f369059f & 128) == 128) && !this.f369072v.mo134563xf582434a()) {
            this.f369075y = (byte) 0;
            return false;
        }
        if (((this.f369059f & 256) == 256) && !this.f369074x.mo134563xf582434a()) {
            this.f369075y = (byte) 0;
            return false;
        }
        if (d()) {
            this.f369075y = (byte) 1;
            return true;
        }
        this.f369075y = (byte) 0;
        return false;
    }

    public final void l() {
        this.f369060g = 6;
        this.f369061h = 6;
        this.f369062i = 0;
        i16.l1 l1Var = i16.l1.f369113z;
        this.f369063m = l1Var;
        this.f369064n = 0;
        this.f369065o = java.util.Collections.emptyList();
        this.f369066p = l1Var;
        this.f369067q = 0;
        this.f369068r = java.util.Collections.emptyList();
        this.f369069s = java.util.Collections.emptyList();
        this.f369071u = java.util.Collections.emptyList();
        this.f369072v = i16.v1.f369316m;
        this.f369073w = java.util.Collections.emptyList();
        this.f369074x = i16.u.f369288h;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.i0();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.i0 i0Var = new i16.i0();
        i0Var.e(this);
        return i0Var;
    }

    public j0(boolean z17) {
        this.f369070t = -1;
        this.f369075y = (byte) -1;
        this.f369076z = -1;
        this.f369058e = p16.g.f432816d;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0029. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    public j0(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f369070t = -1;
        this.f369075y = (byte) -1;
        this.f369076z = -1;
        l();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        char c17 = 0;
        while (true) {
            ?? r47 = 1024;
            if (!z17) {
                try {
                    try {
                        int n17 = hVar.n();
                        i16.k1 k1Var = null;
                        i16.t tVar = null;
                        i16.u1 u1Var = null;
                        i16.k1 k1Var2 = null;
                        switch (n17) {
                            case 0:
                                z17 = true;
                            case 8:
                                this.f369059f |= 2;
                                this.f369061h = hVar.k();
                            case 16:
                                this.f369059f |= 4;
                                this.f369062i = hVar.k();
                            case 26:
                                if ((this.f369059f & 8) == 8) {
                                    i16.l1 l1Var = this.f369063m;
                                    l1Var.getClass();
                                    k1Var = i16.l1.m(l1Var);
                                }
                                i16.l1 l1Var2 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                this.f369063m = l1Var2;
                                if (k1Var != null) {
                                    k1Var.b(l1Var2);
                                    this.f369063m = k1Var.d();
                                }
                                this.f369059f |= 8;
                            case 34:
                                int i17 = (c17 == true ? 1 : 0) & 32;
                                c17 = c17;
                                if (i17 != 32) {
                                    this.f369065o = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | ' ';
                                }
                                this.f369065o.add(hVar.g(i16.s1.f369259t, lVar));
                            case 42:
                                if ((this.f369059f & 32) == 32) {
                                    i16.l1 l1Var3 = this.f369066p;
                                    l1Var3.getClass();
                                    k1Var2 = i16.l1.m(l1Var3);
                                }
                                i16.l1 l1Var4 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                this.f369066p = l1Var4;
                                if (k1Var2 != null) {
                                    k1Var2.b(l1Var4);
                                    this.f369066p = k1Var2.d();
                                }
                                this.f369059f |= 32;
                            case 50:
                                int i18 = (c17 == true ? 1 : 0) & 1024;
                                c17 = c17;
                                if (i18 != 1024) {
                                    this.f369071u = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 1024;
                                }
                                this.f369071u.add(hVar.g(i16.y1.f369353s, lVar));
                            case 56:
                                this.f369059f |= 16;
                                this.f369064n = hVar.k();
                            case 64:
                                this.f369059f |= 64;
                                this.f369067q = hVar.k();
                            case 72:
                                this.f369059f |= 1;
                                this.f369060g = hVar.k();
                            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45675x92fdfc4b /* 82 */:
                                int i19 = (c17 == true ? 1 : 0) & 256;
                                c17 = c17;
                                if (i19 != 256) {
                                    this.f369068r = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 256;
                                }
                                this.f369068r.add(hVar.g(i16.l1.A, lVar));
                            case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51695x8a2568b7 /* 88 */:
                                int i27 = (c17 == true ? 1 : 0) & 512;
                                c17 = c17;
                                if (i27 != 512) {
                                    this.f369069s = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 512;
                                }
                                this.f369069s.add(java.lang.Integer.valueOf(hVar.k()));
                            case 90:
                                int d17 = hVar.d(hVar.k());
                                int i28 = (c17 == true ? 1 : 0) & 512;
                                c17 = c17;
                                if (i28 != 512) {
                                    c17 = c17;
                                    if (hVar.b() > 0) {
                                        this.f369069s = new java.util.ArrayList();
                                        c17 = (c17 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (hVar.b() > 0) {
                                    this.f369069s.add(java.lang.Integer.valueOf(hVar.k()));
                                }
                                hVar.c(d17);
                            case 242:
                                if ((this.f369059f & 128) == 128) {
                                    i16.v1 v1Var = this.f369072v;
                                    v1Var.getClass();
                                    u1Var = i16.v1.d(v1Var);
                                }
                                i16.v1 v1Var2 = (i16.v1) hVar.g(i16.v1.f369317n, lVar);
                                this.f369072v = v1Var2;
                                if (u1Var != null) {
                                    u1Var.d(v1Var2);
                                    this.f369072v = u1Var.c();
                                }
                                this.f369059f |= 128;
                            case 248:
                                int i29 = (c17 == true ? 1 : 0) & 4096;
                                c17 = c17;
                                if (i29 != 4096) {
                                    this.f369073w = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 4096;
                                }
                                this.f369073w.add(java.lang.Integer.valueOf(hVar.k()));
                            case 250:
                                int d18 = hVar.d(hVar.k());
                                int i37 = (c17 == true ? 1 : 0) & 4096;
                                c17 = c17;
                                if (i37 != 4096) {
                                    c17 = c17;
                                    if (hVar.b() > 0) {
                                        this.f369073w = new java.util.ArrayList();
                                        c17 = (c17 == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (hVar.b() > 0) {
                                    this.f369073w.add(java.lang.Integer.valueOf(hVar.k()));
                                }
                                hVar.c(d18);
                            case 258:
                                if ((this.f369059f & 256) == 256) {
                                    i16.u uVar = this.f369074x;
                                    uVar.getClass();
                                    tVar = new i16.t();
                                    tVar.d(uVar);
                                }
                                i16.u uVar2 = (i16.u) hVar.g(i16.u.f369289i, lVar);
                                this.f369074x = uVar2;
                                if (tVar != null) {
                                    tVar.d(uVar2);
                                    this.f369074x = tVar.c();
                                }
                                this.f369059f |= 256;
                            default:
                                r47 = j(hVar, j17, lVar, n17);
                                if (r47 == 0) {
                                    z17 = true;
                                }
                        }
                    } catch (java.lang.Throwable th6) {
                        if (((c17 == true ? 1 : 0) & 32) == 32) {
                            this.f369065o = java.util.Collections.unmodifiableList(this.f369065o);
                        }
                        if (((c17 == true ? 1 : 0) & 1024) == r47) {
                            this.f369071u = java.util.Collections.unmodifiableList(this.f369071u);
                        }
                        if (((c17 == true ? 1 : 0) & 256) == 256) {
                            this.f369068r = java.util.Collections.unmodifiableList(this.f369068r);
                        }
                        if (((c17 == true ? 1 : 0) & 512) == 512) {
                            this.f369069s = java.util.Collections.unmodifiableList(this.f369069s);
                        }
                        if (((c17 == true ? 1 : 0) & 4096) == 4096) {
                            this.f369073w = java.util.Collections.unmodifiableList(this.f369073w);
                        }
                        try {
                            j17.i();
                        } catch (java.io.IOException unused) {
                            this.f369058e = m17.c();
                            h();
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            this.f369058e = m17.c();
                            throw th7;
                        }
                    }
                } catch (p16.z e17) {
                    e17.f432904d = this;
                    throw e17;
                } catch (java.io.IOException e18) {
                    p16.z zVar = new p16.z(e18.getMessage());
                    zVar.f432904d = this;
                    throw zVar;
                }
            } else {
                if (((c17 == true ? 1 : 0) & 32) == 32) {
                    this.f369065o = java.util.Collections.unmodifiableList(this.f369065o);
                }
                if (((c17 == true ? 1 : 0) & 1024) == 1024) {
                    this.f369071u = java.util.Collections.unmodifiableList(this.f369071u);
                }
                if (((c17 == true ? 1 : 0) & 256) == 256) {
                    this.f369068r = java.util.Collections.unmodifiableList(this.f369068r);
                }
                if (((c17 == true ? 1 : 0) & 512) == 512) {
                    this.f369069s = java.util.Collections.unmodifiableList(this.f369069s);
                }
                if (((c17 == true ? 1 : 0) & 4096) == 4096) {
                    this.f369073w = java.util.Collections.unmodifiableList(this.f369073w);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused2) {
                    this.f369058e = m17.c();
                    h();
                    return;
                } catch (java.lang.Throwable th8) {
                    this.f369058e = m17.c();
                    throw th8;
                }
            }
        }
    }
}
