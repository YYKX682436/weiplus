package m53;

/* loaded from: classes8.dex */
public class g1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405225d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405226e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405227f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f405228g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f405229h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f405230i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f405231m;

    /* renamed from: n, reason: collision with root package name */
    public int f405232n;

    /* renamed from: o, reason: collision with root package name */
    public int f405233o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f405234p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.g1)) {
            return false;
        }
        m53.g1 g1Var = (m53.g1) fVar;
        return n51.f.a(this.f405225d, g1Var.f405225d) && n51.f.a(this.f405226e, g1Var.f405226e) && n51.f.a(this.f405227f, g1Var.f405227f) && n51.f.a(java.lang.Boolean.valueOf(this.f405228g), java.lang.Boolean.valueOf(g1Var.f405228g)) && n51.f.a(java.lang.Boolean.valueOf(this.f405229h), java.lang.Boolean.valueOf(g1Var.f405229h)) && n51.f.a(this.f405230i, g1Var.f405230i) && n51.f.a(this.f405231m, g1Var.f405231m) && n51.f.a(java.lang.Integer.valueOf(this.f405232n), java.lang.Integer.valueOf(g1Var.f405232n)) && n51.f.a(java.lang.Integer.valueOf(this.f405233o), java.lang.Integer.valueOf(g1Var.f405233o)) && n51.f.a(this.f405234p, g1Var.f405234p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405225d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405226e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405227f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f405228g);
            fVar.a(5, this.f405229h);
            java.lang.String str4 = this.f405230i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f405231m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f405232n);
            fVar.e(9, this.f405233o);
            java.lang.String str6 = this.f405234p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f405225d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f405226e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f405227f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            int a17 = j17 + b36.f.a(4, this.f405228g) + b36.f.a(5, this.f405229h);
            java.lang.String str10 = this.f405230i;
            if (str10 != null) {
                a17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f405231m;
            if (str11 != null) {
                a17 += b36.f.j(7, str11);
            }
            int e17 = a17 + b36.f.e(8, this.f405232n) + b36.f.e(9, this.f405233o);
            java.lang.String str12 = this.f405234p;
            return str12 != null ? e17 + b36.f.j(10, str12) : e17;
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
        m53.g1 g1Var = (m53.g1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g1Var.f405225d = aVar2.k(intValue);
                return 0;
            case 2:
                g1Var.f405226e = aVar2.k(intValue);
                return 0;
            case 3:
                g1Var.f405227f = aVar2.k(intValue);
                return 0;
            case 4:
                g1Var.f405228g = aVar2.c(intValue);
                return 0;
            case 5:
                g1Var.f405229h = aVar2.c(intValue);
                return 0;
            case 6:
                g1Var.f405230i = aVar2.k(intValue);
                return 0;
            case 7:
                g1Var.f405231m = aVar2.k(intValue);
                return 0;
            case 8:
                g1Var.f405232n = aVar2.g(intValue);
                return 0;
            case 9:
                g1Var.f405233o = aVar2.g(intValue);
                return 0;
            case 10:
                g1Var.f405234p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
