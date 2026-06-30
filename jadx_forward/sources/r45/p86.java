package r45;

/* loaded from: classes15.dex */
public class p86 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public java.lang.String G;
    public long I;
    public int L;
    public int M;
    public int N;
    public java.lang.String P;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464371d;

    /* renamed from: w, reason: collision with root package name */
    public int f464387w;

    /* renamed from: x, reason: collision with root package name */
    public int f464388x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f464389y;

    /* renamed from: e, reason: collision with root package name */
    public int f464372e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f464373f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f464374g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f464375h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f464376i = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f464377m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f464378n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f464379o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f464380p = false;

    /* renamed from: q, reason: collision with root package name */
    public long f464381q = -1;

    /* renamed from: r, reason: collision with root package name */
    public long f464382r = -1;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f464383s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public long f464384t = 0;

    /* renamed from: u, reason: collision with root package name */
    public double f464385u = 0.0d;

    /* renamed from: v, reason: collision with root package name */
    public double f464386v = 0.0d;

    /* renamed from: z, reason: collision with root package name */
    public boolean f464390z = false;
    public int H = 1;

    /* renamed from: J, reason: collision with root package name */
    public int f464370J = 0;
    public int K = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p86)) {
            return false;
        }
        r45.p86 p86Var = (r45.p86) fVar;
        return n51.f.a(this.f464371d, p86Var.f464371d) && n51.f.a(java.lang.Integer.valueOf(this.f464372e), java.lang.Integer.valueOf(p86Var.f464372e)) && n51.f.a(java.lang.Integer.valueOf(this.f464373f), java.lang.Integer.valueOf(p86Var.f464373f)) && n51.f.a(java.lang.Integer.valueOf(this.f464374g), java.lang.Integer.valueOf(p86Var.f464374g)) && n51.f.a(java.lang.Integer.valueOf(this.f464375h), java.lang.Integer.valueOf(p86Var.f464375h)) && n51.f.a(java.lang.Integer.valueOf(this.f464376i), java.lang.Integer.valueOf(p86Var.f464376i)) && n51.f.a(java.lang.Integer.valueOf(this.f464377m), java.lang.Integer.valueOf(p86Var.f464377m)) && n51.f.a(java.lang.Integer.valueOf(this.f464378n), java.lang.Integer.valueOf(p86Var.f464378n)) && n51.f.a(java.lang.Integer.valueOf(this.f464379o), java.lang.Integer.valueOf(p86Var.f464379o)) && n51.f.a(java.lang.Boolean.valueOf(this.f464380p), java.lang.Boolean.valueOf(p86Var.f464380p)) && n51.f.a(java.lang.Long.valueOf(this.f464381q), java.lang.Long.valueOf(p86Var.f464381q)) && n51.f.a(java.lang.Long.valueOf(this.f464382r), java.lang.Long.valueOf(p86Var.f464382r)) && n51.f.a(this.f464383s, p86Var.f464383s) && n51.f.a(java.lang.Long.valueOf(this.f464384t), java.lang.Long.valueOf(p86Var.f464384t)) && n51.f.a(java.lang.Double.valueOf(this.f464385u), java.lang.Double.valueOf(p86Var.f464385u)) && n51.f.a(java.lang.Double.valueOf(this.f464386v), java.lang.Double.valueOf(p86Var.f464386v)) && n51.f.a(java.lang.Integer.valueOf(this.f464387w), java.lang.Integer.valueOf(p86Var.f464387w)) && n51.f.a(java.lang.Integer.valueOf(this.f464388x), java.lang.Integer.valueOf(p86Var.f464388x)) && n51.f.a(this.f464389y, p86Var.f464389y) && n51.f.a(java.lang.Boolean.valueOf(this.f464390z), java.lang.Boolean.valueOf(p86Var.f464390z)) && n51.f.a(this.A, p86Var.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(p86Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(p86Var.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(p86Var.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(p86Var.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(p86Var.F)) && n51.f.a(this.G, p86Var.G) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(p86Var.H)) && n51.f.a(java.lang.Long.valueOf(this.I), java.lang.Long.valueOf(p86Var.I)) && n51.f.a(java.lang.Integer.valueOf(this.f464370J), java.lang.Integer.valueOf(p86Var.f464370J)) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(p86Var.K)) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(p86Var.L)) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(p86Var.M)) && n51.f.a(java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(p86Var.N)) && n51.f.a(this.P, p86Var.P);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464383s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464371d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f464372e);
            fVar.e(3, this.f464373f);
            fVar.e(4, this.f464374g);
            fVar.e(5, this.f464375h);
            fVar.e(6, this.f464376i);
            fVar.e(7, this.f464377m);
            fVar.e(8, this.f464378n);
            fVar.e(9, this.f464379o);
            fVar.a(10, this.f464380p);
            fVar.h(11, this.f464381q);
            fVar.h(12, this.f464382r);
            fVar.g(13, 8, linkedList);
            fVar.h(14, this.f464384t);
            fVar.c(15, this.f464385u);
            fVar.c(16, this.f464386v);
            fVar.e(17, this.f464387w);
            fVar.e(18, this.f464388x);
            java.lang.String str2 = this.f464389y;
            if (str2 != null) {
                fVar.j(19, str2);
            }
            fVar.a(20, this.f464390z);
            java.lang.String str3 = this.A;
            if (str3 != null) {
                fVar.j(21, str3);
            }
            fVar.e(22, this.B);
            fVar.e(23, this.C);
            fVar.e(24, this.D);
            fVar.e(25, this.E);
            fVar.e(26, this.F);
            java.lang.String str4 = this.G;
            if (str4 != null) {
                fVar.j(27, str4);
            }
            fVar.e(28, this.H);
            fVar.h(29, this.I);
            fVar.e(30, this.f464370J);
            fVar.e(31, this.K);
            fVar.e(32, this.L);
            fVar.e(33, this.M);
            fVar.e(34, this.N);
            java.lang.String str5 = this.P;
            if (str5 != null) {
                fVar.j(35, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f464371d;
            int j17 = (str6 != null ? b36.f.j(1, str6) + 0 : 0) + b36.f.e(2, this.f464372e) + b36.f.e(3, this.f464373f) + b36.f.e(4, this.f464374g) + b36.f.e(5, this.f464375h) + b36.f.e(6, this.f464376i) + b36.f.e(7, this.f464377m) + b36.f.e(8, this.f464378n) + b36.f.e(9, this.f464379o) + b36.f.a(10, this.f464380p) + b36.f.h(11, this.f464381q) + b36.f.h(12, this.f464382r) + b36.f.g(13, 8, linkedList) + b36.f.h(14, this.f464384t) + b36.f.c(15, this.f464385u) + b36.f.c(16, this.f464386v) + b36.f.e(17, this.f464387w) + b36.f.e(18, this.f464388x);
            java.lang.String str7 = this.f464389y;
            if (str7 != null) {
                j17 += b36.f.j(19, str7);
            }
            int a17 = j17 + b36.f.a(20, this.f464390z);
            java.lang.String str8 = this.A;
            if (str8 != null) {
                a17 += b36.f.j(21, str8);
            }
            int e17 = a17 + b36.f.e(22, this.B) + b36.f.e(23, this.C) + b36.f.e(24, this.D) + b36.f.e(25, this.E) + b36.f.e(26, this.F);
            java.lang.String str9 = this.G;
            if (str9 != null) {
                e17 += b36.f.j(27, str9);
            }
            int e18 = e17 + b36.f.e(28, this.H) + b36.f.h(29, this.I) + b36.f.e(30, this.f464370J) + b36.f.e(31, this.K) + b36.f.e(32, this.L) + b36.f.e(33, this.M) + b36.f.e(34, this.N);
            java.lang.String str10 = this.P;
            return str10 != null ? e18 + b36.f.j(35, str10) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.p86 p86Var = (r45.p86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p86Var.f464371d = aVar2.k(intValue);
                return 0;
            case 2:
                p86Var.f464372e = aVar2.g(intValue);
                return 0;
            case 3:
                p86Var.f464373f = aVar2.g(intValue);
                return 0;
            case 4:
                p86Var.f464374g = aVar2.g(intValue);
                return 0;
            case 5:
                p86Var.f464375h = aVar2.g(intValue);
                return 0;
            case 6:
                p86Var.f464376i = aVar2.g(intValue);
                return 0;
            case 7:
                p86Var.f464377m = aVar2.g(intValue);
                return 0;
            case 8:
                p86Var.f464378n = aVar2.g(intValue);
                return 0;
            case 9:
                p86Var.f464379o = aVar2.g(intValue);
                return 0;
            case 10:
                p86Var.f464380p = aVar2.c(intValue);
                return 0;
            case 11:
                p86Var.f464381q = aVar2.i(intValue);
                return 0;
            case 12:
                p86Var.f464382r = aVar2.i(intValue);
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.er0 er0Var = new r45.er0();
                    if (bArr2 != null && bArr2.length > 0) {
                        er0Var.mo11468x92b714fd(bArr2);
                    }
                    p86Var.f464383s.add(er0Var);
                }
                return 0;
            case 14:
                p86Var.f464384t = aVar2.i(intValue);
                return 0;
            case 15:
                p86Var.f464385u = aVar2.e(intValue);
                return 0;
            case 16:
                p86Var.f464386v = aVar2.e(intValue);
                return 0;
            case 17:
                p86Var.f464387w = aVar2.g(intValue);
                return 0;
            case 18:
                p86Var.f464388x = aVar2.g(intValue);
                return 0;
            case 19:
                p86Var.f464389y = aVar2.k(intValue);
                return 0;
            case 20:
                p86Var.f464390z = aVar2.c(intValue);
                return 0;
            case 21:
                p86Var.A = aVar2.k(intValue);
                return 0;
            case 22:
                p86Var.B = aVar2.g(intValue);
                return 0;
            case 23:
                p86Var.C = aVar2.g(intValue);
                return 0;
            case 24:
                p86Var.D = aVar2.g(intValue);
                return 0;
            case 25:
                p86Var.E = aVar2.g(intValue);
                return 0;
            case 26:
                p86Var.F = aVar2.g(intValue);
                return 0;
            case 27:
                p86Var.G = aVar2.k(intValue);
                return 0;
            case 28:
                p86Var.H = aVar2.g(intValue);
                return 0;
            case 29:
                p86Var.I = aVar2.i(intValue);
                return 0;
            case 30:
                p86Var.f464370J = aVar2.g(intValue);
                return 0;
            case 31:
                p86Var.K = aVar2.g(intValue);
                return 0;
            case 32:
                p86Var.L = aVar2.g(intValue);
                return 0;
            case 33:
                p86Var.M = aVar2.g(intValue);
                return 0;
            case 34:
                p86Var.N = aVar2.g(intValue);
                return 0;
            case 35:
                p86Var.P = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
