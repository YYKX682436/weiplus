package a90;

/* loaded from: classes12.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f2405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f2405d = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) obj;
        kotlin.jvm.internal.o.g(msgIdTalker, "msgIdTalker");
        int i17 = qi3.y.f363762e1;
        qi3.x.f363761a.a(msgIdTalker);
        this.f2405d.f310112d = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsgAsyncSendFSC", "sendAsync: msg inserted, msgId=" + msgIdTalker.f149480d + ", talker=" + msgIdTalker.a());
        return jz5.f0.f302826a;
    }
}
