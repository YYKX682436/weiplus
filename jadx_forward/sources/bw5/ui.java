package bw5;

/* loaded from: classes2.dex */
public class ui extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115444d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115445e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115446f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115447g;

    /* renamed from: h, reason: collision with root package name */
    public int f115448h;

    /* renamed from: i, reason: collision with root package name */
    public float f115449i;

    /* renamed from: m, reason: collision with root package name */
    public int f115450m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f115451n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f115452o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115453p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f115454q;

    /* renamed from: r, reason: collision with root package name */
    public int f115455r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f115456s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f115457t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f115458u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f115459v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f115460w = new boolean[17];

    static {
        new bw5.ui();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ui mo11468x92b714fd(byte[] bArr) {
        return (bw5.ui) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ui)) {
            return false;
        }
        bw5.ui uiVar = (bw5.ui) fVar;
        return n51.f.a(this.f115444d, uiVar.f115444d) && n51.f.a(this.f115445e, uiVar.f115445e) && n51.f.a(this.f115446f, uiVar.f115446f) && n51.f.a(this.f115447g, uiVar.f115447g) && n51.f.a(java.lang.Integer.valueOf(this.f115448h), java.lang.Integer.valueOf(uiVar.f115448h)) && n51.f.a(java.lang.Float.valueOf(this.f115449i), java.lang.Float.valueOf(uiVar.f115449i)) && n51.f.a(java.lang.Integer.valueOf(this.f115450m), java.lang.Integer.valueOf(uiVar.f115450m)) && n51.f.a(java.lang.Boolean.valueOf(this.f115451n), java.lang.Boolean.valueOf(uiVar.f115451n)) && n51.f.a(java.lang.Boolean.valueOf(this.f115452o), java.lang.Boolean.valueOf(uiVar.f115452o)) && n51.f.a(this.f115453p, uiVar.f115453p) && n51.f.a(this.f115454q, uiVar.f115454q) && n51.f.a(java.lang.Integer.valueOf(this.f115455r), java.lang.Integer.valueOf(uiVar.f115455r)) && n51.f.a(java.lang.Boolean.valueOf(this.f115456s), java.lang.Boolean.valueOf(uiVar.f115456s)) && n51.f.a(java.lang.Boolean.valueOf(this.f115457t), java.lang.Boolean.valueOf(uiVar.f115457t)) && n51.f.a(this.f115458u, uiVar.f115458u) && n51.f.a(java.lang.Boolean.valueOf(this.f115459v), java.lang.Boolean.valueOf(uiVar.f115459v));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ui();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115460w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115444d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f115445e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f115446f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f115447g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f115448h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f115449i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f115450m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f115451n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f115452o);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f115453p;
            if (gVar != null && zArr[10]) {
                fVar.b(10, gVar);
            }
            java.lang.String str5 = this.f115454q;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            if (zArr[12]) {
                fVar.e(12, this.f115455r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f115456s);
            }
            if (zArr[14]) {
                fVar.a(14, this.f115457t);
            }
            java.lang.String str6 = this.f115458u;
            if (str6 != null && zArr[15]) {
                fVar.j(15, str6);
            }
            if (zArr[16]) {
                fVar.a(16, this.f115459v);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f115444d;
            if (str7 != null && zArr[1]) {
                i18 = b36.f.j(1, str7) + 0;
            }
            java.lang.String str8 = this.f115445e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f115446f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f115447g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f115448h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f115449i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f115450m);
            }
            if (zArr[8]) {
                i18 += b36.f.a(8, this.f115451n);
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f115452o);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f115453p;
            if (gVar2 != null && zArr[10]) {
                i18 += b36.f.b(10, gVar2);
            }
            java.lang.String str11 = this.f115454q;
            if (str11 != null && zArr[11]) {
                i18 += b36.f.j(11, str11);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f115455r);
            }
            if (zArr[13]) {
                i18 += b36.f.a(13, this.f115456s);
            }
            if (zArr[14]) {
                i18 += b36.f.a(14, this.f115457t);
            }
            java.lang.String str12 = this.f115458u;
            if (str12 != null && zArr[15]) {
                i18 += b36.f.j(15, str12);
            }
            return zArr[16] ? i18 + b36.f.a(16, this.f115459v) : i18;
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
                this.f115444d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115445e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115446f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115447g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115448h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115449i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115450m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115451n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115452o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f115453p = aVar2.d(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f115454q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f115455r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f115456s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f115457t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f115458u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f115459v = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            default:
                return -1;
        }
    }
}
