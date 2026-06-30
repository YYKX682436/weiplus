package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes15.dex */
public class AppBrandAuthorizeDetailUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f89284r = {0, 1, 2};

    /* renamed from: d, reason: collision with root package name */
    public int f89285d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f89287f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f89288g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference f89289h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference f89290i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference f89291m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f89292n;

    /* renamed from: o, reason: collision with root package name */
    public i11.e f89293o;

    /* renamed from: e, reason: collision with root package name */
    public boolean f89286e = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f89294p = "";

    /* renamed from: q, reason: collision with root package name */
    public final i11.c f89295q = new com.tencent.mm.plugin.appbrand.ui.j(this);

    public final void V6() {
        if (!this.f89292n || this.f89288g == null) {
            return;
        }
        this.f89288g.L(((this.f89285d == 0) || com.tencent.mm.sdk.platformtools.t8.K0(this.f89294p)) ? getIntent().getStringExtra("key_desc") : java.lang.String.format(getIntent().getStringExtra("key_desc_oversea"), this.f89294p));
        ((com.tencent.mm.ui.base.preference.h0) this.f89287f).notifyDataSetChanged();
    }

    public final void W6() {
        if (!this.f89286e) {
            setResult(0, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeDetailUI", "setResData, has changed, state:%s", java.lang.Integer.valueOf(this.f89285d));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_state", this.f89285d);
        setResult(-1, intent);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494831d;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        W6();
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeDetailUI", "onPreferenceTreeClick, key:%s", preference.f197780q);
        if (preference instanceof com.tencent.mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference) {
            this.f89286e = true;
            if (preference.f197780q.equalsIgnoreCase("both")) {
                this.f89285d = 2;
                this.f89289h.M(false);
                this.f89290i.M(false);
                com.tencent.mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference appBrandAuthPreference = this.f89291m;
                if (appBrandAuthPreference != null) {
                    appBrandAuthPreference.M(true);
                }
            } else if (preference.f197780q.equalsIgnoreCase("foreground")) {
                this.f89285d = 1;
                this.f89290i.M(true);
                this.f89289h.M(false);
                com.tencent.mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference appBrandAuthPreference2 = this.f89291m;
                if (appBrandAuthPreference2 != null) {
                    appBrandAuthPreference2.M(false);
                }
            } else {
                this.f89285d = 0;
                this.f89289h.M(true);
                this.f89290i.M(false);
                com.tencent.mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference appBrandAuthPreference3 = this.f89291m;
                if (appBrandAuthPreference3 != null) {
                    appBrandAuthPreference3.M(false);
                }
            }
            V6();
            ((com.tencent.mm.ui.base.preference.h0) this.f89287f).notifyDataSetChanged();
        }
        return false;
    }
}
