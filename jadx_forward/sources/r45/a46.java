package r45;

/* loaded from: classes14.dex */
public class a46 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451251d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451252e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451253f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451254g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451255h;

    /* renamed from: i, reason: collision with root package name */
    public int f451256i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451257m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a46)) {
            return false;
        }
        r45.a46 a46Var = (r45.a46) fVar;
        return n51.f.a(this.f451251d, a46Var.f451251d) && n51.f.a(this.f451252e, a46Var.f451252e) && n51.f.a(this.f451253f, a46Var.f451253f) && n51.f.a(this.f451254g, a46Var.f451254g) && n51.f.a(this.f451255h, a46Var.f451255h) && n51.f.a(java.lang.Integer.valueOf(this.f451256i), java.lang.Integer.valueOf(a46Var.f451256i)) && n51.f.a(this.f451257m, a46Var.f451257m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451251d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f451252e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f451253f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f451254g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f451255h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f451256i);
            java.lang.String str6 = this.f451257m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f451251d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f451252e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f451253f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f451254g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f451255h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int e17 = j17 + b36.f.e(6, this.f451256i);
            java.lang.String str12 = this.f451257m;
            return str12 != null ? e17 + b36.f.j(7, str12) : e17;
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
        r45.a46 a46Var = (r45.a46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a46Var.f451251d = aVar2.k(intValue);
                return 0;
            case 2:
                a46Var.f451252e = aVar2.k(intValue);
                return 0;
            case 3:
                a46Var.f451253f = aVar2.k(intValue);
                return 0;
            case 4:
                a46Var.f451254g = aVar2.k(intValue);
                return 0;
            case 5:
                a46Var.f451255h = aVar2.k(intValue);
                return 0;
            case 6:
                a46Var.f451256i = aVar2.g(intValue);
                return 0;
            case 7:
                a46Var.f451257m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
