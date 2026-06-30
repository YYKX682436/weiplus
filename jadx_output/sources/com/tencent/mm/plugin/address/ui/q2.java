package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.r2 f74616d;

    public q2(com.tencent.mm.plugin.address.ui.r2 r2Var) {
        this.f74616d = r2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.address.ui.r2 r2Var = this.f74616d;
        if (r2Var.f74619d.f54518h.f7628a) {
            java.lang.String str = (java.lang.String) c01.d9.b().p().l(46, null);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = (java.lang.String) c01.d9.b().p().l(72, null);
            java.lang.String str3 = str2 != null ? str2 : "";
            int i17 = com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.B;
            com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI = r2Var.f74620e;
            walletSelectAddrUI.f74494m.b(new q71.n(str, str3, walletSelectAddrUI.f74498q), true);
        }
    }
}
