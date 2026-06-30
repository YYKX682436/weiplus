package r45;

/* loaded from: classes4.dex */
public class zp4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473806d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473807e;

    /* renamed from: f, reason: collision with root package name */
    public double f473808f;

    /* renamed from: g, reason: collision with root package name */
    public double f473809g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zp4)) {
            return false;
        }
        r45.zp4 zp4Var = (r45.zp4) fVar;
        return n51.f.a(this.f473806d, zp4Var.f473806d) && n51.f.a(this.f473807e, zp4Var.f473807e) && n51.f.a(java.lang.Double.valueOf(this.f473808f), java.lang.Double.valueOf(zp4Var.f473808f)) && n51.f.a(java.lang.Double.valueOf(this.f473809g), java.lang.Double.valueOf(zp4Var.f473809g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473806d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473807e;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.c(2, this.f473808f);
            fVar.c(3, this.f473809g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f473806d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f473807e;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.c(2, this.f473808f) + b36.f.c(3, this.f473809g);
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
        r45.zp4 zp4Var = (r45.zp4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zp4Var.f473806d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zp4Var.f473808f = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 3) {
            zp4Var.f473809g = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        zp4Var.f473807e = aVar2.k(intValue);
        return 0;
    }
}
