package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes13.dex */
public final class j3 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3 f155479a;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3 k3Var) {
        this.f155479a = k3Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compoundButton, "<anonymous parameter 0>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "onChecked: " + z17);
        zl.i iVar = (zl.i) i95.n0.c(zl.i.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3 k3Var = this.f155479a;
        ((v61.f) iVar).Ni(k3Var.Q6().isChecked() ? 1 : 2);
        try {
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("has_sync_chat_login", java.lang.Integer.valueOf(((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi() == 1 ? 1 : 0));
            lVarArr[1] = new jz5.l("has_sync_chat_select", java.lang.Integer.valueOf(k3Var.S6()));
            lVarArr[2] = new jz5.l("login_page_sessionid", com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g3.a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.f155506f));
            java.util.Map k17 = kz5.c1.k(lVarArr);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sync_recent_chat", "view_clk", k17, 34575);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "reportCheckboxClick success, params: " + k17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LoginAgreeSyncMsgUIC", e17, "reportCheckboxClick failed", new java.lang.Object[0]);
        }
    }
}
