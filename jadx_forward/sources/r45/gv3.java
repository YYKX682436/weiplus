package r45;

/* loaded from: classes11.dex */
public class gv3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457082d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457083e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457084f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457085g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gv3)) {
            return false;
        }
        r45.gv3 gv3Var = (r45.gv3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457082d), java.lang.Integer.valueOf(gv3Var.f457082d)) && n51.f.a(this.f457083e, gv3Var.f457083e) && n51.f.a(this.f457084f, gv3Var.f457084f) && n51.f.a(this.f457085g, gv3Var.f457085g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457082d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f457083e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f457084f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f457085g;
            if (gVar3 != null) {
                fVar.b(4, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457082d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f457083e;
            if (gVar4 != null) {
                e17 += b36.f.b(2, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f457084f;
            if (gVar5 != null) {
                e17 += b36.f.b(3, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f457085g;
            return gVar6 != null ? e17 + b36.f.b(4, gVar6) : e17;
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
        r45.gv3 gv3Var = (r45.gv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gv3Var.f457082d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gv3Var.f457083e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            gv3Var.f457084f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        gv3Var.f457085g = aVar2.d(intValue);
        return 0;
    }
}
