package r45;

/* loaded from: classes4.dex */
public class yb6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f472482d;

    /* renamed from: e, reason: collision with root package name */
    public int f472483e;

    /* renamed from: f, reason: collision with root package name */
    public long f472484f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yb6)) {
            return false;
        }
        r45.yb6 yb6Var = (r45.yb6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f472482d), java.lang.Integer.valueOf(yb6Var.f472482d)) && n51.f.a(java.lang.Integer.valueOf(this.f472483e), java.lang.Integer.valueOf(yb6Var.f472483e)) && n51.f.a(java.lang.Long.valueOf(this.f472484f), java.lang.Long.valueOf(yb6Var.f472484f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f472482d);
            fVar.e(2, this.f472483e);
            fVar.h(3, this.f472484f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f472482d) + 0 + b36.f.e(2, this.f472483e) + b36.f.h(3, this.f472484f);
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
        r45.yb6 yb6Var = (r45.yb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yb6Var.f472482d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            yb6Var.f472483e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        yb6Var.f472484f = aVar2.i(intValue);
        return 0;
    }
}
