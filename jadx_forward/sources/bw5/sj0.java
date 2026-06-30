package bw5;

/* loaded from: classes4.dex */
public class sj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114547d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114548e;

    /* renamed from: f, reason: collision with root package name */
    public int f114549f;

    /* renamed from: g, reason: collision with root package name */
    public int f114550g;

    /* renamed from: h, reason: collision with root package name */
    public int f114551h;

    /* renamed from: i, reason: collision with root package name */
    public int f114552i;

    /* renamed from: m, reason: collision with root package name */
    public int f114553m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f114554n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f114555o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f114556p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f114557q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f114558r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f114559s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f114560t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f114561u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f114562v = new boolean[16];

    static {
        new bw5.sj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sj0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.sj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sj0)) {
            return false;
        }
        bw5.sj0 sj0Var = (bw5.sj0) fVar;
        return n51.f.a(this.f114547d, sj0Var.f114547d) && n51.f.a(this.f114548e, sj0Var.f114548e) && n51.f.a(java.lang.Integer.valueOf(this.f114549f), java.lang.Integer.valueOf(sj0Var.f114549f)) && n51.f.a(java.lang.Integer.valueOf(this.f114550g), java.lang.Integer.valueOf(sj0Var.f114550g)) && n51.f.a(java.lang.Integer.valueOf(this.f114551h), java.lang.Integer.valueOf(sj0Var.f114551h)) && n51.f.a(java.lang.Integer.valueOf(this.f114552i), java.lang.Integer.valueOf(sj0Var.f114552i)) && n51.f.a(java.lang.Integer.valueOf(this.f114553m), java.lang.Integer.valueOf(sj0Var.f114553m)) && n51.f.a(this.f114554n, sj0Var.f114554n) && n51.f.a(this.f114555o, sj0Var.f114555o) && n51.f.a(this.f114556p, sj0Var.f114556p) && n51.f.a(this.f114557q, sj0Var.f114557q) && n51.f.a(this.f114558r, sj0Var.f114558r) && n51.f.a(this.f114559s, sj0Var.f114559s) && n51.f.a(this.f114560t, sj0Var.f114560t) && n51.f.a(this.f114561u, sj0Var.f114561u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.sj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f114562v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114547d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f114548e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f114549f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f114550g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f114551h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f114552i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114553m);
            }
            java.lang.String str3 = this.f114554n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f114555o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f114556p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f114557q;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f114558r;
            if (str7 != null && zArr[12]) {
                fVar.j(12, str7);
            }
            java.lang.String str8 = this.f114559s;
            if (str8 != null && zArr[13]) {
                fVar.j(13, str8);
            }
            java.lang.String str9 = this.f114560t;
            if (str9 != null && zArr[14]) {
                fVar.j(14, str9);
            }
            java.lang.String str10 = this.f114561u;
            if (str10 != null && zArr[15]) {
                fVar.j(15, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f114547d;
            if (str11 != null && zArr[1]) {
                i18 = b36.f.j(1, str11) + 0;
            }
            java.lang.String str12 = this.f114548e;
            if (str12 != null && zArr[2]) {
                i18 += b36.f.j(2, str12);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f114549f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f114550g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f114551h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f114552i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f114553m);
            }
            java.lang.String str13 = this.f114554n;
            if (str13 != null && zArr[8]) {
                i18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f114555o;
            if (str14 != null && zArr[9]) {
                i18 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f114556p;
            if (str15 != null && zArr[10]) {
                i18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f114557q;
            if (str16 != null && zArr[11]) {
                i18 += b36.f.j(11, str16);
            }
            java.lang.String str17 = this.f114558r;
            if (str17 != null && zArr[12]) {
                i18 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f114559s;
            if (str18 != null && zArr[13]) {
                i18 += b36.f.j(13, str18);
            }
            java.lang.String str19 = this.f114560t;
            if (str19 != null && zArr[14]) {
                i18 += b36.f.j(14, str19);
            }
            java.lang.String str20 = this.f114561u;
            return (str20 == null || !zArr[15]) ? i18 : i18 + b36.f.j(15, str20);
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
                this.f114547d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114548e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114549f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114550g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114551h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114552i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114553m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f114554n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f114555o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f114556p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f114557q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f114558r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f114559s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f114560t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f114561u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
