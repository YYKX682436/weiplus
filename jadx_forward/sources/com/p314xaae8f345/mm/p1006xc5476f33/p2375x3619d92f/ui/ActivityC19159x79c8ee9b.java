package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

/* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI */
/* loaded from: classes9.dex */
public class ActivityC19159x79c8ee9b extends com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.AbstractActivityC19158x4b7e6cc1 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f262542o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f262543d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f262544e;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.e f262546g;

    /* renamed from: h, reason: collision with root package name */
    public int f262547h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f262545f = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f262548i = true;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2802xd031a825.g f262549m = new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.b(this);

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f262550n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI.3
        {
            this.f39173x3fe91575 = 572563856;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b80) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b802 = c5663xbbd89b80;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardBindCardListUI", "KindaBindCardEvent callback");
            if (c5663xbbd89b802 == null) {
                return false;
            }
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b activityC19159x79c8ee9b = com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b.this;
            am.di diVar = c5663xbbd89b802.f135987g;
            if (diVar != null) {
                if (diVar.f87986a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardBindCardListUI", "KindaBindCardEvent bindCard Succ");
                    r45.od odVar = new r45.od();
                    odVar.f463688e = diVar.f87990e;
                    java.lang.String str = diVar.f87988c;
                    odVar.f463692i = str;
                    odVar.f463690g = diVar.f87991f;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(odVar.f463688e) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(odVar.f463690g)) {
                        activityC19159x79c8ee9b.m83106x57340563().d(odVar);
                    }
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b.f262542o;
                    activityC19159x79c8ee9b.V6();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardBindCardListUI", "KindaBindCardEvent bindCard Cancel");
                }
                activityC19159x79c8ee9b.f262548i = false;
            }
            activityC19159x79c8ee9b.f262550n.mo48814x2efc64();
            return true;
        }
    };

    public void U6() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.f262547h == 3) {
            bundle.putInt("key_bind_scene", 18);
        } else {
            bundle.putInt("key_bind_scene", 19);
        }
        boolean z17 = true;
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putBoolean("key_is_bind_bankcard", true);
        bundle.putString("key_pwd1", m83105x7498fe14().getString("key_pwd1"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardBindCardListUI", "start bind card, scene: %s", java.lang.Integer.valueOf(this.f262547h));
        if (com.p314xaae8f345.mm.p2802xd031a825.b.a().b()) {
            this.f262550n.mo48813x58998cd();
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, bundle.getInt("key_bind_scene"));
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(bundle.getInt("key_bind_scene"));
            ((h45.q) i95.n0.c(h45.q.class)).mo24800xa4a1f2e8(this, bundle);
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.a.j(this, kt4.a.class, bundle, this.f262549m);
    }

    public final void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardBindCardListUI", "load Data");
        m83096xe7b1ccf7(new jt4.j("WEB_DEBIT", this.f262547h));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a4t;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f262543d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.afl);
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a4u, (android.view.ViewGroup) this.f262543d, false);
        this.f262544e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d5r);
        this.f262543d.addHeaderView(inflate, null, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.e(this, null);
        this.f262546g = eVar;
        this.f262543d.setAdapter((android.widget.ListAdapter) eVar);
        this.f262543d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.a(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        this.f39904x9eeebfc.c(1988);
        int i17 = m83105x7498fe14().getInt("key_open_scene", 2);
        this.f262547h = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardBindCardListUI", "openScene: %d", java.lang.Integer.valueOf(i17));
        mo54450xbf7c1df6("");
        mo43517x10010bd5();
        this.f262548i = true;
        V6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f39904x9eeebfc.i(1988);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof jt4.j)) {
            return false;
        }
        jt4.j jVar = (jt4.j) m1Var;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletECardBindCardListUI", "net error: %s", jVar);
            db5.e1.F(mo55332x76847179(), jt4.f.a(mo55332x76847179(), str), "", false);
            return true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f383197f.f460992f)) {
            this.f262544e.setText(jVar.f383197f.f460992f);
        }
        r45.lg5 lg5Var = jVar.f383197f;
        if (lg5Var.f460990d != 0) {
            if (jt4.f.c(this, lg5Var.f460994h)) {
                return true;
            }
            db5.e1.F(mo55332x76847179(), jt4.f.a(mo55332x76847179(), jVar.f383197f.f460991e, str), "", false);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardBindCardListUI", "banklist: %s", java.lang.Integer.valueOf(lg5Var.f460993g.size()));
        java.lang.String str2 = jVar.f383197f.f460995i;
        m83105x7498fe14().putString("key_true_name", jVar.f383197f.f460995i);
        if (jVar.f383197f.f460993g.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardBindCardListUI", "no bind card, isGotoBindCardAfterNoBindCard: %s", java.lang.Boolean.valueOf(this.f262548i));
            if (!this.f262548i) {
                return true;
            }
            U6();
            return true;
        }
        java.util.List list = this.f262545f;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(jVar.f383197f.f460993g);
        this.f262546g.notifyDataSetChanged();
        return true;
    }
}
