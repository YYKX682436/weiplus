package c01;

/* loaded from: classes12.dex */
public class sb extends com.tencent.mm.sdk.event.n {
    public sb() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CoreNetworkReadyEvent coreNetworkReadyEvent = (com.tencent.mm.autogen.events.CoreNetworkReadyEvent) iEvent;
        com.tencent.mars.xlog.Log.i("StaticOnCoreNetworkReadyEventListener", "ILinkStreamSession from event:%b", java.lang.Boolean.valueOf(coreNetworkReadyEvent.f54075g.f7399d));
        am.n3 n3Var = coreNetworkReadyEvent.f54075g;
        if (!n3Var.f7399d) {
            return true;
        }
        c01.u7.d(n3Var.f7397b, n3Var.f7398c, n3Var.f7396a);
        return true;
    }
}
