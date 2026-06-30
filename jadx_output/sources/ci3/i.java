package ci3;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.sdk.event.n {
    public i() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.SnsGetVideoThumbEvent snsGetVideoThumbEvent = (com.tencent.mm.autogen.events.SnsGetVideoThumbEvent) iEvent;
        snsGetVideoThumbEvent.f54815h.f8403a = ai3.d.p(snsGetVideoThumbEvent.f54814g.f8326a);
        return true;
    }
}
