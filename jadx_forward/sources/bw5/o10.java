package bw5;

/* loaded from: classes4.dex */
public class o10 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112413d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112414e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112415f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112416g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112417h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f112418i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f112419m;

    /* renamed from: n, reason: collision with root package name */
    public int f112420n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f112421o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f112422p;

    /* renamed from: r, reason: collision with root package name */
    public int f112424r;

    /* renamed from: s, reason: collision with root package name */
    public int f112425s;

    /* renamed from: t, reason: collision with root package name */
    public int f112426t;

    /* renamed from: u, reason: collision with root package name */
    public int f112427u;

    /* renamed from: v, reason: collision with root package name */
    public int f112428v;

    /* renamed from: w, reason: collision with root package name */
    public int f112429w;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f112423q = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final android.util.ArrayMap f112430x = new android.util.ArrayMap();

    static {
        new bw5.o10();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o10)) {
            return false;
        }
        bw5.o10 o10Var = (bw5.o10) fVar;
        return n51.f.a(this.f112413d, o10Var.f112413d) && n51.f.a(this.f112414e, o10Var.f112414e) && n51.f.a(this.f112415f, o10Var.f112415f) && n51.f.a(this.f112416g, o10Var.f112416g) && n51.f.a(this.f112417h, o10Var.f112417h) && n51.f.a(this.f112418i, o10Var.f112418i) && n51.f.a(this.f112419m, o10Var.f112419m) && n51.f.a(java.lang.Integer.valueOf(this.f112420n), java.lang.Integer.valueOf(o10Var.f112420n)) && n51.f.a(this.f112421o, o10Var.f112421o) && n51.f.a(this.f112422p, o10Var.f112422p) && n51.f.a(this.f112423q, o10Var.f112423q) && n51.f.a(java.lang.Integer.valueOf(this.f112424r), java.lang.Integer.valueOf(o10Var.f112424r)) && n51.f.a(java.lang.Integer.valueOf(this.f112425s), java.lang.Integer.valueOf(o10Var.f112425s)) && n51.f.a(java.lang.Integer.valueOf(this.f112426t), java.lang.Integer.valueOf(o10Var.f112426t)) && n51.f.a(java.lang.Integer.valueOf(this.f112427u), java.lang.Integer.valueOf(o10Var.f112427u)) && n51.f.a(java.lang.Integer.valueOf(this.f112428v), java.lang.Integer.valueOf(o10Var.f112428v)) && n51.f.a(java.lang.Integer.valueOf(this.f112429w), java.lang.Integer.valueOf(o10Var.f112429w));
    }

    /* renamed from: hasFieldNumber */
    public boolean m12626x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f112430x.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.o10();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112423q;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f112413d != null && m12626x6e095e9(1)) {
                fVar.j(1, this.f112413d);
            }
            if (this.f112414e != null && m12626x6e095e9(2)) {
                fVar.j(2, this.f112414e);
            }
            if (this.f112415f != null && m12626x6e095e9(3)) {
                fVar.j(3, this.f112415f);
            }
            if (this.f112416g != null && m12626x6e095e9(4)) {
                fVar.j(4, this.f112416g);
            }
            if (this.f112417h != null && m12626x6e095e9(5)) {
                fVar.j(5, this.f112417h);
            }
            if (this.f112418i != null && m12626x6e095e9(6)) {
                fVar.j(6, this.f112418i);
            }
            if (this.f112419m != null && m12626x6e095e9(7)) {
                fVar.j(7, this.f112419m);
            }
            if (m12626x6e095e9(8)) {
                fVar.e(8, this.f112420n);
            }
            if (this.f112421o != null && m12626x6e095e9(9)) {
                fVar.j(9, this.f112421o);
            }
            if (this.f112422p != null && m12626x6e095e9(10)) {
                fVar.j(10, this.f112422p);
            }
            fVar.g(11, 8, linkedList);
            if (m12626x6e095e9(12)) {
                fVar.e(12, this.f112424r);
            }
            if (m12626x6e095e9(14)) {
                fVar.e(14, this.f112425s);
            }
            if (m12626x6e095e9(1000)) {
                fVar.e(1000, this.f112426t);
            }
            if (m12626x6e095e9(1001)) {
                fVar.e(1001, this.f112427u);
            }
            if (m12626x6e095e9(1002)) {
                fVar.e(1002, this.f112428v);
            }
            if (m12626x6e095e9(1003)) {
                fVar.e(1003, this.f112429w);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f112413d != null && m12626x6e095e9(1)) {
                i18 = b36.f.j(1, this.f112413d) + 0;
            }
            if (this.f112414e != null && m12626x6e095e9(2)) {
                i18 += b36.f.j(2, this.f112414e);
            }
            if (this.f112415f != null && m12626x6e095e9(3)) {
                i18 += b36.f.j(3, this.f112415f);
            }
            if (this.f112416g != null && m12626x6e095e9(4)) {
                i18 += b36.f.j(4, this.f112416g);
            }
            if (this.f112417h != null && m12626x6e095e9(5)) {
                i18 += b36.f.j(5, this.f112417h);
            }
            if (this.f112418i != null && m12626x6e095e9(6)) {
                i18 += b36.f.j(6, this.f112418i);
            }
            if (this.f112419m != null && m12626x6e095e9(7)) {
                i18 += b36.f.j(7, this.f112419m);
            }
            if (m12626x6e095e9(8)) {
                i18 += b36.f.e(8, this.f112420n);
            }
            if (this.f112421o != null && m12626x6e095e9(9)) {
                i18 += b36.f.j(9, this.f112421o);
            }
            if (this.f112422p != null && m12626x6e095e9(10)) {
                i18 += b36.f.j(10, this.f112422p);
            }
            int g17 = i18 + b36.f.g(11, 8, linkedList);
            if (m12626x6e095e9(12)) {
                g17 += b36.f.e(12, this.f112424r);
            }
            if (m12626x6e095e9(14)) {
                g17 += b36.f.e(14, this.f112425s);
            }
            if (m12626x6e095e9(1000)) {
                g17 += b36.f.e(1000, this.f112426t);
            }
            if (m12626x6e095e9(1001)) {
                g17 += b36.f.e(1001, this.f112427u);
            }
            if (m12626x6e095e9(1002)) {
                g17 += b36.f.e(1002, this.f112428v);
            }
            return m12626x6e095e9(1003) ? g17 + b36.f.e(1003, this.f112429w) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
        android.util.ArrayMap arrayMap = this.f112430x;
        if (intValue == 14) {
            this.f112425s = aVar2.g(intValue);
            arrayMap.put(14, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f112413d = aVar2.k(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f112414e = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f112415f = aVar2.k(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f112416g = aVar2.k(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f112417h = aVar2.k(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f112418i = aVar2.k(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f112419m = aVar2.k(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f112420n = aVar2.g(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                this.f112421o = aVar2.k(intValue);
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                this.f112422p = aVar2.k(intValue);
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.n10 n10Var = new bw5.n10();
                    if (bArr != null && bArr.length > 0) {
                        n10Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(n10Var);
                }
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            case 12:
                this.f112424r = aVar2.g(intValue);
                arrayMap.put(12, java.lang.Boolean.TRUE);
                return 0;
            default:
                switch (intValue) {
                    case 1000:
                        this.f112426t = aVar2.g(intValue);
                        arrayMap.put(1000, java.lang.Boolean.TRUE);
                        return 0;
                    case 1001:
                        this.f112427u = aVar2.g(intValue);
                        arrayMap.put(1001, java.lang.Boolean.TRUE);
                        return 0;
                    case 1002:
                        this.f112428v = aVar2.g(intValue);
                        arrayMap.put(1002, java.lang.Boolean.TRUE);
                        return 0;
                    case 1003:
                        this.f112429w = aVar2.g(intValue);
                        arrayMap.put(1003, java.lang.Boolean.TRUE);
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.o10) super.mo11468x92b714fd(bArr);
    }
}
