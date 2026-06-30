package bw5;

/* loaded from: classes9.dex */
public class y5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116902d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116903e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116904f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116905g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f116906h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f116907i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f116908m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f116909n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f116910o;

    /* renamed from: p, reason: collision with root package name */
    public int f116911p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f116912q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f116913r = new boolean[12];

    static {
        new bw5.y5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.y5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.y5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y5)) {
            return false;
        }
        bw5.y5 y5Var = (bw5.y5) fVar;
        return n51.f.a(this.f116902d, y5Var.f116902d) && n51.f.a(this.f116903e, y5Var.f116903e) && n51.f.a(this.f116904f, y5Var.f116904f) && n51.f.a(this.f116905g, y5Var.f116905g) && n51.f.a(this.f116906h, y5Var.f116906h) && n51.f.a(this.f116907i, y5Var.f116907i) && n51.f.a(this.f116908m, y5Var.f116908m) && n51.f.a(this.f116909n, y5Var.f116909n) && n51.f.a(this.f116910o, y5Var.f116910o) && n51.f.a(java.lang.Integer.valueOf(this.f116911p), java.lang.Integer.valueOf(y5Var.f116911p)) && n51.f.a(this.f116912q, y5Var.f116912q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.y5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116913r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116902d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f116903e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f116904f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f116905g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f116906h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f116907i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f116908m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f116909n;
            if (str8 != null && zArr[8]) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f116910o;
            if (str9 != null && zArr[9]) {
                fVar.j(9, str9);
            }
            if (zArr[10]) {
                fVar.e(10, this.f116911p);
            }
            java.lang.String str10 = this.f116912q;
            if (str10 != null && zArr[11]) {
                fVar.j(11, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f116902d;
            if (str11 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str11);
            }
            java.lang.String str12 = this.f116903e;
            if (str12 != null && zArr[2]) {
                i18 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f116904f;
            if (str13 != null && zArr[3]) {
                i18 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f116905g;
            if (str14 != null && zArr[4]) {
                i18 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f116906h;
            if (str15 != null && zArr[5]) {
                i18 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f116907i;
            if (str16 != null && zArr[6]) {
                i18 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f116908m;
            if (str17 != null && zArr[7]) {
                i18 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f116909n;
            if (str18 != null && zArr[8]) {
                i18 += b36.f.j(8, str18);
            }
            java.lang.String str19 = this.f116910o;
            if (str19 != null && zArr[9]) {
                i18 += b36.f.j(9, str19);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f116911p);
            }
            java.lang.String str20 = this.f116912q;
            return (str20 == null || !zArr[11]) ? i18 : i18 + b36.f.j(11, str20);
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
                this.f116902d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f116903e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116904f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116905g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116906h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116907i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116908m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f116909n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f116910o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f116911p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f116912q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
