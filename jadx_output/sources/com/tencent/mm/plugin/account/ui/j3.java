package com.tencent.mm.plugin.account.ui;

/* loaded from: classes13.dex */
public final class j3 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.k3 f73946a;

    public j3(com.tencent.mm.plugin.account.ui.k3 k3Var) {
        this.f73946a = k3Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        kotlin.jvm.internal.o.g(compoundButton, "<anonymous parameter 0>");
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "onChecked: " + z17);
        zl.i iVar = (zl.i) i95.n0.c(zl.i.class);
        com.tencent.mm.plugin.account.ui.k3 k3Var = this.f73946a;
        ((v61.f) iVar).Ni(k3Var.Q6().isChecked() ? 1 : 2);
        try {
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("has_sync_chat_login", java.lang.Integer.valueOf(((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi() == 1 ? 1 : 0));
            lVarArr[1] = new jz5.l("has_sync_chat_select", java.lang.Integer.valueOf(k3Var.S6()));
            lVarArr[2] = new jz5.l("login_page_sessionid", com.tencent.mm.plugin.account.ui.g3.a(com.tencent.mm.plugin.account.ui.k3.f73973f));
            java.util.Map k17 = kz5.c1.k(lVarArr);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sync_recent_chat", "view_clk", k17, 34575);
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "reportCheckboxClick success, params: " + k17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LoginAgreeSyncMsgUIC", e17, "reportCheckboxClick failed", new java.lang.Object[0]);
        }
    }
}
