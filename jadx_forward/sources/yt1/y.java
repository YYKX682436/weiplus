package yt1;

/* loaded from: classes8.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f546820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.p0 f546821e;

    public y(yt1.z zVar, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        this.f546820d = str;
        this.f546821e = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.b().c();
        if (xt1.t0.fj().f538110o == null) {
            xt1.t0.fj().f538110o = new eu1.h();
        }
        eu1.h hVar = xt1.t0.fj().f538110o;
        java.lang.String str = "" + this.f546821e.f152259a.f459101r;
        hVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardMsgMgr", "sharecard onReceiveMsg msgId is " + str);
        java.lang.String str2 = this.f546820d;
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        eu1.g gVar = null;
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str2, "sysmsg", null);
        if (d17 != null) {
            gVar = new eu1.g(hVar);
            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.notifysharecard.state_flag");
            if (!android.text.TextUtils.isEmpty(str3) && lu1.a0.y(str3)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, 0);
            }
            gVar.f338287a = (java.lang.String) d17.get(".sysmsg.notifysharecard.card_id");
        }
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardMsgMgr", "card msg == null");
            return;
        }
        if (android.text.TextUtils.isEmpty(gVar.f338287a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardMsgMgr", "card id == null");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardMsgMgr", "sharecard doSyncNetScene card id is " + gVar.f338287a);
        xt1.t0.mj().a();
        lu1.a0.K();
    }
}
