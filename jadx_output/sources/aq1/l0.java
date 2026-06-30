package aq1;

/* loaded from: classes12.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq1.q0 f13061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f13062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f13063f;

    public l0(aq1.q0 q0Var, long j17, long j18) {
        this.f13061d = q0Var;
        this.f13062e = j17;
        this.f13063f = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map = (java.util.Map) this.f13061d.f13080e.getValue();
        long j17 = this.f13062e;
        jz5.l lVar = (jz5.l) map.get(java.lang.Long.valueOf(j17));
        if (lVar != null) {
            uq3.h hVar = (uq3.h) i95.n0.c(uq3.h.class);
            long longValue = ((java.lang.Number) lVar.f302833d).longValue();
            long longValue2 = ((java.lang.Number) lVar.f302834e).longValue();
            ((com.tencent.mm.feature.performance.r4) hVar).getClass();
            long j18 = longValue2 - longValue;
            long j19 = this.f13063f - longValue2;
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.FeatureService", "dispatchVoipInvite: " + j17 + ", dispatchCostMs=" + j18 + ", handleCostMs=" + j19);
            dr0.t0.f242540k.i().collectVoipInviteCost(j18, j19);
        }
    }
}
