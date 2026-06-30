package r45;

/* loaded from: classes8.dex */
public class aq3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451731d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451732e;

    /* renamed from: f, reason: collision with root package name */
    public int f451733f;

    /* renamed from: g, reason: collision with root package name */
    public int f451734g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451735h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451736i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451737m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f451738n;

    /* renamed from: o, reason: collision with root package name */
    public int f451739o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aq3)) {
            return false;
        }
        r45.aq3 aq3Var = (r45.aq3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451731d), java.lang.Integer.valueOf(aq3Var.f451731d)) && n51.f.a(this.f451732e, aq3Var.f451732e) && n51.f.a(java.lang.Integer.valueOf(this.f451733f), java.lang.Integer.valueOf(aq3Var.f451733f)) && n51.f.a(java.lang.Integer.valueOf(this.f451734g), java.lang.Integer.valueOf(aq3Var.f451734g)) && n51.f.a(this.f451735h, aq3Var.f451735h) && n51.f.a(this.f451736i, aq3Var.f451736i) && n51.f.a(this.f451737m, aq3Var.f451737m) && n51.f.a(this.f451738n, aq3Var.f451738n) && n51.f.a(java.lang.Integer.valueOf(this.f451739o), java.lang.Integer.valueOf(aq3Var.f451739o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451731d);
            java.lang.String str = this.f451732e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f451733f);
            fVar.e(4, this.f451734g);
            java.lang.String str2 = this.f451735h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f451736i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f451737m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f451738n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f451739o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f451731d) + 0;
            java.lang.String str6 = this.f451732e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            int e18 = e17 + b36.f.e(3, this.f451733f) + b36.f.e(4, this.f451734g);
            java.lang.String str7 = this.f451735h;
            if (str7 != null) {
                e18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f451736i;
            if (str8 != null) {
                e18 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f451737m;
            if (str9 != null) {
                e18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f451738n;
            if (str10 != null) {
                e18 += b36.f.j(8, str10);
            }
            return e18 + b36.f.e(9, this.f451739o);
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
        r45.aq3 aq3Var = (r45.aq3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aq3Var.f451731d = aVar2.g(intValue);
                return 0;
            case 2:
                aq3Var.f451732e = aVar2.k(intValue);
                return 0;
            case 3:
                aq3Var.f451733f = aVar2.g(intValue);
                return 0;
            case 4:
                aq3Var.f451734g = aVar2.g(intValue);
                return 0;
            case 5:
                aq3Var.f451735h = aVar2.k(intValue);
                return 0;
            case 6:
                aq3Var.f451736i = aVar2.k(intValue);
                return 0;
            case 7:
                aq3Var.f451737m = aVar2.k(intValue);
                return 0;
            case 8:
                aq3Var.f451738n = aVar2.k(intValue);
                return 0;
            case 9:
                aq3Var.f451739o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
