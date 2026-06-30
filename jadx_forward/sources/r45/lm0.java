package r45;

/* loaded from: classes8.dex */
public class lm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461125d;

    /* renamed from: e, reason: collision with root package name */
    public int f461126e;

    /* renamed from: f, reason: collision with root package name */
    public int f461127f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461128g;

    /* renamed from: h, reason: collision with root package name */
    public int f461129h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461130i;

    /* renamed from: m, reason: collision with root package name */
    public long f461131m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f461132n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lm0)) {
            return false;
        }
        r45.lm0 lm0Var = (r45.lm0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461125d), java.lang.Integer.valueOf(lm0Var.f461125d)) && n51.f.a(java.lang.Integer.valueOf(this.f461126e), java.lang.Integer.valueOf(lm0Var.f461126e)) && n51.f.a(java.lang.Integer.valueOf(this.f461127f), java.lang.Integer.valueOf(lm0Var.f461127f)) && n51.f.a(this.f461128g, lm0Var.f461128g) && n51.f.a(java.lang.Integer.valueOf(this.f461129h), java.lang.Integer.valueOf(lm0Var.f461129h)) && n51.f.a(this.f461130i, lm0Var.f461130i) && n51.f.a(java.lang.Long.valueOf(this.f461131m), java.lang.Long.valueOf(lm0Var.f461131m)) && n51.f.a(this.f461132n, lm0Var.f461132n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461125d);
            fVar.e(2, this.f461126e);
            fVar.e(3, this.f461127f);
            java.lang.String str = this.f461128g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f461129h);
            java.lang.String str2 = this.f461130i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.h(7, this.f461131m);
            java.lang.String str3 = this.f461132n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461125d) + 0 + b36.f.e(2, this.f461126e) + b36.f.e(3, this.f461127f);
            java.lang.String str4 = this.f461128g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            int e18 = e17 + b36.f.e(5, this.f461129h);
            java.lang.String str5 = this.f461130i;
            if (str5 != null) {
                e18 += b36.f.j(6, str5);
            }
            int h17 = e18 + b36.f.h(7, this.f461131m);
            java.lang.String str6 = this.f461132n;
            return str6 != null ? h17 + b36.f.j(8, str6) : h17;
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
        r45.lm0 lm0Var = (r45.lm0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lm0Var.f461125d = aVar2.g(intValue);
                return 0;
            case 2:
                lm0Var.f461126e = aVar2.g(intValue);
                return 0;
            case 3:
                lm0Var.f461127f = aVar2.g(intValue);
                return 0;
            case 4:
                lm0Var.f461128g = aVar2.k(intValue);
                return 0;
            case 5:
                lm0Var.f461129h = aVar2.g(intValue);
                return 0;
            case 6:
                lm0Var.f461130i = aVar2.k(intValue);
                return 0;
            case 7:
                lm0Var.f461131m = aVar2.i(intValue);
                return 0;
            case 8:
                lm0Var.f461132n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
