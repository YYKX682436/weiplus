package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes.dex */
public class p6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99621d;

    public p6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99621d = exdeviceRankInfoUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        int b17 = com.tencent.mars.xlog.Log.getLogLevel() == 0 ? 2 : ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("WeRunLaunchGroupRankWeAppSwitch", 0);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99621d;
        if (b17 == 2) {
            g4Var.g(3, exdeviceRankInfoUI.getString(com.tencent.mm.R.string.f491147c45), com.tencent.mm.R.raw.bottomsheet_icon_transmit);
        }
        g4Var.g(0, exdeviceRankInfoUI.getString(com.tencent.mm.R.string.f491146c44), com.tencent.mm.R.raw.bottomsheet_icon_transmit);
        g4Var.g(1, exdeviceRankInfoUI.getString(com.tencent.mm.R.string.f491148c46), com.tencent.mm.R.raw.bottomsheet_icon_moment);
        g4Var.g(2, exdeviceRankInfoUI.getString(com.tencent.mm.R.string.f491145c43), com.tencent.mm.R.raw.bottomsheet_icon_donate);
    }
}
