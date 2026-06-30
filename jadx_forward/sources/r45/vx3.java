package r45;

/* loaded from: classes9.dex */
public class vx3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470175d;

    /* renamed from: e, reason: collision with root package name */
    public int f470176e;

    /* renamed from: f, reason: collision with root package name */
    public int f470177f;

    /* renamed from: g, reason: collision with root package name */
    public double f470178g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vx3)) {
            return false;
        }
        r45.vx3 vx3Var = (r45.vx3) fVar;
        return n51.f.a(this.f470175d, vx3Var.f470175d) && n51.f.a(java.lang.Integer.valueOf(this.f470176e), java.lang.Integer.valueOf(vx3Var.f470176e)) && n51.f.a(java.lang.Integer.valueOf(this.f470177f), java.lang.Integer.valueOf(vx3Var.f470177f)) && n51.f.a(java.lang.Double.valueOf(this.f470178g), java.lang.Double.valueOf(vx3Var.f470178g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470175d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f470176e);
            fVar.e(3, this.f470177f);
            fVar.c(4, this.f470178g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f470175d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f470176e) + b36.f.e(3, this.f470177f) + b36.f.c(4, this.f470178g);
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
        r45.vx3 vx3Var = (r45.vx3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vx3Var.f470175d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            vx3Var.f470176e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            vx3Var.f470177f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        vx3Var.f470178g = aVar2.e(intValue);
        return 0;
    }
}
