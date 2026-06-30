package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class r7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.s7 f72792d;

    public r7(com.tencent.mm.plugin.aa.ui.s7 s7Var) {
        this.f72792d = s7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72792d.f72803d.f72817e;
        int i18 = com.tencent.mm.plugin.aa.ui.PaylistAAUI.S;
        paylistAAUI.hideLoading();
        android.app.Dialog dialog = paylistAAUI.f72549n;
        if (dialog != null && dialog.isShowing()) {
            paylistAAUI.f72549n.dismiss();
        }
        if (paylistAAUI.f72549n == null) {
            paylistAAUI.f72549n = db5.e1.O(paylistAAUI, null, 3, com.tencent.mm.R.style.f494256i6, paylistAAUI.getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.aa.ui.t6(paylistAAUI));
        }
        k61.r rVar = paylistAAUI.f72545g.f304524f;
        rVar.getClass();
        ((km5.q) ((km5.q) km5.u.d()).n(rVar).h(new com.tencent.mm.plugin.aa.ui.v6(paylistAAUI))).s(new com.tencent.mm.plugin.aa.ui.u6(paylistAAUI));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 6, java.lang.Integer.valueOf(paylistAAUI.R));
    }
}
