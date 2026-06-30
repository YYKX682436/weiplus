package r45;

/* loaded from: classes4.dex */
public class ls5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461336d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461337e;

    /* renamed from: f, reason: collision with root package name */
    public int f461338f;

    /* renamed from: g, reason: collision with root package name */
    public int f461339g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f461340h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ls5)) {
            return false;
        }
        r45.ls5 ls5Var = (r45.ls5) fVar;
        return n51.f.a(this.f461336d, ls5Var.f461336d) && n51.f.a(this.f461337e, ls5Var.f461337e) && n51.f.a(java.lang.Integer.valueOf(this.f461338f), java.lang.Integer.valueOf(ls5Var.f461338f)) && n51.f.a(java.lang.Integer.valueOf(this.f461339g), java.lang.Integer.valueOf(ls5Var.f461339g)) && n51.f.a(this.f461340h, ls5Var.f461340h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461336d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f461337e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f461338f);
            fVar.e(4, this.f461339g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f461340h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f461336d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f461337e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int e17 = j17 + b36.f.e(3, this.f461338f) + b36.f.e(4, this.f461339g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f461340h;
            return gVar2 != null ? e17 + b36.f.b(5, gVar2) : e17;
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
        r45.ls5 ls5Var = (r45.ls5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ls5Var.f461336d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ls5Var.f461337e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ls5Var.f461338f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ls5Var.f461339g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ls5Var.f461340h = aVar2.d(intValue);
        return 0;
    }
}
