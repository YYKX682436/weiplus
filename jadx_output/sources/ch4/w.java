package ch4;

/* loaded from: classes6.dex */
public class w extends com.tencent.mm.sdk.event.n {
    public w() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.TalkRoomeStatusBarHideEvent talkRoomeStatusBarHideEvent = (com.tencent.mm.autogen.events.TalkRoomeStatusBarHideEvent) iEvent;
        if (talkRoomeStatusBarHideEvent instanceof com.tencent.mm.autogen.events.TalkRoomeStatusBarHideEvent) {
            return false;
        }
        com.tencent.mars.xlog.Log.f("TalkRoomeStatusBarHideListener", "mismatch %s", talkRoomeStatusBarHideEvent.getClass().getName());
        return false;
    }
}
