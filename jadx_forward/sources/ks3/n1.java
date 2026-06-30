package ks3;

/* loaded from: classes4.dex */
public class n1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f393258d;

    /* renamed from: e, reason: collision with root package name */
    public long f393259e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.n1)) {
            return false;
        }
        ks3.n1 n1Var = (ks3.n1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f393258d), java.lang.Long.valueOf(n1Var.f393258d)) && n51.f.a(java.lang.Long.valueOf(this.f393259e), java.lang.Long.valueOf(n1Var.f393259e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f393258d);
            fVar.h(2, this.f393259e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f393258d) + 0 + b36.f.h(2, this.f393259e);
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
        ks3.n1 n1Var = (ks3.n1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            n1Var.f393258d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        n1Var.f393259e = aVar2.i(intValue);
        return 0;
    }
}
