package i16;

/* loaded from: classes16.dex */
public final class o extends p16.s {
    public static final i16.o Q;
    public static final p16.j0 R = new i16.l();
    public java.util.List A;
    public int B;
    public int C;
    public i16.l1 D;
    public int E;
    public java.util.List F;
    public int G;
    public java.util.List H;
    public java.util.List I;

    /* renamed from: J, reason: collision with root package name */
    public int f369172J;
    public i16.v1 K;
    public java.util.List L;
    public i16.g2 M;
    public byte N;
    public int P;

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f369173e;

    /* renamed from: f, reason: collision with root package name */
    public int f369174f;

    /* renamed from: g, reason: collision with root package name */
    public int f369175g;

    /* renamed from: h, reason: collision with root package name */
    public int f369176h;

    /* renamed from: i, reason: collision with root package name */
    public int f369177i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f369178m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f369179n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f369180o;

    /* renamed from: p, reason: collision with root package name */
    public int f369181p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f369182q;

    /* renamed from: r, reason: collision with root package name */
    public int f369183r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f369184s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f369185t;

    /* renamed from: u, reason: collision with root package name */
    public int f369186u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f369187v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f369188w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f369189x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f369190y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.List f369191z;

    static {
        i16.o oVar = new i16.o(true);
        Q = oVar;
        oVar.l();
    }

    public o(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f369181p = -1;
        this.f369183r = -1;
        this.f369186u = -1;
        this.B = -1;
        this.G = -1;
        this.f369172J = -1;
        this.N = (byte) -1;
        this.P = -1;
        this.f369173e = qVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        p16.r i17 = i();
        if ((this.f369174f & 1) == 1) {
            jVar.m(1, this.f369175g);
        }
        if (this.f369180o.size() > 0) {
            jVar.v(18);
            jVar.v(this.f369181p);
        }
        for (int i18 = 0; i18 < this.f369180o.size(); i18++) {
            jVar.n(((java.lang.Integer) this.f369180o.get(i18)).intValue());
        }
        if ((this.f369174f & 2) == 2) {
            jVar.m(3, this.f369176h);
        }
        if ((this.f369174f & 4) == 4) {
            jVar.m(4, this.f369177i);
        }
        for (int i19 = 0; i19 < this.f369178m.size(); i19++) {
            jVar.o(5, (p16.h0) this.f369178m.get(i19));
        }
        for (int i27 = 0; i27 < this.f369179n.size(); i27++) {
            jVar.o(6, (p16.h0) this.f369179n.get(i27));
        }
        if (this.f369182q.size() > 0) {
            jVar.v(58);
            jVar.v(this.f369183r);
        }
        for (int i28 = 0; i28 < this.f369182q.size(); i28++) {
            jVar.n(((java.lang.Integer) this.f369182q.get(i28)).intValue());
        }
        for (int i29 = 0; i29 < this.f369187v.size(); i29++) {
            jVar.o(8, (p16.h0) this.f369187v.get(i29));
        }
        for (int i37 = 0; i37 < this.f369188w.size(); i37++) {
            jVar.o(9, (p16.h0) this.f369188w.get(i37));
        }
        for (int i38 = 0; i38 < this.f369189x.size(); i38++) {
            jVar.o(10, (p16.h0) this.f369189x.get(i38));
        }
        for (int i39 = 0; i39 < this.f369190y.size(); i39++) {
            jVar.o(11, (p16.h0) this.f369190y.get(i39));
        }
        for (int i47 = 0; i47 < this.f369191z.size(); i47++) {
            jVar.o(13, (p16.h0) this.f369191z.get(i47));
        }
        if (this.A.size() > 0) {
            jVar.v(130);
            jVar.v(this.B);
        }
        for (int i48 = 0; i48 < this.A.size(); i48++) {
            jVar.n(((java.lang.Integer) this.A.get(i48)).intValue());
        }
        if ((this.f369174f & 8) == 8) {
            jVar.m(17, this.C);
        }
        if ((this.f369174f & 16) == 16) {
            jVar.o(18, this.D);
        }
        if ((this.f369174f & 32) == 32) {
            jVar.m(19, this.E);
        }
        for (int i49 = 0; i49 < this.f369184s.size(); i49++) {
            jVar.o(20, (p16.h0) this.f369184s.get(i49));
        }
        if (this.f369185t.size() > 0) {
            jVar.v(170);
            jVar.v(this.f369186u);
        }
        for (int i57 = 0; i57 < this.f369185t.size(); i57++) {
            jVar.n(((java.lang.Integer) this.f369185t.get(i57)).intValue());
        }
        if (this.F.size() > 0) {
            jVar.v(178);
            jVar.v(this.G);
        }
        for (int i58 = 0; i58 < this.F.size(); i58++) {
            jVar.n(((java.lang.Integer) this.F.get(i58)).intValue());
        }
        for (int i59 = 0; i59 < this.H.size(); i59++) {
            jVar.o(23, (p16.h0) this.H.get(i59));
        }
        if (this.I.size() > 0) {
            jVar.v(194);
            jVar.v(this.f369172J);
        }
        for (int i66 = 0; i66 < this.I.size(); i66++) {
            jVar.n(((java.lang.Integer) this.I.get(i66)).intValue());
        }
        if ((this.f369174f & 64) == 64) {
            jVar.o(30, this.K);
        }
        for (int i67 = 0; i67 < this.L.size(); i67++) {
            jVar.m(31, ((java.lang.Integer) this.L.get(i67)).intValue());
        }
        if ((this.f369174f & 128) == 128) {
            jVar.o(32, this.M);
        }
        i17.a(19000, jVar);
        jVar.r(this.f369173e);
    }

