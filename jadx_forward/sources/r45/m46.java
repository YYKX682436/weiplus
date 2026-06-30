package r45;

/* loaded from: classes2.dex */
public class m46 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461675d;

    /* renamed from: e, reason: collision with root package name */
    public int f461676e;

    /* renamed from: f, reason: collision with root package name */
    public int f461677f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m46)) {
            return false;
        }
        r45.m46 m46Var = (r45.m46) fVar;
        return n51.f.a(this.f461675d, m46Var.f461675d) && n51.f.a(java.lang.Integer.valueOf(this.f461676e), java.lang.Integer.valueOf(m46Var.f461676e)) && n51.f.a(java.lang.Integer.valueOf(this.f461677f), java.lang.Integer.valueOf(m46Var.f461677f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461675d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f461676e);
            fVar.e(3, this.f461677f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f461675d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f461676e) + b36.f.e(3, this.f461677f);
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
        r45.m46 m46Var = (r45.m46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m46Var.f461675d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            m46Var.f461676e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        m46Var.f461677f = aVar2.g(intValue);
        return 0;
    }
}
