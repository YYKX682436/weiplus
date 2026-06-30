package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class x6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72890a;

    public x6(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        this.f72890a = paylistAAUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72890a;
        paylistAAUI.hideLoading();
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "urgeAAPay success");
            com.tencent.mm.plugin.aa.ui.PaylistAAUI.i7(paylistAAUI, paylistAAUI.getContext().getString(com.tencent.mm.R.string.k4e));
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "urgeAAPay fail");
        com.tencent.mm.plugin.aa.ui.PaylistAAUI.i7(paylistAAUI, paylistAAUI.getContext().getString(com.tencent.mm.R.string.k4d));
        return null;
    }
}
