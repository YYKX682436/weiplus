package r45;

/* loaded from: classes9.dex */
public class is5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f458844d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458845e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458846f;

    /* renamed from: g, reason: collision with root package name */
    public int f458847g;

    /* renamed from: h, reason: collision with root package name */
    public int f458848h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.is5)) {
            return false;
        }
        r45.is5 is5Var = (r45.is5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f458844d), java.lang.Long.valueOf(is5Var.f458844d)) && n51.f.a(this.f458845e, is5Var.f458845e) && n51.f.a(this.f458846f, is5Var.f458846f) && n51.f.a(java.lang.Integer.valueOf(this.f458847g), java.lang.Integer.valueOf(is5Var.f458847g)) && n51.f.a(java.lang.Integer.valueOf(this.f458848h), java.lang.Integer.valueOf(is5Var.f458848h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f458844d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f458845e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f458846f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            fVar.e(4, this.f458847g);
            fVar.e(5, this.f458848h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f458844d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f458845e;
            if (gVar3 != null) {
                h17 += b36.f.b(2, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f458846f;
            if (gVar4 != null) {
                h17 += b36.f.b(3, gVar4);
            }
            return h17 + b36.f.e(4, this.f458847g) + b36.f.e(5, this.f458848h);
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
        r45.is5 is5Var = (r45.is5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            is5Var.f458844d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            is5Var.f458845e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            is5Var.f458846f = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 4) {
            is5Var.f458847g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        is5Var.f458848h = aVar2.g(intValue);
        return 0;
    }
}
