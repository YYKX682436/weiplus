package r45;

/* loaded from: classes7.dex */
public class qd7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f465408d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f465409e;

    /* renamed from: f, reason: collision with root package name */
    public int f465410f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qd7)) {
            return false;
        }
        r45.qd7 qd7Var = (r45.qd7) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f465408d), java.lang.Boolean.valueOf(qd7Var.f465408d)) && n51.f.a(java.lang.Boolean.valueOf(this.f465409e), java.lang.Boolean.valueOf(qd7Var.f465409e)) && n51.f.a(java.lang.Integer.valueOf(this.f465410f), java.lang.Integer.valueOf(qd7Var.f465410f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f465408d);
            fVar.a(2, this.f465409e);
            fVar.e(3, this.f465410f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f465408d) + 0 + b36.f.a(2, this.f465409e) + b36.f.e(3, this.f465410f);
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
        r45.qd7 qd7Var = (r45.qd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qd7Var.f465408d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            qd7Var.f465409e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        qd7Var.f465410f = aVar2.g(intValue);
        return 0;
    }
}
