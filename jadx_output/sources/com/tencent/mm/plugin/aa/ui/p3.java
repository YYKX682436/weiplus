package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class p3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        super(false);
        this.f72767d = launchAAUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("use_scene", 1);
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72767d;
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, launchAAUI.f72506l1);
        intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, launchAAUI.f72522x1);
        intent.putExtra("url", launchAAUI.f72512p1);
        intent.putExtra("view_info", ym5.u6.b(launchAAUI.A, launchAAUI.getContext().getWindow().getDecorView()));
        j45.l.n(launchAAUI, "aa", ".ui.AAImagPreviewUI", intent, 310);
    }
}
