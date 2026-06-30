package r45;

/* loaded from: classes8.dex */
public class re6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f466307d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466308e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466309f;

    /* renamed from: g, reason: collision with root package name */
    public int f466310g;

    /* renamed from: h, reason: collision with root package name */
    public int f466311h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466312i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f466313m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.re6)) {
            return false;
        }
        r45.re6 re6Var = (r45.re6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f466307d), java.lang.Integer.valueOf(re6Var.f466307d)) && n51.f.a(this.f466308e, re6Var.f466308e) && n51.f.a(this.f466309f, re6Var.f466309f) && n51.f.a(java.lang.Integer.valueOf(this.f466310g), java.lang.Integer.valueOf(re6Var.f466310g)) && n51.f.a(java.lang.Integer.valueOf(this.f466311h), java.lang.Integer.valueOf(re6Var.f466311h)) && n51.f.a(this.f466312i, re6Var.f466312i) && n51.f.a(this.f466313m, re6Var.f466313m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f466307d);
            java.lang.String str = this.f466308e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f466309f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f466310g);
            fVar.e(5, this.f466311h);
            java.lang.String str3 = this.f466312i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f466313m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f466307d) + 0;
            java.lang.String str5 = this.f466308e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f466309f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            int e18 = e17 + b36.f.e(4, this.f466310g) + b36.f.e(5, this.f466311h);
            java.lang.String str7 = this.f466312i;
            if (str7 != null) {
                e18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f466313m;
            return str8 != null ? e18 + b36.f.j(7, str8) : e18;
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
        r45.re6 re6Var = (r45.re6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                re6Var.f466307d = aVar2.g(intValue);
                return 0;
            case 2:
                re6Var.f466308e = aVar2.k(intValue);
                return 0;
            case 3:
                re6Var.f466309f = aVar2.k(intValue);
                return 0;
            case 4:
                re6Var.f466310g = aVar2.g(intValue);
                return 0;
            case 5:
                re6Var.f466311h = aVar2.g(intValue);
                return 0;
            case 6:
                re6Var.f466312i = aVar2.k(intValue);
                return 0;
            case 7:
                re6Var.f466313m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
