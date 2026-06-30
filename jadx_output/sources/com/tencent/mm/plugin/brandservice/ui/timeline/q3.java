package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes9.dex */
public final class q3 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f94496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f94497e;

    public q3(kotlin.jvm.internal.c0 c0Var, java.lang.ref.WeakReference weakReference) {
        this.f94496d = c0Var;
        this.f94497e = weakReference;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o rr6, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        kotlin.jvm.internal.o.g(rr6, "rr");
        kotlin.jvm.internal.o.g(m1Var, "<anonymous parameter 4>");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSettingUI", "getTimelineSetting callback " + i17 + ", " + i18);
        kotlin.jvm.internal.c0 c0Var = this.f94496d;
        if (c0Var.f310112d) {
            return 0;
        }
        boolean z18 = true;
        c0Var.f310112d = true;
        java.lang.ref.WeakReference weakReference = this.f94497e;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI = (com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI) weakReference.get();
            if (bizTimeLineSettingUI != null) {
                int i19 = com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI.f94085p;
                if (str != null && !r26.n0.N(str)) {
                    z18 = false;
                }
                if (z18) {
                    str = bizTimeLineSettingUI.getString(com.tencent.mm.R.string.amc);
                }
                java.lang.String str2 = str;
                kotlin.jvm.internal.o.d(str2);
                db5.e1.A(bizTimeLineSettingUI, "", str2, bizTimeLineSettingUI.getString(com.tencent.mm.R.string.f490544y3), bizTimeLineSettingUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.brandservice.ui.timeline.x3(bizTimeLineSettingUI), new com.tencent.mm.plugin.brandservice.ui.timeline.y3(bizTimeLineSettingUI));
            }
            return 0;
        }
        com.tencent.mm.protobuf.f fVar = rr6.f70711b.f70700a;
        if (!(fVar instanceof r45.ip3)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizTimeLineSettingUI", "not my resp");
            return 0;
        }
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetTimelineSettingResp");
        r45.ip3 ip3Var = (r45.ip3) fVar;
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI2 = (com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI) weakReference.get();
        if (bizTimeLineSettingUI2 != null) {
            int i27 = com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI.f94085p;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSettingUI", "initData personalized_recommend_setting=" + ip3Var.f377249d);
            kotlinx.coroutines.p2.a(bizTimeLineSettingUI2.f94092m, null, 1, null);
            com.tencent.mm.ui.base.preference.r preferenceScreen = bizTimeLineSettingUI2.getPreferenceScreen();
            kotlin.jvm.internal.o.d(preferenceScreen);
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).m("biz_msg_rec_loading_pref", true);
            bizTimeLineSettingUI2.W6().O(ip3Var.f377249d);
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) bizTimeLineSettingUI2.f94087e).getValue()).O(ip3Var.f377254i == 1);
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) bizTimeLineSettingUI2.f94088f).getValue()).O(ip3Var.f377251f);
            com.tencent.mm.pluginsdk.model.e eVar = com.tencent.mm.pluginsdk.model.e.f189277a;
            r45.dn c17 = eVar.c();
            if ((c17 != null ? c17.f372587n : 0) == 1) {
                com.tencent.mm.ui.base.preference.r preferenceScreen2 = bizTimeLineSettingUI2.getPreferenceScreen();
                kotlin.jvm.internal.o.d(preferenceScreen2);
                ((com.tencent.mm.ui.base.preference.h0) preferenceScreen2).m("biz_msg_read_dot_switch", false);
                com.tencent.mm.ui.base.preference.r preferenceScreen3 = bizTimeLineSettingUI2.getPreferenceScreen();
                kotlin.jvm.internal.o.d(preferenceScreen3);
                ((com.tencent.mm.ui.base.preference.h0) preferenceScreen3).m("biz_msg_my_my_biz_setting_title", false);
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) bizTimeLineSettingUI2.f94089g).getValue();
                boolean z19 = ip3Var.f377253h == 1;
                eVar.f(z19);
                checkBoxPreference.O(z19);
            }
            com.tencent.mm.ui.base.preference.r preferenceScreen4 = bizTimeLineSettingUI2.getPreferenceScreen();
            kotlin.jvm.internal.o.d(preferenceScreen4);
            r45.jm6 d17 = eVar.d();
            if (d17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSettingUI", "isOpenTimeLineSetting settingInfo is null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSettingUI", "isOpenTimeLineSetting timelineSettingControlBit=%d", java.lang.Integer.valueOf(d17.f377955d));
                int i28 = d17.f377955d;
                for (java.lang.Integer num : (java.lang.Integer[]) ((jz5.n) com.tencent.mm.pluginsdk.model.e.f189279c).getValue()) {
                    if ((num.intValue() & i28) != 0) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen4).m("biz_msg_rec_pref", !z17);
            com.tencent.mm.ui.base.preference.r preferenceScreen5 = bizTimeLineSettingUI2.getPreferenceScreen();
            kotlin.jvm.internal.o.d(preferenceScreen5);
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen5).m("biz_msg_pay_for_head_pref", false);
            com.tencent.mm.ui.base.preference.r preferenceScreen6 = bizTimeLineSettingUI2.getPreferenceScreen();
            kotlin.jvm.internal.o.d(preferenceScreen6);
            r45.jm6 d18 = com.tencent.mm.pluginsdk.model.e.f189277a.d();
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen6).m("biz_msg_finder_rec_pref", !(((d18 != null ? d18.f377955d : 0) & 8) != 0));
        }
        return 0;
    }
}
