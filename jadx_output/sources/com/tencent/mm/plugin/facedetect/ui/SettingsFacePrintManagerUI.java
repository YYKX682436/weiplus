package com.tencent.mm.plugin.facedetect.ui;

/* loaded from: classes8.dex */
public class SettingsFacePrintManagerUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f100091i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f100092d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.ui.FaceHeaderPreference f100094f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f100095g;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f100093e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f100096h = false;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.by;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(gm0.j1.u().c().l(40, 0), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceSettingsManagerUI", "plugSwitch " + o17 + " " + (o17 & 4194304));
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f100092d = preferenceScreen;
        this.f100094f = (com.tencent.mm.plugin.facedetect.ui.FaceHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("settings_faceprint_header");
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f100092d).h("settings_faceprint_title")).S(true);
        ((com.tencent.mm.ui.base.preference.h0) this.f100092d).notifyDataSetChanged();
        android.app.ProgressDialog progressDialog = this.f100093e;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f100093e.dismiss();
        }
        this.f100093e = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new g72.d0(this));
        gm0.j1.d().g(new c72.w(3));
        ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceprint_create", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceeprint_reset", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceprint_unlock", true);
        setBackBtn(new g72.e0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            if (intent != null && intent.getIntExtra("err_code", 10) == 0) {
                this.f100096h = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceSettingsManagerUI", "hy: is reg ok: %b", java.lang.Boolean.valueOf(this.f100096h));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.c7_);
        gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.lbs.h.CTRL_INDEX, this);
        this.f100095g = findViewById(com.tencent.mm.R.id.jlv);
        initView();
        this.f100095g.setBackgroundResource(com.tencent.mm.R.color.aaw);
        com.tencent.mm.plugin.facedetect.model.s0.b(this);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.lbs.h.CTRL_INDEX, this);
        android.app.ProgressDialog progressDialog = this.f100093e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        android.content.Intent intent = new android.content.Intent();
        if (str.equals("settings_faceprint_title")) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_faceprint_title");
            checkBoxPreference.N();
            android.app.ProgressDialog progressDialog = this.f100093e;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f100093e.dismiss();
            }
            this.f100093e = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new g72.f0(this));
            if (checkBoxPreference.N()) {
                gm0.j1.d().g(new c72.w(1));
            } else {
                gm0.j1.d().g(new c72.w(2));
            }
            return true;
        }
        if (!str.equals("settings_faceprint_unlock")) {
            if (!str.equals("settings_faceeprint_reset")) {
                return false;
            }
            intent.setClass(this, com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.class);
            intent.putExtra("k_need_signature", true);
            intent.putExtra("k_user_name", c01.z1.b());
            intent.putExtra("k_purpose", 1);
            startActivityForResult(intent, 1);
            return true;
        }
        intent.setClass(this, com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.class);
        intent.putExtra("k_need_signature", true);
        intent.putExtra("k_user_name", c01.z1.b());
        intent.putExtra("k_purpose", 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/ui/SettingsFacePrintManagerUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/facedetect/ui/SettingsFacePrintManagerUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceSettingsManagerUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceSettingsManagerUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 23) {
            return;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FaceSettingsManagerUI", "hy: permission not granted");
        finish();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f100096h) {
            this.f100096h = false;
            android.app.ProgressDialog progressDialog = this.f100093e;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f100093e.dismiss();
            }
            this.f100093e = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new g72.c0(this));
            gm0.j1.d().g(new c72.w(1));
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        m1Var.getType();
        if (i17 != 0 && i18 != 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceprint_create", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceprint_unlock", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceeprint_reset", true);
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f100092d).h("settings_faceprint_title")).S(false);
            this.f100094f.L(getString(com.tencent.mm.R.string.iqz));
            ((com.tencent.mm.ui.base.preference.h0) this.f100092d).notifyDataSetChanged();
            android.app.ProgressDialog progressDialog = this.f100093e;
            if (progressDialog != null) {
                progressDialog.dismiss();
                return;
            }
            return;
        }
        if (m1Var.getType() == 938) {
            c72.w wVar = (c72.w) m1Var;
            if (wVar.f39597f) {
                ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceprint_unlock", false);
                ((com.tencent.mm.ui.base.preference.h0) this.f100092d).notifyDataSetChanged();
                int o17 = c01.z1.o();
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f100092d).h("settings_faceprint_title");
                if (wVar.f39598g) {
                    checkBoxPreference.S(true);
                    ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceeprint_reset", false);
                    ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceprint_unlock", false);
                    i19 = o17 | 4194304;
                    this.f100094f.N(getString(com.tencent.mm.R.string.f493036ir0), "");
                } else {
                    checkBoxPreference.S(false);
                    ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceeprint_reset", true);
                    ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceprint_unlock", true);
                    i19 = o17 & (-4194305);
                    this.f100094f.N(getString(com.tencent.mm.R.string.iqz), "");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceSettingsManagerUI", "scene end plugSwitch %d", java.lang.Integer.valueOf(i19));
                c01.b9.f37069c.d("last_login_use_voice", i19 + "");
                gm0.j1.u().c().w(40, java.lang.Integer.valueOf(i19));
                ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceprint_create", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceprint_title", false);
                this.f100094f.M(null);
                ((com.tencent.mm.ui.base.preference.h0) this.f100092d).notifyDataSetChanged();
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11390, 2);
                ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceprint_create", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceprint_title", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceprint_unlock", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f100092d).m("settings_faceeprint_reset", true);
                this.f100094f.L(getString(com.tencent.mm.R.string.iqv));
                this.f100094f.M(new g72.g0(this));
                ((com.tencent.mm.ui.base.preference.h0) this.f100092d).notifyDataSetChanged();
            }
        }
        android.app.ProgressDialog progressDialog2 = this.f100093e;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
    }
}
