package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtCheckPwdInputDialogUI */
/* loaded from: classes9.dex */
public class ActivityC19012xd0c85d9b extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f259480d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f259481e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f259482f;

    public final void U6() {
        this.f259481e = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.f259481e, 0.0d));
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("sp_name", this.f259480d);
        m27539xaf65a0fc.mo27566xe4673800(ya.b.f77496x48db929, this.f259481e);
        ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("verifyPwdPay", m27539xaf65a0fc, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.h0(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: cleanUiData */
    public void mo65144xd0a01007(int i17) {
        if (i17 == 0) {
            finish();
        } else if (i17 == 1) {
            U6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo67598xf0aced2e(4);
        this.f259480d = getIntent().getStringExtra("lqt_fetch_pwd_title");
        this.f259481e = getIntent().getStringExtra("lqt_fetch_pwd_money");
        java.lang.String stringExtra = getIntent().getStringExtra("lqt_redeem_listid");
        this.f259482f = stringExtra;
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str = this.f259481e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        java.lang.String str2 = this.f259480d;
        objArr[1] = str2 != null ? str2 : "";
        objArr[2] = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtCheckPwdInputDialogUI", "hy: money : %s, title : %s, redeemListId: %s", objArr);
        if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f259480d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f259481e)) ? false : true)) {
            db5.e1.m(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.ks_, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.g0(this));
            return;
        }
        getWindow().setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        w04.l.INSTANCE.ae();
        U6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
