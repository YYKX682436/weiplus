package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class n6 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72749d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        super(false);
        this.f72749d = paylistAAUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "click mInstantPayBtn ForCustomize");
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72749d;
        android.content.Intent intent = paylistAAUI.getIntent();
        intent.putExtra("user_name", paylistAAUI.f72544J);
        intent.putExtra("user_real_name", paylistAAUI.K);
        intent.putExtra("user_group_solitatire_content", paylistAAUI.A);
        j45.l.n(paylistAAUI, "aa", ".ui.AARemittanceUI", intent, 234);
    }
}
