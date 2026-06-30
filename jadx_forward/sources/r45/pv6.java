package r45;

/* loaded from: classes8.dex */
public class pv6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464953d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464954e;

    /* renamed from: f, reason: collision with root package name */
    public int f464955f;

    /* renamed from: g, reason: collision with root package name */
    public int f464956g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pv6)) {
            return false;
        }
        r45.pv6 pv6Var = (r45.pv6) fVar;
        return n51.f.a(this.f464953d, pv6Var.f464953d) && n51.f.a(this.f464954e, pv6Var.f464954e) && n51.f.a(java.lang.Integer.valueOf(this.f464955f), java.lang.Integer.valueOf(pv6Var.f464955f)) && n51.f.a(java.lang.Integer.valueOf(this.f464956g), java.lang.Integer.valueOf(pv6Var.f464956g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464953d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464954e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f464955f);
            fVar.e(4, this.f464956g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f464953d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f464954e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f464955f) + b36.f.e(4, this.f464956g);
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
        r45.pv6 pv6Var = (r45.pv6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pv6Var.f464953d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            pv6Var.f464954e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            pv6Var.f464955f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        pv6Var.f464956g = aVar2.g(intValue);
        return 0;
    }
}
