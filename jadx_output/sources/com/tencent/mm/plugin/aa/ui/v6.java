package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class v6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72856a;

    public v6(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        this.f72856a = paylistAAUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "close pay list success: %s", (java.lang.Boolean) obj);
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72856a;
        paylistAAUI.hideLoading();
        android.app.Dialog dialog = paylistAAUI.f72549n;
        if (dialog != null && dialog.isShowing()) {
            paylistAAUI.f72549n.dismiss();
        }
        paylistAAUI.f72544J = null;
        paylistAAUI.k7();
        paylistAAUI.removeAllOptionMenu();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("close_aa", true);
        intent.putExtra("item_position", paylistAAUI.getIntent().getIntExtra("item_position", 0));
        intent.putExtra("item_offset", paylistAAUI.getIntent().getIntExtra("item_offset", 0));
        paylistAAUI.setResult(-1, intent);
        return null;
    }
}
