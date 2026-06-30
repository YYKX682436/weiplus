package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class d1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AARemittanceUI f72599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI) {
        super(false);
        this.f72599d = aARemittanceUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI = this.f72599d;
        aARemittanceUI.f72467w = com.tencent.mm.sdk.platformtools.t8.F(aARemittanceUI.f72459o.getText(), 0.0d);
        if (!aARemittanceUI.f72459o.n()) {
            com.tencent.mm.plugin.aa.ui.AARemittanceUI.i7(aARemittanceUI, aARemittanceUI.getString(com.tencent.mm.R.string.kfm));
            return;
        }
        if (aARemittanceUI.f72467w < 0.01d) {
            com.tencent.mm.plugin.aa.ui.AARemittanceUI.i7(aARemittanceUI, aARemittanceUI.getString(com.tencent.mm.R.string.hye));
            return;
        }
        aARemittanceUI.hideWcKb();
        aARemittanceUI.G = com.tencent.mm.wallet_core.ui.b2.h(aARemittanceUI, false, null);
        long j07 = com.tencent.mm.wallet_core.ui.r1.j0(aARemittanceUI.f72459o.getText(), "100");
        aARemittanceUI.D = j07;
        java.lang.String str = aARemittanceUI.f72468x;
        k61.q qVar = aARemittanceUI.H.f304521c;
        java.lang.String str2 = aARemittanceUI.F;
        qVar.getClass();
        ((km5.q) ((km5.q) km5.u.g(java.lang.Long.valueOf(j07), str, str2)).n(qVar).h(new com.tencent.mm.plugin.aa.ui.r0(aARemittanceUI))).s(new com.tencent.mm.plugin.aa.ui.n0(aARemittanceUI));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 11, 4);
    }
}
