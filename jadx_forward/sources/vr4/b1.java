package vr4;

/* loaded from: classes9.dex */
public class b1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f521223d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f521224e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f521225f;

    /* renamed from: g, reason: collision with root package name */
    public int f521226g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f521227h;

    /* renamed from: i, reason: collision with root package name */
    public int f521228i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f521229m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f521230n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f521231o = "0";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f521232p = "0";

    /* renamed from: q, reason: collision with root package name */
    public int f521233q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f521234r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f521235s;

    /* renamed from: t, reason: collision with root package name */
    public int f521236t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f521237u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.b1)) {
            return false;
        }
        vr4.b1 b1Var = (vr4.b1) fVar;
        return n51.f.a(this.f521223d, b1Var.f521223d) && n51.f.a(this.f521224e, b1Var.f521224e) && n51.f.a(this.f521225f, b1Var.f521225f) && n51.f.a(java.lang.Integer.valueOf(this.f521226g), java.lang.Integer.valueOf(b1Var.f521226g)) && n51.f.a(this.f521227h, b1Var.f521227h) && n51.f.a(java.lang.Integer.valueOf(this.f521228i), java.lang.Integer.valueOf(b1Var.f521228i)) && n51.f.a(this.f521229m, b1Var.f521229m) && n51.f.a(this.f521230n, b1Var.f521230n) && n51.f.a(this.f521231o, b1Var.f521231o) && n51.f.a(this.f521232p, b1Var.f521232p) && n51.f.a(java.lang.Integer.valueOf(this.f521233q), java.lang.Integer.valueOf(b1Var.f521233q)) && n51.f.a(this.f521234r, b1Var.f521234r) && n51.f.a(this.f521235s, b1Var.f521235s) && n51.f.a(java.lang.Integer.valueOf(this.f521236t), java.lang.Integer.valueOf(b1Var.f521236t)) && n51.f.a(this.f521237u, b1Var.f521237u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f521223d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f521224e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f521225f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f521226g);
            java.lang.String str4 = this.f521227h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f521228i);
            java.lang.String str5 = this.f521229m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f521230n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f521231o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f521232p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            fVar.e(11, this.f521233q);
            java.lang.String str9 = this.f521234r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f521235s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            fVar.e(14, this.f521236t);
            java.lang.String str11 = this.f521237u;
            if (str11 != null) {
                fVar.j(15, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f521223d;
            int j17 = str12 != null ? b36.f.j(1, str12) + 0 : 0;
            java.lang.String str13 = this.f521224e;
            if (str13 != null) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f521225f;
            if (str14 != null) {
                j17 += b36.f.j(3, str14);
            }
            int e17 = j17 + b36.f.e(4, this.f521226g);
            java.lang.String str15 = this.f521227h;
            if (str15 != null) {
                e17 += b36.f.j(5, str15);
            }
            int e18 = e17 + b36.f.e(6, this.f521228i);
            java.lang.String str16 = this.f521229m;
            if (str16 != null) {
                e18 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f521230n;
            if (str17 != null) {
                e18 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f521231o;
            if (str18 != null) {
                e18 += b36.f.j(9, str18);
            }
            java.lang.String str19 = this.f521232p;
            if (str19 != null) {
                e18 += b36.f.j(10, str19);
            }
            int e19 = e18 + b36.f.e(11, this.f521233q);
            java.lang.String str20 = this.f521234r;
            if (str20 != null) {
                e19 += b36.f.j(12, str20);
            }
            java.lang.String str21 = this.f521235s;
            if (str21 != null) {
                e19 += b36.f.j(13, str21);
            }
            int e27 = e19 + b36.f.e(14, this.f521236t);
            java.lang.String str22 = this.f521237u;
            return str22 != null ? e27 + b36.f.j(15, str22) : e27;
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
        vr4.b1 b1Var = (vr4.b1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b1Var.f521223d = aVar2.k(intValue);
                return 0;
            case 2:
                b1Var.f521224e = aVar2.k(intValue);
                return 0;
            case 3:
                b1Var.f521225f = aVar2.k(intValue);
                return 0;
            case 4:
                b1Var.f521226g = aVar2.g(intValue);
                return 0;
            case 5:
                b1Var.f521227h = aVar2.k(intValue);
                return 0;
            case 6:
                b1Var.f521228i = aVar2.g(intValue);
                return 0;
            case 7:
                b1Var.f521229m = aVar2.k(intValue);
                return 0;
            case 8:
                b1Var.f521230n = aVar2.k(intValue);
                return 0;
            case 9:
                b1Var.f521231o = aVar2.k(intValue);
                return 0;
            case 10:
                b1Var.f521232p = aVar2.k(intValue);
                return 0;
            case 11:
                b1Var.f521233q = aVar2.g(intValue);
                return 0;
            case 12:
                b1Var.f521234r = aVar2.k(intValue);
                return 0;
            case 13:
                b1Var.f521235s = aVar2.k(intValue);
                return 0;
            case 14:
                b1Var.f521236t = aVar2.g(intValue);
                return 0;
            case 15:
                b1Var.f521237u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
