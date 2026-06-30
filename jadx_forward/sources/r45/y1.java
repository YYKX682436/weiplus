package r45;

/* loaded from: classes9.dex */
public class y1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472225d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472226e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472227f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472228g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472229h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472230i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f472231m;

    /* renamed from: n, reason: collision with root package name */
    public int f472232n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y1)) {
            return false;
        }
        r45.y1 y1Var = (r45.y1) fVar;
        return n51.f.a(this.f472225d, y1Var.f472225d) && n51.f.a(this.f472226e, y1Var.f472226e) && n51.f.a(this.f472227f, y1Var.f472227f) && n51.f.a(this.f472228g, y1Var.f472228g) && n51.f.a(this.f472229h, y1Var.f472229h) && n51.f.a(this.f472230i, y1Var.f472230i) && n51.f.a(this.f472231m, y1Var.f472231m) && n51.f.a(java.lang.Integer.valueOf(this.f472232n), java.lang.Integer.valueOf(y1Var.f472232n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472225d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472226e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f472227f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f472228g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f472229h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f472230i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f472231m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.e(8, this.f472232n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f472225d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f472226e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f472227f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f472228g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f472229h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f472230i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f472231m;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            return j17 + b36.f.e(8, this.f472232n);
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
        r45.y1 y1Var = (r45.y1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y1Var.f472225d = aVar2.k(intValue);
                return 0;
            case 2:
                y1Var.f472226e = aVar2.k(intValue);
                return 0;
            case 3:
                y1Var.f472227f = aVar2.k(intValue);
                return 0;
            case 4:
                y1Var.f472228g = aVar2.k(intValue);
                return 0;
            case 5:
                y1Var.f472229h = aVar2.k(intValue);
                return 0;
            case 6:
                y1Var.f472230i = aVar2.k(intValue);
                return 0;
            case 7:
                y1Var.f472231m = aVar2.k(intValue);
                return 0;
            case 8:
                y1Var.f472232n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
