package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI */
/* loaded from: classes5.dex */
public class ActivityC19005x4edeb3b8 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f259386d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.i2 f259387e;

    /* renamed from: f, reason: collision with root package name */
    public int f259388f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f259389g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f259390h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f259391i = -1;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f259392m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f259393n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f259394o;

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: checkProcLife */
    public boolean mo66577x53f7ec9a() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d88;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c;
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kfr);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.f2(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569210pf0);
        int i17 = this.f259388f;
        if (i17 == 0) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kzj);
        } else if (i17 == 1) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kzk);
        }
        this.f259386d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.pao);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.i2 i2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.i2(this);
        this.f259387e = i2Var;
        this.f259386d.setAdapter((android.widget.ListAdapter) i2Var);
        this.f259386d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.g2(this));
        java.util.ArrayList arrayList = this.f259390h;
        arrayList.clear();
        this.f259394o = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfj);
        if (this.f259388f == 0) {
            at4.x1 Ai = vr4.f1.wi().Ai();
            java.util.ArrayList j17 = Ai.j();
            this.f259392m = j17;
            int i18 = 0;
            this.f259393n = Ai.k(j17, null, false, true);
            at4.f fVar = Ai.f95535k;
            if (fVar != null) {
                this.f259389g = fVar.f95368c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSelectBankcardModeUI", "is_show_charge is " + this.f259389g);
            } else {
                this.f259389g = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSelectBankcardModeUI", "userInfo.getBalanceFetchInfo() is null");
            }
            java.util.ArrayList arrayList2 = this.f259392m;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectBankcardModeUI", "hy: no bankcard show new only");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectBankcardModeUI", "mBankcardList size is " + this.f259392m.size());
                java.util.Iterator it = this.f259392m.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.h2(null);
                    h2Var.f259432a = c19091x9511676c2.f69233x225aa2b6;
                    if (c19091x9511676c2.f69238xe5669181 <= 0.0d || this.f259389g != 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectBankcardModeUI", "the bank " + c19091x9511676c2.f69233x225aa2b6 + " field_fetch_charge_rate is " + c19091x9511676c2.f69238xe5669181 + " is_show_charge is " + this.f259389g);
                    } else if (android.text.TextUtils.isEmpty(c19091x9511676c2.f69237xe562a94f)) {
                        h2Var.f259433b = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kel) + "" + (c19091x9511676c2.f69238xe5669181 * 100.0d) + "%";
                    } else {
                        h2Var.f259433b = c19091x9511676c2.f69237xe562a94f;
                    }
                    arrayList.add(h2Var);
                    if (this.f259391i == -1 && (c19091x9511676c = this.f259393n) != null && c19091x9511676c.equals(c19091x9511676c2)) {
                        this.f259391i = i18;
                    }
                    i18++;
                }
                if (this.f259391i == -1 && this.f259393n == null) {
                    this.f259391i = i18;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.h2 h2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.h2(null);
            h2Var2.f259432a = this.f259394o;
            h2Var2.f259433b = "";
            arrayList.add(h2Var2);
        }
        this.f259387e.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        this.f259388f = getIntent().getIntExtra("key_scene_select_bankcard_mode_ui", 0);
        this.f259391i = getIntent().getIntExtra("key_select_index", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectBankcardModeUI", "onCreate() mFromScene is " + this.f259388f);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            setResult(0);
            finish();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
