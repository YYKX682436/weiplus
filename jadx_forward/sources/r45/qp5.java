package r45;

/* loaded from: classes7.dex */
public class qp5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465716d;

    /* renamed from: e, reason: collision with root package name */
    public int f465717e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465718f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465719g;

    /* renamed from: h, reason: collision with root package name */
    public int f465720h;

    /* renamed from: i, reason: collision with root package name */
    public int f465721i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465722m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465723n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f465724o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qp5)) {
            return false;
        }
        r45.qp5 qp5Var = (r45.qp5) fVar;
        return n51.f.a(this.f465716d, qp5Var.f465716d) && n51.f.a(java.lang.Integer.valueOf(this.f465717e), java.lang.Integer.valueOf(qp5Var.f465717e)) && n51.f.a(this.f465718f, qp5Var.f465718f) && n51.f.a(this.f465719g, qp5Var.f465719g) && n51.f.a(java.lang.Integer.valueOf(this.f465720h), java.lang.Integer.valueOf(qp5Var.f465720h)) && n51.f.a(java.lang.Integer.valueOf(this.f465721i), java.lang.Integer.valueOf(qp5Var.f465721i)) && n51.f.a(this.f465722m, qp5Var.f465722m) && n51.f.a(this.f465723n, qp5Var.f465723n) && n51.f.a(this.f465724o, qp5Var.f465724o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465716d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f465717e);
            java.lang.String str2 = this.f465718f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f465719g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f465720h);
            fVar.e(6, this.f465721i);
            java.lang.String str4 = this.f465722m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f465723n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f465724o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f465716d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f465717e);
            java.lang.String str8 = this.f465718f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f465719g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f465720h) + b36.f.e(6, this.f465721i);
            java.lang.String str10 = this.f465722m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f465723n;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f465724o;
            return str12 != null ? e17 + b36.f.j(9, str12) : e17;
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
        r45.qp5 qp5Var = (r45.qp5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qp5Var.f465716d = aVar2.k(intValue);
                return 0;
            case 2:
                qp5Var.f465717e = aVar2.g(intValue);
                return 0;
            case 3:
                qp5Var.f465718f = aVar2.k(intValue);
                return 0;
            case 4:
                qp5Var.f465719g = aVar2.k(intValue);
                return 0;
            case 5:
                qp5Var.f465720h = aVar2.g(intValue);
                return 0;
            case 6:
                qp5Var.f465721i = aVar2.g(intValue);
                return 0;
            case 7:
                qp5Var.f465722m = aVar2.k(intValue);
                return 0;
            case 8:
                qp5Var.f465723n = aVar2.k(intValue);
                return 0;
            case 9:
                qp5Var.f465724o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
