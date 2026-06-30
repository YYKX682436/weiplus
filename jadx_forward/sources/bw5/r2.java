package bw5;

/* loaded from: classes2.dex */
public class r2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113901d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113902e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113903f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113904g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f113905h;

    /* renamed from: i, reason: collision with root package name */
    public int f113906i;

    /* renamed from: m, reason: collision with root package name */
    public int f113907m;

    /* renamed from: n, reason: collision with root package name */
    public int f113908n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f113909o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f113910p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f113911q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f113912r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f113913s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f113914t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f113915u = new boolean[15];

    static {
        new bw5.r2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r2 mo11468x92b714fd(byte[] bArr) {
        return (bw5.r2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r2)) {
            return false;
        }
        bw5.r2 r2Var = (bw5.r2) fVar;
        return n51.f.a(this.f113901d, r2Var.f113901d) && n51.f.a(this.f113902e, r2Var.f113902e) && n51.f.a(this.f113903f, r2Var.f113903f) && n51.f.a(this.f113904g, r2Var.f113904g) && n51.f.a(this.f113905h, r2Var.f113905h) && n51.f.a(java.lang.Integer.valueOf(this.f113906i), java.lang.Integer.valueOf(r2Var.f113906i)) && n51.f.a(java.lang.Integer.valueOf(this.f113907m), java.lang.Integer.valueOf(r2Var.f113907m)) && n51.f.a(java.lang.Integer.valueOf(this.f113908n), java.lang.Integer.valueOf(r2Var.f113908n)) && n51.f.a(this.f113909o, r2Var.f113909o) && n51.f.a(this.f113910p, r2Var.f113910p) && n51.f.a(this.f113911q, r2Var.f113911q) && n51.f.a(this.f113912r, r2Var.f113912r) && n51.f.a(this.f113913s, r2Var.f113913s) && n51.f.a(this.f113914t, r2Var.f113914t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.r2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113915u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113901d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f113902e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f113903f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f113904g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f113905h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f113906i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f113907m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f113908n);
            }
            java.lang.String str6 = this.f113909o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f113910p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f113911q;
            if (str8 != null && zArr[11]) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f113912r;
            if (str9 != null && zArr[12]) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f113913s;
            if (str10 != null && zArr[13]) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f113914t;
            if (str11 == null || !zArr[14]) {
                return 0;
            }
            fVar.j(14, str11);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f113901d;
            int j17 = (str12 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str12);
            java.lang.String str13 = this.f113902e;
            if (str13 != null && zArr[2]) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f113903f;
            if (str14 != null && zArr[3]) {
                j17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f113904g;
            if (str15 != null && zArr[4]) {
                j17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f113905h;
            if (str16 != null && zArr[5]) {
                j17 += b36.f.j(5, str16);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f113906i);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f113907m);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f113908n);
            }
            java.lang.String str17 = this.f113909o;
            if (str17 != null && zArr[9]) {
                j17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f113910p;
            if (str18 != null && zArr[10]) {
                j17 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.f113911q;
            if (str19 != null && zArr[11]) {
                j17 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.f113912r;
            if (str20 != null && zArr[12]) {
                j17 += b36.f.j(12, str20);
            }
            java.lang.String str21 = this.f113913s;
            if (str21 != null && zArr[13]) {
                j17 += b36.f.j(13, str21);
            }
            java.lang.String str22 = this.f113914t;
            return (str22 == null || !zArr[14]) ? j17 : j17 + b36.f.j(14, str22);
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
                this.f113901d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113902e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113903f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113904g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113905h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113906i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113907m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f113908n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f113909o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f113910p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f113911q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f113912r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f113913s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f113914t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
