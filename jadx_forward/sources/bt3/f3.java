package bt3;

/* loaded from: classes8.dex */
public class f3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f105797d;

    /* renamed from: e, reason: collision with root package name */
    public int f105798e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f105799f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f105800g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f105801h;

    /* renamed from: i, reason: collision with root package name */
    public int f105802i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bt3.f3)) {
            return false;
        }
        bt3.f3 f3Var = (bt3.f3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f105797d), java.lang.Integer.valueOf(f3Var.f105797d)) && n51.f.a(java.lang.Integer.valueOf(this.f105798e), java.lang.Integer.valueOf(f3Var.f105798e)) && n51.f.a(this.f105799f, f3Var.f105799f) && n51.f.a(this.f105800g, f3Var.f105800g) && n51.f.a(this.f105801h, f3Var.f105801h) && n51.f.a(java.lang.Integer.valueOf(this.f105802i), java.lang.Integer.valueOf(f3Var.f105802i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f105797d);
            fVar.e(2, this.f105798e);
            java.lang.String str = this.f105799f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f105800g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f105801h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            fVar.e(6, this.f105802i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f105797d) + 0 + b36.f.e(2, this.f105798e);
            java.lang.String str3 = this.f105799f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f105800g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f105801h;
            if (gVar2 != null) {
                e17 += b36.f.b(5, gVar2);
            }
            return e17 + b36.f.e(6, this.f105802i);
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
        bt3.f3 f3Var = (bt3.f3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f3Var.f105797d = aVar2.g(intValue);
                return 0;
            case 2:
                f3Var.f105798e = aVar2.g(intValue);
                return 0;
            case 3:
                f3Var.f105799f = aVar2.k(intValue);
                return 0;
            case 4:
                f3Var.f105800g = aVar2.k(intValue);
                return 0;
            case 5:
                f3Var.f105801h = aVar2.d(intValue);
                return 0;
            case 6:
                f3Var.f105802i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
