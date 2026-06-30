package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLikePrivacyUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FinderLikePrivacyUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f109317d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f109318e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109319f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109320g;

    /* renamed from: h, reason: collision with root package name */
    public int f109321h;

    public final void V6(java.util.LinkedList opList) {
        kotlin.jvm.internal.o.g(opList, "opList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(opList, 10));
        java.util.Iterator it = opList.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.un4) it.next()).f387494d);
        }
        gm0.j1.d().g(new w11.h0(arrayList, ((r45.un4) opList.getFirst()).f387495e, ((r45.un4) opList.getFirst()).f387496f, ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 30)));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494877dk;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.m1i);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.x6(this));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        java.lang.String string = context.getString(com.tencent.mm.R.string.erq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.CharSequence k17 = hc2.x0.k(string, context, '#', com.tencent.mm.R.raw.icons_filled_channels_like_thick, com.tencent.mm.R.color.FG_0, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.erm);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.CharSequence k18 = hc2.x0.k(string2, context, '#', com.tencent.mm.R.raw.icons_filled_channels_like_thick, com.tencent.mm.R.color.FG_0, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("checkbox_preference_shieldHisLike");
        this.f109317d = checkBoxPreference;
        if (checkBoxPreference != null) {
            checkBoxPreference.L(k17);
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("checkbox_preference_shieldMyLike");
        this.f109318e = checkBoxPreference2;
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.L(k18);
        }
        this.f109320g = getIntent().getStringExtra("WxUserName");
        this.f109321h = getIntent().getIntExtra("keyFromSource", 0);
        gm0.j1.d().a(3990, this);
        hc2.v0.c(this, iy1.c.FinderFriendLikePrivilegePage, "page_in", false, kz5.c1.k(new jz5.l("thx_to_uin", this.f109320g), new jz5.l("friend_like_privilege_source_page", java.lang.Integer.valueOf(this.f109321h))), 4, null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(3990, this);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn;
        java.lang.String str;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2;
        java.lang.String str2;
        java.lang.String str3 = preference != null ? preference.f197780q : null;
        com.tencent.mars.xlog.Log.i("FinderLikePrivacyUI", "click " + str3);
        if (kotlin.jvm.internal.o.b(str3, "checkbox_preference_shieldHisLike")) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f109317d;
            if (checkBoxPreference != null && (str2 = this.f109319f) != null) {
                boolean N = checkBoxPreference.N();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.un4 un4Var = new r45.un4();
                un4Var.f387494d = str2;
                un4Var.f387495e = zy2.v.f477593d;
                un4Var.f387496f = N ? 1 : 2;
                linkedList.add(un4Var);
                V6(linkedList);
                cq.k1.a();
                if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.k1().r()).booleanValue()) {
                    com.tencent.mm.autogen.events.FinderHeartLikeRemoveByPrivacyEvent finderHeartLikeRemoveByPrivacyEvent = new com.tencent.mm.autogen.events.FinderHeartLikeRemoveByPrivacyEvent();
                    java.util.List c17 = kz5.b0.c(str2);
                    am.jb jbVar = finderHeartLikeRemoveByPrivacyEvent.f54279g;
                    jbVar.f7022a = c17;
                    jbVar.f7023b = N ? 1 : 0;
                    finderHeartLikeRemoveByPrivacyEvent.e();
                }
            }
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = this.f109317d;
            if (checkBoxPreference2 != null && (mMSwitchBtn2 = checkBoxPreference2.M) != null) {
                hc2.v0.d(mMSwitchBtn2, "dont_check_his_like_switch", "view_clk", false, null, new com.tencent.mm.plugin.finder.feed.ui.y6(mMSwitchBtn2, this.f109320g, this), 12, null);
            }
        } else if (kotlin.jvm.internal.o.b(str3, "checkbox_preference_shieldMyLike")) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = this.f109318e;
            if (checkBoxPreference3 != null && (str = this.f109319f) != null) {
                boolean N2 = checkBoxPreference3.N();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                r45.un4 un4Var2 = new r45.un4();
                un4Var2.f387494d = str;
                un4Var2.f387495e = zy2.v.f477594e;
                un4Var2.f387496f = N2 ? 1 : 2;
                linkedList2.add(un4Var2);
                V6(linkedList2);
                cq.k1.a();
                if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.k1().r()).booleanValue()) {
                    com.tencent.mm.autogen.events.FinderHeartLikeRemoveByPrivacyEvent finderHeartLikeRemoveByPrivacyEvent2 = new com.tencent.mm.autogen.events.FinderHeartLikeRemoveByPrivacyEvent();
                    java.util.List c18 = kz5.b0.c(str);
                    am.jb jbVar2 = finderHeartLikeRemoveByPrivacyEvent2.f54279g;
                    jbVar2.f7022a = c18;
                    jbVar2.f7023b = -1;
                    finderHeartLikeRemoveByPrivacyEvent2.e();
                }
            }
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference4 = this.f109318e;
            if (checkBoxPreference4 != null && (mMSwitchBtn = checkBoxPreference4.M) != null) {
                hc2.v0.d(mMSwitchBtn, "hide_my_like_from_him_switch", "view_clk", false, null, new com.tencent.mm.plugin.finder.feed.ui.y6(mMSwitchBtn, this.f109320g, this), 12, null);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        android.os.Bundle extras = getIntent().getExtras();
        this.f109319f = extras != null ? extras.getString("Username", "") : null;
        android.os.Bundle extras2 = getIntent().getExtras();
        java.lang.Integer valueOf = extras2 != null ? java.lang.Integer.valueOf(extras2.getInt("isShieldHisLike", 0)) : null;
        android.os.Bundle extras3 = getIntent().getExtras();
        java.lang.Integer valueOf2 = extras3 != null ? java.lang.Integer.valueOf(extras3.getInt("isShieldMyLike", 0)) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("checkbox_preference_shieldHisLike", true);
        } else {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f109317d;
            if (checkBoxPreference != null) {
                checkBoxPreference.O(valueOf != null && valueOf.intValue() == 1);
                checkBoxPreference.f197785v = false;
            }
        }
        if (valueOf2 != null && valueOf2.intValue() == 0) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("checkbox_preference_shieldMyLike", true);
        } else {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = this.f109318e;
            if (checkBoxPreference2 != null) {
                checkBoxPreference2.O(valueOf2 != null && valueOf2.intValue() == 1);
                checkBoxPreference2.f197785v = false;
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof w11.h0) {
            com.tencent.mars.xlog.Log.i("FinderLikePrivacyUI", "NetSceneBatchSetBlackList errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
            if (i17 == 0 && i18 == 0) {
                java.util.List list = ((w11.h0) m1Var).f442039e;
                kotlin.jvm.internal.o.f(list, "getNames(...)");
            }
        }
    }
}
