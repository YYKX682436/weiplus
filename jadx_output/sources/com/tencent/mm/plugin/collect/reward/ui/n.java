package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class n implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96319d;

    public n(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI) {
        this.f96319d = qrRewardMainUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI = this.f96319d;
        if (itemId == 1) {
            qrRewardMainUI.A = "";
            qrRewardMainUI.X6();
            qrRewardMainUI.a7(true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14721, 1, 3);
            return;
        }
        if (itemId != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "unknown menu: %s", java.lang.Integer.valueOf(menuItem.getItemId()));
            int i18 = com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.f96227J;
            qrRewardMainUI.a7(true);
            return;
        }
        int i19 = com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.f96227J;
        qrRewardMainUI.a7(false);
        qrRewardMainUI.f96237p.setCursorVisible(true);
        qrRewardMainUI.f96237p.requestFocus();
        qrRewardMainUI.f96237p.requestFocusFromTouch();
        qrRewardMainUI.f96237p.postDelayed(new com.tencent.mm.plugin.collect.reward.ui.t(qrRewardMainUI), 200L);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14721, 1, 4);
    }
}
