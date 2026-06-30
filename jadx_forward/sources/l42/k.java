package l42;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5740x676425be f397526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l42.n f397527e;

    public k(l42.n nVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5740x676425be c5740x676425be) {
        this.f397527e = nVar;
        this.f397526d = c5740x676425be;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.cl clVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5740x676425be c5740x676425be = this.f397526d;
        if (c5740x676425be == null || (clVar = c5740x676425be.f136064g) == null) {
            return;
        }
        long j17 = clVar.f87893a;
        if (j17 <= 0) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mNewEdgeSqlDeleteEvent configID : " + valueOf);
        t42.a.b(valueOf, 9, 0L);
        synchronized (this.f397527e.f397533e) {
            if (((java.util.HashMap) this.f397527e.f397533e).containsKey(valueOf)) {
                s42.c cVar = (s42.c) ((java.util.HashMap) this.f397527e.f397533e).remove(valueOf);
                if (cVar != null && this.f397527e.f397537i != null) {
                    fs.g.b(l42.z.class, new l42.C29061x2e0100(cVar));
                }
                this.f397527e.Ri();
            }
        }
    }
}
