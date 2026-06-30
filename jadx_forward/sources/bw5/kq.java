package bw5;

/* loaded from: classes2.dex */
public class kq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public boolean A;
    public boolean B;
    public boolean C;
    public final boolean[] D = new boolean[29];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111001d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111002e;

    /* renamed from: f, reason: collision with root package name */
    public int f111003f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111004g;

    /* renamed from: h, reason: collision with root package name */
    public int f111005h;

    /* renamed from: i, reason: collision with root package name */
    public long f111006i;

    /* renamed from: m, reason: collision with root package name */
    public int f111007m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f111008n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f111009o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f111010p;

    /* renamed from: q, reason: collision with root package name */
    public int f111011q;

    /* renamed from: r, reason: collision with root package name */
    public int f111012r;

    /* renamed from: s, reason: collision with root package name */
    public int f111013s;

    /* renamed from: t, reason: collision with root package name */
    public int f111014t;

    /* renamed from: u, reason: collision with root package name */
    public int f111015u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f111016v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f111017w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f111018x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f111019y;

    /* renamed from: z, reason: collision with root package name */
    public int f111020z;

    static {
        new bw5.kq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kq mo11468x92b714fd(byte[] bArr) {
        return (bw5.kq) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kq)) {
            return false;
        }
        bw5.kq kqVar = (bw5.kq) fVar;
        return n51.f.a(this.f111001d, kqVar.f111001d) && n51.f.a(this.f111002e, kqVar.f111002e) && n51.f.a(java.lang.Integer.valueOf(this.f111003f), java.lang.Integer.valueOf(kqVar.f111003f)) && n51.f.a(this.f111004g, kqVar.f111004g) && n51.f.a(java.lang.Integer.valueOf(this.f111005h), java.lang.Integer.valueOf(kqVar.f111005h)) && n51.f.a(java.lang.Long.valueOf(this.f111006i), java.lang.Long.valueOf(kqVar.f111006i)) && n51.f.a(java.lang.Integer.valueOf(this.f111007m), java.lang.Integer.valueOf(kqVar.f111007m)) && n51.f.a(this.f111008n, kqVar.f111008n) && n51.f.a(this.f111009o, kqVar.f111009o) && n51.f.a(java.lang.Boolean.valueOf(this.f111010p), java.lang.Boolean.valueOf(kqVar.f111010p)) && n51.f.a(java.lang.Integer.valueOf(this.f111011q), java.lang.Integer.valueOf(kqVar.f111011q)) && n51.f.a(java.lang.Integer.valueOf(this.f111012r), java.lang.Integer.valueOf(kqVar.f111012r)) && n51.f.a(java.lang.Integer.valueOf(this.f111013s), java.lang.Integer.valueOf(kqVar.f111013s)) && n51.f.a(java.lang.Integer.valueOf(this.f111014t), java.lang.Integer.valueOf(kqVar.f111014t)) && n51.f.a(java.lang.Integer.valueOf(this.f111015u), java.lang.Integer.valueOf(kqVar.f111015u)) && n51.f.a(java.lang.Boolean.valueOf(this.f111016v), java.lang.Boolean.valueOf(kqVar.f111016v)) && n51.f.a(java.lang.Boolean.valueOf(this.f111017w), java.lang.Boolean.valueOf(kqVar.f111017w)) && n51.f.a(java.lang.Boolean.valueOf(this.f111018x), java.lang.Boolean.valueOf(kqVar.f111018x)) && n51.f.a(java.lang.Boolean.valueOf(this.f111019y), java.lang.Boolean.valueOf(kqVar.f111019y)) && n51.f.a(java.lang.Integer.valueOf(this.f111020z), java.lang.Integer.valueOf(kqVar.f111020z)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(kqVar.A)) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(kqVar.B)) && n51.f.a(java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(kqVar.C));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.kq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.D;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111001d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f111002e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f111003f);
            }
            java.lang.String str3 = this.f111004g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f111005h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f111006i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f111007m);
            }
            java.lang.String str4 = this.f111008n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f111009o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            if (zArr[10]) {
                fVar.a(10, this.f111010p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f111011q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f111012r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f111013s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f111014t);
            }
            if (zArr[20]) {
                fVar.e(20, this.f111015u);
            }
            if (zArr[21]) {
                fVar.a(21, this.f111016v);
            }
            if (zArr[22]) {
                fVar.a(22, this.f111017w);
            }
            if (zArr[23]) {
                fVar.a(23, this.f111018x);
            }
            if (zArr[24]) {
                fVar.a(24, this.f111019y);
            }
            if (zArr[25]) {
                fVar.e(25, this.f111020z);
            }
            if (zArr[26]) {
                fVar.a(26, this.A);
            }
            if (zArr[27]) {
                fVar.a(27, this.B);
            }
            if (zArr[28]) {
                fVar.a(28, this.C);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f111001d;
            if (str6 != null && zArr[1]) {
                i18 = b36.f.j(1, str6) + 0;
            }
            java.lang.String str7 = this.f111002e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f111003f);
            }
            java.lang.String str8 = this.f111004g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f111005h);
            }
            if (zArr[6]) {
                i18 += b36.f.h(6, this.f111006i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f111007m);
            }
            java.lang.String str9 = this.f111008n;
            if (str9 != null && zArr[8]) {
                i18 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f111009o;
            if (str10 != null && zArr[9]) {
                i18 += b36.f.j(9, str10);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f111010p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f111011q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f111012r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f111013s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f111014t);
            }
            if (zArr[20]) {
                i18 += b36.f.e(20, this.f111015u);
            }
            if (zArr[21]) {
                i18 += b36.f.a(21, this.f111016v);
            }
            if (zArr[22]) {
                i18 += b36.f.a(22, this.f111017w);
            }
            if (zArr[23]) {
                i18 += b36.f.a(23, this.f111018x);
            }
            if (zArr[24]) {
                i18 += b36.f.a(24, this.f111019y);
            }
            if (zArr[25]) {
                i18 += b36.f.e(25, this.f111020z);
            }
            if (zArr[26]) {
                i18 += b36.f.a(26, this.A);
            }
            if (zArr[27]) {
                i18 += b36.f.a(27, this.B);
            }
            return zArr[28] ? i18 + b36.f.a(28, this.C) : i18;
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
                this.f111001d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111002e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111003f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111004g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111005h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111006i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111007m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111008n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111009o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f111010p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f111011q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f111012r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f111013s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f111014t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            default:
                switch (intValue) {
                    case 20:
                        this.f111015u = aVar2.g(intValue);
                        zArr[20] = true;
                        return 0;
                    case 21:
                        this.f111016v = aVar2.c(intValue);
                        zArr[21] = true;
                        return 0;
                    case 22:
                        this.f111017w = aVar2.c(intValue);
                        zArr[22] = true;
                        return 0;
                    case 23:
                        this.f111018x = aVar2.c(intValue);
                        zArr[23] = true;
                        return 0;
                    case 24:
                        this.f111019y = aVar2.c(intValue);
                        zArr[24] = true;
                        return 0;
                    case 25:
                        this.f111020z = aVar2.g(intValue);
                        zArr[25] = true;
                        return 0;
                    case 26:
                        this.A = aVar2.c(intValue);
                        zArr[26] = true;
                        return 0;
                    case 27:
                        this.B = aVar2.c(intValue);
                        zArr[27] = true;
                        return 0;
                    case 28:
                        this.C = aVar2.c(intValue);
                        zArr[28] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
