package kh5;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh5.h f389600d;

    public d(kh5.h hVar) {
        this.f389600d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MEChattingMgr", "destroyBizTask because of timeout");
        kh5.h hVar = this.f389600d;
        jc3.j0 j0Var = hVar.f529908f;
        if (j0Var != null) {
            ((rc3.w0) j0Var).m162151x5cd39ffa();
        }
        bf3.p pVar = hVar.f529909g;
        if (pVar != null) {
            pVar.b();
        }
        hVar.f529908f = null;
        hVar.f529909g = null;
        hVar.Y0();
        hVar.f389605i.removeAllViews();
        hVar.f389606m.removeAllViews();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove all views, with count ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = hVar.f399452d.f399450a;
        sb6.append(concurrentHashMap.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBDynamicBizContext", sb6.toString());
        concurrentHashMap.clear();
    }
}
