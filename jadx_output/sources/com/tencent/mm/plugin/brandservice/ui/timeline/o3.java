package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes4.dex */
public final class o3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI f94174d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f94174d = bizTimeLineSettingUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.brandservice.ui.timeline.o3(this.f94174d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.brandservice.ui.timeline.o3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return null;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.base.preference.r preferenceScreen = this.f94174d.getPreferenceScreen();
        kotlin.jvm.internal.o.d(preferenceScreen);
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).m("biz_msg_rec_loading_pref", false);
        return null;
    }
}
