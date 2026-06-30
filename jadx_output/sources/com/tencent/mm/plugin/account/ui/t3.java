package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class t3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI f74209d;

    public t3(com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI) {
        this.f74209d = loginByMobileSendSmsUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI = this.f74209d;
        int i17 = loginByMobileSendSmsUI.C;
        if (i17 <= 0) {
            loginByMobileSendSmsUI.f73312x.setText(com.tencent.mm.R.string.hwk);
            loginByMobileSendSmsUI.f73312x.setEnabled(true);
            return false;
        }
        loginByMobileSendSmsUI.f73312x.setText(loginByMobileSendSmsUI.getString(com.tencent.mm.R.string.hwt, java.lang.Integer.valueOf(i17)));
        int i18 = loginByMobileSendSmsUI.C - 1;
        loginByMobileSendSmsUI.C = i18;
        if (i18 % 4 == 0) {
            loginByMobileSendSmsUI.f73310v++;
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginByMobileSendSmsUI", "try checkSmsResult, querySmsCount=" + loginByMobileSendSmsUI.f73310v);
            if (loginByMobileSendSmsUI.f73310v <= 4 && loginByMobileSendSmsUI.B) {
                h11.e eVar = new h11.e(loginByMobileSendSmsUI.f73295d, 17, "", 0, "");
                com.tencent.mm.network.v0 v0Var = eVar.f278071d;
                ((o45.eh) v0Var.getReqObj()).f342922a.f372497v = 1;
                int i19 = loginByMobileSendSmsUI.f73310v;
                int i27 = i19 == 4 ? 1 : 0;
                r45.z66 z66Var = new r45.z66();
                z66Var.f391753d = i19;
                z66Var.f391754e = i27;
                ((o45.eh) v0Var.getReqObj()).f342922a.A = z66Var;
                java.lang.String str = loginByMobileSendSmsUI.f73302n;
                if (str != null) {
                    eVar.f278074g = str;
                }
                java.lang.String str2 = loginByMobileSendSmsUI.f73303o;
                if (str2 != null) {
                    eVar.f278075h = str2;
                }
                gm0.j1.d().g(eVar);
                loginByMobileSendSmsUI.B = false;
            }
        }
        return true;
    }
}
