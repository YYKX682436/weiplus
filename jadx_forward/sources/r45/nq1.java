package r45;

/* loaded from: classes2.dex */
public class nq1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463126d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f463127e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nq1)) {
            return false;
        }
        r45.nq1 nq1Var = (r45.nq1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463126d), java.lang.Integer.valueOf(nq1Var.f463126d)) && n51.f.a(java.lang.Boolean.valueOf(this.f463127e), java.lang.Boolean.valueOf(nq1Var.f463127e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463126d);
            fVar.a(2, this.f463127e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f463126d) + 0 + b36.f.a(2, this.f463127e);
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
        r45.nq1 nq1Var = (r45.nq1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nq1Var.f463126d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        nq1Var.f463127e = aVar2.c(intValue);
        return 0;
    }
}
