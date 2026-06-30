package r45;

/* loaded from: classes8.dex */
public class uk4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f468964d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468965e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468966f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468967g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468968h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468969i;

    /* renamed from: m, reason: collision with root package name */
    public int f468970m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uk4)) {
            return false;
        }
        r45.uk4 uk4Var = (r45.uk4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f468964d), java.lang.Integer.valueOf(uk4Var.f468964d)) && n51.f.a(this.f468965e, uk4Var.f468965e) && n51.f.a(this.f468966f, uk4Var.f468966f) && n51.f.a(this.f468967g, uk4Var.f468967g) && n51.f.a(this.f468968h, uk4Var.f468968h) && n51.f.a(this.f468969i, uk4Var.f468969i) && n51.f.a(java.lang.Integer.valueOf(this.f468970m), java.lang.Integer.valueOf(uk4Var.f468970m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f468964d);
            java.lang.String str = this.f468965e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f468966f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f468967g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f468968h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f468969i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f468970m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f468964d) + 0;
            java.lang.String str6 = this.f468965e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f468966f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f468967g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f468968h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f468969i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            return e17 + b36.f.e(7, this.f468970m);
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
        r45.uk4 uk4Var = (r45.uk4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uk4Var.f468964d = aVar2.g(intValue);
                return 0;
            case 2:
                uk4Var.f468965e = aVar2.k(intValue);
                return 0;
            case 3:
                uk4Var.f468966f = aVar2.k(intValue);
                return 0;
            case 4:
                uk4Var.f468967g = aVar2.k(intValue);
                return 0;
            case 5:
                uk4Var.f468968h = aVar2.k(intValue);
                return 0;
            case 6:
                uk4Var.f468969i = aVar2.k(intValue);
                return 0;
            case 7:
                uk4Var.f468970m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
