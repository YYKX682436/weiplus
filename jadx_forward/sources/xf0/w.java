package xf0;

/* loaded from: classes12.dex */
public final class w extends jm0.g implements xf0.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // xf0.e
    public void L0(xf0.g event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event.f535700b == xf0.h.f535704f) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            xf0.i iVar = event.f535699a;
            java.lang.String str = iVar.f535716k;
            java.util.Map map = iVar.f535717l;
            ((cy1.a) rVar).Ej(str, map, 37131);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoReceive.VideoReceiveReportFSC", "report " + iVar.f535716k + ' ' + map);
        }
    }
}
