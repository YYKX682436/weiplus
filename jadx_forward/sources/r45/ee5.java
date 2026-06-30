package r45;

/* loaded from: classes11.dex */
public class ee5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454894d;

    /* renamed from: e, reason: collision with root package name */
    public int f454895e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454896f;

    /* renamed from: g, reason: collision with root package name */
    public int f454897g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454898h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454899i;

    /* renamed from: m, reason: collision with root package name */
    public int f454900m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ee5)) {
            return false;
        }
        r45.ee5 ee5Var = (r45.ee5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454894d), java.lang.Integer.valueOf(ee5Var.f454894d)) && n51.f.a(java.lang.Integer.valueOf(this.f454895e), java.lang.Integer.valueOf(ee5Var.f454895e)) && n51.f.a(this.f454896f, ee5Var.f454896f) && n51.f.a(java.lang.Integer.valueOf(this.f454897g), java.lang.Integer.valueOf(ee5Var.f454897g)) && n51.f.a(this.f454898h, ee5Var.f454898h) && n51.f.a(this.f454899i, ee5Var.f454899i) && n51.f.a(java.lang.Integer.valueOf(this.f454900m), java.lang.Integer.valueOf(ee5Var.f454900m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454894d);
            fVar.e(2, this.f454895e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f454896f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f454897g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f454898h;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f454899i;
            if (gVar3 != null) {
                fVar.b(6, gVar3);
            }
            fVar.e(7, this.f454900m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454894d) + 0 + b36.f.e(2, this.f454895e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f454896f;
            if (gVar4 != null) {
                e17 += b36.f.b(3, gVar4);
            }
            int e18 = e17 + b36.f.e(4, this.f454897g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f454898h;
            if (gVar5 != null) {
                e18 += b36.f.b(5, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f454899i;
            if (gVar6 != null) {
                e18 += b36.f.b(6, gVar6);
            }
            return e18 + b36.f.e(7, this.f454900m);
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
        r45.ee5 ee5Var = (r45.ee5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ee5Var.f454894d = aVar2.g(intValue);
                return 0;
            case 2:
                ee5Var.f454895e = aVar2.g(intValue);
                return 0;
            case 3:
                ee5Var.f454896f = aVar2.d(intValue);
                return 0;
            case 4:
                ee5Var.f454897g = aVar2.g(intValue);
                return 0;
            case 5:
                ee5Var.f454898h = aVar2.d(intValue);
                return 0;
            case 6:
                ee5Var.f454899i = aVar2.d(intValue);
                return 0;
            case 7:
                ee5Var.f454900m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
