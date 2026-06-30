package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class af implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f73725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI f73726e;

    public af(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI, java.lang.String str) {
        this.f73726e = regByMobileRegAIOUI;
        this.f73725d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str;
        java.lang.String str2 = this.f73725d;
        int i18 = com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.Y;
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI = this.f73726e;
        regByMobileRegAIOUI.getClass();
        h11.e eVar = new h11.e(str2, 12, "", 0, "");
        eVar.f278073f = regByMobileRegAIOUI.f73563d;
        regByMobileRegAIOUI.f73574r = db5.e1.Q(regByMobileRegAIOUI, regByMobileRegAIOUI.getString(com.tencent.mm.R.string.f490573yv), regByMobileRegAIOUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.account.ui.bf(regByMobileRegAIOUI, eVar));
        java.lang.String h17 = com.tencent.mm.sdk.platformtools.c5.h(regByMobileRegAIOUI.X6().trim());
        java.lang.String str3 = regByMobileRegAIOUI.f73575s;
        if (str3 == null || regByMobileRegAIOUI.f73576t == null || h17.equals(str3) || !h17.equals(regByMobileRegAIOUI.f73576t)) {
            java.lang.String str4 = regByMobileRegAIOUI.f73575s;
            i17 = (str4 == null || (str = regByMobileRegAIOUI.f73576t) == null || str.equals(str4) || h17.equals(regByMobileRegAIOUI.f73576t)) ? 0 : 2;
        } else {
            i17 = 1;
        }
        regByMobileRegAIOUI.f73575s = com.tencent.mm.sdk.platformtools.c5.h(regByMobileRegAIOUI.X6().trim());
        int i19 = regByMobileRegAIOUI.D;
        com.tencent.mm.network.v0 v0Var = eVar.f278071d;
        ((o45.eh) v0Var.getReqObj()).f342922a.f372494s = i19;
        ((o45.eh) v0Var.getReqObj()).f342922a.f372495t = i17;
        regByMobileRegAIOUI.D++;
        s75.d.c(new com.tencent.mm.plugin.account.ui.cf(regByMobileRegAIOUI, eVar, regByMobileRegAIOUI.C.getText().toString(), str2, com.tencent.mm.sdk.platformtools.w2.a(regByMobileRegAIOUI.f73581y.getText().toString())), "reg_permchk", 7);
    }
}
