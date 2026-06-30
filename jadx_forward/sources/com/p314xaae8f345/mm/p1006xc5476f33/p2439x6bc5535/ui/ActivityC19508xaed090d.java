package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.webwx.ui.WebWXUnlockUI */
/* loaded from: classes5.dex */
public class ActivityC19508xaed090d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a_p;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        if (getIntent() != null) {
            java.lang.String stringExtra = getIntent().getStringExtra("deviceName");
            int intExtra = getIntent().getIntExtra("lockDevice", 0);
            java.lang.String stringExtra2 = getIntent().getStringExtra("uuid");
            java.lang.String stringExtra3 = getIntent().getStringExtra("unlockTitle");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f565607cx1);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568178m00);
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lzq);
            if (stringExtra3 != null) {
                textView.setText(stringExtra3);
            } else if (intExtra == 2 || intExtra == 37) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f78895x45d5f1c1);
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l87);
            } else if (intExtra == 1 || intExtra == 38) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f78893x5addca6f);
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l86);
            } else {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f78895x45d5f1c1);
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.n3m);
            }
            android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oso);
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.vk9);
            com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.n0 n0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.n0(this, textView3, intExtra, stringExtra2);
            textView3.setOnClickListener(n0Var);
            findViewById.setOnClickListener(n0Var);
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575210l85, stringExtra.trim()));
        }
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.l0(this), com.p314xaae8f345.mm.R.raw.f78350xe9269a14);
    }
}
