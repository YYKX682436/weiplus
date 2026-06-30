package com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b;

/* renamed from: com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo */
/* loaded from: classes2.dex */
public class C19808x7ed00fc3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: average_score */
    public double f39046xf372b5f0;

    /* renamed from: total_score_cnt */
    public long f39047x9aebe701;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19808x7ed00fc3 m77315xaf65a0fc() {
        return new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19808x7ed00fc3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19808x7ed00fc3)) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19808x7ed00fc3 c19808x7ed00fc3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19808x7ed00fc3) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f39046xf372b5f0), java.lang.Double.valueOf(c19808x7ed00fc3.f39046xf372b5f0)) && n51.f.a(java.lang.Long.valueOf(this.f39047x9aebe701), java.lang.Long.valueOf(c19808x7ed00fc3.f39047x9aebe701));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f39046xf372b5f0);
            fVar.h(2, this.f39047x9aebe701);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.c(1, this.f39046xf372b5f0) + 0 + b36.f.h(2, this.f39047x9aebe701);
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19808x7ed00fc3 c19808x7ed00fc3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19808x7ed00fc3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c19808x7ed00fc3.f39046xf372b5f0 = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        c19808x7ed00fc3.f39047x9aebe701 = aVar2.i(intValue);
        return 0;
    }

    /* renamed from: setAverage_score */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19808x7ed00fc3 m77316x43a8d8ae(double d17) {
        this.f39046xf372b5f0 = d17;
        return this;
    }

    /* renamed from: setTotal_score_cnt */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19808x7ed00fc3 m77317xb624523f(long j17) {
        this.f39047x9aebe701 = j17;
        return this;
    }
}
