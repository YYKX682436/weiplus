package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI */
/* loaded from: classes4.dex */
public final class ActivityC16836x55c07b92 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f235183d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f235184e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f235185f;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569745km;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        this.f235184e = getIntent().getStringExtra("extra_username");
        this.f235185f = getIntent().getStringExtra("extra_appid");
        mo54448x9c8c0d33(new hr3.z(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bbn);
        mo64405x4dab7448(mo78508x85b50c3c());
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("extra_wxa_entry_info_list");
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569744kl, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obg);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(parcelableArrayListExtra != null ? parcelableArrayListExtra.size() : 0);
        textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572262aj3, objArr));
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.cqe);
        this.f235183d = listView;
        listView.addHeaderView(inflate);
        this.f235183d.setAdapter((android.widget.ListAdapter) new hr3.c0(getLayoutInflater(), parcelableArrayListExtra));
        this.f235183d.setOnItemClickListener(new hr3.a0(this));
        m78513xc2a54588().setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a48);
    }
}
