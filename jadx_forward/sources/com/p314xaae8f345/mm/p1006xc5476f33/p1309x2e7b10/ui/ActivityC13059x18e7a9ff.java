package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.card.ui.CardShowWaringTransparentUI */
/* loaded from: classes5.dex */
public class ActivityC13059x18e7a9ff extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569898rc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        db5.e1.y(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.avz, getIntent().getStringExtra("KEY_BRAND_NAME")), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572341aw0), getString(com.p314xaae8f345.mm.R.C30867xcad56011.at8), new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.i4(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            finish();
        }
        return super.onKeyUp(i17, keyEvent);
    }
}
