package r45;

/* loaded from: classes8.dex */
public class sa7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467134d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f467135e;

    /* renamed from: f, reason: collision with root package name */
    public int f467136f;

    /* renamed from: g, reason: collision with root package name */
    public int f467137g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sa7)) {
            return false;
        }
        r45.sa7 sa7Var = (r45.sa7) fVar;
        return n51.f.a(this.f467134d, sa7Var.f467134d) && n51.f.a(java.lang.Boolean.valueOf(this.f467135e), java.lang.Boolean.valueOf(sa7Var.f467135e)) && n51.f.a(java.lang.Integer.valueOf(this.f467136f), java.lang.Integer.valueOf(sa7Var.f467136f)) && n51.f.a(java.lang.Integer.valueOf(this.f467137g), java.lang.Integer.valueOf(sa7Var.f467137g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467134d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f467135e);
            fVar.e(3, this.f467136f);
            fVar.e(4, this.f467137g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f467134d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.a(2, this.f467135e) + b36.f.e(3, this.f467136f) + b36.f.e(4, this.f467137g);
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
        r45.sa7 sa7Var = (r45.sa7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sa7Var.f467134d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            sa7Var.f467135e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            sa7Var.f467136f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        sa7Var.f467137g = aVar2.g(intValue);
        return 0;
    }
}
