package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes4.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI f94153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI) {
        super(0);
        this.f94153d = bizTimeLineSettingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.preference.r preferenceScreen = this.f94153d.getPreferenceScreen();
        kotlin.jvm.internal.o.d(preferenceScreen);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("biz_msg_rec_loading_pref");
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.BizTimelineSettingLoadingPreference");
        return (com.tencent.mm.plugin.brandservice.ui.timeline.BizTimelineSettingLoadingPreference) h17;
    }
}
