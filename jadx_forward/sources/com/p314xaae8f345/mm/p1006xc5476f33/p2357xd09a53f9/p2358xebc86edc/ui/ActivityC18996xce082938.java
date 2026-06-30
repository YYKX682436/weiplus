package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI */
/* loaded from: classes9.dex */
public class ActivityC18996xce082938 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f259296d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f259297e = "";

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f f259298f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f259299g;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18996xce082938.U6():void");
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
        this.f259296d = m83105x7498fe14().getString("key_pwd_cash_title");
        this.f259297e = m83105x7498fe14().getString("key_pwd_cash_money");
        this.f259299g = m83105x7498fe14().getString("key_report_session_id");
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f259297e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        java.lang.String str2 = this.f259296d;
        objArr[1] = str2 != null ? str2 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchPwdInputUI", "hy: money : %s, title : %s", objArr);
        if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f259296d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f259297e)) ? false : true)) {
            db5.e1.m(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.ks_, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.a(this));
        } else {
            w04.l.INSTANCE.ae();
            U6();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, np5.f
    /* renamed from: onSceneEnd */
    public void mo66167x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        super.mo66167x76e0bfae(i17, i18, str, m1Var, z17);
        if (m1Var instanceof as4.b) {
            m83124xb22b7187(false);
        }
    }
}
