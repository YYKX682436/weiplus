package r45;

/* loaded from: classes4.dex */
public class i90 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public double f458370d;

    /* renamed from: e, reason: collision with root package name */
    public double f458371e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i90)) {
            return false;
        }
        r45.i90 i90Var = (r45.i90) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f458370d), java.lang.Double.valueOf(i90Var.f458370d)) && n51.f.a(java.lang.Double.valueOf(this.f458371e), java.lang.Double.valueOf(i90Var.f458371e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f458370d);
            fVar.c(2, this.f458371e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.c(1, this.f458370d) + 0 + b36.f.c(2, this.f458371e);
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
        r45.i90 i90Var = (r45.i90) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i90Var.f458370d = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        i90Var.f458371e = aVar2.e(intValue);
        return 0;
    }
}
