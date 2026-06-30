package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class u6 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72836a;

    public u6(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        this.f72836a = paylistAAUI;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "close pay list failed: %s", obj);
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72836a;
        paylistAAUI.hideLoading();
        android.app.Dialog dialog = paylistAAUI.f72549n;
        if (dialog != null && dialog.isShowing()) {
            paylistAAUI.f72549n.dismiss();
        }
        if (obj instanceof java.lang.String) {
            dp.a.makeText(paylistAAUI, obj.toString(), 1).show();
        } else {
            dp.a.makeText(paylistAAUI, com.tencent.mm.R.string.b9b, 1).show();
        }
    }
}
