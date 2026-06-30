package r45;

/* loaded from: classes7.dex */
public class fd4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public double f455772d;

    /* renamed from: e, reason: collision with root package name */
    public double f455773e;

    /* renamed from: f, reason: collision with root package name */
    public double f455774f;

    /* renamed from: g, reason: collision with root package name */
    public int f455775g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fd4)) {
            return false;
        }
        r45.fd4 fd4Var = (r45.fd4) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f455772d), java.lang.Double.valueOf(fd4Var.f455772d)) && n51.f.a(java.lang.Double.valueOf(this.f455773e), java.lang.Double.valueOf(fd4Var.f455773e)) && n51.f.a(java.lang.Double.valueOf(this.f455774f), java.lang.Double.valueOf(fd4Var.f455774f)) && n51.f.a(java.lang.Integer.valueOf(this.f455775g), java.lang.Integer.valueOf(fd4Var.f455775g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(2, this.f455772d);
            fVar.c(3, this.f455773e);
            fVar.c(5, this.f455774f);
            fVar.e(6, this.f455775g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.c(2, this.f455772d) + 0 + b36.f.c(3, this.f455773e) + b36.f.c(5, this.f455774f) + b36.f.e(6, this.f455775g);
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
        r45.fd4 fd4Var = (r45.fd4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 2) {
            fd4Var.f455772d = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 3) {
            fd4Var.f455773e = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 5) {
            fd4Var.f455774f = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        fd4Var.f455775g = aVar2.g(intValue);
        return 0;
    }
}
