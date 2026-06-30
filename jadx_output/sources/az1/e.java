package az1;

/* loaded from: classes13.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.ji jiVar = ((com.tencent.mm.autogen.events.KvReportEvent) iEvent).f54460g;
        java.lang.String str = jiVar.f7034b;
        int i17 = (int) jiVar.f7033a;
        a.b c17 = a.b.c();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!c17.f44a) {
            return false;
        }
        ry5.c.f().d(str, "", currentTimeMillis, 0, i17);
        return false;
    }
}
