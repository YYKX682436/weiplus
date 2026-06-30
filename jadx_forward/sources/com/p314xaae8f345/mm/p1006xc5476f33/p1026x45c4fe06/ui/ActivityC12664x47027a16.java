package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandRedirectUI */
/* loaded from: classes5.dex */
public class ActivityC12664x47027a16 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public int f170938d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f170939e = false;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        u11.a a17;
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.v9.e(getWindow());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandRedirectUI", "onCreate");
        setResult(0);
        if (getIntent().getIntExtra("key_from_scene", -1) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppBrandRedirectUI", "from scene is illegal, finish activity");
            finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandRedirectUI", "start to bind phone number");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this, "com.tencent.mm.plugin.account.bind.ui.BindMContactUI");
        intent.putExtra("WizardRootClass", getClass().getName());
        intent.putExtra("bind_scene", 5);
        java.lang.String simCountryIso = ((android.telephony.TelephonyManager) mo55332x76847179().getSystemService("phone")).getSimCountryIso();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(simCountryIso) && (a17 = u11.b.a(simCountryIso)) != null) {
            intent.putExtra("country_name", a17.f505262c);
            intent.putExtra("couttry_code", a17.f505261b);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(this, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppBrandRedirectUI", "onKeyDown KEYCODE_BACK, result cancel, finishUI");
            setResult(0);
            finish();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandRedirectUI", "onNewIntent");
        super.onNewIntent(intent);
        if (intent != null) {
            int intExtra = intent.getIntExtra("wizard_activity_result_code", 0);
            this.f170938d = intExtra;
            setResult(intExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandRedirectUI", "result:%d, finish activity", java.lang.Integer.valueOf(this.f170938d));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandRedirectUI", "intent is null");
            setResult(0);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandRedirectUI", "onResume");
        if (!this.f170939e) {
            this.f170939e = true;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandRedirectUI", "onResume, RESULT_CANCELED  finish activity");
        setResult(0);
        finish();
    }
}
