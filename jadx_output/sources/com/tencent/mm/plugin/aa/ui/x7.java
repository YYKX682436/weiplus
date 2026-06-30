package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class x7 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.y7 f72891a;

    public x7(com.tencent.mm.plugin.aa.ui.y7 y7Var) {
        this.f72891a = y7Var;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "onLoadImageEnd() url:%s path:%s", str, str2);
        com.tencent.mm.plugin.aa.ui.y7 y7Var = this.f72891a;
        android.app.Dialog dialog = y7Var.f72901d.f72916c.f72549n;
        if (dialog != null && dialog.isShowing()) {
            y7Var.f72901d.f72916c.f72549n.dismiss();
        }
        if (bitmap == null) {
            dp.a.makeText(y7Var.f72901d.f72916c, com.tencent.mm.R.string.f489732a5, 1).show();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("use_scene", 2);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        intent.putExtra("url", y7Var.f72901d.f72914a.E);
        intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str2);
        com.tencent.mm.plugin.aa.ui.z7 z7Var = y7Var.f72901d;
        com.tencent.mm.view.ViewAnimHelper$ViewInfo b17 = ym5.u6.b(z7Var.f72915b, z7Var.f72916c.getContext().getWindow().getDecorView());
        android.graphics.Rect rect = b17.f213513d;
        rect.right = rect.left + i65.a.b(y7Var.f72901d.f72916c.getContext(), 30);
        rect.set(rect);
        intent.putExtra("view_info", b17);
        intent.putExtra("aa_type", y7Var.f72901d.f72916c.R);
        j45.l.n(y7Var.f72901d.f72916c, "aa", ".ui.AAImagPreviewUI", intent, 100);
    }
}
