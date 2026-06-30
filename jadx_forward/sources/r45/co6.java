package r45;

/* loaded from: classes9.dex */
public class co6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453267d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f453268e;

    /* renamed from: f, reason: collision with root package name */
    public int f453269f;

    /* renamed from: g, reason: collision with root package name */
    public int f453270g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.co6)) {
            return false;
        }
        r45.co6 co6Var = (r45.co6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453267d), java.lang.Integer.valueOf(co6Var.f453267d)) && n51.f.a(this.f453268e, co6Var.f453268e) && n51.f.a(java.lang.Integer.valueOf(this.f453269f), java.lang.Integer.valueOf(co6Var.f453269f)) && n51.f.a(java.lang.Integer.valueOf(this.f453270g), java.lang.Integer.valueOf(co6Var.f453270g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(7, this.f453267d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f453268e;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            fVar.e(9, this.f453269f);
            fVar.e(10, this.f453270g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(7, this.f453267d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f453268e;
            if (gVar2 != null) {
                e17 += b36.f.b(8, gVar2);
            }
            return e17 + b36.f.e(9, this.f453269f) + b36.f.e(10, this.f453270g);
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
        r45.co6 co6Var = (r45.co6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 7:
                co6Var.f453267d = aVar2.g(intValue);
                return 0;
            case 8:
                co6Var.f453268e = aVar2.d(intValue);
                return 0;
            case 9:
                co6Var.f453269f = aVar2.g(intValue);
                return 0;
            case 10:
                co6Var.f453270g = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
