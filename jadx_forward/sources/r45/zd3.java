package r45;

/* loaded from: classes8.dex */
public class zd3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public double f473463d;

    /* renamed from: e, reason: collision with root package name */
    public double f473464e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zd3)) {
            return false;
        }
        r45.zd3 zd3Var = (r45.zd3) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f473463d), java.lang.Double.valueOf(zd3Var.f473463d)) && n51.f.a(java.lang.Double.valueOf(this.f473464e), java.lang.Double.valueOf(zd3Var.f473464e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f473463d);
            fVar.c(2, this.f473464e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.c(1, this.f473463d) + 0 + b36.f.c(2, this.f473464e);
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
        r45.zd3 zd3Var = (r45.zd3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zd3Var.f473463d = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        zd3Var.f473464e = aVar2.e(intValue);
        return 0;
    }
}
