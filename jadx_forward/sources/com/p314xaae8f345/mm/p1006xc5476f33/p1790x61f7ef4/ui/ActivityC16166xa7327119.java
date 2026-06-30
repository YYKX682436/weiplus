package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui;

@db5.a(m123858x6ac9171 = 1024)
/* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelBaseUI */
/* loaded from: classes11.dex */
public class ActivityC16166xa7327119 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f224744d;

    public void U6(java.lang.String str) {
        this.f224744d = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), str, true, true, new f93.v0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return 0;
    }

    /* renamed from: hideLoading */
    public void m65194xce38d9a() {
        android.app.ProgressDialog progressDialog = this.f224744d;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f224744d.dismiss();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo78578x8b18f126(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        mo78578x8b18f126(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
    }
}
