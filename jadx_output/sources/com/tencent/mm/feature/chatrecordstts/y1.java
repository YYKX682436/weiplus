package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes5.dex */
public final class y1 extends com.tencent.mm.sdk.event.n {
    public y1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RepairerActionEvent event = (com.tencent.mm.autogen.events.RepairerActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.uq uqVar = event.f54679g;
        java.lang.String str = uqVar != null ? uqVar.f8126b : null;
        new com.tencent.mm.repairer.config.chatting.RepairerConfigResetChatRecordsTtsFloatBallExposureCount();
        if (!kotlin.jvm.internal.o.b(str, "RepairerConfig_ResetChatRecordsTtsFloatBallExposureCount")) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("ChatRecordsTtsFloatBallHelper", 2, null);
        if (N != null) {
            N.putInt("chat_records_tts_float_ball_exposure_count", 0);
        }
        if (N != null) {
            N.remove("chat_records_tts_float_ball_exposure_count");
        }
        return true;
    }
}
