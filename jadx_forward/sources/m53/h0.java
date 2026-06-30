package m53;

/* loaded from: classes8.dex */
public class h0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f405270d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405271e;

    /* renamed from: f, reason: collision with root package name */
    public int f405272f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405273g;

    /* renamed from: h, reason: collision with root package name */
    public int f405274h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.h0)) {
            return false;
        }
        m53.h0 h0Var = (m53.h0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f405270d), java.lang.Integer.valueOf(h0Var.f405270d)) && n51.f.a(this.f405271e, h0Var.f405271e) && n51.f.a(java.lang.Integer.valueOf(this.f405272f), java.lang.Integer.valueOf(h0Var.f405272f)) && n51.f.a(this.f405273g, h0Var.f405273g) && n51.f.a(java.lang.Integer.valueOf(this.f405274h), java.lang.Integer.valueOf(h0Var.f405274h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f405270d);
            java.lang.String str = this.f405271e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f405272f);
            java.lang.String str2 = this.f405273g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f405274h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f405270d) + 0;
            java.lang.String str3 = this.f405271e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int e18 = e17 + b36.f.e(3, this.f405272f);
            java.lang.String str4 = this.f405273g;
            if (str4 != null) {
                e18 += b36.f.j(4, str4);
            }
            return e18 + b36.f.e(5, this.f405274h);
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
        m53.h0 h0Var = (m53.h0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h0Var.f405270d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            h0Var.f405271e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            h0Var.f405272f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            h0Var.f405273g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        h0Var.f405274h = aVar2.g(intValue);
        return 0;
    }
}
