package r45;

/* loaded from: classes7.dex */
public class ec6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454805d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454806e;

    /* renamed from: f, reason: collision with root package name */
    public int f454807f;

    /* renamed from: g, reason: collision with root package name */
    public long f454808g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454809h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454810i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ec6)) {
            return false;
        }
        r45.ec6 ec6Var = (r45.ec6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454805d), java.lang.Integer.valueOf(ec6Var.f454805d)) && n51.f.a(this.f454806e, ec6Var.f454806e) && n51.f.a(java.lang.Integer.valueOf(this.f454807f), java.lang.Integer.valueOf(ec6Var.f454807f)) && n51.f.a(java.lang.Long.valueOf(this.f454808g), java.lang.Long.valueOf(ec6Var.f454808g)) && n51.f.a(this.f454809h, ec6Var.f454809h) && n51.f.a(this.f454810i, ec6Var.f454810i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454805d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f454806e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f454807f);
            fVar.h(4, this.f454808g);
            java.lang.String str = this.f454809h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f454810i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454805d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f454806e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            int e18 = e17 + b36.f.e(3, this.f454807f) + b36.f.h(4, this.f454808g);
            java.lang.String str3 = this.f454809h;
            if (str3 != null) {
                e18 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f454810i;
            return str4 != null ? e18 + b36.f.j(6, str4) : e18;
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
        r45.ec6 ec6Var = (r45.ec6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ec6Var.f454805d = aVar2.g(intValue);
                return 0;
            case 2:
                ec6Var.f454806e = aVar2.d(intValue);
                return 0;
            case 3:
                ec6Var.f454807f = aVar2.g(intValue);
                return 0;
            case 4:
                ec6Var.f454808g = aVar2.i(intValue);
                return 0;
            case 5:
                ec6Var.f454809h = aVar2.k(intValue);
                return 0;
            case 6:
                ec6Var.f454810i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
