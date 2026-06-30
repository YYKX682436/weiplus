package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class yg implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f74348d;

    public yg(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI) {
        this.f74348d = regSetInfoUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f74348d;
        java.lang.String trim = regSetInfoUI.f73630e.getText().toString().trim();
        java.lang.String trim2 = regSetInfoUI.f73629d.getText().toString().trim();
        if (com.tencent.mm.sdk.platformtools.t8.K0(trim) && !com.tencent.mm.sdk.platformtools.t8.K0(trim2)) {
            if (trim2.length() <= 5) {
                str = trim2;
                str2 = (com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.sdk.platformtools.t8.K0(trim2)) ? str : trim2;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && regSetInfoUI.X6() && regSetInfoUI.Z6()) {
                    int V6 = regSetInfoUI.V6();
                    java.lang.String U6 = regSetInfoUI.U6();
                    gm0.j1.d().a(com.tencent.wxmm.v2helper.EMethodSetIosMicAbCheckOff, regSetInfoUI);
                    gm0.j1.d().g(new r61.m1(U6, regSetInfoUI.f73637o, V6, str2, str, "", ""));
                    regSetInfoUI.B.setVisibility(0);
                }
                return false;
            }
            trim = trim2.substring(0, 5);
        }
        str = trim;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            int V62 = regSetInfoUI.V6();
            java.lang.String U62 = regSetInfoUI.U6();
            gm0.j1.d().a(com.tencent.wxmm.v2helper.EMethodSetIosMicAbCheckOff, regSetInfoUI);
            gm0.j1.d().g(new r61.m1(U62, regSetInfoUI.f73637o, V62, str2, str, "", ""));
            regSetInfoUI.B.setVisibility(0);
        }
        return false;
    }
}
