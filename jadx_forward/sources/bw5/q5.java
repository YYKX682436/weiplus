package bw5;

/* loaded from: classes9.dex */
public class q5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public boolean B;
    public int C;
    public java.lang.String D;
    public int E;
    public bw5.p5 F;
    public java.lang.String G;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f113473J;
    public int K;
    public int L;
    public java.lang.String M;
    public bw5.p20 N;
    public int P;
    public java.lang.String Q;
    public boolean R;
    public java.lang.String S;
    public java.lang.String T;
    public java.lang.String U;
    public java.lang.String W;
    public int X;
    public int Y;
    public java.lang.String Z;

    /* renamed from: d, reason: collision with root package name */
    public long f113474d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113475e;

    /* renamed from: g, reason: collision with root package name */
    public int f113477g;

    /* renamed from: h, reason: collision with root package name */
    public int f113478h;

    /* renamed from: i, reason: collision with root package name */
    public int f113479i;

    /* renamed from: l1, reason: collision with root package name */
    public bw5.j5 f113480l1;

    /* renamed from: m, reason: collision with root package name */
    public int f113481m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f113482n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.i5 f113483o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.i5 f113484p;

    /* renamed from: p0, reason: collision with root package name */
    public bw5.n5 f113485p0;

    /* renamed from: p1, reason: collision with root package name */
    public bw5.x7 f113486p1;

    /* renamed from: q, reason: collision with root package name */
    public int f113487q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f113488r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f113489s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f113490t;

    /* renamed from: u, reason: collision with root package name */
    public int f113491u;

    /* renamed from: w, reason: collision with root package name */
    public int f113493w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f113494x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f113495x0;

    /* renamed from: x1, reason: collision with root package name */
    public bw5.x7 f113496x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f113497y;

    /* renamed from: y0, reason: collision with root package name */
    public int f113498y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f113500z;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f113476f = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f113492v = new java.util.LinkedList();
    public final java.util.LinkedList A = new java.util.LinkedList();
    public final java.util.LinkedList H = new java.util.LinkedList();
    public final java.util.LinkedList V = new java.util.LinkedList();

    /* renamed from: y1, reason: collision with root package name */
    public final android.util.ArrayMap f113499y1 = new android.util.ArrayMap();

    static {
        new bw5.q5();
    }

    public bw5.x7 b() {
        return m12793x6e095e9(202) ? this.f113486p1 : new bw5.x7();
    }

    public bw5.i5 c() {
        return m12793x6e095e9(10) ? this.f113484p : new bw5.i5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q5)) {
            return false;
        }
        bw5.q5 q5Var = (bw5.q5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f113474d), java.lang.Long.valueOf(q5Var.f113474d)) && n51.f.a(this.f113475e, q5Var.f113475e) && n51.f.a(this.f113476f, q5Var.f113476f) && n51.f.a(java.lang.Integer.valueOf(this.f113477g), java.lang.Integer.valueOf(q5Var.f113477g)) && n51.f.a(java.lang.Integer.valueOf(this.f113478h), java.lang.Integer.valueOf(q5Var.f113478h)) && n51.f.a(java.lang.Integer.valueOf(this.f113479i), java.lang.Integer.valueOf(q5Var.f113479i)) && n51.f.a(java.lang.Integer.valueOf(this.f113481m), java.lang.Integer.valueOf(q5Var.f113481m)) && n51.f.a(this.f113482n, q5Var.f113482n) && n51.f.a(this.f113483o, q5Var.f113483o) && n51.f.a(this.f113484p, q5Var.f113484p) && n51.f.a(java.lang.Integer.valueOf(this.f113487q), java.lang.Integer.valueOf(q5Var.f113487q)) && n51.f.a(this.f113488r, q5Var.f113488r) && n51.f.a(this.f113489s, q5Var.f113489s) && n51.f.a(this.f113490t, q5Var.f113490t) && n51.f.a(java.lang.Integer.valueOf(this.f113491u), java.lang.Integer.valueOf(q5Var.f113491u)) && n51.f.a(this.f113492v, q5Var.f113492v) && n51.f.a(java.lang.Integer.valueOf(this.f113493w), java.lang.Integer.valueOf(q5Var.f113493w)) && n51.f.a(this.f113494x, q5Var.f113494x) && n51.f.a(this.f113497y, q5Var.f113497y) && n51.f.a(java.lang.Boolean.valueOf(this.f113500z), java.lang.Boolean.valueOf(q5Var.f113500z)) && n51.f.a(this.A, q5Var.A) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(q5Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(q5Var.C)) && n51.f.a(this.D, q5Var.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(q5Var.E)) && n51.f.a(this.F, q5Var.F) && n51.f.a(this.G, q5Var.G) && n51.f.a(this.H, q5Var.H) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(q5Var.I)) && n51.f.a(java.lang.Integer.valueOf(this.f113473J), java.lang.Integer.valueOf(q5Var.f113473J)) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(q5Var.K)) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(q5Var.L)) && n51.f.a(this.M, q5Var.M) && n51.f.a(this.N, q5Var.N) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(q5Var.P)) && n51.f.a(this.Q, q5Var.Q) && n51.f.a(java.lang.Boolean.valueOf(this.R), java.lang.Boolean.valueOf(q5Var.R)) && n51.f.a(this.S, q5Var.S) && n51.f.a(this.T, q5Var.T) && n51.f.a(this.U, q5Var.U) && n51.f.a(this.V, q5Var.V) && n51.f.a(this.W, q5Var.W) && n51.f.a(java.lang.Integer.valueOf(this.X), java.lang.Integer.valueOf(q5Var.X)) && n51.f.a(java.lang.Integer.valueOf(this.Y), java.lang.Integer.valueOf(q5Var.Y)) && n51.f.a(this.Z, q5Var.Z) && n51.f.a(this.f113485p0, q5Var.f113485p0) && n51.f.a(this.f113495x0, q5Var.f113495x0) && n51.f.a(java.lang.Integer.valueOf(this.f113498y0), java.lang.Integer.valueOf(q5Var.f113498y0)) && n51.f.a(this.f113480l1, q5Var.f113480l1) && n51.f.a(this.f113486p1, q5Var.f113486p1) && n51.f.a(this.f113496x1, q5Var.f113496x1);
    }

    public java.lang.String d() {
        return m12793x6e095e9(24) ? this.D : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public bw5.q5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.q5) super.mo11468x92b714fd(bArr);
    }

    /* renamed from: getTitle */
    public java.lang.String m12792x7531c8a2() {
        return m12793x6e095e9(2) ? this.f113475e : "";
    }

    /* renamed from: hasFieldNumber */
    public boolean m12793x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f113499y1.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.q5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (m12793x6e095e9(1)) {
                fVar.h(1, this.f113474d);
            }
            if (this.f113475e != null && m12793x6e095e9(2)) {
                fVar.j(2, this.f113475e);
            }
            fVar.g(3, 1, this.f113476f);
            if (m12793x6e095e9(4)) {
                fVar.f(4, this.f113477g);
            }
            if (m12793x6e095e9(5)) {
                fVar.f(5, this.f113478h);
            }
            if (m12793x6e095e9(6)) {
                fVar.f(6, this.f113479i);
            }
            if (m12793x6e095e9(7)) {
                fVar.f(7, this.f113481m);
            }
            if (this.f113482n != null && m12793x6e095e9(8)) {
                fVar.j(8, this.f113482n);
            }
            if (this.f113483o != null && m12793x6e095e9(9)) {
                fVar.i(9, this.f113483o.mo75928xcd1e8d8());
                this.f113483o.mo75956x3d5d1f78(fVar);
            }
            if (this.f113484p != null && m12793x6e095e9(10)) {
                fVar.i(10, this.f113484p.mo75928xcd1e8d8());
                this.f113484p.mo75956x3d5d1f78(fVar);
            }
            if (m12793x6e095e9(11)) {
                fVar.f(11, this.f113487q);
            }
            if (this.f113488r != null && m12793x6e095e9(12)) {
                fVar.j(12, this.f113488r);
            }
            if (this.f113489s != null && m12793x6e095e9(13)) {
                fVar.j(13, this.f113489s);
            }
            if (this.f113490t != null && m12793x6e095e9(14)) {
                fVar.j(14, this.f113490t);
            }
            if (m12793x6e095e9(15)) {
                fVar.f(15, this.f113491u);
            }
            fVar.g(16, 8, this.f113492v);
            if (m12793x6e095e9(17)) {
                fVar.f(17, this.f113493w);
            }
            if (this.f113494x != null && m12793x6e095e9(18)) {
                fVar.j(18, this.f113494x);
            }
            if (this.f113497y != null && m12793x6e095e9(19)) {
                fVar.j(19, this.f113497y);
            }
            if (m12793x6e095e9(20)) {
                fVar.a(20, this.f113500z);
            }
            fVar.g(21, 8, this.A);
            if (m12793x6e095e9(22)) {
                fVar.a(22, this.B);
            }
            if (m12793x6e095e9(23)) {
                fVar.f(23, this.C);
            }
            if (this.D != null && m12793x6e095e9(24)) {
                fVar.j(24, this.D);
            }
            if (m12793x6e095e9(25)) {
                fVar.f(25, this.E);
            }
            if (this.F != null && m12793x6e095e9(26)) {
                fVar.i(26, this.F.mo75928xcd1e8d8());
                this.F.mo75956x3d5d1f78(fVar);
            }
            if (this.G != null && m12793x6e095e9(27)) {
                fVar.j(27, this.G);
            }
            fVar.g(28, 1, this.H);
            if (m12793x6e095e9(29)) {
                fVar.f(29, this.I);
            }
            if (m12793x6e095e9(30)) {
                fVar.f(30, this.f113473J);
            }
            if (m12793x6e095e9(31)) {
                fVar.f(31, this.K);
            }
            if (m12793x6e095e9(32)) {
                fVar.f(32, this.L);
            }
            if (this.M != null && m12793x6e095e9(33)) {
                fVar.j(33, this.M);
            }
            if (this.N != null && m12793x6e095e9(34)) {
                fVar.i(34, this.N.mo75928xcd1e8d8());
                this.N.mo75956x3d5d1f78(fVar);
            }
            if (m12793x6e095e9(35)) {
                fVar.f(35, this.P);
            }
            if (this.Q != null && m12793x6e095e9(36)) {
                fVar.j(36, this.Q);
            }
            if (m12793x6e095e9(37)) {
                fVar.a(37, this.R);
            }
            if (this.S != null && m12793x6e095e9(38)) {
                fVar.j(38, this.S);
            }
            if (this.T != null && m12793x6e095e9(39)) {
                fVar.j(39, this.T);
            }
            if (this.U != null && m12793x6e095e9(41)) {
                fVar.j(41, this.U);
            }
            fVar.g(46, 8, this.V);
            if (this.W != null && m12793x6e095e9(47)) {
                fVar.j(47, this.W);
            }
            if (m12793x6e095e9(48)) {
                fVar.f(48, this.X);
            }
            if (m12793x6e095e9(49)) {
                fVar.f(49, this.Y);
            }
            if (this.Z != null && m12793x6e095e9(50)) {
                fVar.j(50, this.Z);
            }
            if (this.f113485p0 != null && m12793x6e095e9(56)) {
                fVar.i(56, this.f113485p0.mo75928xcd1e8d8());
                this.f113485p0.mo75956x3d5d1f78(fVar);
            }
            if (this.f113495x0 != null && m12793x6e095e9(69)) {
                fVar.j(69, this.f113495x0);
            }
            if (m12793x6e095e9(200)) {
                fVar.f(200, this.f113498y0);
            }
            if (this.f113480l1 != null && m12793x6e095e9(201)) {
                fVar.i(201, this.f113480l1.mo75928xcd1e8d8());
                this.f113480l1.mo75956x3d5d1f78(fVar);
            }
            if (this.f113486p1 != null && m12793x6e095e9(202)) {
                fVar.i(202, this.f113486p1.mo75928xcd1e8d8());
                this.f113486p1.mo75956x3d5d1f78(fVar);
            }
            if (this.f113496x1 != null && m12793x6e095e9(203)) {
                fVar.i(203, this.f113496x1.mo75928xcd1e8d8());
                this.f113496x1.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = m12793x6e095e9(1) ? b36.f.h(1, this.f113474d) + 0 : 0;
            if (this.f113475e != null && m12793x6e095e9(2)) {
                h17 += b36.f.j(2, this.f113475e);
            }
            int g17 = h17 + b36.f.g(3, 1, this.f113476f);
            if (m12793x6e095e9(4)) {
                g17 += b36.f.f(4, this.f113477g);
            }
            if (m12793x6e095e9(5)) {
                g17 += b36.f.f(5, this.f113478h);
            }
            if (m12793x6e095e9(6)) {
                g17 += b36.f.f(6, this.f113479i);
            }
            if (m12793x6e095e9(7)) {
                g17 += b36.f.f(7, this.f113481m);
            }
            if (this.f113482n != null && m12793x6e095e9(8)) {
                g17 += b36.f.j(8, this.f113482n);
            }
            if (this.f113483o != null && m12793x6e095e9(9)) {
                g17 += b36.f.i(9, this.f113483o.mo75928xcd1e8d8());
            }
            if (this.f113484p != null && m12793x6e095e9(10)) {
                g17 += b36.f.i(10, this.f113484p.mo75928xcd1e8d8());
            }
            if (m12793x6e095e9(11)) {
                g17 += b36.f.f(11, this.f113487q);
            }
            if (this.f113488r != null && m12793x6e095e9(12)) {
                g17 += b36.f.j(12, this.f113488r);
            }
            if (this.f113489s != null && m12793x6e095e9(13)) {
                g17 += b36.f.j(13, this.f113489s);
            }
            if (this.f113490t != null && m12793x6e095e9(14)) {
                g17 += b36.f.j(14, this.f113490t);
            }
            if (m12793x6e095e9(15)) {
                g17 += b36.f.f(15, this.f113491u);
            }
            int g18 = g17 + b36.f.g(16, 8, this.f113492v);
            if (m12793x6e095e9(17)) {
                g18 += b36.f.f(17, this.f113493w);
            }
            if (this.f113494x != null && m12793x6e095e9(18)) {
                g18 += b36.f.j(18, this.f113494x);
            }
            if (this.f113497y != null && m12793x6e095e9(19)) {
                g18 += b36.f.j(19, this.f113497y);
            }
            if (m12793x6e095e9(20)) {
                g18 += b36.f.a(20, this.f113500z);
            }
            int g19 = g18 + b36.f.g(21, 8, this.A);
            if (m12793x6e095e9(22)) {
                g19 += b36.f.a(22, this.B);
            }
            if (m12793x6e095e9(23)) {
                g19 += b36.f.f(23, this.C);
            }
            if (this.D != null && m12793x6e095e9(24)) {
                g19 += b36.f.j(24, this.D);
            }
            if (m12793x6e095e9(25)) {
                g19 += b36.f.f(25, this.E);
            }
            if (this.F != null && m12793x6e095e9(26)) {
                g19 += b36.f.i(26, this.F.mo75928xcd1e8d8());
            }
            if (this.G != null && m12793x6e095e9(27)) {
                g19 += b36.f.j(27, this.G);
            }
            int g27 = g19 + b36.f.g(28, 1, this.H);
            if (m12793x6e095e9(29)) {
                g27 += b36.f.f(29, this.I);
            }
            if (m12793x6e095e9(30)) {
                g27 += b36.f.f(30, this.f113473J);
            }
            if (m12793x6e095e9(31)) {
                g27 += b36.f.f(31, this.K);
            }
            if (m12793x6e095e9(32)) {
                g27 += b36.f.f(32, this.L);
            }
            if (this.M != null && m12793x6e095e9(33)) {
                g27 += b36.f.j(33, this.M);
            }
            if (this.N != null && m12793x6e095e9(34)) {
                g27 += b36.f.i(34, this.N.mo75928xcd1e8d8());
            }
            if (m12793x6e095e9(35)) {
                g27 += b36.f.f(35, this.P);
            }
            if (this.Q != null && m12793x6e095e9(36)) {
                g27 += b36.f.j(36, this.Q);
            }
            if (m12793x6e095e9(37)) {
                g27 += b36.f.a(37, this.R);
            }
            if (this.S != null && m12793x6e095e9(38)) {
                g27 += b36.f.j(38, this.S);
            }
            if (this.T != null && m12793x6e095e9(39)) {
                g27 += b36.f.j(39, this.T);
            }
            if (this.U != null && m12793x6e095e9(41)) {
                g27 += b36.f.j(41, this.U);
            }
            int g28 = g27 + b36.f.g(46, 8, this.V);
            if (this.W != null && m12793x6e095e9(47)) {
                g28 += b36.f.j(47, this.W);
            }
            if (m12793x6e095e9(48)) {
                g28 += b36.f.f(48, this.X);
            }
            if (m12793x6e095e9(49)) {
                g28 += b36.f.f(49, this.Y);
            }
            if (this.Z != null && m12793x6e095e9(50)) {
                g28 += b36.f.j(50, this.Z);
            }
            if (this.f113485p0 != null && m12793x6e095e9(56)) {
                g28 += b36.f.i(56, this.f113485p0.mo75928xcd1e8d8());
            }
            if (this.f113495x0 != null && m12793x6e095e9(69)) {
                g28 += b36.f.j(69, this.f113495x0);
            }
            if (m12793x6e095e9(200)) {
                g28 += b36.f.f(200, this.f113498y0);
            }
            if (this.f113480l1 != null && m12793x6e095e9(201)) {
                g28 += b36.f.i(201, this.f113480l1.mo75928xcd1e8d8());
            }
            if (this.f113486p1 != null && m12793x6e095e9(202)) {
                g28 += b36.f.i(202, this.f113486p1.mo75928xcd1e8d8());
            }
            return (this.f113496x1 == null || !m12793x6e095e9(203)) ? g28 : g28 + b36.f.i(203, this.f113496x1.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f113476f.clear();
            this.f113492v.clear();
            this.A.clear();
            this.H.clear();
            this.V.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        android.util.ArrayMap arrayMap = this.f113499y1;
        if (intValue == 41) {
            this.U = aVar2.k(intValue);
            arrayMap.put(41, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 56) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.n5 n5Var = new bw5.n5();
                if (bArr != null && bArr.length > 0) {
                    n5Var.mo11468x92b714fd(bArr);
                }
                this.f113485p0 = n5Var;
            }
            arrayMap.put(56, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 69) {
            this.f113495x0 = aVar2.k(intValue);
            arrayMap.put(69, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f113474d = aVar2.i(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f113475e = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f113476f.add(aVar2.k(intValue));
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f113477g = aVar2.h(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f113478h = aVar2.h(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f113479i = aVar2.h(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f113481m = aVar2.h(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f113482n = aVar2.k(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.i5 i5Var = new bw5.i5();
                    if (bArr2 != null && bArr2.length > 0) {
                        i5Var.mo11468x92b714fd(bArr2);
                    }
                    this.f113483o = i5Var;
                }
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.i5 i5Var2 = new bw5.i5();
                    if (bArr3 != null && bArr3.length > 0) {
                        i5Var2.mo11468x92b714fd(bArr3);
                    }
                    this.f113484p = i5Var2;
                }
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                this.f113487q = aVar2.h(intValue);
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            case 12:
                this.f113488r = aVar2.k(intValue);
                arrayMap.put(12, java.lang.Boolean.TRUE);
                return 0;
            case 13:
                this.f113489s = aVar2.k(intValue);
                arrayMap.put(13, java.lang.Boolean.TRUE);
                return 0;
            case 14:
                this.f113490t = aVar2.k(intValue);
                arrayMap.put(14, java.lang.Boolean.TRUE);
                return 0;
            case 15:
                this.f113491u = aVar2.h(intValue);
                arrayMap.put(15, java.lang.Boolean.TRUE);
                return 0;
            case 16:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.h5 h5Var = new bw5.h5();
                    if (bArr4 != null && bArr4.length > 0) {
                        h5Var.mo11468x92b714fd(bArr4);
                    }
                    this.f113492v.add(h5Var);
                }
                arrayMap.put(16, java.lang.Boolean.TRUE);
                return 0;
            case 17:
                this.f113493w = aVar2.h(intValue);
                arrayMap.put(17, java.lang.Boolean.TRUE);
                return 0;
            case 18:
                this.f113494x = aVar2.k(intValue);
                arrayMap.put(18, java.lang.Boolean.TRUE);
                return 0;
            case 19:
                this.f113497y = aVar2.k(intValue);
                arrayMap.put(19, java.lang.Boolean.TRUE);
                return 0;
            case 20:
                this.f113500z = aVar2.c(intValue);
                arrayMap.put(20, java.lang.Boolean.TRUE);
                return 0;
            case 21:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.o5 o5Var = new bw5.o5();
                    if (bArr5 != null && bArr5.length > 0) {
                        o5Var.mo11468x92b714fd(bArr5);
                    }
                    this.A.add(o5Var);
                }
                arrayMap.put(21, java.lang.Boolean.TRUE);
                return 0;
            case 22:
                this.B = aVar2.c(intValue);
                arrayMap.put(22, java.lang.Boolean.TRUE);
                return 0;
            case 23:
                this.C = aVar2.h(intValue);
                arrayMap.put(23, java.lang.Boolean.TRUE);
                return 0;
            case 24:
                this.D = aVar2.k(intValue);
                arrayMap.put(24, java.lang.Boolean.TRUE);
                return 0;
            case 25:
                this.E = aVar2.h(intValue);
                arrayMap.put(25, java.lang.Boolean.TRUE);
                return 0;
            case 26:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.p5 p5Var = new bw5.p5();
                    if (bArr6 != null && bArr6.length > 0) {
                        p5Var.mo11468x92b714fd(bArr6);
                    }
                    this.F = p5Var;
                }
                arrayMap.put(26, java.lang.Boolean.TRUE);
                return 0;
            case 27:
                this.G = aVar2.k(intValue);
                arrayMap.put(27, java.lang.Boolean.TRUE);
                return 0;
            case 28:
                this.H.add(aVar2.k(intValue));
                arrayMap.put(28, java.lang.Boolean.TRUE);
                return 0;
            case 29:
                this.I = aVar2.h(intValue);
                arrayMap.put(29, java.lang.Boolean.TRUE);
                return 0;
            case 30:
                this.f113473J = aVar2.h(intValue);
                arrayMap.put(30, java.lang.Boolean.TRUE);
                return 0;
            case 31:
                this.K = aVar2.h(intValue);
                arrayMap.put(31, java.lang.Boolean.TRUE);
                return 0;
            case 32:
                this.L = aVar2.h(intValue);
                arrayMap.put(32, java.lang.Boolean.TRUE);
                return 0;
            case 33:
                this.M = aVar2.k(intValue);
                arrayMap.put(33, java.lang.Boolean.TRUE);
                return 0;
            case 34:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.p20 p20Var = new bw5.p20();
                    if (bArr7 != null && bArr7.length > 0) {
                        p20Var.mo11468x92b714fd(bArr7);
                    }
                    this.N = p20Var;
                }
                arrayMap.put(34, java.lang.Boolean.TRUE);
                return 0;
            case 35:
                this.P = aVar2.h(intValue);
                arrayMap.put(35, java.lang.Boolean.TRUE);
                return 0;
            case 36:
                this.Q = aVar2.k(intValue);
                arrayMap.put(36, java.lang.Boolean.TRUE);
                return 0;
            case 37:
                this.R = aVar2.c(intValue);
                arrayMap.put(37, java.lang.Boolean.TRUE);
                return 0;
            case 38:
                this.S = aVar2.k(intValue);
                arrayMap.put(38, java.lang.Boolean.TRUE);
                return 0;
            case 39:
                this.T = aVar2.k(intValue);
                arrayMap.put(39, java.lang.Boolean.TRUE);
                return 0;
            default:
                switch (intValue) {
                    case 46:
                        java.util.LinkedList j38 = aVar2.j(intValue);
                        int size8 = j38.size();
                        for (int i39 = 0; i39 < size8; i39++) {
                            byte[] bArr8 = (byte[]) j38.get(i39);
                            bw5.l5 l5Var = new bw5.l5();
                            if (bArr8 != null && bArr8.length > 0) {
                                l5Var.mo11468x92b714fd(bArr8);
                            }
                            this.V.add(l5Var);
                        }
                        arrayMap.put(46, java.lang.Boolean.TRUE);
                        return 0;
                    case 47:
                        this.W = aVar2.k(intValue);
                        arrayMap.put(47, java.lang.Boolean.TRUE);
                        return 0;
                    case 48:
                        this.X = aVar2.h(intValue);
                        arrayMap.put(48, java.lang.Boolean.TRUE);
                        return 0;
                    case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                        this.Y = aVar2.h(intValue);
                        arrayMap.put(49, java.lang.Boolean.TRUE);
                        return 0;
                    case 50:
                        this.Z = aVar2.k(intValue);
                        arrayMap.put(50, java.lang.Boolean.TRUE);
                        return 0;
                    default:
                        switch (intValue) {
                            case 200:
                                this.f113498y0 = aVar2.h(intValue);
                                arrayMap.put(200, java.lang.Boolean.TRUE);
                                return 0;
                            case 201:
                                java.util.LinkedList j39 = aVar2.j(intValue);
                                int size9 = j39.size();
                                for (int i47 = 0; i47 < size9; i47++) {
                                    byte[] bArr9 = (byte[]) j39.get(i47);
                                    bw5.j5 j5Var = new bw5.j5();
                                    if (bArr9 != null && bArr9.length > 0) {
                                        j5Var.mo11468x92b714fd(bArr9);
                                    }
                                    this.f113480l1 = j5Var;
                                }
                                arrayMap.put(201, java.lang.Boolean.TRUE);
                                return 0;
                            case 202:
                                java.util.LinkedList j47 = aVar2.j(intValue);
                                int size10 = j47.size();
                                for (int i48 = 0; i48 < size10; i48++) {
                                    byte[] bArr10 = (byte[]) j47.get(i48);
                                    bw5.x7 x7Var = new bw5.x7();
                                    if (bArr10 != null && bArr10.length > 0) {
                                        x7Var.mo11468x92b714fd(bArr10);
                                    }
                                    this.f113486p1 = x7Var;
                                }
                                arrayMap.put(202, java.lang.Boolean.TRUE);
                                return 0;
                            case 203:
                                java.util.LinkedList j48 = aVar2.j(intValue);
                                int size11 = j48.size();
                                for (int i49 = 0; i49 < size11; i49++) {
                                    byte[] bArr11 = (byte[]) j48.get(i49);
                                    bw5.x7 x7Var2 = new bw5.x7();
                                    if (bArr11 != null && bArr11.length > 0) {
                                        x7Var2.mo11468x92b714fd(bArr11);
                                    }
                                    this.f113496x1 = x7Var2;
                                }
                                arrayMap.put(203, java.lang.Boolean.TRUE);
                                return 0;
                            default:
                                return -1;
                        }
                }
        }
    }
}
