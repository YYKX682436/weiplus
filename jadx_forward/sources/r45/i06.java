package r45;

/* loaded from: classes2.dex */
public class i06 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458162d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458163e;

    /* renamed from: f, reason: collision with root package name */
    public int f458164f;

    /* renamed from: g, reason: collision with root package name */
    public int f458165g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i06)) {
            return false;
        }
        r45.i06 i06Var = (r45.i06) fVar;
        return n51.f.a(this.f458162d, i06Var.f458162d) && n51.f.a(this.f458163e, i06Var.f458163e) && n51.f.a(java.lang.Integer.valueOf(this.f458164f), java.lang.Integer.valueOf(i06Var.f458164f)) && n51.f.a(java.lang.Integer.valueOf(this.f458165g), java.lang.Integer.valueOf(i06Var.f458165g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f458162d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            java.lang.String str = this.f458163e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f458164f);
            fVar.e(4, this.f458165g);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f458162d;
            int b17 = gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0;
            java.lang.String str2 = this.f458163e;
            if (str2 != null) {
                b17 += b36.f.j(2, str2);
            }
            return b17 + b36.f.e(3, this.f458164f) + b36.f.e(4, this.f458165g);
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
        r45.i06 i06Var = (r45.i06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i06Var.f458162d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            i06Var.f458163e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            i06Var.f458164f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        i06Var.f458165g = aVar2.g(intValue);
        return 0;
    }
}
