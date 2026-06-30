package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class k3 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.l3 f72708a;

    public k3(com.tencent.mm.plugin.aa.ui.l3 l3Var) {
        this.f72708a = l3Var;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "onLoadImageEnd() url:%s path:%s", str, str2);
        com.tencent.mm.plugin.aa.ui.l3 l3Var = this.f72708a;
        android.app.Dialog dialog = l3Var.f72720d.C1;
        if (dialog != null && dialog.isShowing()) {
            l3Var.f72720d.C1.dismiss();
        }
        if (bitmap == null) {
            dp.a.makeText(l3Var.f72720d, com.tencent.mm.R.string.f489732a5, 1).show();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("use_scene", 1);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, l3Var.f72720d.f72506l1);
        intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, l3Var.f72720d.f72522x1);
        intent.putExtra("url", l3Var.f72720d.f72512p1);
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = l3Var.f72720d;
        intent.putExtra("view_info", ym5.u6.b(launchAAUI.A, launchAAUI.getContext().getWindow().getDecorView()));
        j45.l.n(l3Var.f72720d, "aa", ".ui.AAImagPreviewUI", intent, 310);
        l3Var.f72720d.f7(14);
    }
}
