package bw5;

/* loaded from: classes2.dex */
public class jd0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public final boolean[] A = new boolean[28];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110464d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110465e;

    /* renamed from: f, reason: collision with root package name */
    public int f110466f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110467g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f110468h;

    /* renamed from: i, reason: collision with root package name */
    public int f110469i;

    /* renamed from: m, reason: collision with root package name */
    public int f110470m;

    /* renamed from: n, reason: collision with root package name */
    public int f110471n;

    /* renamed from: o, reason: collision with root package name */
    public int f110472o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f110473p;

    /* renamed from: q, reason: collision with root package name */
    public int f110474q;

    /* renamed from: r, reason: collision with root package name */
    public int f110475r;

    /* renamed from: s, reason: collision with root package name */
    public int f110476s;

    /* renamed from: t, reason: collision with root package name */
    public int f110477t;

    /* renamed from: u, reason: collision with root package name */
    public int f110478u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f110479v;

    /* renamed from: w, reason: collision with root package name */
    public int f110480w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f110481x;

    /* renamed from: y, reason: collision with root package name */
    public int f110482y;

    /* renamed from: z, reason: collision with root package name */
    public int f110483z;

    static {
        new bw5.jd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jd0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.jd0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jd0)) {
            return false;
        }
        bw5.jd0 jd0Var = (bw5.jd0) fVar;
        return n51.f.a(this.f110464d, jd0Var.f110464d) && n51.f.a(this.f110465e, jd0Var.f110465e) && n51.f.a(java.lang.Integer.valueOf(this.f110466f), java.lang.Integer.valueOf(jd0Var.f110466f)) && n51.f.a(this.f110467g, jd0Var.f110467g) && n51.f.a(this.f110468h, jd0Var.f110468h) && n51.f.a(java.lang.Integer.valueOf(this.f110469i), java.lang.Integer.valueOf(jd0Var.f110469i)) && n51.f.a(java.lang.Integer.valueOf(this.f110470m), java.lang.Integer.valueOf(jd0Var.f110470m)) && n51.f.a(java.lang.Integer.valueOf(this.f110471n), java.lang.Integer.valueOf(jd0Var.f110471n)) && n51.f.a(java.lang.Integer.valueOf(this.f110472o), java.lang.Integer.valueOf(jd0Var.f110472o)) && n51.f.a(this.f110473p, jd0Var.f110473p) && n51.f.a(java.lang.Integer.valueOf(this.f110474q), java.lang.Integer.valueOf(jd0Var.f110474q)) && n51.f.a(java.lang.Integer.valueOf(this.f110475r), java.lang.Integer.valueOf(jd0Var.f110475r)) && n51.f.a(java.lang.Integer.valueOf(this.f110476s), java.lang.Integer.valueOf(jd0Var.f110476s)) && n51.f.a(java.lang.Integer.valueOf(this.f110477t), java.lang.Integer.valueOf(jd0Var.f110477t)) && n51.f.a(java.lang.Integer.valueOf(this.f110478u), java.lang.Integer.valueOf(jd0Var.f110478u)) && n51.f.a(this.f110479v, jd0Var.f110479v) && n51.f.a(java.lang.Integer.valueOf(this.f110480w), java.lang.Integer.valueOf(jd0Var.f110480w)) && n51.f.a(this.f110481x, jd0Var.f110481x) && n51.f.a(java.lang.Integer.valueOf(this.f110482y), java.lang.Integer.valueOf(jd0Var.f110482y)) && n51.f.a(java.lang.Integer.valueOf(this.f110483z), java.lang.Integer.valueOf(jd0Var.f110483z));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.jd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110464d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f110465e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f110466f);
            }
            java.lang.String str3 = this.f110467g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f110468h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f110469i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f110470m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f110471n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f110472o);
            }
            java.lang.String str5 = this.f110473p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            if (zArr[11]) {
                fVar.e(11, this.f110474q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f110475r);
            }
            if (zArr[20]) {
                fVar.e(20, this.f110476s);
            }
            if (zArr[21]) {
                fVar.e(21, this.f110477t);
            }
            if (zArr[22]) {
                fVar.e(22, this.f110478u);
            }
            java.lang.String str6 = this.f110479v;
            if (str6 != null && zArr[23]) {
                fVar.j(23, str6);
            }
            if (zArr[24]) {
                fVar.e(24, this.f110480w);
            }
            java.lang.String str7 = this.f110481x;
            if (str7 != null && zArr[25]) {
                fVar.j(25, str7);
            }
            if (zArr[26]) {
                fVar.e(26, this.f110482y);
            }
            if (zArr[27]) {
                fVar.e(27, this.f110483z);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f110464d;
            if (str8 != null && zArr[1]) {
                i18 = b36.f.j(1, str8) + 0;
            }
            java.lang.String str9 = this.f110465e;
            if (str9 != null && zArr[2]) {
                i18 += b36.f.j(2, str9);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f110466f);
            }
            java.lang.String str10 = this.f110467g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f110468h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f110469i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f110470m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f110471n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f110472o);
            }
            java.lang.String str12 = this.f110473p;
            if (str12 != null && zArr[10]) {
                i18 += b36.f.j(10, str12);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f110474q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f110475r);
            }
            if (zArr[20]) {
                i18 += b36.f.e(20, this.f110476s);
            }
            if (zArr[21]) {
                i18 += b36.f.e(21, this.f110477t);
            }
            if (zArr[22]) {
                i18 += b36.f.e(22, this.f110478u);
            }
            java.lang.String str13 = this.f110479v;
            if (str13 != null && zArr[23]) {
                i18 += b36.f.j(23, str13);
            }
            if (zArr[24]) {
                i18 += b36.f.e(24, this.f110480w);
            }
            java.lang.String str14 = this.f110481x;
            if (str14 != null && zArr[25]) {
                i18 += b36.f.j(25, str14);
            }
            if (zArr[26]) {
                i18 += b36.f.e(26, this.f110482y);
            }
            return zArr[27] ? i18 + b36.f.e(27, this.f110483z) : i18;
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
        switch (intValue) {
            case 1:
                this.f110464d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110465e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110466f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110467g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110468h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110469i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f110470m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f110471n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f110472o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f110473p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f110474q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f110475r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            default:
                switch (intValue) {
                    case 20:
                        this.f110476s = aVar2.g(intValue);
                        zArr[20] = true;
                        return 0;
                    case 21:
                        this.f110477t = aVar2.g(intValue);
                        zArr[21] = true;
                        return 0;
                    case 22:
                        this.f110478u = aVar2.g(intValue);
                        zArr[22] = true;
                        return 0;
                    case 23:
                        this.f110479v = aVar2.k(intValue);
                        zArr[23] = true;
                        return 0;
                    case 24:
                        this.f110480w = aVar2.g(intValue);
                        zArr[24] = true;
                        return 0;
                    case 25:
                        this.f110481x = aVar2.k(intValue);
                        zArr[25] = true;
                        return 0;
                    case 26:
                        this.f110482y = aVar2.g(intValue);
                        zArr[26] = true;
                        return 0;
                    case 27:
                        this.f110483z = aVar2.g(intValue);
                        zArr[27] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
