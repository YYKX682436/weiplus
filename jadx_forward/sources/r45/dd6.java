package r45;

/* loaded from: classes9.dex */
public class dd6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453862d;

    /* renamed from: e, reason: collision with root package name */
    public int f453863e;

    /* renamed from: f, reason: collision with root package name */
    public double f453864f;

    /* renamed from: g, reason: collision with root package name */
    public double f453865g;

    /* renamed from: h, reason: collision with root package name */
    public int f453866h;

    /* renamed from: i, reason: collision with root package name */
    public int f453867i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f453868m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f453869n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dd6)) {
            return false;
        }
        r45.dd6 dd6Var = (r45.dd6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453862d), java.lang.Integer.valueOf(dd6Var.f453862d)) && n51.f.a(java.lang.Integer.valueOf(this.f453863e), java.lang.Integer.valueOf(dd6Var.f453863e)) && n51.f.a(java.lang.Double.valueOf(this.f453864f), java.lang.Double.valueOf(dd6Var.f453864f)) && n51.f.a(java.lang.Double.valueOf(this.f453865g), java.lang.Double.valueOf(dd6Var.f453865g)) && n51.f.a(java.lang.Integer.valueOf(this.f453866h), java.lang.Integer.valueOf(dd6Var.f453866h)) && n51.f.a(java.lang.Integer.valueOf(this.f453867i), java.lang.Integer.valueOf(dd6Var.f453867i)) && n51.f.a(this.f453868m, dd6Var.f453868m) && n51.f.a(this.f453869n, dd6Var.f453869n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453862d);
            fVar.e(2, this.f453863e);
            fVar.c(3, this.f453864f);
            fVar.c(4, this.f453865g);
            fVar.e(5, this.f453866h);
            fVar.e(6, this.f453867i);
            java.lang.String str = this.f453868m;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f453869n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f453862d) + 0 + b36.f.e(2, this.f453863e) + b36.f.c(3, this.f453864f) + b36.f.c(4, this.f453865g) + b36.f.e(5, this.f453866h) + b36.f.e(6, this.f453867i);
            java.lang.String str3 = this.f453868m;
            if (str3 != null) {
                e17 += b36.f.j(7, str3);
            }
            java.lang.String str4 = this.f453869n;
            return str4 != null ? e17 + b36.f.j(8, str4) : e17;
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
        r45.dd6 dd6Var = (r45.dd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dd6Var.f453862d = aVar2.g(intValue);
                return 0;
            case 2:
                dd6Var.f453863e = aVar2.g(intValue);
                return 0;
            case 3:
                dd6Var.f453864f = aVar2.e(intValue);
                return 0;
            case 4:
                dd6Var.f453865g = aVar2.e(intValue);
                return 0;
            case 5:
                dd6Var.f453866h = aVar2.g(intValue);
                return 0;
            case 6:
                dd6Var.f453867i = aVar2.g(intValue);
                return 0;
            case 7:
                dd6Var.f453868m = aVar2.k(intValue);
                return 0;
            case 8:
                dd6Var.f453869n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
