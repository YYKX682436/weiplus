package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class i0 implements qp5.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AARemittanceUI f72679b;

    public i0(com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI, int i17) {
        this.f72679b = aARemittanceUI;
        this.f72678a = i17;
    }

    @Override // qp5.k0
    public void a(java.lang.CharSequence charSequence) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int i17 = this.f72678a;
        boolean z18 = i17 == 0;
        com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI = this.f72679b;
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AARemittanceUI", "mAmountRemindBit == 0");
            aARemittanceUI.f72462r.setVisibility(8);
            return;
        }
        long longValue = new java.lang.Double(com.tencent.mm.sdk.platformtools.t8.F(charSequence.toString(), 0.0d)).longValue();
        int i18 = 0;
        int i19 = 0;
        while (longValue != 0) {
            int i27 = (int) (longValue % 10);
            longValue /= 10;
            i18++;
            i19 = i27;
        }
        if (i18 < i17) {
            aARemittanceUI.f72462r.setVisibility(8);
            return;
        }
        int k17 = aARemittanceUI.f72459o.k(charSequence, aARemittanceUI.f72454g, i19);
        if (k17 == 0) {
            aARemittanceUI.f72462r.setVisibility(8);
            return;
        }
        aARemittanceUI.f72462r.setVisibility(0);
        aARemittanceUI.f72461q.setText(com.tencent.mm.wallet_core.model.b2.a(i18));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) aARemittanceUI.f72460p.getLayoutParams();
        layoutParams.leftMargin = k17;
        aARemittanceUI.f72460p.setLayoutParams(layoutParams);
    }
}
