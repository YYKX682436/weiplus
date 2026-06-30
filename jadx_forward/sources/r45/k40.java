package r45;

/* loaded from: classes8.dex */
public class k40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459886d;

    /* renamed from: e, reason: collision with root package name */
    public double f459887e;

    /* renamed from: f, reason: collision with root package name */
    public double f459888f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k40)) {
            return false;
        }
        r45.k40 k40Var = (r45.k40) fVar;
        return n51.f.a(this.f459886d, k40Var.f459886d) && n51.f.a(java.lang.Double.valueOf(this.f459887e), java.lang.Double.valueOf(k40Var.f459887e)) && n51.f.a(java.lang.Double.valueOf(this.f459888f), java.lang.Double.valueOf(k40Var.f459888f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459886d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.c(2, this.f459887e);
            fVar.c(3, this.f459888f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f459886d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.c(2, this.f459887e) + b36.f.c(3, this.f459888f);
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
        r45.k40 k40Var = (r45.k40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k40Var.f459886d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            k40Var.f459887e = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        k40Var.f459888f = aVar2.e(intValue);
        return 0;
    }
}
