package bw5;

/* loaded from: classes2.dex */
public class zi extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public int F;
    public final boolean[] G = new boolean[28];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117537d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117538e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117539f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f117540g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f117541h;

    /* renamed from: i, reason: collision with root package name */
    public int f117542i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f117543m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f117544n;

    /* renamed from: o, reason: collision with root package name */
    public int f117545o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f117546p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f117547q;

    /* renamed from: r, reason: collision with root package name */
    public int f117548r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f117549s;

    /* renamed from: t, reason: collision with root package name */
    public int f117550t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f117551u;

    /* renamed from: v, reason: collision with root package name */
    public int f117552v;

    /* renamed from: w, reason: collision with root package name */
    public long f117553w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f117554x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f117555y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f117556z;

    static {
        new bw5.zi();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zi mo11468x92b714fd(byte[] bArr) {
        return (bw5.zi) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zi)) {
            return false;
        }
        bw5.zi ziVar = (bw5.zi) fVar;
        return n51.f.a(this.f117537d, ziVar.f117537d) && n51.f.a(this.f117538e, ziVar.f117538e) && n51.f.a(this.f117539f, ziVar.f117539f) && n51.f.a(this.f117540g, ziVar.f117540g) && n51.f.a(this.f117541h, ziVar.f117541h) && n51.f.a(java.lang.Integer.valueOf(this.f117542i), java.lang.Integer.valueOf(ziVar.f117542i)) && n51.f.a(this.f117543m, ziVar.f117543m) && n51.f.a(this.f117544n, ziVar.f117544n) && n51.f.a(java.lang.Integer.valueOf(this.f117545o), java.lang.Integer.valueOf(ziVar.f117545o)) && n51.f.a(java.lang.Boolean.valueOf(this.f117546p), java.lang.Boolean.valueOf(ziVar.f117546p)) && n51.f.a(java.lang.Boolean.valueOf(this.f117547q), java.lang.Boolean.valueOf(ziVar.f117547q)) && n51.f.a(java.lang.Integer.valueOf(this.f117548r), java.lang.Integer.valueOf(ziVar.f117548r)) && n51.f.a(this.f117549s, ziVar.f117549s) && n51.f.a(java.lang.Integer.valueOf(this.f117550t), java.lang.Integer.valueOf(ziVar.f117550t)) && n51.f.a(this.f117551u, ziVar.f117551u) && n51.f.a(java.lang.Integer.valueOf(this.f117552v), java.lang.Integer.valueOf(ziVar.f117552v)) && n51.f.a(java.lang.Long.valueOf(this.f117553w), java.lang.Long.valueOf(ziVar.f117553w)) && n51.f.a(this.f117554x, ziVar.f117554x) && n51.f.a(this.f117555y, ziVar.f117555y) && n51.f.a(this.f117556z, ziVar.f117556z) && n51.f.a(this.A, ziVar.A) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(ziVar.B)) && n51.f.a(java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(ziVar.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(ziVar.D)) && n51.f.a(java.lang.Boolean.valueOf(this.E), java.lang.Boolean.valueOf(ziVar.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(ziVar.F));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zi();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.G;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117537d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f117538e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f117539f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f117540g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f117541h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f117542i);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f117543m;
            if (gVar != null && zArr[7]) {
                fVar.b(7, gVar);
            }
            java.lang.String str6 = this.f117544n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[9]) {
                fVar.e(9, this.f117545o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f117546p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f117547q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f117548r);
            }
            java.lang.String str7 = this.f117549s;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            if (zArr[14]) {
                fVar.e(14, this.f117550t);
            }
            java.lang.String str8 = this.f117551u;
            if (str8 != null && zArr[15]) {
                fVar.j(15, str8);
            }
            if (zArr[16]) {
                fVar.e(16, this.f117552v);
            }
            if (zArr[17]) {
                fVar.h(17, this.f117553w);
            }
            java.lang.String str9 = this.f117554x;
            if (str9 != null && zArr[18]) {
                fVar.j(18, str9);
            }
            java.lang.String str10 = this.f117555y;
            if (str10 != null && zArr[19]) {
                fVar.j(19, str10);
            }
            java.lang.String str11 = this.f117556z;
            if (str11 != null && zArr[20]) {
                fVar.j(20, str11);
            }
            java.lang.String str12 = this.A;
            if (str12 != null && zArr[21]) {
                fVar.j(21, str12);
            }
            if (zArr[22]) {
                fVar.a(22, this.B);
            }
            if (zArr[23]) {
                fVar.a(23, this.C);
            }
            if (zArr[24]) {
                fVar.e(24, this.D);
            }
            if (zArr[26]) {
                fVar.a(26, this.E);
            }
            if (zArr[27]) {
                fVar.e(27, this.F);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f117537d;
            if (str13 != null && zArr[1]) {
                i18 = b36.f.j(1, str13) + 0;
            }
            java.lang.String str14 = this.f117538e;
            if (str14 != null && zArr[2]) {
                i18 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f117539f;
            if (str15 != null && zArr[3]) {
                i18 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f117540g;
            if (str16 != null && zArr[4]) {
                i18 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f117541h;
            if (str17 != null && zArr[5]) {
                i18 += b36.f.j(5, str17);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f117542i);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f117543m;
            if (gVar2 != null && zArr[7]) {
                i18 += b36.f.b(7, gVar2);
            }
            java.lang.String str18 = this.f117544n;
            if (str18 != null && zArr[8]) {
                i18 += b36.f.j(8, str18);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f117545o);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f117546p);
            }
            if (zArr[11]) {
                i18 += b36.f.a(11, this.f117547q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f117548r);
            }
            java.lang.String str19 = this.f117549s;
            if (str19 != null && zArr[13]) {
                i18 += b36.f.j(13, str19);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f117550t);
            }
            java.lang.String str20 = this.f117551u;
            if (str20 != null && zArr[15]) {
                i18 += b36.f.j(15, str20);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f117552v);
            }
            if (zArr[17]) {
                i18 += b36.f.h(17, this.f117553w);
            }
            java.lang.String str21 = this.f117554x;
            if (str21 != null && zArr[18]) {
                i18 += b36.f.j(18, str21);
            }
            java.lang.String str22 = this.f117555y;
            if (str22 != null && zArr[19]) {
                i18 += b36.f.j(19, str22);
            }
            java.lang.String str23 = this.f117556z;
            if (str23 != null && zArr[20]) {
                i18 += b36.f.j(20, str23);
            }
            java.lang.String str24 = this.A;
            if (str24 != null && zArr[21]) {
                i18 += b36.f.j(21, str24);
            }
            if (zArr[22]) {
                i18 += b36.f.a(22, this.B);
            }
            if (zArr[23]) {
                i18 += b36.f.a(23, this.C);
            }
            if (zArr[24]) {
                i18 += b36.f.e(24, this.D);
            }
            if (zArr[26]) {
                i18 += b36.f.a(26, this.E);
            }
            return zArr[27] ? i18 + b36.f.e(27, this.F) : i18;
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
                this.f117537d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117538e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f117539f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117540g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117541h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117542i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f117543m = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f117544n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f117545o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f117546p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f117547q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f117548r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f117549s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f117550t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f117551u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f117552v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f117553w = aVar2.i(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f117554x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f117555y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f117556z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.c(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.c(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            case 25:
            default:
                return -1;
            case 26:
                this.E = aVar2.c(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.F = aVar2.g(intValue);
                zArr[27] = true;
                return 0;
        }
    }
}
