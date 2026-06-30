package l42;

/* loaded from: classes15.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5741x8813b560 f397524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l42.n f397525e;

    public j(l42.n nVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5741x8813b560 c5741x8813b560) {
        this.f397525e = nVar;
        this.f397524d = c5741x8813b560;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.dl dlVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5741x8813b560 c5741x8813b560 = this.f397524d;
        if (c5741x8813b560 == null || (dlVar = c5741x8813b560.f136065g) == null) {
            return;
        }
        long j17 = dlVar.f88008a;
        if (j17 <= 0 || dlVar.f88009b == null) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mNewEdgeSqlUpdateEvent configID : " + valueOf);
        t42.a.b(valueOf, 8, 0L);
        synchronized (this.f397525e.f397533e) {
            s42.c d17 = this.f397525e.f397536h.d(valueOf, this.f397524d.f136065g.f88009b);
            if (d17 == null) {
                return;
            }
            ((java.util.HashMap) this.f397525e.f397533e).put(d17.f484478a, d17);
            if (this.f397525e.f397537i != null) {
                fs.g.b(l42.z.class, new l42.C29058x2e00fd(d17));
            }
            this.f397525e.Ri();
            l42.n nVar = this.f397525e;
            nVar.f397535g.mo50293x3498a0(new l42.e(nVar));
        }
    }
}
