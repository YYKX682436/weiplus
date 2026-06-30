package r45;

/* loaded from: classes8.dex */
public class ep4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455187d;

    /* renamed from: e, reason: collision with root package name */
    public int f455188e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f455189f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455190g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455191h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455192i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ep4)) {
            return false;
        }
        r45.ep4 ep4Var = (r45.ep4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455187d), java.lang.Integer.valueOf(ep4Var.f455187d)) && n51.f.a(java.lang.Integer.valueOf(this.f455188e), java.lang.Integer.valueOf(ep4Var.f455188e)) && n51.f.a(this.f455189f, ep4Var.f455189f) && n51.f.a(this.f455190g, ep4Var.f455190g) && n51.f.a(this.f455191h, ep4Var.f455191h) && n51.f.a(this.f455192i, ep4Var.f455192i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455187d);
            fVar.e(2, this.f455188e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f455189f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str = this.f455190g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f455191h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f455192i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455187d) + 0 + b36.f.e(2, this.f455188e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f455189f;
            if (gVar2 != null) {
                e17 += b36.f.b(3, gVar2);
            }
            java.lang.String str4 = this.f455190g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f455191h;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f455192i;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
        r45.ep4 ep4Var = (r45.ep4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ep4Var.f455187d = aVar2.g(intValue);
                return 0;
            case 2:
                ep4Var.f455188e = aVar2.g(intValue);
                return 0;
            case 3:
                ep4Var.f455189f = aVar2.d(intValue);
                return 0;
            case 4:
                ep4Var.f455190g = aVar2.k(intValue);
                return 0;
            case 5:
                ep4Var.f455191h = aVar2.k(intValue);
                return 0;
            case 6:
                ep4Var.f455192i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
