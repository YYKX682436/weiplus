package r45;

/* loaded from: classes9.dex */
public class wa5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public double f470544d;

    /* renamed from: e, reason: collision with root package name */
    public double f470545e;

    /* renamed from: f, reason: collision with root package name */
    public double f470546f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wa5)) {
            return false;
        }
        r45.wa5 wa5Var = (r45.wa5) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f470544d), java.lang.Double.valueOf(wa5Var.f470544d)) && n51.f.a(java.lang.Double.valueOf(this.f470545e), java.lang.Double.valueOf(wa5Var.f470545e)) && n51.f.a(java.lang.Double.valueOf(this.f470546f), java.lang.Double.valueOf(wa5Var.f470546f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f470544d);
            fVar.c(2, this.f470545e);
            fVar.c(3, this.f470546f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.c(1, this.f470544d) + 0 + b36.f.c(2, this.f470545e) + b36.f.c(3, this.f470546f);
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
        r45.wa5 wa5Var = (r45.wa5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wa5Var.f470544d = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 2) {
            wa5Var.f470545e = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        wa5Var.f470546f = aVar2.e(intValue);
        return 0;
    }
}
