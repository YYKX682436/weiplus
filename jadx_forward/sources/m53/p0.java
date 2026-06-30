package m53;

/* loaded from: classes2.dex */
public class p0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f405489d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405490e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f405491f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.p0)) {
            return false;
        }
        m53.p0 p0Var = (m53.p0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f405489d), java.lang.Boolean.valueOf(p0Var.f405489d)) && n51.f.a(this.f405490e, p0Var.f405490e) && n51.f.a(java.lang.Boolean.valueOf(this.f405491f), java.lang.Boolean.valueOf(p0Var.f405491f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f405489d);
            java.lang.String str = this.f405490e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f405491f);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f405489d) + 0;
            java.lang.String str2 = this.f405490e;
            if (str2 != null) {
                a17 += b36.f.j(2, str2);
            }
            return a17 + b36.f.a(3, this.f405491f);
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
        m53.p0 p0Var = (m53.p0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p0Var.f405489d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            p0Var.f405490e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        p0Var.f405491f = aVar2.c(intValue);
        return 0;
    }
}
