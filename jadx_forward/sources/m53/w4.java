package m53;

/* loaded from: classes4.dex */
public class w4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f405693d;

    /* renamed from: e, reason: collision with root package name */
    public long f405694e;

    /* renamed from: f, reason: collision with root package name */
    public int f405695f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.w4)) {
            return false;
        }
        m53.w4 w4Var = (m53.w4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f405693d), java.lang.Long.valueOf(w4Var.f405693d)) && n51.f.a(java.lang.Long.valueOf(this.f405694e), java.lang.Long.valueOf(w4Var.f405694e)) && n51.f.a(java.lang.Integer.valueOf(this.f405695f), java.lang.Integer.valueOf(w4Var.f405695f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f405693d);
            fVar.h(2, this.f405694e);
            fVar.e(3, this.f405695f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f405693d) + 0 + b36.f.h(2, this.f405694e) + b36.f.e(3, this.f405695f);
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
        m53.w4 w4Var = (m53.w4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w4Var.f405693d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            w4Var.f405694e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        w4Var.f405695f = aVar2.g(intValue);
        return 0;
    }
}
