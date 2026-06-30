package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class RegByMobileVoiceVerifySelectUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f73617d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.f3[] f73618e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f73619f;

    public static com.tencent.mm.plugin.account.ui.f3[] V6() {
        java.lang.String[] split = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ahq).trim().split(",");
        com.tencent.mm.plugin.account.ui.f3[] f3VarArr = new com.tencent.mm.plugin.account.ui.f3[split.length];
        for (int i17 = 0; i17 < split.length; i17++) {
            java.lang.String[] split2 = split[i17].trim().split(":");
            f3VarArr[i17] = new com.tencent.mm.plugin.account.ui.f3(split2[1], split2[2], split2[0], false);
        }
        return f3VarArr;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.layout.f488205kf;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        hideVKB();
        this.f73619f = getIntent().getExtras().getString("voice_verify_code");
        setMMTitle(com.tencent.mm.R.string.ahw);
        setBackBtn(new com.tencent.mm.plugin.account.ui.hg(this));
        com.tencent.mm.plugin.account.ui.f3[] V6 = V6();
        this.f73618e = V6;
        if (V6.length <= 0) {
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f73617d).t();
        ((com.tencent.mm.ui.base.preference.h0) this.f73617d).d(new com.tencent.mm.ui.base.preference.PreferenceCategory(this), -1);
        for (com.tencent.mm.plugin.account.ui.f3 f3Var : this.f73618e) {
            if (f3Var.f73840c.equalsIgnoreCase(this.f73619f)) {
                f3Var.f73841d = true;
            }
            com.tencent.mm.plugin.account.ui.LanguagePreference languagePreference = new com.tencent.mm.plugin.account.ui.LanguagePreference(this, null);
            languagePreference.M(f3Var);
            languagePreference.C(f3Var.f73840c);
            ((com.tencent.mm.ui.base.preference.h0) this.f73617d).d(languagePreference, -1);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f73617d = getPreferenceScreen();
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.plugin.account.ui.f3 f3Var;
        if (!(preference instanceof com.tencent.mm.plugin.account.ui.LanguagePreference) || (f3Var = ((com.tencent.mm.plugin.account.ui.LanguagePreference) preference).L) == null) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("voice_verify_language", f3Var.f73838a);
        bundle.putString("voice_verify_code", f3Var.f73840c);
        intent.putExtras(bundle);
        setResult(0, intent);
        finish();
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
