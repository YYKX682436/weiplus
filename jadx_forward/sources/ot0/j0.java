package ot0;

/* loaded from: classes2.dex */
public class j0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f430088d;

    /* renamed from: e, reason: collision with root package name */
    public int f430089e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f430090f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ot0.j0)) {
            return false;
        }
        ot0.j0 j0Var = (ot0.j0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f430088d), java.lang.Integer.valueOf(j0Var.f430088d)) && n51.f.a(java.lang.Integer.valueOf(this.f430089e), java.lang.Integer.valueOf(j0Var.f430089e)) && n51.f.a(this.f430090f, j0Var.f430090f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f430088d);
            fVar.e(2, this.f430089e);
            java.lang.String str = this.f430090f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f430088d) + 0 + b36.f.e(2, this.f430089e);
            java.lang.String str2 = this.f430090f;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
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
        ot0.j0 j0Var = (ot0.j0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j0Var.f430088d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            j0Var.f430089e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        j0Var.f430090f = aVar2.k(intValue);
        return 0;
    }
}
