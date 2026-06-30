package a72;

/* loaded from: classes15.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExtCallEvent extCallEvent = (com.tencent.mm.autogen.events.ExtCallEvent) iEvent;
        if (!(extCallEvent instanceof com.tencent.mm.autogen.events.ExtCallEvent)) {
            com.tencent.mars.xlog.Log.f("MicroMsg.ExtCallEventListener", "mismatched event");
            return false;
        }
        am.y7 y7Var = extCallEvent.f54190g;
        com.tencent.mm.plugin.extqlauncher.provider.ExtControlProviderQLauncher extControlProviderQLauncher = new com.tencent.mm.plugin.extqlauncher.provider.ExtControlProviderQLauncher(y7Var.f8440c, y7Var.f8438a, y7Var.f8439b);
        am.y7 y7Var2 = extCallEvent.f54190g;
        extCallEvent.f54191h.f8525a = extControlProviderQLauncher.query(y7Var2.f8441d, null, null, y7Var2.f8442e, null);
        return true;
    }
}
