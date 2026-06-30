package r45;

/* loaded from: classes8.dex */
public class l97 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460792d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460793e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460794f;

    /* renamed from: g, reason: collision with root package name */
    public int f460795g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460796h;

    /* renamed from: i, reason: collision with root package name */
    public int f460797i;

    /* renamed from: m, reason: collision with root package name */
    public int f460798m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l97)) {
            return false;
        }
        r45.l97 l97Var = (r45.l97) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460792d), java.lang.Integer.valueOf(l97Var.f460792d)) && n51.f.a(this.f460793e, l97Var.f460793e) && n51.f.a(this.f460794f, l97Var.f460794f) && n51.f.a(java.lang.Integer.valueOf(this.f460795g), java.lang.Integer.valueOf(l97Var.f460795g)) && n51.f.a(this.f460796h, l97Var.f460796h) && n51.f.a(java.lang.Integer.valueOf(this.f460797i), java.lang.Integer.valueOf(l97Var.f460797i)) && n51.f.a(java.lang.Integer.valueOf(this.f460798m), java.lang.Integer.valueOf(l97Var.f460798m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460792d);
            java.lang.String str = this.f460793e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f460794f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f460795g);
            java.lang.String str3 = this.f460796h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f460797i);
            fVar.e(7, this.f460798m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460792d) + 0;
            java.lang.String str4 = this.f460793e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f460794f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f460795g);
            java.lang.String str6 = this.f460796h;
            if (str6 != null) {
                e18 += b36.f.j(5, str6);
            }
            return e18 + b36.f.e(6, this.f460797i) + b36.f.e(7, this.f460798m);
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
        r45.l97 l97Var = (r45.l97) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l97Var.f460792d = aVar2.g(intValue);
                return 0;
            case 2:
                l97Var.f460793e = aVar2.k(intValue);
                return 0;
            case 3:
                l97Var.f460794f = aVar2.k(intValue);
                return 0;
            case 4:
                l97Var.f460795g = aVar2.g(intValue);
                return 0;
            case 5:
                l97Var.f460796h = aVar2.k(intValue);
                return 0;
            case 6:
                l97Var.f460797i = aVar2.g(intValue);
                return 0;
            case 7:
                l97Var.f460798m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
