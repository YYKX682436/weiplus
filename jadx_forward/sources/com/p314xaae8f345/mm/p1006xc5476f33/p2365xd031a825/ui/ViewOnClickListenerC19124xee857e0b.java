package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSwitchWalletCurrencyUI */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC19124xee857e0b extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f261639d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f261640e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f9 f261641f = null;

    /* renamed from: g, reason: collision with root package name */
    public at4.j1 f261642g;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d8j;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f261639d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mq_);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f9 f9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f9(this, this.f261640e);
        this.f261641f = f9Var;
        this.f261639d.setAdapter((android.widget.ListAdapter) f9Var);
        java.util.ArrayList arrayList = this.f261640e;
        if (arrayList != null && arrayList.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f9 f9Var2 = this.f261641f;
            f9Var2.f261808d = this.f261640e;
            f9Var2.notifyDataSetChanged();
        }
        this.f261639d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c9(this));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletSwitchWalletCurrencyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletSwitchWalletCurrencyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.l09);
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN, java.lang.Boolean.TRUE);
        getIntent().getIntExtra("switch_wallet_scene", 0);
        java.util.ArrayList y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).ij().y0();
        this.f261640e = y07;
        if (y07 == null || y07.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "not data cache,do NetSceneQueryUserWallet");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "doGetAllWalletType isShowProcess = true");
            m83099x5406100e(new ss4.r(), true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "use cache data first, and do NetSceneQueryUserWallet for update cache");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "doGetAllWalletType isShowProcess = false");
            m83099x5406100e(new ss4.r(), false);
        }
        mo43517x10010bd5();
        setResult(0);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ss4.r) {
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSwitchWalletCurrencyUI", "NetSceneQueryUserWallet error");
                if (this.f261640e == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSwitchWalletCurrencyUI", "wallet list is null in cache");
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSwitchWalletCurrencyUI", "use cache wallet list data");
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "NetSceneQueryUserWallet succ and update view");
            java.util.ArrayList y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).ij().y0();
            this.f261640e = y07;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f9 f9Var = this.f261641f;
            f9Var.f261808d = y07;
            f9Var.notifyDataSetChanged();
            return true;
        }
        if (!(m1Var instanceof ss4.v) || i17 != 0 || i18 != 0) {
            return false;
        }
        this.f261642g.f66181x43bffadc = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "set user wallet succ. current wallet type = " + this.f261642g.f66184x3bf8dffb + " " + this.f261642g.f66183x619dc1d0);
        ((kt.u0) ((lt.s0) i95.n0.c(lt.s0.class))).wi();
        ((pg0.a3) i95.n0.c(pg0.a3.class)).ij().mo9952xce0038c9(this.f261642g, new java.lang.String[0]);
        at4.j1 j1Var = this.f261641f.f261810f;
        if (j1Var != null) {
            j1Var.f66181x43bffadc = 0;
            ((pg0.a3) i95.n0.c(pg0.a3.class)).ij().mo9952xce0038c9(j1Var, new java.lang.String[0]);
        }
        gm0.j1.i();
        gm0.j1.u().c().w(339975, java.lang.Integer.valueOf(this.f261642g.f66184x3bf8dffb));
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, java.lang.Integer.valueOf(this.f261642g.f66183x619dc1d0));
        c01.je.m(this.f261642g.f66183x619dc1d0);
        ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
        xp1.d.f();
        if (c01.z1.z()) {
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Di(this, null);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("is_switch_wallet", 1);
        setResult(-1, intent);
        finish();
        return true;
    }
}
