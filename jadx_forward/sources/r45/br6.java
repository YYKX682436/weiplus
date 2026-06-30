package r45;

/* loaded from: classes2.dex */
public class br6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452543d;

    /* renamed from: e, reason: collision with root package name */
    public int f452544e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452545f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452546g;

    /* renamed from: h, reason: collision with root package name */
    public int f452547h;

    /* renamed from: i, reason: collision with root package name */
    public int f452548i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.br6)) {
            return false;
        }
        r45.br6 br6Var = (r45.br6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452543d), java.lang.Integer.valueOf(br6Var.f452543d)) && n51.f.a(java.lang.Integer.valueOf(this.f452544e), java.lang.Integer.valueOf(br6Var.f452544e)) && n51.f.a(this.f452545f, br6Var.f452545f) && n51.f.a(this.f452546g, br6Var.f452546g) && n51.f.a(java.lang.Integer.valueOf(this.f452547h), java.lang.Integer.valueOf(br6Var.f452547h)) && n51.f.a(java.lang.Integer.valueOf(this.f452548i), java.lang.Integer.valueOf(br6Var.f452548i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452543d);
            fVar.e(2, this.f452544e);
            java.lang.String str = this.f452545f;
            if (str != null) {
                fVar.j(3, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f452546g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f452547h);
            fVar.e(6, this.f452548i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452543d) + 0 + b36.f.e(2, this.f452544e);
            java.lang.String str2 = this.f452545f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f452546g;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            return e17 + b36.f.e(5, this.f452547h) + b36.f.e(6, this.f452548i);
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
        r45.br6 br6Var = (r45.br6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                br6Var.f452543d = aVar2.g(intValue);
                return 0;
            case 2:
                br6Var.f452544e = aVar2.g(intValue);
                return 0;
            case 3:
                br6Var.f452545f = aVar2.k(intValue);
                return 0;
            case 4:
                br6Var.f452546g = aVar2.d(intValue);
                return 0;
            case 5:
                br6Var.f452547h = aVar2.g(intValue);
                return 0;
            case 6:
                br6Var.f452548i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
