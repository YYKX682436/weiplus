package ax1;

/* loaded from: classes11.dex */
public final class h0 extends com.tencent.mm.sdk.event.n {
    public h0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExptChangeEvent event = (com.tencent.mm.autogen.events.ExptChangeEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        zn4.f.f474502d = j62.e.g().c(new com.tencent.mm.repairer.config.serialize.RepairerConfigUseNewSerialize()) != 1;
        com.tencent.mm.protobuf.n.f192172a = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigProtobufReportSize());
        com.tencent.mars.xlog.Log.i("MicroMsg.XMLTelemetryHelperLog", "ExptChangeEvent() useLegacyParser: " + zn4.f.f474502d + ", PB_BYTE_SIZE_THRESHOLD: " + com.tencent.mm.protobuf.n.f192172a);
        return false;
    }
}
