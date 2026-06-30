package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveMentionSettingUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderLiveMentionSettingUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f109383d = 0;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494878dl;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f491655ns4);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.ra(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference != null ? preference.f197780q : null;
        boolean z17 = 0;
        z17 = 0;
        if (str == null) {
            com.tencent.mars.xlog.Log.w("FinderLiveMentionSettingUI", "Preference is null, ignoring click");
            return false;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMentionSettingUI", "click ".concat(str));
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h(str);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17 : null;
        if (checkBoxPreference != null && checkBoxPreference.N()) {
            z17 = 1;
        }
        if (kotlin.jvm.internal.o.b(str, "checkbox_live_mention_msg_notify")) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "saveLiveMentionDisableRedDotMessage " + z17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.j9.a(ya2.r.f460525a, z17, 5, null, 4, null);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_MENTION_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        }
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        cl0.g gVar = new cl0.g();
        gVar.o("switch_state", !z17);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        a4Var.b("360", b17, "person_page_message_page_switch", gVar2);
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_MENTION_REDDOT_BOOLEAN_SYNC, true);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "getLiveMentionRedDotMessage " + o17);
        com.tencent.mars.xlog.Log.i("FinderLiveMentionSettingUI", "[updatePreference] isEnable=" + o17);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("checkbox_live_mention_msg_notify");
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17;
        checkBoxPreference.O(o17);
        checkBoxPreference.f197785v = false;
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        cl0.g gVar = new cl0.g();
        gVar.o("switch_state", o17 ? 1 : 0);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        a4Var.a("360", "", b17, "person_page_message_page_switch", gVar2);
    }
}
