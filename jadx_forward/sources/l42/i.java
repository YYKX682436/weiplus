package l42;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5738xc2db3c07 f397522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l42.n f397523e;

    public i(l42.n nVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5738xc2db3c07 c5738xc2db3c07) {
        this.f397523e = nVar;
        this.f397522d = c5738xc2db3c07;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.al alVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5738xc2db3c07 c5738xc2db3c07 = this.f397522d;
        if (c5738xc2db3c07 == null || (alVar = c5738xc2db3c07.f136062g) == null) {
            return;
        }
        long j17 = alVar.f87695a;
        if (j17 <= 0) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mNewEdgeScriptDeleteEvent configID : " + valueOf);
        t42.a.b(valueOf, 2, 0L);
        synchronized (this.f397523e.f397532d) {
            if (((java.util.HashMap) this.f397523e.f397532d).containsKey(valueOf)) {
                s42.b bVar = (s42.b) ((java.util.HashMap) this.f397523e.f397532d).remove(valueOf);
                if (bVar != null && this.f397523e.f397537i != null) {
                    fs.g.b(l42.z.class, new l42.C29062x2e0101(bVar));
                }
                this.f397523e.Ni();
                l42.n.wi(this.f397523e);
            }
        }
    }
}
