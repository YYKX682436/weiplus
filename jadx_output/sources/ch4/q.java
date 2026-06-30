package ch4;

/* loaded from: classes11.dex */
public class q extends com.tencent.mm.sdk.event.n {
    public q() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        ((com.tencent.mm.autogen.events.LogoutEvent) iEvent).f54484g.getClass();
        if (dh4.l.Di() == null) {
            return false;
        }
        dh4.l.Di().i();
        return false;
    }
}
