package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class q5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5347xe7151721 f266893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266895f;

    public q5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5347xe7151721 c5347xe7151721, nw4.y2 y2Var) {
        this.f266895f = c1Var;
        this.f266893d = c5347xe7151721;
        this.f266894e = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5347xe7151721 c5347xe7151721 = this.f266893d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "ExDeviceGetTicketEvent isOk[%s], ticket[%s]", java.lang.Boolean.valueOf(c5347xe7151721.f135673h.f87661a), c5347xe7151721.f135673h.f87662b);
        am.a6 a6Var = c5347xe7151721.f135673h;
        if (a6Var.f87661a) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a6Var.f87662b);
            nw4.y2 y2Var = this.f266894e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266895f;
            if (K0) {
                c1Var.i5(y2Var, "getWXDeviceTicket:fail", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "ticket %s", c5347xe7151721.f135673h.f87662b);
            hashMap.put("ticket", c5347xe7151721.f135673h.f87662b);
            c1Var.i5(y2Var, "getWXDeviceTicket:ok", hashMap);
        }
    }
}
