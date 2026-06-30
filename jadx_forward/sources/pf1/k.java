package pf1;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pf1.n f435312d;

    public k(pf1.n nVar) {
        this.f435312d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pf1.n nVar = this.f435312d;
        if (nVar.f435316n) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLVConsoleView", "destroy hash[%d]", java.lang.Integer.valueOf(nVar.hashCode()));
        nVar.m158328x346a533a().mo120194xc77ccada();
        if (!nVar.m158328x346a533a().f292909y) {
            nVar.m158328x346a533a().mo52095x5cd39ffa();
        }
        nVar.f435316n = true;
    }
}
