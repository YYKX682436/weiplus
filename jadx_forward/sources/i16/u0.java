package i16;

/* loaded from: classes16.dex */
public final class u0 extends p16.s {
    public static final i16.u0 A;
    public static final p16.j0 B = new i16.s0();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f369294e;

    /* renamed from: f, reason: collision with root package name */
    public int f369295f;

    /* renamed from: g, reason: collision with root package name */
    public int f369296g;

    /* renamed from: h, reason: collision with root package name */
    public int f369297h;

    /* renamed from: i, reason: collision with root package name */
    public int f369298i;

    /* renamed from: m, reason: collision with root package name */
    public i16.l1 f369299m;

    /* renamed from: n, reason: collision with root package name */
    public int f369300n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f369301o;

    /* renamed from: p, reason: collision with root package name */
    public i16.l1 f369302p;

    /* renamed from: q, reason: collision with root package name */
    public int f369303q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f369304r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f369305s;

    /* renamed from: t, reason: collision with root package name */
    public int f369306t;

    /* renamed from: u, reason: collision with root package name */
    public i16.y1 f369307u;

    /* renamed from: v, reason: collision with root package name */
    public int f369308v;

    /* renamed from: w, reason: collision with root package name */
    public int f369309w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f369310x;

    /* renamed from: y, reason: collision with root package name */
    public byte f369311y;

    /* renamed from: z, reason: collision with root package name */
    public int f369312z;

    static {
        i16.u0 u0Var = new i16.u0(true);
        A = u0Var;
        u0Var.l();
    }

    public u0(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f369306t = -1;
        this.f369311y = (byte) -1;
        this.f369312z = -1;
        this.f369294e = qVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        p16.r i17 = i();
        if ((this.f369295f & 2) == 2) {
            jVar.m(1, this.f369297h);
        }
        if ((this.f369295f & 4) == 4) {
            jVar.m(2, this.f369298i);
        }
        if ((this.f369295f & 8) == 8) {
            jVar.o(3, this.f369299m);
        }
        for (int i18 = 0; i18 < this.f369301o.size(); i18++) {
            jVar.o(4, (p16.h0) this.f369301o.get(i18));
        }
        if ((this.f369295f & 32) == 32) {
            jVar.o(5, this.f369302p);
        }
        if ((this.f369295f & 128) == 128) {
            jVar.o(6, this.f369307u);
        }
        if ((this.f369295f & 256) == 256) {
            jVar.m(7, this.f369308v);
        }
        if ((this.f369295f & 512) == 512) {
            jVar.m(8, this.f369309w);
        }
        if ((this.f369295f & 16) == 16) {
            jVar.m(9, this.f369300n);
        }
        if ((this.f369295f & 64) == 64) {
            jVar.m(10, this.f369303q);
        }
        if ((this.f369295f & 1) == 1) {
            jVar.m(11, this.f369296g);
        }
        for (int i19 = 0; i19 < this.f369304r.size(); i19++) {
            jVar.o(12, (p16.h0) this.f369304r.get(i19));
        }
        if (this.f369305s.size() > 0) {
            jVar.v(106);
            jVar.v(this.f369306t);
        }
        for (int i27 = 0; i27 < this.f369305s.size(); i27++) {
            jVar.n(((java.lang.Integer) this.f369305s.get(i27)).intValue());
        }
        for (int i28 = 0; i28 < this.f369310x.size(); i28++) {
            jVar.m(31, ((java.lang.Integer) this.f369310x.get(i28)).intValue());
        }
        i17.a(19000, jVar);
        jVar.r(this.f369294e);
    }

