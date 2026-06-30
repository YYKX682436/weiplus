package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes8.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public ot0.m1 f267340a;

    public final boolean a(android.app.Activity activity, int i17, int i18, android.content.Intent intent) {
        nw4.n nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (203 != i17) {
            return false;
        }
        if (this.f267340a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MPVideoTransmit", "onActivityResult mpMsgInfo is null");
            return true;
        }
        if (i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
            if (stringExtra != null) {
                ot0.m1 m1Var = this.f267340a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.m0(this, activity);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.C19429x834b7ec5 c19429x834b7ec5 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.C19429x834b7ec5();
                c19429x834b7ec5.f267262d = stringExtra;
                c19429x834b7ec5.f267264f = stringExtra2;
                c19429x834b7ec5.f267266h = m1Var;
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c19429x834b7ec5, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.h0.class, m0Var);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MPVideoTransmit", "share cancel");
            if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) && (nVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) activity).f265377p0) != null) {
                ot0.m1 m1Var2 = this.f267340a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var2);
                nVar.E(m1Var2.f454874f, "canceled");
            }
        }
        return true;
    }
}
