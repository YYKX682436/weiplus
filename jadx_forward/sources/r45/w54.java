package r45;

/* loaded from: classes8.dex */
public class w54 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public double f470429d;

    /* renamed from: e, reason: collision with root package name */
    public double f470430e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470431f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w54)) {
            return false;
        }
        r45.w54 w54Var = (r45.w54) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f470429d), java.lang.Double.valueOf(w54Var.f470429d)) && n51.f.a(java.lang.Double.valueOf(this.f470430e), java.lang.Double.valueOf(w54Var.f470430e)) && n51.f.a(this.f470431f, w54Var.f470431f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f470429d);
            fVar.c(2, this.f470430e);
            java.lang.String str = this.f470431f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = b36.f.c(1, this.f470429d) + 0 + b36.f.c(2, this.f470430e);
            java.lang.String str2 = this.f470431f;
            return str2 != null ? c17 + b36.f.j(3, str2) : c17;
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
        r45.w54 w54Var = (r45.w54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w54Var.f470429d = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 2) {
            w54Var.f470430e = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        w54Var.f470431f = aVar2.k(intValue);
        return 0;
    }
}
