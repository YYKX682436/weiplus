package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public class e7 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72632a;

    public e7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        this.f72632a = paylistAAUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.aa.ui.PaylistAAUI.S;
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72632a;
        paylistAAUI.showCircleStWcKb();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.aa.ui.d7(paylistAAUI), 200L);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 10, java.lang.Integer.valueOf(paylistAAUI.R));
    }
}
