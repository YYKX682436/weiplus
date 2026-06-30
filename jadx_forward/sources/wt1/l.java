package wt1;

/* loaded from: classes15.dex */
public class l implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt1.n f530841d;

    public l(wt1.n nVar) {
        this.f530841d = nVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        wt1.m mVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onTimerExpired, do refresh code!");
        wt1.n nVar = this.f530841d;
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onShowTimeExpired()");
        if (nVar.f530843d == null) {
            return true;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) nVar.f530843d).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) nVar.f530843d).get(i17);
            if (weakReference != null && (mVar = (wt1.m) weakReference.get()) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "on show TimeExpired! do update refresh code view!");
                android.os.Message obtain = android.os.Message.obtain();
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r0(null);
                r0Var.f176675a = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q0.onShowTimeExpired;
                obtain.obj = r0Var;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) mVar).W.mo50308x2936bf5f(obtain);
            }
        }
        return true;
    }
}
