package ak5;

/* loaded from: classes5.dex */
public final class a0 extends com.tencent.mm.sdk.event.n {
    public a0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RevokeNativeMsgEvent event = (com.tencent.mm.autogen.events.RevokeNativeMsgEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.ds dsVar = event.f54714g;
        long j17 = dsVar.f6496a;
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(dsVar.f6498c, j17);
        long I0 = n17.I0();
        com.tencent.mars.xlog.Log.i("MicroMsg.TopMsgRevokeNativeMessageListener", "revokeNativeMsg callback srvId:%s", java.lang.Long.valueOf(I0));
        if (I0 == 0) {
            return false;
        }
        ak5.v Bi = ((ak5.g0) i95.n0.c(ak5.g0.class)).Bi(n17.Q0());
        if (Bi != null) {
            Bi.a(I0);
        }
        zj5.a.f473348a.a(6, I0);
        return false;
    }
}
