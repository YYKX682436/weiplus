package r45;

/* loaded from: classes8.dex */
public class ma5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461839d;

    /* renamed from: e, reason: collision with root package name */
    public int f461840e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461841f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461842g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461843h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ma5)) {
            return false;
        }
        r45.ma5 ma5Var = (r45.ma5) fVar;
        return n51.f.a(this.f461839d, ma5Var.f461839d) && n51.f.a(java.lang.Integer.valueOf(this.f461840e), java.lang.Integer.valueOf(ma5Var.f461840e)) && n51.f.a(this.f461841f, ma5Var.f461841f) && n51.f.a(this.f461842g, ma5Var.f461842g) && n51.f.a(this.f461843h, ma5Var.f461843h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461839d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f461840e);
            java.lang.String str2 = this.f461841f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f461842g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f461843h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f461839d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f461840e);
            java.lang.String str6 = this.f461841f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f461842g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f461843h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        r45.ma5 ma5Var = (r45.ma5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ma5Var.f461839d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ma5Var.f461840e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ma5Var.f461841f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ma5Var.f461842g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ma5Var.f461843h = aVar2.k(intValue);
        return 0;
    }
}
