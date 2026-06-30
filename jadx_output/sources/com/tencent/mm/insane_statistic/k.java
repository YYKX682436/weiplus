package com.tencent.mm.insane_statistic;

@j95.b
/* loaded from: classes12.dex */
public class k extends i95.w implements k70.d0, r70.b {
    @Override // r70.b
    public void K3(final r70.c cVar) {
        if (cVar.f393075b == r70.d.f393085f && cVar.f393079f && cVar.f393081h != null) {
            xs.d1 d1Var = (xs.d1) i95.n0.c(xs.d1.class);
            java.lang.String str = cVar.f393074a.f393102d;
            ((v70.w) d1Var).getClass();
            if (com.tencent.mm.storage.z3.K3(str)) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.insane_statistic.k$$a
                /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 359
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.insane_statistic.k$$a.run():void");
                }
            });
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).Zi(this);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).mj(this);
    }
}
