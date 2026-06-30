package r45;

/* loaded from: classes4.dex */
public class id4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f458484d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458485e;

    /* renamed from: f, reason: collision with root package name */
    public int f458486f;

    /* renamed from: g, reason: collision with root package name */
    public int f458487g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.id4)) {
            return false;
        }
        r45.id4 id4Var = (r45.id4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f458484d), java.lang.Integer.valueOf(id4Var.f458484d)) && n51.f.a(this.f458485e, id4Var.f458485e) && n51.f.a(java.lang.Integer.valueOf(this.f458486f), java.lang.Integer.valueOf(id4Var.f458486f)) && n51.f.a(java.lang.Integer.valueOf(this.f458487g), java.lang.Integer.valueOf(id4Var.f458487g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f458484d);
            java.lang.String str = this.f458485e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f458486f);
            fVar.e(4, this.f458487g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f458484d) + 0;
            java.lang.String str2 = this.f458485e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f458486f) + b36.f.e(4, this.f458487g);
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
        r45.id4 id4Var = (r45.id4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            id4Var.f458484d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            id4Var.f458485e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            id4Var.f458486f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        id4Var.f458487g = aVar2.g(intValue);
        return 0;
    }
}
