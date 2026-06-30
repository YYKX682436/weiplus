package r45;

/* loaded from: classes8.dex */
public class sv3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f467513d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f467514e;

    /* renamed from: f, reason: collision with root package name */
    public int f467515f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sv3)) {
            return false;
        }
        r45.sv3 sv3Var = (r45.sv3) fVar;
        return n51.f.a(this.f467513d, sv3Var.f467513d) && n51.f.a(this.f467514e, sv3Var.f467514e) && n51.f.a(java.lang.Integer.valueOf(this.f467515f), java.lang.Integer.valueOf(sv3Var.f467515f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f467513d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f467514e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            fVar.e(3, this.f467515f);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f467513d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f467514e;
            if (gVar4 != null) {
                b17 += b36.f.b(2, gVar4);
            }
            return b17 + b36.f.e(3, this.f467515f);
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
        r45.sv3 sv3Var = (r45.sv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sv3Var.f467513d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            sv3Var.f467514e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        sv3Var.f467515f = aVar2.g(intValue);
        return 0;
    }
}
