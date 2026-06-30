package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class l3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        super(false);
        this.f72720d = launchAAUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72720d;
        if (launchAAUI.C1 == null) {
            launchAAUI.C1 = db5.e1.O(launchAAUI, null, 3, com.tencent.mm.R.style.f494256i6, launchAAUI.getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.aa.ui.j3(this));
        }
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI2 = this.f72720d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(launchAAUI2.f72512p1)) {
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(launchAAUI2.f72512p1, new com.tencent.mm.plugin.aa.ui.k3(this));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "imageUrl == null");
        android.app.Dialog dialog = launchAAUI2.C1;
        if (dialog != null && dialog.isShowing()) {
            launchAAUI2.C1.dismiss();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("use_scene", 1);
        launchAAUI2.f72506l1 = 2;
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, launchAAUI2.f72522x1);
        intent.putExtra("view_info", ym5.u6.b(launchAAUI2.A, launchAAUI2.getContext().getWindow().getDecorView()));
        j45.l.n(launchAAUI2, "aa", ".ui.AAImagPreviewUI", intent, 310);
        launchAAUI2.f7(14);
    }
}
