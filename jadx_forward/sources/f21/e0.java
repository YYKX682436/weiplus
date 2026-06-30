package f21;

/* loaded from: classes4.dex */
public class e0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f340421d;

    /* renamed from: e, reason: collision with root package name */
    public int f340422e;

    /* renamed from: f, reason: collision with root package name */
    public int f340423f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof f21.e0)) {
            return false;
        }
        f21.e0 e0Var = (f21.e0) fVar;
        return n51.f.a(this.f340421d, e0Var.f340421d) && n51.f.a(java.lang.Integer.valueOf(this.f340422e), java.lang.Integer.valueOf(e0Var.f340422e)) && n51.f.a(java.lang.Integer.valueOf(this.f340423f), java.lang.Integer.valueOf(e0Var.f340423f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f340421d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f340422e);
            fVar.e(4, this.f340423f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f340421d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f340422e) + b36.f.e(4, this.f340423f);
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
        f21.e0 e0Var = (f21.e0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e0Var.f340421d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            e0Var.f340422e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        e0Var.f340423f = aVar2.g(intValue);
        return 0;
    }
}
