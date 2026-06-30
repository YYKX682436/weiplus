package r45;

/* loaded from: classes4.dex */
public class rw3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466768d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466769e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466770f;

    /* renamed from: g, reason: collision with root package name */
    public int f466771g;

    /* renamed from: h, reason: collision with root package name */
    public int f466772h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466773i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f466774m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f466775n;

    /* renamed from: o, reason: collision with root package name */
    public int f466776o;

    /* renamed from: p, reason: collision with root package name */
    public int f466777p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rw3)) {
            return false;
        }
        r45.rw3 rw3Var = (r45.rw3) fVar;
        return n51.f.a(this.f466768d, rw3Var.f466768d) && n51.f.a(this.f466769e, rw3Var.f466769e) && n51.f.a(this.f466770f, rw3Var.f466770f) && n51.f.a(java.lang.Integer.valueOf(this.f466771g), java.lang.Integer.valueOf(rw3Var.f466771g)) && n51.f.a(java.lang.Integer.valueOf(this.f466772h), java.lang.Integer.valueOf(rw3Var.f466772h)) && n51.f.a(this.f466773i, rw3Var.f466773i) && n51.f.a(this.f466774m, rw3Var.f466774m) && n51.f.a(this.f466775n, rw3Var.f466775n) && n51.f.a(java.lang.Integer.valueOf(this.f466776o), java.lang.Integer.valueOf(rw3Var.f466776o)) && n51.f.a(java.lang.Integer.valueOf(this.f466777p), java.lang.Integer.valueOf(rw3Var.f466777p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466768d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466769e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f466770f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f466771g);
            fVar.e(5, this.f466772h);
            java.lang.String str4 = this.f466773i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f466774m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f466775n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f466776o);
            fVar.e(10, this.f466777p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f466768d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f466769e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f466770f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            int e17 = j17 + b36.f.e(4, this.f466771g) + b36.f.e(5, this.f466772h);
            java.lang.String str10 = this.f466773i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f466774m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f466775n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            return e17 + b36.f.e(9, this.f466776o) + b36.f.e(10, this.f466777p);
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
        r45.rw3 rw3Var = (r45.rw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rw3Var.f466768d = aVar2.k(intValue);
                return 0;
            case 2:
                rw3Var.f466769e = aVar2.k(intValue);
                return 0;
            case 3:
                rw3Var.f466770f = aVar2.k(intValue);
                return 0;
            case 4:
                rw3Var.f466771g = aVar2.g(intValue);
                return 0;
            case 5:
                rw3Var.f466772h = aVar2.g(intValue);
                return 0;
            case 6:
                rw3Var.f466773i = aVar2.k(intValue);
                return 0;
            case 7:
                rw3Var.f466774m = aVar2.k(intValue);
                return 0;
            case 8:
                rw3Var.f466775n = aVar2.k(intValue);
                return 0;
            case 9:
                rw3Var.f466776o = aVar2.g(intValue);
                return 0;
            case 10:
                rw3Var.f466777p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
