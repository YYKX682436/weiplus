package bw5;

/* loaded from: classes10.dex */
public class up extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f115547d;

    /* renamed from: e, reason: collision with root package name */
    public int f115548e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115549f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115550g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f115551h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f115552i;

    /* renamed from: m, reason: collision with root package name */
    public int f115553m;

    /* renamed from: n, reason: collision with root package name */
    public int f115554n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f115555o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f115556p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f115557q;

    /* renamed from: r, reason: collision with root package name */
    public final android.util.ArrayMap f115558r = new android.util.ArrayMap();

    static {
        new bw5.up();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.up mo11468x92b714fd(byte[] bArr) {
        return (bw5.up) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.up)) {
            return false;
        }
        bw5.up upVar = (bw5.up) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115547d), java.lang.Integer.valueOf(upVar.f115547d)) && n51.f.a(java.lang.Integer.valueOf(this.f115548e), java.lang.Integer.valueOf(upVar.f115548e)) && n51.f.a(this.f115549f, upVar.f115549f) && n51.f.a(this.f115550g, upVar.f115550g) && n51.f.a(this.f115551h, upVar.f115551h) && n51.f.a(this.f115552i, upVar.f115552i) && n51.f.a(java.lang.Integer.valueOf(this.f115553m), java.lang.Integer.valueOf(upVar.f115553m)) && n51.f.a(java.lang.Integer.valueOf(this.f115554n), java.lang.Integer.valueOf(upVar.f115554n)) && n51.f.a(this.f115555o, upVar.f115555o) && n51.f.a(this.f115556p, upVar.f115556p) && n51.f.a(this.f115557q, upVar.f115557q);
    }

    /* renamed from: hasFieldNumber */
    public boolean m13139x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f115558r.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.up();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (m13139x6e095e9(1)) {
                fVar.e(1, this.f115547d);
            }
            if (m13139x6e095e9(2)) {
                fVar.e(2, this.f115548e);
            }
            if (this.f115549f != null && m13139x6e095e9(31)) {
                fVar.j(31, this.f115549f);
            }
            if (this.f115550g != null && m13139x6e095e9(32)) {
                fVar.j(32, this.f115550g);
            }
            if (this.f115551h != null && m13139x6e095e9(33)) {
                fVar.j(33, this.f115551h);
            }
            if (this.f115552i != null && m13139x6e095e9(51)) {
                fVar.j(51, this.f115552i);
            }
            if (m13139x6e095e9(52)) {
                fVar.e(52, this.f115553m);
            }
            if (m13139x6e095e9(53)) {
                fVar.e(53, this.f115554n);
            }
            if (this.f115555o != null && m13139x6e095e9(54)) {
                fVar.j(54, this.f115555o);
            }
            if (this.f115556p != null && m13139x6e095e9(55)) {
                fVar.j(55, this.f115556p);
            }
            if (this.f115557q != null && m13139x6e095e9(300)) {
                fVar.j(300, this.f115557q);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = m13139x6e095e9(1) ? 0 + b36.f.e(1, this.f115547d) : 0;
            if (m13139x6e095e9(2)) {
                e17 += b36.f.e(2, this.f115548e);
            }
            if (this.f115549f != null && m13139x6e095e9(31)) {
                e17 += b36.f.j(31, this.f115549f);
            }
            if (this.f115550g != null && m13139x6e095e9(32)) {
                e17 += b36.f.j(32, this.f115550g);
            }
            if (this.f115551h != null && m13139x6e095e9(33)) {
                e17 += b36.f.j(33, this.f115551h);
            }
            if (this.f115552i != null && m13139x6e095e9(51)) {
                e17 += b36.f.j(51, this.f115552i);
            }
            if (m13139x6e095e9(52)) {
                e17 += b36.f.e(52, this.f115553m);
            }
            if (m13139x6e095e9(53)) {
                e17 += b36.f.e(53, this.f115554n);
            }
            if (this.f115555o != null && m13139x6e095e9(54)) {
                e17 += b36.f.j(54, this.f115555o);
            }
            if (this.f115556p != null && m13139x6e095e9(55)) {
                e17 += b36.f.j(55, this.f115556p);
            }
            return (this.f115557q == null || !m13139x6e095e9(300)) ? e17 : e17 + b36.f.j(300, this.f115557q);
        }
        if (i17 == 2) {
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
        android.util.ArrayMap arrayMap = this.f115558r;
        if (intValue == 1) {
            this.f115547d = aVar2.g(intValue);
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f115548e = aVar2.g(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 300) {
            this.f115557q = aVar2.k(intValue);
            arrayMap.put(300, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 31:
                this.f115549f = aVar2.k(intValue);
                arrayMap.put(31, java.lang.Boolean.TRUE);
                return 0;
            case 32:
                this.f115550g = aVar2.k(intValue);
                arrayMap.put(32, java.lang.Boolean.TRUE);
                return 0;
            case 33:
                this.f115551h = aVar2.k(intValue);
                arrayMap.put(33, java.lang.Boolean.TRUE);
                return 0;
            default:
                switch (intValue) {
                    case 51:
                        this.f115552i = aVar2.k(intValue);
                        arrayMap.put(51, java.lang.Boolean.TRUE);
                        return 0;
                    case 52:
                        this.f115553m = aVar2.g(intValue);
                        arrayMap.put(52, java.lang.Boolean.TRUE);
                        return 0;
                    case 53:
                        this.f115554n = aVar2.g(intValue);
                        arrayMap.put(53, java.lang.Boolean.TRUE);
                        return 0;
                    case 54:
                        this.f115555o = aVar2.k(intValue);
                        arrayMap.put(54, java.lang.Boolean.TRUE);
                        return 0;
                    case 55:
                        this.f115556p = aVar2.k(intValue);
                        arrayMap.put(55, java.lang.Boolean.TRUE);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
