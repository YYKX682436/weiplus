package com.p314xaae8f345.mm.ui.p2741x4c58d2b0;

/* renamed from: com.tencent.mm.ui.transmit.SelectNoSupportUI */
/* loaded from: classes.dex */
public class ActivityC22572xa3a5cb26 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f292548d = "friend";

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f292549e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f292550f;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c1e;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ig8));
        this.f292549e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kcs);
        this.f292550f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kcr);
        this.f292549e.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ige));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f292548d)) {
            java.lang.String str = this.f292548d;
            str.getClass();
            if (str.equals("friend")) {
                this.f292550f.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.igf));
            } else if (str.equals("sns")) {
                this.f292550f.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.igg));
            }
        }
        mo54448x9c8c0d33(new dk5.n4(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectNoSupportUI", "onCreate!");
        this.f292548d = getIntent().getStringExtra("sharePictureTo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectNoSupportUI", "initData done!");
        mo43517x10010bd5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectNoSupportUI", "initView done!");
    }
}
