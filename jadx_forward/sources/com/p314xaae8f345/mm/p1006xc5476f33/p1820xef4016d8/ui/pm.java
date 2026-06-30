package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class pm implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f228859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d f228860b;

    public pm(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d, boolean z17) {
        this.f228860b = activityC16390x60cac25d;
        this.f228859a = z17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public void b(java.lang.Object obj, int i17, int i18) {
        r45.co3 co3Var = (r45.co3) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = this.f228860b;
        android.app.Dialog dialog = activityC16390x60cac25d.B;
        if (dialog != null && dialog.isShowing()) {
            activityC16390x60cac25d.B.dismiss();
        }
        activityC16390x60cac25d.f228071y = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do get show source net callback");
        if (co3Var == null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.K(activityC16390x60cac25d.mo55332x76847179(), "");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "retcode: %s", java.lang.Integer.valueOf(co3Var.f453236d));
        if (co3Var.f453236d != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.L(co3Var.f453237e);
            return;
        }
        activityC16390x60cac25d.f228073z = co3Var.f453240h;
        activityC16390x60cac25d.A = co3Var.f453239g;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_LAST_RECEIVE_TIMESTAMP_LONG_SYNC, java.lang.Long.valueOf(co3Var.f453244o));
        boolean z17 = this.f228859a;
        if (z17) {
            ((java.util.ArrayList) activityC16390x60cac25d.f228065t).clear();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "updateByResp use netscene, hasMore: %s, pagedata: %s", java.lang.Integer.valueOf(activityC16390x60cac25d.f228073z), activityC16390x60cac25d.A);
        activityC16390x60cac25d.p7(co3Var, z17);
        if (z17) {
            activityC16390x60cac25d.f228054i.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ml(activityC16390x60cac25d));
            activityC16390x60cac25d.l7();
        }
    }
}
