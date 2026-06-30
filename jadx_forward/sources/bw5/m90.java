package bw5;

/* loaded from: classes2.dex */
public class m90 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111659d;

    /* renamed from: e, reason: collision with root package name */
    public int f111660e;

    /* renamed from: f, reason: collision with root package name */
    public int f111661f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.k90 f111662g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.j90 f111663h;

    /* renamed from: i, reason: collision with root package name */
    public int f111664i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.i90 f111665m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111666n;

    /* renamed from: o, reason: collision with root package name */
    public int f111667o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f111668p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111669q;

    /* renamed from: r, reason: collision with root package name */
    public int f111670r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f111671s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.l90 f111672t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.s40 f111673u;

    /* renamed from: v, reason: collision with root package name */
    public final android.util.ArrayMap f111674v = new android.util.ArrayMap();

    static {
        new bw5.m90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m90 mo11468x92b714fd(byte[] bArr) {
        return (bw5.m90) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m90)) {
            return false;
        }
        bw5.m90 m90Var = (bw5.m90) fVar;
        return n51.f.a(this.f76492x92037252, m90Var.f76492x92037252) && n51.f.a(this.f111659d, m90Var.f111659d) && n51.f.a(java.lang.Integer.valueOf(this.f111660e), java.lang.Integer.valueOf(m90Var.f111660e)) && n51.f.a(java.lang.Integer.valueOf(this.f111661f), java.lang.Integer.valueOf(m90Var.f111661f)) && n51.f.a(this.f111662g, m90Var.f111662g) && n51.f.a(this.f111663h, m90Var.f111663h) && n51.f.a(java.lang.Integer.valueOf(this.f111664i), java.lang.Integer.valueOf(m90Var.f111664i)) && n51.f.a(this.f111665m, m90Var.f111665m) && n51.f.a(this.f111666n, m90Var.f111666n) && n51.f.a(java.lang.Integer.valueOf(this.f111667o), java.lang.Integer.valueOf(m90Var.f111667o)) && n51.f.a(java.lang.Boolean.valueOf(this.f111668p), java.lang.Boolean.valueOf(m90Var.f111668p)) && n51.f.a(this.f111669q, m90Var.f111669q) && n51.f.a(java.lang.Integer.valueOf(this.f111670r), java.lang.Integer.valueOf(m90Var.f111670r)) && n51.f.a(this.f111671s, m90Var.f111671s) && n51.f.a(this.f111672t, m90Var.f111672t) && n51.f.a(this.f111673u, m90Var.f111673u);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return m12479x6e095e9(1) ? this.f76492x92037252 : new r45.ie();
    }

    /* renamed from: hasFieldNumber */
    public boolean m12479x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f111674v.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.m90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f76492x92037252 != null && m12479x6e095e9(1)) {
                fVar.i(1, this.f76492x92037252.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            if (this.f111659d != null && m12479x6e095e9(2)) {
                fVar.j(2, this.f111659d);
            }
            if (m12479x6e095e9(3)) {
                fVar.e(3, this.f111660e);
            }
            if (m12479x6e095e9(4)) {
                fVar.e(4, this.f111661f);
            }
            if (this.f111662g != null && m12479x6e095e9(5)) {
                fVar.i(5, this.f111662g.mo75928xcd1e8d8());
                this.f111662g.mo75956x3d5d1f78(fVar);
            }
            if (this.f111663h != null && m12479x6e095e9(6)) {
                fVar.i(6, this.f111663h.mo75928xcd1e8d8());
                this.f111663h.mo75956x3d5d1f78(fVar);
            }
            if (m12479x6e095e9(7)) {
                fVar.e(7, this.f111664i);
            }
            if (this.f111665m != null && m12479x6e095e9(8)) {
                fVar.i(8, this.f111665m.mo75928xcd1e8d8());
                this.f111665m.mo75956x3d5d1f78(fVar);
            }
            if (this.f111666n != null && m12479x6e095e9(9)) {
                fVar.b(9, this.f111666n);
            }
            if (m12479x6e095e9(10)) {
                fVar.e(10, this.f111667o);
            }
            if (m12479x6e095e9(11)) {
                fVar.a(11, this.f111668p);
            }
            if (this.f111669q != null && m12479x6e095e9(12)) {
                fVar.b(12, this.f111669q);
            }
            if (m12479x6e095e9(13)) {
                fVar.e(13, this.f111670r);
            }
            if (this.f111671s != null && m12479x6e095e9(14)) {
                fVar.j(14, this.f111671s);
            }
            if (this.f111672t != null && m12479x6e095e9(15)) {
                fVar.i(15, this.f111672t.mo75928xcd1e8d8());
                this.f111672t.mo75956x3d5d1f78(fVar);
            }
            if (this.f111673u != null && m12479x6e095e9(1001)) {
                fVar.i(1001, this.f111673u.mo75928xcd1e8d8());
                this.f111673u.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f76492x92037252 != null && m12479x6e095e9(1)) {
                i18 = b36.f.i(1, this.f76492x92037252.mo75928xcd1e8d8()) + 0;
            }
            if (this.f111659d != null && m12479x6e095e9(2)) {
                i18 += b36.f.j(2, this.f111659d);
            }
            if (m12479x6e095e9(3)) {
                i18 += b36.f.e(3, this.f111660e);
            }
            if (m12479x6e095e9(4)) {
                i18 += b36.f.e(4, this.f111661f);
            }
            if (this.f111662g != null && m12479x6e095e9(5)) {
                i18 += b36.f.i(5, this.f111662g.mo75928xcd1e8d8());
            }
            if (this.f111663h != null && m12479x6e095e9(6)) {
                i18 += b36.f.i(6, this.f111663h.mo75928xcd1e8d8());
            }
            if (m12479x6e095e9(7)) {
                i18 += b36.f.e(7, this.f111664i);
            }
            if (this.f111665m != null && m12479x6e095e9(8)) {
                i18 += b36.f.i(8, this.f111665m.mo75928xcd1e8d8());
            }
            if (this.f111666n != null && m12479x6e095e9(9)) {
                i18 += b36.f.b(9, this.f111666n);
            }
            if (m12479x6e095e9(10)) {
                i18 += b36.f.e(10, this.f111667o);
            }
            if (m12479x6e095e9(11)) {
                i18 += b36.f.a(11, this.f111668p);
            }
            if (this.f111669q != null && m12479x6e095e9(12)) {
                i18 += b36.f.b(12, this.f111669q);
            }
            if (m12479x6e095e9(13)) {
                i18 += b36.f.e(13, this.f111670r);
            }
            if (this.f111671s != null && m12479x6e095e9(14)) {
                i18 += b36.f.j(14, this.f111671s);
            }
            if (this.f111672t != null && m12479x6e095e9(15)) {
                i18 += b36.f.i(15, this.f111672t.mo75928xcd1e8d8());
            }
            return (this.f111673u == null || !m12479x6e095e9(1001)) ? i18 : i18 + b36.f.i(1001, this.f111673u.mo75928xcd1e8d8());
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
        android.util.ArrayMap arrayMap = this.f111674v;
        if (intValue == 1001) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.s40 s40Var = new bw5.s40();
                if (bArr != null && bArr.length > 0) {
                    s40Var.mo11468x92b714fd(bArr);
                }
                this.f111673u = s40Var;
            }
            arrayMap.put(1001, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ie ieVar = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar.mo11468x92b714fd(bArr2);
                    }
                    this.f76492x92037252 = ieVar;
                }
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f111659d = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f111660e = aVar2.g(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f111661f = aVar2.g(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.k90 k90Var = new bw5.k90();
                    if (bArr3 != null && bArr3.length > 0) {
                        k90Var.mo11468x92b714fd(bArr3);
                    }
                    this.f111662g = k90Var;
                }
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.j90 j90Var = new bw5.j90();
                    if (bArr4 != null && bArr4.length > 0) {
                        j90Var.mo11468x92b714fd(bArr4);
                    }
                    this.f111663h = j90Var;
                }
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f111664i = aVar2.g(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.i90 i90Var = new bw5.i90();
                    if (bArr5 != null && bArr5.length > 0) {
                        i90Var.mo11468x92b714fd(bArr5);
                    }
                    this.f111665m = i90Var;
                }
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                this.f111666n = aVar2.d(intValue);
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                this.f111667o = aVar2.g(intValue);
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                this.f111668p = aVar2.c(intValue);
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            case 12:
                this.f111669q = aVar2.d(intValue);
                arrayMap.put(12, java.lang.Boolean.TRUE);
                return 0;
            case 13:
                this.f111670r = aVar2.g(intValue);
                arrayMap.put(13, java.lang.Boolean.TRUE);
                return 0;
            case 14:
                this.f111671s = aVar2.k(intValue);
                arrayMap.put(14, java.lang.Boolean.TRUE);
                return 0;
            case 15:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.l90 l90Var = new bw5.l90();
                    if (bArr6 != null && bArr6.length > 0) {
                        l90Var.mo11468x92b714fd(bArr6);
                    }
                    this.f111672t = l90Var;
                }
                arrayMap.put(15, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f111674v.put(1, java.lang.Boolean.TRUE);
        return this;
    }
}
