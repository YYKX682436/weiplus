package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI */
/* loaded from: classes.dex */
public class ActivityC16129xb3d75601 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f224080d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f224081e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bll;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f224080d = getIntent().getStringExtra("IPCallAllRecordUI_phoneNumber");
        this.f224081e = getIntent().getStringExtra("IPCallAllRecordUI_contactId");
        getIntent().getBooleanExtra("IPCallAllRecordUI_isSinglePhoneNumber", false);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g4j);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.r0(this));
        ((android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f564475sg)).setAdapter((android.widget.ListAdapter) new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.t0(this, this));
    }
}
