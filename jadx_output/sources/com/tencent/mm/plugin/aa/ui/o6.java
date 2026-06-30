package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class o6 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        super(false);
        this.f72760d = paylistAAUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "click mInstantPayBtn");
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72760d;
        long j17 = paylistAAUI.Q;
        paylistAAUI.f72548m = com.tencent.mm.wallet_core.ui.b2.h(paylistAAUI, false, null);
        double F = com.tencent.mm.sdk.platformtools.t8.F(paylistAAUI.f72556u.getText().toString(), 0.0d);
        k61.q qVar = paylistAAUI.f72545g.f304521c;
        java.lang.String str = paylistAAUI.f72561z;
        java.lang.String str2 = paylistAAUI.A;
        qVar.getClass();
        ((km5.q) ((km5.q) km5.u.g(java.lang.Long.valueOf(j17), str, str2)).n(qVar).h(new com.tencent.mm.plugin.aa.ui.s6(paylistAAUI))).s(new com.tencent.mm.plugin.aa.ui.q6(paylistAAUI));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(13721, 4, 9, java.lang.Integer.valueOf(paylistAAUI.R));
        g0Var.d(13723, 3, java.lang.Integer.valueOf(h61.o.i(paylistAAUI.I).size()), java.lang.Integer.valueOf(paylistAAUI.M), java.lang.Double.valueOf(F * 100.0d), paylistAAUI.L);
    }
}
