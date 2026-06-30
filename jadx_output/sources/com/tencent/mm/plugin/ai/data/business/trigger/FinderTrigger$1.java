package com.tencent.mm.plugin.ai.data.business.trigger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class FinderTrigger$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KvReportEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ai.data.business.trigger.g f74658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderTrigger$1(com.tencent.mm.plugin.ai.data.business.trigger.g gVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f74658d = gVar;
        this.__eventId = -624982229;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.KvReportEvent kvReportEvent) {
        am.ji jiVar;
        com.tencent.mm.autogen.events.KvReportEvent kvReportEvent2 = kvReportEvent;
        if (kvReportEvent2 == null || (jiVar = kvReportEvent2.f54460g) == null || jiVar.f7033a != 19943) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.ai.data.business.trigger.f(this, kvReportEvent2), "Ai_thread");
        return false;
    }
}
