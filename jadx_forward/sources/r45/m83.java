package r45;

/* loaded from: classes7.dex */
public class m83 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461763d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461764e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461765f;

    /* renamed from: g, reason: collision with root package name */
    public int f461766g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f461767h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461768i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461769m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f461770n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m83)) {
            return false;
        }
        r45.m83 m83Var = (r45.m83) fVar;
        return n51.f.a(this.f461763d, m83Var.f461763d) && n51.f.a(this.f461764e, m83Var.f461764e) && n51.f.a(this.f461765f, m83Var.f461765f) && n51.f.a(java.lang.Integer.valueOf(this.f461766g), java.lang.Integer.valueOf(m83Var.f461766g)) && n51.f.a(this.f461767h, m83Var.f461767h) && n51.f.a(this.f461768i, m83Var.f461768i) && n51.f.a(this.f461769m, m83Var.f461769m) && n51.f.a(this.f461770n, m83Var.f461770n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461763d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f461764e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f461765f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f461766g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f461767h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            java.lang.String str4 = this.f461768i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f461769m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f461770n;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f461763d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f461764e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f461765f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f461766g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f461767h;
            if (gVar3 != null) {
                e17 += b36.f.b(5, gVar3);
            }
            java.lang.String str9 = this.f461768i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f461769m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f461770n;
            return gVar4 != null ? e17 + b36.f.b(9, gVar4) : e17;
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
        r45.m83 m83Var = (r45.m83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m83Var.f461763d = aVar2.k(intValue);
                return 0;
            case 2:
                m83Var.f461764e = aVar2.k(intValue);
                return 0;
            case 3:
                m83Var.f461765f = aVar2.k(intValue);
                return 0;
            case 4:
                m83Var.f461766g = aVar2.g(intValue);
                return 0;
            case 5:
                m83Var.f461767h = aVar2.d(intValue);
                return 0;
            case 6:
                m83Var.f461768i = aVar2.k(intValue);
                return 0;
            case 7:
                m83Var.f461769m = aVar2.k(intValue);
                return 0;
            case 8:
            default:
                return -1;
            case 9:
                m83Var.f461770n = aVar2.d(intValue);
                return 0;
        }
    }
}
