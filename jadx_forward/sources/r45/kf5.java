package r45;

/* loaded from: classes8.dex */
public class kf5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460189d;

    /* renamed from: e, reason: collision with root package name */
    public int f460190e;

    /* renamed from: f, reason: collision with root package name */
    public int f460191f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f460192g;

    /* renamed from: h, reason: collision with root package name */
    public int f460193h;

    /* renamed from: i, reason: collision with root package name */
    public int f460194i = 10;

    /* renamed from: m, reason: collision with root package name */
    public boolean f460195m;

    /* renamed from: n, reason: collision with root package name */
    public long f460196n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kf5)) {
            return false;
        }
        r45.kf5 kf5Var = (r45.kf5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460189d), java.lang.Integer.valueOf(kf5Var.f460189d)) && n51.f.a(java.lang.Integer.valueOf(this.f460190e), java.lang.Integer.valueOf(kf5Var.f460190e)) && n51.f.a(java.lang.Integer.valueOf(this.f460191f), java.lang.Integer.valueOf(kf5Var.f460191f)) && n51.f.a(java.lang.Boolean.valueOf(this.f460192g), java.lang.Boolean.valueOf(kf5Var.f460192g)) && n51.f.a(java.lang.Integer.valueOf(this.f460193h), java.lang.Integer.valueOf(kf5Var.f460193h)) && n51.f.a(java.lang.Integer.valueOf(this.f460194i), java.lang.Integer.valueOf(kf5Var.f460194i)) && n51.f.a(java.lang.Boolean.valueOf(this.f460195m), java.lang.Boolean.valueOf(kf5Var.f460195m)) && n51.f.a(java.lang.Long.valueOf(this.f460196n), java.lang.Long.valueOf(kf5Var.f460196n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460189d);
            fVar.e(2, this.f460190e);
            fVar.e(3, this.f460191f);
            fVar.a(4, this.f460192g);
            fVar.e(5, this.f460193h);
            fVar.e(6, this.f460194i);
            fVar.a(7, this.f460195m);
            fVar.h(8, this.f460196n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f460189d) + 0 + b36.f.e(2, this.f460190e) + b36.f.e(3, this.f460191f) + b36.f.a(4, this.f460192g) + b36.f.e(5, this.f460193h) + b36.f.e(6, this.f460194i) + b36.f.a(7, this.f460195m) + b36.f.h(8, this.f460196n);
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
        r45.kf5 kf5Var = (r45.kf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kf5Var.f460189d = aVar2.g(intValue);
                return 0;
            case 2:
                kf5Var.f460190e = aVar2.g(intValue);
                return 0;
            case 3:
                kf5Var.f460191f = aVar2.g(intValue);
                return 0;
            case 4:
                kf5Var.f460192g = aVar2.c(intValue);
                return 0;
            case 5:
                kf5Var.f460193h = aVar2.g(intValue);
                return 0;
            case 6:
                kf5Var.f460194i = aVar2.g(intValue);
                return 0;
            case 7:
                kf5Var.f460195m = aVar2.c(intValue);
                return 0;
            case 8:
                kf5Var.f460196n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
