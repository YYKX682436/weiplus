package ot0;

/* loaded from: classes4.dex */
public class l0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f430103d;

    /* renamed from: e, reason: collision with root package name */
    public int f430104e;

    /* renamed from: f, reason: collision with root package name */
    public int f430105f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f430106g;

    /* renamed from: h, reason: collision with root package name */
    public long f430107h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ot0.l0)) {
            return false;
        }
        ot0.l0 l0Var = (ot0.l0) fVar;
        return n51.f.a(this.f430103d, l0Var.f430103d) && n51.f.a(java.lang.Integer.valueOf(this.f430104e), java.lang.Integer.valueOf(l0Var.f430104e)) && n51.f.a(java.lang.Integer.valueOf(this.f430105f), java.lang.Integer.valueOf(l0Var.f430105f)) && n51.f.a(this.f430106g, l0Var.f430106g) && n51.f.a(java.lang.Long.valueOf(this.f430107h), java.lang.Long.valueOf(l0Var.f430107h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f430103d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f430104e);
            fVar.e(3, this.f430105f);
            java.lang.String str2 = this.f430106g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f430107h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f430103d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f430104e) + b36.f.e(3, this.f430105f);
            java.lang.String str4 = this.f430106g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.h(5, this.f430107h);
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
        ot0.l0 l0Var = (ot0.l0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l0Var.f430103d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            l0Var.f430104e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            l0Var.f430105f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            l0Var.f430106g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        l0Var.f430107h = aVar2.i(intValue);
        return 0;
    }
}
