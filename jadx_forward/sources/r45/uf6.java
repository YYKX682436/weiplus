package r45;

/* loaded from: classes4.dex */
public class uf6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468866d;

    /* renamed from: e, reason: collision with root package name */
    public int f468867e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468868f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468869g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468870h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468871i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468872m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f468873n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uf6)) {
            return false;
        }
        r45.uf6 uf6Var = (r45.uf6) fVar;
        return n51.f.a(this.f468866d, uf6Var.f468866d) && n51.f.a(java.lang.Integer.valueOf(this.f468867e), java.lang.Integer.valueOf(uf6Var.f468867e)) && n51.f.a(this.f468868f, uf6Var.f468868f) && n51.f.a(this.f468869g, uf6Var.f468869g) && n51.f.a(this.f468870h, uf6Var.f468870h) && n51.f.a(this.f468871i, uf6Var.f468871i) && n51.f.a(this.f468872m, uf6Var.f468872m) && n51.f.a(this.f468873n, uf6Var.f468873n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468866d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f468867e);
            java.lang.String str2 = this.f468868f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f468869g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f468870h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f468871i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f468872m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f468873n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f468866d;
            int j17 = (str8 != null ? 0 + b36.f.j(1, str8) : 0) + b36.f.e(2, this.f468867e);
            java.lang.String str9 = this.f468868f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f468869g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f468870h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f468871i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f468872m;
            if (str13 != null) {
                j17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f468873n;
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
        r45.uf6 uf6Var = (r45.uf6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uf6Var.f468866d = aVar2.k(intValue);
                return 0;
            case 2:
                uf6Var.f468867e = aVar2.g(intValue);
                return 0;
            case 3:
                uf6Var.f468868f = aVar2.k(intValue);
                return 0;
            case 4:
                uf6Var.f468869g = aVar2.k(intValue);
                return 0;
            case 5:
                uf6Var.f468870h = aVar2.k(intValue);
                return 0;
            case 6:
                uf6Var.f468871i = aVar2.k(intValue);
                return 0;
            case 7:
                uf6Var.f468872m = aVar2.k(intValue);
                return 0;
            case 8:
                uf6Var.f468873n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
