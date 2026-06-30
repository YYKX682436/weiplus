package r45;

/* loaded from: classes15.dex */
public class b44 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452046d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452047e;

    /* renamed from: f, reason: collision with root package name */
    public int f452048f;

    /* renamed from: g, reason: collision with root package name */
    public int f452049g;

    /* renamed from: h, reason: collision with root package name */
    public int f452050h;

    /* renamed from: i, reason: collision with root package name */
    public int f452051i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b44)) {
            return false;
        }
        r45.b44 b44Var = (r45.b44) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452046d), java.lang.Integer.valueOf(b44Var.f452046d)) && n51.f.a(this.f452047e, b44Var.f452047e) && n51.f.a(java.lang.Integer.valueOf(this.f452048f), java.lang.Integer.valueOf(b44Var.f452048f)) && n51.f.a(java.lang.Integer.valueOf(this.f452049g), java.lang.Integer.valueOf(b44Var.f452049g)) && n51.f.a(java.lang.Integer.valueOf(this.f452050h), java.lang.Integer.valueOf(b44Var.f452050h)) && n51.f.a(java.lang.Integer.valueOf(this.f452051i), java.lang.Integer.valueOf(b44Var.f452051i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452046d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f452047e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f452048f);
            fVar.e(4, this.f452049g);
            fVar.e(5, this.f452050h);
            fVar.e(6, this.f452051i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452046d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f452047e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.e(3, this.f452048f) + b36.f.e(4, this.f452049g) + b36.f.e(5, this.f452050h) + b36.f.e(6, this.f452051i);
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
        r45.b44 b44Var = (r45.b44) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b44Var.f452046d = aVar2.g(intValue);
                return 0;
            case 2:
                b44Var.f452047e = aVar2.d(intValue);
                return 0;
            case 3:
                b44Var.f452048f = aVar2.g(intValue);
                return 0;
            case 4:
                b44Var.f452049g = aVar2.g(intValue);
                return 0;
            case 5:
                b44Var.f452050h = aVar2.g(intValue);
                return 0;
            case 6:
                b44Var.f452051i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
