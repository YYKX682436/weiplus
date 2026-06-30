package r45;

/* loaded from: classes9.dex */
public class xz6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472166d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472167e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472168f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472169g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472170h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472171i;

    /* renamed from: m, reason: collision with root package name */
    public int f472172m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xz6)) {
            return false;
        }
        r45.xz6 xz6Var = (r45.xz6) fVar;
        return n51.f.a(this.f472166d, xz6Var.f472166d) && n51.f.a(this.f472167e, xz6Var.f472167e) && n51.f.a(this.f472168f, xz6Var.f472168f) && n51.f.a(this.f472169g, xz6Var.f472169g) && n51.f.a(this.f472170h, xz6Var.f472170h) && n51.f.a(this.f472171i, xz6Var.f472171i) && n51.f.a(java.lang.Integer.valueOf(this.f472172m), java.lang.Integer.valueOf(xz6Var.f472172m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472166d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472167e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f472168f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f472169g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f472170h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f472171i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f472172m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f472166d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f472167e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f472168f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f472169g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f472170h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f472171i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            return j17 + b36.f.e(7, this.f472172m);
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
        r45.xz6 xz6Var = (r45.xz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xz6Var.f472166d = aVar2.k(intValue);
                return 0;
            case 2:
                xz6Var.f472167e = aVar2.k(intValue);
                return 0;
            case 3:
                xz6Var.f472168f = aVar2.k(intValue);
                return 0;
            case 4:
                xz6Var.f472169g = aVar2.k(intValue);
                return 0;
            case 5:
                xz6Var.f472170h = aVar2.k(intValue);
                return 0;
            case 6:
                xz6Var.f472171i = aVar2.k(intValue);
                return 0;
            case 7:
                xz6Var.f472172m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
