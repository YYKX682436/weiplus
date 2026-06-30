package wt1;

/* loaded from: classes15.dex */
public class e implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt1.g f530798d;

    public e(wt1.g gVar) {
        this.f530798d = gVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        wt1.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "onTimerExpired, do refresh code one minute");
        wt1.g gVar = this.f530798d;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "onCodeChange()");
        if (gVar.f530802d != null) {
            for (int i17 = 0; i17 < ((java.util.ArrayList) gVar.f530802d).size(); i17++) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) gVar.f530802d).get(i17);
                if (weakReference != null && (fVar = (wt1.f) weakReference.get()) != null) {
                    fVar.F1();
                }
            }
        }
        gVar.d();
        return true;
    }
}
