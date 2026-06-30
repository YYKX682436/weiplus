package jz;

/* loaded from: classes12.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f384088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f384088d = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 msgIdTalker = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdTalker, "msgIdTalker");
        int i17 = qi3.y.f445295e1;
        qi3.x.f445294a.a(msgIdTalker);
        this.f384088d.f391645d = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsgAsyncSendFSC", "sendAsync: msg inserted, msgId=" + msgIdTalker.f231013d + ", talker=" + msgIdTalker.a());
        return jz5.f0.f384359a;
    }
}
