package dp1;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f323652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dp1.l f323653e;

    public b(dp1.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        this.f323653e = lVar;
        this.f323652d = c12886x91aa2b6d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f323652d;
        dp1.l lVar = this.f323653e;
        lVar.getClass();
        try {
            int indexOf = lVar.f323698g.indexOf(c12886x91aa2b6d);
            if (indexOf < 0 || indexOf >= lVar.f323698g.size()) {
                return;
            }
            lVar.m8148xed6e4d18(indexOf, "");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallMenuAdapter", e17, "doUpdateBallButton exception", new java.lang.Object[0]);
        }
    }
}
