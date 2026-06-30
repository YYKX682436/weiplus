package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

/* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI */
/* loaded from: classes9.dex */
public class ActivityC19161x50d3ecde extends com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.AbstractActivityC19158x4b7e6cc1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f262556d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c f262557e;

    public final void U6() {
        if (this.f262557e == null) {
            this.f262557e = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262557e.f261181e)) {
            this.f262556d.m83213x765074af("");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262557e.f261193t)) {
            this.f262556d.m83213x765074af(this.f262557e.f261181e + " " + this.f262557e.f261193t);
            return;
        }
        if (2 == this.f262557e.f261191r) {
            this.f262556d.m83213x765074af(this.f262557e.f261181e + " " + getString(com.p314xaae8f345.mm.R.C30867xcad56011.kki));
            return;
        }
        this.f262556d.m83213x765074af(this.f262557e.f261181e + " " + getString(com.p314xaae8f345.mm.R.C30867xcad56011.kl8));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a4y;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.pbk);
        this.f262556d = viewOnFocusChangeListenerC22907xe18534c2;
        viewOnFocusChangeListenerC22907xe18534c2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.h(this));
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.i(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardElementInputUI", "onAcvityResult requestCode:" + i17);
        if (i18 != -1) {
            return;
        }
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
        } else {
            this.f262557e = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) intent.getParcelableExtra("elemt_query");
            U6();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bt9);
        mo43517x10010bd5();
        U6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
