package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI31;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class OccupyFinderUI31 extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f109609d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f109610e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109611f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109612g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f109613h;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.d_;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.m1i);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.ro(this));
        this.f109609d = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("checkbox_preference_notrec");
        this.f109610e = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("checkbox_preference_blacklist");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference;
        java.lang.String str;
        java.lang.String str2 = preference != null ? preference.f197780q : null;
        com.tencent.mars.xlog.Log.i("OccupyFinderUI31", "click " + str2);
        if (kotlin.jvm.internal.o.b(str2, "checkbox_preference_notrec")) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = this.f109609d;
            java.lang.Boolean valueOf = checkBoxPreference2 != null ? java.lang.Boolean.valueOf(checkBoxPreference2.N()) : null;
            java.lang.String str3 = this.f109611f;
            if (str3 != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                com.tencent.mm.plugin.finder.feed.ui.to toVar = new com.tencent.mm.plugin.finder.feed.ui.to(valueOf, this);
                hb2.l0 l0Var = hb2.l0.f280068e;
                l0Var.getClass();
                r45.xo4 xo4Var = new r45.xo4();
                xo4Var.set(0, java.lang.Integer.valueOf(kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE) ? 2 : 1));
                xo4Var.set(1, str3);
                com.tencent.mars.xlog.Log.i(hb2.l0.f280069f, "ModifySingleUserNotRec display_optype:" + xo4Var.getInteger(0));
                hb2.w0.m(l0Var, xo4Var, toVar, false, false, null, null, 60, null);
            }
        } else if (kotlin.jvm.internal.o.b(str2, "checkbox_preference_blacklist") && (checkBoxPreference = this.f109610e) != null) {
            com.tencent.mm.plugin.finder.feed.ui.qo qoVar = new com.tencent.mm.plugin.finder.feed.ui.qo(this, checkBoxPreference);
            if (!this.f109613h) {
                java.lang.String str4 = this.f109611f;
                if (str4 != null) {
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    hb2.y.f280114e.q(str4, checkBoxPreference.N(), qoVar);
                }
            } else if (this.f109611f != null && (str = this.f109612g) != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.y yVar = hb2.y.f280114e;
                boolean N = checkBoxPreference.N();
                yVar.getClass();
                r45.kh2 kh2Var = new r45.kh2();
                kh2Var.set(8, str);
                if (N) {
                    kh2Var.set(0, 1);
                } else {
                    kh2Var.set(0, 2);
                }
                hb2.w0.m(yVar, kh2Var, qoVar, false, false, null, null, 60, null);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        android.os.Bundle extras = getIntent().getExtras();
        this.f109611f = extras != null ? extras.getString("Username", "") : null;
        android.os.Bundle extras2 = getIntent().getExtras();
        java.lang.Integer valueOf = extras2 != null ? java.lang.Integer.valueOf(extras2.getInt("FromScene_WXPROFILE", 0)) : null;
        this.f109613h = valueOf != null && valueOf.intValue() == 2;
        android.os.Bundle extras3 = getIntent().getExtras();
        this.f109612g = extras3 != null ? extras3.getString("SessionId", "") : null;
        android.os.Bundle extras4 = getIntent().getExtras();
        java.lang.Integer valueOf2 = extras4 != null ? java.lang.Integer.valueOf(extras4.getInt("isNotRec", 0)) : null;
        android.os.Bundle extras5 = getIntent().getExtras();
        java.lang.Integer valueOf3 = extras5 != null ? java.lang.Integer.valueOf(extras5.getInt("isBlackList", 0)) : null;
        if (valueOf2 != null && valueOf2.intValue() == 0) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("checkbox_preference_notrec", true);
        } else {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f109609d;
            if (checkBoxPreference != null) {
                checkBoxPreference.O(valueOf2 != null && valueOf2.intValue() == 1);
                checkBoxPreference.f197785v = false;
            }
        }
        if (valueOf3 != null && valueOf3.intValue() == 0) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("checkbox_preference_blacklist", true);
        } else {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = this.f109610e;
            if (checkBoxPreference2 != null) {
                checkBoxPreference2.O(valueOf3 != null && valueOf3.intValue() == 1);
                checkBoxPreference2.f197785v = false;
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
    }
}
