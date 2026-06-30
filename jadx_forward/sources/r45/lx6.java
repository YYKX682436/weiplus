package r45;

/* loaded from: classes8.dex */
public class lx6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461490d;

    /* renamed from: e, reason: collision with root package name */
    public int f461491e;

    /* renamed from: f, reason: collision with root package name */
    public int f461492f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lx6)) {
            return false;
        }
        r45.lx6 lx6Var = (r45.lx6) fVar;
        return n51.f.a(this.f461490d, lx6Var.f461490d) && n51.f.a(java.lang.Integer.valueOf(this.f461491e), java.lang.Integer.valueOf(lx6Var.f461491e)) && n51.f.a(java.lang.Integer.valueOf(this.f461492f), java.lang.Integer.valueOf(lx6Var.f461492f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461490d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f461491e);
            fVar.e(3, this.f461492f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f461490d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f461491e) + b36.f.e(3, this.f461492f);
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
        r45.lx6 lx6Var = (r45.lx6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lx6Var.f461490d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            lx6Var.f461491e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        lx6Var.f461492f = aVar2.g(intValue);
        return 0;
    }
}
