package hs4;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hs4.h f366164d;

    public g(hs4.h hVar) {
        this.f366164d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hs4.h hVar = this.f366164d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayJsApiKindaEntranceUI", "execute finish logic if in font page：%s", java.lang.Boolean.valueOf(hVar.f366165d.f260662d));
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.ui.ActivityC19058x7309e74d activityC19058x7309e74d = hVar.f366165d;
        if (!activityC19058x7309e74d.f260662d || activityC19058x7309e74d.isFinishing() || hVar.f366165d.isDestroyed()) {
            return;
        }
        hVar.f366165d.setResult(0);
        hVar.f366165d.finish();
    }
}
