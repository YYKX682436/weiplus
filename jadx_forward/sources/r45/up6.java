package r45;

/* loaded from: classes9.dex */
public class up6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469086d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469087e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469088f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469089g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469090h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469091i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469092m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.up6)) {
            return false;
        }
        r45.up6 up6Var = (r45.up6) fVar;
        return n51.f.a(this.f469086d, up6Var.f469086d) && n51.f.a(this.f469087e, up6Var.f469087e) && n51.f.a(this.f469088f, up6Var.f469088f) && n51.f.a(this.f469089g, up6Var.f469089g) && n51.f.a(this.f469090h, up6Var.f469090h) && n51.f.a(this.f469091i, up6Var.f469091i) && n51.f.a(this.f469092m, up6Var.f469092m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469086d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469087e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f469088f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f469089g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f469090h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f469091i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f469092m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f469086d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f469087e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f469088f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f469089g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f469090h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f469091i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f469092m;
            return str14 != null ? j17 + b36.f.j(7, str14) : j17;
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
        r45.up6 up6Var = (r45.up6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                up6Var.f469086d = aVar2.k(intValue);
                return 0;
            case 2:
                up6Var.f469087e = aVar2.k(intValue);
                return 0;
            case 3:
                up6Var.f469088f = aVar2.k(intValue);
                return 0;
            case 4:
                up6Var.f469089g = aVar2.k(intValue);
                return 0;
            case 5:
                up6Var.f469090h = aVar2.k(intValue);
                return 0;
            case 6:
                up6Var.f469091i = aVar2.k(intValue);
                return 0;
            case 7:
                up6Var.f469092m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
