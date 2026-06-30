package r45;

/* loaded from: classes4.dex */
public class tf6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467912d;

    /* renamed from: e, reason: collision with root package name */
    public int f467913e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467914f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467915g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467916h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f467917i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f467918m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f467919n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tf6)) {
            return false;
        }
        r45.tf6 tf6Var = (r45.tf6) fVar;
        return n51.f.a(this.f467912d, tf6Var.f467912d) && n51.f.a(java.lang.Integer.valueOf(this.f467913e), java.lang.Integer.valueOf(tf6Var.f467913e)) && n51.f.a(this.f467914f, tf6Var.f467914f) && n51.f.a(this.f467915g, tf6Var.f467915g) && n51.f.a(this.f467916h, tf6Var.f467916h) && n51.f.a(this.f467917i, tf6Var.f467917i) && n51.f.a(this.f467918m, tf6Var.f467918m) && n51.f.a(this.f467919n, tf6Var.f467919n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467912d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f467913e);
            java.lang.String str2 = this.f467914f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f467915g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f467916h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f467917i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f467918m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f467919n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f467912d;
            int j17 = (str8 != null ? 0 + b36.f.j(1, str8) : 0) + b36.f.e(2, this.f467913e);
            java.lang.String str9 = this.f467914f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f467915g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f467916h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f467917i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f467918m;
            if (str13 != null) {
                j17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f467919n;
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
        r45.tf6 tf6Var = (r45.tf6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tf6Var.f467912d = aVar2.k(intValue);
                return 0;
            case 2:
                tf6Var.f467913e = aVar2.g(intValue);
                return 0;
            case 3:
                tf6Var.f467914f = aVar2.k(intValue);
                return 0;
            case 4:
                tf6Var.f467915g = aVar2.k(intValue);
                return 0;
            case 5:
                tf6Var.f467916h = aVar2.k(intValue);
                return 0;
            case 6:
                tf6Var.f467917i = aVar2.k(intValue);
                return 0;
            case 7:
                tf6Var.f467918m = aVar2.k(intValue);
                return 0;
            case 8:
                tf6Var.f467919n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
