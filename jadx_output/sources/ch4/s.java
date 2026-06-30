package ch4;

/* loaded from: classes11.dex */
public class s extends com.tencent.mm.sdk.event.n {
    public s() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.TalkRoomReportMgrEvent talkRoomReportMgrEvent = (com.tencent.mm.autogen.events.TalkRoomReportMgrEvent) iEvent;
        if (!(talkRoomReportMgrEvent instanceof com.tencent.mm.autogen.events.TalkRoomReportMgrEvent)) {
            com.tencent.mars.xlog.Log.f("MicroMsg.TalkRoomReportMgrListener", "mismatch %s", talkRoomReportMgrEvent.getClass().getName());
            return false;
        }
        if (!talkRoomReportMgrEvent.f54882g.f7492a) {
            return false;
        }
        dh4.l.Bi().f232599l = 1;
        return true;
    }
}
