package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class w6 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72876a;

    public w6(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        this.f72876a = paylistAAUI;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72876a;
        paylistAAUI.hideLoading();
        if (!(obj instanceof java.lang.String) || obj.toString().equalsIgnoreCase("ok")) {
            com.tencent.mm.plugin.aa.ui.PaylistAAUI.i7(paylistAAUI, paylistAAUI.getContext().getString(com.tencent.mm.R.string.k4d));
        } else {
            com.tencent.mm.plugin.aa.ui.PaylistAAUI.i7(paylistAAUI, obj.toString());
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Aa.PaylistAAUI", "urgeAAPay fail");
    }
}
