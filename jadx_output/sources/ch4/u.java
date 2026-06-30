package ch4;

/* loaded from: classes11.dex */
public class u extends com.tencent.mm.sdk.event.n {
    public u() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.py pyVar;
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = (com.tencent.mm.autogen.events.TalkRoomServerEvent) iEvent;
        if (talkRoomServerEvent == null) {
            return false;
        }
        am.oy oyVar = talkRoomServerEvent.f54883g;
        if (oyVar.f7584b) {
            dh4.l.Di().i();
        } else {
            if (!oyVar.f7583a || (pyVar = talkRoomServerEvent.f54884h) == null || dh4.l.Di() == null) {
                return false;
            }
            pyVar.f7671a = dh4.l.Di().f232516h;
        }
        return true;
    }
}