    @Override // p16.i0
    /* renamed from: getDefaultInstanceForType */
    public p16.h0 mo134575x786693c3() {
        return Q;
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.P;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f369174f & 1) == 1 ? p16.j.b(1, this.f369175g) + 0 : 0;
        int i18 = 0;
        for (int i19 = 0; i19 < this.f369180o.size(); i19++) {
            i18 += p16.j.c(((java.lang.Integer) this.f369180o.get(i19)).intValue());
        }
        int i27 = b17 + i18;
        if (!this.f369180o.isEmpty()) {
            i27 = i27 + 1 + p16.j.c(i18);
        }
        this.f369181p = i18;
        if ((this.f369174f & 2) == 2) {
            i27 += p16.j.b(3, this.f369176h);
        }
        if ((this.f369174f & 4) == 4) {
            i27 += p16.j.b(4, this.f369177i);
        }
        for (int i28 = 0; i28 < this.f369178m.size(); i28++) {
            i27 += p16.j.d(5, (p16.h0) this.f369178m.get(i28));
        }
        for (int i29 = 0; i29 < this.f369179n.size(); i29++) {
            i27 += p16.j.d(6, (p16.h0) this.f369179n.get(i29));
        }
        int i37 = 0;
        for (int i38 = 0; i38 < this.f369182q.size(); i38++) {
            i37 += p16.j.c(((java.lang.Integer) this.f369182q.get(i38)).intValue());
        }
        int i39 = i27 + i37;
        if (!this.f369182q.isEmpty()) {
            i39 = i39 + 1 + p16.j.c(i37);
        }
        this.f369183r = i37;
        for (int i47 = 0; i47 < this.f369187v.size(); i47++) {
            i39 += p16.j.d(8, (p16.h0) this.f369187v.get(i47));
        }
        for (int i48 = 0; i48 < this.f369188w.size(); i48++) {
            i39 += p16.j.d(9, (p16.h0) this.f369188w.get(i48));
        }
        for (int i49 = 0; i49 < this.f369189x.size(); i49++) {
            i39 += p16.j.d(10, (p16.h0) this.f369189x.get(i49));
        }
        for (int i57 = 0; i57 < this.f369190y.size(); i57++) {
            i39 += p16.j.d(11, (p16.h0) this.f369190y.get(i57));
        }
        for (int i58 = 0; i58 < this.f369191z.size(); i58++) {
            i39 += p16.j.d(13, (p16.h0) this.f369191z.get(i58));
        }
        int i59 = 0;
        for (int i66 = 0; i66 < this.A.size(); i66++) {
            i59 += p16.j.c(((java.lang.Integer) this.A.get(i66)).intValue());
        }
        int i67 = i39 + i59;
        if (!this.A.isEmpty()) {
            i67 = i67 + 2 + p16.j.c(i59);
        }
        this.B = i59;
        if ((this.f369174f & 8) == 8) {
            i67 += p16.j.b(17, this.C);
        }
        if ((this.f369174f & 16) == 16) {
            i67 += p16.j.d(18, this.D);
        }
        if ((this.f369174f & 32) == 32) {
            i67 += p16.j.b(19, this.E);
        }
        for (int i68 = 0; i68 < this.f369184s.size(); i68++) {
            i67 += p16.j.d(20, (p16.h0) this.f369184s.get(i68));
        }
        int i69 = 0;
        for (int i76 = 0; i76 < this.f369185t.size(); i76++) {
            i69 += p16.j.c(((java.lang.Integer) this.f369185t.get(i76)).intValue());
        }
        int i77 = i67 + i69;
        if (!this.f369185t.isEmpty()) {
            i77 = i77 + 2 + p16.j.c(i69);
        }
        this.f369186u = i69;
        int i78 = 0;
        for (int i79 = 0; i79 < this.F.size(); i79++) {
            i78 += p16.j.c(((java.lang.Integer) this.F.get(i79)).intValue());
        }
        int i86 = i77 + i78;
        if (!this.F.isEmpty()) {
            i86 = i86 + 2 + p16.j.c(i78);
        }
        this.G = i78;
        for (int i87 = 0; i87 < this.H.size(); i87++) {
            i86 += p16.j.d(23, (p16.h0) this.H.get(i87));
        }
        int i88 = 0;
        for (int i89 = 0; i89 < this.I.size(); i89++) {
            i88 += p16.j.c(((java.lang.Integer) this.I.get(i89)).intValue());
        }
        int i96 = i86 + i88;
        if (!this.I.isEmpty()) {
            i96 = i96 + 2 + p16.j.c(i88);
        }
        this.f369172J = i88;
        if ((this.f369174f & 64) == 64) {
            i96 += p16.j.d(30, this.K);
        }
        int i97 = 0;
        for (int i98 = 0; i98 < this.L.size(); i98++) {
            i97 += p16.j.c(((java.lang.Integer) this.L.get(i98)).intValue());
        }
        int size = i96 + i97 + (this.L.size() * 2);
        if ((this.f369174f & 128) == 128) {
            size += p16.j.d(32, this.M);
        }
        int e17 = size + e() + this.f369173e.mo157707x35e001();
        this.P = e17;
        return e17;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.N;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!((this.f369174f & 2) == 2)) {
            this.N = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.f369178m.size(); i17++) {
            if (!((i16.s1) this.f369178m.get(i17)).mo134563xf582434a()) {
                this.N = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f369179n.size(); i18++) {
            if (!((i16.l1) this.f369179n.get(i18)).mo134563xf582434a()) {
                this.N = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f369184s.size(); i19++) {
            if (!((i16.l1) this.f369184s.get(i19)).mo134563xf582434a()) {
                this.N = (byte) 0;
                return false;
            }
        }
        for (int i27 = 0; i27 < this.f369187v.size(); i27++) {
            if (!((i16.r) this.f369187v.get(i27)).mo134563xf582434a()) {
                this.N = (byte) 0;
                return false;
            }
        }
        for (int i28 = 0; i28 < this.f369188w.size(); i28++) {
            if (!((i16.j0) this.f369188w.get(i28)).mo134563xf582434a()) {
                this.N = (byte) 0;
                return false;
            }
        }
        for (int i29 = 0; i29 < this.f369189x.size(); i29++) {
            if (!((i16.u0) this.f369189x.get(i29)).mo134563xf582434a()) {
                this.N = (byte) 0;
                return false;
            }
        }
        for (int i37 = 0; i37 < this.f369190y.size(); i37++) {
            if (!((i16.o1) this.f369190y.get(i37)).mo134563xf582434a()) {
                this.N = (byte) 0;
                return false;
            }
        }
        for (int i38 = 0; i38 < this.f369191z.size(); i38++) {
            if (!((i16.c0) this.f369191z.get(i38)).mo134563xf582434a()) {
                this.N = (byte) 0;
                return false;
            }
        }
        if (((this.f369174f & 16) == 16) && !this.D.mo134563xf582434a()) {
            this.N = (byte) 0;
            return false;
        }
        for (int i39 = 0; i39 < this.H.size(); i39++) {
            if (!((i16.l1) this.H.get(i39)).mo134563xf582434a()) {
                this.N = (byte) 0;
                return false;
            }
        }
        if (((this.f369174f & 64) == 64) && !this.K.mo134563xf582434a()) {
            this.N = (byte) 0;
            return false;
        }
        if (d()) {
            this.N = (byte) 1;
            return true;
        }
        this.N = (byte) 0;
        return false;
    }

    public final void l() {
        this.f369175g = 6;
        this.f369176h = 0;
        this.f369177i = 0;
        this.f369178m = java.util.Collections.emptyList();
        this.f369179n = java.util.Collections.emptyList();
        this.f369180o = java.util.Collections.emptyList();
        this.f369182q = java.util.Collections.emptyList();
        this.f369184s = java.util.Collections.emptyList();
        this.f369185t = java.util.Collections.emptyList();
        this.f369187v = java.util.Collections.emptyList();
        this.f369188w = java.util.Collections.emptyList();
        this.f369189x = java.util.Collections.emptyList();
        this.f369190y = java.util.Collections.emptyList();
        this.f369191z = java.util.Collections.emptyList();
        this.A = java.util.Collections.emptyList();
        this.C = 0;
        this.D = i16.l1.f369113z;
        this.E = 0;
        this.F = java.util.Collections.emptyList();
        this.H = java.util.Collections.emptyList();
        this.I = java.util.Collections.emptyList();
        this.K = i16.v1.f369316m;
        this.L = java.util.Collections.emptyList();
        this.M = i16.g2.f368997h;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.m();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.m mVar = new i16.m();
        mVar.e(this);
        return mVar;
    }

    public o(boolean z17) {
        this.f369181p = -1;
        this.f369183r = -1;
        this.f369186u = -1;
        this.B = -1;
        this.G = -1;
        this.f369172J = -1;
        this.N = (byte) -1;
        this.P = -1;
        this.f369173e = p16.g.f432816d;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public o(p16.h hVar, p16.l lVar) {
        boolean z17;
        i16.f2 f2Var;
        this.f369181p = -1;
        this.f369183r = -1;
        this.f369186u = -1;
        this.B = -1;
        this.G = -1;
        this.f369172J = -1;
        this.N = (byte) -1;
        this.P = -1;
        l();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z18 = false;
        char c17 = 0;
        while (!z18) {
            try {
                try {
                    int n17 = hVar.n();
                    switch (n17) {
                        case 0:
                            z17 = true;
                            z18 = z17;
                        case 8:
                            z17 = true;
                            this.f369174f |= 1;
                            this.f369175g = hVar.f();
                        case 16:
                            int i17 = (c17 == true ? 1 : 0) & 32;
                            char c18 = c17;
                            if (i17 != 32) {
                                this.f369180o = new java.util.ArrayList();
                                c18 = (c17 == true ? 1 : 0) | ' ';
                            }
                            this.f369180o.add(java.lang.Integer.valueOf(hVar.f()));
                            c17 = c18;
                            z17 = true;
                        case 18:
                            int d17 = hVar.d(hVar.k());
                            int i18 = (c17 == true ? 1 : 0) & 32;
                            char c19 = c17;
                            if (i18 != 32) {
                                c19 = c17;
                                if (hVar.b() > 0) {
                                    this.f369180o = new java.util.ArrayList();
                                    c19 = (c17 == true ? 1 : 0) | ' ';
                                }
                            }
                            while (hVar.b() > 0) {
                                this.f369180o.add(java.lang.Integer.valueOf(hVar.f()));
                            }
                            hVar.c(d17);
                            c17 = c19;
                            z17 = true;
                        case 24:
                            this.f369174f |= 2;
                            this.f369176h = hVar.f();
                            c17 = c17;
                            z17 = true;
                        case 32:
                            this.f369174f |= 4;
                            this.f369177i = hVar.f();
                            c17 = c17;
                            z17 = true;
                        case 42:
                            int i19 = (c17 == true ? 1 : 0) & 8;
                            char c27 = c17;
                            if (i19 != 8) {
                                this.f369178m = new java.util.ArrayList();
                                c27 = (c17 == true ? 1 : 0) | '\b';
                            }
                            this.f369178m.add(hVar.g(i16.s1.f369259t, lVar));
                            c17 = c27;
                            z17 = true;
                        case 50:
                            int i27 = (c17 == true ? 1 : 0) & 16;
                            char c28 = c17;
                            if (i27 != 16) {
                                this.f369179n = new java.util.ArrayList();
                                c28 = (c17 == true ? 1 : 0) | 16;
                            }
                            this.f369179n.add(hVar.g(i16.l1.A, lVar));
                            c17 = c28;
                            z17 = true;
                        case 56:
                            int i28 = (c17 == true ? 1 : 0) & 64;
                            char c29 = c17;
                            if (i28 != 64) {
                                this.f369182q = new java.util.ArrayList();
                                c29 = (c17 == true ? 1 : 0) | '@';
                            }
                            this.f369182q.add(java.lang.Integer.valueOf(hVar.f()));
                            c17 = c29;
                            z17 = true;
                        case 58:
                            int d18 = hVar.d(hVar.k());
                            int i29 = (c17 == true ? 1 : 0) & 64;
                            char c37 = c17;
                            if (i29 != 64) {
                                c37 = c17;
                                if (hVar.b() > 0) {
                                    this.f369182q = new java.util.ArrayList();
                                    c37 = (c17 == true ? 1 : 0) | '@';
                                }
                            }
                            while (hVar.b() > 0) {
                                this.f369182q.add(java.lang.Integer.valueOf(hVar.f()));
                            }
                            hVar.c(d18);
                            c17 = c37;
                            z17 = true;
                        case 66:
                            int i37 = (c17 == true ? 1 : 0) & 512;
                            char c38 = c17;
                            if (i37 != 512) {
                                this.f369187v = new java.util.ArrayList();
                                c38 = (c17 == true ? 1 : 0) | 512;
                            }
                            this.f369187v.add(hVar.g(i16.r.f369235p, lVar));
                            c17 = c38;
                            z17 = true;
                        case 74:
                            int i38 = (c17 == true ? 1 : 0) & 1024;
                            char c39 = c17;
                            if (i38 != 1024) {
                                this.f369188w = new java.util.ArrayList();
                                c39 = (c17 == true ? 1 : 0) | 1024;
                            }
                            this.f369188w.add(hVar.g(i16.j0.B, lVar));
                            c17 = c39;
                            z17 = true;
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45675x92fdfc4b /* 82 */:
                            int i39 = (c17 == true ? 1 : 0) & 2048;
                            char c47 = c17;
                            if (i39 != 2048) {
                                this.f369189x = new java.util.ArrayList();
                                c47 = (c17 == true ? 1 : 0) | 2048;
                            }
                            this.f369189x.add(hVar.g(i16.u0.B, lVar));
                            c17 = c47;
                            z17 = true;
                        case 90:
                            int i47 = (c17 == true ? 1 : 0) & 4096;
                            char c48 = c17;
                            if (i47 != 4096) {
                                this.f369190y = new java.util.ArrayList();
                                c48 = (c17 == true ? 1 : 0) | 4096;
                            }
                            this.f369190y.add(hVar.g(i16.o1.f369204v, lVar));
                            c17 = c48;
                            z17 = true;
                        case 106:
                            int i48 = (c17 == true ? 1 : 0) & 8192;
                            char c49 = c17;
                            if (i48 != 8192) {
                                this.f369191z = new java.util.ArrayList();
                                c49 = (c17 == true ? 1 : 0) | 8192;
                            }
                            this.f369191z.add(hVar.g(i16.c0.f368908n, lVar));
                            c17 = c49;
                            z17 = true;
                        case 128:
                            int i49 = (c17 == true ? 1 : 0) & 16384;
                            char c57 = c17;
                            if (i49 != 16384) {
                                this.A = new java.util.ArrayList();
                                c57 = (c17 == true ? 1 : 0) | 16384;
                            }
                            this.A.add(java.lang.Integer.valueOf(hVar.f()));
                            c17 = c57;
                            z17 = true;
                        case 130:
                            int d19 = hVar.d(hVar.k());
                            int i57 = (c17 == true ? 1 : 0) & 16384;
                            char c58 = c17;
                            if (i57 != 16384) {
                                c58 = c17;
                                if (hVar.b() > 0) {
                                    this.A = new java.util.ArrayList();
                                    c58 = (c17 == true ? 1 : 0) | 16384;
                                }
                            }
                            while (hVar.b() > 0) {
                                this.A.add(java.lang.Integer.valueOf(hVar.f()));
                            }
                            hVar.c(d19);
                            c17 = c58;
                            z17 = true;
                        case 136:
                            this.f369174f |= 8;
                            this.C = hVar.f();
                            c17 = c17;
                            z17 = true;
                        case 146:
                            i16.k1 n18 = (this.f369174f & 16) == 16 ? this.D.n() : null;
                            i16.l1 l1Var = (i16.l1) hVar.g(i16.l1.A, lVar);
                            this.D = l1Var;
                            if (n18 != null) {
                                n18.b(l1Var);
                                this.D = n18.d();
                            }
                            this.f369174f |= 16;
                            c17 = c17;
                            z17 = true;
                        case 152:
                            this.f369174f |= 32;
                            this.E = hVar.f();
                            c17 = c17;
                            z17 = true;
                        case 162:
                            int i58 = (c17 == true ? 1 : 0) & 128;
                            char c59 = c17;
                            if (i58 != 128) {
                                this.f369184s = new java.util.ArrayList();
                                c59 = (c17 == true ? 1 : 0) | 128;
                            }
                            this.f369184s.add(hVar.g(i16.l1.A, lVar));
                            c17 = c59;
                            z17 = true;
                        case be1.r0.f4232x366c91de /* 168 */:
                            int i59 = (c17 == true ? 1 : 0) & 256;
                            char c67 = c17;
                            if (i59 != 256) {
                                this.f369185t = new java.util.ArrayList();
                                c67 = (c17 == true ? 1 : 0) | 256;
                            }
                            this.f369185t.add(java.lang.Integer.valueOf(hVar.f()));
                            c17 = c67;
                            z17 = true;
                        case 170:
                            int d27 = hVar.d(hVar.k());
                            int i66 = (c17 == true ? 1 : 0) & 256;
                            char c68 = c17;
                            if (i66 != 256) {
                                c68 = c17;
                                if (hVar.b() > 0) {
                                    this.f369185t = new java.util.ArrayList();
                                    c68 = (c17 == true ? 1 : 0) | 256;
                                }
                            }
                            while (hVar.b() > 0) {
                                this.f369185t.add(java.lang.Integer.valueOf(hVar.f()));
                            }
                            hVar.c(d27);
                            c17 = c68;
                            z17 = true;
                        case 176:
                            int i67 = (c17 == true ? 1 : 0) & 262144;
                            char c69 = c17;
                            if (i67 != 262144) {
                                this.F = new java.util.ArrayList();
                                c69 = (c17 == true ? 1 : 0) | 0;
                            }
                            this.F.add(java.lang.Integer.valueOf(hVar.f()));
                            c17 = c69;
                            z17 = true;
                        case 178:
                            int d28 = hVar.d(hVar.k());
                            int i68 = (c17 == true ? 1 : 0) & 262144;
                            char c76 = c17;
                            if (i68 != 262144) {
                                c76 = c17;
                                if (hVar.b() > 0) {
                                    this.F = new java.util.ArrayList();
                                    c76 = (c17 == true ? 1 : 0) | 0;
                                }
                            }
                            while (hVar.b() > 0) {
                                this.F.add(java.lang.Integer.valueOf(hVar.f()));
                            }
                            hVar.c(d28);
                            c17 = c76;
                            z17 = true;
                        case 186:
                            int i69 = (c17 == true ? 1 : 0) & 524288;
                            char c77 = c17;
                            if (i69 != 524288) {
                                this.H = new java.util.ArrayList();
                                c77 = (c17 == true ? 1 : 0) | 0;
                            }
                            this.H.add(hVar.g(i16.l1.A, lVar));
                            c17 = c77;
                            z17 = true;
                        case 192:
                            int i76 = (c17 == true ? 1 : 0) & 1048576;
                            char c78 = c17;
                            if (i76 != 1048576) {
                                this.I = new java.util.ArrayList();
                                c78 = (c17 == true ? 1 : 0) | 0;
                            }
                            this.I.add(java.lang.Integer.valueOf(hVar.f()));
                            c17 = c78;
                            z17 = true;
                        case 194:
                            int d29 = hVar.d(hVar.k());
                            int i77 = (c17 == true ? 1 : 0) & 1048576;
                            char c79 = c17;
                            if (i77 != 1048576) {
                                c79 = c17;
                                if (hVar.b() > 0) {
                                    this.I = new java.util.ArrayList();
                                    c79 = (c17 == true ? 1 : 0) | 0;
                                }
                            }
                            while (hVar.b() > 0) {
                                this.I.add(java.lang.Integer.valueOf(hVar.f()));
                            }
                            hVar.c(d29);
                            c17 = c79;
                            z17 = true;
                        case 242:
                            i16.u1 e17 = (this.f369174f & 64) == 64 ? this.K.e() : null;
                            i16.v1 v1Var = (i16.v1) hVar.g(i16.v1.f369317n, lVar);
                            this.K = v1Var;
                            if (e17 != null) {
                                e17.d(v1Var);
                                this.K = e17.c();
                            }
                            this.f369174f |= 64;
                            c17 = c17;
                            z17 = true;
                        case 248:
                            int i78 = (c17 == true ? 1 : 0) & 4194304;
                            char c86 = c17;
                            if (i78 != 4194304) {
                                this.L = new java.util.ArrayList();
                                c86 = (c17 == true ? 1 : 0) | 0;
                            }
                            this.L.add(java.lang.Integer.valueOf(hVar.f()));
                            c17 = c86;
                            z17 = true;
                        case 250:
                            int d37 = hVar.d(hVar.k());
                            int i79 = (c17 == true ? 1 : 0) & 4194304;
                            char c87 = c17;
                            if (i79 != 4194304) {
                                c87 = c17;
                                if (hVar.b() > 0) {
                                    this.L = new java.util.ArrayList();
                                    c87 = (c17 == true ? 1 : 0) | 0;
                                }
                            }
                            while (hVar.b() > 0) {
                                this.L.add(java.lang.Integer.valueOf(hVar.f()));
                            }
                            hVar.c(d37);
                            c17 = c87;
                            z17 = true;
                        case 258:
                            if ((this.f369174f & 128) == 128) {
                                i16.g2 g2Var = this.M;
                                g2Var.getClass();
                                f2Var = new i16.f2();
                                f2Var.d(g2Var);
                            } else {
                                f2Var = null;
                            }
                            i16.g2 g2Var2 = (i16.g2) hVar.g(i16.g2.f368998i, lVar);
                            this.M = g2Var2;
                            if (f2Var != null) {
                                f2Var.d(g2Var2);
                                this.M = f2Var.c();
                            }
                            this.f369174f |= 128;
                            c17 = c17;
                            z17 = true;
                        default:
                            z17 = true;
                            c17 = j(hVar, j17, lVar, n17) ? c17 : c17;
                            z18 = z17;
                    }
                } catch (java.lang.Throwable th6) {
                    if (((c17 == true ? 1 : 0) & 32) == 32) {
                        this.f369180o = java.util.Collections.unmodifiableList(this.f369180o);
                    }
                    if (((c17 == true ? 1 : 0) & 8) == 8) {
                        this.f369178m = java.util.Collections.unmodifiableList(this.f369178m);
                    }
                    if (((c17 == true ? 1 : 0) & 16) == 16) {
                        this.f369179n = java.util.Collections.unmodifiableList(this.f369179n);
                    }
                    if (((c17 == true ? 1 : 0) & 64) == 64) {
                        this.f369182q = java.util.Collections.unmodifiableList(this.f369182q);
                    }
                    if (((c17 == true ? 1 : 0) & 512) == 512) {
                        this.f369187v = java.util.Collections.unmodifiableList(this.f369187v);
                    }
                    if (((c17 == true ? 1 : 0) & 1024) == 1024) {
                        this.f369188w = java.util.Collections.unmodifiableList(this.f369188w);
                    }
                    if (((c17 == true ? 1 : 0) & 2048) == 2048) {
                        this.f369189x = java.util.Collections.unmodifiableList(this.f369189x);
                    }
                    if (((c17 == true ? 1 : 0) & 4096) == 4096) {
                        this.f369190y = java.util.Collections.unmodifiableList(this.f369190y);
                    }
                    if (((c17 == true ? 1 : 0) & 8192) == 8192) {
                        this.f369191z = java.util.Collections.unmodifiableList(this.f369191z);
                    }
                    if (((c17 == true ? 1 : 0) & 16384) == 16384) {
                        this.A = java.util.Collections.unmodifiableList(this.A);
                    }
                    if (((c17 == true ? 1 : 0) & 128) == 128) {
                        this.f369184s = java.util.Collections.unmodifiableList(this.f369184s);
                    }
                    if (((c17 == true ? 1 : 0) & 256) == 256) {
                        this.f369185t = java.util.Collections.unmodifiableList(this.f369185t);
                    }
                    if (((c17 == true ? 1 : 0) & 262144) == 262144) {
                        this.F = java.util.Collections.unmodifiableList(this.F);
                    }
                    if (((c17 == true ? 1 : 0) & 524288) == 524288) {
                        this.H = java.util.Collections.unmodifiableList(this.H);
                    }
                    if (((c17 == true ? 1 : 0) & 1048576) == 1048576) {
                        this.I = java.util.Collections.unmodifiableList(this.I);
                    }
                    if (((c17 == true ? 1 : 0) & 4194304) == 4194304) {
                        this.L = java.util.Collections.unmodifiableList(this.L);
                    }
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                        this.f369173e = m17.c();
                        h();
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        this.f369173e = m17.c();
                        throw th7;
                    }
                }
            } catch (p16.z e18) {
                e18.a(this);
                throw e18;
            } catch (java.io.IOException e19) {
                p16.z zVar = new p16.z(e19.getMessage());
                zVar.a(this);
                throw zVar;
            }
        }
        if (((c17 == true ? 1 : 0) & 32) == 32) {
            this.f369180o = java.util.Collections.unmodifiableList(this.f369180o);
        }
        if (((c17 == true ? 1 : 0) & 8) == 8) {
            this.f369178m = java.util.Collections.unmodifiableList(this.f369178m);
        }
        if (((c17 == true ? 1 : 0) & 16) == 16) {
            this.f369179n = java.util.Collections.unmodifiableList(this.f369179n);
        }
        if (((c17 == true ? 1 : 0) & 64) == 64) {
            this.f369182q = java.util.Collections.unmodifiableList(this.f369182q);
        }
        if (((c17 == true ? 1 : 0) & 512) == 512) {
            this.f369187v = java.util.Collections.unmodifiableList(this.f369187v);
        }
        if (((c17 == true ? 1 : 0) & 1024) == 1024) {
            this.f369188w = java.util.Collections.unmodifiableList(this.f369188w);
        }
        if (((c17 == true ? 1 : 0) & 2048) == 2048) {
            this.f369189x = java.util.Collections.unmodifiableList(this.f369189x);
        }
        if (((c17 == true ? 1 : 0) & 4096) == 4096) {
            this.f369190y = java.util.Collections.unmodifiableList(this.f369190y);
        }
        if (((c17 == true ? 1 : 0) & 8192) == 8192) {
            this.f369191z = java.util.Collections.unmodifiableList(this.f369191z);
        }
        if (((c17 == true ? 1 : 0) & 16384) == 16384) {
            this.A = java.util.Collections.unmodifiableList(this.A);
        }
        if (((c17 == true ? 1 : 0) & 128) == 128) {
            this.f369184s = java.util.Collections.unmodifiableList(this.f369184s);
        }
        if (((c17 == true ? 1 : 0) & 256) == 256) {
            this.f369185t = java.util.Collections.unmodifiableList(this.f369185t);
        }
        if (((c17 == true ? 1 : 0) & 262144) == 262144) {
            this.F = java.util.Collections.unmodifiableList(this.F);
        }
        if (((c17 == true ? 1 : 0) & 524288) == 524288) {
            this.H = java.util.Collections.unmodifiableList(this.H);
        }
        if (((c17 == true ? 1 : 0) & 1048576) == 1048576) {
            this.I = java.util.Collections.unmodifiableList(this.I);
        }
        if (((c17 == true ? 1 : 0) & 4194304) == 4194304) {
            this.L = java.util.Collections.unmodifiableList(this.L);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
            this.f369173e = m17.c();
            h();
        } catch (java.lang.Throwable th8) {
            this.f369173e = m17.c();
            throw th8;
        }
    }
}
