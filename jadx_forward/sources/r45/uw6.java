package r45;

/* loaded from: classes11.dex */
public class uw6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469235d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469236e;

    /* renamed from: f, reason: collision with root package name */
    public int f469237f;

    /* renamed from: g, reason: collision with root package name */
    public int f469238g;

    /* renamed from: h, reason: collision with root package name */
    public long f469239h;

    /* renamed from: i, reason: collision with root package name */
    public long f469240i;

    /* renamed from: m, reason: collision with root package name */
    public long f469241m;

    /* renamed from: n, reason: collision with root package name */
    public long f469242n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uw6)) {
            return false;
        }
        r45.uw6 uw6Var = (r45.uw6) fVar;
        return n51.f.a(this.f469235d, uw6Var.f469235d) && n51.f.a(this.f469236e, uw6Var.f469236e) && n51.f.a(java.lang.Integer.valueOf(this.f469237f), java.lang.Integer.valueOf(uw6Var.f469237f)) && n51.f.a(java.lang.Integer.valueOf(this.f469238g), java.lang.Integer.valueOf(uw6Var.f469238g)) && n51.f.a(java.lang.Long.valueOf(this.f469239h), java.lang.Long.valueOf(uw6Var.f469239h)) && n51.f.a(java.lang.Long.valueOf(this.f469240i), java.lang.Long.valueOf(uw6Var.f469240i)) && n51.f.a(java.lang.Long.valueOf(this.f469241m), java.lang.Long.valueOf(uw6Var.f469241m)) && n51.f.a(java.lang.Long.valueOf(this.f469242n), java.lang.Long.valueOf(uw6Var.f469242n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469235d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469236e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f469237f);
            fVar.e(4, this.f469238g);
            fVar.h(5, this.f469239h);
            fVar.h(6, this.f469240i);
            fVar.h(7, this.f469241m);
            fVar.h(8, this.f469242n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f469235d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f469236e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f469237f) + b36.f.e(4, this.f469238g) + b36.f.h(5, this.f469239h) + b36.f.h(6, this.f469240i) + b36.f.h(7, this.f469241m) + b36.f.h(8, this.f469242n);
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
        r45.uw6 uw6Var = (r45.uw6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uw6Var.f469235d = aVar2.k(intValue);
                return 0;
            case 2:
                uw6Var.f469236e = aVar2.k(intValue);
                return 0;
            case 3:
                uw6Var.f469237f = aVar2.g(intValue);
                return 0;
            case 4:
                uw6Var.f469238g = aVar2.g(intValue);
                return 0;
            case 5:
                uw6Var.f469239h = aVar2.i(intValue);
                return 0;
            case 6:
                uw6Var.f469240i = aVar2.i(intValue);
                return 0;
            case 7:
                uw6Var.f469241m = aVar2.i(intValue);
                return 0;
            case 8:
                uw6Var.f469242n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
