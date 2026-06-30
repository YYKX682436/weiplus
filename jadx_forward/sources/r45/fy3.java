package r45;

/* loaded from: classes8.dex */
public class fy3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456259d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456260e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456261f;

    /* renamed from: g, reason: collision with root package name */
    public int f456262g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fy3)) {
            return false;
        }
        r45.fy3 fy3Var = (r45.fy3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456259d), java.lang.Integer.valueOf(fy3Var.f456259d)) && n51.f.a(this.f456260e, fy3Var.f456260e) && n51.f.a(this.f456261f, fy3Var.f456261f) && n51.f.a(java.lang.Integer.valueOf(this.f456262g), java.lang.Integer.valueOf(fy3Var.f456262g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f456259d);
            java.lang.String str = this.f456260e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f456261f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f456262g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f456259d) + 0;
            java.lang.String str2 = this.f456260e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f456261f;
            if (gVar2 != null) {
                e17 += b36.f.b(3, gVar2);
            }
            return e17 + b36.f.e(4, this.f456262g);
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
        r45.fy3 fy3Var = (r45.fy3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fy3Var.f456259d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fy3Var.f456260e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            fy3Var.f456261f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        fy3Var.f456262g = aVar2.g(intValue);
        return 0;
    }
}
