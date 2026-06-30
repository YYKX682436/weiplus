package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI */
/* loaded from: classes8.dex */
public class ActivityC19162xa40b1303 extends com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.AbstractActivityC19158x4b7e6cc1 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f262558d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f262559e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a4z;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        r45.x15 x15Var;
        this.f262559e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cut);
        byte[] byteArray = m83105x7498fe14().getByteArray("key_open_card_finish_title");
        if (byteArray != null) {
            try {
                if (byteArray.length != 0 && (x15Var = (r45.x15) new r45.x15().mo11468x92b714fd(byteArray)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x15Var.f471197e)) {
                    this.f262559e.setText(x15Var.f471197e);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletECardFinishUI", e17, "", new java.lang.Object[0]);
            }
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.g68);
        this.f262558d = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.k(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        m78499x92e71989(false);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.j(this));
        m78600x5843c740(false);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
