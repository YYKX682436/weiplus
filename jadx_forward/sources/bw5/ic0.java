package bw5;

/* loaded from: classes4.dex */
public class ic0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110056d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110057e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110058f;

    /* renamed from: g, reason: collision with root package name */
    public long f110059g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f110060h;

    /* renamed from: i, reason: collision with root package name */
    public long f110061i;

    /* renamed from: m, reason: collision with root package name */
    public int f110062m;

    /* renamed from: n, reason: collision with root package name */
    public int f110063n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.gc0 f110064o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f110065p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.hc0 f110066q;

    /* renamed from: r, reason: collision with root package name */
    public final android.util.ArrayMap f110067r = new android.util.ArrayMap();

    static {
        new bw5.ic0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ic0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ic0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ic0)) {
            return false;
        }
        bw5.ic0 ic0Var = (bw5.ic0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110056d), java.lang.Integer.valueOf(ic0Var.f110056d)) && n51.f.a(this.f110057e, ic0Var.f110057e) && n51.f.a(this.f110058f, ic0Var.f110058f) && n51.f.a(java.lang.Long.valueOf(this.f110059g), java.lang.Long.valueOf(ic0Var.f110059g)) && n51.f.a(this.f110060h, ic0Var.f110060h) && n51.f.a(java.lang.Long.valueOf(this.f110061i), java.lang.Long.valueOf(ic0Var.f110061i)) && n51.f.a(java.lang.Integer.valueOf(this.f110062m), java.lang.Integer.valueOf(ic0Var.f110062m)) && n51.f.a(java.lang.Integer.valueOf(this.f110063n), java.lang.Integer.valueOf(ic0Var.f110063n)) && n51.f.a(this.f110064o, ic0Var.f110064o) && n51.f.a(this.f110065p, ic0Var.f110065p) && n51.f.a(this.f110066q, ic0Var.f110066q);
    }

    /* renamed from: hasFieldNumber */
    public boolean m12143x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f110067r.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ic0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (m12143x6e095e9(5)) {
                fVar.e(5, this.f110056d);
            }
            if (this.f110057e != null && m12143x6e095e9(1)) {
                fVar.j(1, this.f110057e);
            }
            if (this.f110058f != null && m12143x6e095e9(4)) {
                fVar.j(4, this.f110058f);
            }
            if (m12143x6e095e9(2)) {
                fVar.h(2, this.f110059g);
            }
            if (this.f110060h != null && m12143x6e095e9(3)) {
                fVar.j(3, this.f110060h);
            }
            if (m12143x6e095e9(6)) {
                fVar.h(6, this.f110061i);
            }
            if (m12143x6e095e9(7)) {
                fVar.e(7, this.f110062m);
            }
            if (m12143x6e095e9(8)) {
                fVar.e(8, this.f110063n);
            }
            if (this.f110064o != null && m12143x6e095e9(100)) {
                fVar.i(100, this.f110064o.mo75928xcd1e8d8());
                this.f110064o.mo75956x3d5d1f78(fVar);
            }
            if (this.f110065p != null && m12143x6e095e9(101)) {
                fVar.b(101, this.f110065p);
            }
            if (this.f110066q != null && m12143x6e095e9(200)) {
                fVar.i(200, this.f110066q.mo75928xcd1e8d8());
                this.f110066q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = m12143x6e095e9(5) ? 0 + b36.f.e(5, this.f110056d) : 0;
            if (this.f110057e != null && m12143x6e095e9(1)) {
                e17 += b36.f.j(1, this.f110057e);
            }
            if (this.f110058f != null && m12143x6e095e9(4)) {
                e17 += b36.f.j(4, this.f110058f);
            }
            if (m12143x6e095e9(2)) {
                e17 += b36.f.h(2, this.f110059g);
            }
            if (this.f110060h != null && m12143x6e095e9(3)) {
                e17 += b36.f.j(3, this.f110060h);
            }
            if (m12143x6e095e9(6)) {
                e17 += b36.f.h(6, this.f110061i);
            }
            if (m12143x6e095e9(7)) {
                e17 += b36.f.e(7, this.f110062m);
            }
            if (m12143x6e095e9(8)) {
                e17 += b36.f.e(8, this.f110063n);
            }
            if (this.f110064o != null && m12143x6e095e9(100)) {
                e17 += b36.f.i(100, this.f110064o.mo75928xcd1e8d8());
            }
            if (this.f110065p != null && m12143x6e095e9(101)) {
                e17 += b36.f.b(101, this.f110065p);
            }
            return (this.f110066q == null || !m12143x6e095e9(200)) ? e17 : e17 + b36.f.i(200, this.f110066q.mo75928xcd1e8d8());
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
        android.util.ArrayMap arrayMap = this.f110067r;
        if (intValue == 100) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.gc0 gc0Var = new bw5.gc0();
                if (bArr != null && bArr.length > 0) {
                    gc0Var.mo11468x92b714fd(bArr);
                }
                this.f110064o = gc0Var;
            }
            arrayMap.put(100, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 101) {
            this.f110065p = aVar2.d(intValue);
            arrayMap.put(101, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 200) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.hc0 hc0Var = new bw5.hc0();
                if (bArr2 != null && bArr2.length > 0) {
                    hc0Var.mo11468x92b714fd(bArr2);
                }
                this.f110066q = hc0Var;
            }
            arrayMap.put(200, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f110057e = aVar2.k(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f110059g = aVar2.i(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f110060h = aVar2.k(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f110058f = aVar2.k(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f110056d = aVar2.g(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f110061i = aVar2.i(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f110062m = aVar2.g(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f110063n = aVar2.g(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
