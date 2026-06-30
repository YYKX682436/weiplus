package cn3;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.sdk.event.n {
    public k() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.LbsroomLogicEvent lbsroomLogicEvent = (com.tencent.mm.autogen.events.LbsroomLogicEvent) iEvent;
        int i17 = lbsroomLogicEvent.f54466g.f7621a;
        am.qi qiVar = lbsroomLogicEvent.f54467h;
        switch (i17) {
            case 1:
                an3.e.d(null, 0);
                return false;
            case 2:
                an3.e.a(0);
                return false;
            case 3:
                qiVar.f7713a = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(143875, 0)) == 1;
                return false;
            case 4:
                gm0.j1.u().c().w(143875, 1);
                return false;
            case 5:
                gm0.j1.u().c().w(143875, 0);
                return false;
            case 6:
                an3.e.b(null);
                return false;
            case 7:
                java.lang.Long l17 = (java.lang.Long) gm0.j1.u().c().l(8210, null);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (l17 != null && currentTimeMillis <= l17.longValue()) {
                    r4 = false;
                }
                qiVar.f7713a = r4;
                return false;
            default:
                com.tencent.mars.xlog.Log.e("OnLbsroomLogicListener", "LbsroomLogicEvent unkown opcode!");
                return false;
        }
    }
}
