package r45;

/* loaded from: classes8.dex */
public class za7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473408d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473409e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473410f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f473411g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473412h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f473413i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f473414m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.za7)) {
            return false;
        }
        r45.za7 za7Var = (r45.za7) fVar;
        return n51.f.a(this.f473408d, za7Var.f473408d) && n51.f.a(this.f473409e, za7Var.f473409e) && n51.f.a(this.f473410f, za7Var.f473410f) && n51.f.a(this.f473411g, za7Var.f473411g) && n51.f.a(this.f473412h, za7Var.f473412h) && n51.f.a(this.f473413i, za7Var.f473413i) && n51.f.a(this.f473414m, za7Var.f473414m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473408d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473409e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f473410f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f473411g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f473412h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f473413i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f473414m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f473408d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f473409e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f473410f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f473411g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f473412h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f473413i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f473414m;
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
        r45.za7 za7Var = (r45.za7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                za7Var.f473408d = aVar2.k(intValue);
                return 0;
            case 2:
                za7Var.f473409e = aVar2.k(intValue);
                return 0;
            case 3:
                za7Var.f473410f = aVar2.k(intValue);
                return 0;
            case 4:
                za7Var.f473411g = aVar2.k(intValue);
                return 0;
            case 5:
                za7Var.f473412h = aVar2.k(intValue);
                return 0;
            case 6:
                za7Var.f473413i = aVar2.k(intValue);
                return 0;
            case 7:
                za7Var.f473414m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
