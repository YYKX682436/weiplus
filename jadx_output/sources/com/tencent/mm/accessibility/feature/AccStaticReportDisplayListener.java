package com.tencent.mm.accessibility.feature;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/tencent/mm/accessibility/feature/AccStaticReportDisplayListener;", "Lcom/tencent/mm/sdk/event/n;", "Lcom/tencent/mm/autogen/events/ReportScreenRecordInfoEvent;", "event", "", "callback", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class AccStaticReportDisplayListener extends com.tencent.mm.sdk.event.n {
    public AccStaticReportDisplayListener() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.autogen.events.ReportScreenRecordInfoEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.accessibility.feature.DisplayReportInfo displayReportInfo = new com.tencent.mm.accessibility.feature.DisplayReportInfo();
        am.dr drVar = event.f54688g;
        displayReportInfo.setDisplayId(drVar.f6491a);
        displayReportInfo.setDisplayName(drVar.f6493c);
        displayReportInfo.setDisplayOwnerPackage(drVar.f6492b);
        displayReportInfo.setDisplayEventType(drVar.f6495e);
        com.tencent.mm.accessibility.ReportDisplayManager.INSTANCE.pushPutMMKVData(displayReportInfo);
        com.tencent.mars.xlog.Log.i("MicroMsg.AccStaticReportDisplayListener", "[push] record mmkv: " + displayReportInfo.toXml());
        return false;
    }
}
