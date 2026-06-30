package bo1;

/* loaded from: classes2.dex */
public class p extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f104548d;

    /* renamed from: e, reason: collision with root package name */
    public long f104549e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bo1.p)) {
            return false;
        }
        bo1.p pVar = (bo1.p) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f104548d), java.lang.Long.valueOf(pVar.f104548d)) && n51.f.a(java.lang.Long.valueOf(this.f104549e), java.lang.Long.valueOf(pVar.f104549e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f104548d);
            fVar.h(2, this.f104549e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f104548d) + 0 + b36.f.h(2, this.f104549e);
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
        bo1.p pVar = (bo1.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pVar.f104548d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        pVar.f104549e = aVar2.i(intValue);
        return 0;
    }
}
