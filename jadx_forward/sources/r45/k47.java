package r45;

/* loaded from: classes7.dex */
public class k47 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459907d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459908e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f459909f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k47)) {
            return false;
        }
        r45.k47 k47Var = (r45.k47) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459907d), java.lang.Integer.valueOf(k47Var.f459907d)) && n51.f.a(this.f459908e, k47Var.f459908e) && n51.f.a(this.f459909f, k47Var.f459909f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459907d);
            java.lang.String str = this.f459908e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f459909f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f459907d) + 0;
            java.lang.String str2 = this.f459908e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f459909f;
            return gVar2 != null ? e17 + b36.f.b(3, gVar2) : e17;
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
        r45.k47 k47Var = (r45.k47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k47Var.f459907d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            k47Var.f459908e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        k47Var.f459909f = aVar2.d(intValue);
        return 0;
    }
}
