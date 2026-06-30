package r45;

/* loaded from: classes15.dex */
public class uf4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468855d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468856e;

    /* renamed from: f, reason: collision with root package name */
    public int f468857f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468858g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468859h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468860i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468861m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f468862n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f468863o;

    /* renamed from: p, reason: collision with root package name */
    public int f468864p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f468865q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uf4)) {
            return false;
        }
        r45.uf4 uf4Var = (r45.uf4) fVar;
        return n51.f.a(this.f468855d, uf4Var.f468855d) && n51.f.a(this.f468856e, uf4Var.f468856e) && n51.f.a(java.lang.Integer.valueOf(this.f468857f), java.lang.Integer.valueOf(uf4Var.f468857f)) && n51.f.a(this.f468858g, uf4Var.f468858g) && n51.f.a(this.f468859h, uf4Var.f468859h) && n51.f.a(this.f468860i, uf4Var.f468860i) && n51.f.a(this.f468861m, uf4Var.f468861m) && n51.f.a(this.f468862n, uf4Var.f468862n) && n51.f.a(this.f468863o, uf4Var.f468863o) && n51.f.a(java.lang.Integer.valueOf(this.f468864p), java.lang.Integer.valueOf(uf4Var.f468864p)) && n51.f.a(this.f468865q, uf4Var.f468865q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468855d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f468856e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f468857f);
            java.lang.String str3 = this.f468858g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f468859h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f468860i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f468861m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f468862n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f468863o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            fVar.e(10, this.f468864p);
            java.lang.String str9 = this.f468865q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f468855d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f468856e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            int e17 = j17 + b36.f.e(3, this.f468857f);
            java.lang.String str12 = this.f468858g;
            if (str12 != null) {
                e17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f468859h;
            if (str13 != null) {
                e17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f468860i;
            if (str14 != null) {
                e17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f468861m;
            if (str15 != null) {
                e17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f468862n;
            if (str16 != null) {
                e17 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f468863o;
            if (str17 != null) {
                e17 += b36.f.j(9, str17);
            }
            int e18 = e17 + b36.f.e(10, this.f468864p);
            java.lang.String str18 = this.f468865q;
            return str18 != null ? e18 + b36.f.j(11, str18) : e18;
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
        r45.uf4 uf4Var = (r45.uf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uf4Var.f468855d = aVar2.k(intValue);
                return 0;
            case 2:
                uf4Var.f468856e = aVar2.k(intValue);
                return 0;
            case 3:
                uf4Var.f468857f = aVar2.g(intValue);
                return 0;
            case 4:
                uf4Var.f468858g = aVar2.k(intValue);
                return 0;
            case 5:
                uf4Var.f468859h = aVar2.k(intValue);
                return 0;
            case 6:
                uf4Var.f468860i = aVar2.k(intValue);
                return 0;
            case 7:
                uf4Var.f468861m = aVar2.k(intValue);
                return 0;
            case 8:
                uf4Var.f468862n = aVar2.k(intValue);
                return 0;
            case 9:
                uf4Var.f468863o = aVar2.k(intValue);
                return 0;
            case 10:
                uf4Var.f468864p = aVar2.g(intValue);
                return 0;
            case 11:
                uf4Var.f468865q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
