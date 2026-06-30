package aq1;

/* loaded from: classes12.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq1.q0 f94594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f94595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f94596f;

    public l0(aq1.q0 q0Var, long j17, long j18) {
        this.f94594d = q0Var;
        this.f94595e = j17;
        this.f94596f = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map = (java.util.Map) this.f94594d.f94613e.mo141623x754a37bb();
        long j17 = this.f94595e;
        jz5.l lVar = (jz5.l) map.get(java.lang.Long.valueOf(j17));
        if (lVar != null) {
            uq3.h hVar = (uq3.h) i95.n0.c(uq3.h.class);
            long longValue = ((java.lang.Number) lVar.f384366d).longValue();
            long longValue2 = ((java.lang.Number) lVar.f384367e).longValue();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) hVar).getClass();
            long j18 = longValue2 - longValue;
            long j19 = this.f94596f - longValue2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.FeatureService", "dispatchVoipInvite: " + j17 + ", dispatchCostMs=" + j18 + ", handleCostMs=" + j19);
            dr0.t0.f324073k.i().m46687x1b092800(j18, j19);
        }
    }
}
