package as1;

/* loaded from: classes11.dex */
public final class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.autogen.events.BypNotifyActionEvent event = (com.tencent.mm.autogen.events.BypNotifyActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.j1 j1Var = event.f54019g;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (j1Var.f6992a == 9 && yw.h1.f466332a.n()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BypListenRedDotNotifyEventListener", "BypBizRedDotNotifyEventListener callback. notify from bypBiz dataSize = " + j1Var.f6993b.length);
                yw.q3.f466437a.d();
                try {
                    r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
                    byte[] data = j1Var.f6993b;
                    kotlin.jvm.internal.o.f(data, "data");
                    l1Var.getClass();
                    l1Var.Ni().f(data);
                    l1Var.Ri().f(data);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BypListenRedDotNotifyEventListener", e17, "BypBizRedDotNotifyEventListener callback. error!", new java.lang.Object[0]);
                }
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BypListenRedDotNotifyEventListener", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
        return true;
    }
}
