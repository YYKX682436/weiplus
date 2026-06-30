package cg5;

/* loaded from: classes6.dex */
public final class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExptChangeEvent event = (com.tencent.mm.autogen.events.ExptChangeEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        ((jz5.n) x11.t.I).getValue();
        return false;
    }
}
