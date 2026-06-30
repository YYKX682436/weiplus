package m53;

/* loaded from: classes8.dex */
public class f3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f405209d;

    /* renamed from: e, reason: collision with root package name */
    public int f405210e;

    /* renamed from: f, reason: collision with root package name */
    public float f405211f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.f3)) {
            return false;
        }
        m53.f3 f3Var = (m53.f3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f405209d), java.lang.Integer.valueOf(f3Var.f405209d)) && n51.f.a(java.lang.Integer.valueOf(this.f405210e), java.lang.Integer.valueOf(f3Var.f405210e)) && n51.f.a(java.lang.Float.valueOf(this.f405211f), java.lang.Float.valueOf(f3Var.f405211f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f405209d);
            fVar.e(2, this.f405210e);
            fVar.d(3, this.f405211f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f405209d) + 0 + b36.f.e(2, this.f405210e) + b36.f.d(3, this.f405211f);
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
        m53.f3 f3Var = (m53.f3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f3Var.f405209d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            f3Var.f405210e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        f3Var.f405211f = aVar2.f(intValue);
        return 0;
    }
}
