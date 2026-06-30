package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class v2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f234274g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.x2 f234275h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.x2 x2Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        super(context);
        this.f234275h = x2Var;
        this.f234274g = c19091x9511676c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f234274g;
        java.lang.String str = c19091x9511676c.f69241x935a0ea9;
        boolean z07 = c19091x9511676c.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.x2 x2Var = this.f234275h;
        if (!z07 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "go to url %s", str);
            intent.putExtra("rawUrl", str);
            intent.putExtra("geta8key_username", c01.z1.r());
            intent.putExtra("pay_channel", 1);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(x2Var.f234294e.mo55332x76847179(), intent);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "goto appbrand");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        java.lang.String str2 = c19091x9511676c.f261110p3;
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f88999a = str2;
        nxVar.f89000b = c19091x9511676c.f261111q3;
        nxVar.f89002d = 1137;
        nxVar.f89001c = 0;
        c6113xa3727625.e();
        am.ox oxVar = c6113xa3727625.f136391h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "goto appbrand result:%s", java.lang.Boolean.valueOf(oxVar.f89114a));
        if (!oxVar.f89114a) {
            x2Var.f234294e.G1 = 0;
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = x2Var.f234294e;
        activityC16764xd1ab6b38.G1 = 1;
        activityC16764xd1ab6b38.H1.c();
    }
}
