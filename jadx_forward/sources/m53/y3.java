package m53;

/* loaded from: classes2.dex */
public class y3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f405741d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405742e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405743f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f405744g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.y3)) {
            return false;
        }
        m53.y3 y3Var = (m53.y3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f405741d), java.lang.Integer.valueOf(y3Var.f405741d)) && n51.f.a(this.f405742e, y3Var.f405742e) && n51.f.a(this.f405743f, y3Var.f405743f) && n51.f.a(java.lang.Boolean.valueOf(this.f405744g), java.lang.Boolean.valueOf(y3Var.f405744g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f405741d);
            java.lang.String str = this.f405742e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f405743f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f405744g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f405741d) + 0;
            java.lang.String str3 = this.f405742e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f405743f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.a(4, this.f405744g);
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
        m53.y3 y3Var = (m53.y3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y3Var.f405741d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            y3Var.f405742e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            y3Var.f405743f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        y3Var.f405744g = aVar2.c(intValue);
        return 0;
    }
}
