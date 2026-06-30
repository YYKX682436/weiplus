package r45;

/* loaded from: classes9.dex */
public class k46 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459899d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459900e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459901f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459902g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459903h;

    /* renamed from: i, reason: collision with root package name */
    public int f459904i;

    /* renamed from: m, reason: collision with root package name */
    public int f459905m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f459906n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k46)) {
            return false;
        }
        r45.k46 k46Var = (r45.k46) fVar;
        return n51.f.a(this.f459899d, k46Var.f459899d) && n51.f.a(this.f459900e, k46Var.f459900e) && n51.f.a(this.f459901f, k46Var.f459901f) && n51.f.a(this.f459902g, k46Var.f459902g) && n51.f.a(this.f459903h, k46Var.f459903h) && n51.f.a(java.lang.Integer.valueOf(this.f459904i), java.lang.Integer.valueOf(k46Var.f459904i)) && n51.f.a(java.lang.Integer.valueOf(this.f459905m), java.lang.Integer.valueOf(k46Var.f459905m)) && n51.f.a(this.f459906n, k46Var.f459906n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459899d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f459900e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f459901f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f459902g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f459903h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f459904i);
            fVar.e(7, this.f459905m);
            java.lang.String str6 = this.f459906n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f459899d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f459900e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f459901f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f459902g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f459903h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int e17 = j17 + b36.f.e(6, this.f459904i) + b36.f.e(7, this.f459905m);
            java.lang.String str12 = this.f459906n;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        r45.k46 k46Var = (r45.k46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k46Var.f459899d = aVar2.k(intValue);
                return 0;
            case 2:
                k46Var.f459900e = aVar2.k(intValue);
                return 0;
            case 3:
                k46Var.f459901f = aVar2.k(intValue);
                return 0;
            case 4:
                k46Var.f459902g = aVar2.k(intValue);
                return 0;
            case 5:
                k46Var.f459903h = aVar2.k(intValue);
                return 0;
            case 6:
                k46Var.f459904i = aVar2.g(intValue);
                return 0;
            case 7:
                k46Var.f459905m = aVar2.g(intValue);
                return 0;
            case 8:
                k46Var.f459906n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
