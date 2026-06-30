package com.tencent.mm.plugin.appbrand.ui;

@db5.a(7)
/* loaded from: classes5.dex */
public class AppBrandRedirectUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public int f89405d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f89406e = false;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        u11.a a17;
        super.onCreate(bundle);
        com.tencent.mm.ui.v9.e(getWindow());
        com.tencent.mars.xlog.Log.i("AppBrandRedirectUI", "onCreate");
        setResult(0);
        if (getIntent().getIntExtra("key_from_scene", -1) != 0) {
            com.tencent.mars.xlog.Log.e("AppBrandRedirectUI", "from scene is illegal, finish activity");
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("AppBrandRedirectUI", "start to bind phone number");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this, "com.tencent.mm.plugin.account.bind.ui.BindMContactUI");
        intent.putExtra("WizardRootClass", getClass().getName());
        intent.putExtra("bind_scene", 5);
        java.lang.String simCountryIso = ((android.telephony.TelephonyManager) getContext().getSystemService("phone")).getSimCountryIso();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(simCountryIso) && (a17 = u11.b.a(simCountryIso)) != null) {
            intent.putExtra("country_name", a17.f423729c);
            intent.putExtra("couttry_code", a17.f423728b);
        }
        com.tencent.mm.ui.MMWizardActivity.X6(this, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.e("AppBrandRedirectUI", "onKeyDown KEYCODE_BACK, result cancel, finishUI");
            setResult(0);
            finish();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("AppBrandRedirectUI", "onNewIntent");
        super.onNewIntent(intent);
        if (intent != null) {
            int intExtra = intent.getIntExtra("wizard_activity_result_code", 0);
            this.f89405d = intExtra;
            setResult(intExtra);
            com.tencent.mars.xlog.Log.i("AppBrandRedirectUI", "result:%d, finish activity", java.lang.Integer.valueOf(this.f89405d));
        } else {
            com.tencent.mars.xlog.Log.i("AppBrandRedirectUI", "intent is null");
            setResult(0);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("AppBrandRedirectUI", "onResume");
        if (!this.f89406e) {
            this.f89406e = true;
            return;
        }
        com.tencent.mars.xlog.Log.i("AppBrandRedirectUI", "onResume, RESULT_CANCELED  finish activity");
        setResult(0);
        finish();
    }
}
