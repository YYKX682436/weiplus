package l42;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5739xe38acba9 f397520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l42.n f397521e;

    public h(l42.n nVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5739xe38acba9 c5739xe38acba9) {
        this.f397521e = nVar;
        this.f397520d = c5739xe38acba9;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.bl blVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5739xe38acba9 c5739xe38acba9 = this.f397520d;
        if (c5739xe38acba9 == null || (blVar = c5739xe38acba9.f136063g) == null) {
            return;
        }
        long j17 = blVar.f87793a;
        if (j17 <= 0 || blVar.f87794b == null) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mNewEdgeScriptUpdateEvent configID : " + valueOf);
        t42.a.b(valueOf, 1, 0L);
        synchronized (this.f397521e.f397532d) {
            s42.b b17 = this.f397521e.f397536h.b(valueOf, this.f397520d.f136063g.f87794b);
            if (b17 == null) {
                return;
            }
            ((java.util.HashMap) this.f397521e.f397532d).put(b17.f484464a, b17);
            if (this.f397521e.f397537i != null) {
                fs.g.b(l42.z.class, new l42.C29063x2e0102(b17));
            }
            this.f397521e.Ni();
            l42.n.wi(this.f397521e);
            l42.n nVar = this.f397521e;
            nVar.f397535g.mo50293x3498a0(new l42.e(nVar));
        }
    }
}
