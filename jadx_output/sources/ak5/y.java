package ak5;

/* loaded from: classes5.dex */
public final class y extends com.tencent.mm.sdk.event.n {
    public y() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RevokeMsgEvent event = (com.tencent.mm.autogen.events.RevokeMsgEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.cs csVar = event.f54713g;
        com.tencent.mm.storage.f9 f9Var = csVar.f6396c;
        long j17 = csVar.f6398e;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(f9Var != null);
        objArr[1] = java.lang.Long.valueOf(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopMsgRevokeMsgListener", "revokeMsg callback msgInfoNotNull:%s srvId:%s", objArr);
        if (f9Var != null && j17 != 0) {
            ak5.v Bi = ((ak5.g0) i95.n0.c(ak5.g0.class)).Bi(f9Var.Q0());
            if (Bi != null) {
                Bi.a(j17);
            }
            zj5.a.f473348a.a(6, j17);
        }
        return false;
    }
}
