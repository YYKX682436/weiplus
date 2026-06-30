package bw5;

/* loaded from: classes2.dex */
public class zp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117609d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f117610e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117611f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f117612g;

    /* renamed from: h, reason: collision with root package name */
    public int f117613h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f117614i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f117615m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f117616n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f117617o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f117618p;

    /* renamed from: q, reason: collision with root package name */
    public int f117619q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f117620r;

    /* renamed from: s, reason: collision with root package name */
    public int f117621s;

    /* renamed from: t, reason: collision with root package name */
    public int f117622t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f117623u;

    /* renamed from: v, reason: collision with root package name */
    public int f117624v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f117625w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f117626x = new boolean[18];

    static {
        new bw5.zp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zp mo11468x92b714fd(byte[] bArr) {
        return (bw5.zp) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zp)) {
            return false;
        }
        bw5.zp zpVar = (bw5.zp) fVar;
        return n51.f.a(this.f117609d, zpVar.f117609d) && n51.f.a(this.f117610e, zpVar.f117610e) && n51.f.a(this.f117611f, zpVar.f117611f) && n51.f.a(java.lang.Boolean.valueOf(this.f117612g), java.lang.Boolean.valueOf(zpVar.f117612g)) && n51.f.a(java.lang.Integer.valueOf(this.f117613h), java.lang.Integer.valueOf(zpVar.f117613h)) && n51.f.a(this.f117614i, zpVar.f117614i) && n51.f.a(this.f117615m, zpVar.f117615m) && n51.f.a(this.f117616n, zpVar.f117616n) && n51.f.a(this.f117617o, zpVar.f117617o) && n51.f.a(this.f117618p, zpVar.f117618p) && n51.f.a(java.lang.Integer.valueOf(this.f117619q), java.lang.Integer.valueOf(zpVar.f117619q)) && n51.f.a(java.lang.Boolean.valueOf(this.f117620r), java.lang.Boolean.valueOf(zpVar.f117620r)) && n51.f.a(java.lang.Integer.valueOf(this.f117621s), java.lang.Integer.valueOf(zpVar.f117621s)) && n51.f.a(java.lang.Integer.valueOf(this.f117622t), java.lang.Integer.valueOf(zpVar.f117622t)) && n51.f.a(java.lang.Boolean.valueOf(this.f117623u), java.lang.Boolean.valueOf(zpVar.f117623u)) && n51.f.a(java.lang.Integer.valueOf(this.f117624v), java.lang.Integer.valueOf(zpVar.f117624v)) && n51.f.a(java.lang.Boolean.valueOf(this.f117625w), java.lang.Boolean.valueOf(zpVar.f117625w));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f117626x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117609d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f117610e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str2 = this.f117611f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f117612g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f117613h);
            }
            java.lang.String str3 = this.f117614i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f117615m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f117616n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f117617o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f117618p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            if (zArr[11]) {
                fVar.e(11, this.f117619q);
            }
            if (zArr[12]) {
                fVar.a(12, this.f117620r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f117621s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f117622t);
            }
            if (zArr[15]) {
                fVar.a(15, this.f117623u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f117624v);
            }
            if (zArr[17]) {
                fVar.a(17, this.f117625w);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f117609d;
            if (str8 != null && zArr[1]) {
                i18 = b36.f.j(1, str8) + 0;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f117610e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            java.lang.String str9 = this.f117611f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f117612g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f117613h);
            }
            java.lang.String str10 = this.f117614i;
            if (str10 != null && zArr[6]) {
                i18 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f117615m;
            if (str11 != null && zArr[7]) {
                i18 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f117616n;
            if (str12 != null && zArr[8]) {
                i18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f117617o;
            if (str13 != null && zArr[9]) {
                i18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f117618p;
            if (str14 != null && zArr[10]) {
                i18 += b36.f.j(10, str14);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f117619q);
            }
            if (zArr[12]) {
                i18 += b36.f.a(12, this.f117620r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f117621s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f117622t);
            }
            if (zArr[15]) {
                i18 += b36.f.a(15, this.f117623u);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f117624v);
            }
            return zArr[17] ? i18 + b36.f.a(17, this.f117625w) : i18;
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
                this.f117609d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117610e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f117611f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117612g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117613h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117614i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f117615m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f117616n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f117617o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f117618p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f117619q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f117620r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f117621s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f117622t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f117623u = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f117624v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f117625w = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }
}
