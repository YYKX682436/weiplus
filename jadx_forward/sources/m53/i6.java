package m53;

/* loaded from: classes8.dex */
public class i6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405331d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405332e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405333f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405334g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f405335h;

    /* renamed from: i, reason: collision with root package name */
    public int f405336i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f405337m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f405338n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.i6)) {
            return false;
        }
        m53.i6 i6Var = (m53.i6) fVar;
        return n51.f.a(this.f405331d, i6Var.f405331d) && n51.f.a(this.f405332e, i6Var.f405332e) && n51.f.a(this.f405333f, i6Var.f405333f) && n51.f.a(this.f405334g, i6Var.f405334g) && n51.f.a(this.f405335h, i6Var.f405335h) && n51.f.a(java.lang.Integer.valueOf(this.f405336i), java.lang.Integer.valueOf(i6Var.f405336i)) && n51.f.a(this.f405337m, i6Var.f405337m) && n51.f.a(this.f405338n, i6Var.f405338n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405331d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405332e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405333f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f405334g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f405335h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f405336i);
            java.lang.String str6 = this.f405337m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f405338n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f405331d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f405332e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f405333f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f405334g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f405335h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            int e17 = j17 + b36.f.e(6, this.f405336i);
            java.lang.String str13 = this.f405337m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f405338n;
            return str14 != null ? e17 + b36.f.j(8, str14) : e17;
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
        m53.i6 i6Var = (m53.i6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i6Var.f405331d = aVar2.k(intValue);
                return 0;
            case 2:
                i6Var.f405332e = aVar2.k(intValue);
                return 0;
            case 3:
                i6Var.f405333f = aVar2.k(intValue);
                return 0;
            case 4:
                i6Var.f405334g = aVar2.k(intValue);
                return 0;
            case 5:
                i6Var.f405335h = aVar2.k(intValue);
                return 0;
            case 6:
                i6Var.f405336i = aVar2.g(intValue);
                return 0;
            case 7:
                i6Var.f405337m = aVar2.k(intValue);
                return 0;
            case 8:
                i6Var.f405338n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
