package r45;

/* loaded from: classes4.dex */
public class jp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459531d;

    /* renamed from: e, reason: collision with root package name */
    public int f459532e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459533f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459534g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459535h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459536i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459537m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f459538n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jp0)) {
            return false;
        }
        r45.jp0 jp0Var = (r45.jp0) fVar;
        return n51.f.a(this.f459531d, jp0Var.f459531d) && n51.f.a(java.lang.Integer.valueOf(this.f459532e), java.lang.Integer.valueOf(jp0Var.f459532e)) && n51.f.a(this.f459533f, jp0Var.f459533f) && n51.f.a(this.f459534g, jp0Var.f459534g) && n51.f.a(this.f459535h, jp0Var.f459535h) && n51.f.a(this.f459536i, jp0Var.f459536i) && n51.f.a(this.f459537m, jp0Var.f459537m) && n51.f.a(this.f459538n, jp0Var.f459538n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459531d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f459532e);
            java.lang.String str2 = this.f459533f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f459534g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f459535h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f459536i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f459537m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f459538n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f459531d;
            int j17 = (str8 != null ? 0 + b36.f.j(1, str8) : 0) + b36.f.e(2, this.f459532e);
            java.lang.String str9 = this.f459533f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f459534g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f459535h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f459536i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f459537m;
            if (str13 != null) {
                j17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f459538n;
            return str14 != null ? j17 + b36.f.j(8, str14) : j17;
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
        r45.jp0 jp0Var = (r45.jp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jp0Var.f459531d = aVar2.k(intValue);
                return 0;
            case 2:
                jp0Var.f459532e = aVar2.g(intValue);
                return 0;
            case 3:
                jp0Var.f459533f = aVar2.k(intValue);
                return 0;
            case 4:
                jp0Var.f459534g = aVar2.k(intValue);
                return 0;
            case 5:
                jp0Var.f459535h = aVar2.k(intValue);
                return 0;
            case 6:
                jp0Var.f459536i = aVar2.k(intValue);
                return 0;
            case 7:
                jp0Var.f459537m = aVar2.k(intValue);
                return 0;
            case 8:
                jp0Var.f459538n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
