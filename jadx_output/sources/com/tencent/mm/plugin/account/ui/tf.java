package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class tf implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI f74227d;

    public tf(com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI) {
        this.f74227d = regByMobileSendSmsUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI = this.f74227d;
        int i17 = regByMobileSendSmsUI.f73597t;
        if (i17 <= 0) {
            regByMobileSendSmsUI.f73594q.setText(com.tencent.mm.R.string.hwk);
            regByMobileSendSmsUI.f73594q.setEnabled(true);
            return false;
        }
        regByMobileSendSmsUI.f73594q.setText(regByMobileSendSmsUI.getString(com.tencent.mm.R.string.hwt, java.lang.Integer.valueOf(i17)));
        int i18 = regByMobileSendSmsUI.f73597t - 1;
        regByMobileSendSmsUI.f73597t = i18;
        if (i18 % 4 == 0) {
            int i19 = regByMobileSendSmsUI.f73592o + 1;
            regByMobileSendSmsUI.f73592o = i19;
            if (i19 <= 4 && regByMobileSendSmsUI.f73596s) {
                h11.e eVar = new h11.e(regByMobileSendSmsUI.f73584d, 15, "", 0, "");
                java.lang.String stringExtra = regByMobileSendSmsUI.getIntent().getStringExtra("KForceMobileMsgId");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                eVar.f278073f = stringExtra;
                com.tencent.mm.network.v0 v0Var = eVar.f278071d;
                ((o45.eh) v0Var.getReqObj()).f342922a.f372497v = 1;
                eVar.S(regByMobileSendSmsUI.f73587g);
                int i27 = regByMobileSendSmsUI.f73592o;
                int i28 = i27 == 4 ? 1 : 0;
                r45.z66 z66Var = new r45.z66();
                z66Var.f391753d = i27;
                z66Var.f391754e = i28;
                ((o45.eh) v0Var.getReqObj()).f342922a.A = z66Var;
                gm0.j1.d().g(eVar);
                regByMobileSendSmsUI.f73596s = false;
            }
        }
        return true;
    }
}
