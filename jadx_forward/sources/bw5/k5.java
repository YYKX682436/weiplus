package bw5;

/* loaded from: classes9.dex */
public class k5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110772d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110773e;

    /* renamed from: f, reason: collision with root package name */
    public int f110774f;

    /* renamed from: g, reason: collision with root package name */
    public int f110775g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f110776h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f110777i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f110778m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f110779n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f110780o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f110781p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f110782q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f110783r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f110784s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f110785t = new boolean[14];

    static {
        new bw5.k5();
    }

    public java.lang.String b() {
        return this.f110785t[5] ? this.f110776h : "";
    }

    public java.lang.String c() {
        return this.f110785t[8] ? this.f110779n : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k5)) {
            return false;
        }
        bw5.k5 k5Var = (bw5.k5) fVar;
        return n51.f.a(this.f110772d, k5Var.f110772d) && n51.f.a(this.f110773e, k5Var.f110773e) && n51.f.a(java.lang.Integer.valueOf(this.f110774f), java.lang.Integer.valueOf(k5Var.f110774f)) && n51.f.a(java.lang.Integer.valueOf(this.f110775g), java.lang.Integer.valueOf(k5Var.f110775g)) && n51.f.a(this.f110776h, k5Var.f110776h) && n51.f.a(this.f110777i, k5Var.f110777i) && n51.f.a(this.f110778m, k5Var.f110778m) && n51.f.a(this.f110779n, k5Var.f110779n) && n51.f.a(this.f110780o, k5Var.f110780o) && n51.f.a(this.f110781p, k5Var.f110781p) && n51.f.a(this.f110782q, k5Var.f110782q) && n51.f.a(this.f110783r, k5Var.f110783r) && n51.f.a(this.f110784s, k5Var.f110784s);
    }

    public java.lang.String d() {
        return this.f110785t[11] ? this.f110782q : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public bw5.k5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.k5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.k5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110785t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110772d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f110773e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f110774f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f110775g);
            }
            java.lang.String str3 = this.f110776h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f110777i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f110778m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f110779n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f110780o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f110781p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f110782q;
            if (str9 != null && zArr[11]) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f110783r;
            if (str10 != null && zArr[12]) {
                fVar.j(12, str10);
            }
            java.lang.String str11 = this.f110784s;
            if (str11 == null || !zArr[13]) {
                return 0;
            }
            fVar.j(13, str11);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f110772d;
            int j17 = (str12 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str12);
            java.lang.String str13 = this.f110773e;
            if (str13 != null && zArr[2]) {
                j17 += b36.f.j(2, str13);
            }
            if (zArr[3]) {
                j17 += b36.f.e(3, this.f110774f);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f110775g);
            }
            java.lang.String str14 = this.f110776h;
            if (str14 != null && zArr[5]) {
                j17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f110777i;
            if (str15 != null && zArr[6]) {
                j17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f110778m;
            if (str16 != null && zArr[7]) {
                j17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f110779n;
            if (str17 != null && zArr[8]) {
                j17 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f110780o;
            if (str18 != null && zArr[9]) {
                j17 += b36.f.j(9, str18);
            }
            java.lang.String str19 = this.f110781p;
            if (str19 != null && zArr[10]) {
                j17 += b36.f.j(10, str19);
            }
            java.lang.String str20 = this.f110782q;
            if (str20 != null && zArr[11]) {
                j17 += b36.f.j(11, str20);
            }
            java.lang.String str21 = this.f110783r;
            if (str21 != null && zArr[12]) {
                j17 += b36.f.j(12, str21);
            }
            java.lang.String str22 = this.f110784s;
            return (str22 == null || !zArr[13]) ? j17 : j17 + b36.f.j(13, str22);
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
                this.f110772d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110773e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110774f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110775g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110776h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110777i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f110778m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f110779n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f110780o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f110781p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f110782q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f110783r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f110784s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
