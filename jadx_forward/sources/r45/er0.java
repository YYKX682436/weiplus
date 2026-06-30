package r45;

/* loaded from: classes2.dex */
public class er0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f455221d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f455222e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f455223f = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.er0)) {
            return false;
        }
        r45.er0 er0Var = (r45.er0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f455221d), java.lang.Long.valueOf(er0Var.f455221d)) && n51.f.a(java.lang.Long.valueOf(this.f455222e), java.lang.Long.valueOf(er0Var.f455222e)) && n51.f.a(java.lang.Integer.valueOf(this.f455223f), java.lang.Integer.valueOf(er0Var.f455223f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f455221d);
            fVar.h(2, this.f455222e);
            fVar.e(3, this.f455223f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f455221d) + 0 + b36.f.h(2, this.f455222e) + b36.f.e(3, this.f455223f);
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
        r45.er0 er0Var = (r45.er0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            er0Var.f455221d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            er0Var.f455222e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        er0Var.f455223f = aVar2.g(intValue);
        return 0;
    }
}
