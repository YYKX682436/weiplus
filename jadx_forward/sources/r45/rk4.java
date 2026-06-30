package r45;

/* loaded from: classes8.dex */
public class rk4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f466497d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466498e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466499f;

    /* renamed from: g, reason: collision with root package name */
    public int f466500g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f466501h;

    /* renamed from: i, reason: collision with root package name */
    public int f466502i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rk4)) {
            return false;
        }
        r45.rk4 rk4Var = (r45.rk4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f466497d), java.lang.Integer.valueOf(rk4Var.f466497d)) && n51.f.a(this.f466498e, rk4Var.f466498e) && n51.f.a(this.f466499f, rk4Var.f466499f) && n51.f.a(java.lang.Integer.valueOf(this.f466500g), java.lang.Integer.valueOf(rk4Var.f466500g)) && n51.f.a(this.f466501h, rk4Var.f466501h) && n51.f.a(java.lang.Integer.valueOf(this.f466502i), java.lang.Integer.valueOf(rk4Var.f466502i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f466497d);
            java.lang.String str = this.f466498e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f466499f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f466500g);
            java.lang.String str3 = this.f466501h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f466502i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f466497d) + 0;
            java.lang.String str4 = this.f466498e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f466499f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f466500g);
            java.lang.String str6 = this.f466501h;
            if (str6 != null) {
                e18 += b36.f.j(5, str6);
            }
            return e18 + b36.f.e(6, this.f466502i);
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
        r45.rk4 rk4Var = (r45.rk4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rk4Var.f466497d = aVar2.g(intValue);
                return 0;
            case 2:
                rk4Var.f466498e = aVar2.k(intValue);
                return 0;
            case 3:
                rk4Var.f466499f = aVar2.k(intValue);
                return 0;
            case 4:
                rk4Var.f466500g = aVar2.g(intValue);
                return 0;
            case 5:
                rk4Var.f466501h = aVar2.k(intValue);
                return 0;
            case 6:
                rk4Var.f466502i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
