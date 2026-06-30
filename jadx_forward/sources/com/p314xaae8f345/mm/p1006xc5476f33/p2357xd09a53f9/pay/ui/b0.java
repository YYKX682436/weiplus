package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class b0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductShowInfo f260280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ViewOnClickListenerC19035xfddf7d86 f260281e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ViewOnClickListenerC19035xfddf7d86 viewOnClickListenerC19035xfddf7d86, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductShowInfo deductShowInfo) {
        super(false);
        this.f260281e = viewOnClickListenerC19035xfddf7d86;
        this.f260280d = deductShowInfo;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductShowInfo deductShowInfo = this.f260280d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayDeductUI", "click link_type: %s", java.lang.Integer.valueOf(deductShowInfo.f261269f));
        int i17 = deductShowInfo.f261269f;
        if (i17 == 1) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(deductShowInfo.f261272i)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", deductShowInfo.f261272i);
            intent.putExtra("showShare", false);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(this.f260281e.mo55332x76847179(), intent);
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            java.lang.String str = deductShowInfo.f261270g;
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f88999a = str;
            java.lang.String str2 = deductShowInfo.f261271h;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            nxVar.f89000b = str2;
            nxVar.f89002d = 1097;
            nxVar.f89001c = 0;
            c6113xa3727625.e();
        }
    }
}