    @Override // p16.i0
    /* renamed from: getDefaultInstanceForType */
    public p16.h0 mo134575x786693c3() {
        return A;
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369312z;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f369295f & 2) == 2 ? p16.j.b(1, this.f369297h) + 0 : 0;
        if ((this.f369295f & 4) == 4) {
            b17 += p16.j.b(2, this.f369298i);
        }
        if ((this.f369295f & 8) == 8) {
            b17 += p16.j.d(3, this.f369299m);
        }
        for (int i18 = 0; i18 < this.f369301o.size(); i18++) {
            b17 += p16.j.d(4, (p16.h0) this.f369301o.get(i18));
        }
        if ((this.f369295f & 32) == 32) {
            b17 += p16.j.d(5, this.f369302p);
        }
        if ((this.f369295f & 128) == 128) {
            b17 += p16.j.d(6, this.f369307u);
        }
        if ((this.f369295f & 256) == 256) {
            b17 += p16.j.b(7, this.f369308v);
        }
        if ((this.f369295f & 512) == 512) {
            b17 += p16.j.b(8, this.f369309w);
        }
        if ((this.f369295f & 16) == 16) {
            b17 += p16.j.b(9, this.f369300n);
        }
        if ((this.f369295f & 64) == 64) {
            b17 += p16.j.b(10, this.f369303q);
        }
        if ((this.f369295f & 1) == 1) {
            b17 += p16.j.b(11, this.f369296g);
        }
        for (int i19 = 0; i19 < this.f369304r.size(); i19++) {
            b17 += p16.j.d(12, (p16.h0) this.f369304r.get(i19));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f369305s.size(); i28++) {
            i27 += p16.j.c(((java.lang.Integer) this.f369305s.get(i28)).intValue());
        }
        int i29 = b17 + i27;
        if (!this.f369305s.isEmpty()) {
            i29 = i29 + 1 + p16.j.c(i27);
        }
        this.f369306t = i27;
        int i37 = 0;
        for (int i38 = 0; i38 < this.f369310x.size(); i38++) {
            i37 += p16.j.c(((java.lang.Integer) this.f369310x.get(i38)).intValue());
        }
        int size = i29 + i37 + (this.f369310x.size() * 2) + e() + this.f369294e.mo157707x35e001();
        this.f369312z = size;
        return size;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369311y;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        int i17 = this.f369295f;
        if (!((i17 & 4) == 4)) {
            this.f369311y = (byte) 0;
            return false;
        }
        if (((i17 & 8) == 8) && !this.f369299m.mo134563xf582434a()) {
            this.f369311y = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f369301o.size(); i18++) {
            if (!((i16.s1) this.f369301o.get(i18)).mo134563xf582434a()) {
                this.f369311y = (byte) 0;
                return false;
            }
        }
        if (((this.f369295f & 32) == 32) && !this.f369302p.mo134563xf582434a()) {
            this.f369311y = (byte) 0;
            return false;
        }
        for (int i19 = 0; i19 < this.f369304r.size(); i19++) {
            if (!((i16.l1) this.f369304r.get(i19)).mo134563xf582434a()) {
                this.f369311y = (byte) 0;
                return false;
            }
        }
        if (((this.f369295f & 128) == 128) && !this.f369307u.mo134563xf582434a()) {
            this.f369311y = (byte) 0;
            return false;
        }
        if (d()) {
            this.f369311y = (byte) 1;
            return true;
        }
        this.f369311y = (byte) 0;
        return false;
    }

    public final void l() {
        this.f369296g = md1.d1.f72842x366c91de;
        this.f369297h = 2054;
        this.f369298i = 0;
        i16.l1 l1Var = i16.l1.f369113z;
        this.f369299m = l1Var;
        this.f369300n = 0;
        this.f369301o = java.util.Collections.emptyList();
        this.f369302p = l1Var;
        this.f369303q = 0;
        this.f369304r = java.util.Collections.emptyList();
        this.f369305s = java.util.Collections.emptyList();
        this.f369307u = i16.y1.f369352r;
        this.f369308v = 0;
        this.f369309w = 0;
        this.f369310x = java.util.Collections.emptyList();
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.t0();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.t0 t0Var = new i16.t0();
        t0Var.e(this);
        return t0Var;
    }

    public u0(boolean z17) {
        this.f369306t = -1;
        this.f369311y = (byte) -1;
        this.f369312z = -1;
        this.f369294e = p16.g.f432816d;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0027. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    public u0(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f369306t = -1;
        this.f369311y = (byte) -1;
        this.f369312z = -1;
        l();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        char c17 = 0;
        while (true) {
            ?? r47 = 256;
            if (!z17) {
                try {
                    try {
                        try {
                            int n17 = hVar.n();
                            i16.k1 k1Var = null;
                            i16.x1 x1Var = null;
                            i16.k1 k1Var2 = null;
                            switch (n17) {
                                case 0:
                                    z17 = true;
                                case 8:
                                    this.f369295f |= 2;
                                    this.f369297h = hVar.k();
                                case 16:
                                    this.f369295f |= 4;
                                    this.f369298i = hVar.k();
                                case 26:
                                    if ((this.f369295f & 8) == 8) {
                                        i16.l1 l1Var = this.f369299m;
                                        l1Var.getClass();
                                        k1Var = i16.l1.m(l1Var);
                                    }
                                    i16.l1 l1Var2 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                    this.f369299m = l1Var2;
                                    if (k1Var != null) {
                                        k1Var.b(l1Var2);
                                        this.f369299m = k1Var.d();
                                    }
                                    this.f369295f |= 8;
                                case 34:
                                    int i17 = (c17 == true ? 1 : 0) & 32;
                                    c17 = c17;
                                    if (i17 != 32) {
                                        this.f369301o = new java.util.ArrayList();
                                        c17 = (c17 == true ? 1 : 0) | ' ';
                                    }
                                    this.f369301o.add(hVar.g(i16.s1.f369259t, lVar));
                                case 42:
                                    if ((this.f369295f & 32) == 32) {
                                        i16.l1 l1Var3 = this.f369302p;
                                        l1Var3.getClass();
                                        k1Var2 = i16.l1.m(l1Var3);
                                    }
                                    i16.l1 l1Var4 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                    this.f369302p = l1Var4;
                                    if (k1Var2 != null) {
                                        k1Var2.b(l1Var4);
                                        this.f369302p = k1Var2.d();
                                    }
                                    this.f369295f |= 32;
                                case 50:
                                    if ((this.f369295f & 128) == 128) {
                                        i16.y1 y1Var = this.f369307u;
                                        y1Var.getClass();
                                        x1Var = new i16.x1();
                                        x1Var.e(y1Var);
                                    }
                                    i16.y1 y1Var2 = (i16.y1) hVar.g(i16.y1.f369353s, lVar);
                                    this.f369307u = y1Var2;
                                    if (x1Var != null) {
                                        x1Var.e(y1Var2);
                                        this.f369307u = x1Var.d();
                                    }
                                    this.f369295f |= 128;
                                case 56:
                                    this.f369295f |= 256;
                                    this.f369308v = hVar.k();
                                case 64:
                                    this.f369295f |= 512;
                                    this.f369309w = hVar.k();
                                case 72:
                                    this.f369295f |= 16;
                                    this.f369300n = hVar.k();
                                case 80:
                                    this.f369295f |= 64;
                                    this.f369303q = hVar.k();
                                case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51695x8a2568b7 /* 88 */:
                                    this.f369295f |= 1;
                                    this.f369296g = hVar.k();
                                case 98:
                                    int i18 = (c17 == true ? 1 : 0) & 256;
                                    c17 = c17;
                                    if (i18 != 256) {
                                        this.f369304r = new java.util.ArrayList();
                                        c17 = (c17 == true ? 1 : 0) | 256;
                                    }
                                    this.f369304r.add(hVar.g(i16.l1.A, lVar));
                                case 104:
                                    int i19 = (c17 == true ? 1 : 0) & 512;
                                    c17 = c17;
                                    if (i19 != 512) {
                                        this.f369305s = new java.util.ArrayList();
                                        c17 = (c17 == true ? 1 : 0) | 512;
                                    }
                                    this.f369305s.add(java.lang.Integer.valueOf(hVar.k()));
                                case 106:
                                    int d17 = hVar.d(hVar.k());
                                    int i27 = (c17 == true ? 1 : 0) & 512;
                                    c17 = c17;
                                    if (i27 != 512) {
                                        c17 = c17;
                                        if (hVar.b() > 0) {
                                            this.f369305s = new java.util.ArrayList();
                                            c17 = (c17 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (hVar.b() > 0) {
                                        this.f369305s.add(java.lang.Integer.valueOf(hVar.k()));
                                    }
                                    hVar.c(d17);
                                case 248:
                                    int i28 = (c17 == true ? 1 : 0) & 8192;
                                    c17 = c17;
                                    if (i28 != 8192) {
                                        this.f369310x = new java.util.ArrayList();
                                        c17 = (c17 == true ? 1 : 0) | 8192;
                                    }
                                    this.f369310x.add(java.lang.Integer.valueOf(hVar.k()));
                                case 250:
                                    int d18 = hVar.d(hVar.k());
                                    int i29 = (c17 == true ? 1 : 0) & 8192;
                                    c17 = c17;
                                    if (i29 != 8192) {
                                        c17 = c17;
                                        if (hVar.b() > 0) {
                                            this.f369310x = new java.util.ArrayList();
                                            c17 = (c17 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (hVar.b() > 0) {
                                        this.f369310x.add(java.lang.Integer.valueOf(hVar.k()));
                                    }
                                    hVar.c(d18);
                                default:
                                    r47 = j(hVar, j17, lVar, n17);
                                    if (r47 == 0) {
                                        z17 = true;
                                    }
                            }
                        } catch (java.io.IOException e17) {
                            p16.z zVar = new p16.z(e17.getMessage());
                            zVar.f432904d = this;
                            throw zVar;
                        }
                    } catch (p16.z e18) {
                        e18.f432904d = this;
                        throw e18;
                    }
                } catch (java.lang.Throwable th6) {
                    if (((c17 == true ? 1 : 0) & 32) == 32) {
                        this.f369301o = java.util.Collections.unmodifiableList(this.f369301o);
                    }
                    if (((c17 == true ? 1 : 0) & 256) == r47) {
                        this.f369304r = java.util.Collections.unmodifiableList(this.f369304r);
                    }
                    if (((c17 == true ? 1 : 0) & 512) == 512) {
                        this.f369305s = java.util.Collections.unmodifiableList(this.f369305s);
                    }
                    if (((c17 == true ? 1 : 0) & 8192) == 8192) {
                        this.f369310x = java.util.Collections.unmodifiableList(this.f369310x);
                    }
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                        this.f369294e = m17.c();
                        h();
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        this.f369294e = m17.c();
                        throw th7;
                    }
                }
            } else {
                if (((c17 == true ? 1 : 0) & 32) == 32) {
                    this.f369301o = java.util.Collections.unmodifiableList(this.f369301o);
                }
                if (((c17 == true ? 1 : 0) & 256) == 256) {
                    this.f369304r = java.util.Collections.unmodifiableList(this.f369304r);
                }
                if (((c17 == true ? 1 : 0) & 512) == 512) {
                    this.f369305s = java.util.Collections.unmodifiableList(this.f369305s);
                }
                if (((c17 == true ? 1 : 0) & 8192) == 8192) {
                    this.f369310x = java.util.Collections.unmodifiableList(this.f369310x);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused2) {
                    this.f369294e = m17.c();
                    h();
                    return;
                } catch (java.lang.Throwable th8) {
                    this.f369294e = m17.c();
                    throw th8;
                }
            }
        }
    }
}
