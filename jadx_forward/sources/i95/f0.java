package i95;

/* loaded from: classes12.dex */
public class f0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f371323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f371324e;

    public f0(java.lang.Class cls, boolean z17) {
        this.f371323d = cls;
        this.f371324e = z17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        i95.w wVar;
        java.lang.Class cls = this.f371323d;
        i95.w wVar2 = null;
        try {
            try {
                i95.w wVar3 = (i95.w) i95.n0.f371351b.a(cls);
                java.lang.ThreadLocal threadLocal = i95.n0.f371363n;
                wVar = (i95.w) threadLocal.get();
                try {
                    threadLocal.set(wVar3);
                    i95.n0.j(wVar, wVar3, i95.r.INITIALIZED, this.f371324e, false, false);
                    threadLocal.set(wVar);
                    wVar2 = wVar3;
                } catch (com.p314xaae8f345.mm.p2624x91727fcf.p2625x1d1e926c.C21321xc9bd728b e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ServiceManager", e, "[-] Fail to get feature service instance of '%s'", cls.getName());
                    i95.n0.f371363n.set(wVar);
                    return wVar2;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                wVar2 = wVar;
                i95.n0.f371363n.set(wVar2);
                throw th;
            }
        } catch (com.p314xaae8f345.mm.p2624x91727fcf.p2625x1d1e926c.C21321xc9bd728b e18) {
            e = e18;
            wVar = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            i95.n0.f371363n.set(wVar2);
            throw th;
        }
        return wVar2;
    }
}
