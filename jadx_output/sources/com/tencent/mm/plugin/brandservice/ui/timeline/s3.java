package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes4.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI f94506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI) {
        super(0);
        this.f94506d = bizTimeLineSettingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.preference.r preferenceScreen = this.f94506d.getPreferenceScreen();
        kotlin.jvm.internal.o.d(preferenceScreen);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("biz_msg_my_my_biz_setting_title");
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.PreferenceTitleCategory");
        return (com.tencent.mm.ui.base.preference.PreferenceTitleCategory) h17;
    }
}
