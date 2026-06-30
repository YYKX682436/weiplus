package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l f262139d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l lVar) {
        this.f262139d = lVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "click bottomsheet ");
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_HK_PLUGIN_DISABLE_URL_STRING_SYNC, null);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l lVar = this.f262139d;
        if (K0) {
            android.content.Context context = lVar.f261917d;
            db5.e1.y(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ke6), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.w(lVar));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "jump to h5:%s ", str);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.W(lVar.f261917d, str, false, 4);
        }
    }
}
