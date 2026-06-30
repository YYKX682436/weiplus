package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class n5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f74057d;

    public n5(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        this.f74057d = loginHistoryUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.size() == 0) {
            g4Var.a(com.tencent.liteav.TXLiteAVCode.WARNING_MICROPHONE_HOWLING_DETECTED, com.tencent.mm.R.string.ghr);
            g4Var.a(7012, com.tencent.mm.R.string.f492406gi3);
            if (!com.tencent.mm.ui.bk.A()) {
                g4Var.a(7003, com.tencent.mm.R.string.o7r);
            }
            g4Var.a(7004, com.tencent.mm.R.string.l8m);
            if (!com.tencent.mm.sdk.platformtools.m2.m()) {
                g4Var.a(7009, com.tencent.mm.R.string.l8j);
            }
            g4Var.a(7010, com.tencent.mm.R.string.lsd);
        }
        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = this.f74057d;
        if ((loginHistoryUI instanceof com.tencent.mm.plugin.account.ui.LoginPasswordUI) || (loginHistoryUI instanceof com.tencent.mm.plugin.account.ui.LoginSmsUI)) {
            int i17 = com.tencent.mm.plugin.account.ui.LoginHistoryUI.f73323y0;
            loginHistoryUI.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_actionsheet", "view_exp", loginHistoryUI.W, 34575);
        }
    }
}
