package com.tencent.mm.plugin.account.ui;

/* loaded from: classes9.dex */
public class InviteRecommendChoiceUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f73294d;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean autoRefresh() {
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494897ax;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.iht);
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f73294d = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.h0) this.f73294d).v((com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("settings_invite_facebook_friends"));
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f73294d).h("settings_invite_qq_friends");
        if (c01.z1.f() == 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f73294d).v(iconPreference);
        }
        com.tencent.mm.ui.base.preference.IconPreference iconPreference2 = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f73294d).h("settings_recommend_by_mail");
        if (c01.z1.f() == 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f73294d).v(iconPreference2);
        }
        com.tencent.mm.ui.base.preference.IconPreference iconPreference3 = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f73294d).h("settings_recommend_by_mb");
        if (((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com") == null) {
            ((com.tencent.mm.ui.base.preference.h0) this.f73294d).v(iconPreference3);
        }
        setBackBtn(new com.tencent.mm.plugin.account.ui.c3(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if (str.equals("settings_invite_qq_friends")) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI.class);
            intent.putExtra("recommend_type", java.lang.Integer.toString(0));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_recommend_by_mail")) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI.class);
            intent2.putExtra("recommend_type", java.lang.Integer.toString(2));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_recommend_by_mb")) {
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI.class);
            intent3.putExtra("recommend_type", java.lang.Integer.toString(1));
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent3);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_invite_mobile_friends")) {
            android.content.Intent intent4 = new android.content.Intent("android.intent.action.VIEW");
            intent4.putExtra("sms_body", getString(com.tencent.mm.R.string.f492329g26, gm0.j1.u().c().l(2, null)));
            intent4.setType("vnd.android-dir/mms-sms");
            if (com.tencent.mm.sdk.platformtools.t8.I0(this, intent4, true, false)) {
                try {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(intent4);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList4.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (android.content.ActivityNotFoundException e17) {
                    com.tencent.mars.xlog.Log.e(com.tencent.mm.ui.base.preference.MMPreference.TAG, "ActivityNotFoundException:" + e17);
                    dp.a.makeText(this, com.tencent.mm.R.string.igz, 1).show();
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.mm.ui.base.preference.MMPreference.TAG, e18, "", new java.lang.Object[0]);
                }
            } else {
                dp.a.makeText(this, com.tencent.mm.R.string.igz, 1).show();
            }
        } else if (str.equals("settings_invite_facebook_friends")) {
            android.content.Intent intent5 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI.class);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(intent5);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList5.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/ui/InviteRecommendChoiceUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return false;
    }
}
