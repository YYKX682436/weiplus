package r45;

/* loaded from: classes9.dex */
public class ol4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463877d;

    /* renamed from: e, reason: collision with root package name */
    public int f463878e;

    /* renamed from: f, reason: collision with root package name */
    public int f463879f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f463880g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ol4)) {
            return false;
        }
        r45.ol4 ol4Var = (r45.ol4) fVar;
        return n51.f.a(this.f463877d, ol4Var.f463877d) && n51.f.a(java.lang.Integer.valueOf(this.f463878e), java.lang.Integer.valueOf(ol4Var.f463878e)) && n51.f.a(java.lang.Integer.valueOf(this.f463879f), java.lang.Integer.valueOf(ol4Var.f463879f)) && n51.f.a(java.lang.Boolean.valueOf(this.f463880g), java.lang.Boolean.valueOf(ol4Var.f463880g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463877d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f463878e);
            fVar.e(3, this.f463879f);
            fVar.a(4, this.f463880g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f463877d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f463878e) + b36.f.e(3, this.f463879f) + b36.f.a(4, this.f463880g);
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
        r45.ol4 ol4Var = (r45.ol4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ol4Var.f463877d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ol4Var.f463878e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ol4Var.f463879f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ol4Var.f463880g = aVar2.c(intValue);
        return 0;
    }
}
