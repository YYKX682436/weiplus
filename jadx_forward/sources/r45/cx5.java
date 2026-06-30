package r45;

/* loaded from: classes10.dex */
public class cx5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453433d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453434e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453435f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453436g;

    /* renamed from: h, reason: collision with root package name */
    public int f453437h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453438i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f453439m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f453440n;

    /* renamed from: o, reason: collision with root package name */
    public int f453441o;

    /* renamed from: p, reason: collision with root package name */
    public r45.b05 f453442p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f453443q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f453444r;

    /* renamed from: s, reason: collision with root package name */
    public int f453445s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f453446t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cx5)) {
            return false;
        }
        r45.cx5 cx5Var = (r45.cx5) fVar;
        return n51.f.a(this.f453433d, cx5Var.f453433d) && n51.f.a(this.f453434e, cx5Var.f453434e) && n51.f.a(this.f453435f, cx5Var.f453435f) && n51.f.a(this.f453436g, cx5Var.f453436g) && n51.f.a(java.lang.Integer.valueOf(this.f453437h), java.lang.Integer.valueOf(cx5Var.f453437h)) && n51.f.a(this.f453438i, cx5Var.f453438i) && n51.f.a(this.f453439m, cx5Var.f453439m) && n51.f.a(this.f453440n, cx5Var.f453440n) && n51.f.a(java.lang.Integer.valueOf(this.f453441o), java.lang.Integer.valueOf(cx5Var.f453441o)) && n51.f.a(this.f453442p, cx5Var.f453442p) && n51.f.a(this.f453443q, cx5Var.f453443q) && n51.f.a(this.f453444r, cx5Var.f453444r) && n51.f.a(java.lang.Integer.valueOf(this.f453445s), java.lang.Integer.valueOf(cx5Var.f453445s)) && n51.f.a(this.f453446t, cx5Var.f453446t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453433d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f453434e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f453435f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f453436g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f453437h);
            java.lang.String str5 = this.f453438i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f453439m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f453440n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f453441o);
            r45.b05 b05Var = this.f453442p;
            if (b05Var != null) {
                fVar.i(10, b05Var.mo75928xcd1e8d8());
                this.f453442p.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str8 = this.f453443q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f453444r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            fVar.e(13, this.f453445s);
            java.lang.String str10 = this.f453446t;
            if (str10 != null) {
                fVar.j(14, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f453433d;
            int j17 = str11 != null ? b36.f.j(1, str11) + 0 : 0;
            java.lang.String str12 = this.f453434e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f453435f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f453436g;
            if (str14 != null) {
                j17 += b36.f.j(4, str14);
            }
            int e17 = j17 + b36.f.e(5, this.f453437h);
            java.lang.String str15 = this.f453438i;
            if (str15 != null) {
                e17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f453439m;
            if (str16 != null) {
                e17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f453440n;
            if (str17 != null) {
                e17 += b36.f.j(8, str17);
            }
            int e18 = e17 + b36.f.e(9, this.f453441o);
            r45.b05 b05Var2 = this.f453442p;
            if (b05Var2 != null) {
                e18 += b36.f.i(10, b05Var2.mo75928xcd1e8d8());
            }
            java.lang.String str18 = this.f453443q;
            if (str18 != null) {
                e18 += b36.f.j(11, str18);
            }
            java.lang.String str19 = this.f453444r;
            if (str19 != null) {
                e18 += b36.f.j(12, str19);
            }
            int e19 = e18 + b36.f.e(13, this.f453445s);
            java.lang.String str20 = this.f453446t;
            return str20 != null ? e19 + b36.f.j(14, str20) : e19;
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
        r45.cx5 cx5Var = (r45.cx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cx5Var.f453433d = aVar2.k(intValue);
                return 0;
            case 2:
                cx5Var.f453434e = aVar2.k(intValue);
                return 0;
            case 3:
                cx5Var.f453435f = aVar2.k(intValue);
                return 0;
            case 4:
                cx5Var.f453436g = aVar2.k(intValue);
                return 0;
            case 5:
                cx5Var.f453437h = aVar2.g(intValue);
                return 0;
            case 6:
                cx5Var.f453438i = aVar2.k(intValue);
                return 0;
            case 7:
                cx5Var.f453439m = aVar2.k(intValue);
                return 0;
            case 8:
                cx5Var.f453440n = aVar2.k(intValue);
                return 0;
            case 9:
                cx5Var.f453441o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.b05 b05Var3 = new r45.b05();
                    if (bArr != null && bArr.length > 0) {
                        b05Var3.mo11468x92b714fd(bArr);
                    }
                    cx5Var.f453442p = b05Var3;
                }
                return 0;
            case 11:
                cx5Var.f453443q = aVar2.k(intValue);
                return 0;
            case 12:
                cx5Var.f453444r = aVar2.k(intValue);
                return 0;
            case 13:
                cx5Var.f453445s = aVar2.g(intValue);
                return 0;
            case 14:
                cx5Var.f453446t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
