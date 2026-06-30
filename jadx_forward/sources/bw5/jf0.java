package bw5;

/* loaded from: classes4.dex */
public class jf0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110492d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.if0 f110493e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110494f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.s6 f110495g;

    /* renamed from: h, reason: collision with root package name */
    public int f110496h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.x7 f110497i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f110498m;

    /* renamed from: n, reason: collision with root package name */
    public final android.util.ArrayMap f110499n = new android.util.ArrayMap();

    static {
        new bw5.jf0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jf0)) {
            return false;
        }
        bw5.jf0 jf0Var = (bw5.jf0) fVar;
        return n51.f.a(this.f76492x92037252, jf0Var.f76492x92037252) && n51.f.a(this.f110492d, jf0Var.f110492d) && n51.f.a(this.f110493e, jf0Var.f110493e) && n51.f.a(this.f110494f, jf0Var.f110494f) && n51.f.a(this.f110495g, jf0Var.f110495g) && n51.f.a(java.lang.Integer.valueOf(this.f110496h), java.lang.Integer.valueOf(jf0Var.f110496h)) && n51.f.a(this.f110497i, jf0Var.f110497i) && n51.f.a(this.f110498m, jf0Var.f110498m);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return m12236x6e095e9(1) ? this.f76492x92037252 : new r45.ie();
    }

    /* renamed from: hasFieldNumber */
    public boolean m12236x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f110499n.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.jf0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f76492x92037252 != null && m12236x6e095e9(1)) {
                fVar.i(1, this.f76492x92037252.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            if (this.f110492d != null && m12236x6e095e9(2)) {
                fVar.j(2, this.f110492d);
            }
            if (this.f110493e != null && m12236x6e095e9(3)) {
                fVar.i(3, this.f110493e.mo75928xcd1e8d8());
                this.f110493e.mo75956x3d5d1f78(fVar);
            }
            if (this.f110494f != null && m12236x6e095e9(4)) {
                fVar.j(4, this.f110494f);
            }
            if (this.f110495g != null && m12236x6e095e9(5)) {
                fVar.i(5, this.f110495g.mo75928xcd1e8d8());
                this.f110495g.mo75956x3d5d1f78(fVar);
            }
            if (m12236x6e095e9(6)) {
                fVar.e(6, this.f110496h);
            }
            if (this.f110497i != null && m12236x6e095e9(8)) {
                fVar.i(8, this.f110497i.mo75928xcd1e8d8());
                this.f110497i.mo75956x3d5d1f78(fVar);
            }
            if (this.f110498m != null && m12236x6e095e9(1000)) {
                fVar.j(1000, this.f110498m);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f76492x92037252 != null && m12236x6e095e9(1)) {
                i18 = 0 + b36.f.i(1, this.f76492x92037252.mo75928xcd1e8d8());
            }
            if (this.f110492d != null && m12236x6e095e9(2)) {
                i18 += b36.f.j(2, this.f110492d);
            }
            if (this.f110493e != null && m12236x6e095e9(3)) {
                i18 += b36.f.i(3, this.f110493e.mo75928xcd1e8d8());
            }
            if (this.f110494f != null && m12236x6e095e9(4)) {
                i18 += b36.f.j(4, this.f110494f);
            }
            if (this.f110495g != null && m12236x6e095e9(5)) {
                i18 += b36.f.i(5, this.f110495g.mo75928xcd1e8d8());
            }
            if (m12236x6e095e9(6)) {
                i18 += b36.f.e(6, this.f110496h);
            }
            if (this.f110497i != null && m12236x6e095e9(8)) {
                i18 += b36.f.i(8, this.f110497i.mo75928xcd1e8d8());
            }
            return (this.f110498m == null || !m12236x6e095e9(1000)) ? i18 : i18 + b36.f.j(1000, this.f110498m);
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
        android.util.ArrayMap arrayMap = this.f110499n;
        if (intValue == 8) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.x7 x7Var = new bw5.x7();
                if (bArr != null && bArr.length > 0) {
                    x7Var.mo11468x92b714fd(bArr);
                }
                this.f110497i = x7Var;
            }
            arrayMap.put(8, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 1000) {
            this.f110498m = aVar2.k(intValue);
            arrayMap.put(1000, java.lang.Boolean.TRUE);
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
                this.f110492d = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.if0 if0Var = new bw5.if0();
                    if (bArr3 != null && bArr3.length > 0) {
                        if0Var.mo11468x92b714fd(bArr3);
                    }
                    this.f110493e = if0Var;
                }
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f110494f = aVar2.k(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.s6 s6Var = new bw5.s6();
                    if (bArr4 != null && bArr4.length > 0) {
                        s6Var.mo11468x92b714fd(bArr4);
                    }
                    this.f110495g = s6Var;
                }
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f110496h = aVar2.g(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.jf0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f110499n.put(1, java.lang.Boolean.TRUE);
        return this;
    }
}
