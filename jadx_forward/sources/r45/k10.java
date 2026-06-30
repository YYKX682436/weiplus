package r45;

/* loaded from: classes4.dex */
public class k10 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459816d;

    /* renamed from: e, reason: collision with root package name */
    public int f459817e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459818f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459819g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459820h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459821i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459822m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f459823n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f459824o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k10)) {
            return false;
        }
        r45.k10 k10Var = (r45.k10) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459816d), java.lang.Integer.valueOf(k10Var.f459816d)) && n51.f.a(java.lang.Integer.valueOf(this.f459817e), java.lang.Integer.valueOf(k10Var.f459817e)) && n51.f.a(this.f459818f, k10Var.f459818f) && n51.f.a(this.f459819g, k10Var.f459819g) && n51.f.a(this.f459820h, k10Var.f459820h) && n51.f.a(this.f459821i, k10Var.f459821i) && n51.f.a(this.f459822m, k10Var.f459822m) && n51.f.a(this.f459823n, k10Var.f459823n) && n51.f.a(this.f459824o, k10Var.f459824o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459816d);
            fVar.e(2, this.f459817e);
            java.lang.String str = this.f459818f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f459819g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f459820h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f459821i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f459822m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f459823n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f459824o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f459816d) + 0 + b36.f.e(2, this.f459817e);
            java.lang.String str8 = this.f459818f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f459819g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f459820h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f459821i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f459822m;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f459823n;
            if (str13 != null) {
                e17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f459824o;
            return str14 != null ? e17 + b36.f.j(9, str14) : e17;
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
        r45.k10 k10Var = (r45.k10) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k10Var.f459816d = aVar2.g(intValue);
                return 0;
            case 2:
                k10Var.f459817e = aVar2.g(intValue);
                return 0;
            case 3:
                k10Var.f459818f = aVar2.k(intValue);
                return 0;
            case 4:
                k10Var.f459819g = aVar2.k(intValue);
                return 0;
            case 5:
                k10Var.f459820h = aVar2.k(intValue);
                return 0;
            case 6:
                k10Var.f459821i = aVar2.k(intValue);
                return 0;
            case 7:
                k10Var.f459822m = aVar2.k(intValue);
                return 0;
            case 8:
                k10Var.f459823n = aVar2.k(intValue);
                return 0;
            case 9:
                k10Var.f459824o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
