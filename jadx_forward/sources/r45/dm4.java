package r45;

/* loaded from: classes10.dex */
public class dm4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454102d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454103e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454104f;

    /* renamed from: g, reason: collision with root package name */
    public int f454105g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454106h;

    /* renamed from: i, reason: collision with root package name */
    public int f454107i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454108m;

    /* renamed from: n, reason: collision with root package name */
    public int f454109n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dm4)) {
            return false;
        }
        r45.dm4 dm4Var = (r45.dm4) fVar;
        return n51.f.a(this.f454102d, dm4Var.f454102d) && n51.f.a(this.f454103e, dm4Var.f454103e) && n51.f.a(this.f454104f, dm4Var.f454104f) && n51.f.a(java.lang.Integer.valueOf(this.f454105g), java.lang.Integer.valueOf(dm4Var.f454105g)) && n51.f.a(this.f454106h, dm4Var.f454106h) && n51.f.a(java.lang.Integer.valueOf(this.f454107i), java.lang.Integer.valueOf(dm4Var.f454107i)) && n51.f.a(this.f454108m, dm4Var.f454108m) && n51.f.a(java.lang.Integer.valueOf(this.f454109n), java.lang.Integer.valueOf(dm4Var.f454109n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454102d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454103e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f454104f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f454105g);
            java.lang.String str4 = this.f454106h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f454107i);
            java.lang.String str5 = this.f454108m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f454109n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f454102d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f454103e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f454104f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f454105g);
            java.lang.String str9 = this.f454106h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            int e18 = e17 + b36.f.e(6, this.f454107i);
            java.lang.String str10 = this.f454108m;
            if (str10 != null) {
                e18 += b36.f.j(7, str10);
            }
            return e18 + b36.f.e(8, this.f454109n);
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
        r45.dm4 dm4Var = (r45.dm4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dm4Var.f454102d = aVar2.k(intValue);
                return 0;
            case 2:
                dm4Var.f454103e = aVar2.k(intValue);
                return 0;
            case 3:
                dm4Var.f454104f = aVar2.k(intValue);
                return 0;
            case 4:
                dm4Var.f454105g = aVar2.g(intValue);
                return 0;
            case 5:
                dm4Var.f454106h = aVar2.k(intValue);
                return 0;
            case 6:
                dm4Var.f454107i = aVar2.g(intValue);
                return 0;
            case 7:
                dm4Var.f454108m = aVar2.k(intValue);
                return 0;
            case 8:
                dm4Var.f454109n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
