package bw5;

/* loaded from: classes2.dex */
public class fo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public int B;
    public int C;
    public int D;
    public java.lang.String E;
    public int F;
    public float G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f108929J;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g K;
    public java.lang.String L;
    public int M;
    public int N;

    /* renamed from: d, reason: collision with root package name */
    public long f108930d;

    /* renamed from: e, reason: collision with root package name */
    public int f108931e;

    /* renamed from: f, reason: collision with root package name */
    public int f108932f;

    /* renamed from: g, reason: collision with root package name */
    public int f108933g;

    /* renamed from: h, reason: collision with root package name */
    public int f108934h;

    /* renamed from: i, reason: collision with root package name */
    public int f108935i;

    /* renamed from: m, reason: collision with root package name */
    public int f108936m;

    /* renamed from: n, reason: collision with root package name */
    public int f108937n;

    /* renamed from: o, reason: collision with root package name */
    public int f108938o;

    /* renamed from: p, reason: collision with root package name */
    public int f108939p;

    /* renamed from: q, reason: collision with root package name */
    public int f108940q;

    /* renamed from: r, reason: collision with root package name */
    public int f108941r;

    /* renamed from: s, reason: collision with root package name */
    public int f108942s;

    /* renamed from: t, reason: collision with root package name */
    public int f108943t;

    /* renamed from: u, reason: collision with root package name */
    public int f108944u;

    /* renamed from: v, reason: collision with root package name */
    public int f108945v;

    /* renamed from: w, reason: collision with root package name */
    public int f108946w;

    /* renamed from: x, reason: collision with root package name */
    public int f108947x;

    /* renamed from: z, reason: collision with root package name */
    public int f108949z;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f108948y = new java.util.LinkedList();
    public final android.util.ArrayMap P = new android.util.ArrayMap();

    static {
        new bw5.fo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fo mo11468x92b714fd(byte[] bArr) {
        return (bw5.fo) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fo)) {
            return false;
        }
        bw5.fo foVar = (bw5.fo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f108930d), java.lang.Long.valueOf(foVar.f108930d)) && n51.f.a(java.lang.Integer.valueOf(this.f108931e), java.lang.Integer.valueOf(foVar.f108931e)) && n51.f.a(java.lang.Integer.valueOf(this.f108932f), java.lang.Integer.valueOf(foVar.f108932f)) && n51.f.a(java.lang.Integer.valueOf(this.f108933g), java.lang.Integer.valueOf(foVar.f108933g)) && n51.f.a(java.lang.Integer.valueOf(this.f108934h), java.lang.Integer.valueOf(foVar.f108934h)) && n51.f.a(java.lang.Integer.valueOf(this.f108935i), java.lang.Integer.valueOf(foVar.f108935i)) && n51.f.a(java.lang.Integer.valueOf(this.f108936m), java.lang.Integer.valueOf(foVar.f108936m)) && n51.f.a(java.lang.Integer.valueOf(this.f108937n), java.lang.Integer.valueOf(foVar.f108937n)) && n51.f.a(java.lang.Integer.valueOf(this.f108938o), java.lang.Integer.valueOf(foVar.f108938o)) && n51.f.a(java.lang.Integer.valueOf(this.f108939p), java.lang.Integer.valueOf(foVar.f108939p)) && n51.f.a(java.lang.Integer.valueOf(this.f108940q), java.lang.Integer.valueOf(foVar.f108940q)) && n51.f.a(java.lang.Integer.valueOf(this.f108941r), java.lang.Integer.valueOf(foVar.f108941r)) && n51.f.a(java.lang.Integer.valueOf(this.f108942s), java.lang.Integer.valueOf(foVar.f108942s)) && n51.f.a(java.lang.Integer.valueOf(this.f108943t), java.lang.Integer.valueOf(foVar.f108943t)) && n51.f.a(java.lang.Integer.valueOf(this.f108944u), java.lang.Integer.valueOf(foVar.f108944u)) && n51.f.a(java.lang.Integer.valueOf(this.f108945v), java.lang.Integer.valueOf(foVar.f108945v)) && n51.f.a(java.lang.Integer.valueOf(this.f108946w), java.lang.Integer.valueOf(foVar.f108946w)) && n51.f.a(java.lang.Integer.valueOf(this.f108947x), java.lang.Integer.valueOf(foVar.f108947x)) && n51.f.a(this.f108948y, foVar.f108948y) && n51.f.a(java.lang.Integer.valueOf(this.f108949z), java.lang.Integer.valueOf(foVar.f108949z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(foVar.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(foVar.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(foVar.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(foVar.D)) && n51.f.a(this.E, foVar.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(foVar.F)) && n51.f.a(java.lang.Float.valueOf(this.G), java.lang.Float.valueOf(foVar.G)) && n51.f.a(java.lang.Float.valueOf(this.H), java.lang.Float.valueOf(foVar.H)) && n51.f.a(java.lang.Float.valueOf(this.I), java.lang.Float.valueOf(foVar.I)) && n51.f.a(java.lang.Float.valueOf(this.f108929J), java.lang.Float.valueOf(foVar.f108929J)) && n51.f.a(this.K, foVar.K) && n51.f.a(this.L, foVar.L) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(foVar.M)) && n51.f.a(java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(foVar.N));
    }

    /* renamed from: hasFieldNumber */
    public boolean m11928x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.P.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (m11928x6e095e9(1)) {
                fVar.h(1, this.f108930d);
            }
            if (m11928x6e095e9(2)) {
                fVar.e(2, this.f108931e);
            }
            if (m11928x6e095e9(3)) {
                fVar.e(3, this.f108932f);
            }
            if (m11928x6e095e9(4)) {
                fVar.e(4, this.f108933g);
            }
            if (m11928x6e095e9(5)) {
                fVar.e(5, this.f108934h);
            }
            if (m11928x6e095e9(6)) {
                fVar.e(6, this.f108935i);
            }
            if (m11928x6e095e9(7)) {
                fVar.e(7, this.f108936m);
            }
            if (m11928x6e095e9(8)) {
                fVar.e(8, this.f108937n);
            }
            if (m11928x6e095e9(9)) {
                fVar.e(9, this.f108938o);
            }
            if (m11928x6e095e9(10)) {
                fVar.e(10, this.f108939p);
            }
            if (m11928x6e095e9(11)) {
                fVar.e(11, this.f108940q);
            }
            if (m11928x6e095e9(12)) {
                fVar.e(12, this.f108941r);
            }
            if (m11928x6e095e9(13)) {
                fVar.e(13, this.f108942s);
            }
            if (m11928x6e095e9(14)) {
                fVar.e(14, this.f108943t);
            }
            if (m11928x6e095e9(15)) {
                fVar.e(15, this.f108944u);
            }
            if (m11928x6e095e9(16)) {
                fVar.e(16, this.f108945v);
            }
            if (m11928x6e095e9(17)) {
                fVar.e(17, this.f108946w);
            }
            if (m11928x6e095e9(18)) {
                fVar.e(18, this.f108947x);
            }
            fVar.g(19, 8, this.f108948y);
            if (m11928x6e095e9(20)) {
                fVar.e(20, this.f108949z);
            }
            if (m11928x6e095e9(21)) {
                fVar.e(21, this.A);
            }
            if (m11928x6e095e9(22)) {
                fVar.e(22, this.B);
            }
            if (m11928x6e095e9(23)) {
                fVar.e(23, this.C);
            }
            if (m11928x6e095e9(24)) {
                fVar.e(24, this.D);
            }
            if (this.E != null && m11928x6e095e9(25)) {
                fVar.j(25, this.E);
            }
            if (m11928x6e095e9(26)) {
                fVar.e(26, this.F);
            }
            if (m11928x6e095e9(27)) {
                fVar.d(27, this.G);
            }
            if (m11928x6e095e9(28)) {
                fVar.d(28, this.H);
            }
            if (m11928x6e095e9(29)) {
                fVar.d(29, this.I);
            }
            if (m11928x6e095e9(30)) {
                fVar.d(30, this.f108929J);
            }
            if (this.K != null && m11928x6e095e9(31)) {
                fVar.b(31, this.K);
            }
            if (this.L != null && m11928x6e095e9(32)) {
                fVar.j(32, this.L);
            }
            if (m11928x6e095e9(33)) {
                fVar.e(33, this.M);
            }
            if (m11928x6e095e9(999)) {
                fVar.e(999, this.N);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = m11928x6e095e9(1) ? b36.f.h(1, this.f108930d) + 0 : 0;
            if (m11928x6e095e9(2)) {
                h17 += b36.f.e(2, this.f108931e);
            }
            if (m11928x6e095e9(3)) {
                h17 += b36.f.e(3, this.f108932f);
            }
            if (m11928x6e095e9(4)) {
                h17 += b36.f.e(4, this.f108933g);
            }
            if (m11928x6e095e9(5)) {
                h17 += b36.f.e(5, this.f108934h);
            }
            if (m11928x6e095e9(6)) {
                h17 += b36.f.e(6, this.f108935i);
            }
            if (m11928x6e095e9(7)) {
                h17 += b36.f.e(7, this.f108936m);
            }
            if (m11928x6e095e9(8)) {
                h17 += b36.f.e(8, this.f108937n);
            }
            if (m11928x6e095e9(9)) {
                h17 += b36.f.e(9, this.f108938o);
            }
            if (m11928x6e095e9(10)) {
                h17 += b36.f.e(10, this.f108939p);
            }
            if (m11928x6e095e9(11)) {
                h17 += b36.f.e(11, this.f108940q);
            }
            if (m11928x6e095e9(12)) {
                h17 += b36.f.e(12, this.f108941r);
            }
            if (m11928x6e095e9(13)) {
                h17 += b36.f.e(13, this.f108942s);
            }
            if (m11928x6e095e9(14)) {
                h17 += b36.f.e(14, this.f108943t);
            }
            if (m11928x6e095e9(15)) {
                h17 += b36.f.e(15, this.f108944u);
            }
            if (m11928x6e095e9(16)) {
                h17 += b36.f.e(16, this.f108945v);
            }
            if (m11928x6e095e9(17)) {
                h17 += b36.f.e(17, this.f108946w);
            }
            if (m11928x6e095e9(18)) {
                h17 += b36.f.e(18, this.f108947x);
            }
            int g17 = h17 + b36.f.g(19, 8, this.f108948y);
            if (m11928x6e095e9(20)) {
                g17 += b36.f.e(20, this.f108949z);
            }
            if (m11928x6e095e9(21)) {
                g17 += b36.f.e(21, this.A);
            }
            if (m11928x6e095e9(22)) {
                g17 += b36.f.e(22, this.B);
            }
            if (m11928x6e095e9(23)) {
                g17 += b36.f.e(23, this.C);
            }
            if (m11928x6e095e9(24)) {
                g17 += b36.f.e(24, this.D);
            }
            if (this.E != null && m11928x6e095e9(25)) {
                g17 += b36.f.j(25, this.E);
            }
            if (m11928x6e095e9(26)) {
                g17 += b36.f.e(26, this.F);
            }
            if (m11928x6e095e9(27)) {
                g17 += b36.f.d(27, this.G);
            }
            if (m11928x6e095e9(28)) {
                g17 += b36.f.d(28, this.H);
            }
            if (m11928x6e095e9(29)) {
                g17 += b36.f.d(29, this.I);
            }
            if (m11928x6e095e9(30)) {
                g17 += b36.f.d(30, this.f108929J);
            }
            if (this.K != null && m11928x6e095e9(31)) {
                g17 += b36.f.b(31, this.K);
            }
            if (this.L != null && m11928x6e095e9(32)) {
                g17 += b36.f.j(32, this.L);
            }
            if (m11928x6e095e9(33)) {
                g17 += b36.f.e(33, this.M);
            }
            return m11928x6e095e9(999) ? g17 + b36.f.e(999, this.N) : g17;
        }
        if (i17 == 2) {
            this.f108948y.clear();
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
        android.util.ArrayMap arrayMap = this.P;
        if (intValue == 999) {
            this.N = aVar2.g(intValue);
            arrayMap.put(999, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f108930d = aVar2.i(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f108931e = aVar2.g(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f108932f = aVar2.g(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f108933g = aVar2.g(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f108934h = aVar2.g(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f108935i = aVar2.g(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f108936m = aVar2.g(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f108937n = aVar2.g(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                this.f108938o = aVar2.g(intValue);
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                this.f108939p = aVar2.g(intValue);
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                this.f108940q = aVar2.g(intValue);
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            case 12:
                this.f108941r = aVar2.g(intValue);
                arrayMap.put(12, java.lang.Boolean.TRUE);
                return 0;
            case 13:
                this.f108942s = aVar2.g(intValue);
                arrayMap.put(13, java.lang.Boolean.TRUE);
                return 0;
            case 14:
                this.f108943t = aVar2.g(intValue);
                arrayMap.put(14, java.lang.Boolean.TRUE);
                return 0;
            case 15:
                this.f108944u = aVar2.g(intValue);
                arrayMap.put(15, java.lang.Boolean.TRUE);
                return 0;
            case 16:
                this.f108945v = aVar2.g(intValue);
                arrayMap.put(16, java.lang.Boolean.TRUE);
                return 0;
            case 17:
                this.f108946w = aVar2.g(intValue);
                arrayMap.put(17, java.lang.Boolean.TRUE);
                return 0;
            case 18:
                this.f108947x = aVar2.g(intValue);
                arrayMap.put(18, java.lang.Boolean.TRUE);
                return 0;
            case 19:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.op opVar = new bw5.op();
                    if (bArr != null && bArr.length > 0) {
                        opVar.mo11468x92b714fd(bArr);
                    }
                    this.f108948y.add(opVar);
                }
                arrayMap.put(19, java.lang.Boolean.TRUE);
                return 0;
            case 20:
                this.f108949z = aVar2.g(intValue);
                arrayMap.put(20, java.lang.Boolean.TRUE);
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                arrayMap.put(21, java.lang.Boolean.TRUE);
                return 0;
            case 22:
                this.B = aVar2.g(intValue);
                arrayMap.put(22, java.lang.Boolean.TRUE);
                return 0;
            case 23:
                this.C = aVar2.g(intValue);
                arrayMap.put(23, java.lang.Boolean.TRUE);
                return 0;
            case 24:
                this.D = aVar2.g(intValue);
                arrayMap.put(24, java.lang.Boolean.TRUE);
                return 0;
            case 25:
                this.E = aVar2.k(intValue);
                arrayMap.put(25, java.lang.Boolean.TRUE);
                return 0;
            case 26:
                this.F = aVar2.g(intValue);
                arrayMap.put(26, java.lang.Boolean.TRUE);
                return 0;
            case 27:
                this.G = aVar2.f(intValue);
                arrayMap.put(27, java.lang.Boolean.TRUE);
                return 0;
            case 28:
                this.H = aVar2.f(intValue);
                arrayMap.put(28, java.lang.Boolean.TRUE);
                return 0;
            case 29:
                this.I = aVar2.f(intValue);
                arrayMap.put(29, java.lang.Boolean.TRUE);
                return 0;
            case 30:
                this.f108929J = aVar2.f(intValue);
                arrayMap.put(30, java.lang.Boolean.TRUE);
                return 0;
            case 31:
                this.K = aVar2.d(intValue);
                arrayMap.put(31, java.lang.Boolean.TRUE);
                return 0;
            case 32:
                this.L = aVar2.k(intValue);
                arrayMap.put(32, java.lang.Boolean.TRUE);
                return 0;
            case 33:
                this.M = aVar2.g(intValue);
                arrayMap.put(33, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
