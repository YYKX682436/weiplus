package b43;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest f17812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b43.f f17813e;

    public e(b43.f fVar, com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest receiveChatroomMsgRequest) {
        this.f17813e = fVar;
        this.f17812d = receiveChatroomMsgRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        b43.f fVar = this.f17813e;
        fVar.f17817g = false;
        com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest receiveChatroomMsgRequest = this.f17812d;
        fVar.a(receiveChatroomMsgRequest.chatroom_name, receiveChatroomMsgRequest.seq, receiveChatroomMsgRequest.version);
    }
}
