package r45;

/* loaded from: classes7.dex */
public class xf5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f471586d;

    /* renamed from: e, reason: collision with root package name */
    public float f471587e;

    /* renamed from: f, reason: collision with root package name */
    public float f471588f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xf5)) {
            return false;
        }
        r45.xf5 xf5Var = (r45.xf5) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f471586d), java.lang.Float.valueOf(xf5Var.f471586d)) && n51.f.a(java.lang.Float.valueOf(this.f471587e), java.lang.Float.valueOf(xf5Var.f471587e)) && n51.f.a(java.lang.Float.valueOf(this.f471588f), java.lang.Float.valueOf(xf5Var.f471588f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f471586d);
            fVar.d(2, this.f471587e);
            fVar.d(3, this.f471588f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f471586d) + 0 + b36.f.d(2, this.f471587e) + b36.f.d(3, this.f471588f);
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
        r45.xf5 xf5Var = (r45.xf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xf5Var.f471586d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            xf5Var.f471587e = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        xf5Var.f471588f = aVar2.f(intValue);
        return 0;
    }
}
