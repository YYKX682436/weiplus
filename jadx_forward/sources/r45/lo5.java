package r45;

/* loaded from: classes8.dex */
public class lo5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461208d;

    /* renamed from: e, reason: collision with root package name */
    public int f461209e;

    /* renamed from: f, reason: collision with root package name */
    public int f461210f;

    /* renamed from: g, reason: collision with root package name */
    public int f461211g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f461212h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lo5)) {
            return false;
        }
        r45.lo5 lo5Var = (r45.lo5) fVar;
        return n51.f.a(this.f461208d, lo5Var.f461208d) && n51.f.a(java.lang.Integer.valueOf(this.f461209e), java.lang.Integer.valueOf(lo5Var.f461209e)) && n51.f.a(java.lang.Integer.valueOf(this.f461210f), java.lang.Integer.valueOf(lo5Var.f461210f)) && n51.f.a(java.lang.Integer.valueOf(this.f461211g), java.lang.Integer.valueOf(lo5Var.f461211g)) && n51.f.a(this.f461212h, lo5Var.f461212h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461208d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f461209e);
            fVar.e(3, this.f461210f);
            fVar.e(4, this.f461211g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f461212h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f461208d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f461209e) + b36.f.e(3, this.f461210f) + b36.f.e(4, this.f461211g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f461212h;
            return gVar2 != null ? j17 + b36.f.b(5, gVar2) : j17;
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
        r45.lo5 lo5Var = (r45.lo5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lo5Var.f461208d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            lo5Var.f461209e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            lo5Var.f461210f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            lo5Var.f461211g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        lo5Var.f461212h = aVar2.d(intValue);
        return 0;
    }
}
