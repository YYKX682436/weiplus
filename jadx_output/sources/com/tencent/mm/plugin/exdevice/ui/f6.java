package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.m6 f99457d;

    public f6(com.tencent.mm.plugin.exdevice.ui.m6 m6Var) {
        this.f99457d = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.m6 m6Var = this.f99457d;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = m6Var.f99570a;
        int i17 = com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.V;
        exdeviceRankInfoUI.b7();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(m6Var.f99570a.G)) {
            m6Var.f99570a.addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_icon_dark_more, new com.tencent.mm.plugin.exdevice.ui.e6(this));
        }
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI2 = m6Var.f99570a;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankChampionInfoView exdeviceRankChampionInfoView = exdeviceRankInfoUI2.f99337h;
        if (exdeviceRankChampionInfoView != null) {
            exdeviceRankChampionInfoView.a(exdeviceRankInfoUI2.f99352z);
        }
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI3 = m6Var.f99570a;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.U6(exdeviceRankInfoUI3, exdeviceRankInfoUI3.R);
    }
}
