package r45;

/* loaded from: classes2.dex */
public class u15 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f468480d;

    /* renamed from: e, reason: collision with root package name */
    public int f468481e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u15)) {
            return false;
        }
        r45.u15 u15Var = (r45.u15) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f468480d), java.lang.Boolean.valueOf(u15Var.f468480d)) && n51.f.a(java.lang.Integer.valueOf(this.f468481e), java.lang.Integer.valueOf(u15Var.f468481e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f468480d);
            fVar.e(2, this.f468481e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f468480d) + 0 + b36.f.e(2, this.f468481e);
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
        r45.u15 u15Var = (r45.u15) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u15Var.f468480d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        u15Var.f468481e = aVar2.g(intValue);
        return 0;
    }
}
