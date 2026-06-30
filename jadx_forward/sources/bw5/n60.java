package bw5;

/* loaded from: classes2.dex */
public class n60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f112041d;

    /* renamed from: e, reason: collision with root package name */
    public int f112042e;

    /* renamed from: f, reason: collision with root package name */
    public int f112043f;

    /* renamed from: g, reason: collision with root package name */
    public int f112044g;

    /* renamed from: h, reason: collision with root package name */
    public int f112045h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f112047m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f112048n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f112049o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f112050p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f112051q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f112052r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f112053s;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f112046i = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final android.util.ArrayMap f112054t = new android.util.ArrayMap();

    static {
        new bw5.n60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.n60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n60)) {
            return false;
        }
        bw5.n60 n60Var = (bw5.n60) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f112041d), java.lang.Integer.valueOf(n60Var.f112041d)) && n51.f.a(java.lang.Integer.valueOf(this.f112042e), java.lang.Integer.valueOf(n60Var.f112042e)) && n51.f.a(java.lang.Integer.valueOf(this.f112043f), java.lang.Integer.valueOf(n60Var.f112043f)) && n51.f.a(java.lang.Integer.valueOf(this.f112044g), java.lang.Integer.valueOf(n60Var.f112044g)) && n51.f.a(java.lang.Integer.valueOf(this.f112045h), java.lang.Integer.valueOf(n60Var.f112045h)) && n51.f.a(this.f112046i, n60Var.f112046i) && n51.f.a(this.f112047m, n60Var.f112047m) && n51.f.a(this.f112048n, n60Var.f112048n) && n51.f.a(java.lang.Boolean.valueOf(this.f112049o), java.lang.Boolean.valueOf(n60Var.f112049o)) && n51.f.a(java.lang.Boolean.valueOf(this.f112050p), java.lang.Boolean.valueOf(n60Var.f112050p)) && n51.f.a(java.lang.Boolean.valueOf(this.f112051q), java.lang.Boolean.valueOf(n60Var.f112051q)) && n51.f.a(this.f112052r, n60Var.f112052r) && n51.f.a(this.f112053s, n60Var.f112053s);
    }

    /* renamed from: hasFieldNumber */
    public boolean m12554x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f112054t.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.n60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112046i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (m12554x6e095e9(1)) {
                fVar.e(1, this.f112041d);
            }
            if (m12554x6e095e9(2)) {
                fVar.e(2, this.f112042e);
            }
            if (m12554x6e095e9(3)) {
                fVar.e(3, this.f112043f);
            }
            if (m12554x6e095e9(4)) {
                fVar.e(4, this.f112044g);
            }
            if (m12554x6e095e9(5)) {
                fVar.e(5, this.f112045h);
            }
            fVar.g(6, 8, linkedList);
            if (this.f112047m != null && m12554x6e095e9(7)) {
                fVar.j(7, this.f112047m);
            }
            if (this.f112048n != null && m12554x6e095e9(8)) {
                fVar.j(8, this.f112048n);
            }
            if (m12554x6e095e9(9)) {
                fVar.a(9, this.f112049o);
            }
            if (m12554x6e095e9(10)) {
                fVar.a(10, this.f112050p);
            }
            if (m12554x6e095e9(11)) {
                fVar.a(11, this.f112051q);
            }
            if (this.f112052r != null && m12554x6e095e9(101)) {
                fVar.j(101, this.f112052r);
            }
            if (this.f112053s != null && m12554x6e095e9(102)) {
                fVar.j(102, this.f112053s);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = m12554x6e095e9(1) ? b36.f.e(1, this.f112041d) + 0 : 0;
            if (m12554x6e095e9(2)) {
                e17 += b36.f.e(2, this.f112042e);
            }
            if (m12554x6e095e9(3)) {
                e17 += b36.f.e(3, this.f112043f);
            }
            if (m12554x6e095e9(4)) {
                e17 += b36.f.e(4, this.f112044g);
            }
            if (m12554x6e095e9(5)) {
                e17 += b36.f.e(5, this.f112045h);
            }
            int g17 = e17 + b36.f.g(6, 8, linkedList);
            if (this.f112047m != null && m12554x6e095e9(7)) {
                g17 += b36.f.j(7, this.f112047m);
            }
            if (this.f112048n != null && m12554x6e095e9(8)) {
                g17 += b36.f.j(8, this.f112048n);
            }
            if (m12554x6e095e9(9)) {
                g17 += b36.f.a(9, this.f112049o);
            }
            if (m12554x6e095e9(10)) {
                g17 += b36.f.a(10, this.f112050p);
            }
            if (m12554x6e095e9(11)) {
                g17 += b36.f.a(11, this.f112051q);
            }
            if (this.f112052r != null && m12554x6e095e9(101)) {
                g17 += b36.f.j(101, this.f112052r);
            }
            return (this.f112053s == null || !m12554x6e095e9(102)) ? g17 : g17 + b36.f.j(102, this.f112053s);
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
        android.util.ArrayMap arrayMap = this.f112054t;
        if (intValue == 101) {
            this.f112052r = aVar2.k(intValue);
            arrayMap.put(101, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 102) {
            this.f112053s = aVar2.k(intValue);
            arrayMap.put(102, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f112041d = aVar2.g(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f112042e = aVar2.g(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f112043f = aVar2.g(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f112044g = aVar2.g(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f112045h = aVar2.g(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.m60 m60Var = new bw5.m60();
                    if (bArr != null && bArr.length > 0) {
                        m60Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(m60Var);
                }
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f112047m = aVar2.k(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f112048n = aVar2.k(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                this.f112049o = aVar2.c(intValue);
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                this.f112050p = aVar2.c(intValue);
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                this.f112051q = aVar2.c(intValue);
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
