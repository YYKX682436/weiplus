package r45;

/* loaded from: classes8.dex */
public class u83 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468665d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468666e;

    /* renamed from: f, reason: collision with root package name */
    public int f468667f;

    /* renamed from: g, reason: collision with root package name */
    public int f468668g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u83)) {
            return false;
        }
        r45.u83 u83Var = (r45.u83) fVar;
        return n51.f.a(this.f468665d, u83Var.f468665d) && n51.f.a(this.f468666e, u83Var.f468666e) && n51.f.a(java.lang.Integer.valueOf(this.f468667f), java.lang.Integer.valueOf(u83Var.f468667f)) && n51.f.a(java.lang.Integer.valueOf(this.f468668g), java.lang.Integer.valueOf(u83Var.f468668g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468665d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f468666e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f468667f);
            fVar.e(4, this.f468668g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f468665d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f468666e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f468667f) + b36.f.e(4, this.f468668g);
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
        r45.u83 u83Var = (r45.u83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u83Var.f468665d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            u83Var.f468666e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            u83Var.f468667f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        u83Var.f468668g = aVar2.g(intValue);
        return 0;
    }
}
