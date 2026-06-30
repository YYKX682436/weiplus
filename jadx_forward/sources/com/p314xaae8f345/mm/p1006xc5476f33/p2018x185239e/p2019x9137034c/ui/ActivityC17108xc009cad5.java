package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI */
/* loaded from: classes9.dex */
public class ActivityC17108xc009cad5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.C17110xe48466cc f238070e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569720jx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.C17110xe48466cc c17110xe48466cc = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.C17110xe48466cc) findViewById(com.p314xaae8f345.mm.R.id.az7);
        this.f238070e = c17110xe48466cc;
        c17110xe48466cc.m79360xa1aeda28(new qw3.j1(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.aet);
        m83090x14f40144(v31.k.f77251x366c91de);
        mo43517x10010bd5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectBankUI", "do fetch data");
        ow3.g gVar = new ow3.g();
        gVar.K(this);
        m83098x5406100e(gVar);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(v31.k.f77251x366c91de);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof ow3.g)) {
            return false;
        }
        ow3.g gVar = (ow3.g) m1Var;
        gVar.O(new qw3.k1(this, gVar));
        if (gVar.f295565m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitSelectBankUI", "response error: %s, %s", java.lang.Integer.valueOf(gVar.f430941s.f464442d), gVar.f430941s.f464443e);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f430941s.f464443e)) {
                dp.a.m125854x26a183b(this, gVar.f430941s.f464443e, 1).show();
            }
        }
        if (!gVar.f295564i) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitSelectBankUI", "net error: %s", gVar);
        return false;
    }
}
