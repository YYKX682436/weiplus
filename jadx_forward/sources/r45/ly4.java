package r45;

/* loaded from: classes4.dex */
public class ly4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461506d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461507e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461508f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461509g;

    /* renamed from: h, reason: collision with root package name */
    public int f461510h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f461511i;

    /* renamed from: m, reason: collision with root package name */
    public int f461512m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ly4)) {
            return false;
        }
        r45.ly4 ly4Var = (r45.ly4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461506d), java.lang.Integer.valueOf(ly4Var.f461506d)) && n51.f.a(this.f461507e, ly4Var.f461507e) && n51.f.a(this.f461508f, ly4Var.f461508f) && n51.f.a(this.f461509g, ly4Var.f461509g) && n51.f.a(java.lang.Integer.valueOf(this.f461510h), java.lang.Integer.valueOf(ly4Var.f461510h)) && n51.f.a(java.lang.Boolean.valueOf(this.f461511i), java.lang.Boolean.valueOf(ly4Var.f461511i)) && n51.f.a(java.lang.Integer.valueOf(this.f461512m), java.lang.Integer.valueOf(ly4Var.f461512m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461506d);
            java.lang.String str = this.f461507e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f461508f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f461509g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f461510h);
            fVar.a(6, this.f461511i);
            fVar.e(7, this.f461512m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461506d) + 0;
            java.lang.String str4 = this.f461507e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f461508f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f461509g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            return e17 + b36.f.e(5, this.f461510h) + b36.f.a(6, this.f461511i) + b36.f.e(7, this.f461512m);
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
        r45.ly4 ly4Var = (r45.ly4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ly4Var.f461506d = aVar2.g(intValue);
                return 0;
            case 2:
                ly4Var.f461507e = aVar2.k(intValue);
                return 0;
            case 3:
                ly4Var.f461508f = aVar2.k(intValue);
                return 0;
            case 4:
                ly4Var.f461509g = aVar2.k(intValue);
                return 0;
            case 5:
                ly4Var.f461510h = aVar2.g(intValue);
                return 0;
            case 6:
                ly4Var.f461511i = aVar2.c(intValue);
                return 0;
            case 7:
                ly4Var.f461512m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
