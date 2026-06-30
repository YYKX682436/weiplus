package vz4;

@j95.b
/* loaded from: classes8.dex */
public class m extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f523270d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.g f523271e;

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WePkg.PluginWePkg", "onAccountInitialized");
        ku5.u0 u0Var = ku5.t0.f394148d;
        vz4.l lVar = new vz4.l(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f523270d = t0Var.z(lVar, 1000L, false);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WePkg.PluginWePkg", "onAccountRelease");
        wu5.c cVar = this.f523270d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.g gVar = this.f523271e;
        if (gVar != null) {
            gVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgListener", "wepkg stop listen");
            gVar.f270027c.mo48814x2efc64();
            gVar.f270025a.m43072x2efc64();
            gVar.f270026b.mo48814x2efc64();
            xz4.p pVar = xz4.q.f539828a;
            if (pVar != null) {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(pVar);
                } catch (java.lang.Exception unused) {
                }
            }
            xz4.q.f539828a = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgAutoDownloader", "WepkgAutoDownloader stopListen");
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270035b != null) {
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270035b != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270035b.mo50299x35224f();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270035b = null;
                    }
                }
            }
            this.f523271e = null;
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()) {
            m43.c.b().a("preload_commlib", new vz4.k(this));
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
    }
}
