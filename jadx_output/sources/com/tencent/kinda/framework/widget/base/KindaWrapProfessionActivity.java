package com.tencent.kinda.framework.widget.base;

/* loaded from: classes8.dex */
public class KindaWrapProfessionActivity extends com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI {
    public static final java.lang.String ACTIVITY_CLOSE_FLAG = "flag_activity_close_WalletSelectProfessionUI";

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            com.tencent.mm.autogen.events.ProfessionSelectedEvent professionSelectedEvent = new com.tencent.mm.autogen.events.ProfessionSelectedEvent();
            professionSelectedEvent.f54628g.f8207a = ACTIVITY_CLOSE_FLAG;
            professionSelectedEvent.e();
        }
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI, com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference.f197780q.startsWith("index_")) {
            java.lang.String[] split = preference.f197780q.split("_");
            if (split.length == 2) {
                com.tencent.mm.plugin.wallet_core.id_verify.model.Profession profession = this.mProfessions[com.tencent.mm.sdk.platformtools.t8.P(split[1], 0)];
                com.tencent.mm.autogen.events.ProfessionSelectedEvent professionSelectedEvent = new com.tencent.mm.autogen.events.ProfessionSelectedEvent();
                java.lang.String str = profession.f179421d;
                am.vo voVar = professionSelectedEvent.f54628g;
                voVar.f8207a = str;
                voVar.f8208b = profession.f179422e;
                professionSelectedEvent.e();
                com.tencent.mars.xlog.Log.i("", "KindaWrapProfessionActivity.onPreferenceTreeClick，发送事件，当前线程：" + java.lang.Thread.currentThread().getId());
            } else {
                com.tencent.mars.xlog.Log.w("", "KindaWrapProfessionActivity error key: %s, %s", preference.f197780q, preference.o());
            }
            finish();
        }
        return true;
    }
}
