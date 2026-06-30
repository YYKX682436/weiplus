package bt3;

/* loaded from: classes12.dex */
public class d0 extends com.tencent.mm.sdk.event.n {
    public d0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.QueryRecordMsgMediaListEvent queryRecordMsgMediaListEvent = (com.tencent.mm.autogen.events.QueryRecordMsgMediaListEvent) iEvent;
        am.fp fpVar = queryRecordMsgMediaListEvent.f54638g;
        java.lang.String str = fpVar.f6689a;
        long j17 = fpVar.f6690b;
        java.lang.String str2 = fpVar.f6691c;
        java.util.Iterator it = bt3.g2.A(str).f387465f.iterator();
        java.lang.String str3 = "";
        while (it.hasNext()) {
            str3 = str3 + bt3.g2.t((r45.gp0) it.next(), str2, j17, 1) + ":";
        }
        queryRecordMsgMediaListEvent.f54639h.f6785a = str3;
        return true;
    }
}
