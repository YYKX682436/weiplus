package bw5;

/* loaded from: classes2.dex */
public class d60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public bw5.i70 A;
    public java.lang.String C;
    public bw5.e80 D;
    public boolean E;
    public bw5.a60 F;
    public boolean G;
    public bw5.y50 H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.b60 f107873J;
    public boolean K;
    public bw5.c60 L;
    public int M;
    public java.lang.String N;
    public java.lang.String P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;
    public java.lang.String T;
    public java.lang.String U;
    public java.lang.String V;
    public java.lang.String W;
    public int X;
    public java.lang.String Y;

    /* renamed from: d, reason: collision with root package name */
    public boolean f107874d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f107875e;

    /* renamed from: f, reason: collision with root package name */
    public int f107876f;

    /* renamed from: g, reason: collision with root package name */
    public int f107877g;

    /* renamed from: h, reason: collision with root package name */
    public int f107878h;

    /* renamed from: i, reason: collision with root package name */
    public int f107879i;

    /* renamed from: l1, reason: collision with root package name */
    public bw5.z60 f107880l1;

    /* renamed from: m, reason: collision with root package name */
    public int f107881m;

    /* renamed from: n, reason: collision with root package name */
    public int f107882n;

    /* renamed from: p0, reason: collision with root package name */
    public bw5.xa0 f107885p0;

    /* renamed from: p1, reason: collision with root package name */
    public bw5.aa0 f107886p1;

    /* renamed from: q, reason: collision with root package name */
    public long f107887q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f107889s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f107890t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.h60 f107891u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f107892v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f107893w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f107894x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f107895x0;

    /* renamed from: x1, reason: collision with root package name */
    public bw5.c90 f107896x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f107897y;

    /* renamed from: y0, reason: collision with root package name */
    public long f107898y0;

    /* renamed from: z, reason: collision with root package name */
    public int f107900z;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f107883o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f107884p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f107888r = new java.util.LinkedList();
    public final java.util.LinkedList B = new java.util.LinkedList();
    public final java.util.LinkedList Z = new java.util.LinkedList();

    /* renamed from: y1, reason: collision with root package name */
    public final android.util.ArrayMap f107899y1 = new android.util.ArrayMap();

    static {
        new bw5.d60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.d60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.d60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.d60)) {
            return false;
        }
        bw5.d60 d60Var = (bw5.d60) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f107874d), java.lang.Boolean.valueOf(d60Var.f107874d)) && n51.f.a(java.lang.Boolean.valueOf(this.f107875e), java.lang.Boolean.valueOf(d60Var.f107875e)) && n51.f.a(java.lang.Integer.valueOf(this.f107876f), java.lang.Integer.valueOf(d60Var.f107876f)) && n51.f.a(java.lang.Integer.valueOf(this.f107877g), java.lang.Integer.valueOf(d60Var.f107877g)) && n51.f.a(java.lang.Integer.valueOf(this.f107878h), java.lang.Integer.valueOf(d60Var.f107878h)) && n51.f.a(java.lang.Integer.valueOf(this.f107879i), java.lang.Integer.valueOf(d60Var.f107879i)) && n51.f.a(java.lang.Integer.valueOf(this.f107881m), java.lang.Integer.valueOf(d60Var.f107881m)) && n51.f.a(java.lang.Integer.valueOf(this.f107882n), java.lang.Integer.valueOf(d60Var.f107882n)) && n51.f.a(this.f107883o, d60Var.f107883o) && n51.f.a(this.f107884p, d60Var.f107884p) && n51.f.a(java.lang.Long.valueOf(this.f107887q), java.lang.Long.valueOf(d60Var.f107887q)) && n51.f.a(this.f107888r, d60Var.f107888r) && n51.f.a(this.f107889s, d60Var.f107889s) && n51.f.a(java.lang.Boolean.valueOf(this.f107890t), java.lang.Boolean.valueOf(d60Var.f107890t)) && n51.f.a(this.f107891u, d60Var.f107891u) && n51.f.a(java.lang.Boolean.valueOf(this.f107892v), java.lang.Boolean.valueOf(d60Var.f107892v)) && n51.f.a(java.lang.Boolean.valueOf(this.f107893w), java.lang.Boolean.valueOf(d60Var.f107893w)) && n51.f.a(java.lang.Boolean.valueOf(this.f107894x), java.lang.Boolean.valueOf(d60Var.f107894x)) && n51.f.a(this.f107897y, d60Var.f107897y) && n51.f.a(java.lang.Integer.valueOf(this.f107900z), java.lang.Integer.valueOf(d60Var.f107900z)) && n51.f.a(this.A, d60Var.A) && n51.f.a(this.B, d60Var.B) && n51.f.a(this.C, d60Var.C) && n51.f.a(this.D, d60Var.D) && n51.f.a(java.lang.Boolean.valueOf(this.E), java.lang.Boolean.valueOf(d60Var.E)) && n51.f.a(this.F, d60Var.F) && n51.f.a(java.lang.Boolean.valueOf(this.G), java.lang.Boolean.valueOf(d60Var.G)) && n51.f.a(this.H, d60Var.H) && n51.f.a(java.lang.Boolean.valueOf(this.I), java.lang.Boolean.valueOf(d60Var.I)) && n51.f.a(this.f107873J, d60Var.f107873J) && n51.f.a(java.lang.Boolean.valueOf(this.K), java.lang.Boolean.valueOf(d60Var.K)) && n51.f.a(this.L, d60Var.L) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(d60Var.M)) && n51.f.a(this.N, d60Var.N) && n51.f.a(this.P, d60Var.P) && n51.f.a(this.Q, d60Var.Q) && n51.f.a(this.R, d60Var.R) && n51.f.a(this.S, d60Var.S) && n51.f.a(this.T, d60Var.T) && n51.f.a(this.U, d60Var.U) && n51.f.a(this.V, d60Var.V) && n51.f.a(this.W, d60Var.W) && n51.f.a(java.lang.Integer.valueOf(this.X), java.lang.Integer.valueOf(d60Var.X)) && n51.f.a(this.Y, d60Var.Y) && n51.f.a(this.Z, d60Var.Z) && n51.f.a(this.f107885p0, d60Var.f107885p0) && n51.f.a(this.f107895x0, d60Var.f107895x0) && n51.f.a(java.lang.Long.valueOf(this.f107898y0), java.lang.Long.valueOf(d60Var.f107898y0)) && n51.f.a(this.f107880l1, d60Var.f107880l1) && n51.f.a(this.f107886p1, d60Var.f107886p1) && n51.f.a(this.f107896x1, d60Var.f107896x1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m11731x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f107899y1.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.d60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (m11731x6e095e9(2)) {
                fVar.a(2, this.f107874d);
            }
            if (m11731x6e095e9(8)) {
                fVar.a(8, this.f107875e);
            }
            if (m11731x6e095e9(3)) {
                fVar.f(3, this.f107876f);
            }
            if (m11731x6e095e9(4)) {
                fVar.f(4, this.f107877g);
            }
            if (m11731x6e095e9(5)) {
                fVar.f(5, this.f107878h);
            }
            if (m11731x6e095e9(6)) {
                fVar.f(6, this.f107879i);
            }
            if (m11731x6e095e9(7)) {
                fVar.f(7, this.f107881m);
            }
            if (m11731x6e095e9(9)) {
                fVar.f(9, this.f107882n);
            }
            fVar.g(10, 8, this.f107883o);
            fVar.g(11, 8, this.f107884p);
            if (m11731x6e095e9(12)) {
                fVar.h(12, this.f107887q);
            }
            fVar.g(14, 8, this.f107888r);
            if (this.f107889s != null && m11731x6e095e9(17)) {
                fVar.j(17, this.f107889s);
            }
            if (m11731x6e095e9(20)) {
                fVar.a(20, this.f107890t);
            }
            if (this.f107891u != null && m11731x6e095e9(21)) {
                fVar.i(21, this.f107891u.mo75928xcd1e8d8());
                this.f107891u.mo75956x3d5d1f78(fVar);
            }
            if (m11731x6e095e9(22)) {
                fVar.a(22, this.f107892v);
            }
            if (m11731x6e095e9(23)) {
                fVar.a(23, this.f107893w);
            }
            if (m11731x6e095e9(24)) {
                fVar.a(24, this.f107894x);
            }
            if (this.f107897y != null && m11731x6e095e9(25)) {
                fVar.j(25, this.f107897y);
            }
            if (m11731x6e095e9(27)) {
                fVar.f(27, this.f107900z);
            }
            if (this.A != null && m11731x6e095e9(15)) {
                fVar.i(15, this.A.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            fVar.g(13, 8, this.B);
            if (this.C != null && m11731x6e095e9(16)) {
                fVar.j(16, this.C);
            }
            if (this.D != null && m11731x6e095e9(19)) {
                fVar.i(19, this.D.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            if (m11731x6e095e9(18)) {
                fVar.a(18, this.E);
            }
            if (this.F != null && m11731x6e095e9(26)) {
                fVar.i(26, this.F.mo75928xcd1e8d8());
                this.F.mo75956x3d5d1f78(fVar);
            }
            if (m11731x6e095e9(28)) {
                fVar.a(28, this.G);
            }
            if (this.H != null && m11731x6e095e9(29)) {
                fVar.i(29, this.H.mo75928xcd1e8d8());
                this.H.mo75956x3d5d1f78(fVar);
            }
            if (m11731x6e095e9(30)) {
                fVar.a(30, this.I);
            }
            if (this.f107873J != null && m11731x6e095e9(31)) {
                fVar.i(31, this.f107873J.mo75928xcd1e8d8());
                this.f107873J.mo75956x3d5d1f78(fVar);
            }
            if (m11731x6e095e9(32)) {
                fVar.a(32, this.K);
            }
            if (this.L != null && m11731x6e095e9(33)) {
                fVar.i(33, this.L.mo75928xcd1e8d8());
                this.L.mo75956x3d5d1f78(fVar);
            }
            if (m11731x6e095e9(103)) {
                fVar.f(103, this.M);
            }
            if (this.N != null && m11731x6e095e9(101)) {
                fVar.j(101, this.N);
            }
            if (this.P != null && m11731x6e095e9(102)) {
                fVar.j(102, this.P);
            }
            if (this.Q != null && m11731x6e095e9(104)) {
                fVar.j(104, this.Q);
            }
            if (this.R != null && m11731x6e095e9(105)) {
                fVar.j(105, this.R);
            }
            if (this.S != null && m11731x6e095e9(201)) {
                fVar.j(201, this.S);
            }
            if (this.T != null && m11731x6e095e9(203)) {
                fVar.j(203, this.T);
            }
            if (this.U != null && m11731x6e095e9(204)) {
                fVar.j(204, this.U);
            }
            if (this.V != null && m11731x6e095e9(205)) {
                fVar.j(205, this.V);
            }
            if (this.W != null && m11731x6e095e9(206)) {
                fVar.j(206, this.W);
            }
            if (m11731x6e095e9(301)) {
                fVar.f(301, this.X);
            }
            if (this.Y != null && m11731x6e095e9(302)) {
                fVar.j(302, this.Y);
            }
            fVar.g(303, 8, this.Z);
            if (this.f107885p0 != null && m11731x6e095e9(304)) {
                fVar.i(304, this.f107885p0.mo75928xcd1e8d8());
                this.f107885p0.mo75956x3d5d1f78(fVar);
            }
            if (this.f107895x0 != null && m11731x6e095e9(401)) {
                fVar.j(401, this.f107895x0);
            }
            if (m11731x6e095e9(501)) {
                fVar.h(501, this.f107898y0);
            }
            if (this.f107880l1 != null && m11731x6e095e9(601)) {
                fVar.i(601, this.f107880l1.mo75928xcd1e8d8());
                this.f107880l1.mo75956x3d5d1f78(fVar);
            }
            if (this.f107886p1 != null && m11731x6e095e9(602)) {
                fVar.i(602, this.f107886p1.mo75928xcd1e8d8());
                this.f107886p1.mo75956x3d5d1f78(fVar);
            }
            if (this.f107896x1 != null && m11731x6e095e9(701)) {
                fVar.i(701, this.f107896x1.mo75928xcd1e8d8());
                this.f107896x1.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = m11731x6e095e9(2) ? b36.f.a(2, this.f107874d) + 0 : 0;
            if (m11731x6e095e9(8)) {
                a17 += b36.f.a(8, this.f107875e);
            }
            if (m11731x6e095e9(3)) {
                a17 += b36.f.f(3, this.f107876f);
            }
            if (m11731x6e095e9(4)) {
                a17 += b36.f.f(4, this.f107877g);
            }
            if (m11731x6e095e9(5)) {
                a17 += b36.f.f(5, this.f107878h);
            }
            if (m11731x6e095e9(6)) {
                a17 += b36.f.f(6, this.f107879i);
            }
            if (m11731x6e095e9(7)) {
                a17 += b36.f.f(7, this.f107881m);
            }
            if (m11731x6e095e9(9)) {
                a17 += b36.f.f(9, this.f107882n);
            }
            int g17 = a17 + b36.f.g(10, 8, this.f107883o) + b36.f.g(11, 8, this.f107884p);
            if (m11731x6e095e9(12)) {
                g17 += b36.f.h(12, this.f107887q);
            }
            int g18 = g17 + b36.f.g(14, 8, this.f107888r);
            if (this.f107889s != null && m11731x6e095e9(17)) {
                g18 += b36.f.j(17, this.f107889s);
            }
            if (m11731x6e095e9(20)) {
                g18 += b36.f.a(20, this.f107890t);
            }
            if (this.f107891u != null && m11731x6e095e9(21)) {
                g18 += b36.f.i(21, this.f107891u.mo75928xcd1e8d8());
            }
            if (m11731x6e095e9(22)) {
                g18 += b36.f.a(22, this.f107892v);
            }
            if (m11731x6e095e9(23)) {
                g18 += b36.f.a(23, this.f107893w);
            }
            if (m11731x6e095e9(24)) {
                g18 += b36.f.a(24, this.f107894x);
            }
            if (this.f107897y != null && m11731x6e095e9(25)) {
                g18 += b36.f.j(25, this.f107897y);
            }
            if (m11731x6e095e9(27)) {
                g18 += b36.f.f(27, this.f107900z);
            }
            if (this.A != null && m11731x6e095e9(15)) {
                g18 += b36.f.i(15, this.A.mo75928xcd1e8d8());
            }
            int g19 = g18 + b36.f.g(13, 8, this.B);
            if (this.C != null && m11731x6e095e9(16)) {
                g19 += b36.f.j(16, this.C);
            }
            if (this.D != null && m11731x6e095e9(19)) {
                g19 += b36.f.i(19, this.D.mo75928xcd1e8d8());
            }
            if (m11731x6e095e9(18)) {
                g19 += b36.f.a(18, this.E);
            }
            if (this.F != null && m11731x6e095e9(26)) {
                g19 += b36.f.i(26, this.F.mo75928xcd1e8d8());
            }
            if (m11731x6e095e9(28)) {
                g19 += b36.f.a(28, this.G);
            }
            if (this.H != null && m11731x6e095e9(29)) {
                g19 += b36.f.i(29, this.H.mo75928xcd1e8d8());
            }
            if (m11731x6e095e9(30)) {
                g19 += b36.f.a(30, this.I);
            }
            if (this.f107873J != null && m11731x6e095e9(31)) {
                g19 += b36.f.i(31, this.f107873J.mo75928xcd1e8d8());
            }
            if (m11731x6e095e9(32)) {
                g19 += b36.f.a(32, this.K);
            }
            if (this.L != null && m11731x6e095e9(33)) {
                g19 += b36.f.i(33, this.L.mo75928xcd1e8d8());
            }
            if (m11731x6e095e9(103)) {
                g19 += b36.f.f(103, this.M);
            }
            if (this.N != null && m11731x6e095e9(101)) {
                g19 += b36.f.j(101, this.N);
            }
            if (this.P != null && m11731x6e095e9(102)) {
                g19 += b36.f.j(102, this.P);
            }
            if (this.Q != null && m11731x6e095e9(104)) {
                g19 += b36.f.j(104, this.Q);
            }
            if (this.R != null && m11731x6e095e9(105)) {
                g19 += b36.f.j(105, this.R);
            }
            if (this.S != null && m11731x6e095e9(201)) {
                g19 += b36.f.j(201, this.S);
            }
            if (this.T != null && m11731x6e095e9(203)) {
                g19 += b36.f.j(203, this.T);
            }
            if (this.U != null && m11731x6e095e9(204)) {
                g19 += b36.f.j(204, this.U);
            }
            if (this.V != null && m11731x6e095e9(205)) {
                g19 += b36.f.j(205, this.V);
            }
            if (this.W != null && m11731x6e095e9(206)) {
                g19 += b36.f.j(206, this.W);
            }
            if (m11731x6e095e9(301)) {
                g19 += b36.f.f(301, this.X);
            }
            if (this.Y != null && m11731x6e095e9(302)) {
                g19 += b36.f.j(302, this.Y);
            }
            int g27 = g19 + b36.f.g(303, 8, this.Z);
            if (this.f107885p0 != null && m11731x6e095e9(304)) {
                g27 += b36.f.i(304, this.f107885p0.mo75928xcd1e8d8());
            }
            if (this.f107895x0 != null && m11731x6e095e9(401)) {
                g27 += b36.f.j(401, this.f107895x0);
            }
            if (m11731x6e095e9(501)) {
                g27 += b36.f.h(501, this.f107898y0);
            }
            if (this.f107880l1 != null && m11731x6e095e9(601)) {
                g27 += b36.f.i(601, this.f107880l1.mo75928xcd1e8d8());
            }
            if (this.f107886p1 != null && m11731x6e095e9(602)) {
                g27 += b36.f.i(602, this.f107886p1.mo75928xcd1e8d8());
            }
            return (this.f107896x1 == null || !m11731x6e095e9(701)) ? g27 : g27 + b36.f.i(701, this.f107896x1.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f107883o.clear();
            this.f107884p.clear();
            this.f107888r.clear();
            this.B.clear();
            this.Z.clear();
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
        android.util.ArrayMap arrayMap = this.f107899y1;
        if (intValue == 201) {
            this.S = aVar2.k(intValue);
            arrayMap.put(201, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 401) {
            this.f107895x0 = aVar2.k(intValue);
            arrayMap.put(401, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 501) {
            this.f107898y0 = aVar2.i(intValue);
            arrayMap.put(501, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 701) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.c90 c90Var = new bw5.c90();
                if (bArr != null && bArr.length > 0) {
                    c90Var.mo11468x92b714fd(bArr);
                }
                this.f107896x1 = c90Var;
            }
            arrayMap.put(701, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 601) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.z60 z60Var = new bw5.z60();
                if (bArr2 != null && bArr2.length > 0) {
                    z60Var.mo11468x92b714fd(bArr2);
                }
                this.f107880l1 = z60Var;
            }
            arrayMap.put(601, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 602) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                bw5.aa0 aa0Var = new bw5.aa0();
                if (bArr3 != null && bArr3.length > 0) {
                    aa0Var.mo11468x92b714fd(bArr3);
                }
                this.f107886p1 = aa0Var;
            }
            arrayMap.put(602, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 2:
                this.f107874d = aVar2.c(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f107876f = aVar2.h(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f107877g = aVar2.h(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f107878h = aVar2.h(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f107879i = aVar2.h(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f107881m = aVar2.h(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f107875e = aVar2.c(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                this.f107882n = aVar2.h(intValue);
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.mc0 mc0Var = new bw5.mc0();
                    if (bArr4 != null && bArr4.length > 0) {
                        mc0Var.mo11468x92b714fd(bArr4);
                    }
                    this.f107883o.add(mc0Var);
                }
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.e60 e60Var = new bw5.e60();
                    if (bArr5 != null && bArr5.length > 0) {
                        e60Var.mo11468x92b714fd(bArr5);
                    }
                    this.f107884p.add(e60Var);
                }
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            case 12:
                this.f107887q = aVar2.i(intValue);
                arrayMap.put(12, java.lang.Boolean.TRUE);
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.ca0 ca0Var = new bw5.ca0();
                    if (bArr6 != null && bArr6.length > 0) {
                        ca0Var.mo11468x92b714fd(bArr6);
                    }
                    this.B.add(ca0Var);
                }
                arrayMap.put(13, java.lang.Boolean.TRUE);
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.mc0 mc0Var2 = new bw5.mc0();
                    if (bArr7 != null && bArr7.length > 0) {
                        mc0Var2.mo11468x92b714fd(bArr7);
                    }
                    this.f107888r.add(mc0Var2);
                }
                arrayMap.put(14, java.lang.Boolean.TRUE);
                return 0;
            case 15:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.i70 i70Var = new bw5.i70();
                    if (bArr8 != null && bArr8.length > 0) {
                        i70Var.mo11468x92b714fd(bArr8);
                    }
                    this.A = i70Var;
                }
                arrayMap.put(15, java.lang.Boolean.TRUE);
                return 0;
            case 16:
                this.C = aVar2.k(intValue);
                arrayMap.put(16, java.lang.Boolean.TRUE);
                return 0;
            case 17:
                this.f107889s = aVar2.k(intValue);
                arrayMap.put(17, java.lang.Boolean.TRUE);
                return 0;
            case 18:
                this.E = aVar2.c(intValue);
                arrayMap.put(18, java.lang.Boolean.TRUE);
                return 0;
            case 19:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.e80 e80Var = new bw5.e80();
                    if (bArr9 != null && bArr9.length > 0) {
                        e80Var.mo11468x92b714fd(bArr9);
                    }
                    this.D = e80Var;
                }
                arrayMap.put(19, java.lang.Boolean.TRUE);
                return 0;
            case 20:
                this.f107890t = aVar2.c(intValue);
                arrayMap.put(20, java.lang.Boolean.TRUE);
                return 0;
            case 21:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.h60 h60Var = new bw5.h60();
                    if (bArr10 != null && bArr10.length > 0) {
                        h60Var.mo11468x92b714fd(bArr10);
                    }
                    this.f107891u = h60Var;
                }
                arrayMap.put(21, java.lang.Boolean.TRUE);
                return 0;
            case 22:
                this.f107892v = aVar2.c(intValue);
                arrayMap.put(22, java.lang.Boolean.TRUE);
                return 0;
            case 23:
                this.f107893w = aVar2.c(intValue);
                arrayMap.put(23, java.lang.Boolean.TRUE);
                return 0;
            case 24:
                this.f107894x = aVar2.c(intValue);
                arrayMap.put(24, java.lang.Boolean.TRUE);
                return 0;
            case 25:
                this.f107897y = aVar2.k(intValue);
                arrayMap.put(25, java.lang.Boolean.TRUE);
                return 0;
            case 26:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    bw5.a60 a60Var = new bw5.a60();
                    if (bArr11 != null && bArr11.length > 0) {
                        a60Var.mo11468x92b714fd(bArr11);
                    }
                    this.F = a60Var;
                }
                arrayMap.put(26, java.lang.Boolean.TRUE);
                return 0;
            case 27:
                this.f107900z = aVar2.h(intValue);
                arrayMap.put(27, java.lang.Boolean.TRUE);
                return 0;
            case 28:
                this.G = aVar2.c(intValue);
                arrayMap.put(28, java.lang.Boolean.TRUE);
                return 0;
            case 29:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j49.get(i57);
                    bw5.y50 y50Var = new bw5.y50();
                    if (bArr12 != null && bArr12.length > 0) {
                        y50Var.mo11468x92b714fd(bArr12);
                    }
                    this.H = y50Var;
                }
                arrayMap.put(29, java.lang.Boolean.TRUE);
                return 0;
            case 30:
                this.I = aVar2.c(intValue);
                arrayMap.put(30, java.lang.Boolean.TRUE);
                return 0;
            case 31:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr13 = (byte[]) j57.get(i58);
                    bw5.b60 b60Var = new bw5.b60();
                    if (bArr13 != null && bArr13.length > 0) {
                        b60Var.mo11468x92b714fd(bArr13);
                    }
                    this.f107873J = b60Var;
                }
                arrayMap.put(31, java.lang.Boolean.TRUE);
                return 0;
            case 32:
                this.K = aVar2.c(intValue);
                arrayMap.put(32, java.lang.Boolean.TRUE);
                return 0;
            case 33:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i59 = 0; i59 < size14; i59++) {
                    byte[] bArr14 = (byte[]) j58.get(i59);
                    bw5.c60 c60Var = new bw5.c60();
                    if (bArr14 != null && bArr14.length > 0) {
                        c60Var.mo11468x92b714fd(bArr14);
                    }
                    this.L = c60Var;
                }
                arrayMap.put(33, java.lang.Boolean.TRUE);
                return 0;
            default:
                switch (intValue) {
                    case 101:
                        this.N = aVar2.k(intValue);
                        arrayMap.put(101, java.lang.Boolean.TRUE);
                        return 0;
                    case 102:
                        this.P = aVar2.k(intValue);
                        arrayMap.put(102, java.lang.Boolean.TRUE);
                        return 0;
                    case 103:
                        this.M = aVar2.h(intValue);
                        arrayMap.put(103, java.lang.Boolean.TRUE);
                        return 0;
                    case 104:
                        this.Q = aVar2.k(intValue);
                        arrayMap.put(104, java.lang.Boolean.TRUE);
                        return 0;
                    case 105:
                        this.R = aVar2.k(intValue);
                        arrayMap.put(105, java.lang.Boolean.TRUE);
                        return 0;
                    default:
                        switch (intValue) {
                            case 203:
                                this.T = aVar2.k(intValue);
                                arrayMap.put(203, java.lang.Boolean.TRUE);
                                return 0;
                            case 204:
                                this.U = aVar2.k(intValue);
                                arrayMap.put(204, java.lang.Boolean.TRUE);
                                return 0;
                            case 205:
                                this.V = aVar2.k(intValue);
                                arrayMap.put(205, java.lang.Boolean.TRUE);
                                return 0;
                            case 206:
                                this.W = aVar2.k(intValue);
                                arrayMap.put(206, java.lang.Boolean.TRUE);
                                return 0;
                            default:
                                switch (intValue) {
                                    case 301:
                                        this.X = aVar2.h(intValue);
                                        arrayMap.put(301, java.lang.Boolean.TRUE);
                                        return 0;
                                    case 302:
                                        this.Y = aVar2.k(intValue);
                                        arrayMap.put(302, java.lang.Boolean.TRUE);
                                        return 0;
                                    case 303:
                                        java.util.LinkedList j59 = aVar2.j(intValue);
                                        int size15 = j59.size();
                                        for (int i66 = 0; i66 < size15; i66++) {
                                            byte[] bArr15 = (byte[]) j59.get(i66);
                                            bw5.ya0 ya0Var = new bw5.ya0();
                                            if (bArr15 != null && bArr15.length > 0) {
                                                ya0Var.mo11468x92b714fd(bArr15);
                                            }
                                            this.Z.add(ya0Var);
                                        }
                                        arrayMap.put(303, java.lang.Boolean.TRUE);
                                        return 0;
                                    case 304:
                                        java.util.LinkedList j66 = aVar2.j(intValue);
                                        int size16 = j66.size();
                                        for (int i67 = 0; i67 < size16; i67++) {
                                            byte[] bArr16 = (byte[]) j66.get(i67);
                                            bw5.xa0 xa0Var = new bw5.xa0();
                                            if (bArr16 != null && bArr16.length > 0) {
                                                xa0Var.mo11468x92b714fd(bArr16);
                                            }
                                            this.f107885p0 = xa0Var;
                                        }
                                        arrayMap.put(304, java.lang.Boolean.TRUE);
                                        return 0;
                                    default:
                                        return -1;
                                }
                        }
                }
        }
    }
}
