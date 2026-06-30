package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes4.dex */
public class ExdeviceSettingUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public int f99360d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99361e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f99362f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f99363g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f99364h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f99365i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f99366m;

    public final void V6() {
        this.f99363g.O((this.f99360d & 1) == 1);
        this.f99364h.O((this.f99360d & 2) == 2);
        this.f99365i.O((this.f99360d & 8) == 8);
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494870ac;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ve4.g.a(38);
        gm0.j1.n().f273288b.a(1044, this);
        this.f99363g = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("notify_rank");
        this.f99364h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("notify_like");
        this.f99365i = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("join_rank");
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(397310, 0);
        if (num == null || num.intValue() == 0) {
            this.f99361e = false;
            this.f99363g.O(true);
            this.f99364h.O(true);
            this.f99365i.O(true);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
            this.f99362f = android.app.ProgressDialog.show(this, "", "", true, false);
        } else {
            this.f99361e = true;
            this.f99360d = num.intValue();
            V6();
        }
        gm0.j1.n().f273288b.g(new p32.q(2, 0));
        setMMTitle(com.tencent.mm.R.string.hw9);
        setBackBtn(new com.tencent.mm.plugin.exdevice.ui.y6(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f273288b.q(1044, this);
        android.app.ProgressDialog progressDialog = this.f99362f;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f99362f.dismiss();
        }
        if (this.f99361e) {
            if (this.f99363g.N()) {
                this.f99360d |= 1;
            } else {
                this.f99360d &= -2;
            }
            if (this.f99364h.N()) {
                this.f99360d |= 2;
            } else {
                this.f99360d &= -3;
            }
            if (this.f99365i.N()) {
                this.f99360d |= 8;
            } else {
                this.f99360d &= -9;
            }
            gm0.j1.u().c().w(397310, java.lang.Integer.valueOf(this.f99360d));
            gm0.j1.n().f273288b.g(new p32.q(1, this.f99360d));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference.f197780q.equals("black_contact_list")) {
            j45.l.h(this, "sport", ".ui.SportBlackListUI");
            return false;
        }
        this.f99366m = true;
        return false;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            android.app.ProgressDialog progressDialog = this.f99362f;
            if (progressDialog != null && progressDialog.isShowing()) {
                runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.a7(this));
            }
            dp.a.makeText(this, "scene error", 0).show();
            finish();
            return;
        }
        p32.q qVar = (p32.q) m1Var;
        int i19 = qVar.f351515f;
        if (i19 != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceSettingUI", "It isn't a GET_FLAG opType(%d).", java.lang.Integer.valueOf(i19));
            return;
        }
        android.app.ProgressDialog progressDialog2 = this.f99362f;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.z6(this));
        }
        this.f99361e = true;
        int i27 = this.f99360d;
        int i28 = qVar.f351516g;
        if (i27 == i28) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceSettingUI", "flag has not changed.(%s)", java.lang.Integer.valueOf(i27));
            return;
        }
        this.f99360d = i28;
        gm0.j1.u().c().w(397310, java.lang.Integer.valueOf(this.f99360d));
        if (this.f99366m) {
            return;
        }
        V6();
    }
}
