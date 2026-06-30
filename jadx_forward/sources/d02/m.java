package d02;

/* loaded from: classes2.dex */
public class m extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f306872d;

    /* renamed from: e, reason: collision with root package name */
    public long f306873e;

    /* renamed from: f, reason: collision with root package name */
    public long f306874f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof d02.m)) {
            return false;
        }
        d02.m mVar = (d02.m) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f306872d), java.lang.Long.valueOf(mVar.f306872d)) && n51.f.a(java.lang.Long.valueOf(this.f306873e), java.lang.Long.valueOf(mVar.f306873e)) && n51.f.a(java.lang.Long.valueOf(this.f306874f), java.lang.Long.valueOf(mVar.f306874f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f306872d);
            fVar.h(2, this.f306873e);
            fVar.h(3, this.f306874f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f306872d) + 0 + b36.f.h(2, this.f306873e) + b36.f.h(3, this.f306874f);
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
        d02.m mVar = (d02.m) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mVar.f306872d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            mVar.f306873e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        mVar.f306874f = aVar2.i(intValue);
        return 0;
    }
}
