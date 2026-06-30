package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.DisasterUI */
/* loaded from: classes.dex */
public class ActivityC11402x33c6c555 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a4g;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: needShowIdcError */
    public boolean mo48676x712cd213() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("key_disaster_content");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_disaster_url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DisasterUI", "summerdiz onCreate :%d, content[%s], url[%s]", java.lang.Integer.valueOf(hashCode()), stringExtra, stringExtra2);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kgh)).setText(stringExtra);
        findViewById(com.p314xaae8f345.mm.R.id.kgd).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g1(this, stringExtra2));
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bq6));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.h1(this));
    }
}
