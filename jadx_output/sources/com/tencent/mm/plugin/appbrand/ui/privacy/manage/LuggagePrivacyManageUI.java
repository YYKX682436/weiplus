package com.tencent.mm.plugin.appbrand.ui.privacy.manage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/LuggagePrivacyManageUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LuggagePrivacyManageUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f89930d = 0;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f490657a43);
        setBackBtn(new bk1.u(this));
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(this);
            preference.C("AppBrandPrivacyManage");
            preference.f197785v = false;
            preference.J(com.tencent.mm.R.string.f490659a45);
            com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) preferenceScreen;
            h0Var.d(preference, -1);
            com.tencent.mm.ui.base.preference.SummaryBelowPreference summaryBelowPreference = new com.tencent.mm.ui.base.preference.SummaryBelowPreference(this, null);
            summaryBelowPreference.C("ThirdAppLuggageAuthManage");
            summaryBelowPreference.f197785v = false;
            summaryBelowPreference.J(com.tencent.mm.R.string.jxq);
            summaryBelowPreference.G(com.tencent.mm.R.string.jxp);
            h0Var.d(summaryBelowPreference, -1);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference == null) {
            return false;
        }
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LuggagePrivacyManageUI", "onPreferenceTreeClick, key: " + str);
        if (kotlin.jvm.internal.o.b(str, "AppBrandPrivacyManage")) {
            com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage.f89928e.a(this, com.tencent.mm.plugin.appbrand.ui.privacy.AppBrandPrivacyPageContainerUI.class);
        } else {
            if (!kotlin.jvm.internal.o.b(str, "ThirdAppLuggageAuthManage")) {
                return false;
            }
            com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
            if (h6Var != null) {
                l81.b1 b1Var = new l81.b1();
                b1Var.f317014b = "wxb6d22f922f37b35a";
                b1Var.f317018d = 0;
                b1Var.f317022f = "/packages/settings/pages/third-app-auth/index.html";
                b1Var.f317032k = 1251;
                ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(this, b1Var);
            }
        }
        return true;
    }
}
