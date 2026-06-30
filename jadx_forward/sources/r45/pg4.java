package r45;

/* loaded from: classes7.dex */
public class pg4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464551d;

    /* renamed from: e, reason: collision with root package name */
    public int f464552e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464553f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464554g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464555h;

    /* renamed from: i, reason: collision with root package name */
    public int f464556i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464557m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464558n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f464559o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pg4)) {
            return false;
        }
        r45.pg4 pg4Var = (r45.pg4) fVar;
        return n51.f.a(this.f464551d, pg4Var.f464551d) && n51.f.a(java.lang.Integer.valueOf(this.f464552e), java.lang.Integer.valueOf(pg4Var.f464552e)) && n51.f.a(this.f464553f, pg4Var.f464553f) && n51.f.a(this.f464554g, pg4Var.f464554g) && n51.f.a(this.f464555h, pg4Var.f464555h) && n51.f.a(java.lang.Integer.valueOf(this.f464556i), java.lang.Integer.valueOf(pg4Var.f464556i)) && n51.f.a(this.f464557m, pg4Var.f464557m) && n51.f.a(this.f464558n, pg4Var.f464558n) && n51.f.a(this.f464559o, pg4Var.f464559o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464551d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f464552e);
            java.lang.String str2 = this.f464553f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f464554g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f464555h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f464556i);
            java.lang.String str5 = this.f464557m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f464558n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f464559o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f464551d;
            int j17 = (str8 != null ? 0 + b36.f.j(1, str8) : 0) + b36.f.e(2, this.f464552e);
            java.lang.String str9 = this.f464553f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f464554g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f464555h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int e17 = j17 + b36.f.e(6, this.f464556i);
            java.lang.String str12 = this.f464557m;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f464558n;
            if (str13 != null) {
                e17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f464559o;
            return str14 != null ? e17 + b36.f.j(9, str14) : e17;
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
        r45.pg4 pg4Var = (r45.pg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pg4Var.f464551d = aVar2.k(intValue);
                return 0;
            case 2:
                pg4Var.f464552e = aVar2.g(intValue);
                return 0;
            case 3:
                pg4Var.f464553f = aVar2.k(intValue);
                return 0;
            case 4:
                pg4Var.f464554g = aVar2.k(intValue);
                return 0;
            case 5:
                pg4Var.f464555h = aVar2.k(intValue);
                return 0;
            case 6:
                pg4Var.f464556i = aVar2.g(intValue);
                return 0;
            case 7:
                pg4Var.f464557m = aVar2.k(intValue);
                return 0;
            case 8:
                pg4Var.f464558n = aVar2.k(intValue);
                return 0;
            case 9:
                pg4Var.f464559o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
